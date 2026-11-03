package com.aspose.slides;

class PropertyEffectPlaying$n5 {
   private final e9 n5;
   private final String l6;
   private final Shape k5;

   public PropertyEffectPlaying$n5(e9 var1, Shape var2, String var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   public final void n5(float var1) {
      switch (PropertyEffectPlaying.n5().n5(this.l6)) {
         case 0:
         case 1:
            this.n5.n5((IShape)this.k5, true, this.n5(var1, true));
            break;
         case 2:
         case 3:
            this.n5.n5((IShape)this.k5, false, this.n5(var1, false));
            break;
         case 4:
         case 5:
            this.n5.n5(this.k5, true, this.l6(var1, true));
            break;
         case 6:
         case 7:
            this.n5.n5(this.k5, false, this.l6(var1, false));
            break;
         case 8:
            this.k5.setRotation(var1);
      }
   }

   private float n5(float var1, boolean var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)this.k5.getPresentation().getSlideSize()).n5().a6();
      IShapeFrame var4 = this.k5.getFrame();
      return var2 ? var1 * var3.l6() - var4.getWidth() / 2.0F : var1 * var3.k5() - var4.getHeight() / 2.0F;
   }

   private float l6(float var1, boolean var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)this.k5.getPresentation().getSlideSize()).n5().a6();
      return var2 ? var1 * var3.l6() : var1 * var3.k5();
   }
}
