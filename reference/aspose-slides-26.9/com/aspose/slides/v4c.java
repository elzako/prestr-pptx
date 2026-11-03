package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v4c extends x0q {
   final void n5(d2c var1, i1x var2) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "drawing".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.e5 var3 = new com.aspose.slides.internal.k4y.e5(this.s7());
            var1.n5(var3);
            List var4 = new List();
            List var5 = var1.u9().n5().k5();
            List$Enumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
                  if ("sp".equals(var7.n5())) {
                     com.aspose.slides.internal.k4y.q0 var8 = (com.aspose.slides.internal.k4y.q0)var7.l6();
                     long var9 = var8.n5().n5().k5();
                     if ((var9 & 4294967295L) != 0L) {
                        if (var4.containsItem(var9)) {
                           var8.n5().n5().n5(0L);
                        } else {
                           var4.addItem(var9);
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            var2.n5().n5(true);
            r3m.n5(var1.h0(), var1.u9().n5(), var2);
            var2.n5().n5(false);
         }
      }

      this.n3();
   }

   final void n5(d2c var1, n4i var2) {
      this.y4();
      com.aspose.slides.internal.k4y.e5 var3 = new com.aspose.slides.internal.k4y.e5();
      r3m.n5(var1.h0(), var3.n5(), var2, null);
      var3.n5(null, this.x8(), "drawing");
      this.e2();
   }

   public v4c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public v4c(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
