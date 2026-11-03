package com.aspose.slides;

class v4 {
   static IShape n5(com.aspose.slides.internal.k4y.j9u var0, IGroupShape var1, i1x var2) {
      com.aspose.slides.internal.k4y.g7 var3 = null;
      IShape var4 = null;

      for (com.aspose.slides.internal.k4y.w1j var8 : var0.k5()) {
         if (var8.n5().size() > 0) {
            var3 = var8.n5().get_Item(0);
            break;
         }
      }

      if (var0.u3() != null) {
         com.aspose.slides.internal.k4y.k8l var9 = var0.u3();
         if (var9.n5().length > 0) {
            var2.n5().n5(true);
            com.aspose.slides.internal.k4y.g7 var11 = var9.n5()[0];
            if (var3 == null) {
               var3 = var11;
            } else if (com.aspose.slides.ms.System.d1.a6(var11.n5(), "sp")) {
               ShapeCollection var12 = (ShapeCollection)var1.getShapes();
               var4 = new AutoShape(var12);
               u4.n5((AutoShape)var4, (com.aspose.slides.internal.k4y.q0)var11.l6(), var2);
            } else {
               var4 = r3m.n5(var11, var1, var2);
               if (var1.getShapes().indexOf(var4) >= 0) {
                  var1.getShapes().remove(var4);
               }
            }
         }
      }

      if (var3 == null) {
         return null;
      }

      Shape var10 = (Shape)r3m.n5(var3, var1, var2);
      if (var10 != null) {
         var2.n5(var10);
         var2.n5().n5(false);
         var10.n5((Shape)var4);
      }

      return var10;
   }

   static void n5(AutoShape var0, com.aspose.slides.internal.k4y.j9u var1, n4i var2, j8m var3) {
      com.aspose.slides.internal.k4y.w1j var4 = var1.n5();
      var4.l6("a14");
      com.aspose.slides.internal.k4y.x1u var5 = (com.aspose.slides.internal.k4y.x1u)var4.n5("sp").l6();
      u4.n5(var0, var5, var2, var3);
      com.aspose.slides.internal.k4y.k8l var6 = var1.l6();
      com.aspose.slides.internal.k4y.x1u var7 = (com.aspose.slides.internal.k4y.x1u)var6.n5("sp").l6();
      if (var0.w1() == null || var0.l6() != null && var0.l6().c8()) {
         var0.a6();
      }

      u4.n5((IAutoShape)var0.w1(), var7, var2, var3);
      com.aspose.slides.internal.k4y.r9o var8 = var5.n5().k5().h0();
      if (var8 != null && var8.u3() != null) {
         com.aspose.slides.internal.k4y.r9o var9 = var7.n5().k5().h0();
         if (var9 == null) {
            var9 = var7.n5().k5().l6();
            com.aspose.slides.internal.k4y.w4m var10 = var9.l6();
            var10.n5(var8.u3().n5());
         }
      }
   }
}
