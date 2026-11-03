package com.aspose.slides.internal.u4k;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public final class u9 extends k5 {
   private int u9;

   public u9(int var1, ColorModel var2, ColorModel var3, RenderingHints var4) {
      super(var2, var3, var4);
      this.u9 = var1;
   }

   @Override
   public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
      Rectangle var4 = src.getBounds().intersection(dstIn.getBounds());
      Object var5 = this.n5.getDataElements(0, null);
      Object var6 = this.l6.getDataElements(0, null);
      int var7 = var4.x + var4.width;
      int var8 = var4.y + var4.height;

      for (int var9 = var4.x; var9 < var7; var9++) {
         for (int var10 = var4.y; var10 < var8; var10++) {
            int var11 = this.n5.getRGB(src.getDataElements(var9, var10, var5));
            int var12 = var11 >> 24 & 0xFF;
            if (var12 != 0) {
               int var13 = this.l6.getRGB(dstIn.getDataElements(var9, var10, var6));
               int var14 = this.u9;
               int var15 = var13 >> 24 & 0xFF;
               float var16 = var12 / 255.0F;
               float var17 = ((var14 & 0xFF0000) >> 16) / 255.0F * var16;
               float var18 = ((var14 & 0xFF00) >> 8) / 255.0F * var16;
               float var19 = (var14 & 0xFF) / 255.0F * var16;
               float var20 = var15 / 255.0F;
               float var21 = ((var13 & 0xFF0000) >> 16) / 255.0F * var20;
               float var22 = ((var13 & 0xFF00) >> 8) / 255.0F * var20;
               float var23 = (var13 & 0xFF) / 255.0F * var20;
               float var24 = 1.0F - var16;
               float var25 = var16 + var20 * var24;
               float var26 = (var17 + var21 * var24) / var25;
               float var27 = (var18 + var22 * var24) / var25;
               float var28 = (var19 + var23 * var24) / var25;
               int var29 = (Math.min(255, Math.round(var25 * 255.0F)) << 24)
                  + (Math.min(255, Math.round(var26 * 255.0F)) << 16)
                  + (Math.min(255, Math.round(var27 * 255.0F)) << 8)
                  + Math.min(255, Math.round(var28 * 255.0F));
               dstOut.setDataElements(var9, var10, this.l6.getDataElements(var29, var6));
            }
         }
      }
   }
}
