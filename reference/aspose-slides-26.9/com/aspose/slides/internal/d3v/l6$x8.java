package com.aspose.slides.internal.d3v;

class l6$x8 extends l6$y4 {
   public l6$x8(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3, 24);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      byte var6 = this.n5;
      byte var7 = this.l6;
      byte var8 = this.k5;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = var1[var2++];
         byte var11 = (byte)(var10 >> 16 & 0xFF);
         byte var12 = (byte)(var10 >> 8 & 0xFF);
         byte var13 = (byte)(var10 & 0xFF);
         var4[var5] = (byte)((var11 & 255) - (var6 & 255));
         var4[var5 + 1] = (byte)((var12 & 255) - (var7 & 255));
         var4[var5 + 2] = (byte)((var13 & 255) - (var8 & 255));
         var5 += 3;
         var6 = var11;
         var7 = var12;
         var8 = var13;
      }

      this.c8 = var5;
      this.n5 = var6;
      this.l6 = var7;
      this.k5 = var8;
      this.n5(var3);
   }
}
