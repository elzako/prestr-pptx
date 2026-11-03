package com.aspose.slides.internal.y4u;

public class a5 extends z7 {
   @Override
   protected void l6(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;
         byte var12 = 0;

         for (int var13 = 0; var13 < var4; var13++) {
            int var14 = var1[var10 + var12] & 255 | (var1[var10 + var12 + 1] & 255) << 8;
            byte var15 = com.aspose.slides.internal.v6g.k5.n5((Object)(8.225806451612904 * ((var14 & 31744) >> 10) + 0.5), 14);
            byte var16 = com.aspose.slides.internal.v6g.k5.n5((Object)(8.225806451612904 * ((var14 & 992) >> 5) + 0.5), 14);
            byte var17 = com.aspose.slides.internal.v6g.k5.n5((Object)(8.225806451612904 * (var14 & 31) + 0.5), 14);
            var6[var11++] = var15;
            var6[var11++] = var16;
            var6[var11++] = var17;
            var12 += 2;
         }
      }
   }

   @Override
   protected void k5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;
         byte var12 = 0;

         for (int var13 = 0; var13 < var4; var13++) {
            int var14 = var1[var10 + var12] & 255 | (var1[var10 + var12 + 1] & 255) << 8;
            byte var15 = com.aspose.slides.internal.v6g.k5.n5((Object)(8.225806451612904 * ((var14 & 63488) >> 11) + 0.5), 14);
            byte var16 = com.aspose.slides.internal.v6g.k5.n5((Object)(4.0476190476190474 * ((var14 & 2016) >> 5) + 0.5), 14);
            byte var17 = com.aspose.slides.internal.v6g.k5.n5((Object)(8.225806451612904 * (var14 & 31) + 0.5), 14);
            var6[var11++] = var15;
            var6[var11++] = var16;
            var6[var11++] = var17;
            var12 += 2;
         }
      }
   }
}
