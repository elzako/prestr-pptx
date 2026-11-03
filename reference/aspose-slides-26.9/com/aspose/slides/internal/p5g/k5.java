package com.aspose.slides.internal.p5g;

import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.lang.ref.WeakReference;

abstract class k5 implements PaintContext {
   public static ColorModel t2 = new DirectColorModel(24, 16711680, 65280, 255);
   public static ColorModel s7 = ColorModel.getRGBdefault();
   ColorModel x8;
   int n3;
   int y4;
   int e2;
   WritableRaster t9;
   double z1;
   double t4;
   double q0;
   double z3;
   double m1;
   double k7;
   int m3;
   int z8;
   int j5;
   int w1;
   int r4;
   int c4;
   int y2;
   int y1;
   private static WeakReference<Raster> n5;
   private static WeakReference<Raster> l6;
   private static WeakReference<Raster> k5;

   k5(ColorModel var1, AffineTransform var2, int var3, int var4, int var5) {
      this.x8 = n5(var1);
      this.n3 = var3;
      this.y4 = var4;
      this.e2 = var5;

      try {
         var2 = var2.createInverse();
      } catch (NoninvertibleTransformException var7) {
         var2.setToScale(0.0, 0.0);
      }

      this.q0 = n5(var2.getScaleX(), var3);
      this.z3 = n5(var2.getShearY(), var4);
      this.m1 = n5(var2.getShearX(), var3);
      this.k7 = n5(var2.getScaleY(), var4);
      this.z1 = var2.getTranslateX();
      this.t4 = var2.getTranslateY();
      this.m3 = (int)this.q0;
      this.z8 = (int)this.z3;
      this.j5 = n5(this.q0);
      this.w1 = n5(this.z3);
      this.r4 = (int)this.m1;
      this.c4 = (int)this.k7;
      this.y2 = n5(this.m1);
      this.y1 = n5(this.k7);
   }

   @Override
   public void dispose() {
      n5(this.x8, this.t9);
   }

   @Override
   public ColorModel getColorModel() {
      return this.x8;
   }

   @Override
   public Raster getRaster(int x, int y, int w, int h) {
      if (this.t9 == null || this.t9.getWidth() < w || this.t9.getHeight() < h) {
         this.t9 = this.n5(h == 1 ? Math.max(w, this.e2) : w, h);
      }

      double var5 = n5(this.z1 + x * this.q0 + y * this.m1, this.n3);
      double var7 = n5(this.t4 + x * this.z3 + y * this.k7, this.y4);
      this.n5((int)var5, (int)var7, n5(var5), n5(var7), w, h, this.n3, this.y4, this.m3, this.j5, this.z8, this.w1, this.r4, this.y2, this.c4, this.y1);
      this.n5(this.t9);
      return this.t9;
   }

   public void n5(WritableRaster var1) {
   }

   public static PaintContext n5(BufferedImage var0, AffineTransform var1, RenderingHints var2, Rectangle var3) {
      WritableRaster var4 = var0.getRaster();
      ColorModel var5 = var0.getColorModel();
      int var6 = var3.width;
      Object var7 = var2.get(RenderingHints.KEY_INTERPOLATION);
      boolean var8 = var7 == null
         ? var2.get(RenderingHints.KEY_RENDERING) == RenderingHints.VALUE_RENDER_QUALITY
         : var7 != RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      return new k5$n5(var4, var5, var1, var6, var8);
   }

   static int n5(double var0) {
      return (int)(var0 % 1.0 * 2.147483647E9);
   }

   static double n5(double var0, double var2) {
      var0 %= var2;
      if (var0 < 0.0) {
         var0 += var2;
         if (var0 >= var2) {
            var0 = 0.0;
         }
      }

      return var0;
   }

   private static ColorModel n5(ColorModel var0) {
      if (t2 == var0 || t2.equals(var0)) {
         return t2;
      } else {
         return s7 != var0 && !s7.equals(var0) ? var0 : s7;
      }
   }

   static synchronized WritableRaster n5(ColorModel var0, Raster var1, int var2, int var3) {
      if (t2 == var0) {
         if (n5 != null) {
            WritableRaster var4 = (WritableRaster)n5.get();
            if (var4 != null && var4.getWidth() >= var2 && var4.getHeight() >= var3) {
               n5 = null;
               return var4;
            }
         }

         if (var2 <= 32 && var3 <= 32) {
            var3 = 32;
            var2 = 32;
         }
      } else if (s7 == var0) {
         if (l6 != null) {
            WritableRaster var5 = (WritableRaster)l6.get();
            if (var5 != null && var5.getWidth() >= var2 && var5.getHeight() >= var3) {
               l6 = null;
               return var5;
            }
         }

         if (var2 <= 32 && var3 <= 32) {
            var3 = 32;
            var2 = 32;
         }
      }

      return var1 != null ? var1.createCompatibleWritableRaster(var2, var3) : var0.createCompatibleWritableRaster(var2, var3);
   }

   static synchronized void n5(ColorModel var0, Raster var1) {
      if (var1 != null) {
         if (t2 == var0) {
            n5 = new WeakReference<>(var1);
         } else if (s7 == var0) {
            l6 = new WeakReference<>(var1);
         }
      }
   }

   static synchronized WritableRaster n5(Raster var0, int var1, int var2) {
      if (k5 != null) {
         WritableRaster var3 = (WritableRaster)k5.get();
         if (var3 != null && var3.getWidth() >= var1 && var3.getHeight() >= var2) {
            k5 = null;
            return var3;
         }
      }

      if (var1 <= 32 && var2 <= 32) {
         var2 = 32;
         var1 = 32;
      }

      return var0.createCompatibleWritableRaster(var1, var2);
   }

   static synchronized void n5(Raster var0) {
      if (var0 != null) {
         k5 = new WeakReference<>(var0);
      }
   }

   public abstract WritableRaster n5(int var1, int var2);

   public abstract void n5(
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
   );

   public static int n5(int[] var0, int var1, int var2) {
      var1 >>>= 19;
      var2 >>>= 19;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < 4; var10++) {
         int var11 = var0[var10];
         var1 = 4096 - var1;
         if ((var10 & 1) == 0) {
            var2 = 4096 - var2;
         }

         int var12 = var1 * var2;
         if (var12 != 0) {
            int var13 = (var11 >>> 24) * var12;
            var6 += var13;
            if (var13 != 0) {
               var5 += (var11 >>> 16 & 0xFF) * var12;
               var4 += (var11 >>> 8 & 0xFF) * var12;
               var3 += (var11 & 0xFF) * var12;
            } else {
               var9 += (var11 >>> 16 & 0xFF) * var12;
               var8 += (var11 >>> 8 & 0xFF) * var12;
               var7 += (var11 & 0xFF) * var12;
            }
         }
      }

      var5 += var5 != 0 ? var9 : 0;
      var4 += var4 != 0 ? var8 : 0;
      var3 += var3 != 0 ? var7 : 0;
      return var6 + 8388608 >>> 24 << 24 | var5 + 8388608 >>> 24 << 16 | var4 + 8388608 >>> 24 << 8 | var3 + 8388608 >>> 24;
   }
}
