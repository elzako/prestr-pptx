package com.aspose.slides;

final class t7d extends w9s<FillOverlay, t7d> implements IFillOverlayEffectiveData {
   private f6a l6 = new f6a(this);
   private int k5 = 0;
   static final t7d n5 = l6();

   t7d(FillOverlay var1) {
      super(var1, FillOverlay.class, t7d.class);
   }

   @Override
   public final int getBlend() {
      return this.k5;
   }

   @Override
   public final IFillFormatEffectiveData getFillFormat() {
      return this.l6;
   }

   static t7d l6() {
      t7d var0 = new t7d(null);
      var0.l6 = f6a.u9;
      var0.k5 = 0;
      return var0;
   }

   void n5(i7b var1, FillOverlay var2) {
      t7d var3 = (t7d)var1;
      this.k5 = var3.k5;
      this.l6.n5((i7b)var3.l6);
      if (var2.getBlend() != 0) {
         this.k5 = var2.getBlend();
      }

      this.l6.k5((FillFormat)var2.getFillFormat());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.l6.n5(var1, var2);
   }

   boolean n5(t7d var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1) ? true : this.getBlend() == var1.getBlend() && this.l6.k5(var1.l6);
      }
   }

   @Override
   public c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(), ' ', this.l6.toString(), ' ', com.aspose.slides.ms.System.s3.n5(FillBlendMode.class, this.k5)});
   }
}
