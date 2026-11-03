package com.aspose.slides.internal.p5g;

import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;

class n5$l6 extends n5$u3 {
   WritableRaster n5;
   int[] l6 = new int[256];
   byte[] k5;
   int u3;
   int a6;
   int[] u9;
   int h0;
   int c8;

   public n5$l6(WritableRaster var1, ColorModel var2, AffineTransform var3, int var4) {
      super(var2.getTransparency() == 1 ? t2 : s7, var3, var1.getWidth(), var1.getHeight(), var4);
      ((IndexColorModel)var2).getRGBs(this.l6);
      this.n5 = var1;
      this.k5 = RasterStorage.bytes(var1);
      this.a6 = RasterStorage.scanlineStride(var1);
      this.u3 = RasterStorage.offset(var1);
   }

   @Override
   public WritableRaster n5(int var1, int var2) {
      WritableRaster var3 = n5(this.x8, null, var1, var2);
      WritableRaster var4 = (WritableRaster)var3;
      this.u9 = RasterStorage.ints(var4);
      this.c8 = RasterStorage.scanlineStride(var4);
      this.h0 = RasterStorage.offset(var4);
      return var3;
   }

   @Override
   public void n5(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16
   ) {
      byte[] var17 = this.k5;
      int[] var18 = this.u9;
      int var19 = this.h0;
      int var20 = this.a6;
      int var21 = this.u3;
      int var22 = this.c8;
      int var23 = var1;
      int var24 = var2;
      int var25 = var3;
      int var26 = var4;
      int[] var27 = new int[4];

      for (int var28 = 0; var28 < var6; var28++) {
         var1 = var23;
         var2 = var24;
         var3 = var25;
         var4 = var26;

         for (int var29 = 0; var29 < var5; var29++) {
            int var30;
            if ((var30 = var1 + 1) >= var7) {
               var30 = 0;
            }

            int var31;
            if ((var31 = var2 + 1) >= var8) {
               var31 = 0;
            }

            var27[0] = this.l6[0xFF & var17[var21 + var1 + var20 * var2]];
            var27[1] = this.l6[0xFF & var17[var21 + var30 + var20 * var2]];
            var27[2] = this.l6[0xFF & var17[var21 + var1 + var20 * var31]];
            var27[3] = this.l6[0xFF & var17[var21 + var30 + var20 * var31]];
            var18[var19 + var29] = com.aspose.slides.internal.p5g.k5.n5(var27, var3, var4);
            if ((var3 += var10) < 0) {
               var3 &= Integer.MAX_VALUE;
               var1++;
            }

            if ((var1 += var9) >= var7) {
               var1 -= var7;
            }

            if ((var4 += var12) < 0) {
               var4 &= Integer.MAX_VALUE;
               var2++;
            }

            if ((var2 += var11) >= var8) {
               var2 -= var8;
            }
         }

         if ((var25 += var14) < 0) {
            var25 &= Integer.MAX_VALUE;
            var23++;
         }

         if ((var23 += var13) >= var7) {
            var23 -= var7;
         }

         if ((var26 += var16) < 0) {
            var26 &= Integer.MAX_VALUE;
            var24++;
         }

         if ((var24 += var15) >= var8) {
            var24 -= var8;
         }

         var19 += var22;
      }
   }
}
