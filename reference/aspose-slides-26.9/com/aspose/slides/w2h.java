package com.aspose.slides;

class w2h extends k1z {
   private ILineFormat t2;

   w2h(ILineFormat var1, n7r var2) {
      super(var2);
      this.t2 = var1;
   }

   @Override
   void n5() {
      com.aspose.slides.internal.k0r.q5 var1 = new com.aspose.slides.internal.k0r.q5();
      var1.l6(true);
      com.aspose.slides.internal.k0r.p1 var2 = var1.u3();
      var2.l6(true);
      var2.s7(true);
      var2.n3(true);
      var2.n5(20);
      this.l6 = var1;
      this.k5.x8().e2().addItem(this.l6);
      this.h0 = true;
   }

   @Override
   void c8() {
      if (this.u3 != null) {
         this.u3.l6();
      }

      this.t4();
      if (!this.h0) {
         this.k5.x8().e2().addItem(this.z3());
         this.h0 = true;
      }
   }

   public final n7r t2() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5, n7r.class);
   }

   public final ILineFormat x8() {
      return this.t2;
   }
}
