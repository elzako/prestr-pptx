package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class b2l extends d5 {
   @Override
   public boolean u3() {
      return true;
   }

   @Override
   public boolean l6() {
      return true;
   }

   @Override
   public boolean n5(k6a var1) {
      var1.c8().k5(var1.a6(61));
      if (var1.l6(61) && var1.l6(63)) {
         var1.c8().k5(var1.c8().c8() + var1.a6(63));
      }

      var1.c8().u9(var1.a6(15));
      if (var1.l6(15) && var1.l6(17)) {
         var1.c8().u9(var1.c8().n3() + var1.a6(17));
      }

      List$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            k7t var4 = var3.c8();
            var4.k5(var1.c8().c8());
            var4.u9(var1.c8().n3());
            if (var3.j5().n5 > var1.j5().n5) {
               var1.n5(new e4c(var3.j5().n5, var1.j5().l6));
            }

            if (var3.j5().l6 > var1.j5().l6) {
               var1.n5(new e4c(var1.j5().n5, var3.j5().l6));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return true;
   }
}
