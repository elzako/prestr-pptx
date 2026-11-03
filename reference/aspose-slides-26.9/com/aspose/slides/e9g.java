package com.aspose.slides;

class e9g extends h2v {
   private l1z n5;

   final l1z u3() {
      return this.n5;
   }

   final void n5(l1z var1) {
      this.n5 = var1;
   }

   public e9g(t9z var1) {
      super(var1);
      IMarker var2 = var1.s7().l6();
      if (var2 == null) {
         var2 = var1.y4().u9().getMarker();
      }

      IMarker var3 = var2;
      this.n5(new l1z(var3, var1.y4()));
      this.n5((v6g)this.u3());
   }

   @Override
   protected void n5(z5 var1) {
      this.u3().n3(new z5(100.0F, 100.0F));
      this.k5(this.u3().d2());
      this.u3(this.u3().d5());
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6(z5 var1) {
      this.u3().t1();
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.i1().k5());
   }

   @Override
   com.aspose.slides.internal.o9b.w1 n5(q8o var1) {
      return new com.aspose.slides.internal.o9b.w1(this.i1().l6(), this.i1().k5());
   }
}
