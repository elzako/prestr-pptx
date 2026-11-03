package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class f2 extends s7 {
   protected int z8;
   protected int j5;
   protected int w1;
   protected int r4;
   private byte[][] c4;

   @Override
   protected void n5() {
      if (this.z1 == null) {
         throw new ArgumentNullException("SourcePalette");
      }

      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.y4), 14);
      this.r4 = var1 - 1;
      this.w1 = 8 / this.y4;
      this.j5 = this.u9 / this.y4;
      this.z8 = this.u9 / 8;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      if (this.c4 == null) {
         int[] var9 = n5(this.z1, this.y4).l6();
         this.c4 = this.n5(var9);
      }

      for (int var22 = 0; var22 < var5; var22++) {
         int var10 = var3 + var4 * this.y4;
         int var11 = (var10 - 1) / 8;
         int var12 = var3 / 8;
         int var13 = var11 - var12 + 1;
         int var14 = var3;
         int var15 = var3 % 8 / this.y4 * this.z8;
         int var16 = 0;

         for (int var17 = 0; var17 < var13; var17++) {
            byte[] var18 = this.c4[var1[var17 + this.s7 * var22 + var2] & 0xFF];
            int var19 = (var14 + 8) / 8 * 8;
            var19 = com.aspose.slides.ms.System.q1.l6(var19, var10);
            int var20 = (var19 - var14) / this.y4;
            int var21 = var20 * this.z8;
            com.aspose.slides.ms.System.y4.n5(var18, var15, var6, var7 + var16, var21);
            var14 += var20 * this.y4;
            var15 = 0;
            var16 += var21;
         }

         var7 += var8;
      }
   }

   protected abstract byte[][] n5(int[] var1);
}
