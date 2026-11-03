package com.aspose.slides.internal.y4u;

public class e2 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      int var11 = 0;
      int var12 = this.n3.z3();

      for (int var13 = var1.c8(); var13 < var1.n5(); var13++) {
         int var14 = var13 * var10;

         for (int var15 = var1.u3(); var15 < var1.u9(); var15++) {
            for (int var16 = 0; var16 < var12; var16++) {
               var7[var11++] = var2[var16][var14 + var15];
            }
         }
      }
   }
}
