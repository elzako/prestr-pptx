package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$d2 extends n5$y4 {
   private final int n5;
   private final boolean l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   public n5$d2(int var1, int var2, int var3, y2 var4, int var5) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
      this.l6 = var5 == 18761;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      long[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, long[].class);
      int var8 = this.k5;
      int var9 = this.u3;
      int var10 = this.a6;
      int var11 = this.u9;

      for (int var12 = 0; var12 < var6; var12++) {
         int var13;
         int var14;
         int var15;
         int var16;
         if (this.l6) {
            var13 = (var3[var4 + 1] & 255) << 8 | var3[var4] & 255;
            var14 = (var3[var4 + 3] & 255) << 8 | var3[var4 + 2] & 255;
            var15 = (var3[var4 + 5] & 255) << 8 | var3[var4 + 4] & 255;
            var16 = (var3[var4 + 7] & 255) << 8 | var3[var4 + 6] & 255;
         } else {
            var13 = (var3[var4] & 255) << 8 | var3[var4 + 1] & 255;
            var14 = (var3[var4 + 2] & 255) << 8 | var3[var4 + 3] & 255;
            var15 = (var3[var4 + 4] & 255) << 8 | var3[var4 + 5] & 255;
            var16 = (var3[var4 + 6] & 255) << 8 | var3[var4 + 7] & 255;
         }

         var8 = var8 + var13 & 65535;
         var9 = var9 + var14 & 65535;
         var10 = var10 + var15 & 65535;
         var11 = var11 + var16 & 65535;
         long var17 = (long)var11 << 48 | (long)var8 << 32 | (long)var9 << 16 | var10;
         var7[var2[0]++] = var17;
         var4 += this.n5;
      }

      this.k5 = var8;
      this.u3 = var9;
      this.a6 = var10;
      this.u9 = var11;
   }

   @Override
   protected void n5() {
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
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
}
