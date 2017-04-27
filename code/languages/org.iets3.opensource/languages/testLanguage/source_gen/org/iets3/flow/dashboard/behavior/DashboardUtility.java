package org.iets3.flow.dashboard.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import org.iets3.utility.behavior.ConceptUtility;
import org.iets3.flow.modelproperty.gxw.behavior.ModelProperty__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class DashboardUtility {

  private SModel currentModel;
  private SNode flowData;

  public DashboardUtility(SModel currentModel) {
    this.currentModel = currentModel;
    SModel flowModel = SModelRepository.getInstance().getModelDescriptor("FlowModel");
    this.flowData = ListSequence.fromList(SModelOperations.roots(flowModel, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, "org.iets3.flow.dashboard.structure.FlowData"))).first();
  }

  private SNode getStartState() {
    ListSequence.fromList(SLinkOperations.getChildren(flowData, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, 0x5337259791af784dL, "stateList"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getBoolean(it, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c7248195L, "isStart"));
      }
    });
    SNode startState = ListSequence.fromList(SLinkOperations.getChildren(flowData, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, 0x5337259791af784dL, "stateList"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getBoolean(it, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c7248195L, "isStart"));
      }
    });
    return startState;
  }

  private List<SNode> collectImmediateNextStates(SNode state) {
    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode statePointer : ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c72e53c4L, "nextStates")))) {
      ListSequence.fromList(res).addElement(SLinkOperations.getTarget(statePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, 0x73258383c7270021L, "nextStatePointer")));
    }
    return res;
  }

  private List<SNode> collectImmediatePreviousStates(SNode state) {
    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode statePointer : ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c77c638aL, "previousStates")))) {
      ListSequence.fromList(res).addElement(SLinkOperations.getTarget(statePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, 0x73258383c7270021L, "nextStatePointer")));
    }
    return res;
  }

  private List<SNode> collectAllPreviousStates(List<SNode> states) {
    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());
    res.addAll(states);
    for (SNode state : ListSequence.fromList(states)) {
      res.addAll(collectAllPreviousStates(collectImmediatePreviousStates(state)));
    }
    return res;
  }

  private List<SNode> collectAllNextStates(List<SNode> states) {
    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());
    res.addAll(states);
    for (SNode state : ListSequence.fromList(states)) {
      res.addAll(collectAllNextStates(collectImmediateNextStates(state)));
    }
    return res;
  }

  public boolean isPropertySatisfied(SNode inputNode) {
    // checks if a property is satisfied on the model 
    SNode modelPropertyNode = ConceptUtility.createNodeFromAbstractConceptDec(inputNode);
    return (boolean) ModelProperty__BehaviorDescriptor.propertyCheck_id5fb3TbDEkMb.invoke(SNodeOperations.cast(modelPropertyNode, MetaAdapterFactory.getConcept(0x3e3749e596c04132L, 0x8c4a7309a74f9fd6L, 0x56e0c2409a3be91bL, "org.iets3.flow.modelproperty.gxw.structure.ModelProperty")), currentModel);
  }

  public boolean isFormulaSatisfied(SNode propertyFormula) {
    // checks if a formula is satisfied by recursively evaluating its parts on the model 

    if (SNodeOperations.isInstanceOf(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.flow.modelproperty.formulae.structure.AtomicProperty"))) {
      boolean result = isPropertySatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.flow.modelproperty.formulae.structure.AtomicProperty")), MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration")));
      return result;
    }

    if (SNodeOperations.isInstanceOf(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.modelproperty.formulae.structure.AndPropertyFormula"))) {
      System.out.println("AND: " + (isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.modelproperty.formulae.structure.AndPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"))) && isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.modelproperty.formulae.structure.AndPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2")))));
      return isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.modelproperty.formulae.structure.AndPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"))) && isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.modelproperty.formulae.structure.AndPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2")));
    }

    if (SNodeOperations.isInstanceOf(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334deL, "org.iets3.flow.modelproperty.formulae.structure.OrPropertyFormula"))) {
      return isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334deL, "org.iets3.flow.modelproperty.formulae.structure.OrPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"))) || isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334deL, "org.iets3.flow.modelproperty.formulae.structure.OrPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2")));
    }

    if (SNodeOperations.isInstanceOf(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e6L, "org.iets3.flow.modelproperty.formulae.structure.NotPropertyFormula"))) {
      System.out.println("NOT: " + !(isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e6L, "org.iets3.flow.modelproperty.formulae.structure.NotPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d8L, 0x274527954554078fL, "arg")))));
      return !(isFormulaSatisfied(SLinkOperations.getTarget(SNodeOperations.cast(propertyFormula, MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e6L, "org.iets3.flow.modelproperty.formulae.structure.NotPropertyFormula")), MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d8L, 0x274527954554078fL, "arg"))));
    }


    return false;
  }

  public Tuples._4<List<SNode>, List<SNode>, List<SNode>, List<SNode>> updateFlowState() {
    // Returns the furthest state down the flow chain that the current model satisfies. 
    // Note that we assume that forks are always mutually exclusive, which means that 
    // by hypothesis only one state will be active at any given time. 

    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());

    List<SNode> statesToSearch = ListSequence.fromList(new ArrayList<SNode>());
    ListSequence.fromList(statesToSearch).addElement(getStartState());

    System.out.println("***** Start state: " + SPropertyOperations.getString(getStartState(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));

    List<SNode> currentStates = findStateOfModel(statesToSearch);

    // update the flowdata model 
    final List<SNode> visitedStates = collectAllPreviousStates(collectImmediatePreviousStates(ListSequence.fromList(currentStates).first()));
    List<SNode> toComeStates = collectAllNextStates(collectImmediateNextStates(ListSequence.fromList(currentStates).first()));
    List<SNode> dontCareStates = ListSequence.fromList(SLinkOperations.getChildren(flowData, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, 0x5337259791af784dL, "stateList"))).subtract(ListSequence.fromList(visitedStates).union(ListSequence.fromList(toComeStates)).union(ListSequence.fromList(currentStates))).toListSequence();


    System.out.println("CURRENT-----------------------------------------");
    for (SNode st : ListSequence.fromList(currentStates)) {
      System.out.println(SPropertyOperations.getString(st, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text")));
    }
    System.out.println("VISITED-----------------------------------------");
    for (SNode st : ListSequence.fromList(visitedStates)) {
      System.out.println(SPropertyOperations.getString(st, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text")));
    }
    System.out.println("TOCOME-----------------------------------------");
    for (SNode st : ListSequence.fromList(toComeStates)) {
      System.out.println(SPropertyOperations.getString(st, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text")));
    }
    System.out.println("DONTCARE-----------------------------------------");
    for (SNode st : ListSequence.fromList(dontCareStates)) {
      System.out.println(SPropertyOperations.getString(st, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text")));
    }


    // return the current state 
    res.addAll(currentStates);

    return MultiTuple.<List<SNode>,List<SNode>,List<SNode>,List<SNode>>from(res, visitedStates, toComeStates, dontCareStates);
  }

  public List<SNode> findStateOfModel(List<SNode> statesToSearch) {

    List<SNode> res = ListSequence.fromList(new ArrayList<SNode>());

    for (SNode stateToEvaluate : ListSequence.fromList(statesToSearch)) {

      System.out.println("\n\n");
      System.out.println("----------- To search: " + SPropertyOperations.getString(stateToEvaluate, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));

      if (isFormulaSatisfied(SLinkOperations.getTarget(stateToEvaluate, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7857L, "formula")))) {
        // if the formula is satisfied in the model then that means  
        // we should display the hint associated to this state if no other 
        // state further ahead can be displayed. 

        System.out.println("::::::::: Formula is satisfied!! ");

        List<SNode> lookAheadState = ListSequence.fromList(new ArrayList<SNode>());
        lookAheadState.addAll(collectImmediateNextStates(stateToEvaluate));
        List<SNode> lookAheadResult = findStateOfModel(lookAheadState);

        if (lookAheadResult.isEmpty()) {
          System.out.println("//////////// LOOKAHEAD is EMPTY for state: " + SPropertyOperations.getString(stateToEvaluate, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
          res.add(stateToEvaluate);
        } else {
          res.addAll(lookAheadResult);
        }

      } else {
        // if the state is not satisfied by the model then by hypothesis 
        // we have either not been here before or we haven't enabled this state yet 

        System.out.println("::::::::: Formula is NOT satisfied!!");

        res.addAll(findStateOfModel(collectImmediateNextStates(stateToEvaluate)));
      }
      if (SLinkOperations.getChildren(stateToEvaluate, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c72e53c4L, "nextStates")).isEmpty()) {
        System.out.println("...... just hit the final state");
      }
    }
    // Note that if the state is final (meaning no next states exist), 
    // then the empty list is returned. We assume the final state is 
    // always true when the model is ready. 
    return res;
  }

}
