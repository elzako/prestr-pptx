package com.aspose.slides.internal.x4g;

import java.awt.PaintContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

abstract class n5 implements PaintContext {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private boolean y4;

   protected n5(n3 var1, boolean var2) {
      this.y4 = var2;
      com.aspose.slides.internal.o9b.c8 var3 = var1.c8();
      com.aspose.slides.internal.o9b.c8 var4 = var1.h0();
      float var5 = var2 ? 0.92F : 1.0F;
      this.n5 = this.n5(var3.x8(), var4.x8(), var5);
      this.l6 = this.n5(var3.n3(), var4.n3(), var5);
      this.k5 = this.n5(var3.y4(), var4.y4(), var5);
      this.u3 = this.n5(var3.s7(), var4.s7(), var5);
      this.a6 = var4.x8() & 255;
      this.u9 = var4.n3() & 255;
      this.h0 = var4.y4() & 255;
      this.c8 = var4.s7() & 255;
      float var6 = var2 ? 0.25F : 0.0F;
      this.t2 = this.n5(var3.x8(), var4.x8(), var6);
      this.s7 = this.n5(var3.n3(), var4.n3(), var6);
      this.x8 = this.n5(var3.y4(), var4.y4(), var6);
      this.n3 = this.n5(var3.s7(), var4.s7(), var6);
   }

   @Override
   public void dispose() {
   }

   @Override
   public ColorModel getColorModel() {
      return ColorModel.getRGBdefault();
   }

   @Override
   public Raster getRaster(int x, int y, int w, int h) {
      WritableRaster var5 = this.getColorModel().createCompatibleWritableRaster(w, h);
      int[] var6 = new int[w * h * 4];

      for (int var7 = 0; var7 < h; var7++) {
         for (int var8 = 0; var8 < w; var8++) {
            int var9 = (var7 * w + var8) * 4;
            int var10 = (x + var8) % 8;
            int var11 = (y + var7) % 8;
            if (this.n5(var10, var11)) {
               var6[var9 + 0] = this.n5;
               var6[var9 + 1] = this.l6;
               var6[var9 + 2] = this.k5;
               var6[var9 + 3] = this.u3;
            } else if (this.y4 && this.l6(var10, var11)) {
               var6[var9 + 0] = this.t2;
               var6[var9 + 1] = this.s7;
               var6[var9 + 2] = this.x8;
               var6[var9 + 3] = this.n3;
            } else {
               var6[var9 + 0] = this.a6;
               var6[var9 + 1] = this.u9;
               var6[var9 + 2] = this.h0;
               var6[var9 + 3] = this.c8;
            }
         }
      }

      var5.setPixels(0, 0, w, h, var6);
      return var5;
   }

   protected abstract boolean n5(int var1, int var2);

   protected boolean l6(int var1, int var2) {
      return this.n5(var1 + 1, var2) || this.n5(var1 - 1, var2) || this.n5(var1, var2 + 1) || this.n5(var1, var2 - 1) || this.k5(var1, var2);
   }

   protected abstract boolean k5(int var1, int var2);

   protected int n5(int var1, int var2, double var3) {
      if (var3 < 0.0) {
         var3 = 0.0;
      }

      if (var3 > 1.0) {
         var3 = 1.0;
      }

      int var5 = (int)((var1 & 0xFF) * var3 + (var2 & 0xFF) * (1.0 - var3));
      return this.n5(var5);
   }

   protected int n5(int var1) {
      return Math.min(255, Math.max(0, var1));
   }
}
