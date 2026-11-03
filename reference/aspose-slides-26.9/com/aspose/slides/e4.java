package com.aspose.slides;

class e4 extends v6g {
   private float n5;
   private g3y l6;

   e4(g3y var1) {
      this.l6 = var1;
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void l6() {
      if (this.d2() != 0.0F && this.d5() != 0.0F) {
         n1g var1 = this.l6.t2();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
            com.aspose.slides.internal.o9b.c8 var5 = d8.l6(this.l6).o8();
            w5k.n5(var5.o8(), this.l6.t2(), var4.y4(), (FillFormat)this.l6.u9().getFormat().getFill(), this.l6.u9().getFormat().getEffect());
            this.n5(var4.y4());
            this.u3();
         } finally {
            var3.n5();
         }
      }
   }

   private void u3() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

      try {
         var1.n5(
            new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.n5),
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.n5)
         );
         l6v var2 = d8.n5(this.l6, var1);
         com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
         this.l6.t2().d2().n5(var3, var2, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         var1.dispose();
      }
   }

   private void n5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();

      try {
         var2.l6(var1.y4());
         l6v var3 = d8.n5(this.l6, var2);
         com.aspose.slides.internal.x4g.s7 var4 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
         this.l6.t2().d2().n5(var4, var3, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final void n5(float var1) {
      this.n5 = var1;
   }
}
