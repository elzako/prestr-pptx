package com.aspose.slides.internal.y4u;

public class d1 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;
         int var12 = var10;

         for (int var13 = 0; var13 < var4; var13++) {
            byte var14 = var1[var12++];
            byte var15 = var1[var12++];
            byte var16 = var1[var12++];
            var12++;
            double var17 = 1.0 - (var14 & 0xFF) / 255.0;
            double var19 = 1.0 - (var15 & 0xFF) / 255.0;
            double var21 = 1.0 - (var16 & 0xFF) / 255.0;
            double var23 = com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(1.0, var17), var19), var21);
            if (com.aspose.slides.ms.System.q1.n5(var23 - 1.0) < 0.001) {
               var21 = 0.0;
               var19 = 0.0;
               var17 = 0.0;
            } else {
               var17 = (var17 - var23) / (1.0 - var23);
               var19 = (var19 - var23) / (1.0 - var23);
               var21 = (var21 - var23) / (1.0 - var23);
            }

            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var17))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var19))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var21))), 14
            );
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * var23))), 14
            );
         }
      }
   }
}
