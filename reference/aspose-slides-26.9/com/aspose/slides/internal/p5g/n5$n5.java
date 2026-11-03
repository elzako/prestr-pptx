package com.aspose.slides.internal.p5g;

import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class n5$n5 extends n5$u3 {
   WritableRaster n5;
   byte[] l6;
   int k5;
   int u3;
   byte[] a6;
   int u9;
   int h0;

   public n5$n5(WritableRaster var1, ColorModel var2, AffineTransform var3, int var4) {
      super(var2, var3, var1.getWidth(), var1.getHeight(), var4);
      this.n5 = var1;
      this.l6 = RasterStorage.bytes(var1);
      this.u3 = RasterStorage.scanlineStride(var1);
      this.k5 = RasterStorage.offset(var1);
   }

   @Override
   public WritableRaster n5(int var1, int var2) {
      WritableRaster var3 = n5(this.n5, var1, var2);
      WritableRaster var4 = (WritableRaster)var3;
      this.a6 = RasterStorage.bytes(var4);
      this.h0 = RasterStorage.scanlineStride(var4);
      this.u9 = RasterStorage.offset(var4);
      return var3;
   }

   @Override
   public void dispose() {
      n5((Raster)this.t9);
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
      byte[] var17 = this.l6;
      byte[] var18 = this.a6;
      int var19 = this.u9;
      int var20 = this.u3;
      int var21 = this.k5;
      int var22 = this.h0;
      boolean var23 = var9 == 1 && var10 == 0 && var11 == 0 && var12 == 0;
      int var24 = var1;
      int var25 = var2;
      int var26 = var3;
      int var27 = var4;
      if (var23) {
         var22 -= var5;
      }

      for (int var28 = 0; var28 < var6; var28++) {
         if (var23) {
            int var37 = var21 + var25 * var20 + var7;
            var1 = var7 - var24;
            var19 += var5;
            if (var7 >= 32) {
               int var38 = var5;

               while (var38 > 0) {
                  int var31 = var38 < var1 ? var38 : var1;
                  System.arraycopy(var17, var37 - var1, var18, var19 - var38, var31);
                  var38 -= var31;
                  if ((var1 -= var31) == 0) {
                     var1 = var7;
                  }
               }
            } else {
               for (int var30 = var5; var30 > 0; var30--) {
                  var18[var19 - var30] = var17[var37 - var1];
                  if (--var1 == 0) {
                     var1 = var7;
                  }
               }
            }
         } else {
            var1 = var24;
            var2 = var25;
            var3 = var26;
            var4 = var27;

            for (int var29 = 0; var29 < var5; var29++) {
               var18[var19 + var29] = var17[var21 + var2 * var20 + var1];
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
         }

         if ((var26 += var14) < 0) {
            var26 &= Integer.MAX_VALUE;
            var24++;
         }

         if ((var24 += var13) >= var7) {
            var24 -= var7;
         }

         if ((var27 += var16) < 0) {
            var27 &= Integer.MAX_VALUE;
            var25++;
         }

         if ((var25 += var15) >= var8) {
            var25 -= var8;
         }

         var19 += var22;
      }
   }
}
