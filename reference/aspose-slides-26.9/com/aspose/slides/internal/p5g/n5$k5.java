package com.aspose.slides.internal.p5g;

import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

class n5$k5 extends n5$u3 {
   WritableRaster n5;
   int[] l6;
   int k5;
   int u3;
   int[] a6;
   int u9;
   int h0;
   boolean c8;

   public n5$k5(WritableRaster var1, ColorModel var2, AffineTransform var3, int var4, boolean var5) {
      super(var2, var3, var1.getWidth(), var1.getHeight(), var4);
      this.n5 = var1;
      this.l6 = RasterStorage.ints(var1);
      this.u3 = RasterStorage.scanlineStride(var1);
      this.k5 = RasterStorage.offset(var1);
      this.c8 = var5;
   }

   @Override
   public WritableRaster n5(int var1, int var2) {
      WritableRaster var3 = n5(this.x8, this.n5, var1, var2);
      WritableRaster var4 = (WritableRaster)var3;
      this.a6 = RasterStorage.ints(var4);
      this.h0 = RasterStorage.scanlineStride(var4);
      this.u9 = RasterStorage.offset(var4);
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
      int[] var17 = this.l6;
      int[] var18 = this.a6;
      int var19 = this.u9;
      int var20 = this.u3;
      int var21 = this.k5;
      int var22 = this.h0;
      boolean var23 = this.c8;
      boolean var24 = var9 == 1 && var10 == 0 && var11 == 0 && var12 == 0 && !var23;
      int var25 = var1;
      int var26 = var2;
      int var27 = var3;
      int var28 = var4;
      if (var24) {
         var22 -= var5;
      }

      int[] var29 = var23 ? new int[4] : null;

      for (int var30 = 0; var30 < var6; var30++) {
         if (var24) {
            int var39 = var21 + var26 * var20 + var7;
            var1 = var7 - var25;
            var19 += var5;
            if (var7 >= 32) {
               int var41 = var5;

               while (var41 > 0) {
                  int var42 = var41 < var1 ? var41 : var1;
                  System.arraycopy(var17, var39 - var1, var18, var19 - var41, var42);
                  var41 -= var42;
                  if ((var1 -= var42) == 0) {
                     var1 = var7;
                  }
               }
            } else {
               for (int var40 = var5; var40 > 0; var40--) {
                  var18[var19 - var40] = var17[var39 - var1];
                  if (--var1 == 0) {
                     var1 = var7;
                  }
               }
            }
         } else {
            var1 = var25;
            var2 = var26;
            var3 = var27;
            var4 = var28;

            for (int var31 = 0; var31 < var5; var31++) {
               if (var23) {
                  int var32;
                  if ((var32 = var1 + 1) >= var7) {
                     var32 = 0;
                  }

                  int var33;
                  if ((var33 = var2 + 1) >= var8) {
                     var33 = 0;
                  }

                  var29[0] = var17[var21 + var2 * var20 + var1];
                  var29[1] = var17[var21 + var2 * var20 + var32];
                  var29[2] = var17[var21 + var33 * var20 + var1];
                  var29[3] = var17[var21 + var33 * var20 + var32];
                  var18[var19 + var31] = com.aspose.slides.internal.p5g.k5.n5(var29, var3, var4);
               } else {
                  var18[var19 + var31] = var17[var21 + var2 * var20 + var1];
               }

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

         if ((var27 += var14) < 0) {
            var27 &= Integer.MAX_VALUE;
            var25++;
         }

         if ((var25 += var13) >= var7) {
            var25 -= var7;
         }

         if ((var28 += var16) < 0) {
            var28 &= Integer.MAX_VALUE;
            var26++;
         }

         if ((var26 += var15) >= var8) {
            var26 -= var8;
         }

         var19 += var22;
      }
   }
}
