package com.aspose.slides.internal.y4u;

public class w1 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;

         for (int var12 = 0; var12 < var4; var12++) {
            int var13 = var12 + var10;
            byte var14 = var1[var13];
            var6[var11++] = var14;
            var6[var11++] = var14;
            var6[var11++] = var14;
         }
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      int var11 = var3;
      int var12 = var8;

      for (int var13 = 0; var13 < var6; var13++) {
         int var14 = var12;

         for (int var15 = var1.u3(); var15 < var1.u9(); var15++) {
            int var16 = var11 + var15;
            byte var17 = var2[0][var16];
            var7[var14++] = var17;
            var7[var14++] = var17;
            var7[var14++] = var17;
         }

         var11 += var10;
         var12 += var9;
      }
   }
}
