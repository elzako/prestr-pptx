package com.aspose.slides.internal.y4u;

public class x9 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = this.s7;

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var2 + var9 * var10;
         int var12 = var10 * var8 + var7;
         int var13 = var11;

         for (int var14 = 0; var14 < var4; var14++) {
            byte var15 = var1[var13++];
            byte var16 = var1[var13++];
            byte var17 = var1[var13++];
            var6[var12++] = var17;
            var6[var12++] = var16;
            var6[var12++] = var15;
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
            var7[var14++] = var2[2][var16];
            var7[var14++] = var2[1][var16];
            var7[var14++] = var2[0][var16];
         }

         var11 += var10;
         var12 += var9;
      }
   }
}
