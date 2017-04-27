package org.iets3.flow.dashboard.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_DashboardHintDisplayer = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_FlowData = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_NodePointer = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_State = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_StatePointer = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_DashboardHintDisplayer;
      case 1:
        return props_FlowData;
      case 2:
        return props_NodePointer;
      case 3:
        return props_State;
      case 4:
        return props_StatePointer;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
