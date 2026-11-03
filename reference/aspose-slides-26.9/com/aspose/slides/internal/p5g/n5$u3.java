package com.aspose.slides.internal.p5g;

import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

abstract class n5$u3 extends k5 {
   private boolean n5 = false;

   n5$u3(ColorModel var1, AffineTransform var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(WritableRaster var1) {
      if (!this.n5) {
         try {
            // A public WritableRaster write invalidates cached surface data.
            int x = var1.getMinX(), y = var1.getMinY();
            var1.setDataElements(x, y, var1.getDataElements(x, y, null));
         } catch (Throwable var3) {
            this.n5 = true;
         }
      }
   }
}
