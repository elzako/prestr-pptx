package com.aspose.slides.internal.f7v;

class a3 extends p3 {
   private byte t2;

   public a3(com.aspose.slides.internal.c5e.l6 var1) {
      super("sTER", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 1) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk length " + var1);
      }

      this.t2 = var1.k5[0];
   }
}
