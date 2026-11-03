package com.aspose.slides;

class h1j {
   public static void n5(IUpDownBarsManager var0, com.aspose.slides.internal.k4y.h0i var1, t5w var2) {
      if (var1 == null) {
         var0.setUpDownBars(false);
      } else {
         if (var1.u3() != null) {
            var0.setGapWidth(var1.u3().n5() & 65535);
         }

         if (var1.a6() != null) {
            k5r.n5(var0.getUpBarsFormat(), var1.a6().l6(), var2);
         }

         if (var1.u9() != null) {
            k5r.n5(var0.getDownBarsFormat(), var1.u9().l6(), var2);
         }

         var0.setUpDownBars(true);
         q5m var3 = ((UpDownBarsManager)var0).n5();
         var3.n5(var1.h0());
      }
   }

   public static void n5(IUpDownBarsManager var0, com.aspose.slides.internal.k4y.h0i var1, g6c var2) {
      var1.n5().n5(var0.getGapWidth() & 65535);
      if (k5r.n5(var0.getUpBarsFormat(), null)) {
         k5r.n5(var0.getUpBarsFormat(), new h1j$1(var1), var2, null, false);
      }

      if (k5r.n5(var0.getDownBarsFormat(), null)) {
         k5r.n5(var0.getDownBarsFormat(), new h1j$2(var1), var2, null, false);
      }

      q5m var3 = ((UpDownBarsManager)var0).n5();
      var1.n5(var3.n5());
   }
}
