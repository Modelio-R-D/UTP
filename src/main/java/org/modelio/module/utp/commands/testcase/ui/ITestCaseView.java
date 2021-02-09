package org.modelio.module.utp.commands.testcase.ui;

import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.statik.Operation;

public interface ITestCaseView {
    String getTestCaseName();

    String getTestObjectiveDescription();

    boolean hasSequenceDiagram();

    void unmaskTestCase(Operation operation, IModule module);

    IDiagramHandle createSequenceDiagram(Interaction interaction, IModule module);

}
