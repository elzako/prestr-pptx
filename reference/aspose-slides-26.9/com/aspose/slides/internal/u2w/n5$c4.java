package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$c4 extends n5$y4 {
   private final com.aspose.slides.internal.h9s.l6 n5;

   public n5$c4(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.h9s.l6 var5) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var5;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         int[] var9 = new int[]{var4};
         byte[] var10 = this.n5.n5(var3, var9);
         var4 = var9[0];
         int var11 = (var10[3] & 255) << 24;
         int var12 = (var10[0] & 255) << 16;
         int var13 = (var10[1] & 255) << 8;
         int var14 = var10[2] & 255;
         int var15 = var11 | var12 | var13 | var14;
         var7[var2[0]++] = var15;
      }
   }

   @Override
   protected void n5() {
      this.n5.l6();
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      this.n5.n5(var1, var2, var3, var4);
   }
}
