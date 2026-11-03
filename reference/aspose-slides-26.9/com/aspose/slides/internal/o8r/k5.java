package com.aspose.slides.internal.o8r;

import com.aspose.slides.internal.e3j.h0;
import java.awt.geom.AffineTransform;

public class k5 {
   public final double n5;
   public final double l6;
   public final double k5;

   public k5(float var1, AffineTransform var2) {
      h0 var3 = h0.n5(var1, var2);
      this.n5 = this.n5(var3);
      double var4 = Math.cos(this.n5);
      double var6 = Math.sin(this.n5);
      double var8 = var3.n5 * var4 * var4 + var3.l6 * var4 * var6 + var3.k5 * var6 * var6;
      double var10 = var3.n5 * var6 * var6 - var3.l6 * var4 * var6 + var3.k5 * var4 * var4;
      double var12 = -var3.u3;
      this.k5 = Math.sqrt(-4.0 * var12 * var8 * var10 / (4.0 * var8 * var10 * var10));
      this.l6 = Math.sqrt(-4.0 * var12 * var8 * var10 / (4.0 * var8 * var8 * var10));
   }

   private double n5(h0 var1) {
      double var2 = this.n5(Math.atan2(var1.l6, var1.n5 - var1.k5) / 2.0);
      return (Math.PI / 2) - var2;
   }

   public double n5(double var1) {
      if (var1 < 0.0) {
         var1 += Math.PI * 2;
      }

      return (Math.PI * 2) - var1;
   }
}
