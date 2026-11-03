package com.aspose.slides.internal.c9t;

import javax.imageio.ImageWriter;
import javax.imageio.event.IIOWriteWarningListener;

class x8 implements IIOWriteWarningListener {
   // $VF: synthetic field
   final t2 n5;

   x8(t2 var1) {
      this.n5 = var1;
   }

   @Override
   public void warningOccurred(ImageWriter source, int imageIndex, String warning) {
      t2.n5(this.n5, imageIndex, warning);
   }
}
