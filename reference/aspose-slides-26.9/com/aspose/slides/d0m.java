package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

class d0m {
   private double n5;
   private double l6;

   public d0m(t9z var1, n1g var2, double var3) {
      if (var1 == null) {
         throw new ArgumentException("chartPoint is null");
      }

      if (var2 == null) {
         throw new ArgumentException("renderContext is null");
      }

      this.n5(var1, var2, var3);
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   private void n5(t9z var1, n1g var2, double var3) {
      g3y var5 = var1.y4();
      g3y var6 = var2.y4().get_Item(0);
      int var7 = o9b.n5(var2.y4());
      double var8 = 0.0;
      if (var7 == 1) {
         var8 = var2.m1().q0();
      } else if (var7 == 2) {
         var8 = var2.m1().z3();
      }

      double var10 = 0.0;
      double var12 = 0.0;
      double[] var14 = new double[]{0.0};
      double[] var15 = new double[]{0.0};
      this.n5(var5.t2().y4(), var1.z1(), var14, var15);
      var10 = var14[0];
      var12 = var15[0];
      double var16;
      double var18;
      if (var1.n5() == 0.0) {
         var16 = 1.0;
         var18 = 1.0;
      } else if (var1.n5() > 0.0) {
         double var20 = var1.n5();
         if (var5 == var6) {
            var20 -= var8;
         }

         var16 = var10 == 0.0 ? 1.0 : (var10 - var3) / (var10 - var8);
         var18 = var10 == 0.0 ? 1.0 : (var10 - (var3 - var20)) / (var10 - var8);
      } else {
         double var24 = var1.n5();
         if (var5 == var6) {
            var24 -= var8;
         }

         var16 = var12 == 0.0 ? 1.0 : (var12 - var3) / (var12 - var8);
         var18 = var12 == 0.0 ? 1.0 : (var12 - (var3 - var24)) / (var12 - var8);
      }

      this.n5 = var18;
      this.l6 = var16;
   }

   private void n5(List<g3y> var1, int var2, double[] var3, double[] var4) {
      var3[0] = 0.0;
      var4[0] = 0.0;

      for (int var5 = 0; var5 < var1.size(); var5++) {
         g3y var6 = (g3y)var1.get_Item(var5);
         double var7 = var6.c8().get_Item(var2).n5();
         if (var7 > 0.0) {
            var3[0] += var7;
         }

         if (var7 < 0.0) {
            var4[0] += var7;
         }
      }
   }
}
