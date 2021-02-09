package org.modelio.module.utp.commands.testcase.ui;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.IModule;
import org.modelio.api.ui.ModelioDialog;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.module.utp.i18n.I18nMessageService;

public class TestCaseView extends ModelioDialog implements ITestCaseView {
    private Text _commandName;

    private Text _testObjective;

    private Button _ok;

    private Button _cancel;

    private Composite _composite;

    private Button _createSequenceDiagram;

    public void addOKListener(SelectionListener l) {
        this._ok.addSelectionListener(l);
    }

    public void removeOKListener(SelectionListener l) {
        this._ok.removeSelectionListener(l);
    }

    public TestCaseView(Shell parent) {
        super(parent);
    }

    @Override
    public String getTestCaseName() {
        return this._commandName.getText();
    }

    @Override
    public boolean hasSequenceDiagram() {
        return this._createSequenceDiagram.getSelection();
    }

    @Override
    public void addButtonsInButtonBar(Composite parent) {
        this._ok = createButton(parent, IDialogConstants.NO_ID, IDialogConstants.OK_LABEL, true);
        this._cancel = createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    public Control createContentArea(Composite parent) {
        this._composite = new Composite(parent, SWT.NONE);
        this._composite.setLayout(new GridLayout(2,false));
        this._composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        Label lbl = new Label(this._composite, SWT.NONE);
        lbl.setText(I18nMessageService.getString("Ui.Command.AddTestCase.TestCaseName"));
        
        this._commandName = new Text(this._composite, SWT.SINGLE | SWT.BORDER);
        this._commandName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        lbl = new Label(this._composite, SWT.NONE);
        lbl.setText(I18nMessageService.getString("Ui.Command.AddTestCase.TestObjective"));
        
        this._testObjective = new Text(this._composite, SWT.MULTI | SWT.BORDER | SWT.WRAP);
        this._testObjective.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        lbl = new Label(this._composite, SWT.NONE);
        lbl.setText(I18nMessageService.getString("Ui.Command.AddTestCase.CreateSequenceDiagram"));    
        this._createSequenceDiagram = new Button(this._composite, SWT.CHECK);
        this._createSequenceDiagram.setSelection(true);
        return this._composite;
    }

    @Override
    public void init() {
        Shell shell = getShell();        
        shell.setSize(500, 400);
        // The shell has to be centered
        int x = (shell.getSize().x / 2) - 250;
        int y = (shell.getSize().y / 2) - 100;
        shell.setLocation(x, y);
        
        shell.setMinimumSize(500, 400);
        shell.setText(I18nMessageService.getString("Ui.Command.AddTestCase.Desc"));
        setTitle(I18nMessageService.getString("Ui.Command.AddTestCase.Title"));
    }

    @Override
    public IDiagramHandle createSequenceDiagram(Interaction interaction, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        SequenceDiagram diagram = session.getModel().createSequenceDiagram();
        diagram.setName(interaction.getName());
        interaction.getProduct().add(diagram);
        
        int  lifelineSpacing = 0;
        int  lifelinemarging = 200;
        
        IDiagramService ds = module.getModuleContext().getModelioServices().getDiagramService();
        
        try(IDiagramHandle handler = ds.getDiagramHandle(diagram);){
            
            for (Lifeline lifeline : interaction.getOwnedLine()){
                for ( IDiagramGraphic graphic : handler.getDiagramGraphics(lifeline)){  
                    if (graphic instanceof IDiagramNode){
                        IDiagramNode node = (IDiagramNode) graphic;
                        node.setLocation(lifelineSpacing, node.getBounds().y);
                        lifelineSpacing += lifelinemarging;
                    }
                }
            }
        
            handler.save();
            handler.close();
        
        }
        
        module.getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
        return  module.getModuleContext().getModelioServices().getDiagramService().getDiagramHandle(diagram);
    }

    @Override
    public void unmaskTestCase(Operation operation, IModule module) {
        for(AbstractDiagram product  : operation.getOwner().getOwner().getProduct()){
            if(product instanceof StaticDiagram){
                try( IDiagramHandle representation = module.getModuleContext().getModelioServices().getDiagramService().getDiagramHandle(product);){
               
                representation.unmask(operation, 0, 0);
                for(Dependency dependency : operation.getDependsOnDependency()){
                    if(dependency.isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTOBJECTIVE)){
                        representation.unmask(dependency, 0, 0);
                    }
                }
                representation.save();
                representation.close();
                }
            }
        }
    }

    @Override
    public String getTestObjectiveDescription() {
        return this._testObjective.getText();
    }

}
