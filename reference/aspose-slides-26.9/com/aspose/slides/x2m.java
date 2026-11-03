package com.aspose.slides;

class x2m {
   public static void n5(IChart var0, com.aspose.slides.internal.k4y.l6 var1) {
      if (var1 == null) {
         var0.setStyle(1);
      } else {
         if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/drawing/2007/8/2/chart") && var1.u3() != null) {
            var0.setStyle((var1.u3().n5() & 255) - 1 - 100);
         } else {
            var0.setStyle((var1.k5().n5() & 255) - 1);
         }
      }
   }

   public static void l6(IChart var0, com.aspose.slides.internal.k4y.l6 var1) {
      var1.l6().n5((byte)(((byte)var0.getStyle() & 255) + 1 + 100));
      var1.n5().n5((byte)(((byte)var0.getStyle() & 255) + 1));
   }
}
