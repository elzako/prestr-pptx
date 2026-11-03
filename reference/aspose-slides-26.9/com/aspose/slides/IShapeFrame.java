package com.aspose.slides;

import java.awt.geom.Rectangle2D.Float;

public interface IShapeFrame extends IGenericCloneable<IShapeFrame> {
   float getX();

   float getY();

   float getWidth();

   float getHeight();

   float getRotation();

   float getCenterX();

   float getCenterY();

   byte getFlipH();

   byte getFlipV();

   Float getRectangle();
}
