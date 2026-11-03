package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

abstract class d7 implements IDisposable {
   public final j2m n5;

   protected d7(j2m var1) {
      if (var1 == null) {
         throw new ArgumentNullException("player");
      }

      this.n5 = var1;
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
   }

   public void I_() {
      this.n5.I_();
   }
}
