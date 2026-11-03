package com.aspose.slides.internal.y4x;

import com.aspose.slides.internal.o9b.c8;

public class k5 {
   private final int n5;

   public k5(int var1) {
      this.n5 = var1;
   }

   public c8[] n5(c8 var1, c8 var2) {
      return (var1.s7() & 255) == 255 && (var2.s7() & 255) == 255 ? this.l6(var1, var2) : this.k5(var1, var2);
   }

   private c8[] l6(c8 var1, c8 var2) {
      c8[] var3 = new c8[this.n5];
      float var4 = 1.0F / var3.length;
      int var5 = var1.s7() & 255;
      int var6 = var1.x8() & 255;
      int var7 = var1.n3() & 255;
      int var8 = var1.y4() & 255;
      int var9 = (var2.s7() & 255) - var5;
      int var10 = (var2.x8() & 255) - var6;
      int var11 = (var2.n3() & 255) - var7;
      int var12 = (var2.y4() & 255) - var8;

      for (int var13 = 0; var13 < var3.length; var13++) {
         var3[var13] = c8.n5(
            (int)(var5 + var13 * var9 * var4 + 0.5),
            (int)(var6 + var13 * var10 * var4 + 0.5),
            (int)(var7 + var13 * var11 * var4 + 0.5),
            (int)(var8 + var13 * var12 * var4 + 0.5)
         );
      }

      return var3;
   }

   private c8[] k5(c8 var1, c8 var2) {
      int var3 = var1.s7() & 255;
      int var4 = var2.s7() & 255;
      return var3 != 0 && var4 != 0 ? this.u3(var1, var2) : this.n5(var3, var4, var1, var2);
   }

   private c8[] n5(int var1, int var2, c8 var3, c8 var4) {
      int var5 = this.n5 - 1;
      c8[] var6 = new c8[var5 + 1];
      float var7 = var2 - var1;
      if (var1 == 0 && var2 == 0) {
         for (int var11 = 0; var11 < var6.length; var11++) {
            var6[var11] = c8.n5(0);
         }
      } else if (var1 == 0) {
         var6[0] = var3;
         var6[var5] = var4;

         for (int var8 = 1; var8 < var6.length - 1; var8++) {
            float var9 = (float)var8 / var5;
            var6[var8] = c8.n5((int)(var1 + var7 * var9) & 0xFF, var4);
         }
      } else if (var2 == 0) {
         var6[0] = var3;
         var6[var5] = var4;

         for (int var10 = 1; var10 < var6.length - 1; var10++) {
            float var12 = (float)var10 / var5;
            var6[var10] = c8.n5((int)(var1 + var7 * var12) & 0xFF, var3);
         }
      }

      return var6;
   }

   private c8[] u3(c8 var1, c8 var2) {
      c8[] var3 = new c8[this.n5];
      int var4 = var1.s7() & 255;
      int var5 = var1.x8() & 255;
      int var6 = var1.n3() & 255;
      int var7 = var1.y4() & 255;
      int var8 = var2.s7() & 255;
      int var9 = var2.x8() & 255;
      int var10 = var2.n3() & 255;
      int var11 = var2.y4() & 255;

      for (int var12 = 0; var12 < var3.length; var12++) {
         float var13 = (float)var12 / var3.length;
         float var14 = 1.0F - var13;
         var3[var12] = com.aspose.slides.internal.y4x.n5.n5(var4, var5, var6, var7, var8, var9, var10, var11, var14, var13);
      }

      return var3;
   }
}
