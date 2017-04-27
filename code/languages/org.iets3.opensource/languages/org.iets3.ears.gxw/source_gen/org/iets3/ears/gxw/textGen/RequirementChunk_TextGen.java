package org.iets3.ears.gxw.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.iets3.ears.gxw.behavior.PropositionalFormulaSR__BehaviorDescriptor;
import org.iets3.ears.gxw.behavior.PropositionalFormulaTr__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.IMapping;

public class RequirementChunk_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    // first pass to assign variable names to triggers and system responses 

    // define maps for triggers and system responses 
    Map<SNode, String> triggerMap = MapSequence.fromMap(new LinkedHashMap<SNode, String>(16, (float) 0.75, false));
    Map<SNode, String> systemResponseMap = MapSequence.fromMap(new HashMap<SNode, String>());

    for (SNode trigger : ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, 0x29245ddc2083503cL, "glossary")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, 0x1dfca649d8e7ff4L, "listOfTriggers")))) {
      MapSequence.fromMap(triggerMap).put(trigger, SPropertyOperations.getString(trigger, MetaAdapterFactory.getProperty(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef655aL, 0x5d97a5a8692a5e10L, "text")).replace(" ", "_"));
    }

    for (SNode systemResponse : ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(ctx.getPrimaryInput(), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, 0x29245ddc2083503cL, "glossary")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, 0x1dfca649d8e7ffbL, "listOfResponses")))) {
      MapSequence.fromMap(systemResponseMap).put(systemResponse, (SPropertyOperations.getString(SLinkOperations.getTarget(systemResponse, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + SPropertyOperations.getString(systemResponse, MetaAdapterFactory.getProperty(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711686L, "action"))).replace(" ", "_"));
    }

    // translate each of the requirements to formulas 

    for (SNode req : ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a8692b865bL, 0x5d97a5a8692b865cL, "requirements")))) {
      // add the textual description of the requirement 
      tgs.append("## ");
      tgs.appendNode(req);

      if (SNodeOperations.isInstanceOf(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq"))) {
        SNode responseFormula = SLinkOperations.getTarget(SNodeOperations.cast(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, 0x6979ba361f3afff3L, "systemResponse"));
        tgs.append("[] " + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap));
        tgs.append("\n\n");

      } else if (SNodeOperations.isInstanceOf(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"))) {
        SNode the_req = SNodeOperations.cast(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"));
        SNode responseFormula = SLinkOperations.getTarget(SNodeOperations.cast(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x6979ba361f3b0015L, "systemResponse"));
        SNode triggerFormula = SLinkOperations.getTarget(SNodeOperations.cast(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, 0x333c641fcaaa86e3L, "untilTrigger"));
        if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2871dd7L, "org.iets3.ears.gxw.structure.Occurs")) {
          tgs.append("[] " + "(" + PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap) + " -> " + "(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + " W " + PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(triggerFormula, triggerMap) + ")");
        } else if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2782aa2L, "org.iets3.ears.gxw.structure.Happens")) {
          String triggerName = PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap);
          tgs.append("[] " + "(!" + triggerName + " && " + "X(" + triggerName + "))" + " -> " + "X(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + " W " + PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(triggerFormula, triggerMap) + ")");

        } else if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2782aa5L, "org.iets3.ears.gxw.structure.HappensStable")) {
          String triggerName = PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap);
          tgs.append("[] " + "(!" + triggerName + " && " + "XX(" + triggerName + "))" + " && XX(" + triggerName + "))" + " -> " + "XX(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + " W " + PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(triggerFormula, triggerMap) + ")");
        }

        tgs.append("\n\n");

      } else if (SNodeOperations.isInstanceOf(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"))) {
        SNode the_req = SNodeOperations.cast(req, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"));
        SNode responseFormula = SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x6979ba361f3b0015L, "systemResponse"));
        if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2871dd7L, "org.iets3.ears.gxw.structure.Occurs")) {
          tgs.append("[] " + "(" + PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap) + " -> " + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + ")");
        } else if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2782aa2L, "org.iets3.ears.gxw.structure.Happens")) {
          String triggerName = PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap);
          tgs.append("[] " + "(" + triggerName + " && !" + triggerName + ")" + " -> X (" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + ")");
        } else if (SNodeOperations.getConcept(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d6L, 0x7f8bb363a2782aa8L, "triggerModifier"))) == MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x7f8bb363a2782aa5L, "org.iets3.ears.gxw.structure.HappensStable")) {
          String triggerName = PropositionalFormulaTr__BehaviorDescriptor.toFormulaString_id3cWp1ZaFwJv.invoke(SLinkOperations.getTarget(the_req, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, 0x7f8bb363a25a61abL, "trigger")), triggerMap);
          tgs.append("[] " + "(" + triggerName + " && !" + triggerName + " && XX(" + triggerName + "))" + " -> XX(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(responseFormula, systemResponseMap) + "))");
        }
        tgs.append("\n\n");
      }
    }

    tgs.append("\n");

    // add the set of inputs and outputs 
    // inputs are triggers 
    // outputs are responses 

    tgs.append("INPUT ");
    for (IMapping<SNode, String> trigger : MapSequence.fromMap(triggerMap)) {
      tgs.append(trigger.value());
      if (MapSequence.fromMap(triggerMap).last().value() != trigger.value()) {
        tgs.append(", ");
      }
    }
    tgs.newLine();

    tgs.append("OUTPUT ");
    for (IMapping<SNode, String> response : MapSequence.fromMap(systemResponseMap)) {
      tgs.append(response.value());
      if (MapSequence.fromMap(systemResponseMap).last().value() != response.value()) {
        tgs.append(", ");
      }
    }
    tgs.newLine();


  }
  public String getExtension(SNode node) {
    return ".txt";
  }
  public String getFilename(SNode node) {
    return SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
}