package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

class n5$h0 extends n5$u9 {
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private byte u9;
   private e2 h0 = null;

   public n5$h0(e2 var1, int var2, int var3, int var4, y2 var5) {
      super(var1, var2, var3, var4, var5.n3());
      this.h0 = var1;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.l6 & 255;
      int var9 = this.k5 & 255;
      int var10 = this.u3 & 255;
      int var11 = this.a6 & 255;
      if (this.h0 != null) {
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
         int var18 = this.u9 & 255;

         for (int var19 = 0; var19 < var6; var19++) {
            var8 = (byte)((var3[var4] & 255) + var8) & 255;
            var9 = (byte)((var3[var4 + 1] & 255) + var9) & 255;
            var10 = (byte)((var3[var4 + 2] & 255) + var10) & 255;
            var11 = (byte)((var3[var4 + 3] & 255) + var11) & 255;
            var18 = (byte)((var3[var4 + 4] & 255) + var18) & 255;
            if (var18 == 0) {
               var7[var2[0]++] = 0;
            } else {
               int var20 = (255 - var8) * (255 - var11) / var18;
               int var21 = (255 - var9) * (255 - var11) / var18;
               int var22 = (255 - var10) * (255 - var11) / var18;
               if (var20 > 255) {
                  var20 = 255;
               }

               if (var21 > 255) {
                  var21 = 255;
               }

               if (var22 > 255) {
                  var22 = 255;
               }

               int var17 = var18 << 24 | var20 << 16 | var21 << 8 | var22;
               var7[var2[0]++] = var17;
            }

            var4 += this.n5;
         }

         this.u9 = (byte)var18;
      }

      this.l6 = (byte)var8;
      this.k5 = (byte)var9;
      this.u3 = (byte)var10;
      this.a6 = (byte)var11;
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

   @Override
   protected void n5() {
      this.a6 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.u9 = 0;
   }
}
