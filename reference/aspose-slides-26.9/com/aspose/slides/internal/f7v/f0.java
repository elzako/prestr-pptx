package com.aspose.slides.internal.f7v;

public class f0 extends p3 {
   private int t2;

   public f0(com.aspose.slides.internal.c5e.l6 var1) {
      super("sRGB", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 1) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk length " + var1);
      }

      this.t2 = com.aspose.slides.internal.c5e.h0.n5(var1.k5, 0);
   }

   public int l6() {
      return this.t2;
   }
}
