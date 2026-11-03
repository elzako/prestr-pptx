package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class x9m {
   public static k3k n5(com.aspose.slides.internal.k4y.e8x var0, t5w var1, MathPortion var2) {
      k3k var3 = new k3k();
      f0w var4 = new f0w();
      List$Enumerator var5 = var0.a6().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
            var3.l6().addItem(var4.n5(var6));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var0.k5() != null) {
         var3.n5(new z4a());
         u3b.n5(var3.k5(), var0.k5(), var1);
      }

      if (var0.u3() != null) {
         PortionFormat var10 = (PortionFormat)var3.a6();
         var10.n5(var2);
         w5d.n5(var3.a6(), var0.u3(), var1);
      }

      return var3;
   }
}
