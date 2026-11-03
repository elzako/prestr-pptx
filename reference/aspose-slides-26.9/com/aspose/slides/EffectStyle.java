package com.aspose.slides;

public class EffectStyle extends DomObject<EffectStyleCollection> implements IEffectStyle {
   private a3k l6;
   final com.aspose.slides.internal.v6g.n5<a3k> n5 = new EffectStyle$1(this);
   private final EffectFormat k5 = new EffectFormat(this);
   private final ThreeDFormat u3 = new ThreeDFormat(this);

   EffectStyle(EffectStyleCollection parentImmediate) {
      super(parentImmediate);
      this.k5.n5.l6(new EffectStyle$2(this));
      this.u3.n5.l6(new EffectStyle$3(this));
   }

   @Override
   public final IEffectFormat getEffectFormat() {
      return this.k5;
   }

   @Override
   public final IThreeDFormat getThreeDFormat() {
      return this.u3;
   }

   final void n5(EffectStyle var1) {
      this.k5.n5((IEffectFormat)var1.k5);
      this.u3.n5((IThreeDFormat)var1.u3);
   }

   final void n5(IEffectStyleEffectiveData var1) {
      this.k5.n5(var1.getEffectFormat());
      this.u3.n5(var1.getThreeDFormat());
   }

   final long n5() {
      return (this.k5.getVersion() & 4294967295L) + (this.u3.getVersion() & 4294967295L) & 4294967295L;
   }

   private void l6() {
      a3k var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static a3k n5(EffectStyle var0, a3k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(EffectStyle var0) {
      var0.l6();
   }
}
