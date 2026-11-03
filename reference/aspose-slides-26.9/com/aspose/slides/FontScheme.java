package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public class FontScheme implements IFontScheme, r0g {
   private n1c l6;
   final com.aspose.slides.internal.v6g.n5<n1c> n5 = new FontScheme$1(this);
   private Fonts k5;
   private Fonts u3;
   private String a6;
   private d0d u9 = new d0d();
   private static final FontData h0 = new FontData("Arial");
   private r0g c8;
   private IPresentationComponent t2;
   private long s7 = 1L;
   private long x8 = 0L;

   FontScheme(r0g parentImmediate) {
      this.c8 = parentImmediate;
      v6v var2;
      if (this.k5().getPresentation() != null) {
         var2 = ((Presentation)this.k5().getPresentation()).z1().n5();
      } else {
         var2 = s3p.k5();
      }

      this.k5 = new Fonts(var2);
      this.u3 = new Fonts(var2);
      this.k5.n5.l6(new FontScheme$2(this));
      this.u3.n5.l6(new FontScheme$3(this));
   }

   @Override
   public final IFonts getMinor() {
      return this.u3;
   }

   @Override
   public final IFonts getMajor() {
      return this.k5;
   }

   @Override
   public final String getName() {
      return this.a6;
   }

   @Override
   public final void setName(String value) {
      this.a6 = value;
      this.a6();
   }

   final d0d n5() {
      return this.u9;
   }

   final void l6() {
      this.k5.setLatinFont(h0);
      this.k5.setEastAsianFont(h0);
      this.k5.setComplexScriptFont(h0);
      this.u3.setLatinFont(h0);
      this.u3.setEastAsianFont(h0);
      this.u3.setComplexScriptFont(h0);
      this.a6 = "Arial";
      this.a6();
   }

   final void n5(FontScheme var1) {
      this.k5.n5(var1.k5);
      this.u3.n5(var1.u3);
      this.a6 = var1.a6;
      if (var1.u9.n5() != null) {
         this.u9.n5(var1.u9.n5().u3());
      }

      this.a6();
   }

   final void n5(IFontSchemeEffectiveData var1) {
      this.k5.n5(var1.getMajor());
      this.u3.n5(var1.getMinor());
      this.a6 = var1.getName();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, i9l.class)) {
         this.u9.n5(((i9l)var1).n5);
         this.a6();
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.c8;
   }

   final IPresentationComponent k5() {
      if (this.t2 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.t2};
         d0u.n5(IPresentationComponent.class, this.c8, var1);
         this.t2 = var1[0];
      }

      return this.t2;
   }

   private void a6() {
      this.s7++;
      this.u9();
   }

   private void u9() {
      this.x8 = 0L;
      n1c var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long u3() {
      if ((this.x8 & 4294967295L) == 0L) {
         this.x8 = ((this.s7 & 4294967295L) + (this.u3.k5() & 4294967295L) & 4294967295L) + (this.k5.k5() & 4294967295L) & 4294967295L;
      }

      return this.x8;
   }

   // $VF: synthetic method
   static n1c n5(FontScheme var0, n1c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(FontScheme var0) {
      var0.u9();
   }
}
