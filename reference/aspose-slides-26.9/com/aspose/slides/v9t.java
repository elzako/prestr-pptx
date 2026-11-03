package com.aspose.slides;

class v9t {
   public static void n5(IMarker var0, com.aspose.slides.internal.k4y.x7u var1, t5w var2) {
      var0.setSymbol(-1);
      if (var1 != null) {
         if (var1.u3() != null) {
            var0.setSymbol(var1.u3().n5());
         }

         if (var1.a6() != null) {
            var0.setSize(var1.a6().n5() & 65535);
         }

         k5r.n5(var0.getFormat(), var1.u9(), var2);
         x2v var3 = ((Marker)var0).n5();
         var3.n5(var1.h0());
      }
   }

   public static void n5(IMarker var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.x7u> var1, g6c var2) {
      if (var1 != null && n5(var0)) {
         com.aspose.slides.internal.k4y.x7u var3 = (com.aspose.slides.internal.k4y.x7u)var1.invoke();
         if (var3 != null) {
            if (var0.getSymbol() != -1) {
               var3.n5().n5(var0.getSymbol());
            }

            if (var0.getSize() != 5 && var0.getSize() != 0) {
               var3.l6().n5(var0.getSize() & 65535);
            }

            k5r.n5(var0.getFormat(), new v9t$1(var3), var2, null, false);
            x2v var4 = ((Marker)var0).n5();
            var3.n5(var4.n5());
         }
      }
   }

   static boolean n5(IMarker var0) {
      return k5r.n5(var0.getFormat(), null) || var0.getSize() != 0 || var0.getSymbol() != -1;
   }
}
