package com.aspose.slides.internal.d3v;

class l6$s7 extends l6$q0 {
   private final int n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte x8;
   private final boolean n3;

   public l6$s7(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5);
      this.n5 = var6;
      this.n3 = this.s7.j5() == 1;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      int var6 = this.n5 * 2;
      byte var7 = this.k5;
      byte var8 = this.u3;
      byte var9 = this.x8;
      byte var10 = this.l6;
      long var11 = this.u9;

      for (int var13 = 0; var13 < var3; var13++) {
         int var14 = var1[var2++];
         int var15 = var14 >> 24 & 0xFF;
         int var16 = var14 >> 16 & 0xFF;
         int var17 = var14 >> 8 & 0xFF;
         int var18 = var14 & 0xFF;
         if (this.n3) {
            var16 = var16 * var15 / 255;
            var17 = var17 * var15 / 255;
            var18 = var18 * var15 / 255;
         }

         var4[var5] = (byte)(var16 - (var7 & 255));
         var4[var5 + 1] = 0;
         var4[var5 + 2] = (byte)(var17 - (var8 & 255));
         var4[var5 + 3] = 0;
         var4[var5 + 4] = (byte)(var18 - (var9 & 255));
         var4[var5 + 5] = 0;
         var4[var5 + 6] = (byte)(var15 - (var10 & 255));
         var4[var5 + 7] = 0;
         var5 += var6;
         if (--var11 % this.a6 == 0L) {
            var10 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
         } else {
            var10 = (byte)var15;
            var7 = (byte)var16;
            var8 = (byte)var17;
            var9 = (byte)var18;
         }
      }

      this.c8 = var5;
      this.k5 = var7;
      this.u3 = var8;
      this.x8 = var9;
      this.l6 = var10;
   }
}
