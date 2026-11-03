package com.aspose.slides.internal.y4u;

public class z8 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;

         for (int var12 = 0; var12 < var4; var12++) {
            int var13 = var12 + var10;
            byte var14 = var1[var13];
            double var15 = (var14 & 0xFF) / 255.0;
            double var17 = (var14 & 0xFF) / 255.0;
            double var19 = (var14 & 0xFF) / 255.0;
            double var21 = com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(1.0, var17), var19), var15);
            if (com.aspose.slides.ms.System.q1.n5(var21 - 1.0) < 0.001) {
               var15 = 0.0;
               var19 = 0.0;
               var17 = 0.0;
            } else {
               var17 = (var17 - var21) / (1.0 - var21);
               var19 = (var19 - var21) / (1.0 - var21);
               var15 = (var15 - var21) / (1.0 - var21);
            }

            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var17))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var19))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var15))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var21))), 14
            );
         }
      }
   }
}
