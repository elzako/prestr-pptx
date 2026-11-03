package com.aspose.slides;

class k9k extends j8h {
   final Shape k5;
   private final e9 u3;
   private int a6 = 1;
   private d2k u9 = new d2k();
   private d2k h0 = new d2k();
   private d2k c8 = new d2k();

   public k9k(Shape var1, e9 var2) {
      this.k5 = var1;
      this.u3 = var2;
      com.aspose.slides.internal.o9b.y1 var3 = var1.e5().x8().y4();
      this.u9 = new d2k(var3.x8(), var3.n3());
      this.h0 = new d2k(var3.s7(), var3.k5());
      IShapeFrame var4 = var1.getFrame();
      this.c8 = new d2k(var3.x8() - var4.getX(), var3.n3() - var4.getY());
   }

   @Override
   public final d2k n5() {
      return this.u9;
   }

   @Override
   public final d2k l6() {
      return this.h0;
   }

   final void k5() {
      this.a6++;
   }

   public final void u3() {
      if (this.a6 > 0) {
         this.a6--;
         if (this.a6 == 0) {
            this.u3.n5(this);
         }
      }
   }

   final void n5(d2k var1) {
      d2k.n5(var1, this.c8).n5(this.u9);
      if (this.n5 != null) {
         this.n5.invoke(this);
      }
   }
}
