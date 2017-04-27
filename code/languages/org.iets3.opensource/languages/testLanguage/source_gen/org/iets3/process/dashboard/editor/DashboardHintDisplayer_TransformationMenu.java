package org.iets3.process.dashboard.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.GroupMenuPart;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.Computable;
import org.iets3.process.dashboard.behavior.DashboardHintDisplayer__BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.iets3.utility.behavior.ConceptUtility;
import org.iets3.utility.behavior.LanguageUtility;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class DashboardHintDisplayer_TransformationMenu extends TransformationMenuBase {
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.CONTEXT_ASSISTANT);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.CONTEXT_ASSISTANT).contains(_context.getMenuLocation())) {
      result.add(new DashboardHintDisplayer_TransformationMenu.TransformationMenuPart_Group_avkpi1_a0());
    }
    return result;
  }

  public class TransformationMenuPart_Group_avkpi1_a0 extends GroupMenuPart<TransformationMenuItem, TransformationMenuContext> {
    private Tuples._4<List<SNode>, List<SNode>, List<SNode>, List<SNode>> updatedFlowState;
    @Override
    protected void initialize(TransformationMenuContext _context) {
      super.initialize(_context);
      updatedFlowState = new Computable<Tuples._4<List<SNode>, List<SNode>, List<SNode>, List<SNode>>>() {
        public Tuples._4<List<SNode>, List<SNode>, List<SNode>, List<SNode>> compute() {
          return (Tuples._4<List<SNode>, List<SNode>, List<SNode>, List<SNode>>) DashboardHintDisplayer__BehaviorDescriptor.getFlowState_id23Wc6usUwlN.invoke(_context.getNode());
        }
      }.compute();
    }

    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new DashboardHintDisplayer_TransformationMenu.TransformationMenuPart_Group_avkpi1_a0.TransformationMenuPart_Action_avkpi1_a0a());
    }
    private class TransformationMenuPart_Action_avkpi1_a0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new DashboardHintDisplayer_TransformationMenu.TransformationMenuPart_Group_avkpi1_a0.TransformationMenuPart_Action_avkpi1_a0a.Item(context);
      }

      private class Item extends ActionItemBase {
        private final TransformationMenuContext _context;

        private Item(TransformationMenuContext context) {
          _context = context;
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          _context.getEditorContext().getRepository().getModelAccess().executeCommandInEDT(new Runnable() {
            public void run() {
              // only update state if the current state has changed 
              if (SPropertyOperations.getInteger_def(ListSequence.fromList(updatedFlowState._0()).first(), MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79175dbL, "mode"), "2") != 1) {
                SPropertyOperations.set(ListSequence.fromList(updatedFlowState._0()).first(), MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79175dbL, "mode"), "1");
                for (SNode visitedState : ListSequence.fromList(updatedFlowState._1())) {
                  SPropertyOperations.set(visitedState, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79175dbL, "mode"), "0");
                }
                for (SNode toComeState : ListSequence.fromList(updatedFlowState._2())) {
                  SPropertyOperations.set(toComeState, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79175dbL, "mode"), "2");
                }
                for (SNode dontCareState : ListSequence.fromList(updatedFlowState._3())) {
                  SPropertyOperations.set(dontCareState, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79175dbL, "mode"), "3");
                }
                DashboardHintDisplayer__BehaviorDescriptor.updateDashboardData_id6Zy$B2weZrR.invoke(_context.getNode());
              }
            }
          });
          return SPropertyOperations.getString(ListSequence.fromList(updatedFlowState._0()).first(), MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text"));

        }

        @Override
        public void execute(@NotNull String pattern) {

          List<SNode> nodePointers = SLinkOperations.getChildren(ListSequence.fromList(updatedFlowState._0()).first(), MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7867L, "listOfPointer"));

          for (SNode nodePointer : ListSequence.fromList(nodePointers)) {
            SNode createdNode = ConceptUtility.createNodeFromAbstractConceptDec(SLinkOperations.getTarget(nodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer")));
            LanguageUtility.fixDependencyForConcept(SLinkOperations.getTarget(nodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer")), as_avkpi1_a1a1a3a6c4f(_context.getModel(), SModelInternal.class), LanguageUtility.getLanguageFromAbstractConcept(SLinkOperations.getTarget(nodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer"))));
            SModelOperations.addRootNode(_context.getModel(), createdNode);
          }
          DashboardHintDisplayer__BehaviorDescriptor.updateDashboardData_id6Zy$B2weZrR.invoke(_context.getNode());
        }


      }
    }
  }
  private static <T> T as_avkpi1_a1a1a3a6c4f(Object o, Class<T> type) {
    return (type.isInstance(o) ? (T) o : null);
  }
}