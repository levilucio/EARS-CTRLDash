package org.iets3.core.base.constraints;

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
            return new IOptionallyNamed_Constraints();
          }
          break;
        case 1:
          if (true) {
            return new IValidNamedConcept_Constraints();
          }
          break;
        case 2:
          if (true) {
            return new OptionalNameSpecifier_Constraints();
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
  private static final Map<SAbstractConcept, Integer> indices_2qnle6_a0c = buildConceptIndices(MetaAdapterFactory.getInterfaceConcept(0x7b68d745a7b848b9L, 0xbd9c05c0f8725a35L, 0x32f64a31a100207L, "org.iets3.core.base.structure.IOptionallyNamed"), MetaAdapterFactory.getInterfaceConcept(0x7b68d745a7b848b9L, 0xbd9c05c0f8725a35L, 0x32f64a31a179034L, "org.iets3.core.base.structure.IValidNamedConcept"), MetaAdapterFactory.getConcept(0x7b68d745a7b848b9L, 0xbd9c05c0f8725a35L, 0x32f64a31a10020aL, "org.iets3.core.base.structure.OptionalNameSpecifier"));
}
