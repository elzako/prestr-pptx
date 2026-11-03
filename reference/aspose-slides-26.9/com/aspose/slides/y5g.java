package com.aspose.slides;

class y5g {
   private final v6v n5;
   private final int l6;
   private final IFontData k5;
   private final com.aspose.slides.ms.System.o5<Integer> u3 = new com.aspose.slides.ms.System.o5<>();
   private IFontData a6;
   private boolean u9;
   private IFontData h0;
   private int c8 = 1;

   public y5g(v6v var1, int var2, IFontData var3, com.aspose.slides.ms.System.o5<Integer> var4, boolean var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      var4.n5(this.u3);
      this.u9 = var5;
   }

   public final int n5() {
      return this.l6;
   }

   public final IFontData l6() {
      if (this.a6()) {
         if (this.c8 == 1) {
            return this.h0;
         }

         if (this.c8 == 0 && this.n5.n5() != null && !this.n5.n5().n5((FontData)this.k5).u3()) {
            return this.h0;
         }
      }

      return this.u3() ? this.a6 : this.k5;
   }

   public final com.aspose.slides.ms.System.o5<Integer> k5() {
      return this.u3;
   }

   public final boolean u3() {
      return this.a6 != null;
   }

   public final boolean a6() {
      return this.h0 != null;
   }

   public final void n5(IFontData var1) {
      this.a6 = var1;
   }

   public final void l6(IFontData var1) {
      this.h0 = var1;
   }

   public final void n5(int var1) {
      this.c8 = var1;
   }

   public final void u9() {
      this.a6 = null;
   }

   public final boolean h0() {
      return com.aspose.slides.ms.System.d1.t2(this.k5.getFontName(), "+m");
   }

   public final boolean c8() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }
}
