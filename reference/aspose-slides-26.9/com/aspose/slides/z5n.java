package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class z5n {
   public static void n5(com.aspose.slides.internal.k4y.p2j var0, com.aspose.slides.internal.k0r.c9b var1, t2s var2) {
      if (var1 != null && var1.u9() != null) {
         com.aspose.slides.internal.k0r.k5w var3 = var1.u9();
         r2p.n5(var0.l6(), var1, var3.u3(), var2);
         n5(var0, var3);
      } else {
         throw new InvalidOperationException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.p2j var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.u9() != null) {
         com.aspose.slides.internal.k0r.k5w var3 = var1.u9();
         r2p.n5(var0.l6(), var1, var3.u3(), var2);
         n5(var0, var3);
      } else {
         throw new InvalidOperationException();
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.p2j var0, com.aspose.slides.internal.k0r.k5w var1) {
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      if (var1.l6() != null) {
         com.aspose.slides.internal.k4y.k7v var2 = var0.n5();
         com.aspose.slides.internal.k4y.w8j var3 = (com.aspose.slides.internal.k4y.w8j)var2.n5("strVal").l6();
         var3.n5(var1.l6().a6());
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.p2j var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.k5w var3 = new com.aspose.slides.internal.k0r.k5w();
         var1.e2().addItem(var3);
         n5(var0, var3, var2);
         if (var0.k5() != null && var0.k5().n5() != null && "strVal".equals(var0.k5().n5().n5())) {
            com.aspose.slides.internal.k4y.w8j var4 = (com.aspose.slides.internal.k4y.w8j)var0.k5().n5().l6();
            com.aspose.slides.internal.k0r.g5d var5 = new com.aspose.slides.internal.k0r.g5d(var4.n5());
            var5.w1().n5((short)1);
            var3.e2().addItem(var5);
         }

         com.aspose.slides.internal.k0r.q9u var6 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var6);
         w7n.n5(var0.l6(), var6, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.p2j var0, com.aspose.slides.internal.k0r.k5w var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.a1k var3 = new com.aspose.slides.internal.k0r.a1k();
      var1.e2().addItem(var3);
      if (var0.k5() == null || var0.k5().n5() == null) {
         var3.n5(false);
         var3.n5(1);
      } else if ("strVal".equals(var0.k5().n5().n5())) {
         var3.n5(true);
         var3.n5(1);
      } else {
         var2.n5("Writing of the animation set behavior failed.", 1);
      }
   }
}
