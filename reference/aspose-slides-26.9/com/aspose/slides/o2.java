package com.aspose.slides;

class o2 extends a2p {
   public o2(t9z var1) {
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
   com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.o0() + this.d5() / 2.0F);
   }

   @Override
   com.aspose.slides.internal.o9b.w1 k5() {
      return this.t2().t9().l6.n5().c8().isPlotOrderReversed()
         ? new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.o0())
         : new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.o0() + this.d5());
   }

   @Override
   com.aspose.slides.internal.o9b.w1 u3() {
      return !this.t2().t9().l6.n5().c8().isPlotOrderReversed()
         ? new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.o0())
         : new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.o0() + this.d5());
   }

   final boolean a6() {
      double var1 = this.t2().t9().k5.e2();
      if (ChartTypeCharacterizer.c8(this.t2().e2().u9().getType()) || ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         var1 = 0.0;
      }

      return (!(this.n3() < var1) || this.t2().t9().k5.n5().c8().isPlotOrderReversed())
         && (!this.t2().t9().k5.n5().c8().isPlotOrderReversed() || !(this.n3() > var1));
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5(q8o var1) {
      com.aspose.slides.internal.o9b.w1 var2 = new com.aspose.slides.internal.o9b.w1(this.t2().t9().k5.n5(this.n3()), this.f2() + this.d5() / 2.0F);
      if (!ChartTypeCharacterizer.c8(this.t2().e2().u9().getType()) && !ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         return var2;
      }

      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2());
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2() + this.d5());
      if (this.u9()) {
         if (this.a6() && var1.i1().l6() > var2.l6()) {
            return var2;
         }

         if (!this.a6() && var1.i1().l6() < this.p8()) {
            return new com.aspose.slides.internal.o9b.w1(this.p8(), var2.k5());
         }
      }

      if (this.h0()) {
         if (this.a6() && var1.i1().l6() < this.p8()) {
            return new com.aspose.slides.internal.o9b.w1(this.p8(), var2.k5());
         }

         if (!this.a6() && var1.i1().l6() < var2.l6()) {
            return var2;
         }
      }

      return var1.i1().k5() <= var2.k5() ? var3 : var4;
   }

   final float k5(z5 var1) {
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t2().t9().k5, ValueAxisBase.class);
      double var3 = var2.n5().c8().isLogarithmic() ? com.aspose.slides.ms.System.q1.n5(var2.h2(), var2.n5().c8().getLogBase()) : var2.h2();
      double var5 = var2.n5().c8().isLogarithmic() ? com.aspose.slides.ms.System.q1.n5(var2.v0(), var2.n5().c8().getLogBase()) : var2.v0();
      if (ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         return (float)(com.aspose.slides.ms.System.q1.n5(this.e2().n5()) * 1.0 / this.t2().n5(this.c8())) / (float)(var3 - var5) * var1.n5();
      }

      if (var2.n5().c8().isLogarithmic()) {
         double var7 = var2.n5().l6(this.n3());
         double var9 = com.aspose.slides.ms.System.q1.n5(var7 - this.e2().n5(), 4);
         if (var9 != 0.0) {
            var9 = var2.n5().n5(var9);
         }

         float var11 = var2.n5(this.n3());
         float var12 = var2.n5(var9);
         return com.aspose.slides.ms.System.q1.n5(var11, var12) - com.aspose.slides.ms.System.q1.l6(var11, var12);
      } else {
         return ChartTypeCharacterizer.c8(this.t2().e2().u9().getType())
            ? (float)com.aspose.slides.ms.System.q1.n5(this.e2().n5()) / (float)(var3 - var5) * var1.n5()
            : (float)com.aspose.slides.ms.System.q1.n5(var2.e2() - this.e2().n5()) / (float)(var3 - var5) * var1.n5();
      }
   }
}
