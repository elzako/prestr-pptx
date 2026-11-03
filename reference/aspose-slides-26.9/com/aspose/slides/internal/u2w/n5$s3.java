package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$s3 extends n5$y4 {
   protected final int n5;

   public n5$s3(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         byte var9 = var3[var4 + 3];
         if ((var9 & 255) == 0) {
            var7[var2[0]++] = 0;
         } else {
            double var10 = 255.0 / (var9 & 0xFF);
            int var12 = com.aspose.slides.internal.v6g.k5.u3((var3[var4] & 0xFF) * var10 + 0.5, 14);
            int var13 = com.aspose.slides.internal.v6g.k5.u3((var3[var4 + 1] & 0xFF) * var10 + 0.5, 14);
            int var14 = com.aspose.slides.internal.v6g.k5.u3((var3[var4 + 2] & 0xFF) * var10 + 0.5, 14);
            if (var12 > 255) {
               var12 = 255;
            }

            if (var13 > 255) {
               var13 = 255;
            }

            if (var14 > 255) {
               var14 = 255;
            }

            int var15 = (var9 & 255) << 24;
            int var16 = var12 << 16;
            int var17 = var13 << 8;
            int var18 = var14;
            int var19 = var15 | var16 | var17 | var18;
            var7[var2[0]++] = var19;
         }

         var4 += this.n5;
      }
   }
}
