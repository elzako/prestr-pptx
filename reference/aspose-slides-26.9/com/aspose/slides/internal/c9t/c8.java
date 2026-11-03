package com.aspose.slides.internal.c9t;

import javax.imageio.ImageReader;
import javax.imageio.event.IIOReadWarningListener;

class c8 implements IIOReadWarningListener {
   // $VF: synthetic field
   final a6 n5;

   c8(a6 var1) {
      this.n5 = var1;
   }

   @Override
   public void warningOccurred(ImageReader source, String warning) {
      a6.n5(this.n5, warning);
   }
}
