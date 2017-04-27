package org.iets3.ears.gxw.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class PropositionalFormulaSR__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc2L, "org.iets3.ears.gxw.structure.PropositionalFormulaSR");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> toFormulaString_id6_TIzovfT5$ = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("toFormulaString").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6_TIzovfT5$").registry(REGISTRY).build(SMethodBuilder.createJavaParameter((Class<Map<SNode, String>>) ((Class) Object.class), ""));
  public static final SMethod<String> toTextString_id6_TIzovgSIh = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("toTextString").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6_TIzovgSIh").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(toFormulaString_id6_TIzovfT5$, toTextString_id6_TIzovgSIh);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String toFormulaString_id6_TIzovfT5$(@NotNull SNode __thisNode__, Map<SNode, String> systemResponseMap) {
    if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR"))) {
      return MapSequence.fromMap(systemResponseMap).get(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, 0x5d97a5a869295cdcL, "atom")));
    } else if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc7L, "org.iets3.ears.gxw.structure.NotFormulaSR"))) {
      return "!" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc7L, "org.iets3.ears.gxw.structure.NotFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc4L, 0x29245ddc2085f59bL, "arg")), systemResponseMap);
    } else if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR"))) {
      return "(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f587L, "arg1")), systemResponseMap) + " && " + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f58eL, "arg2")), systemResponseMap) + ")";
    } else {
      return "(" + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc6L, "org.iets3.ears.gxw.structure.OrFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f587L, "arg1")), systemResponseMap) + " || " + PropositionalFormulaSR__BehaviorDescriptor.toFormulaString_id6_TIzovfT5$.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc6L, "org.iets3.ears.gxw.structure.OrFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f58eL, "arg2")), systemResponseMap) + ")";
    }
  }
  /*package*/ static String toTextString_id6_TIzovgSIh(@NotNull SNode __thisNode__) {
    if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR"))) {
      return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, 0x5d97a5a869295cdcL, "atom")), MetaAdapterFactory.getProperty(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711686L, "action"));
    } else if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc7L, "org.iets3.ears.gxw.structure.NotFormulaSR"))) {
      return "not " + PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc7L, "org.iets3.ears.gxw.structure.NotFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc4L, 0x29245ddc2085f59bL, "arg")));
    } else if (SNodeOperations.isInstanceOf(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR"))) {
      return PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f587L, "arg1"))) + " and " + PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f58eL, "arg2")));
    } else {
      return PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f587L, "arg1"))) + " or " + PropositionalFormulaSR__BehaviorDescriptor.toTextString_id6_TIzovgSIh.invoke(SLinkOperations.getTarget(SNodeOperations.cast(__thisNode__, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc5L, "org.iets3.ears.gxw.structure.AndFormulaSR")), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cc3L, 0x29245ddc2085f58eL, "arg2")));
    }
  }

  /*package*/ PropositionalFormulaSR__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) toFormulaString_id6_TIzovfT5$(node, (Map<SNode, String>) parameters[0]));
      case 1:
        return (T) ((String) toTextString_id6_TIzovgSIh(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
