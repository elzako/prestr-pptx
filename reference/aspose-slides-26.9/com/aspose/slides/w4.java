package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

abstract class w4 {
   public final IShape n5;

   protected w4(IShape var1) {
      if (var1 == null) {
         throw new ArgumentNullException("shape");
      }

      this.n5 = var1;
   }
}
