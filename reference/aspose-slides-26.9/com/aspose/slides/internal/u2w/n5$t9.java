package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

class n5$t9 extends n5$y4 {
   private final int[][] n5;

   public n5$t9(int var1, int var2, int var3, int[][] var4, y2 var5) {
      super(var1, var2, var3, var5.n3());
      this.n5 = var4;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = 0;

      while (var8 < var6) {
         int var9 = var5 / this.k5();
         int var10 = (8 - var5) / this.k5();
         int var11 = q1.l6(var6 - var8, var10);
         int[] var12 = this.n5[var3[var4] & 0xFF];
         int var13 = var9;

         for (int var14 = 0; var14 < var11; var14++) {
            var7[var2[0]++] = var12[var13++];
         }

         var8 += var11;
         var5 += var11 * this.k5();
         if (var5 == 8) {
            var5 = 0;
            var4++;
         }
      }
   }
}
