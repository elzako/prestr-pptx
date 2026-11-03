package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class c1b {
   public static void n5(l1h var0, com.aspose.slides.internal.k4y.z9o var1) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.w3q var5 : var1.l6()) {
            h6g var6 = new h6g();
            var6.n5(var5.l6());
            var6.n5(var5.n5());
            var0.n5(var6);
         }
      }
   }

   public static void l6(l1h var0, com.aspose.slides.internal.k4y.z9o var1) {
      if (var0 != null) {
         var1.n5(var0.n5() & 4294967295L);
         IGenericEnumerator var2 = var0.iterator();

         try {
            while (var2.hasNext()) {
               h6g var3 = (h6g)var2.next();
               com.aspose.slides.internal.k4y.w3q var4 = var1.n5();
               var4.n5(var3.n5());
               var4.n5(var3.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
