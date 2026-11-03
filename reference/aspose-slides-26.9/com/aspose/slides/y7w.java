package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class y7w {
   public static void n5(ICommonSlideViewProperties var0, com.aspose.slides.internal.k4y.d2c var1) {
      var0.setScale((int)var1.n5().l6().n5().n5());
      var0.setVariableScale(var1.n5().n5());
      com.aspose.slides.internal.k4y.v5j var2 = var1.l6();
      if (var2 != null && var2.n5() != null) {
         DrawingGuidesCollection var3 = (DrawingGuidesCollection)var0.getDrawingGuides();

         for (com.aspose.slides.internal.k4y.p4b var7 : var2.n5()) {
            var3.n5(new DrawingGuide(var7.n5(), com.aspose.slides.internal.n2d.t2.x8(var7.l6() * 12700.0)));
         }
      }
   }

   public static void l6(ICommonSlideViewProperties var0, com.aspose.slides.internal.k4y.d2c var1) {
      com.aspose.slides.internal.k4y.x9u var2 = var1.n5();
      var2.l6().n5().n5(var0.getScale());
      var2.l6().l6().n5(var0.getScale());
      var2.l6().n5().l6(100L);
      var2.l6().l6().l6(100L);
      var2.n5(var0.getVariableScale());
      if (com.aspose.slides.ms.System.d2.k5(var2.k5().n5()) || com.aspose.slides.ms.System.d2.k5(var2.k5().l6())) {
         var2.k5().n5(0.0);
         var2.k5().l6(0.0);
      }

      com.aspose.slides.internal.k4y.v5j var3 = new com.aspose.slides.internal.k4y.v5j();
      IGenericEnumerator var4 = var0.getDrawingGuides().iterator();

      try {
         while (var4.hasNext()) {
            IDrawingGuide var5 = (IDrawingGuide)var4.next();
            com.aspose.slides.internal.k4y.p4b var6 = new com.aspose.slides.internal.k4y.p4b();
            var6.n5(var5.getOrientation());
            var6.n5(com.aspose.slides.internal.n2d.t2.n3(var5.getPosition()) / 12700.0);
            var3.n5(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var1.n5(var3);
   }
}
