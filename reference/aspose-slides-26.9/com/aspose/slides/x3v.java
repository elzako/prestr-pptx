package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class x3v {
   public static void n5(MasterSlide var0, com.aspose.slides.internal.k4y.u9t var1, h6j var2) {
      var0.setName(var1.n5());
      var0.getThemeManager().getOverrideTheme().setName(var1.n5());
      if (t2f.k5(var1.k5())) {
         n7n.n5(var0, var1.k5(), var2);
      }

      var2.n5(new m1g(var0, null));
      List$Enumerator var3 = var1.u3().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            d7g.n5((ShapeCollection)var0.getShapes(), var4, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var0.z8();
   }
}
