package com.aspose.slides.internal.g0t;

import java.awt.CompositeContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.HashMap;

class n5$n5 implements CompositeContext {
   private CompositeContext n5;
   private ColorModel l6;
   private ColorModel k5;
   private RenderingHints u3;

   public n5$n5(CompositeContext var1, ColorModel var2, ColorModel var3, RenderingHints var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public void dispose() {
   }

   @Override
   public void compose(Raster srcOrigin, Raster dstInOrigin, WritableRaster dstOut) {
      WritableRaster var4 = srcOrigin.createCompatibleWritableRaster();
      WritableRaster var5 = dstInOrigin.createCompatibleWritableRaster();
      Rectangle var6 = var4.getBounds().intersection(var5.getBounds());
      Object var7 = this.l6.getDataElements(0, null);
      Object var8 = this.k5.getDataElements(0, null);
      int var9 = var6.x + var6.width;
      int var10 = var6.y + var6.height;
      int var11 = var9 - var6.x;
      int var12 = var10 - var6.y;
      HashMap var13 = new HashMap();

      for (int var14 = var6.x; var14 < var9; var14++) {
         for (int var15 = var6.y; var15 < var10; var15++) {
            int var16 = this.l6.getRGB(srcOrigin.getDataElements(var14, var15, var7));
            int var17 = this.k5.getRGB(dstInOrigin.getDataElements(var14, var15, var8));
            int var18 = var16 >> 24 & 0xFF;
            int var19 = var17 >> 24 & 0xFF;
            if (var18 == 255) {
               var13.put(var14 + var15 * var11, true);
            } else {
               var16 = n5$l6.n5().n5(var16);
               var17 = n5$l6.n5().n5(var17);
            }

            var4.setDataElements(var14, var15, this.l6.getDataElements(var16, var7));
            var5.setDataElements(var14, var15, this.k5.getDataElements(var17, var8));
         }
      }

      this.n5.compose(var4, var5, dstOut);
      if (var13.size() != var11 * var12) {
         for (int var20 = var6.x; var20 < var9; var20++) {
            for (int var21 = var6.y; var21 < var10; var21++) {
               if (!var13.containsKey(var20 + var21 * var11)) {
                  int var22 = this.k5.getRGB(dstOut.getDataElements(var20, var21, var8));
                  var22 = n5$l6.l6().n5(var22);
                  dstOut.setDataElements(var20, var21, this.k5.getDataElements(var22, var8));
               }
            }
         }
      }
   }
}
