package com.aspose.slides.internal.d3v;

class l6$t2 extends l6$q0 {
   private int n5;
   private int l6;
   private int k5;

   public l6$t2(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 48);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      int var6 = this.n5;
      int var7 = this.l6;
      int var8 = this.k5;
      long var9 = this.u9;

      for (int var11 = 0; var11 < var3; var11++) {
         int var12 = var1[var2++];
         int var13 = var12 >> 16 & 0xFF;
         int var14 = var12 >> 8 & 0xFF;
         int var15 = var12 & 0xFF;
         int var16 = var13 - var6;
         var4[var5 + 0] = (byte)var16;
         var4[var5 + 1] = 0;
         var16 = var14 - var7;
         var4[var5 + 2] = (byte)var16;
         var4[var5 + 3] = 0;
         var16 = var15 - var8;
         var4[var5 + 4] = (byte)var16;
         var4[var5 + 5] = 0;
         var5 += 6;
         if (--var9 % this.a6 == 0L) {
            var6 = 0;
            var7 = 0;
            var8 = 0;
         } else {
            var6 = var13;
            var7 = var14;
            var8 = var15;
         }
      }

      this.c8 = var5;
      this.n5 = var6;
      this.l6 = var7;
      this.k5 = var8;
   }
}
