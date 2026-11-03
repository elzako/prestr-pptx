package com.aspose.slides;

class h3w extends i8 implements x4j {
   private boolean l6;

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public h3w(com.aspose.slides.internal.o9b.p8 var1) {
      super(var1.u3());
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      float var3 = this.l6() ? 1.0F - var1 : var1;
      com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1();
      var4.l6(var3 * this.n5.l6());
      var4.n5(var3 * this.n5.k5());
      var4.k5((this.n5.l6() - var4.s7()) / 2.0F);
      var4.u3((this.n5.k5() - var4.k5()) / 2.0F);
      var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      if (this.l6()) {
         var2.l6(this.n5(), 0, 0);
         var2.l6(com.aspose.slides.internal.o9b.a6.n5(), var4.y4());
      } else {
         var2.n5(this.n5(), var4.y4(), var4.y4(), 2);
      }
   }
}
