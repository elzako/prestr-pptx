package com.aspose.slides;

final class j7h extends g8<EffectStyle, j7h> implements IEffectStyleEffectiveData {
   d0e n5 = new d0e((EffectFormat)null);
   h3g l6 = new h3g((ThreeDFormat)null);

   final void n5() {
      this.n5.u9();
      this.l6.u9();
   }

   @Override
   public final IEffectFormatEffectiveData getEffectFormat() {
      return this.n5;
   }

   @Override
   public final IThreeDFormatEffectiveData getThreeDFormat() {
      return this.l6;
   }

   final void n5(i7b var1) {
      if (var1 != null) {
         j7h var2 = (j7h)var1;
         this.n5.n5((i7b)var2.n5);
         this.l6.n5((i7b)var2.l6);
      }
   }

   void n5(i7b var1, EffectStyle var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(EffectStyle var1) {
      if (var1 != null) {
         this.n5.l6((EffectFormat)var1.getEffectFormat());
         this.l6.l6((ThreeDFormat)var1.getThreeDFormat());
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.n5.n5(var1, var2);
      this.l6.n5(var1, var2);
   }

   boolean n5(j7h var1) {
      return var1 == null ? false : this.n5.n5(var1.n5) && this.l6.n5(var1.l6);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.j7h)recoveredArg);
   }
}
