package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

class n5$q0 extends n5$y4 {
   private byte n5;
   private final byte l6;
   private final int[] k5;

   public n5$q0(int var1, int var2, int var3, int[] var4, y2 var5) {
      super(var1, var2, var3, var5.n3());
      this.l6 = (byte)((1 << var1) - 1);
      this.k5 = var4;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.k5();
      byte var9 = this.l6;
      int[] var10 = this.k5;
      byte var11 = this.n5;

      while (var6 > 0) {
         int var12 = q1.l6(var6, (8 - var5) / var8);
         byte var13 = var3[var4];

         for (int var14 = 1; var14 <= var12; var14++) {
            byte var15 = (byte)((var13 & 255) >> 8 - var5 - var14 * var8 & var9 & 0xFF);
            byte var16 = (byte)((var11 & 255) + (var15 & 255));
            var11 = (byte)(var16 & 0xFF & var9 & 0xFF);
            var7[var2[0]++] = var10[var11 & 0xFF];
         }

         var5 += var12 * var8;
         if (var5 == 8) {
            var5 = 0;
            var4++;
         }

         var6 -= var12;
      }

      this.n5 = var11;
   }

   @Override
   protected void n5() {
      this.n5 = 0;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.k5();
      byte var6 = this.l6;
      byte var7 = this.n5;

      while (var4 > 0) {
         int var8 = q1.l6(var4, (8 - var3) / var5);
         byte var9 = var1[var2];

         for (int var10 = 1; var10 <= var8; var10++) {
            byte var11 = (byte)((var9 & 255) >> 8 - var3 - var10 * var5 & var6 & 0xFF);
            var7 = (byte)((var7 & 255) + (var11 & 255));
            var7 = (byte)(var7 & 0xFF & var6 & 0xFF);
         }

         var3 += var8 * var5;
         if (var3 == 8) {
            var3 = 0;
            var2++;
         }

         var4 -= var8;
      }

      this.n5 = var7;
   }
}
