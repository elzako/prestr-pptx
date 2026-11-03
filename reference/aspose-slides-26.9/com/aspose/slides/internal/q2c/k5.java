package com.aspose.slides.internal.q2c;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.ImagingOpException;
import java.awt.image.Raster;
import java.awt.image.RasterFormatException;
import java.awt.image.RasterOp;
import java.awt.image.WritableRaster;
import java.util.Arrays;

public class k5 implements BufferedImageOp, RasterOp {
   private AffineTransform n5;
   private RenderingHints l6;

   public k5(AffineTransform var1, int var2) {
      this.n5 = var1;
      if (var1.getDeterminant() == 0.0) {
         throw new ImagingOpException(null);
      }

      switch (var2) {
         case 2:
            this.l6 = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            break;
         case 3:
            this.l6 = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            break;
         default:
            this.l6 = new RenderingHints(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      }
   }

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
      if (destCM != null) {
         return new BufferedImage(destCM, this.createCompatibleDestRaster(src.getRaster()), src.isAlphaPremultiplied(), null);
      } else {
         return src.getType() != 3 && src.getType() != 6 && src.getType() != 7
            ? new BufferedImage(src.getWidth(), src.getHeight(), 2)
            : new BufferedImage(src.getWidth(), src.getHeight(), src.getType());
      }
   }

   @Override
   public WritableRaster createCompatibleDestRaster(Raster src) {
      Rectangle2D var2 = this.getBounds2D(src);
      if (var2.getWidth() != 0.0 && var2.getHeight() != 0.0) {
         return src.createCompatibleWritableRaster((int)var2.getWidth(), (int)var2.getHeight());
      } else {
         throw new RasterFormatException("width or height is 0");
      }
   }

   @Override
   public final BufferedImage filter(BufferedImage src, BufferedImage dst) {
      if (dst == src) {
         throw new IllegalArgumentException("src image cannot be the same as the dst image");
      }

      if (dst == null) {
         dst = this.createCompatibleDestImage(src, null);
      }

      Graphics2D var3 = dst.createGraphics();
      var3.setRenderingHints(this.l6);
      var3.drawImage(src, this.n5, null);
      return dst;
   }

   @Override
   public final WritableRaster filter(Raster src, WritableRaster dst) {
      if (dst == src) {
         throw new IllegalArgumentException("src image cannot be the same as the dst image");
      }

      if (dst == null) {
         dst = this.createCompatibleDestRaster(src);
      }

      if (src.getNumBands() != dst.getNumBands()) {
         throw new IllegalArgumentException("src and dst must have same number of bands");
      }

      if (ColorModel.getRGBdefault().isCompatibleSampleModel(src.getSampleModel()) && ColorModel.getRGBdefault().isCompatibleSampleModel(dst.getSampleModel())) {
         WritableRaster var9 = Raster.createWritableRaster(src.getSampleModel(), src.getDataBuffer(), new Point(src.getMinX(), src.getMinY()));
         BufferedImage var10 = new BufferedImage(ColorModel.getRGBdefault(), var9, false, null);
         BufferedImage var12 = new BufferedImage(ColorModel.getRGBdefault(), dst, false, null);
         return this.filter(var10, var12).getRaster();
      }

      double[] var3 = new double[dst.getHeight() * dst.getWidth() * 2];
      double[] var4 = new double[dst.getHeight() * dst.getWidth() * 2];
      int var5 = 0;

      for (int var6 = 0; var6 < dst.getWidth(); var6++) {
         for (int var7 = 0; var7 < dst.getHeight(); var7++) {
            var3[var5++] = var6;
            var3[var5++] = var7;
         }
      }

      Rectangle var13 = src.getBounds();

      try {
         AffineTransform var14 = this.n5.createInverse();
         var14.transform(var3, 0, var4, 0, var3.length / 2);
      } catch (NoninvertibleTransformException var8) {
         throw new ImagingOpException(var8.getMessage());
      }

      if (this.l6.containsValue(RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR)) {
         this.n5(src, dst, var3, var4);
      } else if (this.l6.containsValue(RenderingHints.VALUE_INTERPOLATION_BILINEAR)) {
         this.l6(src, dst, var3, var4);
      } else {
         this.k5(src, dst, var3, var4);
      }

      return dst;
   }

   @Override
   public final Rectangle2D getBounds2D(BufferedImage src) {
      return this.getBounds2D(src.getRaster());
   }

   @Override
   public final Rectangle2D getBounds2D(Raster src) {
      return this.n5.createTransformedShape(src.getBounds()).getBounds2D();
   }

   @Override
   public final Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
      return this.n5.transform(srcPt, dstPt);
   }

   @Override
   public final RenderingHints getRenderingHints() {
      return this.l6;
   }

   private void n5(Raster var1, WritableRaster var2, double[] var3, double[] var4) {
      Rectangle var5 = var1.getBounds();

      for (int var6 = 0; var6 < var3.length; var6 += 2) {
         int var7 = (int)Math.round(var4[var6]) + var1.getMinX();
         int var8 = (int)Math.round(var4[var6 + 1]) + var1.getMinY();
         if (var5.contains(var7, var8)) {
            var2.setDataElements((int)var3[var6] + var2.getMinX(), (int)var3[var6 + 1] + var2.getMinY(), var1.getDataElements(var7, var8, null));
         }
      }
   }

   private void l6(Raster var1, WritableRaster var2, double[] var3, double[] var4) {
      Rectangle var5 = var1.getBounds();
      Object var6 = null;
      Object var7 = null;
      Object var8 = null;
      Object var9 = null;
      double[] var10 = new double[var1.getNumBands()];

      for (int var11 = 0; var11 < var3.length; var11 += 2) {
         int var12 = (int)Math.round(var4[var11]) + var1.getMinX();
         int var13 = (int)Math.round(var4[var11 + 1]) + var1.getMinY();
         if (var5.contains(var12, var13)) {
            if (!(var4[var11] >= var1.getWidth() - 1) && !(var4[var11 + 1] >= var1.getHeight() - 1)) {
               int var14 = (int)Math.floor(var4[var11] + var1.getMinX());
               int var15 = (int)Math.floor(var4[var11 + 1] + var1.getMinY());
               double var16 = var4[var11] + var1.getMinX() - var14;
               double var18 = var4[var11 + 1] + var1.getMinY() - var15;
               if (var1.getTransferType() != 5 && var1.getTransferType() != 4) {
                  var6 = var1.getPixel(var14, var15, (int[])var6);
                  var7 = var1.getPixel(var14 + 1, var15, (int[])var7);
                  var8 = var1.getPixel(var14, var15 + 1, (int[])var8);
                  var9 = var1.getPixel(var14 + 1, var15 + 1, (int[])var9);
               } else {
                  var6 = var1.getPixel(var14, var15, (double[])var6);
                  var7 = var1.getPixel(var14 + 1, var15, (double[])var7);
                  var8 = var1.getPixel(var14, var15 + 1, (double[])var8);
                  var9 = var1.getPixel(var14 + 1, var15 + 1, (double[])var9);
               }

               for (int var20 = 0; var20 < var1.getNumBands(); var20++) {
                  double var21;
                  double var23;
                  double var25;
                  double var27;
                  if (var1.getTransferType() != 5 && var1.getTransferType() != 4) {
                     var21 = ((int[])var6)[var20];
                     var23 = ((int[])var7)[var20];
                     var25 = ((int[])var8)[var20];
                     var27 = ((int[])var9)[var20];
                  } else {
                     var21 = ((double[])var6)[var20];
                     var23 = ((double[])var7)[var20];
                     var25 = ((double[])var8)[var20];
                     var27 = ((double[])var9)[var20];
                  }

                  if (var21 == var23 && var21 == var25 && var21 == var27) {
                     var10[var20] = var21;
                  } else {
                     var10[var20] = (var21 * (1.0 - var16) + var23 * var16) * (1.0 - var18) + (var25 * (1.0 - var16) + var27 * var16) * var18;
                  }
               }

               var2.setPixel((int)var3[var11] + var2.getMinX(), (int)var3[var11 + 1] + var2.getMinY(), var10);
            } else {
               var2.setDataElements((int)var3[var11] + var2.getMinX(), (int)var3[var11 + 1] + var2.getMinY(), var1.getDataElements(var12, var13, null));
            }
         }
      }
   }

   private void k5(Raster var1, WritableRaster var2, double[] var3, double[] var4) {
      Rectangle var5 = var1.getBounds();
      double[] var6 = new double[var1.getNumBands()];
      Object var7 = null;

      for (int var8 = 0; var8 < var3.length; var8 += 2) {
         if (var5.contains((int)Math.round(var4[var8]) + var1.getMinX(), (int)Math.round(var4[var8 + 1]) + var1.getMinY())) {
            int var9 = (int)Math.floor(var4[var8] + var1.getMinX());
            int var10 = (int)Math.floor(var4[var8 + 1] + var1.getMinY());
            double var11 = var4[var8] + var1.getMinX() - var9;
            double var13 = var4[var8 + 1] + var1.getMinY() - var10;
            Arrays.fill(var6, 0.0);

            for (int var15 = -1; var15 < 3; var15++) {
               for (int var16 = -1; var16 < 3; var16++) {
                  double var17 = 0.0;
                  double var19 = 0.0;
                  double var21 = var15 - var11 + 2.0;
                  var17 += var21 * var21 * var21;
                  var21 = var15 - var11 + 1.0;
                  if (var21 > 0.0) {
                     var17 -= 4.0 * var21 * var21 * var21;
                  }

                  var21 = var15 - var11;
                  if (var21 > 0.0) {
                     var17 += 6.0 * var21 * var21 * var21;
                  }

                  var21 = var15 - var11 - 1.0;
                  if (var21 > 0.0) {
                     var17 -= 4.0 * var21 * var21 * var21;
                  }

                  var17 /= 6.0;
                  var21 = var13 - var16 + 2.0;
                  if (var21 > 0.0) {
                     var19 += var21 * var21 * var21;
                  }

                  var21 = var13 - var16 + 1.0;
                  if (var21 > 0.0) {
                     var19 -= 4.0 * var21 * var21 * var21;
                  }

                  var21 = var13 - var16;
                  if (var21 > 0.0) {
                     var19 += 6.0 * var21 * var21 * var21;
                  }

                  var21 = var13 - var16 - 1.0;
                  if (var21 > 0.0) {
                     var19 -= 4.0 * var21 * var21 * var21;
                  }

                  var19 /= 6.0;
                  int var23 = var9 + var15;
                  if (var23 >= var1.getMinX() + var1.getWidth()) {
                     var23 = var1.getMinX() + var1.getWidth() - 1;
                  } else if (var23 < var1.getMinX()) {
                     var23 = var1.getMinX();
                  }

                  int var24 = var10 + var16;
                  if (var24 >= var1.getMinY() + var1.getHeight()) {
                     var24 = var1.getMinY() + var1.getHeight() - 1;
                  } else if (var24 < var1.getMinY()) {
                     var24 = var1.getMinY();
                  }

                  if (var1.getTransferType() != 5 && var1.getTransferType() != 4) {
                     var7 = var1.getPixel(var23, var24, (int[])var7);

                     for (int var36 = 0; var36 < var6.length; var36++) {
                        var6[var36] += ((int[])var7)[var36] * var17 * var19;
                     }
                  } else {
                     var7 = var1.getPixel(var23, var24, (double[])var7);

                     for (int var25 = 0; var25 < var6.length; var25++) {
                        var6[var25] += ((double[])var7)[var25] * var17 * var19;
                     }
                  }
               }
            }

            var2.setPixel((int)var3[var8] + var2.getMinX(), (int)var3[var8 + 1] + var2.getMinY(), var6);
         }
      }
   }
}
