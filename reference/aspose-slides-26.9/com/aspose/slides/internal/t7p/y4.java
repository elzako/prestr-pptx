package com.aspose.slides.internal.t7p;

class y4 implements x8 {
   private final com.aspose.slides.internal.b7s.n3 n5;
   private final int l6;
   private final int k5;
   private final int u3;

   public y4(com.aspose.slides.internal.b7s.n3 var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      int var4 = this.k5 / (this.n5.u3() & 255);
      int var5 = this.u3 / (this.n5.n3() & 255);
      int var6 = this.n5.n5;
      int var7 = var6 * var4 * 8;
      int var8 = var6 * var4 * 8;
      int var9 = var1.length / var8;
      byte[] var10 = new byte[var8 * var9];
      int var11 = 0;

      for (int var12 = 0; var12 < var9; var12++) {
         int var13 = 0;

         for (int var14 = 0; var14 < var6 * 8; var14++) {
            byte var15 = var1[var11 * var7 + var14];

            for (int var16 = this.n5.u3() & 255; var16 > 0; var16--) {
               var10[var12 * var7 + var13] = var15;
               var13++;
            }
         }

         if (var5 > 1) {
            for (int var17 = 1; var17 < this.u3; var17++) {
               com.aspose.slides.internal.b7s.a6.n5(var10, var12 * var7, var10, (var12 + 1) * var7, var6 * 8 * (this.n5.u3() & 255));
               var12++;
            }
         }

         var11++;
      }

      return var10;
   }
}
