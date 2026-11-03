package com.aspose.slides;

class h1o {
   public static void n5(IGeometryShape var0, com.aspose.slides.internal.k4y.d9m var1) {
      if (var1 != null) {
         ((GeometryShape)var0).z1();
         IShapeStyle var2 = var0.getShapeStyle();
         if (var1.n5() != null) {
            c4i.n5(var2.getLineColor(), var1.n5().l6());
            var2.setLineStyleIndex((int)(var1.n5().n5() & 65535L));
         }

         if (var1.l6() != null) {
            c4i.n5(var2.getFillColor(), var1.l6().l6());
            var2.setFillStyleIndex((short)var1.l6().n5());
         }

         if (var1.k5() != null) {
            c4i.n5(var2.getEffectColor(), var1.k5().l6());
            var2.setEffectStyleIndex(var1.k5().n5());
         }

         if (var1.u3() != null) {
            c4i.n5(var2.getFontColor(), var1.u3().l6());
            var2.setFontCollectionIndex(var1.u3().n5());
         }
      }
   }

   public static void n5(IShapeStyle var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d9m> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.d9m var2 = (com.aspose.slides.internal.k4y.d9m)var1.invoke();
         c4i.n5(var0.getLineColor(), new h1o$1(var2));
         var2.n5().n5(var0.getLineStyleIndex() & 65535);
         c4i.n5(var0.getFillColor(), new h1o$2(var2));
         var2.l6().n5(var0.getFillStyleIndex() & 4294967295L);
         c4i.n5(var0.getEffectColor(), new h1o$3(var2));
         var2.k5().n5(var0.getEffectStyleIndex());
         c4i.n5(var0.getFontColor(), new h1o$4(var2));
         var2.u3().n5(var0.getFontCollectionIndex());
      }
   }
}
