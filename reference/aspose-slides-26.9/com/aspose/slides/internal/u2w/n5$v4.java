package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$v4 extends com.aspose.slides.internal.d3c.a6 {
   private final com.aspose.slides.internal.h9s.l6 a6;

   public n5$v4(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.f2i.n5 var5, com.aspose.slides.internal.h9s.l6 var6) {
      super(var1, var2, var3, var4.n3(), var5);
      this.a6 = var6;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      boolean var8 = false;
      short var9 = 255;
      int[] var10 = this.u3;

      for (int var11 = 0; var11 < var6; var11++) {
         int[] var12 = new int[]{var4};
         byte[] var13 = this.a6.n5(var3, var12);
         var4 = var12[0];
         byte var14 = var13[0];
         byte var15 = var13[1];
         byte var16 = var13[2];
         int var17 = var10[(var14 & 255) + 0] + var10[(var16 & 255) + 768] >> 16;
         int var18 = var10[(var14 & 255) + 256] + var10[(var15 & 255) + 1024] + var10[(var16 & 255) + 1280] >> 16;
         int var19 = var10[(var14 & 255) + 512] + var10[(var15 & 255) + 1536] >> 16;
         if (var17 < 0) {
            var17 = 0;
         } else if (var17 > 255) {
            var17 = 255;
         }

         if (var18 < 0) {
            var18 = 0;
         } else if (var18 > 255) {
            var18 = 255;
         }

         if (var19 < 0) {
            var19 = 0;
         } else if (var19 > 255) {
            var19 = 255;
         }

         var17 <<= 16;
         var18 <<= 8;
         int var20 = 0xFF000000 | var17 | var18 | var19;
         var7[var2[0]++] = var20;
      }
   }

   @Override
   protected void n5() {
      this.a6.l6();
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      this.a6.n5(var1, var2, var3, var4);
   }
}
