package com.aspose.slides.internal.y4u;

public class n5 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;
         int var12 = var10;

         for (int var13 = 0; var13 < var4; var13++) {
            double var14 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var16 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var18 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var20 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var22 = com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var14) * (1.0 - var20)));
            double var24 = com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var16) * (1.0 - var20)));
            double var26 = com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var18) * (1.0 - var20)));
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5((Object)(0.2126 * var22 + 0.7152 * var24 + 0.0722 * var26), 14);
            var6[var11++] = -1;
         }
      }
   }
}
