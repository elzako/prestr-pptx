package com.aspose.slides;

class l4y extends x3 implements ILayoutable {
   private i0y n5 = new i0y();
   private IChart l6;

   @Override
   public float getX() {
      return this.n5.n5();
   }

   @Override
   public void setX(float value) {
      this.n5.n5(value);
   }

   @Override
   public float getY() {
      return this.n5.l6();
   }

   @Override
   public void setY(float value) {
      this.n5.l6(value);
   }

   @Override
   public float getWidth() {
      return this.n5.k5();
   }

   @Override
   public void setWidth(float value) {
      this.n5.k5(value);
   }

   @Override
   public float getHeight() {
      return this.n5.u3();
   }

   @Override
   public void setHeight(float value) {
      this.n5.u3(value);
   }

   @Override
   public float getRight() {
      return this.n5.a6();
   }

   @Override
   public float getBottom() {
      return this.n5.u9();
   }

   public com.aspose.slides.internal.k4y.f3h u9() {
      return this.n5.h0();
   }

   public void n5(com.aspose.slides.internal.k4y.f3h var1) {
      this.n5.n5(var1);
   }

   public com.aspose.slides.internal.k4y.f3h h0() {
      return this.n5.c8();
   }

   public void l6(com.aspose.slides.internal.k4y.f3h var1) {
      this.n5.l6(var1);
   }

   public com.aspose.slides.internal.k4y.f3h c8() {
      return this.n5.t2();
   }

   public void k5(com.aspose.slides.internal.k4y.f3h var1) {
      this.n5.k5(var1);
   }

   public com.aspose.slides.internal.k4y.f3h t2() {
      return this.n5.s7();
   }

   public void u3(com.aspose.slides.internal.k4y.f3h var1) {
      this.n5.u3(var1);
   }

   public com.aspose.slides.internal.k4y.x8 s7() {
      return this.n5.x8();
   }

   public void l6(com.aspose.slides.internal.k4y.x8 var1) {
      this.n5.n5(var1);
   }

   public com.aspose.slides.internal.k4y.x8 x8() {
      return this.n5.n3();
   }

   public void k5(com.aspose.slides.internal.k4y.x8 var1) {
      this.n5.l6(var1);
   }

   @Override
   public IChart getChart() {
      return this.l6;
   }

   @Override
   public IBaseSlide getSlide() {
      return this.l6 != null ? this.l6.getSlide() : null;
   }

   @Override
   public IPresentation getPresentation() {
      return this.l6 != null ? this.l6.getPresentation() : null;
   }

   public l4y(IChart var1) {
      this.l6 = var1;
   }
}
