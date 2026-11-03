package com.aspose.slides;

class d5r extends v6g {
   private final g3y n5;
   private com.aspose.slides.internal.o9b.w1 l6 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 a6 = new com.aspose.slides.internal.o9b.w1();

   @Override
   public boolean T_() {
      return this.n5.u9().hasSeriesLines();
   }

   public d5r(g3y var1) {
      this.n5 = var1;
   }

   public final void n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      var1.n5(this.l6);
      var2.n5(this.k5);
      var3.n5(this.u3);
      var4.n5(this.a6);
   }

   @Override
   protected void l6() {
      float var1 = this.p8();
      float var2 = this.f2();
      x5h.n5(this.l6.u3(), var1, var2).n5(this.l6);
      x5h.n5(this.u3.u3(), var1, var2).n5(this.u3);
      x5h.n5(this.k5.u3(), var1, var2).n5(this.k5);
      x5h.n5(this.a6.u3(), var1, var2).n5(this.a6);
      this.n5.l6(this.l6.u3(), this.u3.u3());
      this.n5.l6(this.k5.u3(), this.a6.u3());
   }
}
