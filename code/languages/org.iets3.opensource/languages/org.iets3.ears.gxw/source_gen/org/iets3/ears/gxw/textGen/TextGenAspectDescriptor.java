package org.iets3.ears.gxw.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenAspectBase;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.text.rt.TextGenDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.text.rt.TextGenModelOutline;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import java.util.HashMap;

public class TextGenAspectDescriptor extends TextGenAspectBase {
  public TextGenAspectDescriptor() {
  }

  @Nullable
  @Override
  public TextGenDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = concept;
      Integer preIndex = indices_t8hmqt_a0c.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return new NormalEventDrivenOptionalFeatReq_TextGen();
          }
          break;
        case 1:
          if (true) {
            return new NormalEventDrivenReq_TextGen();
          }
          break;
        case 2:
          if (true) {
            return new NormalUbiquitousReq_TextGen();
          }
          break;
        case 3:
          if (true) {
            return new RequirementChunk_TextGen();
          }
          break;
        default:
          // default 
      }
    }
    return null;
  }

  @Override
  public void breakdownToUnits(@NotNull TextGenModelOutline outline) {
    for (SNode root : outline.getModel().getRootNodes()) {
      if (root.getConcept().equals(MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, "org.iets3.ears.gxw.structure.RequirementChunk"))) {
        String fname = getFileName_RequirementChunk(root);
        String ext = getFileExtension_RequirementChunk(root);
        outline.registerTextUnit((ext == null ? fname : (fname + '.' + ext)), root);
        continue;
      }
    }
  }
  private static String getFileName_RequirementChunk(SNode node) {
    return SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  private static String getFileExtension_RequirementChunk(SNode node) {
    return ".txt";
  }
  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_t8hmqt_a0c = buildConceptIndices(MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq"), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, "org.iets3.ears.gxw.structure.RequirementChunk"));
}
