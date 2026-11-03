package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$z3 extends n5$y4 {
   protected final int n5;

   protected n5$z3(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4);
      this.n5 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = (int[])var1;

      for (int var8 = 0; var8 < var6; var8++) {
         for (int var9 = 0; var9 < this.n5; var9++) {
            int var10 = 24 - 8 * var9;
            var7[var2[0]] = var7[var2[0]] | (var3[var4++] & 255) << var10;
         }

         var2[0]++;
      }
   }
}
