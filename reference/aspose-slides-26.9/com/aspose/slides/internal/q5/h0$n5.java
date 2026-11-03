package com.aspose.slides.internal.q5;

import com.aspose.slides.exceptions.InvalidOperationException;

public class h0$n5 extends com.aspose.slides.internal.l7.c8 {
   private int n5 = -1;
   private int l6 = -1;

   public static h0$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new h0$n5(var0, var1);
   }

   protected h0$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new h0(this.y4(), var1, this.n5, this.l6, null);
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         throw new InvalidOperationException("Number of metrics can't be negative.");
      }

      this.n5 = var1;
      h0.n5((h0)this.e2(), var1);
   }

   public final void l6(int var1) {
      if (var1 < 0) {
         throw new InvalidOperationException("Number of glyphs can't be negative.");
      }

      this.l6 = var1;
      h0.l6((h0)this.e2(), var1);
   }
}
