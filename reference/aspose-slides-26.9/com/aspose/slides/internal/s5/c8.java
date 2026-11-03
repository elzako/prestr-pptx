package com.aspose.slides.internal.s5;

import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.System.q1;

public class c8 {
   private final double n5;
   private final double l6;
   private final double k5;
   private final double u3;

   public c8(double var1, double var3, double var5, double var7) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
   }

   public final y1 n5(y1 var1) {
      double var2 = var1.a6() + var1.s7() * this.n5;
      double var4 = var1.a6() + var1.s7() * (1.0 - this.l6);
      double var6 = var1.t2() + var1.k5() * this.k5;
      double var8 = var1.t2() + var1.k5() * (1.0 - this.u3);
      return y1.n5((float)var2, (float)var6, (float)var4, (float)var8);
   }

   public final y2 n5(y2 var1) {
      double var2 = var1.u3() + var1.t2() * q1.l6(0.0, this.n5);
      double var4 = var1.u3() + var1.t2() * (1.0 - q1.l6(0.0, this.l6));
      double var6 = var1.c8() + var1.l6() * q1.l6(0.0, this.k5);
      double var8 = var1.c8() + var1.l6() * (1.0 - q1.l6(0.0, this.u3));
      return y2.n5(t4.n5(var2), t4.n5(var6), t4.n5(var4), t4.n5(var8));
   }

   public final y1 l6(y1 var1) {
      double var2 = 1.0 / (1.0 - q1.k5(0.0, this.n5 + this.l6));
      double var4 = 1.0 / (1.0 - q1.k5(0.0, this.k5 + this.u3));
      double var6 = -q1.k5(0.0, this.n5);
      double var8 = -q1.k5(0.0, this.l6);
      double var10 = -q1.k5(0.0, this.k5);
      double var12 = -q1.k5(0.0, this.u3);
      double var14 = var1.a6() + var1.s7() * var6 * var2;
      double var16 = var1.a6() + var1.s7() * (1.0 - var8 * var2);
      double var18 = var1.t2() + var1.k5() * var10 * var4;
      double var20 = var1.t2() + var1.k5() * (1.0 - var12 * var4);
      return y1.n5((float)var14, (float)var18, (float)var16, (float)var20);
   }

   public final com.aspose.slides.internal.j7.n5 n5(byte[] var1) {
      com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(var1);

      try {
         y2 var3 = this.n5(new y2(0, 0, var2.l6(), var2.k5())).n3();
         return var2.n5(var3.n3());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.j7.u3.n5(this.n5) >> 1
         ^ com.aspose.slides.internal.j7.u3.n5(this.l6) << 3
         ^ com.aspose.slides.internal.j7.u3.n5(this.k5) << 1
         ^ com.aspose.slides.internal.j7.u3.n5(this.u3) >> 3;
   }

   public final boolean n5() {
      return this.n5 == 0.0 && this.l6 == 0.0 && this.k5 == 0.0 && this.u3 == 0.0;
   }

   public final boolean l6() {
      return this.n5 > 0.0 || this.l6 > 0.0 || this.k5 > 0.0 || this.u3 > 0.0;
   }

   public static boolean n5(c8 var0) {
      return var0 == null || var0.n5();
   }

   public static int n5(byte[] var0, c8 var1) {
      o0 var2 = com.aspose.slides.internal.h3k.a6.n5(var0).k5();
      int var3 = var2.hashCode();
      int var4 = var1 != null && var1.l6() ? var1.hashCode() : 0;
      return var3 ^ var4;
   }

   public static int n5(byte[] var0, c8 var1, a6 var2) {
      int var3 = n5(var0, var1);
      if (var2 != null) {
         var3 = var3 * 397 ^ var2.hashCode();
      }

      return var3;
   }
}
