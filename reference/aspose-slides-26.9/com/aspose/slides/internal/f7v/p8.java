package com.aspose.slides.internal.f7v;

public class p8 extends p3 {
   private double t2;

   public p8(com.aspose.slides.internal.c5e.l6 var1) {
      super("gAMA", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 4) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk " + var1);
      }

      int var2 = com.aspose.slides.internal.c5e.h0.k5(var1.k5, 0);
      this.t2 = var2 / 100000.0;
   }

   public double l6() {
      return this.t2;
   }
}
