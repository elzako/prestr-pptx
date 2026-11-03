package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$u9 extends n5$y4 {
   protected final int n5;
   private e2 l6 = null;

   public n5$u9(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.n5 = var2 / 8;
      this.l6 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      if (this.l6 != null) {
         for (int var8 = 0; var8 < var6; var8++) {
            int var9 = var3[var4 + 4] & 255;
            if (var9 == 0) {
               var7[var2[0]++] = 255;
            } else {
               double var10 = 255.0 / var9;
               int var12 = (var3[var4] & 255) << 24;
               int var13 = (var3[var4 + 1] & 255) << 16;
               int var14 = (var3[var4 + 2] & 255) << 8;
               int var15 = var3[var4 + 3] & 255;
               int var16 = var12 | var13 | var14 | var15;
               var7[var2[0]++] = var16;
            }

            var4 += this.n5;
         }
      } else {
         for (int var20 = 0; var20 < var6; var20++) {
            int var21 = var3[var4 + 4] & 255;
            if (var21 == 0) {
               var7[var2[0]++] = 0;
            } else {
               int var17 = var3[var4] & 255;
               int var18 = var3[var4 + 1] & 255;
               int var22 = var3[var4 + 2] & 255;
               int var23 = var3[var4 + 3] & 255;
               int var24 = (255 - var17) * (255 - var23) / var21;
               int var25 = (255 - var18) * (255 - var23) / var21;
               int var26 = (255 - var22) * (255 - var23) / var21;
               if (var24 > 255) {
                  var24 = 255;
               }

               if (var25 > 255) {
                  var25 = 255;
               }

               if (var26 > 255) {
                  var26 = 255;
               }

               int var19 = var21 << 24 | var24 << 16 | var25 << 8 | var26;
               var7[var2[0]++] = var19;
            }

            var4 += this.n5;
         }
      }
   }
}
