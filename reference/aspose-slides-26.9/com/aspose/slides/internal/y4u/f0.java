package com.aspose.slides.internal.y4u;

public class f0 extends s7 {
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
            var6[var11++] = com.aspose.slides.internal.v6g.k5.n5((Object)(0.2126 * (var16 & 0xFF) + 0.7152 * (var15 & 0xFF) + 0.0722 * (var14 & 0xFF)), 14);
            var6[var11++] = -1;
         }
      }
   }
}
