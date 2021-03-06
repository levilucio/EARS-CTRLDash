package org.iets3.ears.gxw.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.ArrayList;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.smodel.SNodePointer;

public class AtomicFormulaSR_Constraints extends BaseConstraintsDescriptor {
  public AtomicFormulaSR_Constraints() {
    super(MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, "org.iets3.ears.gxw.structure.AtomicFormulaSR"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, 0x5d97a5a869295cdcL, "atom"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x5d97a5a869295cd2L, 0x5d97a5a869295cdcL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }
          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {

            String presentationString;

            if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x16773e7879d18484L, "org.iets3.ears.gxw.structure.Axiom")) || SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x16773e7879d18484L, "org.iets3.ears.gxw.structure.Axiom"))) {
              presentationString = SPropertyOperations.getString(SLinkOperations.getTarget(_context.getParameterNode(), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " " + SPropertyOperations.getString(_context.getParameterNode(), MetaAdapterFactory.getProperty(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711686L, "action"));
            } else {
              presentationString = SPropertyOperations.getString(_context.getParameterNode(), MetaAdapterFactory.getProperty(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711686L, "action"));
            }

            return presentationString;
          }
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_6v1a6g_a0a2a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {

              List<SNode> nodesIncludingImported = SLinkOperations.getChildren(ListSequence.fromList(SModelOperations.nodesIncludingImported(SNodeOperations.getModel(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, "org.iets3.ears.gxw.structure.GlossaryChunk"))).first(), MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x1dfca649d8e7ff3L, 0x1dfca649d8e7ffbL, "listOfResponses"));
              List<SNode> filteredResponse = new ArrayList<SNode>();



              System.out.println(BaseConcept__BehaviorDescriptor.getDetailedPresentation_id22G2W3WJ92t.invoke(_context.getEnclosingNode()) + " and parent is " + BaseConcept__BehaviorDescriptor.getDetailedPresentation_id22G2W3WJ92t.invoke(SNodeOperations.getParent(_context.getEnclosingNode())));

              if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }

              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x415265a05dfb4103L, "org.iets3.ears.gxw.structure.NormalEventDrivenReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f44f4aeL, "org.iets3.ears.gxw.structure.NormalEventDrivenOptionalFeatReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6d72a819db7d92a9L, "org.iets3.ears.gxw.structure.NormalUbiquitousReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x168a7cb10e4dea9bL, "org.iets3.ears.gxw.structure.NormalRisingEdgeReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x168a7cb10e4dea9bL, "org.iets3.ears.gxw.structure.NormalRisingEdgeReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x168a7cb10e4dea9bL, "org.iets3.ears.gxw.structure.NormalRisingEdgeReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x168a7cb10e4dea9bL, "org.iets3.ears.gxw.structure.NormalRisingEdgeReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, "org.iets3.ears.gxw.structure.ComplexEventDrivenReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, "org.iets3.ears.gxw.structure.ComplexEventDrivenReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x769597d03a1542e4L, "org.iets3.ears.gxw.structure.ComplexEventDrivenUntil"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x769597d03a1542e4L, "org.iets3.ears.gxw.structure.ComplexEventDrivenUntil")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd838ed5L, "org.iets3.ears.gxw.structure.UnwantedReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd838ed5L, "org.iets3.ears.gxw.structure.UnwantedReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }

              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x769597d03a1542e4L, "org.iets3.ears.gxw.structure.ComplexEventDrivenUntil"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x769597d03a1542e4L, "org.iets3.ears.gxw.structure.ComplexEventDrivenUntil")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, "org.iets3.ears.gxw.structure.ComplexEventDrivenReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, "org.iets3.ears.gxw.structure.ComplexEventDrivenReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd838ed5L, "org.iets3.ears.gxw.structure.UnwantedReq"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  if (SPropertyOperations.getString(SLinkOperations.getTarget(response, MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd838ed5L, "org.iets3.ears.gxw.structure.UnwantedReq")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x6979ba361f3d77d3L, 0x6979ba361f3c9b03L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
                    ListSequence.fromList(filteredResponse).addElement(response);
                  }
                }
              } else if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x16773e7879d18484L, "org.iets3.ears.gxw.structure.Axiom")) || SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getEnclosingNode()), MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x16773e7879d18484L, "org.iets3.ears.gxw.structure.Axiom"))) {

                for (SNode response : ListSequence.fromList(nodesIncludingImported)) {
                  ListSequence.fromList(filteredResponse).addElement(response);
                }
              }

              return new ListScope(filteredResponse) {
                public String getName(SNode child) {
                  return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(child, MetaAdapterFactory.getConcept(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, "org.iets3.ears.gxw.structure.SystemResponse")), MetaAdapterFactory.getReferenceLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0xe98cc5716ef6557L, 0x6c21f2425f711684L, "systemName")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
                }
              };

            }
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_6v1a6g_a0a2a0a0a1a0b0a1a2 = new SNodePointer("r:a9d9517c-1c54-4499-b3e8-268f1fb04c1b(org.iets3.ears.gxw.constraints)", "8884404918331844899");
}
