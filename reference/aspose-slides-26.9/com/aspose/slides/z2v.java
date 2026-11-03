package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class z2v extends h2v {
   z2v(t9z var1) {
      super(var1);
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5() {
      throw new InvalidOperationException();
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5(q8o var1) {
      throw new InvalidOperationException();
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void l6() {
      if (this.d2() != 0.0F && this.d5() != 0.0F) {
         n1g var1 = this.e2().y4().t2();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
            this.e2().l6(var4.y4());
            this.e2().n5(var4.y4());
         } finally {
            var3.n5();
         }
      }
   }
}
