package com.aspose.slides.internal.t7p;

class a6 implements x8 {
   private final com.aspose.slides.internal.b7s.n3 n5;
   private final int l6;

   public a6(com.aspose.slides.internal.b7s.n3 var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      byte[] var4 = new byte[var2 * var3];

      for (int var5 = 0; var5 < var3; var5++) {
         byte var6 = 0;
         int var7 = var2 * var5;

         for (int var8 = 0; var8 < var2 >> 1; var8++) {
            byte var9 = var1[var7 + var8];
            var4[var7 + var6] = var9;
            var4[var7 + var6 + 1] = var9;
            var6 += 2;
         }
      }

      return var4;
   }
}
