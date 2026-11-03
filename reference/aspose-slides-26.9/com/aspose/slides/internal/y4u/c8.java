package com.aspose.slides.internal.y4u;

public class c8 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      boolean var9 = this.n3.z3() == 5;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var2 + this.s7 * var10;
         int var12 = var10 * var8 + var7;

         for (int var13 = 0; var13 < var4; var13++) {
            int var14 = var13 * this.n3.z3() + var11;
            double var15 = 1.0 - (var1[var14++] & 0xFF) / 255.0;
            double var17 = 1.0 - (var1[var14++] & 0xFF) / 255.0;
            double var19 = 1.0 - (var1[var14++] & 0xFF) / 255.0;
            double var21 = 1.0 - (var1[var14++] & 0xFF) / 255.0;
            var6[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var15) * (1.0 - var21), 0.0, 255.0)), 14);
            var6[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var17) * (1.0 - var21), 0.0, 255.0)), 14);
            var6[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(255.0 * (1.0 - var19) * (1.0 - var21), 0.0, 255.0)), 14);
            var6[var12++] = (byte)(var9 ? var1[var14] : 255);
         }
      }
   }

   private static double n5(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }
}
