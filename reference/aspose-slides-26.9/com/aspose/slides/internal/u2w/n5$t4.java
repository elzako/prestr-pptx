package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$t4 extends n5$y4 {
   private final int[] n5;
   private int l6;

   public n5$t4(int var1, int var2, int var3, int[] var4, y2 var5) {
      super(var1, var2, var3, var5.n3());
      this.n5 = var4;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int[] var8 = this.n5;
      int var9 = this.l6;

      for (int var10 = 0; var10 < var6; var10++) {
         var9 = (var9 & 65535) + (var3[var4] & 255 | (var3[var4 + 1] & 255) << 8) & 65535;
         var7[var2[0]++] = var8[var9 & 65535];
         var4 += 2;
      }

      this.l6 = var9;
   }

   @Override
   protected void n5() {
      this.l6 = 0;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.l6;

      for (int var6 = 0; var6 < var4; var6++) {
         var5 = (var5 & 65535) + (var1[var2] & 255 | (var1[var2 + 1] & 255) << 8) & 65535;
         var2 += 2;
      }

      this.l6 = var5;
   }
}
