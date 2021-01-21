package org.modelio.module.utp.commands.testcase.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("0d67ed59-98c4-45fb-b7f8-75ac51229eaf")
public class TestCaseView extends ModelioDialog implements ITestCaseView {
    @objid ("7f26ba96-5a81-4986-a300-52d1107f8a46")
    private Text _commandName;

    @objid ("0651341d-5def-4c81-acb6-e9e3e2db5a27")
    private Text _testObjective;

    @objid ("528a5045-961e-4a03-993c-aec7ad7c154b")
    private Button _ok;

    @objid ("f3208c0c-9fc8-43d9-94a3-8156f529b100")
    private Button _cancel;

    @objid ("20465fc2-51c8-4bb9-9236-b979cc7b7458")
    private Composite _composite;

    @objid ("7fd24b7a-f469-4fb7-b304-e65219d5a222")
    private Button _createSequenceDiagram;

    @objid ("34753f68-4659-4260-a630-cc80bfac516b")
    public void addOKListener(SelectionListener l) {
        this._ok.addSelectionListener(l);
    }

    @objid ("9931bb3f-61a7-4282-9cf6-37358be1854e")
    public void removeOKListener(SelectionListener l) {
        this._ok.removeSelectionListener(l);
    }

    @objid ("1a2c0db3-8136-4906-b5fb-0b7339336fb4")
    public TestCaseView(Shell parent) {
        super(parent);
    }

    @objid ("a7ba1268-91f6-4fec-9604-6e1e089d5379")
    @Override
    public String getTestCaseName() {
        return this._commandName.getText();
    }

    @objid ("c6179afc-2b5f-4819-b428-7ea460a7f72a")
    @Override
    public boolean hasSequenceDiagram() {
        return this._createSequenceDiagram.getSelection();
    }

    @objid ("d7357824-1135-40b5-9725-96ea39180660")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        this._ok = createButton(parent, IDialogConstants.NO_ID, IDialogConstants.OK_LABEL, true);
        this._cancel = createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @objid ("a7bc3cba-f48a-41f3-a18b-e3f96d9c2c32")
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

    @objid ("18464c6f-b98d-49f3-980e-2a8e5135dc92")
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

    @objid ("57aadcc0-8db5-4eb5-8898-8f7c9d490f8d")
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

    @objid ("ef5bb33d-4548-4f2e-a4cb-6eec844b7bf9")
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

    @objid ("8c9c5bdf-7550-4b17-9262-28a52d358760")
    @Override
    public String getTestObjectiveDescription() {
        return this._testObjective.getText();
    }

}
