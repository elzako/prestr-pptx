package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISlide;

public class e5 extends y1 {
   private final String n5;
   private final String l6;

   public e5(IPresentation var1, String var2, String var3) {
      super(var1, (byte)0);
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   protected void n5(ISlide var1) {
      new y2(var1, "Title ", this.n5, false).n5();
      new y2(var1, "Subtitle ", this.l6, false).n5();
   }
}
