package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$k7 extends n5$y4 {
   private final int n5;

   public n5$k7(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         int var9 = (var3[var4] & 255) << 16;
         int var10 = (var3[var4 + 1] & 255) << 8;
         int var11 = var3[var4 + 2] & 255;
         int var12 = 0xFF000000 | var9 | var10 | var11;
         var7[var2[0]++] = var12;
         var4 += this.n5;
      }
   }
}
