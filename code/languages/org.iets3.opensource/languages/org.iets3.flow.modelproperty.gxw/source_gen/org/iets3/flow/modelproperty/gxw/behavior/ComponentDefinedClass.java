package org.iets3.flow.modelproperty.gxw.behavior;

/*Generated by MPS */

import jetbrains.mps.ide.modelchecker.platform.actions.SpecificChecker;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelCheckerIssue;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelChecker;

public class ComponentDefinedClass extends SpecificChecker {
  @Override
  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressMonitor progressContext) {
    final List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());
    if ((ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, "org.iets3.ears.gxw.structure.GlossaryChunk"))).first() != null)) {
      if (ListSequence.fromList(SLinkOperations.getChildren(ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, "org.iets3.ears.gxw.structure.GlossaryChunk"))).first(), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, 0x1dfca649d8e7ff6L, "listOfComponents"))).isEmpty()) {
        SpecificChecker.addIssue(results, ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.process.dashboard.structure.DashboardHintDisplayer"))).first(), "The Name or actuator has not been created yet", ModelChecker.SEVERITY_ERROR, "FLOW language Custom Error", null);

      }
    } else {
      SpecificChecker.addIssue(results, ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.process.dashboard.structure.DashboardHintDisplayer"))).first(), "The Name or actuator has not been created yet", ModelChecker.SEVERITY_ERROR, "FLOW language Custom Error", null);
    }

    return results;
  }
}
