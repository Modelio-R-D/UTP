package org.modelio.module.utp.commands.testcase.model;

import java.util.Collection;
import java.util.Iterator;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.module.utp.impl.UTPModule;

public class TestContextModel {
    private static Enumeration _verdict = null;

    private Classifier _element;

    private IModelingSession _session;

    public TestContextModel(Classifier element, IModelingSession session) {
        this._element = element;
        this._session = session;
    }

    public Operation createTestCase(String name) {
        Operation op = this._session.getModel().createOperation(name, this._element);
        if(_verdict == null){//caching
            Collection<Enumeration> elements = this._session.findByAtt(Enumeration.class, "Name", "Verdict");
            if(elements.size() >= 1) 
                _verdict = (Enumeration) elements.toArray()[0];
        }
        
        this._session.getModel().createReturnParameter("returnParameter", _verdict, op);
        op.getExtension().add(this._session.getMetamodelExtensions().getStereotype(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCASE_OPERATION, op.getMClass()));
        return op;
    }

    public Note createTestObjective(Operation testcase, String objectiveDescription) {
        Note note = this._session.getModel().createNote();
        note.setContent(objectiveDescription);
        testcase.getDescriptor().add(note);
        note.setModel(this._session.getMetamodelExtensions().getNoteType("ModelerModule", "comment", testcase.getMClass() ));
        try {
            this._session.getModel().createDependency(testcase, note, IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTOBJECTIVE).setName("");
        } catch (ExtensionNotFoundException e) {
            UTPModule.logService.error(e);
        }
        return note;
    }

    public Interaction createInteraction(Operation operation) {
        IUmlModel umlModel = this._session.getModel();
        Interaction interaction = umlModel.createInteraction();    
        
        String operationSignature = operation.getName();
        
        if(!operation.getTypingParameter().isEmpty()){
            Iterator<TemplateParameter> it = operation.getTypingParameter().iterator();
            while(it.hasNext()){
                operationSignature += it.next().getName();
                if(it.hasNext()) operationSignature +=", ";
            }
        }else{
            operationSignature+="()";
        }
        
        if((operation.getReturn() != null) && (operation.getReturn().getType() != null)) 
            operationSignature += ":" + operation.getReturn().getType().getName();
        
        interaction.setName(operationSignature);
        operation.getOwnedBehavior().add(interaction);
        
        Collaboration collaboration = umlModel.createCollaboration();
        collaboration.setName("locals");
        interaction.getOwnedCollaboration().add(collaboration);
        
        Instance instance = umlModel.createInstance();
        instance.setName(operation.getOwner().getName().toLowerCase());
        instance.setBase(operation.getOwner());
        collaboration.getDeclared().add(instance);
        
        Lifeline  fromLifeline = umlModel.createLifeline(instance.getName(), interaction, instance);
        
        Classifier owner = operation.getOwner();
        int  currentLineNumber = 70;
        int  marging  = 70;
        
        
        for(BindableInstance part : owner.getInternalStructure()){
        
            Lifeline toLifeline = umlModel.createLifeline(part.getName(), interaction, part);
           
            NameSpace namespace = part.getBase();
        
            if(namespace instanceof Classifier){
        
                Message m =  umlModel.createMessage("create", MessageSort.CREATEMESSAGE);  
        
                //send Event
                MessageEnd send = umlModel.createExecutionOccurenceSpecification();
                send.getCovered().add(fromLifeline);
                send.setLineNumber(currentLineNumber);
                send.setEnclosingInteraction(interaction);
                m.setSendEvent(send);
        
                MessageEnd receive = umlModel.createExecutionOccurenceSpecification();
                receive.getCovered().add(toLifeline);
                receive.setLineNumber(currentLineNumber);
                receive.setEnclosingInteraction(interaction);
                m.setReceiveEvent(receive);
        
                currentLineNumber += marging;
        
                for( Operation currentoperation : ((Classifier) namespace).getOwnedOperation()){
        
                    if (currentoperation.isStereotyped("ModelerModule", "create")){
                        m.setInvoked(currentoperation);
                        break;
                    }
        
                }
        
            }
        }
        
        StateInvariant stateInv = umlModel.createStateInvariant("return pass");
        stateInv.getCovered().add(fromLifeline);
        stateInv.setLineNumber(currentLineNumber);
        stateInv.setEnclosingInteraction(interaction);
        currentLineNumber += marging;
        stateInv.setEndLineNumber(currentLineNumber);
        return interaction;
    }

}
