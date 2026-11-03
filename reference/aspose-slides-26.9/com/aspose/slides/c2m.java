package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

final class c2m implements IDisposable {
   private final FontsManager n5;

   public c2m(FontsManager var1) {
      this.n5 = var1;
      this.n5.n5(true);
   }

   @Override
   public final void dispose() {
      this.n5.n5(false);
   }
}
