package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class x9 {
   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.g4z var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sequence");
      }

      if (var1 == null) {
         throw new ArgumentNullException("parElement");
      }

      if (var1.u3() != 0 && var1.u3() != 1) {
         Effect var3 = h2.n5(var0, var1, var2);
         var3.k5().l6(var0.l6().n5().n3());
      }

      List$Enumerator var8 = var1.n3().iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var8.next();
            if ("par".equals(var4.n5())) {
               n5(var0, (com.aspose.slides.internal.k4y.g4z)var4.l6(), var2);
            }

            if ("iterate".equals(var4.n5())) {
               n5(var0, (com.aspose.slides.internal.k4y.p8u)var4.l6(), var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.p8u var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sequence");
      }

      if (var1 == null) {
         throw new ArgumentNullException("iterateElement");
      }

      if (var1.u3() != 0 && var1.u3() != 1) {
         Effect var3 = h2.n5(var0, var1, var2);
         var3.k5().l6(var0.l6().n5().n3());
      }

      List$Enumerator var8 = var1.x8().iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var8.next();
            if ("par".equals(var4.n5())) {
               n5(var0, (com.aspose.slides.internal.k4y.g4z)var4.l6(), var2);
            }

            if ("iterate".equals(var4.n5())) {
               n5(var0, (com.aspose.slides.internal.k4y.p8u)var4.l6(), var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }
}
