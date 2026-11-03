package com.aspose.slides.internal.o9b;

import java.awt.Color;
import java.awt.image.RGBImageFilter;

class k5 extends RGBImageFilter {
   public final int n5;
   // $VF: synthetic field
   final Color l6;
   // $VF: synthetic field
   final l6 k5;

   k5(l6 var1, Color var2) {
      this.k5 = var1;
      this.l6 = var2;
      this.n5 = this.l6.getRGB() | 0xFF000000;
   }

   @Override
   public final int filterRGB(int x, int y, int rgb) {
      return (rgb | 0xFF000000) == this.n5 ? 16777215 & rgb : rgb;
   }
}
