package com.aspose.slides;

class c7e extends DomObject<z2x> {
   private long n5;
   private final l0n l6 = new l0n();
   private byte k5 = -1;
   private byte u3 = -1;
   private byte a6 = 0;
   private final Fonts h0;
   private final ColorFormat c8;
   private byte t2 = 0;
   private final ColorFormat s7;

   c7e(z2x var1) {
      super(var1);
      this.h0 = new Fonts(((Presentation)this.u9.getPresentation()).z1().n5());
      this.c8 = new ColorFormat(this);
      this.s7 = new ColorFormat(this);
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
      this.s7();
   }

   public final byte l6() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
      this.s7();
   }

   public final byte k5() {
      return this.a6;
   }

   public final void k5(byte var1) {
      this.a6 = var1;
      this.s7();
   }

   public final IFonts u3() {
      return this.h0;
   }

   public final IColorFormat a6() {
      return this.c8;
   }

   public final byte u9() {
      return this.t2;
   }

   public final void u3(byte var1) {
      this.t2 = var1;
      this.s7();
   }

   public final IColorFormat h0() {
      return this.s7;
   }

   public final boolean c8() {
      return this.a6 != 0 || this.s7.getColorType() != -1 || this.k5 != -1 || this.u3 != -1 || this.t2().n5() != null;
   }

   final l0n t2() {
      return this.l6;
   }

   final void n5(c7e var1) {
      if (var1 != null) {
         this.k5 = var1.n5();
         this.u3 = var1.l6();
         this.c8.copyFrom(var1.a6());
         this.s7.copyFrom(var1.h0());
         this.a6 = var1.k5();
         this.t2 = var1.u9();
         this.h0.n5((Fonts)var1.u3());
         if (var1.t2().n5() != null) {
            this.l6.n5(var1.t2().n5().u3());
         }

         this.s7();
      }
   }

   final void l6(c7e var1) {
      if (var1 != null) {
         if (var1.n5() != -1) {
            this.k5 = var1.n5();
         }

         if (var1.l6() != -1) {
            this.u3 = var1.l6();
         }

         if (((ColorFormat)var1.a6()).getColorType() != -1) {
            this.c8.copyFrom(var1.a6());
         }

         if (((ColorFormat)var1.h0()).getColorType() != -1) {
            this.s7.copyFrom(var1.h0());
         }

         if (var1.k5() != 0) {
            this.a6 = var1.k5();
         }

         if (var1.u9() != 0) {
            this.t2 = var1.u9();
         }

         if (var1.u3().getLatinFont() != null || var1.u3().getEastAsianFont() != null || var1.u3().getComplexScriptFont() != null) {
            this.h0.n5((Fonts)var1.u3());
         }

         if (var1.t2().n5() != null) {
            this.l6.n5(var1.t2().n5().u3());
         }

         this.s7();
      }
   }

   private void s7() {
      this.n5++;
   }
}
