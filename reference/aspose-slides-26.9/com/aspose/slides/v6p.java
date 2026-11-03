package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class v6p extends x0q {
   final void n5(IPresentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "theme".equals(this.s7().n3())) {
            this.l6(var1.getMasterTheme());
            this.k5().e2().addItem(this.t9(), var1.getMasterTheme());
         }
      }

      this.n3();
   }

   final void n5(IMasterThemeManager var1) {
      if (!this.k5().e2().containsKey(this.t9())) {
         this.n5();

         while (this.s7().u9()) {
            if (this.s7().s7() == 1 && "theme".equals(this.s7().n3())) {
               this.k5().z1().throwIfInterruptionRequested();
               this.l6(var1.getOverrideTheme());
               this.k5().e2().addItem(this.t9(), var1.getOverrideTheme());
               var1.setOverrideThemeEnabled(true);
            }
         }

         this.n3();
      } else {
         var1.setOverrideTheme((IMasterTheme)this.k5().e2().get_Item(this.t9()));
      }
   }

   final void l6(IMasterThemeManager var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "theme".equals(this.s7().n3())) {
            this.k5().z1().throwIfInterruptionRequested();
            this.l6(var1.getOverrideTheme());
            var1.setOverrideThemeEnabled(true);
         }
      }

      this.n3();
   }

   private void l6(IMasterTheme var1) {
      com.aspose.slides.internal.k4y.b6 var2 = new com.aspose.slides.internal.k4y.b6(this.s7());
      n5(var1, var2);
      var1.setName(var2.l6());
      g3j.n5(var1.getColorScheme(), var2.k5().n5());
      f5w.n5(var1.getFontScheme(), var2.k5().l6());
      v2z.n5(var1.getFormatScheme(), var2.k5().k5(), this.k5());
      if (var2.a6() != null) {
         for (com.aspose.slides.internal.k4y.c0 var6 : var2.a6().l6()) {
            IExtraColorScheme var7 = ((ExtraColorSchemeCollection)var1.getExtraColorSchemes()).n5(var1);
            e9b.n5(var7, var6);
         }
      }
   }

   private static void n5(IMasterTheme var0, com.aspose.slides.internal.k4y.b6 var1) {
      j4b var2 = ((MasterTheme)var0).n5();
      var2.n5(var1.u3());
      var2.n5(var1.u9());
      var2.n5(var1.h0());
      var2.l6(var1.k5().u3());
   }

   final void n5(IMasterTheme var1) {
      this.y4();
      com.aspose.slides.internal.k4y.b6 var2 = this.k5(var1);
      var2.n5(null, this.x8(), "theme");
      this.e2();
   }

   private com.aspose.slides.internal.k4y.b6 k5(IMasterTheme var1) {
      com.aspose.slides.internal.k4y.b6 var2 = new com.aspose.slides.internal.k4y.b6();
      var2.n5(var1.getName());
      g3j.l6(var1.getColorScheme(), var2.k5().n5());
      f5w.l6(var1.getFontScheme(), var2.k5().l6());
      v2z.n5(var1.getFormatScheme(), var2.k5().k5(), this.u3());
      if (var1.getExtraColorSchemes().size() > 0) {
         com.aspose.slides.internal.k4y.f1s var3 = var2.n5();
         IGenericEnumerator var4 = var1.getExtraColorSchemes().iterator();

         try {
            while (var4.hasNext()) {
               IExtraColorScheme var5 = (IExtraColorScheme)var4.next();
               e9b.n5(var5, new v6p$1(this, var3));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      l6(var1, var2);
      return var2;
   }

   private static void l6(IMasterTheme var0, com.aspose.slides.internal.k4y.b6 var1) {
      j4b var2 = ((MasterTheme)var0).n5();
      var1.n5(var2.n5());
      var1.n5(var2.l6());
      var1.n5(var2.k5());
      var1.k5().n5(var2.u3());
   }

   public v6p(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public v6p(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
