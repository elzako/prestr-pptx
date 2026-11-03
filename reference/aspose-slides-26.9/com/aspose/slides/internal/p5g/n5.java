package com.aspose.slides.internal.p5g;

import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;

public class n5 {
   public static PaintContext n5(BufferedImage var0, AffineTransform var1, RenderingHints var2, Rectangle var3) {
      WritableRaster var4 = var0.getRaster();
      ColorModel var5 = var0.getColorModel();
      int var6 = var3.width;
      Object var7 = var2.get(RenderingHints.KEY_INTERPOLATION);
      boolean var8 = var7 == null
         ? var2.get(RenderingHints.KEY_RENDERING) == RenderingHints.VALUE_RENDER_QUALITY
         : var7 != RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      // RGB without alpha and premultiplied ARGB need ColorModel-aware interpolation.
      if (RasterStorage.isInt(var4) && (!var8 || (l6(var5) && var5.hasAlpha() && !var5.isAlphaPremultiplied()))) {
         WritableRaster var10 = var4;
         if (var10.getNumDataElements() == 1 && RasterStorage.pixelStride(var10) == 1) {
            return new n5$k5(var10, var5, var1, var6, var8);
         }
      } else if (RasterStorage.isByte(var4)) {
         WritableRaster var9 = var4;
         if (var9.getNumDataElements() == 1 && RasterStorage.pixelStride(var9) == 1) {
            if (!var8) {
               return new n5$n5(var9, var5, var1, var6);
            }

            if (n5(var5)) {
               return new n5$l6(var9, var5, var1, var6);
            }
         }
      }

      return new k5$n5(var4, var5, var1, var6, var8);
   }

   public static boolean n5(ColorModel var0) {
      if (var0 instanceof IndexColorModel) {
         IndexColorModel var1 = (IndexColorModel)var0;
         if (var1.getMapSize() <= 256) {
            return true;
         }
      }

      return false;
   }

   public static boolean l6(ColorModel var0) {
      if (!(var0 instanceof DirectColorModel)) {
         return false;
      }

      DirectColorModel var1 = (DirectColorModel)var0;
      return n5(var1.getAlphaMask(), true) && n5(var1.getRedMask(), false) && n5(var1.getGreenMask(), false) && n5(var1.getBlueMask(), false);
   }

   public static boolean n5(int var0, boolean var1) {
      return var1 && var0 == 0 ? true : var0 == 255 || var0 == 65280 || var0 == 16711680 || var0 == -16777216;
   }
}
