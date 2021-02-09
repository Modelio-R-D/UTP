package org.modelio.module.utp.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.modelio.api.modelio.mc.AbstractModelComponentContributor;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.module.utp.api.UTPTagTypes;
import org.modelio.vcore.model.filter.IObjectFilter;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.mapi.MObject;

public class UTPModelComponentContributor extends AbstractModelComponentContributor {
    private IModelingSession session = null;

    private MMetamodel mm = null;

    public UTPModelComponentContributor(IModule module) {
        super(module);
        this.session = module.getModuleContext().getModelingSession();
        this.mm = module.getModuleContext().getModelioServices().getMetamodelService().getMetamodel();
    }

    /**
     * Get a TagType from the metamodel extensions.
     */
    private TagType getTagType(java.lang.Class<? extends MObject> metaclass, String tagTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getTagType(IUTPPeerModule.MODULE_NAME, tagTypeName, this.mm.getMClass(metaclass));
    }

    /**
     * Get a NoteType from the metamodel extensions.
     */
    private NoteType getNoteType(java.lang.Class<? extends MObject> metaclass, String noteTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getNoteType(IUTPPeerModule.MODULE_NAME, noteTypeName, this.mm.getMClass(metaclass));
    }

    /**
     * Get a Steretotype from the metamodel extensions.
     */
    private Stereotype getStereotype(java.lang.Class<? extends MObject> metaclass, String stereotypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        return metamodel.getStereotype(IUTPPeerModule.MODULE_NAME, stereotypeName, this.mm.getMClass(metaclass));
    }

    @Override
    public Set<Stereotype> getDependencyStereotypes() {
        Set<Stereotype> stereotypes = new HashSet<>();       
        stereotypes.add(getStereotype(Classifier.class, UTPStereotypes.TESTCONTEXT));
        stereotypes.add(getStereotype(Classifier.class, UTPStereotypes.TESTCOMPONENT));
        stereotypes.add(getStereotype(Operation.class, UTPStereotypes.TESTCASE_OPERATION));
        stereotypes.add(getStereotype(Behavior.class, UTPStereotypes.TESTCASE_BEHAVIOR));
        stereotypes.add(getStereotype(Dependency.class, UTPStereotypes.TESTOBJECTIVE));
        stereotypes.add(getStereotype(Attribute.class, UTPStereotypes.SUT_ATTRIBUTE));
        stereotypes.add(getStereotype(BindableInstance.class, UTPStereotypes.SUT_BINDABLEINSTANCE));
        stereotypes.add(getStereotype(Package.class, UTPStereotypes.TESTSET));
        stereotypes.add(getStereotype(Behavior.class, UTPStereotypes.TESTLOG));
        stereotypes.add(getStereotype(Dependency.class, UTPStereotypes.TESTLOGAPPLICATION));
        stereotypes.add(getStereotype(Behavior.class, UTPStereotypes.DEFAULT));
        stereotypes.add(getStereotype(Dependency.class, UTPStereotypes.DEFAULTAPPLICATION));
        stereotypes.add(getStereotype(CallOperationAction.class, UTPStereotypes.VALIDATIONACTION));
        stereotypes.add(getStereotype(ActivityAction.class, UTPStereotypes.FINISHACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.LOGACTION));
        stereotypes.add(getStereotype(Event.class, UTPStereotypes.TIMEOUT));
        stereotypes.add(getStereotype(Message.class, UTPStereotypes.TIMEOUTMESSAGE));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.TIMEOUTACTION));
        stereotypes.add(getStereotype(CallOperationAction.class, UTPStereotypes.STARTTIMERACTION));
        stereotypes.add(getStereotype(CallOperationAction.class, UTPStereotypes.STOPTIMERACTION));
        stereotypes.add(getStereotype(CallOperationAction.class, UTPStereotypes.READTIMERACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.TIMERRUNNINGACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.GETTIMEZONEACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.SETTIMEZONEACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.GETTIMEZONEACTION));
        stereotypes.add(getStereotype(OpaqueAction.class, UTPStereotypes.SETTIMEZONEACTION));
        stereotypes.add(getStereotype(Attribute.class, UTPStereotypes.CODINGRULE_ATTRIBUTE));
        stereotypes.add(getStereotype(NameSpace.class, UTPStereotypes.CODINGRULE_NAMESPACE));
        stereotypes.add(getStereotype(Instance.class, UTPStereotypes.CODINGRULE_INSTANCE));
        stereotypes.add(getStereotype(Classifier.class, UTPStereotypes.DATAPOOL));
        stereotypes.add(getStereotype(Attribute.class, UTPStereotypes.DATAPOOL));
        stereotypes.add(getStereotype(Classifier.class, UTPStereotypes.DATAPARTITION));
        stereotypes.add(getStereotype(Operation.class, UTPStereotypes.DATASELECTOR));
        stereotypes.add(getStereotype(StateInvariant.class, UTPStereotypes.STARTTIMERACTION));
        stereotypes.add(getStereotype(StateInvariant.class, UTPStereotypes.STOPTIMERACTION));
        stereotypes.add(getStereotype(StateInvariant.class, UTPStereotypes.VALIDATIONACTION));
        stereotypes.add(getStereotype(Package.class, UTPStereotypes.U2TPTYPES));
        return stereotypes;
    }

    @Override
    public Set<TagType> getTagTypes() {
        Set<TagType> tagTypes = new HashSet<>();       
        tagTypes.add(getTagType(UTPStereotypes.CODINGRULE_ATTRIBUTE, Attribute.class, UTPTagTypes.CODINGRULE_ATTRIBUTE_CODING));
        tagTypes.add(getTagType(UTPStereotypes.CODINGRULE_NAMESPACE, NameSpace.class, UTPTagTypes.CODINGRULE_NAMESPACE_CODING));
        tagTypes.add(getTagType(UTPStereotypes.CODINGRULE_INSTANCE, Instance.class, UTPTagTypes.CODINGRULE_INSTANCE_CODING));
        return tagTypes;
    }

    @Override
    public Set<NoteType> getNoteTypes() {
        Set<NoteType> noteTypes = new HashSet<>();
        return noteTypes;
    }

    @Override
    public Set<MObject> getElements() {
        return Collections.emptySet();
    }

    @Override
    public Set<ExportedFileEntry> getFiles() {
        return Collections.emptySet();
    }

    /**
     * Get a NoteType from the metamodel extensions.
     */
    private NoteType getNoteType(String sterotypeName, java.lang.Class<? extends MObject> metaclass, String noteTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        MClass mClass = this.mm.getMClass(metaclass);
        return metamodel.getNoteType(metamodel.getStereotype(IUTPPeerModule.MODULE_NAME, sterotypeName, mClass), noteTypeName);
    }

    /**
     * Get a tagType from the metamodel extensions.
     */
    private TagType getTagType(String sterotypeName, java.lang.Class<? extends MObject> metaclass, String tagTypeName) {
        IMetamodelExtensions metamodel = this.session.getMetamodelExtensions();
        MClass mClass = this.mm.getMClass(metaclass);
        return metamodel.getTagType(metamodel.getStereotype(IUTPPeerModule.MODULE_NAME, sterotypeName, mClass), tagTypeName);
    }

    /**
     * A custom filter allowing to remove a specific element from an List.
     */
    private class ExcludeElementFilter implements IObjectFilter {
        /**
         * The element to exclude.
         */
        private Element eltToExclude;

        /**
         * Default constructor.
         */
        public ExcludeElementFilter(final Element eltToExclude) {
            this.eltToExclude = eltToExclude;
        }

        /**
         * Check if this element has to be excluded.
         * 
         * @param eltToFilter The element to check.
         * @return True if the eltToFilter is not the eltToExclude
         */
        public boolean select(Element eltToFilter) {
            return !this.eltToExclude.equals(eltToFilter);
        }

        @Override
        public boolean accept(MObject arg0) {
            return !this.eltToExclude.equals(arg0);
        }

    }

}
