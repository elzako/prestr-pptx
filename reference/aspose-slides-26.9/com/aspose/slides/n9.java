package com.aspose.slides;

class n9 extends v6g {
   private ChartDataPointLevel n5;
   private n1g l6;
   private a2 k5;

   n9(ChartDataPointLevel var1, n1g var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new a2(this.n5, var2);
      this.n5(this.k5);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(15.0F);
      this.k5.n3(var1);
   }

   @Override
   protected void l6(z5 var1) {
      this.k5.a6(this.k5.b3() + 3.0F);
      this.k5.t1();
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6() {
      ChartSeries var1 = this.n5.h0().u3().l6();
      if (var1.getParentLabelLayout() == 0) {
         this.l6
            .d2()
            .n5(
               new com.aspose.slides.internal.o9b.y2(
                  com.aspose.slides.internal.v6g.k5.u3(this.p8(), 13),
                  com.aspose.slides.internal.v6g.k5.u3(this.f2(), 13),
                  com.aspose.slides.internal.v6g.k5.u3(this.d2(), 13),
                  com.aspose.slides.internal.v6g.k5.u3(this.d5(), 13)
               ),
               new l6v(com.aspose.slides.internal.o9b.c8.w4().o8(), 0.15F),
               new a1v(com.aspose.slides.internal.o9b.c8.n5(255, 166, 166, 166).o8())
            );
      }
   }
}
