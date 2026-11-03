package com.aspose.slides;

class k3 {
   static void n5(IOverrideThemeManager var0, t5w var1) {
      var0.getOverrideTheme().clear();
      com.aspose.slides.internal.c8m.r7[] var2 = var1.k7().n5(com.aspose.slides.internal.c8m.b1.n5);
      if (var2.length > 0) {
         x8c var3 = new x8c(var2[0].l6(), var1);
         var3.n5(var0);
      }
   }

   static void n5(IOverrideThemeManager var0, com.aspose.slides.internal.c8m.a2 var1, g6c var2) {
      if (var0.isOverrideThemeEnabled()) {
         e1e.n5(var0.getOverrideTheme(), var2);
         var1.l6(var2.u3().get_Item(var0.getOverrideTheme()));
      }
   }
}
