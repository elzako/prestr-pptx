package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$t2 extends n5$y4 {
   protected final int n5;
   private e2 l6 = null;

   public n5$t2(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.n5 = var2 / 8;
      this.l6 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      if (this.l6 != null) {
         for (int var8 = 0; var8 < var6; var8++) {
            int var9 = (var3[var4] & 255) << 24;
            int var10 = (var3[var4 + 1] & 255) << 16;
            int var11 = (var3[var4 + 2] & 255) << 8;
            int var12 = var3[var4 + 3] & 255;
            int var13 = var9 | var10 | var11 | var12;
            var7[var2[0]++] = var13;
            var4 += this.n5;
         }
      } else {
         for (int var17 = 0; var17 < var6; var17++) {
            int var18 = var3[var4] & 255;
            int var19 = var3[var4 + 1] & 255;
            int var20 = var3[var4 + 2] & 255;
            int var21 = var3[var4 + 3] & 255;
            int var22 = (255 - var18) * (255 - var21) / 255;
            int var14 = (255 - var19) * (255 - var21) / 255;
            int var15 = (255 - var20) * (255 - var21) / 255;
            int var16 = 0xFF000000 | var22 << 16 | var14 << 8 | var15;
            var7[var2[0]++] = var16;
            var4 += this.n5;
         }
      }
   }
}
