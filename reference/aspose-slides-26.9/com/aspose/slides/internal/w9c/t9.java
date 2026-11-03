package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;

public class t9 extends l6 {
   private boolean n5;
   private w1 l6;
   private w1 k5;
   private int u3;

   public t9(boolean var1, float var2, com.aspose.slides.internal.e6q.u3 var3, w1 var4, w1 var5, w1 var6, w1 var7, w1 var8, w1 var9, int var10) {
      super(var2, var3, var4, var5, var6, var7);
      this.n5 = var1;
      this.l6 = var8;
      this.k5 = var9;
      this.u3 = var10;
   }

   @Override
   public void l6() {
   }

   @Override
   public void k5() {
   }

   @Override
   public void n5() {
      if (this.n5) {
         this.n5(this.s7.l6(), this.s7.k5(), -this.l6.l6(), -this.l6.k5());
      } else {
         byte var1 = 0;
         if (this.u3 == 2) {
            var1 = 1;
         } else if (this.u3 == 3) {
            var1 = 2;
         }

         this.n5(this.n3.l6() + this.k5.k5() * var1, this.n3.k5() - this.k5.l6() * var1, this.k5.l6(), this.k5.k5());
      }
   }

   private void n5(float var1, float var2, float var3, float var4) {
      float var5 = 0.5522848F;
      this.h0.k5(var1 + var3, var2 + var4);
      this.h0.u3(var1 + var3, var2 + var4);
      this.h0
         .n5(
            var1 + var3,
            var2 + var4,
            var1 + var3 - 0.5522848F * var4,
            var2 + var4 + 0.5522848F * var3,
            var1 - var4 + 0.5522848F * var3,
            var2 + var3 + 0.5522848F * var4,
            var1 - var4,
            var2 + var3
         );
      this.h0
         .n5(
            var1 - var4,
            var2 + var3,
            var1 - var4 - 0.5522848F * var3,
            var2 + var3 - 0.5522848F * var4,
            var1 - var3 - 0.5522848F * var4,
            var2 - var4 + 0.5522848F * var3,
            var1 - var3,
            var2 - var4
         );
   }
}
