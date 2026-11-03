package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class s4n {
   public static void n5(com.aspose.slides.internal.k4y.g2 var0, t2s var1) {
      com.aspose.slides.internal.k0r.l7h var2 = (com.aspose.slides.internal.k0r.l7h)var1.q0();
      if (var2 != null && var2.u3() != null && var2.u3().s7() != null) {
         com.aspose.slides.internal.k4y.k8g var3 = var0.k5();
         com.aspose.slides.internal.k4y.h7e var4 = var3.n5();
         c5y.n5(var4, new com.aspose.slides.internal.k0r.t6[]{var2.u3().s7()}, true, var1);
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.k8g var0, com.aspose.slides.internal.k0r.t6 var1, d5t var2) {
      if (var0 != null && var0.k5() != null) {
         if (var0.k5().n5() != null && var0.k5().n5().size() == 1) {
            com.aspose.slides.internal.k4y.g7 var3 = var0.k5().n5().get_Item(0);
            com.aspose.slides.internal.k4y.o2n var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.o2n.class);
            if (var4 == null) {
               throw new InvalidOperationException();
            }

            if (var4.n5().w1() != 8) {
               throw new InvalidOperationException();
            }

            w7n.n5(var4.n5(), var1, 0);
            w7n.n5(var4.n5(), var1);
            c5y.n5(var4.n5().d2(), var1, var2);
         } else {
            throw new InvalidOperationException();
         }
      }
   }
}
