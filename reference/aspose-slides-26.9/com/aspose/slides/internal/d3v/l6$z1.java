package com.aspose.slides.internal.d3v;

class l6$z1 extends l6$q0 {
   private final int n5;

   public l6$z1(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var6);
      this.n5 = var5;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var1[var2++];
         byte var8 = (byte)(var7 >> 24);
         byte var9 = (byte)(var7 >> 16 & 0xFF);
         byte var10 = (byte)(var7 >> 8 & 0xFF);
         byte var11 = (byte)(var7 & 0xFF);
         var4[var5] = var9;
         var4[var5 + 1] = var10;
         var4[var5 + 2] = var11;
         var4[var5 + 3] = var8;
         var5 += this.n5;
      }

      this.c8 = var5;
   }
}
