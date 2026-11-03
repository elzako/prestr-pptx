package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class b1n {
   public static void n5(com.aspose.slides.internal.k4y.c3t var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.q0() != null) {
         com.aspose.slides.internal.k0r.s7k var3 = var1.q0();
         r2p.n5(var0.u3(), var1, var3.u3(), var2);
         var0.n5(var3.l6().l6());
         var0.l6(var3.l6().k5());
         var0.k5(var3.l6().u3());
      } else {
         throw new InvalidOperationException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.c3t var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.s7k var3 = new com.aspose.slides.internal.k0r.s7k();
         var1.e2().addItem(var3);
         n5(var0, var3);
         com.aspose.slides.internal.k0r.q9u var4 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var4);
         w7n.n5(var0.u3(), var4, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.c3t var0, com.aspose.slides.internal.k0r.s7k var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.r2n var2 = new com.aspose.slides.internal.k0r.r2n();
      var1.e2().addItem(var2);
      if (var0.n5() != Float.NaN) {
         var2.n5(true);
         var2.n5(var0.n5());
      } else {
         var2.n5(false);
      }

      if (var0.l6() != Float.NaN) {
         var2.l6(true);
         var2.l6(var0.l6());
      } else {
         var2.l6(false);
         var2.l6(0.0F);
      }

      if (var0.k5() != Float.NaN) {
         var2.k5(true);
         var2.k5(var0.k5());
      } else {
         var2.k5(false);
         var2.k5(360.0F);
      }
   }
}
