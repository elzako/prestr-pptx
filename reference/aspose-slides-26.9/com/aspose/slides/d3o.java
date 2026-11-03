package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d3o {
   public static void n5(com.aspose.slides.internal.c8m.j8 var0, o9q var1, List<b8o> var2) {
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            b8o var4 = (b8o)var3.next();
            h0o var5 = var1.n5(var4.k5());
            if (var5 != null) {
               n5(var0.t9(), var5);
               if (var4.a6()) {
                  var0.t9().c8().l6(var0.t9().u9(var5.n5()));
               } else {
                  var0.e2().n5(var4.n5(), var4.l6(), var4.k5(), var4.u3());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.c8m.z6 var0, h0o var1) {
      if (var0.u9(var1.n5()) == null) {
         com.aspose.slides.internal.c8m.j8 var2 = var0.n5(var1.n5(), null, new com.aspose.slides.internal.c8m.n0(var1.k5(), var1.u3()), var1.l6());
         var0.h0(var2.l6());
         if (var1.a6() != null) {
            IGenericEnumerator var3 = var1.a6().iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.internal.c8m.r7 var4 = (com.aspose.slides.internal.c8m.r7)var3.next();
                  if (var2.e2() == null) {
                     var2.z1();
                  }

                  var2.e2().n5(var4.a6(), var4.u9(), var4.n5(), var4.h0());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }
   }
}
