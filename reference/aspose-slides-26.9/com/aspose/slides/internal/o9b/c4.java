package com.aspose.slides.internal.o9b;

import java.awt.PaintContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class c4 implements PaintContext {
   private y2 n5;
   private PaintContext l6;
   private WritableRaster k5;
   private WritableRaster u3;

   c4(y2 var1, PaintContext var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void dispose() {
      this.l6.dispose();
      this.k5 = null;
      this.u3 = null;
   }

   @Override
   public ColorModel getColorModel() {
      return this.l6.getColorModel();
   }

   @Override
   public Raster getRaster(int renderedAreaX, int renderedAreaY, int renderedAreaWidth, int renderedAreaHeight) {
      if (this.k5 != null && this.k5.getWidth() >= renderedAreaWidth && this.k5.getHeight() >= renderedAreaHeight) {
         this.k5.setRect(this.u3);
      } else {
         this.k5 = this.getColorModel().createCompatibleWritableRaster(renderedAreaWidth, renderedAreaHeight);
         this.u3 = this.getColorModel().createCompatibleWritableRaster(renderedAreaWidth, renderedAreaHeight);
      }

      y2 var5 = new y2(renderedAreaX, renderedAreaY, renderedAreaWidth, renderedAreaHeight);
      y2 var6 = y2.n5(var5, this.n5);
      int var7 = var6.t2();
      int var8 = var6.l6();
      if (var7 > 0 && var8 > 0) {
         int var9 = var6.s7();
         int var10 = var6.x8();
         Raster var11 = this.l6.getRaster(var9, var10, var7, var8);
         Object var12 = var11.getDataElements(0, 0, var7, var8, null);
         int var13 = var9 - renderedAreaX;
         int var14 = var10 - renderedAreaY;
         this.k5.setDataElements(var13, var14, var7, var8, var12);
      }

      return this.k5;
   }
}
