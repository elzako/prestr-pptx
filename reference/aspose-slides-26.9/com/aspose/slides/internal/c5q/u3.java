package com.aspose.slides.internal.c5q;

import com.aspose.slides.internal.y4u.r1;

class u3 extends r1 {
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
            byte var17 = var1[var12++];
            var6[var11++] = (byte)(this.z8[(var17 & 255) + 0] + this.z8[(var16 & 255) + 256] + this.z8[(var15 & 255) + 512] >> 16);
            var6[var11++] = (byte)(this.z8[(var17 & 255) + 768] + this.z8[(var16 & 255) + 1024] + this.z8[(var15 & 255) + 1280] >> 16);
            var6[var11++] = (byte)(this.z8[(var17 & 255) + 1280] + this.z8[(var16 & 255) + 1536] + this.z8[(var15 & 255) + 1792] >> 16);
         }
      }
   }
}
