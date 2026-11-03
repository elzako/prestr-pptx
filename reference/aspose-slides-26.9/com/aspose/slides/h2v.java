package com.aspose.slides;

abstract class h2v extends v6g {
   private q8o n5;
   private a6y l6;
   private t9z k5;
   private double u3;
   private double a6;

   protected h2v(t9z var1) {
      this.n5(var1);
      this.n5(this.e2().n5());
      this.l6(this.e2().l6());
      this.l6(var1.y4().u9().getChart().getDisplayBlanksAs() == 2 || !this.e2().c8());
   }

   @Override
   protected void V_() {
      if (this.T_()) {
         this.e2().s7().n5(this.p8() - this.e2().y4().t2().n3().getX());
         this.e2().s7().l6(this.f2() - this.e2().y4().t2().n3().getY());
         this.e2().s7().k5(this.d2());
         this.e2().s7().u3(this.d5());
      }
   }

   final q8o s7() {
      return this.n5;
   }

   final void l6(q8o var1) {
      this.n5 = var1;
   }

   final a6y x8() {
      return this.l6;
   }

   final void n5(a6y var1) {
      this.l6 = var1;
   }

   abstract com.aspose.slides.internal.o9b.w1 n5();

   abstract com.aspose.slides.internal.o9b.w1 n5(q8o var1);

   public final double n3() {
      return this.a6;
   }

   public final void n5(double var1) {
      this.a6 = var1;
   }

   public double y4() {
      if (this.y1() != null && com.aspose.slides.internal.v6g.k5.l6(this.y1(), f7c.class)) {
         f7c var1 = (f7c)this.y1();
         if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var1.e2().u9().getType())
            && var1.t9().k5 != null
            && com.aspose.slides.internal.v6g.k5.l6(var1.t9().k5, u7.class)
            && com.aspose.slides.ms.System.d2.k5(this.u3)) {
            return var1.l6.indexOf(this) + 1.0;
         }
      }

      return this.u3;
   }

   public void l6(double var1) {
      this.u3 = var1;
   }

   public final t9z e2() {
      return this.k5;
   }

   public final void n5(t9z var1) {
      this.k5 = var1;
   }
}
