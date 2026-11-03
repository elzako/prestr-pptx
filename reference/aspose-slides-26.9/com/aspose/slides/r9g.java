package com.aspose.slides;

class r9g {
   private d2k k5 = new d2k();
   private d2k u3 = new d2k();
   private boolean a6 = true;
   public final IShape n5;
   public float l6;

   public r9g(IShape var1) {
      this.n5 = var1;
   }

   private void u9() {
      if (this.a6) {
         this.a6 = false;
         IShapeFrame var1 = this.n5.getFrame();
         this.k5 = new d2k(var1.getCenterX(), var1.getCenterY());
         this.u3 = new d2k(var1.getWidth(), var1.getHeight());
      }
   }

   public final float n5() {
      return this.h0().n5;
   }

   public final float l6() {
      return this.h0().l6;
   }

   public final float k5() {
      return this.c8().n5;
   }

   public final float u3() {
      return this.c8().l6;
   }

   public final float a6() {
      return this.l6;
   }

   private d2k h0() {
      this.u9();
      com.aspose.slides.internal.o9b.f2 var1 = ((SlideSize)this.n5.getPresentation().getSlideSize()).n5().a6();
      return new d2k(this.k5.n5 / var1.l6(), this.k5.l6 / var1.k5());
   }

   private d2k c8() {
      this.u9();
      com.aspose.slides.internal.o9b.f2 var1 = ((SlideSize)this.n5.getPresentation().getSlideSize()).n5().a6();
      return new d2k(this.u3.n5 / var1.l6(), this.u3.l6 / var1.k5());
   }
}
