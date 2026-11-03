package com.aspose.slides.internal.y4u;

public class t2 extends r1 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;

         for (int var12 = 0; var12 < var4; var12++) {
            int var13 = var12 * this.n3.z3() + var10;
            double var14 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var16 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var18 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            double var20 = 1.0 - (var1[var13++] & 0xFF) / 255.0;
            byte var22 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var14) * (1.0 - var20)))), 14
            );
            byte var23 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var16) * (1.0 - var20)))), 14
            );
            byte var24 = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.l6(0.0, com.aspose.slides.ms.System.q1.k5(255.0, 255.0 * (1.0 - var18) * (1.0 - var20)))), 14
            );
            var6[var11++] = (byte)(this.z8[(var22 & 255) + 0] + this.z8[(var23 & 255) + 256] + this.z8[(var24 & 255) + 512] >> 16);
            var6[var11++] = (byte)(this.z8[(var22 & 255) + 768] + this.z8[(var23 & 255) + 1024] + this.z8[(var24 & 255) + 1280] >> 16);
            var6[var11++] = (byte)(this.z8[(var22 & 255) + 1280] + this.z8[(var23 & 255) + 1536] + this.z8[(var24 & 255) + 1792] >> 16);
         }
      }
   }
}
