package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.l6$n5;
import java.awt.image.ColorModel;
import java.awt.image.Raster;

class c4 implements l6$n5 {
   // $VF: synthetic field
   final ColorModel n5;
   // $VF: synthetic field
   final Raster l6;
   // $VF: synthetic field
   final Object k5;
   // $VF: synthetic field
   final n5 u3;

   c4(n5 var1, ColorModel var2, Raster var3, Object var4) {
      this.u3 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   public void n5(int var1, int var2, int var3, int var4, com.aspose.slides.internal.p4t.u3 var5) {
      int var6 = this.n5.getRGB(this.l6.getDataElements(var3, var4, this.k5));
      int var7 = this.u3.k5(var6);
      this.u3.n5(var7, var5);
   }
}
