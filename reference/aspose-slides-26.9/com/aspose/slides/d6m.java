package com.aspose.slides;

final class d6m extends m0 implements IPresentationAnimationPlayer, t4h {
   private final com.aspose.slides.internal.o9b.p8 n5 = new com.aspose.slides.internal.o9b.p8();
   private final j2m l6;
   private final e9 k5;

   d6m(com.aspose.slides.internal.o9b.p8 var1, e9 var2, j2m var3) {
      super(var3.k5());
      var1.k5(this.n5);
      this.k5 = var2;
      this.l6 = var3;
   }

   public final ISlide l6() {
      return (ISlide)this.k5.u3();
   }

   @Override
   public final void setTimePosition(double time) {
      this.k5.l6();
      this.l6.n5(time);
   }

   @Override
   public final IImage getFrame() {
      return u4i.n5(((Slide)this.l6()).t4().n5(this.n5.u3(), this.k5));
   }

   @Override
   public final com.aspose.slides.internal.o9b.l6 n5() {
      return ((Slide)this.l6()).t4().n5(this.n5.u3(), this.k5);
   }
}
