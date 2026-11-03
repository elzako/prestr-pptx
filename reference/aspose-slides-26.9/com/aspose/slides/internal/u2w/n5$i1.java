package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$i1 extends n5$s3 {
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;

   public n5$i1(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.l6 & 255;
      int var9 = this.k5 & 255;
      int var10 = this.u3 & 255;
      int var11 = this.a6 & 255;

      for (int var12 = 0; var12 < var6; var12++) {
         var11 = (byte)((var3[var4 + 3] & 255) + var11) & 255;
         var8 = (byte)((var3[var4] & 255) + var8) & 255;
         var9 = (byte)((var3[var4 + 1] & 255) + var9) & 255;
         var10 = (byte)((var3[var4 + 2] & 255) + var10) & 255;
         double var13 = 0.0;
         if (var11 != 0) {
            var13 = 255.0 / var11;
         }

         int var15 = com.aspose.slides.internal.v6g.k5.u3(var8 * var13 + 0.5, 14);
         int var16 = com.aspose.slides.internal.v6g.k5.u3(var9 * var13 + 0.5, 14);
         int var17 = com.aspose.slides.internal.v6g.k5.u3(var10 * var13 + 0.5, 14);
         if (var15 > 255) {
            var15 = 255;
         }

         if (var16 > 255) {
            var16 = 255;
         }

         if (var17 > 255) {
            var17 = 255;
         }

         int var18 = var11 << 24;
         var15 <<= 16;
         var16 <<= 8;
         int var19 = var18 | var15 | var16 | var17;
         var7[var2[0]++] = var19;
         var4 += this.n5;
      }

      this.l6 = (byte)var8;
      this.k5 = (byte)var9;
      this.u3 = (byte)var10;
      this.a6 = (byte)var11;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.l6 & 255;
      int var6 = this.k5 & 255;
      int var7 = this.u3 & 255;
      int var8 = this.a6 & 255;

      for (int var9 = 0; var9 < var4; var9++) {
         var8 = (byte)((var1[var2 + 3] & 255) + var8) & 255;
         var5 = (byte)((var1[var2] & 255) + var5) & 255;
         var6 = (byte)((var1[var2 + 1] & 255) + var6) & 255;
         var7 = (byte)((var1[var2 + 2] & 255) + var7) & 255;
         var2 += this.n5;
      }

      this.l6 = (byte)var5;
      this.k5 = (byte)var6;
      this.u3 = (byte)var7;
      this.a6 = (byte)var8;
   }

   @Override
   protected void n5() {
      this.a6 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
   }
}
