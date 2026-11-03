package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class k1v {
   public static void n5(com.aspose.slides.internal.k4y.q6i var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.z3() != null) {
         com.aspose.slides.internal.k0r.j3b var3 = var1.z3();
         r2p.n5(var0.a6(), var1, var3.u3(), var2);
         if (var3.l6().t2()) {
            com.aspose.slides.internal.k4y.c5h var4 = var0.n5();
            var4.n5(var3.l6().l6());
            var4.l6(var3.l6().k5());
         }

         if (var3.l6().s7()) {
            com.aspose.slides.internal.k4y.c5h var5 = var0.l6();
            var5.n5(var3.l6().u3());
            var5.l6(var3.l6().a6());
         }

         if (var3.l6().x8()) {
            com.aspose.slides.internal.k4y.c5h var6 = var0.k5();
            var6.n5(var3.l6().u9());
            var6.l6(var3.l6().h0());
         }

         if (var3.l6().n3()) {
            var0.n5((byte)((var3.l6().c8() & 255) == 1 ? 1 : 0));
         } else {
            var0.n5((byte)-1);
         }
      } else {
         throw new InvalidOperationException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.q6i var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.j3b var3 = new com.aspose.slides.internal.k0r.j3b();
         var1.e2().addItem(var3);
         n5(var0, var3);
         com.aspose.slides.internal.k0r.q9u var4 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var4);
         w7n.n5(var0.a6(), var4, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.q6i var0, com.aspose.slides.internal.k0r.j3b var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.d7u var2 = new com.aspose.slides.internal.k0r.d7u();
      var1.e2().addItem(var2);
      if (var0.u9() != null) {
         var2.n5(true);
         var2.n5(var0.u9().n5());
         var2.l6(var0.u9().l6());
      } else {
         var2.n5(false);
      }

      if (var0.h0() != null) {
         var2.l6(true);
         var2.k5(var0.h0().n5());
         var2.u3(var0.h0().l6());
      } else {
         var2.l6(false);
      }

      if (var0.c8() != null) {
         var2.k5(true);
         var2.a6(var0.c8().n5());
         var2.u9(var0.c8().l6());
      } else {
         var2.k5(false);
      }

      if (var0.u3() != -1) {
         var2.u3(true);
         var2.n5((byte)(var0.u3() == 1 ? 1 : 0));
      } else {
         var2.u3(false);
      }
   }
}
