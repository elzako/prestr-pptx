package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$b3 extends n5$y4 {
   private final int n5;
   private final boolean l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   public n5$b3(int var1, int var2, int var3, y2 var4, int var5) {
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
      int var11 = this.u9;
      float var12 = 0.0038910506F;

      for (int var13 = 0; var13 < var6; var13++) {
         int var14;
         int var15;
         int var16;
         int var17;
         if (this.l6) {
            var14 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var15 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var16 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
            var17 = (var3[var4 + 7] & 255) << 8 | var3[var4 + 6] & 255;
         } else {
            var14 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var15 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var16 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
            var17 = (var3[var4 + 6] & 255) << 8 | var3[var4 + 7] & 255;
         }

         var8 = var8 + var14 & 65535;
         var9 = var9 + var15 & 65535;
         var10 = var10 + var16 & 65535;
         var11 = var11 + var17 & 65535;
         int var19;
         int var20;
         int var21;
         if (var11 != 0) {
            float var18 = 65535.0F / var11;
            var19 = com.aspose.slides.internal.v6g.k5.u3(var8 * var18 + 0.5, 14);
            var20 = com.aspose.slides.internal.v6g.k5.u3(var9 * var18 + 0.5, 14);
            var21 = com.aspose.slides.internal.v6g.k5.u3(var10 * var18 + 0.5, 14);
         } else {
            var19 = var8;
            var20 = var9;
            var21 = var10;
         }

         var19 = com.aspose.slides.internal.v6g.k5.u3(var19 * var12 + 0.5F, 13);
         var20 = com.aspose.slides.internal.v6g.k5.u3(var20 * var12 + 0.5F, 13);
         var21 = com.aspose.slides.internal.v6g.k5.u3(var21 * var12 + 0.5F, 13);
         int var22 = com.aspose.slides.internal.v6g.k5.u3(var11 * var12 + 0.5F, 13);
         if (var19 > 255) {
            var19 = 255;
         }

         if (var20 > 255) {
            var20 = 255;
         }

         if (var21 > 255) {
            var21 = 255;
         }

         if (var22 > 255) {
            var22 = 255;
         }

         int var23 = var22 << 24 | var19 << 16 | var20 << 8 | var21;
         var7[var2[0]++] = var23;
         var4 += this.n5;
      }

      this.k5 = var8;
      this.u3 = var9;
      this.a6 = var10;
      this.u9 = var11;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.k5;
      int var6 = this.u3;
      int var7 = this.a6;
      int var8 = this.u9;

      for (int var9 = 0; var9 < var4; var9++) {
         int var10;
         int var11;
         int var12;
         int var13;
         if (this.l6) {
            var10 = (var1[var2 + 1] & 255) << 8 | var1[var2] & 255;
            var11 = (var1[var2 + 3] & 255) << 8 | var1[var2 + 2] & 255;
            var12 = (var1[var2 + 5] & 255) << 8 | var1[var2 + 4] & 255;
            var13 = (var1[var2 + 7] & 255) << 8 | var1[var2 + 6] & 255;
         } else {
            var10 = (var1[var2] & 255) << 8 | var1[var2 + 1] & 255;
            var11 = (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
            var12 = (var1[var2 + 4] & 255) << 8 | var1[var2 + 5] & 255;
            var13 = (var1[var2 + 6] & 255) << 8 | var1[var2 + 7] & 255;
         }

         var5 = var5 + var10 & 65535;
         var6 = var6 + var11 & 65535;
         var7 = var7 + var12 & 65535;
         var8 = var8 + var13 & 65535;
         var2 += this.n5;
      }

      this.k5 = var5;
      this.u3 = var6;
      this.a6 = var7;
      this.u9 = var8;
   }

   @Override
   protected void n5() {
      this.u9 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
   }
}
