package com.aspose.slides;

final class i9l implements IFontSchemeEffectiveData, i7b {
   private final c5z l6;
   private final c5z k5;
   private String u3 = null;
   final d0d n5;

   i9l() {
      this(null);
   }

   i9l(FontScheme var1) {
      Fonts var2 = null;
      Fonts var3 = null;
      if (var1 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var1.getName())) {
            this.u3 = var1.getName();
         }

         var2 = (Fonts)var1.getMajor();
         var3 = (Fonts)var1.getMinor();
         this.n5 = new d0d();
         this.n5.n5(var1.n5());
      } else {
         this.n5 = new d0d();
      }

      this.l6 = new c5z(var2);
      this.k5 = new c5z(var3);
   }

   @Override
   public final IFontsEffectiveData getMinor() {
      return this.k5;
   }

   @Override
   public final IFontsEffectiveData getMajor() {
      return this.l6;
   }

   @Override
   public final String getName() {
      return this.u3;
   }

   final void n5(i9l var1, FontScheme var2) {
      c5z var3 = null;
      c5z var4 = null;
      if (var1 != null) {
         var3 = var1.l6;
         var4 = var1.k5;
         this.u3 = var1.u3;
      }

      Fonts var5 = null;
      Fonts var6 = null;
      if (var2 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var2.getName())) {
            this.u3 = var2.getName();
         }

         var5 = (Fonts)var2.getMajor();
         var6 = (Fonts)var2.getMinor();
      }

      this.l6.n5(var3, var5);
      this.k5.n5(var4, var6);
      if (var2 != null) {
         this.n5.n5(var2.n5());
      } else if (var1 != null) {
         this.n5.n5(var1.n5);
      }
   }
}
