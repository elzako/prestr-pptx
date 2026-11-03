package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$n3 extends n5$y4 {
   private final int n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private byte u9;
   private e2 h0 = null;

   public n5$n3(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var2, var3, var4, var5.n3());
      this.h0 = var1;
      this.n5 = var2 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.l6 & 255;
      int var9 = this.k5 & 255;
      int var10 = this.u3 & 255;
      int var11 = this.a6 & 255;
      int var12 = this.u9 & 255;
      if (this.h0 != null) {
         throw new NotSupportedException("Conversion CMYKA to RGBA using ICC color profile is not supported at the moment.");
      }

      for (int var13 = 0; var13 < var6; var13++) {
         var8 = (byte)((var3[var4] & 255) + var8) & 255;
         var9 = (byte)((var3[var4 + 1] & 255) + var9) & 255;
         var10 = (byte)((var3[var4 + 2] & 255) + var10) & 255;
         var11 = (byte)((var3[var4 + 3] & 255) + var11) & 255;
         var12 = (byte)((var3[var4 + 4] & 255) + var12) & 255;
         int var14 = (255 - var8) * (255 - var11) / 255;
         int var15 = (255 - var9) * (255 - var11) / 255;
         int var16 = (255 - var10) * (255 - var11) / 255;
         int var17 = var12 << 24 | var14 << 16 | var15 << 8 | var16;
         var7[var2[0]++] = var17;
         var4 += this.n5;
      }

      this.l6 = (byte)var8;
      this.k5 = (byte)var9;
      this.u3 = (byte)var10;
      this.a6 = (byte)var11;
      this.u9 = (byte)var12;
   }

   @Override
   protected void n5() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.l6 & 255;
      int var6 = this.k5 & 255;
      int var7 = this.u3 & 255;
      int var8 = this.a6 & 255;
      int var9 = this.u9 & 255;

      for (int var10 = 0; var10 < var4; var10++) {
         var5 = (byte)((var1[var2] & 255) + var5) & 255;
         var6 = (byte)((var1[var2 + 1] & 255) + var6) & 255;
         var7 = (byte)((var1[var2 + 2] & 255) + var7) & 255;
         var8 = (byte)((var1[var2 + 3] & 255) + var8) & 255;
         var9 = (byte)((var1[var2 + 4] & 255) + var9) & 255;
         var2 += this.n5;
      }

      this.l6 = (byte)var5;
      this.k5 = (byte)var6;
      this.u3 = (byte)var7;
      this.a6 = (byte)var8;
      this.u9 = (byte)var9;
   }
}
