package com.aspose.slides.internal.y4u;

public class a7 extends s7 {
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
            var6[var11++] = var16;
            var6[var11++] = var15;
            var6[var11++] = var14;
            var6[var11++] = var17;
         }
      }
   }
}
