package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$m3 extends n5$y4 {
   private final int n5;
   private final boolean l6;

   public n5$m3(int var1, int var2, int var3, y2 var4, int var5) {
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
         if (this.l6) {
            var10 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var11 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var12 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
         } else {
            var10 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var11 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var12 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
         }

         var10 = com.aspose.slides.internal.v6g.k5.u3(var10 * var8 + 0.5F, 13);
         var11 = com.aspose.slides.internal.v6g.k5.u3(var11 * var8 + 0.5F, 13);
         var12 = com.aspose.slides.internal.v6g.k5.u3(var12 * var8 + 0.5F, 13);
         if (var10 > 255) {
            var10 = 255;
         }

         if (var11 > 255) {
            var11 = 255;
         }

         if (var12 > 255) {
            var12 = 255;
         }

         int var13 = 0xFF000000 | var10 << 16 | var11 << 8 | var12;
         var7[var2[0]++] = var13;
         var4 += this.n5;
      }
   }
}
