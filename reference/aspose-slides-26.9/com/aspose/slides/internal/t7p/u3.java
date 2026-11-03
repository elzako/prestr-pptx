package com.aspose.slides.internal.t7p;

class u3 implements c8 {
   @Override
   public final void n5(short[] var1, int var2) {
      int var3 = var1.length / var2;
      int var4 = var2 >> 1;
      int var5 = 0;

      for (int var6 = 0; var6 < var3; var6++) {
         byte var7 = 0;
         int var8 = 0;

         for (int var9 = 0; var8 < var4; var9 += 2) {
            var1[var5 + var8] = (short)(var1[var5 + var9] + var1[var5 + var9 + 1] + var7 >> 1);
            var7 ^= 1;
            var8++;
         }

         var5 += var2;
      }
   }
}
