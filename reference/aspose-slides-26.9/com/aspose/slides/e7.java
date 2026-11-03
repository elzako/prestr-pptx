package com.aspose.slides;

class e7 extends h2v {
   public e7(t9z var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6(z5 var1) {
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.i1().k5());
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5(q8o var1) {
      return new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.i1().k5());
   }

   @Override
   protected void l6() {
      if (!this.e2().c8() && this.e2().s7().getFormat().getFill().getFillType() != 0) {
         com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var2 = new f9(this.e2().y4().t2());
         var2.n5(var1.y4());
         com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
         var3.n5(new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5()));
         if (this.e2().k5() > 0.0) {
            this.e2().a6(var3);
            boolean var4 = this.e2().l6(var3);
            if (!var4) {
               this.e2().u3(var3);
            }
         } else {
            this.e2()
               .y4()
               .t2()
               .d2()
               .l6(
                  new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.d2(), this.d5()),
                  new l6v(com.aspose.slides.internal.o9b.c8.u3.o8(), 0.0F),
                  new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
               );
         }

         var2.n5();
      }
   }
}
