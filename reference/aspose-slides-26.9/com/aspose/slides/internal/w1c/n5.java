package com.aspose.slides.internal.w1c;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Ellipse2D.Float;

public class n5 extends Float {
   public n5(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at) {
      return new l6(this, at);
   }
}
