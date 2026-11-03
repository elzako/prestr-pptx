package com.aspose.slides.internal.t7p;

class z1 implements c8 {
   @Override
   public final void n5(short[] var1, int var2) {
      int var3 = var1.length / var2;
      int var4 = var2 >> 1;
      int var5 = var3 >> 1;
      int var6 = 0;

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = 0;

         for (int var9 = 0; var8 < var4; var9 += 2) {
            var1[var6 + var8] = (short)(var1[var6 + var9] + var1[var6 + var9 + 1]);
            var8++;
         }

         var6 += var2;
      }

      var6 = 0;
      int var11 = 0;

      for (int var12 = 0; var12 < var5; var12++) {
         for (int var13 = 0; var13 < var4; var13++) {
            var1[var6 + var13] = (short)(var1[var11 + var13] + var1[var11 + var2 + var13] >> 2);
         }

         var6 += var2;
         var11 += var2 << 1;
      }
   }
}
