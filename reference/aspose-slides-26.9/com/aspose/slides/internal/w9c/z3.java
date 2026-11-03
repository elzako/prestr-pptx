package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;

public class z3 extends l6 {
   private boolean n5;
   private w1 l6;
   private w1 k5;
   private w1 u3;

   protected z3(boolean var1, float var2, com.aspose.slides.internal.e6q.u3 var3, w1 var4, w1 var5, w1 var6, w1 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.n5 = var1;
   }

   @Override
   public void l6() {
      if (this.n5) {
         this.n5(this.x8, this.s7);
      } else {
         this.n5(this.y4, this.n3);
         this.l6(this.k5, this.u3);
      }
   }

   @Override
   public void k5() {
   }

   @Override
   public void n5() {
      if (this.n5) {
         this.h0.k5(this.u3.l6(), this.u3.k5());
         this.h0.u3(this.l6.l6(), this.l6.k5());
         this.h0.u3(this.k5.l6(), this.k5.k5());
      } else {
         this.h0.k5(this.k5.l6(), this.k5.k5());
         this.h0.u3(this.l6.l6(), this.l6.k5());
         this.h0.u3(this.u3.l6(), this.u3.k5());
      }
   }

   private void n5(w1 var1, w1 var2) {
      float var3 = this.u9 / 2.0F;
      float var4 = Math.abs(var1.k5() - var2.k5());
      float var5 = Math.abs(var1.l6() - var2.l6());
      float var6 = (float)Math.sqrt(var5 * var5 + var4 * var4);
      float var7 = var4 / var6;
      float var8 = var5 / var6;
      float var9 = var3 * var7;
      float var10 = var3 * var8;
      float var11 = var1.l6() < var2.l6() ? var2.l6() + var10 : var2.l6() - var10;
      float var12 = var1.k5() < var2.k5() ? var2.k5() + var9 : var2.k5() - var9;
      float var13 = var1.l6() < var2.l6() ? var11 - var10 : var11 + var10;
      float var14 = var1.k5() < var2.k5() ? var12 - var9 : var12 + var9;
      w1 var15 = new w1(var11 - var13, var12 - var14);
      w1 var16 = var15.k5() == 0.0F ? new w1(-var15.k5() / var15.l6(), 1.0F) : new w1(1.0F, -var15.l6() / var15.k5());
      var16 = n5(var16, this.u9 / 2.0F);
      float var17 = Math.abs(var16.l6());
      float var18 = Math.abs(var16.k5());
      if (var15.l6() > 0.0F) {
         if (var15.k5() > 0.0F) {
            this.k5 = new w1(var13 - var17, var14 + var18);
            this.u3 = new w1(var13 + var17, var14 - var18);
         } else {
            this.k5 = new w1(var13 + var17, var14 + var18);
            this.u3 = new w1(var13 - var17, var14 - var18);
         }
      } else if (var15.k5() > 0.0F) {
         this.k5 = new w1(var13 - var17, var14 - var18);
         this.u3 = new w1(var13 + var17, var14 + var18);
      } else {
         this.k5 = new w1(var13 + var17, var14 - var18);
         this.u3 = new w1(var13 - var17, var14 + var18);
      }

      this.l6 = new w1(var11, var12);
   }
}
