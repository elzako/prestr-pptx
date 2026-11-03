package com.aspose.slides;

class w5j {
   public final d2k n5 = new d2k();
   public final d2k l6 = new d2k();

   public w5j(IShape var1) {
      j8.n5(var1).n5(this.n5);
      j8.n5(((SlideSize)var1.getPresentation().getSlideSize()).n5().a6()).n5(this.l6);
   }

   public final d2k n5(com.aspose.slides.internal.o9b.w1 var1) {
      d2k var2 = j8.n5(var1.u3()).u3();
      var2.n5 = var2.n5 * this.l6.n5;
      var2.l6 = var2.l6 * this.l6.l6;
      return d2k.n5(this.n5, var2);
   }
}
