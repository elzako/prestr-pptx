package com.aspose.slides.internal.c9t;

import javax.imageio.ImageWriter;

class s7 extends t2$n5 {
   // $VF: synthetic field
   final t2 n5;

   s7(t2 var1) {
      super(var1, null);
      this.n5 = var1;
   }

   @Override
   public void imageProgress(ImageWriter source, float percentageDone) {
      t2.n5(this.n5, percentageDone);
   }
}
