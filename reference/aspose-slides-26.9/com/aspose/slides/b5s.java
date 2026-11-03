package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class b5s {
   public static void n5(com.aspose.slides.internal.k4y.n3m var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.z1() != null) {
         r2p.n5(var0.u3(), var1, var1.z1().a6(), var2);
         var0.n5(n5(var1.z1()));
         var0.n5(l6(var1.z1()));
      } else {
         throw new InvalidOperationException();
      }
   }

   private static byte n5(com.aspose.slides.internal.k0r.u7c var0) {
      if (var0.l6() != null && var0.l6().l6()) {
         switch ((int)var0.l6().u3()) {
            case 0:
               return 1;
            case 1:
               return 2;
            default:
               return -1;
         }
      } else {
         return -1;
      }
   }

   private static long n5(byte var0, d5t var1) {
      switch (var0) {
         case 1:
            return 0L;
         case 2:
            return 1L;
         default:
            var1.n5("Writing of the animation effect behavior transition failed.", 1);
            return 0L;
      }
   }

   private static String l6(com.aspose.slides.internal.k0r.u7c var0) {
      if (var0.l6() != null && var0.l6().k5()) {
         com.aspose.slides.internal.k0r.g5d var1 = com.aspose.slides.internal.v6g.k5.n5(var0.u3(), com.aspose.slides.internal.k0r.g5d.class);
         return var1 == null ? null : var1.a6();
      } else {
         return null;
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n3m var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.u7c var3 = new com.aspose.slides.internal.k0r.u7c();
         var1.e2().addItem(var3);
         n5(var0, var3, var2);
         if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
            com.aspose.slides.internal.k0r.g5d var4 = new com.aspose.slides.internal.k0r.g5d(var0.l6());
            var4.w1().n5((short)1);
            var3.e2().addItem(var4);
         }

         if (var0.a6() != null && var0.a6().n5() != null && "fltVal".equals(var0.a6().n5().n5())) {
            com.aspose.slides.internal.k4y.k1k var6 = (com.aspose.slides.internal.k4y.k1k)var0.a6().n5().l6();
            com.aspose.slides.internal.k0r.f4l var5 = new com.aspose.slides.internal.k0r.f4l(var6.n5());
            var3.e2().addItem(var5);
         }

         com.aspose.slides.internal.k0r.q9u var7 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var7);
         w7n.n5(var0.u3(), var7, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.n3m var0, com.aspose.slides.internal.k0r.u7c var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.y9r var3 = new com.aspose.slides.internal.k0r.y9r();
      var1.e2().addItem(var3);
      if (var0.n5() != -1) {
         var3.n5(true);
         var3.n5(n5(var0.n5(), var2));
      } else {
         var3.n5(false);
         var3.n5(0L);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.l6())) {
         var3.l6(true);
      } else {
         var3.l6(false);
      }

      if (var0.a6() == null || var0.a6().n5() == null) {
         var3.k5(false);
      } else if ("fltVal".equals(var0.a6().n5().n5())) {
         var3.k5(true);
      } else {
         var3.k5(false);
         var2.n5("Writing of the animation effect behavior failed.", 1);
      }

      var3.u3(false);
   }
}
