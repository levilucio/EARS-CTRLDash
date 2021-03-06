package org.iets3.ears.gxw.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class ComplexEventDrivenReq_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ophw3y_a(editorContext, node);
  }
  private EditorCell createCollection_ophw3y_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_ophw3y_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createProperty_ophw3y_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ophw3y_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_e0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ophw3y_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_g0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_ophw3y_h0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_i0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ophw3y_j0(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_ophw3y_k0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ophw3y_l0(editorContext, node));
    return editorCell;
  }
  private EditorCell createProperty_ophw3y_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("reqName");
    provider.setNoTargetText("<no reqName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_reqName");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_ophw3y_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_ophw3y_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_ophw3y_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "While");
    editorCell.setCellId("Constant_ophw3y_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ophw3y_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new ComplexEventDrivenReq_Editor.triggerWhileSingleRoleHandler_ophw3y_d0(node, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7aL, "triggerWhile"), editorContext);
    return provider.createCell();
  }
  private class triggerWhileSingleRoleHandler_ophw3y_d0 extends SingleRoleCellProvider {
    public triggerWhileSingleRoleHandler_ophw3y_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7aL, "triggerWhile"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7aL, "triggerWhile"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7aL, "triggerWhile"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("triggerWhile");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7aL, "triggerWhile")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_triggerWhile");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no triggerWhile>";
    }
  }
  private EditorCell createConstant_ophw3y_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ", when ");
    editorCell.setCellId("Constant_ophw3y_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ophw3y_f0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new ComplexEventDrivenReq_Editor.triggerWhenSingleRoleHandler_ophw3y_f0(node, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7fL, "triggerWhen"), editorContext);
    return provider.createCell();
  }
  private class triggerWhenSingleRoleHandler_ophw3y_f0 extends SingleRoleCellProvider {
    public triggerWhenSingleRoleHandler_ophw3y_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7fL, "triggerWhen"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7fL, "triggerWhen"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7fL, "triggerWhen"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("triggerWhen");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a7fL, "triggerWhen")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_triggerWhen");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no triggerWhen>";
    }
  }
  private EditorCell createConstant_ophw3y_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  the ");
    editorCell.setCellId("Constant_ophw3y_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_ophw3y_h0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("controllerName");
    provider.setNoTargetText("<no controllerName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_controllerName");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_ophw3y_i0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "shall");
    editorCell.setCellId("Constant_ophw3y_i0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ophw3y_j0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new ComplexEventDrivenReq_Editor.systemResponseSingleRoleHandler_ophw3y_j0(node, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a85L, "systemResponse"), editorContext);
    return provider.createCell();
  }
  private class systemResponseSingleRoleHandler_ophw3y_j0 extends SingleRoleCellProvider {
    public systemResponseSingleRoleHandler_ophw3y_j0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a85L, "systemResponse"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a85L, "systemResponse"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a85L, "systemResponse"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("systemResponse");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0x7731a166da1f472eL, 0xa40a2283f5e47dc5L, 0x12815fbacd8318dfL, 0x12815fbacd831a85L, "systemResponse")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_systemResponse");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no systemResponse>";
    }
  }
  private EditorCell createRefCell_ophw3y_k0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("systemName");
    provider.setNoTargetText("<no systemName>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new ComplexEventDrivenReq_Editor._Inline_ophw3y_a01a());
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("systemName");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  public static class _Inline_ophw3y_a01a extends InlineCellProvider {
    public _Inline_ophw3y_a01a() {
      super();
    }
    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }
    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_ophw3y_a0k0(editorContext, node);
    }
    private EditorCell createProperty_ophw3y_a0k0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      if (attributeConcept != null) {
        EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
        return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
      } else
      return editorCell;
    }
  }
  private EditorCell createConstant_ophw3y_l0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ".");
    editorCell.setCellId("Constant_ophw3y_l0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
