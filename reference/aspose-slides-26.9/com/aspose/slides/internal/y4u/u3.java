package com.aspose.slides.internal.y4u;

public class u3 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = var2;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var10 * var8 + var7;
         int var12 = var9;

         for (int var13 = 0; var13 < var4; var13++) {
            double var14 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var16 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var18 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            double var20 = 1.0 - (var1[var12++] & 0xFF) / 255.0;
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var18) * (1.0 - var20)))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var16) * (1.0 - var20)))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var14) * (1.0 - var20)))), 14
            );
         }

         var9 += this.s7;
      }
   }
}
