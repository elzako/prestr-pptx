package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$x8 extends n5$y4 {
   private final int n5;
   private e2 l6 = null;

   public n5$x8(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.n5 = var2 / 8;
      this.l6 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      if (this.l6 != null) {
         throw new NotSupportedException("Conversion CMYKA to RGBA using ICC color profile is not supported at the moment.");
      }

      for (int var8 = 0; var8 < var6; var8++) {
         int var9 = var3[var4] & 255;
         int var10 = var3[var4 + 1] & 255;
         int var11 = var3[var4 + 2] & 255;
         int var12 = var3[var4 + 3] & 255;
         int var13 = var3[var4 + 4] & 255;
         int var14 = (255 - var9) * (255 - var12) / 255;
         int var15 = (255 - var10) * (255 - var12) / 255;
         int var16 = (255 - var11) * (255 - var12) / 255;
         int var17 = var13 << 24 | var14 << 16 | var15 << 8 | var16;
         var7[var2[0]++] = var17;
         var4 += this.n5;
      }
   }
}
