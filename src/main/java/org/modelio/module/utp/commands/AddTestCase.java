package org.modelio.module.utp.commands;

import java.util.List;
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

public class AddTestCase extends DefaultModuleCommandHandler {
    private TestCaseView _view;

    private TestContextModel _model;

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
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return selectedElements.size()==1 &&
                        ((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCONTEXT);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    public AddTestCase() {
        this._view = null;
        this._model = null;
    }

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

    private void clear() {
        this._view.close();
        this._view = null;
        this._model = null;
    }

}
