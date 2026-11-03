package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class o2n {
   public static void n5(g8z var0, com.aspose.slides.internal.k4y.k4 var1, t5w var2) {
      for (com.aspose.slides.internal.k4y.a1k var6 : var1.k5()) {
         if (!var0.k5(var6.t9().k5())) {
            z2x var7 = var0.n5(var6.t9().k5(), var6.z1());
            s2a.n5(var7, var6, var2);
         }
      }

      var0.n5().n5(var1.l6().k5());
   }

   public static void n5(g8z var0, com.aspose.slides.internal.k4y.k4 var1, g6c var2) {
      var1.n5(var0.n5().l6().k5());
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            z2x var4 = (z2x)var3.next();
            s2a.n5(var4, var1.n5(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
