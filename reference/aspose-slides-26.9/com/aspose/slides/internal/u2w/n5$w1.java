package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$w1 extends n5$y4 {
   private final int n5;
   private final boolean l6;
   private int k5;
   private int u3;
   private int a6;

   public n5$w1(int var1, int var2, int var3, y2 var4, int var5) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
      this.l6 = var5 == 18761;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.k5;
      int var9 = this.u3;
      int var10 = this.a6;
      int var11 = this.n5;
      float var12 = 0.0038910506F;

      for (int var13 = 0; var13 < var6; var13++) {
         int var14;
         int var15;
         int var16;
         if (this.l6) {
            var14 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var15 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var16 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
         } else {
            var14 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var15 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var16 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
         }

         var8 = var8 + var14 & 65535;
         var9 = var9 + var15 & 65535;
         var10 = var10 + var16 & 65535;
         int var17 = com.aspose.slides.internal.v6g.k5.u3(var8 * var12 + 0.5F, 13);
         int var18 = com.aspose.slides.internal.v6g.k5.u3(var9 * var12 + 0.5F, 13);
         int var19 = com.aspose.slides.internal.v6g.k5.u3(var10 * var12 + 0.5F, 13);
         if (var17 > 255) {
            var17 = 255;
         }

         if (var18 > 255) {
            var18 = 255;
         }

         if (var19 > 255) {
            var19 = 255;
         }

         int var20 = 0xFF000000 | var17 << 16 | var18 << 8 | var19;
         var7[var2[0]++] = var20;
         var4 += var11;
      }

      this.k5 = var8;
      this.u3 = var9;
      this.a6 = var10;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.k5;
      int var6 = this.u3;
      int var7 = this.a6;

      for (int var8 = 0; var8 < var4; var8++) {
         int var9;
         int var10;
         int var11;
         if (this.l6) {
            var9 = (var1[var2 + 1] & 255) << 8 | var1[var2] & 255;
            var10 = (var1[var2 + 3] & 255) << 8 | var1[var2 + 2] & 255;
            var11 = (var1[var2 + 5] & 255) << 8 | var1[var2 + 4] & 255;
         } else {
            var9 = (var1[var2] & 255) << 8 | var1[var2 + 1] & 255;
            var10 = (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
            var11 = (var1[var2 + 4] & 255) << 8 | var1[var2 + 5] & 255;
         }

         var5 = var5 + var9 & 65535;
         var6 = var6 + var10 & 65535;
         var7 = var7 + var11 & 65535;
         var2 += this.n5;
      }

      this.k5 = var5;
      this.u3 = var6;
      this.a6 = var7;
   }

   @Override
   protected void n5() {
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
   }
}
