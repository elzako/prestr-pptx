package com.aspose.slides.internal.a0p;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.a6;
import com.aspose.slides.internal.x4g.m1;
import java.awt.PaintContext;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.SinglePixelPackedSampleModel;
import java.lang.ref.WeakReference;

public class n5 implements PaintContext {
   private final com.aspose.slides.internal.y4x.l6 n5;
   private final int l6;
   private final double k5;
   private final double u3;
   private final double a6;
   private static final ColorModel u9 = new DirectColorModel(24, 16711680, 65280, 255);
   private static ColorModel h0;
   private static WeakReference<Raster> c8;
   private final ColorModel t2;
   private Raster s7;

   n5(m1 var1, k5 var2) {
      a6 var3 = new a6();
      var3.n5(var2.k5());
      var3.n5(var2.u3());
      w1[] var4 = new w1[]{var2.n5().u3(), var2.l6().u3()};
      var1.n5(var4);
      double var5 = com.aspose.slides.internal.e3j.u9.n5(var4[0], var4[1]);
      this.n5 = new com.aspose.slides.internal.y4x.l6(var5, var3, var2.u9());
      this.l6 = var2.a6();
      m1 var7 = var1.u9();
      if (var7.k5()) {
         var7.h0();
      }

      double[] var8 = new double[6];
      var7.t2().getMatrix(var8);
      double var9 = var8[0];
      double var11 = var8[1];
      double var13 = var8[2];
      double var15 = var8[3];
      double var17 = var8[4];
      double var19 = var8[5];
      double var21 = var2.n5().l6();
      double var23 = var2.n5().k5();
      double var25 = var2.l6().l6();
      double var27 = var2.l6().k5();
      double var29 = var25 - var21;
      double var31 = var27 - var23;
      double var33 = var29 * var29 + var31 * var31;
      double var35 = var29 / var33;
      double var37 = var31 / var33;
      this.k5 = var9 * var35 + var11 * var37;
      this.u3 = var13 * var35 + var15 * var37;
      this.a6 = (var17 - var21) * var35 + (var19 - var23) * var37;
      this.t2 = this.n5(var2.u3());
   }

   private ColorModel n5(c8[] var1) {
      int var2 = -16777216;

      for (c8 var6 : var1) {
         var2 &= var6.h0();
      }

      return var2 >>> 24 == 255 ? u9 : ColorModel.getRGBdefault();
   }

   @Override
   public void dispose() {
      if (this.s7 != null) {
         n5(this.t2, this.s7);
         this.s7 = null;
      }
   }

   @Override
   public ColorModel getColorModel() {
      return this.t2;
   }

   @Override
   public Raster getRaster(int x, int y, int w, int h) {
      Raster var5 = this.s7;
      if (var5 == null || var5.getWidth() < w || var5.getHeight() < h) {
         var5 = n5(this.t2, w, h);
         this.s7 = var5;
      }

      DataBufferInt var6 = (DataBufferInt)var5.getDataBuffer();
      int[] var7 = var6.getData(0);
      int var8 = var6.getOffset();
      int var9 = ((SinglePixelPackedSampleModel)var5.getSampleModel()).getScanlineStride();
      int var10 = var9 - w;
      this.n5(var7, var8, var10, x, y, w, h);
      return var5;
   }

   private void n5(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      double var8 = this.k5 * var4 + this.a6;
      double var10 = 0.0;
      int var12 = var2 + var6;

      for (int var13 = 0; var13 < var7; var13++) {
         for (double var14 = var8 + this.u3 * (var5 + var13); var2 < var12; var14 += this.k5) {
            var1[var2++] = this.n5(var14);
         }

         var2 += var3;
         var12 = var2 + var6;
      }
   }

   protected int n5(double var1) {
      var1 = this.l6(var1);
      return this.n5.n5(var1).h0();
   }

   private double l6(double var1) {
      if (this.l6 == 4) {
         if (var1 > 1.0) {
            var1 = 1.0;
         } else if (var1 < 0.0) {
            var1 = 0.0;
         }
      } else if (this.l6 != 0 && this.l6 != 2) {
         if (var1 < 0.0) {
            var1 = -var1;
         }

         int var5 = (int)var1;
         var1 -= var5;
         if ((var5 & 1) == 1) {
            var1 = 1.0 - var1;
         }
      } else {
         double var3 = 1.0E-5;
         if (Math.abs(var1 - Math.round(var1)) <= 1.0E-5) {
            return 0.0;
         }

         if (var1 < 0.0) {
            var1 = var1 - (int)var1 + 1.0;
         } else if (var1 > 1.0) {
            var1 -= (int)var1;
         }
      }

      return var1;
   }

   private static synchronized Raster n5(ColorModel var0, int var1, int var2) {
      if (var0 == h0 && c8 != null) {
         Raster var3 = c8.get();
         if (var3 != null && var3.getWidth() >= var1 && var3.getHeight() >= var2) {
            c8 = null;
            return var3;
         }
      }

      return var0.createCompatibleWritableRaster(var1, var2);
   }

   private static synchronized void n5(ColorModel var0, Raster var1) {
      if (c8 != null) {
         Raster var2 = c8.get();
         if (var2 != null) {
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int var5 = var1.getWidth();
            int var6 = var1.getHeight();
            if (var3 >= var5 && var4 >= var6) {
               return;
            }

            if (var3 * var4 >= var5 * var6) {
               return;
            }
         }
      }

      h0 = var0;
      c8 = new WeakReference<>(var1);
   }
}
