package com.aspose.slides.internal.p5g;

import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

class k5$n5 extends k5 {
   WritableRaster n5;
   boolean l6;

   public k5$n5(WritableRaster var1, ColorModel var2, AffineTransform var3, int var4, boolean var5) {
      super(var2, var3, var1.getWidth(), var1.getHeight(), var4);
      this.n5 = var1;
      this.l6 = var5;
   }

   @Override
   public WritableRaster n5(int var1, int var2) {
      return n5(this.x8, this.n5, var1, var2);
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
      Object var17 = null;
      int var18 = var1;
      int var19 = var2;
      int var20 = var3;
      int var21 = var4;
      WritableRaster var22 = this.n5;
      WritableRaster var23 = this.t9;
      int[] var24 = this.l6 ? new int[4] : null;

      for (int var25 = 0; var25 < var6; var25++) {
         var1 = var18;
         var2 = var19;
         var3 = var20;
         var4 = var21;

         for (int var26 = 0; var26 < var5; var26++) {
            var17 = var22.getDataElements(var1, var2, var17);
            if (this.l6) {
               int var27;
               if ((var27 = var1 + 1) >= var7) {
                  var27 = 0;
               }

               int var28;
               if ((var28 = var2 + 1) >= var8) {
                  var28 = 0;
               }

               var24[0] = this.x8.getRGB(var17);
               var17 = var22.getDataElements(var27, var2, var17);
               var24[1] = this.x8.getRGB(var17);
               var17 = var22.getDataElements(var1, var28, var17);
               var24[2] = this.x8.getRGB(var17);
               var17 = var22.getDataElements(var27, var28, var17);
               var24[3] = this.x8.getRGB(var17);
               int var29 = com.aspose.slides.internal.p5g.k5.n5(var24, var3, var4);
               var17 = this.x8.getDataElements(var29, var17);
            }

            var23.setDataElements(var26, var25, var17);
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

         if ((var20 += var14) < 0) {
            var20 &= Integer.MAX_VALUE;
            var18++;
         }

         if ((var18 += var13) >= var7) {
            var18 -= var7;
         }

         if ((var21 += var16) < 0) {
            var21 &= Integer.MAX_VALUE;
            var19++;
         }

         if ((var19 += var15) >= var8) {
            var19 -= var8;
         }
      }
   }
}
