package com.aspose.slides;

import java.awt.geom.Dimension2D;

public interface ISlideSize {
   Dimension2D getSize();

   int getType();

   int getOrientation();

   void setOrientation(int var1);

   void setSize(int var1, int var2);

   void setSize(float var1, float var2, int var3);
}
