package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class c6v implements IDisposable {
   public final e3 n5;
   public final com.aspose.slides.internal.w0.c8 l6;

   public c6v(e3 var1) {
      this.n5 = var1;
      this.l6 = var1.q0();
   }

   @Override
   public final void dispose() {
      this.n5.l6(this.l6);
   }
}
