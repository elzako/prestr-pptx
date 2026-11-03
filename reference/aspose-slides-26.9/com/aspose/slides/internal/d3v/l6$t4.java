package com.aspose.slides.internal.d3v;

class l6$t4 extends l6$q0 {
   public l6$t4(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 24);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var1[var2++];
         float var8 = (var7 >> 24 & 0xFF) / 255.0F;
         byte var9 = (byte)((var7 >> 16 & 0xFF) * var8);
         byte var10 = (byte)((var7 >> 8 & 0xFF) * var8);
         byte var11 = (byte)((var7 & 0xFF) * var8);
         var4[var5++] = var9;
         var4[var5++] = var10;
         var4[var5++] = var11;
      }

      this.c8 = var5;
   }
}
