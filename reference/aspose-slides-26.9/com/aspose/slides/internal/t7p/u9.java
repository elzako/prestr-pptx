package com.aspose.slides.internal.t7p;

class u9 implements x8 {
   private final com.aspose.slides.internal.b7s.n3 n5;
   private final int l6;
   private final int k5;

   public u9(com.aspose.slides.internal.b7s.n3 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      com.aspose.slides.internal.f8y.n5.n5(var2 * var3 == var1.length);
      int var4 = var2 >> 1;
      int var5 = var3 >> 1;
      byte[] var6 = new byte[var2 * var3];
      boolean var7 = false;
      int var8 = 0;

      for (int var17 = 0; var17 < var5; var17++) {
         for (int var9 = 0; var9 < 2; var9++) {
            int var10 = var17 * var2;
            int var11;
            if (var9 == 0) {
               var11 = var17 == 0 ? 0 : (var17 - 1) * var2;
            } else {
               var11 = var17 == var5 - 1 ? var17 * var2 : (var17 + 1) * var2;
            }

            int var12 = var8++ * var2;
            int var13 = (var1[var10++] & 255) * 3 + (var1[var11++] & 255);
            int var14 = (var1[var10++] & 255) * 3 + (var1[var11++] & 255);
            var6[var12++] = (byte)(var13 * 4 + 8 >> 4);
            var6[var12++] = (byte)(var13 * 3 + var14 + 7 >> 4);
            int var15 = var13;
            var13 = var14;

            for (int var16 = 0; var16 < var4 - 2; var16++) {
               var14 = (var1[var10++] & 255) * 3 + (var1[var11++] & 255);
               var6[var12++] = (byte)(var13 * 3 + var15 + 8 >> 4);
               var6[var12++] = (byte)(var13 * 3 + var14 + 7 >> 4);
               var15 = var13;
               var13 = var14;
            }

            var6[var12++] = (byte)(var13 * 3 + var15 + 8 >> 4);
            var6[var12] = (byte)(var13 * 4 + 7 >> 4);
         }
      }

      return var6;
   }
}
