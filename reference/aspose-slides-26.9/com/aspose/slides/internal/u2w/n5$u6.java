package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$u6 extends com.aspose.slides.internal.d3c.a6 {
   private final int a6;

   public n5$u6(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.f2i.n5 var5) {
      super(var1, var2, var3, var4.n3(), var5);
      this.a6 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      boolean var8 = false;
      short var9 = 255;

      for (int var10 = 0; var10 < var6; var10++) {
         byte var11 = var3[var4];
         byte var12 = var3[var4 + 1];
         byte var13 = var3[var4 + 2];
         int var14 = this.u3[(var11 & 255) + 0] + this.u3[(var13 & 255) + 768] >> 16;
         int var15 = this.u3[(var11 & 255) + 256] + this.u3[(var12 & 255) + 1024] + this.u3[(var13 & 255) + 1280] >> 16;
         int var16 = this.u3[(var11 & 255) + 512] + this.u3[(var12 & 255) + 1536] >> 16;
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

         var14 <<= 16;
         var15 <<= 8;
         int var17 = 0xFF000000 | var14 | var15 | var16;
         var7[var2[0]++] = var17;
         var4 += this.a6;
      }
   }
}
