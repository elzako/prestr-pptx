package com.aspose.slides;

class n6 implements IPresentationComponent, r0g {
   private p5 a6;
   final com.aspose.slides.internal.v6g.n5<p5> n5 = new n6$1(this);
   private MasterTheme u9;
   ColorScheme l6;
   FontScheme k5;
   FormatScheme u3;
   private long h0;

   n6(MasterTheme var1) {
      this.u9 = var1;
      this.l6 = new ColorScheme(this);
      this.k5 = new FontScheme(this);
      this.u3 = new FormatScheme(this);
      this.l6.n5.l6(new n6$2(this));
      this.k5.n5.l6(new n6$3(this));
      this.u3.n5.l6(new n6$4(this));
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u9;
   }

   final long n5() {
      if ((this.h0 & 4294967295L) == 0L) {
         this.h0 = ((this.l6.u3() & 4294967295L) + (this.k5.u3() & 4294967295L) & 4294967295L) + (this.u3.u3() & 4294967295L) & 4294967295L;
      }

      return this.h0;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.u9.getPresentation();
   }

   private void l6() {
      this.h0 = 0L;
      p5 var1 = this.a6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static p5 n5(n6 var0, p5 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static void n5(n6 var0) {
      var0.l6();
   }
}
