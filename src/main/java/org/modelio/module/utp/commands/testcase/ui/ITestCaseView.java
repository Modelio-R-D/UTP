package org.modelio.module.utp.commands.testcase.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("69169b36-db14-46c0-8066-0f0fe432d31c")
public interface ITestCaseView {
    @objid ("f531d318-06fd-4e69-9ff0-e63af21d095e")
    String getTestCaseName();

    @objid ("c1e2d2ed-f159-48a1-8085-f4a2ff611c5e")
    String getTestObjectiveDescription();

    @objid ("7da4af90-0135-4ba4-8f43-f9ed29eb4537")
    boolean hasSequenceDiagram();

    @objid ("87740498-b77c-4563-a07b-db93e4634c53")
    void unmaskTestCase(Operation operation, IModule module);

    @objid ("2eb492c1-22f4-402d-8481-ff1dad477fed")
    IDiagramHandle createSequenceDiagram(Interaction interaction, IModule module);

}
