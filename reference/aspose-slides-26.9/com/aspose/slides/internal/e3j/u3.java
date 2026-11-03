package com.aspose.slides.internal.e3j;

import com.aspose.slides.internal.o9b.w1;

public class u3 {
   public float n5;
   public float l6;
   public float k5;
   public float u3;
   public float a6;
   public float u9;
   public float h0;
   public double c8;

   public u3(float var1, float var2, float var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public u3(w1 var1, w1 var2) {
      this.n5 = var1.k5() - var2.k5();
      this.l6 = var2.l6() - var1.l6();
      this.k5 = var1.l6() * var2.k5() - var2.l6() * var1.k5();
      this.c8 = com.aspose.slides.internal.e3j.u9.n5(var1, var2) / 1000.0;
      this.u3 = Math.min(var1.l6(), var2.l6());
      this.u9 = Math.min(var1.k5(), var2.k5());
      this.a6 = Math.max(var1.l6(), var2.l6());
      this.h0 = Math.max(var1.k5(), var2.k5());
   }

   public static u3 n5(u3 var0, w1 var1) {
      float var2 = var0.n5;
      float var3 = var0.l6;
      float var4 = var2 * -var1.l6() + var3 * -var1.k5();
      return new u3(var2, var3, var4);
   }

   public w1 n5(u3 var1) {
      return this.n5(var1, 0.0F);
   }

   public w1 n5(u3 var1, float var2) {
      float var3 = this.n5 * var1.l6 - var1.n5 * this.l6;
      if (Math.abs(var3) <= var2) {
         return null;
      }

      float var4 = -(this.k5 * var1.l6 - var1.k5 * this.l6) / var3;
      float var5 = -(this.n5 * var1.k5 - var1.n5 * this.k5) / var3;
      return new w1(var4, var5);
   }

   public boolean l6(u3 var1) {
      if (this.n5 == 0.0F || var1.n5 == 0.0F) {
         return this.n5 == var1.n5;
      } else {
         return this.l6 != 0.0F && var1.l6 != 0.0F ? this.n5 / var1.n5 == this.l6 / var1.l6 : this.l6 == var1.l6;
      }
   }

   public boolean n5() {
      return Math.abs(this.l6) < 1.0E-4F;
   }

   public boolean l6() {
      return Math.abs(this.n5) < 1.0E-4F;
   }

   public float n5(float var1) {
      return this.n5() ? 0.0F : -this.n5 / this.l6 * var1 + -this.k5 / this.l6;
   }
}
