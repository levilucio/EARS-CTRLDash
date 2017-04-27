package org.iets3.ears.gxw.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.iets3.ears.gxw.behavior.PropositionalFormulaTr__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.iets3.ears.gxw.behavior.PropositionalFormulaSR__BehaviorDescriptor;

public class NormalEventDrivenOptionalFeatReq_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    if (SNodeOperations.isInstanceOf(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"))) {
      tgs.append("When ");
      tgs.append(PropositionalFormulaTr__BehaviorDescriptor.toTextString_id3cWp1ZaFwKU.invoke(SLinkOperations.getTarget(SNodeOperations.cast(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger"))));
      tgs.append(" ");
      tgs.append(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, 0x10d34fa226eL, "alias")));
      tgs.append(", the ");
      tgs.append(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      tgs.append(" shall ");
      tgs.append(PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x6979ba361f3b0015L, "systemResponse"))));
      tgs.append(" until ");
      tgs.append(PropositionalFormulaTr__BehaviorDescriptor.toTextString_id3cWp1ZaFwKU.invoke(SLinkOperations.getTarget(SNodeOperations.cast(ctx.getPrimaryInput(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, 0x333c641fcaaa86e3L, "untilTrigger"))));
      tgs.newLine();
    }
  }
}
