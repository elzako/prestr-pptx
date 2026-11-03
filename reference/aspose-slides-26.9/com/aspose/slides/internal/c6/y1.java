package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISlide;

public abstract class y1 {
   private final IPresentation n5;
   private final byte l6;

   public y1(IPresentation var1, byte var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5() {
      ISlide var1 = this.n5.getSlides().addEmptySlide(this.n5.getLayoutSlides().getByType(this.l6));
      this.n5(var1);
   }

   protected abstract void n5(ISlide var1);
}
