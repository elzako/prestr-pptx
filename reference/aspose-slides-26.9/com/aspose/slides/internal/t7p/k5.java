package com.aspose.slides.internal.t7p;

class k5 implements x8 {
   private final int n5;
   private final com.aspose.slides.internal.b7s.n3 l6;
   private final int k5;

   public k5(com.aspose.slides.internal.b7s.n3 var1, int var2, int var3) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = var3;
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      com.aspose.slides.internal.f8y.n5.n5(var2 * var3 == var1.length);
      int var4 = var2 >> 1;
      byte[] var5 = new byte[var2 * var3];
      boolean var6 = false;
      int var7 = 0;

      for (int var12 = 0; var12 < var3; var12++) {
         for (int var8 = 0; var8 < 2; var8++) {
            int var9;
            if (var8 == 0) {
               var9 = var12 * var2;
            } else {
               var9 = var12 == var3 - 1 ? var12 * var2 : (var12 + 1) * var2;
            }

            var7 = var9;
            int var10 = var1[var9++] & 255;
            var5[var7++] = (byte)var10;
            var5[var7++] = (byte)(var10 * 3 + (var1[var9] & 255) + 2 >> 2);

            for (int var11 = 0; var11 < var4 - 2; var11++) {
               var10 = (var1[var9++] & 255) * 3;
               var5[var7++] = (byte)(var10 + (var1[var9 - 2] & 255) + 1 >> 2);
               var5[var7++] = (byte)(var10 + (var1[var9] & 255) + 2 >> 2);
            }

            var10 = var1[var9] & 255;
            var5[var7++] = (byte)(var10 * 3 + (var1[var9 - 1] & 255) + 1 >> 2);
            var5[var7] = (byte)var10;
         }
      }

      return var5;
   }
}
