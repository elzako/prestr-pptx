package com.aspose.slides.internal.y4u;

public class v3 extends r1 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = 0;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = this.s7 * var10;

         for (int var12 = 0; var12 < var4; var12++) {
            byte var13 = var1[var11++];
            byte var14 = var1[var11++];
            byte var15 = var1[var11++];
            var6[var9++] = (byte)(this.z8[(var15 & 255) + 0] + this.z8[(var14 & 255) + 256] + this.z8[(var13 & 255) + 512] >> 16);
            var6[var9++] = (byte)(this.z8[(var15 & 255) + 768] + this.z8[(var14 & 255) + 1024] + this.z8[(var13 & 255) + 1280] >> 16);
            var6[var9++] = (byte)(this.z8[(var15 & 255) + 1280] + this.z8[(var14 & 255) + 1536] + this.z8[(var13 & 255) + 1792] >> 16);
         }
      }
   }
}
