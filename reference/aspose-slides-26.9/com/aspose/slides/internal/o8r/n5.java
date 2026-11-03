package com.aspose.slides.internal.o8r;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.t9z.u3;
import java.awt.geom.PathIterator;

public class n5 {
   private com.aspose.slides.internal.v9l.k5 n5;
   private final boolean l6;

   public n5(k5 var1, float var2, float var3, float var4, float var5, boolean var6) {
      double[] var7 = this.n5(var1, var2, var3, var4, var5, var6);
      double var8 = var7[0];
      double var10 = var7[1];
      this.l6 = var8 > var10;
      if (this.l6) {
         double var12 = var8;
         var8 = var10;
         var10 = var12;
      }

      com.aspose.slides.internal.e3j.l6 var14 = new com.aspose.slides.internal.e3j.l6(0.0, 0.0, var1.l6, var1.k5, var1.n5, var8, var10, false);
      this.n5 = this.n5(var14);
   }

   public com.aspose.slides.internal.v9l.k5 n5() {
      return this.n5;
   }

   public boolean l6() {
      return this.l6;
   }

   public double[] n5(k5 var1, float var2, float var3, float var4, float var5, boolean var6) {
      double var7 = var1.n5(u9.l6(var2, var3, 1.0F, 0.0F));
      double var9 = var1.n5(u9.l6(var4, var5, 1.0F, 0.0F));
      var7 -= var1.n5;
      var9 -= var1.n5;
      if (!var6) {
         if (var7 >= var9) {
            var7 -= Math.PI * 2;
         }
      } else if (var9 >= var7) {
         var9 -= Math.PI * 2;
      }

      return new double[]{var7, var9};
   }

   private com.aspose.slides.internal.v9l.k5 n5(com.aspose.slides.internal.e3j.l6 var1) {
      PathIterator var2 = var1.getPathIterator(null);
      com.aspose.slides.internal.v9l.k5 var3 = new com.aspose.slides.internal.v9l.k5();
      u3.n5(var2, new l6(this, var3));
      return var3;
   }
}
