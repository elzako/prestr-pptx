package com.aspose.slides.internal.c4t;

import java.awt.Color;
import java.awt.PaintContext;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D.Double;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

final class h0 implements PaintContext {
   private static double[] n5 = new double[]{1.0, 0.0, 0.0, 1.0};
   private static final byte[][][] l6 = new byte[][][]{
      {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
      },
      {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0}
      },
      {
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1}
      },
      {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}
      },
      {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0}
      },
      {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 0, 0, 1}
      }
   };
   private int k5;
   private Color u3;
   private Color a6;
   private AffineTransform u9;
   private ColorModel h0;
   private boolean c8;
   private boolean t2;
   private double[] s7;

   h0(int var1, Color var2, Color var3, ColorModel var4, boolean var5, AffineTransform var6) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > 5) {
         var1 = 5;
      }

      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.h0 = var4;
      this.c8 = false;
      this.t2 = var2.getAlpha() < 255 || var3.getAlpha() < 255;

      try {
         this.u9 = var6.createInverse();
      } catch (NoninvertibleTransformException var8) {
         this.u9 = new AffineTransform();
      }

      this.s7 = new double[4];
      this.u9.deltaTransform(n5, 0, this.s7, 0, 2);
   }

   @Override
   public void dispose() {
   }

   @Override
   public ColorModel getColorModel() {
      return this.h0;
   }

   @Override
   public Raster getRaster(int x, int y, int w, int h) {
      WritableRaster var5 = this.h0.createCompatibleWritableRaster(w, h);
      byte[][] var6 = l6[this.k5];
      if (!this.c8) {
         Point var7 = new Point(x, y);
         Double var8 = new Double();
         Object var9 = this.h0.getDataElements(this.u3.getRGB(), null);
         Object var10 = this.h0.getDataElements(this.a6.getRGB(), null);

         for (int var11 = 0; var11 < h; var11++) {
            var7.y = y + var11;
            this.u9.transform(var7, var8);
            double var12 = var8.x;
            double var14 = var8.y;

            for (int var16 = 0; var16 < w; var14 += this.s7[1]) {
               this.u9.transform(var7, var8);
               int var17 = (int)(var12 + 0.5) % 8;
               int var18 = (int)(var14 + 0.5) % 8;
               if (var17 < 0) {
                  var17 += 8;
               }

               if (var18 < 0) {
                  var18 += 8;
               }

               var5.setDataElements(var16, var11, var6[var18][var17] != 0 ? var9 : var10);
               var16++;
               var12 += this.s7[0];
            }
         }
      }

      return var5;
   }
}
