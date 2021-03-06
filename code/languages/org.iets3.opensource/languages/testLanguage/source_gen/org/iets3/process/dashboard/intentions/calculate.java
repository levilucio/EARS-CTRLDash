package org.iets3.process.dashboard.intentions;

/*Generated by MPS */

import jetbrains.mps.editor.intentions.IntentionsFactory;
import jetbrains.mps.editor.intentions.NodeTransformer;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import java.util.ArrayList;
import jetbrains.mps.editor.intentions.BaseNodeTransformer;

public class calculate extends IntentionsFactory {
  public calculate() {
  }

  public String getId() {
    return getClass().getName();
  }

  public boolean isAvailableInChildren() {
    return true;
  }

  public boolean isSurroundWith() {
    return false;
  }

  public NodeTransformer.Kind getKind() {
    return NodeTransformer.Kind.INTENTION;
  }


  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, "org.iets3.process.dashboard.structure.FlowData");
  }

  public SNodePointer getDeclarationNode() {
    return implementationNode;
  }

  private SNodePointer implementationNode = new SNodePointer("r:40086def-66d5-42f5-b712-896a496ab587(org.iets3.process.dashboard.intentions)", "6037936849079335316");


  private boolean isApplicableHelper(SNode node, EditorContext editorContext) {
    return true;
  }


  public boolean isAvailableInChild(SNode node, SNode node1, EditorContext context) {
    return true;
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return isApplicableHelper(node, editorContext);
  }


  public void execute(SNode node, EditorContext editorContext) {
    SModel model = SModelRepository.getInstance().getModelDescriptor("FlowModel");
    if (SModelOperations.getModelName(model).isEmpty()) {
      System.out.println("the name is empty");
    }
  }
  public String description(SNode node, EditorContext editorContext) {
    return "calculate";
  }

  public Collection<NodeTransformer> getTreeTransformers(SNode node, SNode child, EditorContext editorContext) {
    Collection<NodeTransformer> result = CollectionSequence.fromCollection(new ArrayList<NodeTransformer>());
    CollectionSequence.fromCollection(result).addElement(new BaseNodeTransformer(this, node, editorContext, calculate.this.getKind(), implementationNode) {
      protected void execute(SNode node, EditorContext editorContext) {
        calculate.this.execute(node, editorContext);
      }
      protected String getDescription(SNode node, EditorContext editorContext) {
        return calculate.this.description(node, editorContext);
      }
    });
    return result;
  }
}
