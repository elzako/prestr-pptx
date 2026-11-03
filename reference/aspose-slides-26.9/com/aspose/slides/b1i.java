package com.aspose.slides;

class b1i extends a4 {
   private byte n5;
   private IPortionFormat l6;
   private IPresentationComponent k5;
   private com.aspose.slides.ms.System.o5<Integer> u3 = new com.aspose.slides.ms.System.o5<>();
   private v6v a6;

   public b1i(IPortionFormat var1) {
      this.l6 = var1;
      this.a6 = s3p.n5(this.k5());
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5((float)(this.n5), (float)(var1))) {
         this.n5 = var1;
         this.a6();
      }
   }

   public final IFontData l6() {
      return !this.u3.l6() ? null : this.u3().n5(this.u3.n5() & 65535).l6();
   }

   public final void n5(IFontData var1) {
      if (var1 != null) {
         this.u3 = new com.aspose.slides.ms.System.o5<>(this.u3().n5(v6v.n5(var1.getFontName()), var1));
      } else {
         this.u3 = new com.aspose.slides.ms.System.o5<>();
      }

      this.a6();
   }

   final IPresentationComponent k5() {
      if (this.k5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.k5};
         d0u.n5(IPresentationComponent.class, (r0g)this.l6, var1);
         this.k5 = var1[0];
      }

      return this.k5;
   }

   final v6v u3() {
      return this.a6;
   }

   private void a6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, PVIObject.class)) {
         ((PVIObject)this.l6).k7();
      }
   }
}
