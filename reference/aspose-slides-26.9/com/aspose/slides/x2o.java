package com.aspose.slides;

class x2o {
   public static void n5(IChart var0, com.aspose.slides.internal.k4y.e5q var1, t5w var2) {
      if (var1 == null) {
         var0.setDataTable(false);
      } else {
         var0.setDataTable(true);
         IDataTable var3 = var0.getChartDataTable();
         if (var1.h0() != null) {
            var3.setBorderHorizontal(var1.h0().n5());
         }

         if (var1.c8() != null) {
            var3.setBorderVertical(var1.c8().n5());
         }

         if (var1.t2() != null) {
            var3.setBorderOutline(var1.t2().n5());
         }

         if (var1.s7() != null) {
            var3.setShowLegendKey(var1.s7().n5());
         }

         k5r.n5(var3.getFormat(), var1.x8(), var2);
         y4k.n5(var3.getTextFormat(), var1.n3(), var2);
         ((DataTable)var3).n5().n5(var1.y4());
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.e5q> var1, g6c var2) {
      if (var0.hasDataTable()) {
         com.aspose.slides.internal.k4y.e5q var3 = (com.aspose.slides.internal.k4y.e5q)var1.invoke();
         IDataTable var4 = var0.getChartDataTable();
         var3.n5().n5(var4.hasBorderHorizontal());
         var3.l6().n5(var4.hasBorderVertical());
         var3.k5().n5(var4.hasBorderOutline());
         var3.u3().n5(var4.getShowLegendKey());
         k5r.n5(var4.getFormat(), new x2o$1(var3), var2, null, false);
         y4k.n5(var4.getTextFormat(), new x2o$2(var3), var2);
         var3.n5(((DataTable)var4).n5().n5());
      }
   }
}
