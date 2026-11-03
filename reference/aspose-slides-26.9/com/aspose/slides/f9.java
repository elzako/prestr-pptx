package com.aspose.slides;

class f9 {
   private n1g n5;
   private com.aspose.slides.internal.o9b.y1 l6 = new com.aspose.slides.internal.o9b.y1();
   private w2 k5;

   f9(n1g var1) {
      this.n5 = var1;
   }

   f9() {
   }

   final void n5(e3[] var1, com.aspose.slides.internal.o9b.y1 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1[0], w2.class)) {
         this.k5 = (w2)var1[0];
         var1[0] = this.k5.z1();
      }

      var1[0].t9().a6(this.l6);
      var1[0].n5(var2.y4());
   }

   final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(var1.x8(), var1.n3(), var1.s7(), var1.k5());
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5.d2(), w2.class)) {
         this.k5 = (w2)this.n5.d2();
         this.n5.n5(this.k5.z1());
         this.n5.d2().q0().n5(var2.y4()).a6(var2);
      }

      this.n5.d2().t9().a6(this.l6);
      this.n5.d2().n5(var2.y4());
   }

   final void n5(e3[] var1) {
      if (this.k5 != null) {
         com.aspose.slides.internal.e1.t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1[0], w2.class).y4();
         this.k5.y4().n5(var2);
         var1[0] = this.k5;
      } else {
         var1[0].n5(this.l6.y4());
      }
   }

   final void n5() {
      if (this.k5 != null) {
         com.aspose.slides.internal.e1.t2 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5.d2(), w2.class).y4();
         this.k5.y4().n5(var1);
         this.n5.n5(this.k5);
      } else {
         this.n5.d2().n5(this.l6.y4());
      }
   }
}
