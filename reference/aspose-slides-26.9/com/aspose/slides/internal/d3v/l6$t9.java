package com.aspose.slides.internal.d3v;

class l6$t9 extends l6$q0 {
   private final int n5;
   private final boolean l6;

   public l6$t9(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var6);
      this.n5 = var5;
      this.l6 = this.s7.j5() == 1;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      int var6 = this.n5 * 2;

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var1[var2++];
         int var9 = var8 >> 24 & 0xFF;
         int var10 = var8 >> 16 & 0xFF;
         int var11 = var8 >> 8 & 0xFF;
         int var12 = var8 & 0xFF;
         if (this.l6) {
            var10 = var10 * var9 / 255;
            var11 = var11 * var9 / 255;
            var12 = var12 * var9 / 255;
         }

         var4[var5] = (byte)var10;
         var4[var5 + 1] = 0;
         var4[var5 + 2] = (byte)var11;
         var4[var5 + 3] = 0;
         var4[var5 + 4] = (byte)var12;
         var4[var5 + 5] = 0;
         var4[var5 + 6] = (byte)var9;
         var4[var5 + 7] = 0;
         var5 += var6;
      }

      this.c8 = var5;
   }
}
