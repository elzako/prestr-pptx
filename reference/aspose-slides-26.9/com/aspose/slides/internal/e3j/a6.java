package com.aspose.slides.internal.e3j;

import com.aspose.slides.internal.o9b.w1;

public class a6 {
   private w1 n5;
   private w1 l6;

   public a6(w1 var1, w1 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public a6(float var1, float var2, float var3, float var4) {
      this.n5 = new w1(var1, var2);
      this.l6 = new w1(var3, var4);
   }

   public w1 n5() {
      return this.n5;
   }

   public w1 l6() {
      return this.l6;
   }

   public a6$n5 n5(w1 var1, float var2) {
      return n5(this.n5, this.l6, var1, var2);
   }

   public boolean l6(w1 var1, float var2) {
      return this.n5(var1, var2) == a6$n5.a6;
   }

   public static a6$n5 n5(w1 var0, w1 var1, w1 var2) {
      return n5(var0, var1, var2, 0.0);
   }

   public static a6$n5 n5(w1 var0, w1 var1, w1 var2, double var3) {
      float var5 = var1.l6() - var0.l6();
      float var6 = var1.k5() - var0.k5();
      float var7 = var2.l6() - var0.l6();
      float var8 = var2.k5() - var0.k5();
      double var9 = var5 * var8 - var7 * var6;
      if (Math.abs(var9) <= var3) {
         if (var5 * var7 < 0.0 || var6 * var8 < 0.0) {
            return a6$n5.k5;
         } else {
            return u9.n5(var5, var6) < u9.n5(var7, var8) ? a6$n5.u3 : a6$n5.a6;
         }
      } else {
         return var9 > 0.0 ? a6$n5.n5 : a6$n5.l6;
      }
   }
}
