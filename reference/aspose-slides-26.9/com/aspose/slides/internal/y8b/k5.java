package com.aspose.slides.internal.y8b;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.g7p.a6;
import com.aspose.slides.internal.g7p.h0;
import com.aspose.slides.internal.g7p.n3;
import com.aspose.slides.internal.g7p.t2;
import com.aspose.slides.internal.g7p.x8;
import com.aspose.slides.internal.g7p.y4;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.k7;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.PaintContext;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.SinglePixelPackedSampleModel;
import java.awt.image.WritableRaster;
import java.lang.ref.WeakReference;

public class k5 implements PaintContext {
   protected ColorModel n5;
   private static ColorModel u3;
   protected static WeakReference<WritableRaster> l6;
   protected WritableRaster k5;
   private m3 a6;
   private s7 u9;
   private k7 h0;
   private w1 c8;
   private final boolean t2;
   private final boolean s7;
   private final com.aspose.slides.internal.o1o.k5 x8;
   private final com.aspose.slides.internal.h9q.u3 n3;
   private final n3 y4;
   private c8[] e2;

   k5(m3 var1, m1 var2, s7 var3) {
      this.a6 = var1;
      this.u9 = var3;
      this.h0 = this.u9.u3();
      this.c8 = com.aspose.slides.internal.e3j.u9.n5(var1.s7(), var2);
      this.t2 = this.n5(this.a6);
      this.s7 = this.n5();
      this.e2 = this.n5(this.a6, this.h0);
      this.x8 = new com.aspose.slides.internal.o1o.n5();
      this.x8.n5(this.h0, this.c8, this.a6.x8(), this.t2, this.s7, this.e2);
      this.n3 = new com.aspose.slides.internal.h9q.u3(var1, var2);
      this.y4 = this.l6();
      this.n5 = ColorModel.getRGBdefault();
   }

   @Override
   public Raster getRaster(int x, int y, int w, int h) {
      WritableRaster var5 = this.k5;
      if (var5 == null || var5.getWidth() < w || var5.getHeight() < h) {
         var5 = n5(this.n5, w, h);
         this.k5 = var5;
      }

      DataBufferInt var6 = (DataBufferInt)var5.getDataBuffer();
      int[] var7 = var6.getData(0);
      int var8 = var6.getOffset();
      int var9 = ((SinglePixelPackedSampleModel)var5.getSampleModel()).getScanlineStride();
      int var10 = var9 - w;
      w1 var11 = new w1();

      for (int var12 = 0; var12 < h; var12++) {
         for (int var13 = 0; var13 < w; var13++) {
            var11.n5(x + var13);
            var11.l6(y + var12);
            c8 var14 = this.n5(var11);
            var7[var8++] = var14.h0();
         }

         var8 += var10;
      }

      return var5;
   }

   private static synchronized WritableRaster n5(ColorModel var0, int var1, int var2) {
      if (var0 == u3 && l6 != null) {
         WritableRaster var3 = l6.get();
         if (var3 != null && var3.getWidth() >= var1 && var3.getHeight() >= var2) {
            l6 = null;
            return var3;
         }
      }

      return var0.createCompatibleWritableRaster(var1, var2);
   }

   private static synchronized void n5(ColorModel var0, WritableRaster var1) {
      if (l6 != null) {
         WritableRaster var2 = l6.get();
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

      u3 = var0;
      l6 = new WeakReference<>(var1);
   }

   @Override
   public final void dispose() {
      if (this.k5 != null) {
         n5(this.n5, this.k5);
         this.k5 = null;
      }
   }

   @Override
   public ColorModel getColorModel() {
      return this.n5;
   }

   private c8 n5(w1 var1) {
      w1 var2 = this.n3.n5(var1);
      com.aspose.slides.internal.w4c.l6 var3 = this.x8.n5(var2.l6(), var2.k5());
      if (var3 == null) {
         return com.aspose.slides.internal.o9b.c8.n5(0);
      }

      c8 var4 = this.y4.n5(var2.l6(), var2.k5(), var3);
      return var4 != null ? var4 : com.aspose.slides.internal.o9b.c8.n5(0);
   }

   private boolean n5(m3 var1) {
      c8[] var2 = var1.y4();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3 - 1; var4++) {
         c8 var5 = var2[var4];
         c8 var6 = var2[var4 + 1];
         if (!var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   private boolean n5() {
      return this.a6.x8().l6() != 0.0F || this.a6.x8().k5() != 0.0F;
   }

   private c8[] n5(m3 var1, k7 var2) {
      w1[] var3 = var2.n5();
      c8[] var4 = new c8[var3.length];
      c8[] var5 = var1.y4();
      int var6 = var5.length;

      for (int var7 = 0; var7 < var4.length; var7++) {
         if (var7 < var6) {
            var4[var7] = var5[var7];
         } else {
            var4[var7] = var4[var6 - 1];
         }
      }

      return var4;
   }

   private n3 l6() {
      com.aspose.slides.internal.x4g.u3 var1 = this.a6.c8();
      if (var1 == null) {
         if (this.t2) {
            return new h0(this.a6);
         } else {
            return this.s7 ? new a6(this.a6) : new com.aspose.slides.internal.g7p.s7(this.a6);
         }
      } else {
         float[] var2 = var1.l6();
         float[] var3 = var1.k5();
         if (var2.length == 1 && var2[0] == 1.0F && var3.length == 1 && var3[0] == 0.0F) {
            if (this.t2) {
               return new com.aspose.slides.internal.g7p.c8(this.a6);
            } else {
               return this.s7 ? new y4(this.a6) : new x8(this.a6, this.e2);
            }
         } else if (this.t2) {
            return new com.aspose.slides.internal.g7p.u9(this.a6);
         } else {
            return this.s7 ? new com.aspose.slides.internal.g7p.u3(this.a6) : new t2(this.a6);
         }
      }
   }
}
