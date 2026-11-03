package com.aspose.slides.internal.y4u;

public class s9 extends y1 {
   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      boolean var11 = this.u3.t4() == 1;
      int var12 = var8;
      double[] var13 = new double[4];
      double[] var14 = new double[3];

      for (int var15 = 0; var15 < var6; var15++) {
         for (int var16 = var1.u3(); var16 < var1.u9(); var16++) {
            int var17 = var3 + var16;
            byte var18 = (byte)(255 - (var2[0][var17] & 255));
            byte var19 = (byte)(255 - (var2[1][var17] & 255));
            byte var20 = (byte)(255 - (var2[2][var17] & 255));
            byte var21 = (byte)(255 - (var2[3][var17] & 255));
            double var22 = (var18 & 0xFF) + 1.402 * (var20 & 0xFF) - 179.456;
            double var24 = (var18 & 0xFF) - 0.34414 * (var19 & 0xFF) - 0.71414 * (var20 & 0xFF) + 135.45984;
            double var26 = (var18 & 0xFF) + 1.7718 * (var19 & 0xFF) - 226.816;
            double var28 = 255.0 - var22;
            double var30 = 255.0 - var24;
            double var32 = 255.0 - var26;
            var13[0] = n5(var28, 0.0, 255.0) / 255.0;
            var13[1] = n5(var30, 0.0, 255.0) / 255.0;
            var13[2] = n5(var32, 0.0, 255.0) / 255.0;
            var13[3] = (var21 & 0xFF) / 255.0;
            this.n5(var13, var14);
            if (var11) {
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[2] * 255.0), 14);
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[1] * 255.0), 14);
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[0] * 255.0), 14);
            } else {
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[0] * 255.0), 14);
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[1] * 255.0), 14);
               var7[var12++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[2] * 255.0), 14);
            }
         }

         var3 += var10;
      }
   }

   private static double n5(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }
}
