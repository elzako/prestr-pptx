package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.l6$n5;
import java.awt.image.Raster;

class z6 implements l6$n5 {
   // $VF: synthetic field
   final Raster n5;
   // $VF: synthetic field
   final j9 l6;

   z6(j9 var1, Raster var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(int var1, int var2, int var3, int var4, com.aspose.slides.internal.p4t.u3 var5) {
      int var6 = this.n5.getSample(var3, var4, 0);
      this.l6.n5(var6, var5);
   }
}
