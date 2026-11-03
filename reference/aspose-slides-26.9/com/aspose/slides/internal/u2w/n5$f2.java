package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$f2 extends n5$y4 {
   private final int n5;
   private final boolean l6;

   public n5$f2(int var1, int var2, int var3, y2 var4, int var5) {
      super(var1, var2, var3, var4.n3());
      this.l6 = var5 == 18761;
      this.n5 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      float var8 = 0.0038910506F;

      for (int var9 = 0; var9 < var6; var9++) {
         int var10;
         int var11;
         int var12;
         int var13;
         if (this.l6) {
            var10 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var11 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var12 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
            var13 = (var3[var4 + 7] & 255) << 8 | var3[var4 + 6] & 255;
         } else {
            var10 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var11 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var12 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
            var13 = (var3[var4 + 6] & 255) << 8 | var3[var4 + 7] & 255;
         }

         int var15;
         int var16;
         int var17;
         if (var13 != 0) {
            float var14 = 65535.0F / var13;
            var15 = com.aspose.slides.internal.v6g.k5.u3(var10 * var14 + 0.5, 14);
            var16 = com.aspose.slides.internal.v6g.k5.u3(var11 * var14 + 0.5, 14);
            var17 = com.aspose.slides.internal.v6g.k5.u3(var12 * var14 + 0.5, 14);
         } else {
            var15 = var10;
            var16 = var11;
            var17 = var12;
         }

         var15 = com.aspose.slides.internal.v6g.k5.u3(var15 * var8 + 0.5F, 13);
         var16 = com.aspose.slides.internal.v6g.k5.u3(var16 * var8 + 0.5F, 13);
         var17 = com.aspose.slides.internal.v6g.k5.u3(var17 * var8 + 0.5F, 13);
         int var18 = com.aspose.slides.internal.v6g.k5.u3(var13 * var8 + 0.5F, 13);
         if (var18 > 255) {
            var18 = 255;
         }

         if (var15 > 255) {
            var15 = 255;
         }

         if (var16 > 255) {
            var16 = 255;
         }

         if (var17 > 255) {
            var17 = 255;
         }

         int var19 = var18 << 24 | var15 << 16 | var16 << 8 | var17;
         var7[var2[0]++] = var19;
         var4 += this.n5;
      }
   }
}
