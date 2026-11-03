package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$t1 extends com.aspose.slides.internal.d3c.a6 {
   private final int a6;
   private byte u9;
   private byte h0;
   private byte c8;

   public n5$t1(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.f2i.n5 var5) {
      super(var1, var2, var3, var4.n3(), var5);
      this.a6 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      boolean var8 = false;
      short var9 = 255;
      int var10 = this.u9 & 255;
      int var11 = this.h0 & 255;
      int var12 = this.c8 & 255;
      int[] var13 = this.u3;

      for (int var14 = 0; var14 < var6; var14++) {
         var10 = (byte)((var3[var4] & 255) + var10) & 255;
         var11 = (byte)((var3[var4 + 1] & 255) + var11) & 255;
         var12 = (byte)((var3[var4 + 2] & 255) + var12) & 255;
         int var15 = var13[var10 + 0] + var13[var12 + 768] >> 16;
         int var16 = var13[var10 + 256] + var13[var11 + 1024] + var13[var12 + 1280] >> 16;
         int var17 = var13[var10 + 512] + var13[var11 + 1536] >> 16;
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

         if (var17 < 0) {
            var17 = 0;
         } else if (var17 > 255) {
            var17 = 255;
         }

         var15 <<= 16;
         var16 <<= 8;
         int var18 = 0xFF000000 | var15 | var16 | var17;
         var7[var2[0]++] = var18;
         var4 += this.a6;
      }

      this.u9 = (byte)var10;
      this.h0 = (byte)var11;
      this.c8 = (byte)var12;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.u9 & 255;
      int var6 = this.h0 & 255;
      int var7 = this.c8 & 255;

      for (int var8 = 0; var8 < var4; var8++) {
         var5 = (byte)((var1[var2] & 255) + var5) & 255;
         var6 = (byte)((var1[var2 + 1] & 255) + var6) & 255;
         var7 = (byte)((var1[var2 + 2] & 255) + var7) & 255;
         var2 += this.a6;
      }

      this.u9 = (byte)var5;
      this.h0 = (byte)var6;
      this.c8 = (byte)var7;
   }

   @Override
   protected void n5() {
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
   }
}
