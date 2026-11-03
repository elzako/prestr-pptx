package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;

class m1k {
   public static void n5(com.aspose.slides.internal.k4y.h7g var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1 != null && var1.t4() != null) {
         com.aspose.slides.internal.k0r.l4o var3 = var1.t4();
         r2p.n5(var0.s7(), var1, var3.a6(), var2);
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

         var0.n5(n5(var3.l6().c8()));
         var0.n5(var3.u3() == null ? null : n5(var3.u3().a6()));
      } else {
         throw new InvalidOperationException();
      }
   }

   private static String n5(String var0) {
      String var1 = com.aspose.slides.ms.System.d1.n5(var0, " -7 ", " ");
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      String var3 = "MLCZEmlcze";
      char var4 = ' ';
      boolean var5 = false;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (!var5 || com.aspose.slides.ms.System.t9.u9(var1.charAt(var6))) {
            if (com.aspose.slides.ms.System.t9.u9(var1.charAt(var6))) {
               if (com.aspose.slides.ms.System.d1.u3(var3, var1.charAt(var6)) == -1) {
                  var5 = true;
                  continue;
               }

               var5 = false;
               if (var4 != ' ' && var1.charAt(var6) != 'E' && var1.charAt(var6) != 'e') {
                  var2.n5(' ');
               }
            } else if (var1.charAt(var6) == '-' && var4 != ' ' && var4 != 'E' && var4 != 'e') {
               var2.n5(' ');
            }

            var2.n5(var1.charAt(var6));
            var4 = var1.charAt(var6);
         }
      }

      return var2.toString();
   }

   private static byte n5(long var0) {
      switch ((int)var0) {
         case 0:
         case 1:
            return 0;
         case 2:
            return 1;
         default:
            return -1;
      }
   }

   private static long n5(byte var0) {
      switch (var0) {
         case 0:
            return 0L;
         case 1:
            return 2L;
         default:
            throw new NotImplementedException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.h7g var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.l4o var3 = new com.aspose.slides.internal.k0r.l4o();
         var1.e2().addItem(var3);
         n5(var0, var3);
         if (!com.aspose.slides.ms.System.d1.n5(var0.u9())) {
            com.aspose.slides.internal.k0r.g5d var4 = new com.aspose.slides.internal.k0r.g5d(var0.u9());
            var4.k5((short)1);
            var3.e2().addItem(var4);
         }

         com.aspose.slides.internal.k0r.q9u var5 = new com.aspose.slides.internal.k0r.q9u();
         var3.e2().addItem(var5);
         w7n.n5(var0.s7(), var5, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.h7g var0, com.aspose.slides.internal.k0r.l4o var1) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.s0i var2 = new com.aspose.slides.internal.k0r.s0i();
      var1.e2().addItem(var2);
      if (var0.x8() != null) {
         var2.n5(true);
         var2.n5(var0.x8().n5());
         var2.l6(var0.x8().l6());
      } else {
         var2.n5(false);
      }

      if (var0.n3() != null) {
         var2.l6(true);
         var2.k5(var0.n3().n5());
         var2.u3(var0.n3().l6());
      } else {
         var2.l6(false);
      }

      if (var0.y4() != null) {
         var2.k5(true);
         var2.a6(var0.y4().n5());
         var2.u9(var0.y4().l6());
      } else {
         var2.k5(false);
      }

      if (var0.a6() != -1) {
         var2.u3(true);
         var2.n5(n5(var0.a6()));
      } else {
         var2.k5(false);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.u9())) {
         var2.a6(true);
      } else {
         var2.a6(false);
      }

      if (var0.h0() != -1) {
         var2.u9(true);
      } else {
         var2.u9(false);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var0.t2())) {
         var2.h0(true);
      } else {
         var2.h0(false);
      }
   }
}
