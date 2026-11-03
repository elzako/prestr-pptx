package com.aspose.slides.internal.p3;

import com.aspose.slides.ms.System.q1;

public class c8 extends j9 {
   private int q0;
   private int z3;
   private int m1;

   public c8(
      y2 var1, z6 var2, a0 var3, int var4, int var5, com.aspose.slides.internal.v8.u9 var6, com.aspose.slides.internal.v8.u9 var7, boolean var8, int var9
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false, false);
      this.q0 = var9;
      this.u9 = true;
   }

   @Override
   protected double n5(t4$k5 var1, i1 var2, int var3, double var4) {
      double var6 = super.n5(var1, var2, var3, var4);
      int var8 = this.q0 - var1.l6;
      int var9 = this.u3.indexOf(var2);
      if (this.z3 == 0) {
         this.z3 = com.aspose.slides.internal.p3.q0.n5(this.u3, var1.n5, this.u3.size() - 1);
         this.m1 = this.z3 / this.q0;
      }

      int var10 = com.aspose.slides.internal.p3.q0.n5(this.u3, var1.n5, var9 - 1);
      int var11 = com.aspose.slides.internal.p3.q0.n5(this.u3, var9 - 1, this.u3.size() - 1);
      int var12 = 0;
      if (var8 > 0) {
         var12 = var11 / var8;
      }

      double var13 = (this.m1 - var10) / 1000.0F;
      var6 = q1.n5(var13);
      if (this.q0 > 2) {
         if (var13 > 0.0) {
            var6 *= 1.2F;
         }
      } else if (var13 < 0.0) {
         var6 *= 1.2F;
      }

      var6 += var12 / 1000.0F;
      if (var1.l6 >= this.q0) {
         var6 = Double.MAX_VALUE;
      }

      return var6;
   }
}
