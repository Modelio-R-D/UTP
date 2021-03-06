/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api;

import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'UTP' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i></i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< CodingRule_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link CodingRuleAttribute}
 * <li><< CodingRule_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link CodingRuleInstance}
 * <li><< CodingRule_NameSpace >> on a {@link org.modelio.metamodel.uml.statik.NameSpace}: instantiates a {@link CodingRuleNameSpace}
 * <li><< DataPartition >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link DataPartition}
 * <li><< DataPool_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link DataPoolAttribute}
 * <li><< DataPool_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link DataPoolClassifier}
 * <li><< DataSelector >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link DataSelector}
 * <li><< Default >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link Defaultz}
 * <li><< DefaultApplication >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DefaultApplication}
 * <li><< FinishAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.ActivityAction}: instantiates a {@link FinishAction}
 * <li><< GetTimezoneAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link GetTimezoneAction}
 * <li><< GetTimezoneAction_OpaqueAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link GetTimezoneActionOpaqueAction}
 * <li><< LogAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link LogAction}
 * <li><< ReadTimerAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction}: instantiates a {@link ReadTimerAction}
 * <li><< SUT_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SUTAttribute}
 * <li><< SUT_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link SUTBindableInstance}
 * <li><< SetTimezoneAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link SetTimezoneAction}
 * <li><< SetTimezoneAction_OpaqueAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link SetTimezoneActionOpaqueAction}
 * <li><< StartTimerAction >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant}: instantiates a {@link StartTimerAction}
 * <li><< StartTimerAction_CallOperationAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction}: instantiates a {@link StartTimerActionCallOperationAction}
 * <li><< StopTimerAction >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant}: instantiates a {@link StopTimerAction}
 * <li><< StopTimerAction_CallOperationAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction}: instantiates a {@link StopTimerActionCallOperationAction}
 * <li><< TestCase_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link TestCaseBehavior}
 * <li><< TestCase_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link TestCaseOperation}
 * <li><< TestComponent >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link TestComponent}
 * <li><< TestContext >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link TestContext}
 * <li><< TestLog >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link TestLog}
 * <li><< TestLogApplication >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link TestLogApplication}
 * <li><< TestObjective >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link TestObjective}
 * <li><< TestSet >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link TestSet}
 * <li><< TimeOut >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Event}: instantiates a {@link TimeOut}
 * <li><< TimeOutAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link TimeOutAction}
 * <li><< TimeOutMessage >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Message}: instantiates a {@link TimeOutMessage}
 * <li><< TimerRunningAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link TimerRunningAction}
 * <li><< U2TPTypes >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link U2TPTypes}
 * <li><< ValidationAction >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant}: instantiates a {@link ValidationAction}
 * <li><< ValidationAction_CallOperationAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction}: instantiates a {@link ValidationActionCallOperationAction}
 * </ul>
 */
public class UTPProxyFactory {
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'UTP' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              ModuleComponent module = s.getModule();
              if (module != null && module.getName().equals(IUTPPeerModule.MODULE_NAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'UTP' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        private String stName;

        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @Override
        public final Object visitBehavior(Behavior obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.behavior.Defaultz.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.behavior.Defaultz.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.behavior.TestCaseBehavior.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.behavior.TestCaseBehavior.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.behavior.TestLog.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.behavior.TestLog.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitBehavior(obj);
        }

        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.infrastructure.dependency.DefaultApplication.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.infrastructure.dependency.DefaultApplication.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.infrastructure.dependency.TestLogApplication.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.infrastructure.dependency.TestLogApplication.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.infrastructure.dependency.TestObjective.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.infrastructure.dependency.TestObjective.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @Override
        public final Object visitStateInvariant(StateInvariant obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.stateinvariant.StartTimerAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.stateinvariant.StartTimerAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.stateinvariant.StopTimerAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.stateinvariant.StopTimerAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.stateinvariant.ValidationAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.stateinvariant.ValidationAction.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitStateInvariant(obj);
        }

        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.instance.CodingRuleInstance.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.instance.CodingRuleInstance.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @Override
        public final Object visitBindableInstance(BindableInstance obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.bindableinstance.SUTBindableInstance.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.bindableinstance.SUTBindableInstance.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitBindableInstance(obj);
        }

        @Override
        public final Object visitOperation(Operation obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.operation.DataSelector.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.operation.DataSelector.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.operation.TestCaseOperation.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.operation.TestCaseOperation.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitOperation(obj);
        }

        @Override
        public final Object visitClassifier(Classifier obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.classifier.DataPartition.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.classifier.DataPartition.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.classifier.DataPoolClassifier.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.classifier.DataPoolClassifier.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.classifier.TestComponent.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.classifier.TestComponent.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.classifier.TestContext.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.classifier.TestContext.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClassifier(obj);
        }

        @Override
        public final Object visitCallOperationAction(CallOperationAction obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.calloperationaction.ReadTimerAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.calloperationaction.ReadTimerAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.calloperationaction.StartTimerActionCallOperationAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.calloperationaction.StartTimerActionCallOperationAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.calloperationaction.StopTimerActionCallOperationAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.calloperationaction.StopTimerActionCallOperationAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.calloperationaction.ValidationActionCallOperationAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.calloperationaction.ValidationActionCallOperationAction.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitCallOperationAction(obj);
        }

        @Override
        public final Object visitMessage(Message obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.message.TimeOutMessage.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.message.TimeOutMessage.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitMessage(obj);
        }

        @Override
        public final Object visitEvent(Event obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.event.TimeOut.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.event.TimeOut.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitEvent(obj);
        }

        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.attribute.CodingRuleAttribute.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.attribute.CodingRuleAttribute.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.attribute.DataPoolAttribute.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.attribute.DataPoolAttribute.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.attribute.SUTAttribute.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.attribute.SUTAttribute.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.package_.TestSet.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.package_.TestSet.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.package_.U2TPTypes.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.package_.U2TPTypes.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @Override
        public final Object visitOpaqueAction(OpaqueAction obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.GetTimezoneAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.GetTimezoneAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.GetTimezoneActionOpaqueAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.GetTimezoneActionOpaqueAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.LogAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.LogAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.SetTimezoneAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.SetTimezoneAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.SetTimezoneActionOpaqueAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.SetTimezoneActionOpaqueAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.TimeOutAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.TimeOutAction.instantiate(obj);
            	case org.modelio.module.utp.api.utpprofile.standard.opaqueaction.TimerRunningAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.opaqueaction.TimerRunningAction.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitOpaqueAction(obj);
        }

        @Override
        public final Object visitActivityAction(ActivityAction obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.activityaction.FinishAction.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.activityaction.FinishAction.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitActivityAction(obj);
        }

        @Override
        public final Object visitNameSpace(NameSpace obj) {
            switch (this.stName) {
            	case org.modelio.module.utp.api.utpprofile.standard.namespace.CodingRuleNameSpace.STEREOTYPE_NAME: return org.modelio.module.utp.api.utpprofile.standard.namespace.CodingRuleNameSpace.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitNameSpace(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
