package com.aspose.slides.internal.u4k;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public final class s7 extends k5 {
   public s7(ColorModel var1, ColorModel var2, RenderingHints var3) {
      super(var1, var2, var3);
   }

   @Override
   public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
      Rectangle var4 = src.getBounds().intersection(dstIn.getBounds());
      Object var5 = this.n5.getDataElements(0, null);
      Object var6 = this.l6.getDataElements(0, null);
      int var7 = var4.x + var4.width;
      int var8 = var4.y + var4.height;
      if (this.u3) {
         for (int var9 = var4.x; var9 < var7; var9++) {
            for (int var10 = var4.y; var10 < var8; var10++) {
               int var11 = this.n5.getRGB(src.getDataElements(var9, var10, var5));
               int var12 = var11 >> 24 & 0xFF;
               if (var12 >= 128) {
                  int var13 = this.l6.getRGB(dstIn.getDataElements(var9, var10, var6));
                  int var14 = var13 >> 24 & 0xFF;
                  int var15;
                  if (var14 > 25) {
                     var15 = var11 | ~var13 | 0xFF000000;
                  } else {
                     int var16 = (var11 & 0xFF0000) >> 16;
                     var16 += (var11 & 0xFF00) >> 8;
                     var16 += var11 & 0xFF;
                     var16 /= 3;
                     int var17 = var16;
                     var15 = 16777215 | var17 << 24;
                  }

                  dstOut.setDataElements(var9, var10, this.l6.getDataElements(var15 | 0xFF000000, var6));
               }
            }
         }
      } else {
         for (int var30 = var4.x; var30 < var7; var30++) {
            for (int var31 = var4.y; var31 < var8; var31++) {
               int var32 = this.n5.getRGB(src.getDataElements(var30, var31, var5));
               int var33 = var32 >> 24 & 0xFF;
               if (var33 != 0) {
                  int var34 = this.l6.getRGB(dstIn.getDataElements(var30, var31, var6));
                  int var35 = var34 >> 24 & 0xFF;
                  if (var35 > 25) {
                     int var36 = var32 | ~var34;
                     float var44 = var33 / 255.0F;
                     float var46 = ((var36 & 0xFF0000) >> 16) / 255.0F * var44;
                     float var18 = ((var36 & 0xFF00) >> 8) / 255.0F * var44;
                     float var19 = (var36 & 0xFF) / 255.0F * var44;
                     float var20 = var35 / 255.0F;
                     float var21 = ((var34 & 0xFF0000) >> 16) / 255.0F * var20;
                     float var22 = ((var34 & 0xFF00) >> 8) / 255.0F * var20;
                     float var23 = (var34 & 0xFF) / 255.0F * var20;
                     float var24 = 1.0F - var44;
                     float var25 = var44 + var20 * var24;
                     float var26 = (var46 + var21 * var24) / var25;
                     float var27 = (var18 + var22 * var24) / var25;
                     float var28 = (var19 + var23 * var24) / var25;
                     int var29 = (Math.min(255, Math.round(var25 * 255.0F)) << 24)
                        + (Math.min(255, Math.round(var26 * 255.0F)) << 16)
                        + (Math.min(255, Math.round(var27 * 255.0F)) << 8)
                        + Math.min(255, Math.round(var28 * 255.0F));
                     dstOut.setDataElements(var30, var31, this.l6.getDataElements(var29, var6));
                  } else {
                     int var37 = (var32 & 0xFF0000) >> 16;
                     var37 += (var32 & 0xFF00) >> 8;
                     var37 += var32 & 0xFF;
                     var37 /= 3;
                     int var45 = var37 * var33 / 255;
                     int var47 = 16777215 | var45 << 24;
                     dstOut.setDataElements(var30, var31, this.l6.getDataElements(var47, var6));
                  }
               }
            }
         }
      }
   }
}
