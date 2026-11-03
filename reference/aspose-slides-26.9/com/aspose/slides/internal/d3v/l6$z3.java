package com.aspose.slides.internal.d3v;

class l6$z3 extends com.aspose.slides.internal.d3c.u3 {
   public l6$z3(int var1, int var2, int var3, com.aspose.slides.internal.f2i.n5 var4) {
      super(var1, var2, var3, 24, var4);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      boolean var4 = false;
      short var5 = 255;
      int[] var6 = this.u3;
      byte[] var7 = this.h0;
      int var8 = this.c8;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = var1[var2++];
         int var11 = (byte)(var10 >> 16 & 0xFF) & 255;
         int var12 = (byte)(var10 >> 8 & 0xFF) & 255;
         int var13 = (byte)(var10 & 0xFF) & 255;
         int var14 = var6[var11 + 0] + var6[var12 + 256] + var6[var13 + 512] >> 16;
         int var15 = var6[var11 + 1536] + var6[var12 + 1792] + var6[var13 + 2048] >> 16;
         int var16 = var6[var11 + 768] + var6[var12 + 1024] + var6[var13 + 1280] >> 16;
         if (var14 < 0) {
            var14 = 0;
         } else if (var14 > 255) {
            var14 = 255;
         }

         if (var15 < 0) {
            var15 = 0;
         } else if (var15 > 255) {
            var15 = 255;
         }

         if (var16 < 0) {
            var16 = 0;
         } else if (var16 > 255) {
            var16 = 255;
         }

         var7[var8++] = (byte)var14;
         var7[var8++] = (byte)var15;
         var7[var8++] = (byte)var16;
      }

      this.c8 = var8;
   }
}
