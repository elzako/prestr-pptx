package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class b5x$n5 {
   private double n5;
   private double l6;
   private double k5;

   public final double n5() {
      return this.n5;
   }

   public b5x$n5(double var1, double var3, double var5, double var7, boolean var9) {
      this.l6 = var5 - 90.0;
      if (this.l6 < 0.0) {
         this.l6 += 360.0;
      }

      this.k5 = var7;
      u6x var10 = n5(n5(this.l6, this.k5), var9).z1();
      this.n5 = com.aspose.slides.ms.System.q1.k5(var1 / (var10.t2() != 0.0 ? var10.t2() : 1.0), var3 / (var10.s7() != 0.0 ? var10.s7() : 1.0));
   }

   public final double[] n5(int var1, boolean var2, double[] var3) {
      double var4 = this.l6;
      double var6;
      if (this.k5 > 0.0) {
         var6 = var4 + this.k5;
      } else {
         var4 = b5x.n5(this.k5 + var4, false);
         var6 = var4 - this.k5;
      }

      int var8 = var2 ? var1 - 1 : var1;
      List var9 = new List();
      if (var2) {
         var9.addItem(Double.NaN);
      }

      if (var8 > 0) {
         double var10 = var6 - var4;
         var3[0] = com.aspose.slides.ms.System.q1.n5(this.k5) != 360.0 && var8 != 1 ? var10 / (var8 - 1) : var10 / var8;

         for (int var12 = 0; var12 < var8; var12++) {
            var9.addItem(b5x.n5(var4, false));
            var4 += var3[0];
         }

         if (this.k5 < 0.0) {
            double[] var16 = new double[var9.size()];
            int var13 = 0;
            if (var2) {
               var16[0] = (Double)var9.get_Item(0);
               var13++;
            }

            if (this.k5 == -360.0) {
               var16[var13] = (Double)var9.get_Item(var13);
               var13++;
            }

            int var14 = var16.length - 1;

            for (int var15 = var13; var15 < var16.length; var15++) {
               var16[var15] = (Double)var9.get_Item(var14);
               var14--;
            }

            return var16;
         }
      } else {
         var3[0] = 0.0;
      }

      return com.aspose.slides.internal.n8e.v4.u3(var9);
   }

   private static u6x n5(double[] var0, boolean var1) {
      u6x var2 = new u6x(0.0, 0.0, 0.0, 0.0);
      e4c var3 = new e4c(com.aspose.slides.ms.System.q1.c8(b5x.l6(var0[0])), com.aspose.slides.ms.System.q1.h0(b5x.l6(var0[0])));
      new e4c();

      for (int var5 = 1; var5 < var0.length; var5++) {
         e4c var4 = new e4c(com.aspose.slides.ms.System.q1.c8(b5x.l6(var0[var5])), com.aspose.slides.ms.System.q1.h0(b5x.l6(var0[var5])));
         if (var5 == 1 && !var1) {
            var2 = new u6x(var3.n5, var3.l6, var4.n5, var4.l6);
         } else {
            u6x.l6(var2, new u6x(var3.n5, var3.l6, var4.n5, var4.l6)).u3(var2);
         }

         var4.l6(var3);
      }

      return var2;
   }

   private static double[] n5(double var0, double var2) {
      if (var2 == 360.0) {
         return new double[]{var0};
      }

      List var4 = new List();
      double var5;
      if (var2 > 0.0) {
         var5 = var0 + var2;
      } else {
         var0 = b5x.n5(var2 + var0, false);
         var5 = var0 - var2;
      }

      var4.addItem(var0);

      for (; var0 < var5; var0 += 90.0) {
         double var7 = n5(b5x.n5(var0, false));
         if ((var0 > 360.0 ? 360 : 0) + var7 < b5x.n5(var5, true) && !var4.containsItem(var7)) {
            var4.addItem(var7);
         }
      }

      var5 = b5x.n5(var5, false);
      if (var4.containsItem(var5)) {
         var4.addItem(b5x.n5(var5, false));
      }

      return com.aspose.slides.internal.n8e.v4.u3(var4);
   }

   private static double n5(double var0) {
      if (var0 == 0.0) {
         return var0;
      } else if (var0 > 0.0 && var0 <= 90.0) {
         return 90.0;
      } else if (var0 > 90.0 && var0 <= 180.0) {
         return 180.0;
      } else {
         return var0 > 180.0 && var0 <= 270.0 ? 270.0 : 360.0;
      }
   }
}
