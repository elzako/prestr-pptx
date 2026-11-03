package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class a2y {
   public static void n5(Ink var0, a9j var1, com.aspose.slides.internal.k4y.o0s var2) {
      if (var2 != null) {
         var1.n5(var2.n5());

         for (com.aspose.slides.internal.k4y.j0p var6 : var2.l6()) {
            q8v var7 = new q8v();
            o7o.n5(var0, var7, var6);
            var1.l6().addItem(var7);
         }

         if (var2.k5() != null) {
            for (com.aspose.slides.internal.k4y.j0p var11 : var2.k5().n5()) {
               q8v var12 = new q8v();
               o7o.n5(var0, var12, var11);
               var1.k5().addItem(var12);
            }
         }
      }
   }

   public static void n5(a9j var0, com.aspose.slides.internal.k4y.o0s var1) {
      var1.n5(var0.n5());
      if (var0.l6() != null && var0.l6().size() > 0) {
         List$Enumerator var2 = var0.l6().iterator();

         try {
            while (var2.hasNext()) {
               q8v var3 = (q8v)var2.next();
               com.aspose.slides.internal.k4y.j0p var4 = new com.aspose.slides.internal.k4y.j0p();
               o7o.n5(var3, var4);
               var1.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      if (var0.k5() != null && var0.k5().size() > 0) {
         com.aspose.slides.internal.k4y.z3k var13 = new com.aspose.slides.internal.k4y.z3k();
         List$Enumerator var14 = var0.k5().iterator();

         try {
            while (var14.hasNext()) {
               q8v var15 = (q8v)var14.next();
               com.aspose.slides.internal.k4y.j0p var5 = new com.aspose.slides.internal.k4y.j0p();
               o7o.n5(var15, var5);
               var13.n5(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }

         var1.n5(var13);
      }
   }
}
