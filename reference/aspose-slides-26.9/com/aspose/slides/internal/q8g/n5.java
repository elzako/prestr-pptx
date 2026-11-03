package com.aspose.slides.internal.q8g;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Arc2D.Float;
import java.io.IOException;

public abstract class n5 extends com.aspose.slides.internal.s2b.a6 {
   Point l6;
   Point k5;

   public n5() {
   }

   protected n5(Rectangle var1, Point var2, Point var3) {
      super(var1);
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.k5 = new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 4;
      this.l6 = new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 4;
      super.n5(var1, var2, var3);
   }

   protected final Float n5(int var1, int var2) {
      float var3 = this.n5(this.l6);
      float var4 = this.n5(this.k5);
      if (var1 == 2) {
         if (var4 > var3) {
            var4 -= 360.0F;
         }
      } else if (var4 < var3) {
         var4 += 360.0F;
      }

      float var5 = var4 - var3;
      if (Math.abs(var5) < 1.0E-5) {
         var5 = 360.0F;
      }

      return new Float(this.n5, var3, var5, var2);
   }

   private final float n5(Point var1) {
      double var2 = this.n5.getCenterX();
      double var4 = this.n5.getCenterY();
      double var6 = var1.x - var2;
      double var8 = var1.y - var4;
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      float var12 = (float)(-Math.atan2(var8 / var10, var6 / var10) * 180.0 / Math.PI);
      if (var12 < 0.0F) {
         var12 += 360.0F;
      }

      return var12;
   }
}
