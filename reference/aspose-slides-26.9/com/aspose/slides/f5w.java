package com.aspose.slides;

class f5w {
   public static void n5(IFontScheme var0, com.aspose.slides.internal.k4y.e3m var1) {
      if (var1 != null) {
         b1u.n5(var0.getMajor(), var1.l6());
         b1u.n5(var0.getMinor(), var1.k5());
         ((FontScheme)var0).n5().n5(var1.u3());
         var0.setName(var1.n5());
      }
   }

   public static void l6(IFontScheme var0, com.aspose.slides.internal.k4y.e3m var1) {
      b1u.l6(var0.getMajor(), var1.l6());
      b1u.l6(var0.getMinor(), var1.k5());
      var1.n5(((FontScheme)var0).n5().n5());
      var1.n5(var0.getName());
   }
}
