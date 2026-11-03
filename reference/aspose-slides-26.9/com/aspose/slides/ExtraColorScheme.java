package com.aspose.slides;

public class ExtraColorScheme implements IExtraColorScheme, r0g {
   private u1u l6;
   final com.aspose.slides.internal.v6g.n5<u1u> n5 = new ExtraColorScheme$1(this);
   private ColorScheme k5;
   private m0l u3;
   private r0g a6;
   private long u9 = 0L;

   ExtraColorScheme(ExtraColorSchemeCollection parentImmediate) {
      this(parentImmediate, false);
   }

   ExtraColorScheme(ExtraColorSchemeCollection parentImmediate, boolean colorMappingOn) {
      this.a6 = parentImmediate;
      this.k5 = new ColorScheme(this);
      this.u3 = new m0l(colorMappingOn);
      this.k5.n5.l6(new ExtraColorScheme$2(this));
   }

   @Override
   public final String getName() {
      return this.k5.n5();
   }

   @Override
   public final IColorScheme getColorScheme() {
      return this.k5;
   }

   final m0l n5() {
      return this.u3;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   final long l6() {
      if ((this.u9 & 4294967295L) == 0L) {
         this.u9 = (this.k5.u3() & 4294967295L) + (this.u3.k5() & 4294967295L) & 4294967295L;
      }

      return this.u9;
   }

   private void k5() {
      this.u9 = 0L;
      u1u var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static u1u n5(ExtraColorScheme var0, u1u var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(ExtraColorScheme var0) {
      var0.k5();
   }
}
