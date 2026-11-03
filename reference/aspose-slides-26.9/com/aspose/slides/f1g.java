package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class f1g {
   public static void n5(IPointCollection var0, com.aspose.slides.internal.k4y.f3w var1) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.x8x var5 : var1.l6()) {
            float var6 = Float.NaN;
            if (com.aspose.slides.ms.System.d1.n5(var5.l6())) {
               var6 = 0.0F;
            } else if (var5.l6().charAt(var5.l6().length() - 1) == '%') {
               var6 = (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var5.l6(), 0, var5.l6().length() - 1));
            } else if (!"indefinite".equals(var5.l6())) {
               var6 = (float)com.aspose.slides.ms.System.Xml.f4.t9(var5.l6()) / 1000.0F;
            }

            String var7 = var5.k5() == null ? "" : var5.k5();
            if (var5.u3() != null) {
               ((PointCollection)var0).n5(new Point(var6, j2b.n5(var5.u3()), var7));
            }
         }
      }
   }

   public static void l6(IPointCollection var0, com.aspose.slides.internal.k4y.f3w var1) {
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IPoint var3 = (IPoint)var2.next();
            com.aspose.slides.internal.k4y.x8x var4 = var1.n5();
            if (!com.aspose.slides.ms.System.n1.k5(var3.getTime())) {
               var4.n5(
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var3.getTime() * 1000.0F), 14))
               );
            }

            var4.l6(var3.getFormula());
            j2b.n5(var3.getValue(), var4.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
