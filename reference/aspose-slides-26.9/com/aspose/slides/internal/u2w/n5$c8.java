package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$c8 extends n5$y4 {
   private final com.aspose.slides.internal.h9s.l6 n5;
   private e2 l6 = null;

   public n5$c8(e2 var1, int var2, int var3, int var4, y2 var5, com.aspose.slides.internal.h9s.l6 var6) {
      super(var2, var3, var4, var5.n3());
      this.n5 = var6;
      this.l6 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      if (this.l6 != null) {
         for (int var8 = 0; var8 < var6; var8++) {
            int[] var9 = new int[]{var4};
            byte[] var10 = this.n5.n5(var3, var9);
            var4 = var9[0];
            int var11 = (var10[0] & 255) << 24;
            int var12 = (var10[1] & 255) << 16;
            int var13 = (var10[2] & 255) << 8;
            int var14 = var10[3] & 255;
            int var15 = var11 | var12 | var13 | var14;
            var7[var2[0]++] = var15;
         }
      } else {
         for (int var19 = 0; var19 < var6; var19++) {
            int[] var20 = new int[]{var4};
            byte[] var21 = this.n5.n5(var3, var20);
            var4 = var20[0];
            byte var22 = var21[0];
            byte var23 = var21[1];
            byte var24 = var21[2];
            byte var25 = var21[3];
            int var26 = (255 - (var22 & 255)) * (255 - (var25 & 255)) / 255;
            int var16 = (255 - (var23 & 255)) * (255 - (var25 & 255)) / 255;
            int var17 = (255 - (var24 & 255)) * (255 - (var25 & 255)) / 255;
            int var18 = 0xFF000000 | var26 << 16 | var16 << 8 | var17;
            var7[var2[0]++] = var18;
         }
      }
   }

   @Override
   protected void n5() {
      this.n5.l6();
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      this.n5.n5(var1, var2, var3, var4);
   }
}
