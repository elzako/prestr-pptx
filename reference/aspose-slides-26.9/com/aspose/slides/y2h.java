package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class y2h {
   public static void n5(Ink var0, r3w var1, com.aspose.slides.internal.k4y.s4z var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         var1.l6(var2.l6());
         var1.k5(var2.k5());
         if (var2.u3() != null && var2.u3().length > 0) {
            for (com.aspose.slides.internal.k4y.h0 var6 : var2.u3()) {
               String var7 = var6.n5();
               var1.u3().addItem(var7);
            }
         }
      }
   }

   public static void n5(r3w var0, com.aspose.slides.internal.k4y.s4z var1) {
      var1.n5(var0.n5());
      var1.l6(var0.l6());
      var1.k5(var0.k5());
      if (var0.u3().size() > 0) {
         List$Enumerator var2 = var0.u3().iterator();

         try {
            while (var2.hasNext()) {
               String var3 = (String)var2.next();
               com.aspose.slides.internal.k4y.h0 var4 = new com.aspose.slides.internal.k4y.h0();
               var4.n5(var3);
               var1.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
