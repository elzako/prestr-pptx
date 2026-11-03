package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;

class l0k {
   public static void n5(com.aspose.slides.internal.k4y.s1z var0, com.aspose.slides.internal.k0r.c9b var1, t2s var2) {
      if (var1 != null && var1.h0() != null) {
         com.aspose.slides.internal.k0r.g9t var3 = var1.h0();
         r2p.n5(var0.k5(), var1, var3.a6(), var2);
         n5(var0, var3);
      } else {
         throw new InvalidOperationException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.s1z var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.h0() != null) {
         com.aspose.slides.internal.k0r.g9t var3 = var1.h0();
         r2p.n5(var0.k5(), var1, var3.a6(), var2);
         n5(var0, var3);
      } else {
         throw new InvalidOperationException();
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.s1z var0, com.aspose.slides.internal.k0r.g9t var1) {
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      if (var1.l6().l6()) {
         var0.n5(n5(var1.l6().u3()));
      }

      var0.n5(var1.u3() == null ? null : var1.u3().a6());
   }

   private static byte n5(long var0) {
      switch ((int)var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return -1;
      }
   }

   private static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            throw new NotImplementedException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.s1z var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.g9t var3 = new com.aspose.slides.internal.k0r.g9t();
         var1.e2().addItem(var3);
         l6(var0, var3);
         if (var3.l6().k5()) {
            com.aspose.slides.internal.k0r.g5d var4 = new com.aspose.slides.internal.k0r.g5d(var0.l6());
            var4.w1().n5((short)1);
            var3.e2().addItem(var4);
         }

         com.aspose.slides.internal.k0r.q9u var5 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var5);
         w7n.n5(var0.k5(), var5, var2);
      }
   }

   private static void l6(com.aspose.slides.internal.k4y.s1z var0, com.aspose.slides.internal.k0r.g9t var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.d9m var2 = new com.aspose.slides.internal.k0r.d9m();
      var1.e2().addItem(var2);
      if (var0.n5() != -1) {
         var2.n5(true);
         var2.n5(n5(var0.n5()) & 65535);
      } else {
         var2.n5(false);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
         var2.l6(true);
      } else {
         var2.l6(false);
      }
   }
}
