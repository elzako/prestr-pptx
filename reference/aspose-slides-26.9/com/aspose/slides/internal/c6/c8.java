package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISlide;

public abstract class c8 extends y1 {
   private final z8 n5;
   private final int l6;
   private final int k5;

   public c8(IPresentation var1, z8 var2, int var3, int var4) {
      super(var1, (byte)15);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   protected void n5(ISlide var1) {
      new y2(var1, "Title ", this.n5.n5(), this.l6 > 0).n5();
      this.n5(var1, this.n5, this.l6, this.k5).n5();
   }

   protected abstract r4 n5(ISlide var1, z8 var2, int var3, int var4);
}
