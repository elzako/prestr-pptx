package com.aspose.slides.internal.c9t;

import javax.imageio.ImageReader;

class u9 extends a6$n5 {
   // $VF: synthetic field
   final a6 n5;

   u9(a6 var1) {
      super(var1, null);
      this.n5 = var1;
   }

   @Override
   public void imageProgress(ImageReader source, float percentageDone) {
      a6.n5(this.n5, percentageDone);
   }
}
