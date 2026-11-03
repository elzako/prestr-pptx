package com.aspose.slides.internal.o9b;

import java.awt.PaintContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class h0 implements PaintContext {
   private com.aspose.slides.internal.x4g.s7 n5;
   private PaintContext l6;
   private Object k5;
   private WritableRaster u3;
   private WritableRaster a6;

   h0(com.aspose.slides.internal.x4g.s7 var1, PaintContext var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void dispose() {
      this.l6.dispose();
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
   }

   @Override
   public ColorModel getColorModel() {
      return this.l6.getColorModel();
   }

   @Override
   public Raster getRaster(int renderedAreaX, int renderedAreaY, int renderedAreaWidth, int renderedAreaHeight) {
      if (this.u3 != null && this.u3.getWidth() >= renderedAreaWidth && this.u3.getHeight() >= renderedAreaHeight) {
         this.u3.setRect(this.a6);
      } else {
         this.u3 = this.getColorModel().createCompatibleWritableRaster(renderedAreaWidth, renderedAreaHeight);
         this.a6 = this.getColorModel().createCompatibleWritableRaster(renderedAreaWidth, renderedAreaHeight);
      }

      for (int var5 = renderedAreaY; var5 < renderedAreaY + renderedAreaHeight; var5++) {
         for (int var6 = renderedAreaX; var6 < renderedAreaX + renderedAreaWidth; var6++) {
            if (this.n5.contains(var6, var5)) {
               Raster var7 = this.l6.getRaster(var6, var5, 1, 1);
               this.k5 = var7.getDataElements(0, 0, 1, 1, this.k5);
               int var8 = var6 - renderedAreaX;
               int var9 = var5 - renderedAreaY;
               this.u3.setDataElements(var8, var9, 1, 1, this.k5);
            }
         }
      }

      return this.u3;
   }
}
