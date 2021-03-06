package org.iets3.core.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.iets3.core.base.behavior.ICanRunCheckManually__BehaviorDescriptor;
import de.slisson.mps.hacks.editor.EditorComponentHacks;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.nodeEditor.EditorComponent;

public class runAllManuallyOnModel_Action extends BaseAction {
  private static final Icon ICON = IconContainer.ICON_a0_1;

  public runAllManuallyOnModel_Action() {
    super("Run/Evaluate/Check all in Model Manually", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SModel model = event.getData(MPSCommonDataKeys.CONTEXT_MODEL);
      if (model == null) {
        return false;
      }
    }
    {
      EditorContext p = event.getData(MPSEditorDataKeys.EDITOR_CONTEXT);
      if (p == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    List<SNode> manuals = SModelOperations.nodes(event.getData(MPSCommonDataKeys.CONTEXT_MODEL), MetaAdapterFactory.getInterfaceConcept(0x7b68d745a7b848b9L, 0xbd9c05c0f8725a35L, 0x3dc39ae7de59be3aL, "org.iets3.core.base.structure.ICanRunCheckManually"));
    for (SNode m : ListSequence.fromList(manuals).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (boolean) ICanRunCheckManually__BehaviorDescriptor.mustBeRunManually_id3R3AIvumAZH.invoke(it) && (boolean) ICanRunCheckManually__BehaviorDescriptor.readyToRunManually_id3R3AIvumwpv.invoke(it);
      }
    })) {
      ICanRunCheckManually__BehaviorDescriptor.runManually_id3R3AIvumrTm.invoke(m, event.getData(MPSEditorDataKeys.EDITOR_CONTEXT));
    }
    ListSequence.fromList(EditorComponentHacks.findAllInstances()).visitAll(new IVisitor<EditorComponent>() {
      public void visit(EditorComponent it) {
        it.update();
      }
    });
  }
}
