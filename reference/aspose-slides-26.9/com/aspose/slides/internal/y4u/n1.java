package com.aspose.slides.internal.y4u;

public class n1 extends s7 {
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
            int var17 = (this.y4 - 24) / 8;
            var12 += var17;
            if ((var14 & 255) == 0 && (var15 & 255) == 0 && (var16 & 255) == 0) {
               var6[var11++] = 0;
               var6[var11++] = 0;
               var6[var11++] = 0;
               var6[var11++] = 0;
            } else if ((var14 & 255) == 255 && (var15 & 255) == 255 && (var16 & 255) == 255) {
               var6[var11++] = -1;
               var6[var11++] = -1;
               var6[var11++] = -1;
               var6[var11++] = -1;
            } else {
               double var18 = 1.0 - (var14 & 0xFF) / 255.0;
               double var20 = 1.0 - (var15 & 0xFF) / 255.0;
               double var22 = 1.0 - (var16 & 0xFF) / 255.0;
               double var24 = com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.q1.k5(1.0, var22), var20), var18);
               var22 = (var22 - var24) / (1.0 - var24);
               var20 = (var20 - var24) / (1.0 - var24);
               var18 = (var18 - var24) / (1.0 - var24);
               byte var26 = com.aspose.slides.internal.v6g.k5.n5(
                  (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var22) * (1.0 - var24)))), 14
               );
               byte var27 = com.aspose.slides.internal.v6g.k5.n5(
                  (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var20) * (1.0 - var24)))), 14
               );
               byte var28 = com.aspose.slides.internal.v6g.k5.n5(
                  (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var18) * (1.0 - var24)))), 14
               );
               byte var29 = com.aspose.slides.internal.v6g.k5.n5(
                  (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var24)))), 14
               );
               var6[var11++] = var26;
               var6[var11++] = var27;
               var6[var11++] = var28;
               var6[var11++] = var29;
            }
         }
      }
   }
}
