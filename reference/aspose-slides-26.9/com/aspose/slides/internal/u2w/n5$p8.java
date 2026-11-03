package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$p8 extends n5$y4 {
   private final int n5;
   private final boolean l6;

   public n5$p8(int var1, int var2, int var3, y2 var4, int var5) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
      this.l6 = var5 == 18761;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      long[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, long[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.l6) {
            var9 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var10 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var11 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
            var12 = (var3[var4 + 7] & 255) << 8 | var3[var4 + 6] & 255;
         } else {
            var9 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var10 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var11 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
            var12 = (var3[var4 + 6] & 255) << 8 | var3[var4 + 7] & 255;
         }

         int var14;
         int var15;
         int var16;
         if (var12 != 0) {
            float var13 = 65535.0F / var12;
            var14 = com.aspose.slides.internal.v6g.k5.u3(var9 * var13 + 0.5, 14);
            var15 = com.aspose.slides.internal.v6g.k5.u3(var10 * var13 + 0.5, 14);
            var16 = com.aspose.slides.internal.v6g.k5.u3(var11 * var13 + 0.5, 14);
         } else {
            var14 = var9;
            var15 = var10;
            var16 = var11;
         }

         int var17 = var12;
         if (var14 > 65535) {
            var14 = 65535;
         }

         if (var15 > 65535) {
            var15 = 65535;
         }

         if (var16 > 65535) {
            var16 = 65535;
         }

         long var18 = (long)var17 << 48 | (long)var14 << 32 | (long)var15 << 16 | var16;
         var7[var2[0]++] = var18;
         var4 += this.n5;
      }
   }
}
