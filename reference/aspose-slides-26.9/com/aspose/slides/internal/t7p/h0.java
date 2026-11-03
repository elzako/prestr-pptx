package com.aspose.slides.internal.t7p;

class h0 implements x8 {
   private final com.aspose.slides.internal.b7s.n3 n5;
   private final int l6;

   public h0(com.aspose.slides.internal.b7s.n3 var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      int var4 = this.n5.n5 * 8 * 2;
      int var5 = var1.length / var4;
      byte[] var6 = new byte[var4 * var5];
      int var7 = 0;
      byte var8 = 0;
      byte[][] var9 = new byte[][]{var6};
      this.n5(var1, var7, var7, var4, var9, var8);
      var6 = var9[0];
      var7++;

      for (int var12 = var8 + 2; var12 < var5; var7++) {
         var9[0] = var6;
         this.n5(var1, var7, var7 - 1, var4, var9, var12);
         var6 = var9[0];
         var12 += 2;
      }

      return var6;
   }

   private void n5(byte[] var1, int var2, int var3, int var4, byte[][] var5, int var6) {
      for (int var7 = 0; var7 < 2; var7++) {
         int var8 = 0;
         int var9 = 0;
         int var10 = 3 * (var1[var2 * var4 + var9] & 255) + (var1[var3 * var4 + var9] & 255);
         int var11 = 3 * (var1[var2 * var4 + var9] & 255) + (var1[var3 * var4 + var9] & 255);
         var9++;
         var5[0][var4 * var6 + var8] = (byte)(var10 * 4 + 8 >> 4);
         var5[0][var4 * var6 + ++var8] = (byte)(var10 * 3 + var11 + 7 >> 4);
         var8++;
         int var12 = var10;
         var10 = var11;

         for (int var13 = 1; var13 < this.n5.n5 * 8 - 1; var13++) {
            var11 = 3 * (var1[var2 * var4 + var9] & 255) + (var1[var3 * var4 + var9] & 255);
            var9++;
            var5[0][var4 * var6 + var8] = (byte)(var10 * 3 + var12 + 8 >> 4);
            var5[0][var4 * var6 + ++var8] = (byte)(var10 * 3 + var11 + 7 >> 4);
            var8++;
            var12 = var10;
            var10 = var11;
         }

         var5[0][var4 * var6 + var8] = (byte)(var10 * 3 + var12 + 8 >> 4);
         var5[0][var4 * var6 + ++var8] = (byte)(var10 * 4 + 7 >> 4);
         var6++;
      }
   }
}
