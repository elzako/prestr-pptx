package com.aspose.slides.internal.q5;

import com.aspose.slides.exceptions.InvalidOperationException;

public class a6$n5 extends com.aspose.slides.internal.l7.c8 {
   private int n5 = -1;

   public static a6$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new a6$n5(var0, var1);
   }

   protected a6$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new a6(this.y4(), var1, this.n5, null);
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         throw new InvalidOperationException("Number of glyphs can't be negative.");
      }

      this.n5 = var1;
      com.aspose.slides.internal.q5.a6.n5((a6)this.e2(), var1);
   }
}
