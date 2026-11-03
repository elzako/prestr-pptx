package com.aspose.slides;

abstract class b3r extends v6g {
   private double u3;
   private double a6;
   private h2v u9;
   protected z4d n5 = new z4d();
   protected z4d l6 = new z4d();
   protected z4d k5 = new z4d();

   protected final void n5(h2v var1) {
      this.u9 = var1;
      this.u3();
      this.n5 = new z4d();
      this.n5(this.n5);
      this.n5(this.l6);
      this.n5(this.k5);
   }

   @Override
   public int O_() {
      return 3;
   }

   protected abstract void u3();

   protected abstract void l6(h2v var1);

   protected final void n5(double var1) {
      this.a6(var1 - this.c8().n5().getValue());
      this.u9(var1 + this.c8().n5().getValue());
   }

   protected final void l6(double var1) {
      this.a6(var1 - this.c8().n5().getValue() * var1 / 100.0);
      this.u9(var1 + this.c8().n5().getValue() * var1 / 100.0);
   }

   protected final void k5(double var1) {
      double var3 = this.y4();
      double var5 = this.h0() * this.c8().n5().getValue();
      this.a6(var3 - var5);
      this.u9(var3 + var5);
   }

   protected final void u3(double var1) {
      int var3 = com.aspose.slides.internal.v6g.k5.n5(this.x8().y1(), f7c.class).l6.size();
      double var4 = this.h0();
      this.a6(var1 - var4 / com.aspose.slides.ms.System.q1.z3(var3));
      this.u9(var1 + var4 / com.aspose.slides.ms.System.q1.z3(var3));
   }

   protected abstract double h0();

   @Override
   protected void n5(z5 var1) {
      this.n5.n3(var1);
      this.l6.n3(var1);
      this.k5.n3(var1);
   }

   protected abstract s7m c8();

   @Override
   protected void l6(z5 var1) {
      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   final double t2() {
      return this.u3;
   }

   final void a6(double var1) {
      this.u3 = var1;
   }

   final double s7() {
      return this.a6;
   }

   final void u9(double var1) {
      this.a6 = var1;
   }

   final h2v x8() {
      return this.u9;
   }

   protected abstract void n3();

   @Override
   protected void l6() {
      if (this.x8().T_() && !this.x8().e2().c8()) {
         n1g var1 = com.aspose.slides.internal.v6g.k5.n5(this.y1(), f7c.class).e2().t2();
         com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
         f9 var3 = new f9(var1);
         var3.n5(var2.y4());

         try {
            this.n3();
         } finally {
            var3.n5();
         }
      }
   }

   protected abstract double y4();
}
