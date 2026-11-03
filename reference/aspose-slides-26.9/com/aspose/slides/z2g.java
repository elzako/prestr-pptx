package com.aspose.slides;

class z2g extends v6g {
   private final g3y n5;
   private a2p l6;
   private a2p k5;
   private z4d u3;
   private z4d a6;

   z2g(a2p var1, a2p var2) {
      this.n5 = var1.e2().y4();
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = new z4d();
      this.a6 = new z4d();
      this.n5(this.u3);
      this.n5(this.a6);
   }

   @Override
   protected void n5(z5 var1) {
      this.u3.n3(var1);
      this.a6.n3(var1);
   }

   @Override
   protected void l6(z5 var1) {
      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   public final void u3() {
      com.aspose.slides.internal.o9b.w1 var1 = this.l6.u3().u3();
      com.aspose.slides.internal.o9b.w1 var2 = this.k5.k5().u3();
      this.u3.a6(var1.l6());
      this.u3.u9(var1.k5());
      this.a6.a6(var2.l6());
      this.a6.u9(var2.k5());
      this.u3.t1();
      this.a6.t1();
   }

   @Override
   protected void l6() {
      this.n5.l6(this.u3.i1().u3(), this.a6.i1().u3());
   }
}
