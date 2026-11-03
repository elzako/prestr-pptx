package com.aspose.slides.internal.f7v;

public class y0 extends e9 {
   public y0(com.aspose.slides.internal.c5e.l6 var1) {
      super("tEXt", var1);
   }

   @Override
   public void n5(a6 var1) {
      int var2 = 0;

      while (var2 < var1.k5.length && var1.k5[var2] != 0) {
         var2++;
      }

      this.t2 = com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, 0, var2);
      var2++;
      this.s7 = var2 < var1.k5.length ? com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, var2, var1.k5.length - var2) : "";
   }
}
