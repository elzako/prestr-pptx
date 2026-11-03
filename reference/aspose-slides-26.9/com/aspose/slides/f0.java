package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class f0 {
   public static void n5(Sequence var0, com.aspose.slides.internal.k4y.n8k var1, l4h var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sequence");
      }

      if (var1 == null) {
         throw new ArgumentNullException("seqElement");
      }

      if (var1.n5() != 6) {
         throw new InvalidOperationException();
      }

      List$Enumerator var3 = var1.l6().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            if (!"par".equals(var4.n5())) {
               throw new InvalidOperationException("par node container expected");
            }

            com.aspose.slides.internal.k4y.g4z var5 = (com.aspose.slides.internal.k4y.g4z)var4.l6();
            x9.n5(var0, var5, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
