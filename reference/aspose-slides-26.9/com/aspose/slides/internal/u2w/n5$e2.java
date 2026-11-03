package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$e2 extends n5$y4 {
   private final int[] n5;
   private final com.aspose.slides.internal.h9s.l6 l6;

   public n5$e2(int var1, int var2, int var3, int[] var4, y2 var5, com.aspose.slides.internal.h9s.l6 var6) {
      super(var1, var2, var3, var5.n3());
      this.n5 = var4;
      this.l6 = var6;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         int[] var9 = new int[]{var4};
         byte[] var10 = this.l6.n5(var3, var9);
         var4 = var9[0];
         var7[var2[0]++] = this.n5[var10[0] & 0xFF];
      }
   }

   @Override
   protected void n5() {
      this.l6.l6();
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      this.l6.n5(var1, var2, var3, var4);
   }
}
