package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISlide;

public class f2 extends c8 {
   private final int[] n5;

   public f2(IPresentation var1, z8 var2, int[] var3, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.n5 = var3;
   }

   @Override
   protected r4 n5(ISlide var1, z8 var2, int var3, int var4) {
      return new h0(var1, var2, this.n5, var3, var4);
   }
}
