package com.aspose.slides.internal.y4x;

import com.aspose.slides.internal.o9b.c8;

public class u3 {
   private final int n5;
   private final int l6;

   public u3(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public c8[] n5(c8[] var1, float[] var2, double var3) {
      int var5 = var1.length - 1;
      int var6 = this.n5(var5, var3);
      return this.n5(var1, var2, var6);
   }

   private int n5(int var1, double var2) {
      if (var1 == 2) {
         return 16;
      } else if (var1 == 3) {
         return var2 < 128.0 ? 16 : 64;
      } else if (var2 < 128.0) {
         return 48;
      } else {
         return var2 < 512.0 ? 64 : 256;
      }
   }

   public c8[] n5(c8[] var1, float[] var2, int var3) {
      this.n5(var2);
      int var4 = var3 * this.l6;
      var4 = Math.min(this.n5, var4);
      int var5 = var3 + 1;
      double var6 = (double)var4 / var3;
      c8[] var8 = this.n5(var5, var1, var2);
      return this.n5(var4, var8, var6);
   }

   private void n5(float[] var1) {
      for (int var2 = 0; var2 < var1.length - 1; var2++) {
         float var3 = var1[var2];
         float var4 = var1[var2 + 1];
         if (var4 < var3) {
            var1[var2 + 1] = var3;
         }
      }
   }

   private c8[] n5(int var1, c8[] var2, float[] var3) {
      c8[] var4 = new c8[var1];
      int var5 = 0;

      for (int var6 = 0; var6 < var1; var6++) {
         double var7 = (double)var6 / (var1 - 1);

         while (var3[var5 + 1] < var7) {
            if (++var5 + 2 == var3.length) {
               break;
            }
         }

         c8 var9 = var2[var5];
         c8 var10 = var2[var5 + 1];
         double var11 = var3[var5];
         double var13 = var3[var5 + 1];
         double var15 = (var7 - var11) / (var13 - var11);
         double var17 = 1.0 - var15;
         c8 var19 = com.aspose.slides.internal.y4x.n5.n5(var9, var10, var17, var15);
         var4[var6] = var19;
      }

      return var4;
   }

   private c8[] n5(int var1, c8[] var2, double var3) {
      c8[] var5 = new c8[var1];
      c8 var6 = var2[0];
      c8 var7 = var2[1];
      int var8 = 0;
      double var9 = 0.0;

      for (int var11 = 0; var11 < var5.length; var11++) {
         if ((var8 + 1) * var3 < var11) {
            var9 = ++var8 * var3;
            var6 = var2[var8];
            var7 = var2[var8 + 1];
         }

         double var12 = (var11 - var9) / var3;
         c8 var14 = com.aspose.slides.internal.y4x.n5.n5(var6, var7, 1.0 - var12, var12);
         var5[var11] = var14;
      }

      return var5;
   }
}
