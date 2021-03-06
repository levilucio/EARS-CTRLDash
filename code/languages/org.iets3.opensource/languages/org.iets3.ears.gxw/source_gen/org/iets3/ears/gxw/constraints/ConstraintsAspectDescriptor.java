package org.iets3.ears.gxw.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = concept;
      Integer preIndex = indices_2qnle6_a0c.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return new AtomicFormulaSR_Constraints();
          }
          break;
        case 1:
          if (true) {
            return new AtomicFormulaTr_Constraints();
          }
          break;
        case 2:
          if (true) {
            return new Axiom_Constraints();
          }
          break;
        case 3:
          if (true) {
            return new ComplexEventDrivenReq_Constraints();
          }
          break;
        case 4:
          if (true) {
            return new ComplexEventDrivenUntil_Constraints();
          }
          break;
        case 5:
          if (true) {
            return new GlossaryChunk_Constraints();
          }
          break;
        case 6:
          if (true) {
            return new NormalEventDrivenOptionalFeatReq_Constraints();
          }
          break;
        case 7:
          if (true) {
            return new NormalEventDrivenReq_Constraints();
          }
          break;
        case 8:
          if (true) {
            return new NormalRisingEdgeReq_Constraints();
          }
          break;
        case 9:
          if (true) {
            return new NormalUbiquitousReq_Constraints();
          }
          break;
        case 10:
          if (true) {
            return new PropositionalFormulaSR_Constraints();
          }
          break;
        case 11:
          if (true) {
            return new RequirementChunk_Constraints();
          }
          break;
        case 12:
          if (true) {
            return new RequirementTemplate_Constraints();
          }
          break;
        case 13:
          if (true) {
            return new SystemResponse_Constraints();
          }
          break;
        case 14:
          if (true) {
            return new UnwantedReq_Constraints();
          }
          break;
        default:
          // default 
      }
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_2qnle6_a0c = buildConceptIndices(MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x333c641fcaa9839fL, "org.iets3.ears.gxw.structure.AtomicFormulaTr"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x16773e7879d18484L, "org.iets3.ears.gxw.structure.Axiom"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, "org.iets3.ears.gxw.structure.ComplexEventDrivenReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x769597d03a1542e4L, "org.iets3.ears.gxw.structure.ComplexEventDrivenUntil"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, "org.iets3.ears.gxw.structure.GlossaryChunk"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x168a7cb10e4dea9bL, "org.iets3.ears.gxw.structure.NormalRisingEdgeReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq"), MetaAdapterFactory.getInterfaceConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc2L, "org.iets3.ears.gxw.structure.PropositionalFormulaSR"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, "org.iets3.ears.gxw.structure.RequirementChunk"), MetaAdapterFactory.getInterfaceConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, "org.iets3.ears.gxw.structure.RequirementTemplate"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, "org.iets3.ears.gxw.structure.SystemResponse"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd838ed5L, "org.iets3.ears.gxw.structure.UnwantedReq"));
}
