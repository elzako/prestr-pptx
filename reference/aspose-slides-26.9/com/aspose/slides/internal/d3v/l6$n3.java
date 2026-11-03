package com.aspose.slides.internal.d3v;

class l6$n3 extends l6$y4 {
   private final int x8;

   public l6$n3(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4);
      this.x8 = var5;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      byte var6 = this.n5;
      byte var7 = this.l6;
      byte var8 = this.k5;
      byte var9 = this.u3;

      for (int var10 = 0; var10 < var3; var10++) {
         int var11 = var1[var2++];
         byte var12 = (byte)(var11 >> 24);
         byte var13 = (byte)(var11 >> 16 & 0xFF);
         byte var14 = (byte)(var11 >> 8 & 0xFF);
         byte var15 = (byte)(var11 & 0xFF);
         var4[var5] = (byte)((var13 & 255) - (var6 & 255));
         var4[var5 + 1] = (byte)((var14 & 255) - (var7 & 255));
         var4[var5 + 2] = (byte)((var15 & 255) - (var8 & 255));
         var4[var5 + 3] = (byte)((var12 & 255) - (var9 & 255));
         var5 += this.x8;
         var9 = var12;
         var6 = var13;
         var7 = var14;
         var8 = var15;
      }

      this.c8 = var5;
      this.n5 = var6;
      this.l6 = var7;
      this.k5 = var8;
      this.u3 = var9;
      this.n5(var3);
   }
}
