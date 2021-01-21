package org.modelio.module.utp.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.module.utp.commands.testcase.model.TestContextModel;
import org.modelio.module.utp.commands.testcase.ui.TestCaseView;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2049030e-bf3d-4410-83bc-4e7c5ad101eb")
public class CreateTestCase extends DefaultModuleCommandHandler {
    @objid ("c3ee1868-1df8-4442-8041-80b08f7ad723")
    private TestCaseView _view;

    @objid ("e887c432-6fa4-47c2-b09f-94264d5305d0")
    private TestContextModel _model;

    @objid ("a65a7bbd-6729-4403-8a5b-53e334656dec")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        this._model = new TestContextModel((Classifier) selectedElements.get(0), module.getModuleContext().getModelingSession());
        this._view = new TestCaseView(Display.getCurrent().getActiveShell());
        this._view.create();
        this._view.setBlockOnOpen(false);
        this._view.addOKListener(new SelectionListener(){
        
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                fillModel(module);
                clear();
            }
        
            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
        
            }
        
        });
        this. _view.open();
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @objid ("254b5562-681a-4ef0-9071-5343733d133f")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return selectedElements.size()==1 &&
                        ((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCONTEXT);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @objid ("78facdd3-de90-4c65-bc26-60ca9c34dd21")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    @objid ("740838e1-b26a-4203-8460-dad8638c6bf9")
    public CreateTestCase() {
        this._view = null;
        this._model = null;
    }

    @objid ("0662e903-2e92-422d-8e57-aff429e4a0c0")
    void fillModel(IModule module) {
        try (ITransaction tr = module.getModuleContext().getModelingSession().createTransaction("AddTestCase")) {
        
            Operation operation =  this._model.createTestCase(this._view.getTestCaseName());
            this._model.createTestObjective(operation, this._view.getTestObjectiveDescription());
        
            if(this._view.hasSequenceDiagram()){
                try(IDiagramHandle diagram = this._view.createSequenceDiagram(this._model.createInteraction(operation), module); ){             
                    module.getModuleContext().getModelioServices().getNavigationService().fireNavigate(diagram.getDiagram());
                    diagram.save();
                    diagram.close();
                }
            }else{
                module.getModuleContext().getModelioServices().getNavigationService().fireNavigate(operation);
            }
        
            this._view.unmaskTestCase(operation, module);
            tr.commit();  
        }
    }

    @objid ("becb1432-0119-4e22-8596-46a3a2d48b2e")
    private void clear() {
        this._view.close();
        this._view = null;
        this._model = null;
    }

}
