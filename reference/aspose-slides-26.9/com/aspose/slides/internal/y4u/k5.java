package com.aspose.slides.internal.y4u;

public class k5 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;

         for (int var12 = 0; var12 < var4; var12++) {
            int var13 = var12 * 4 + var10;
            double var14 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var16 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var18 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var20 = 1.0 - (var1[var13] & 0xFF) / 255.0;
            byte var22 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var14) * (1.0 - var20)))), 14
            );
            byte var23 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var16) * (1.0 - var20)))), 14
            );
            byte var24 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var18) * (1.0 - var20)))), 14
            );
            int var25 = 31 & com.aspose.slides.internal.v6g.k5.u3((var24 & 0xFF) / 8.225806451612904 + 0.5, 14)
               | (31 & com.aspose.slides.internal.v6g.k5.u3((var23 & 0xFF) / 8.225806451612904 + 0.5, 14)) << 5
               | (31 & com.aspose.slides.internal.v6g.k5.u3((var22 & 0xFF) / 8.225806451612904 + 0.5, 14)) << 10;
            var6[var11++] = (byte)(var25 & 0xFF);
            var6[var11++] = (byte)((var25 & 0xFF00) >> 8);
         }
      }
   }
}
