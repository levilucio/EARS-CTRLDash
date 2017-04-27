package org.iets3.graphicalLustre.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_Actor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_AndActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_BaseConnection = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_EventActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GateDefinition = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GateDescriptors = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GenericEventActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GlobalActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GlobalInputActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GlobalOutputActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_HighLevelActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IfTBActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IffActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_LogicalActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ModelHolder = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_OrActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Port = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ResActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TernaryNotActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_TrUBActor = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_Wire = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_Actor;
      case 1:
        return props_AndActor;
      case 2:
        return props_BaseConnection;
      case 3:
        return props_EventActor;
      case 4:
        return props_GateDefinition;
      case 5:
        return props_GateDescriptors;
      case 6:
        return props_GenericEventActor;
      case 7:
        return props_GlobalActor;
      case 8:
        return props_GlobalInputActor;
      case 9:
        return props_GlobalOutputActor;
      case 10:
        return props_HighLevelActor;
      case 11:
        return props_IfTBActor;
      case 12:
        return props_IffActor;
      case 13:
        return props_LogicalActor;
      case 14:
        return props_ModelHolder;
      case 15:
        return props_OrActor;
      case 16:
        return props_Port;
      case 17:
        return props_ResActor;
      case 18:
        return props_TernaryNotActor;
      case 19:
        return props_TrUBActor;
      case 20:
        return props_Wire;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
