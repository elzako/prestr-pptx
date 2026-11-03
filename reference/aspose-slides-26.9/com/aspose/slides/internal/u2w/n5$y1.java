package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$y1 extends n5$y4 {
   private final int n5;
   private final boolean l6;

   public n5$y1(int var1, int var2, int var3, y2 var4, int var5) {
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

         long var13 = (long)var12 << 48 | (long)var9 << 32 | (long)var10 << 16 | var11;
         var7[var2[0]++] = var13;
         var4 += this.n5;
      }
   }
}
