package com.aspose.slides;

class x8c extends x0q {
   final void n5(IOverrideThemeManager var1) {
      if (!this.k5().e2().containsKey(this.t9())) {
         this.n5();

         while (this.s7().u9()) {
            if (this.s7().s7() == 1 && "themeOverride".equals(this.s7().n3())) {
               com.aspose.slides.internal.k4y.v7 var2 = new com.aspose.slides.internal.k4y.v7(this.s7());
               IOverrideTheme var3 = var1.getOverrideTheme();
               this.k5().e2().addItem(this.t9(), var3);
               if (var2.u3() != null) {
                  ((OverrideTheme)var3).initColorScheme();
                  g3j.n5(var3.getColorScheme(), var2.u3());
               }

               if (var2.a6() != null) {
                  ((OverrideTheme)var3).initFontScheme();
                  f5w.n5(var3.getFontScheme(), var2.a6());
               }

               if (var2.u9() != null) {
                  ((OverrideTheme)var3).initFormatScheme();
                  v2z.n5(var3.getFormatScheme(), var2.u9(), this.k5());
               }
            }
         }

         this.n3();
      } else {
         var1.setOverrideTheme((IOverrideTheme)this.k5().e2().get_Item(this.t9()));
         this.t9().n5(true);
      }
   }

   final void n5(IOverrideTheme var1) {
      this.y4();
      com.aspose.slides.internal.k4y.v7 var2 = new com.aspose.slides.internal.k4y.v7();
      if (var1.getColorScheme() != null) {
         g3j.l6(var1.getColorScheme(), var2.n5());
      }

      if (var1.getFontScheme() != null) {
         f5w.l6(var1.getFontScheme(), var2.l6());
      }

      if (var1.getFormatScheme() != null) {
         v2z.n5(var1.getFormatScheme(), var2.k5(), this.u3());
      }

      var2.n5(null, this.x8(), "themeOverride");
      this.e2();
   }

   public x8c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public x8c(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
