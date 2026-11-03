package com.aspose.slides;

final class b3q implements l8k {
   private Shape n5;
   private f6w l6;

   public b3q(Shape var1, f6w var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public final Shape l6() {
      return this.n5;
   }

   public final void n5(Shape var1) {
      this.n5 = var1;
   }

   public final void n5(f6w var1) {
      this.l6 = var1;
   }

   @Override
   public final void n5(float var1) {
      PictureFrame var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6(), PictureFrame.class);
      ((PictureFillFormat)var2.getFillFormat().getPictureFillFormat()).n5(com.aspose.slides.internal.v6g.k5.u3(var1 / 0.03F, 13));
      ((PictureFillFormat)var2.getFillFormat().getPictureFillFormat()).n5(((PictureFillFormat)var2.getFillFormat().getPictureFillFormat()).t2() + 1);
   }

   @Override
   public final void n5() {
   }
}
