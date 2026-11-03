package com.aspose.slides.internal.q2c;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class n5 {
   private AffineTransformOp n5;
   private k5 l6;

   public n5(AffineTransform var1, int var2) {
      this.n5 = new AffineTransformOp(var1, var2);
      this.l6 = new k5(var1, var2);
   }

   public BufferedImage n5(BufferedImage var1, BufferedImage var2) {
      if (this.n5(var1)) {
         return this.l6.filter(var1, var2);
      }

      try {
         return this.n5.filter(var1, var2);
      } catch (Throwable var4) {
         return this.l6.filter(var1, var2);
      }
   }

   private boolean n5(BufferedImage var1) {
      return com.aspose.slides.internal.v4y.l6.n5(var1);
   }
}
