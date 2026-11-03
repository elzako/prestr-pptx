package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k7 {
   public static final IPresentation n5(z3 var0, IPresentation var1) {
      while (var1.getSlides().size() > 0) {
         var1.getSlides().removeAt(0);
      }

      new e5(var1, var0.n5(), var0.l6()).n5();
      if (var0.k5() != null) {
         List$Enumerator var2 = var0.k5().iterator();

         try {
            while (var2.hasNext()) {
               z8 var3 = (z8)var2.next();
               if (var3.a6() == 3L) {
                  new p8(var1, var3).n5();
               } else {
                  new i1(var1, var3).n5();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return var1;
   }
}
