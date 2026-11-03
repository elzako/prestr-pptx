package com.aspose.slides;

class l3e extends a2p {
   public l3e(t9z var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5(q8o var1) {
      com.aspose.slides.internal.o9b.w1 var2 = new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.t2().t9().l6.n5(this.n3()));
      if (!ChartTypeCharacterizer.c8(this.t2().e2().u9().getType()) && !ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         return var2;
      }

      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5() / 2.0F);
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5() / 2.0F);
      if (this.u9()) {
         if (this.a6() && var1.i1().k5() < this.f2()) {
            return var2;
         }

         if (!this.a6() && var1.i1().k5() < this.f2()) {
            return new com.aspose.slides.internal.o9b.w1(var2.l6(), this.f2());
         }
      }

      if (this.h0()) {
         if (this.a6() && var1.i1().k5() > this.f2() + this.d5()) {
            return new com.aspose.slides.internal.o9b.w1(var2.l6(), var2.k5() + this.d5());
         }

         if (!this.a6() && var1.i1().k5() > var2.k5()) {
            return var2;
         }
      }

      return var1.i1().l6() <= var2.l6() ? var3 : var4;
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.b3() + this.d2() / 2.0F, this.t2().t9().l6.n5(this.n3()));
   }

   @Override
   com.aspose.slides.internal.o9b.w1 k5() {
      return this.t2().t9().k5.n5().c8().isPlotOrderReversed()
         ? new com.aspose.slides.internal.o9b.w1(this.b3() + this.d2(), this.t2().t9().l6.n5(this.n3()))
         : new com.aspose.slides.internal.o9b.w1(this.b3(), this.t2().t9().l6.n5(this.n3()));
   }

   @Override
   com.aspose.slides.internal.o9b.w1 u3() {
      return this.t2().t9().k5.n5().c8().isPlotOrderReversed()
         ? new com.aspose.slides.internal.o9b.w1(this.b3(), this.t2().t9().l6.n5(this.n3()))
         : new com.aspose.slides.internal.o9b.w1(this.b3() + this.d2(), this.t2().t9().l6.n5(this.n3()));
   }

   final boolean a6() {
      double var1 = this.t2().t9().l6.e2();
      if (ChartTypeCharacterizer.c8(this.t2().e2().u9().getType()) || ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         var1 = 0.0;
      }

      return (!(this.n3() < var1) || this.t2().t9().l6.n5().c8().isPlotOrderReversed())
         && (!this.t2().t9().l6.n5().c8().isPlotOrderReversed() || !(this.n3() > var1));
   }

   final float k5(z5 var1) {
      ValueAxisBase var2 = (ValueAxisBase)this.t2().t9().l6;
      double var3 = var2.n5().c8().isLogarithmic() ? com.aspose.slides.ms.System.q1.n5(var2.h2(), var2.n5().c8().getLogBase()) : var2.h2();
      double var5 = var2.n5().c8().isLogarithmic() ? com.aspose.slides.ms.System.q1.n5(var2.v0(), var2.n5().c8().getLogBase()) : var2.v0();
      if (ChartTypeCharacterizer.s7(this.t2().e2().u9().getType())) {
         return (float)(com.aspose.slides.ms.System.q1.n5(this.e2().n5()) * 1.0 / this.t2().n5(this.c8())) / (float)(var3 - var5) * var1.l6();
      }

      if (var2.n5().c8().isLogarithmic()) {
         ChartSeries var7 = this.t2().e2().u9();
         float var13;
         float var14;
         if (ChartTypeCharacterizer.c8(var7.getType())) {
            int var8 = ((m4d)var7.getParentSeriesGroup().getSeries()).n5((IChartSeries)var7);
            double var9 = this.t2().n5(this.c8(), var8);
            double var11 = var9 - this.e2().n5();
            var9 = com.aspose.slides.ms.System.q1.n5(var9, var2.n5().c8().getLogBase());
            var11 = var11 == 0.0 ? 0.0 : com.aspose.slides.ms.System.q1.n5(var11, var2.n5().c8().getLogBase());
            var13 = var2.n5(var9);
            var14 = var2.n5(var11);
         } else {
            var13 = var2.n5(this.n3());
            var14 = var2.y4();
         }

         return com.aspose.slides.ms.System.q1.n5(var13, var14) - com.aspose.slides.ms.System.q1.l6(var13, var14);
      } else {
         return (!ChartTypeCharacterizer.c8(this.t2().e2().u9().getType()) || this.e2().n5() == this.n3()) && var2.e2() != var3
            ? (float)com.aspose.slides.ms.System.q1.n5(var2.e2() - this.e2().n5()) / (float)(var3 - var5) * var1.l6()
            : (float)com.aspose.slides.ms.System.q1.n5(this.e2().n5()) / (float)(var3 - var5) * var1.l6();
      }
   }
}
