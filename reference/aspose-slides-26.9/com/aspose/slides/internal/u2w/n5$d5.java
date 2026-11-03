package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$d5 extends n5$y4 {
   private final double n5;
   private final com.aspose.slides.internal.h9s.l6 l6;

   public n5$d5(int var1, int var2, int var3, y2 var4, com.aspose.slides.internal.h9s.l6 var5) {
      super(var1, var2, var3, var4.n3());
      this.l6 = var5;
      this.n5 = (1 << (var5.n5()[3] & 65535)) - 1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         int[] var9 = new int[]{var4};
         byte[] var10 = this.l6.n5(var3, var9);
         var4 = var9[0];
         byte var11 = var10[3];
         if ((var11 & 255) == 0) {
            var7[var2[0]++] = 0;
         } else {
            float var12 = 255.0F / (var11 & 0xFF);
            int var13 = com.aspose.slides.internal.v6g.k5.u3((var10[0] & 0xFF) * var12 + 0.5F, 13);
            int var14 = com.aspose.slides.internal.v6g.k5.u3((var10[1] & 0xFF) * var12 + 0.5F, 13);
            int var15 = com.aspose.slides.internal.v6g.k5.u3((var10[2] & 0xFF) * var12 + 0.5F, 13);
            if (var13 > 255) {
               var13 = 255;
            }

            if (var14 > 255) {
               var14 = 255;
            }

            if (var15 > 255) {
               var15 = 255;
            }

            if ((var11 & 255) > 255) {
               var11 = -1;
            }

            int var16 = (var11 & 255) << 24;
            int var17 = var13 << 16;
            int var18 = var14 << 8;
            int var19 = var15;
            int var20 = var16 | var17 | var18 | var19;
            var7[var2[0]++] = var20;
         }
      }
   }

   @Override
   protected void n5() {
      this.l6.l6();
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      this.l6.n5(var1, var2, var3, var4);
   }
}
