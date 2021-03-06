package org.iets3.flow.dashboard.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import de.itemis.mps.editor.diagram.styles.editor.LineStyle;

public class BoxColor_StyleSheet {
  public static void apply_greenColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.green));
  }
  public static void apply_whiteColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.WHITE));
  }
  public static void apply_grayColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.lightGray));
  }
  public static void apply_orangeColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.orange));
    style.set(StyleAttributes.getInstance().<LineStyle>getAttribute("de.itemis.mps.editor.diagram.styles", "__line-style"), 0, BoxColor_StyleSheet._StyleParameter_QueryFunction_ixy1q4_a1d(editorContext, node));
  }

  private static LineStyle _StyleParameter_QueryFunction_ixy1q4_a1d(EditorContext editorContext, SNode node) {
    return LineStyle.DASHED;
  }
}
