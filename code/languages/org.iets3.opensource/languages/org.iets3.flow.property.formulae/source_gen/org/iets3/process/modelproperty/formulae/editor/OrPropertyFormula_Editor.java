package org.iets3.process.modelproperty.formulae.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
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

public class OrPropertyFormula_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ontl1r_a(editorContext, node);
  }
  private EditorCell createCollection_ontl1r_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ontl1r_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_ontl1r_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ontl1r_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ontl1r_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ontl1r_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ontl1r_e0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_ontl1r_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_ontl1r_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ontl1r_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new OrPropertyFormula_Editor.arg1SingleRoleHandler_ontl1r_b0(node, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"), editorContext);
    return provider.createCell();
  }
  private class arg1SingleRoleHandler_ontl1r_b0 extends SingleRoleCellProvider {
    public arg1SingleRoleHandler_ontl1r_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"), child));
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
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("arg1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x2745279545540786L, "arg1")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_arg1");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no arg1>";
    }
  }
  private EditorCell createConstant_ontl1r_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "OR");
    editorCell.setCellId("Constant_ontl1r_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_ontl1r_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new OrPropertyFormula_Editor.arg2SingleRoleHandler_ontl1r_d0(node, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2"), editorContext);
    return provider.createCell();
  }
  private class arg2SingleRoleHandler_ontl1r_d0 extends SingleRoleCellProvider {
    public arg2SingleRoleHandler_ontl1r_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2"), child));
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
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("arg2");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L, 0x274527954554078cL, "arg2")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_arg2");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no arg2>";
    }
  }
  private EditorCell createConstant_ontl1r_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_ontl1r_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
