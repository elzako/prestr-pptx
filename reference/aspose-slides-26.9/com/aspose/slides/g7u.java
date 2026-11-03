package com.aspose.slides;

class g7u extends j8h {
   private d2k u3 = new d2k();
   private d2k a6 = new d2k();
   private com.aspose.slides.ms.System.n5<j8h> u9;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.n5<j8h>> k5 = new g7u$1(this);

   public g7u(Paragraph var1, Shape var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var1.l6().y4();
      IShapeFrame var4 = var2.getFrame();
      var3.k5(var3.x8() + var4.getX());
      var3.u3(var3.n3() + var4.getY());
      this.u3 = new d2k(var3.x8(), var3.n3());
      this.n5(new d2k(var3.s7(), var3.k5()));
   }

   @Override
   public final d2k n5() {
      return this.u3;
   }

   @Override
   public final d2k l6() {
      return this.a6.u3();
   }

   private void n5(d2k var1) {
      this.a6 = var1.u3();
   }

   public final s4s k5() {
      return new s4s(this.u3.u3(), this.l6().u3());
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.n5 n5(g7u var0, com.aspose.slides.ms.System.n5 var1) {
      return var0.u9 = var1;
   }
}
