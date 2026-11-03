package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class f6 {
   public static void n5(a9f var0, com.aspose.slides.internal.k4y.s8u var1) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.t4d var5 : var1.l6()) {
            t3u var6 = new t3u();
            e6r.n5(var6, var5);
            var0.n5(var6);
         }
      }
   }

   public static void l6(a9f var0, com.aspose.slides.internal.k4y.s8u var1) {
      if (var0 != null) {
         var1.n5(var0.n5() & 4294967295L);
         IGenericEnumerator var2 = var0.iterator();

         try {
            while (var2.hasNext()) {
               t3u var3 = (t3u)var2.next();
               e6r.l6(var3, var1.n5());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
