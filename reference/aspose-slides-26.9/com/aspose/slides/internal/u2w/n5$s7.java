package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$s7 extends n5$t2 {
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private e2 u9 = null;

   public n5$s7(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var1, var2, var3, var4, var5.n3());
      this.u9 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.l6 & 255;
      int var9 = this.k5 & 255;
      int var10 = this.u3 & 255;
      int var11 = this.a6 & 255;
      if (this.u9 != null) {
         for (int var12 = 0; var12 < var6; var12++) {
            var8 = (byte)((var3[var4] & 255) + var8) & 255;
            var9 = (byte)((var3[var4 + 1] & 255) + var9) & 255;
            var10 = (byte)((var3[var4 + 2] & 255) + var10) & 255;
            var11 = (byte)((var3[var4 + 3] & 255) + var11) & 255;
            int var13 = var8 << 24;
            int var14 = var9 << 16;
            int var15 = var10 << 8;
            int var16 = var13 | var14 | var15 | var11;
            var7[var2[0]++] = var16;
            var4 += this.n5;
         }
      } else {
         for (int var17 = 0; var17 < var6; var17++) {
            var8 = (byte)((var3[var4] & 255) + var8) & 255;
            var9 = (byte)((var3[var4 + 1] & 255) + var9) & 255;
            var10 = (byte)((var3[var4 + 2] & 255) + var10) & 255;
            var11 = (byte)((var3[var4 + 3] & 255) + var11) & 255;
            int var18 = (255 - var8) * (255 - var11) / 255;
            int var19 = (255 - var9) * (255 - var11) / 255;
            int var20 = (255 - var10) * (255 - var11) / 255;
            int var21 = 0xFF000000 | var18 << 16 | var19 << 8 | var20;
            var7[var2[0]++] = var21;
            var4 += this.n5;
         }
      }

      this.l6 = (byte)var8;
      this.k5 = (byte)var9;
      this.u3 = (byte)var10;
      this.a6 = (byte)var11;
   }

   @Override
   protected void n5() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.l6 & 255;
      int var6 = this.k5 & 255;
      int var7 = this.u3 & 255;
      int var8 = this.a6 & 255;

      for (int var9 = 0; var9 < var4; var9++) {
         var5 = (byte)((var1[var2] & 255) + var5) & 255;
         var6 = (byte)((var1[var2 + 1] & 255) + var6) & 255;
         var7 = (byte)((var1[var2 + 2] & 255) + var7) & 255;
         var8 = (byte)((var1[var2 + 3] & 255) + var8) & 255;
         var2 += this.n5;
      }

      this.l6 = (byte)var5;
      this.k5 = (byte)var6;
      this.u3 = (byte)var7;
      this.a6 = (byte)var8;
   }
}
