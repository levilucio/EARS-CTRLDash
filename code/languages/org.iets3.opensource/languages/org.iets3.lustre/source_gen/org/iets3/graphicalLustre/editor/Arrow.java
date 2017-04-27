package org.iets3.graphicalLustre.editor;

/*Generated by MPS */

import de.itemis.mps.editor.diagram.runtime.shape.AbstractShape;
import org.jetbrains.annotations.Nullable;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import de.itemis.mps.editor.diagram.runtime.shape.IShapeStyle;
import java.awt.Color;
import java.awt.geom.GeneralPath;

public class Arrow extends AbstractShape {

  private double relativeHeight;
  private boolean filled;
  private double relativeWidth;

  public Arrow(double relativeHeight, boolean filled, double relativeWidth) {
    this.relativeHeight = relativeHeight;
    this.filled = filled;
    this.relativeWidth = relativeWidth;
  }

  @Nullable
  @Override
  public Double getDefaultSize() {
    return ((double) (15));
  }



  @Override
  protected void draw(final Graphics2D graphics, final Rectangle2D bounds, IShapeStyle style) {
    graphics.setColor(Color.darkGray);
    GeneralPath shape = new GeneralPath();
    double width = bounds.getWidth();
    double height = bounds.getHeight();
    double x2 = bounds.getMaxX();
    double x = x2 - width * this.relativeWidth;
    double y = bounds.getY();
    double y2;
    double centerY = y + height / 2;
    shape.moveTo(x, centerY - height * this.relativeHeight);
    shape.lineTo(x2, centerY);
    shape.lineTo(x, centerY + height * this.relativeHeight);
    if (this.filled) {
      shape.closePath();
    }

    if (this.filled) {
      graphics.fill(shape);
    } else {
      graphics.draw(shape);
    }
  }

}
