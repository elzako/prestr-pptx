package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class r2p {
   public static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.c9b var1, com.aspose.slides.internal.k0r.q9u var2, t2s var3) {
      if (var1 != null && var2 != null) {
         w7n.n5(var0.u9(), new r2p$1(var0), new r2p$2(var0), var1, var3);
         n5(var0, var2, var3);
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.t6 var1, com.aspose.slides.internal.k0r.q9u var2, t2s var3) {
      if (var1 != null && var2 != null) {
         w7n.n5(var0.u9(), new r2p$3(var0), new r2p$4(var0), var1, var3);
         n5(var0, var2, var3);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.q9u var1, t2s var2) {
      if (var1 != null) {
         if (var1.u9() != null) {
            y1t.n5(var0.h0(), var1.u9().l6(), var2);
         }

         if (var1.u3() != null && var1.u3().y1() > 0) {
            com.aspose.slides.internal.k4y.g1l var3 = var0.n5();
            List$Enumerator var4 = var1.u3().e2().iterator();

            try {
               while (var4.hasNext()) {
                  com.aspose.slides.internal.k0r.e6r var5 = (com.aspose.slides.internal.k0r.e6r)var4.next();
                  com.aspose.slides.internal.k0r.g5d var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.k0r.g5d.class);
                  if (var6 != null) {
                     var3.n5(var6.a6());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }

         if (var1.l6().l6()) {
            var0.n5(n5(var1.l6().k5()));
         }

         var0.l6((byte)-1);
         var0.k5((byte)-1);
         var0.u3((byte)-1);
      }
   }

   private static byte n5(long var0) {
      switch ((int)var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         default:
            return 0;
      }
   }

   private static long n5(byte var0) {
      switch (var0) {
         case 1:
            return 0L;
         case 2:
            return 1L;
         default:
            return 0L;
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.q9u var1) {
      if (var0 == null) {
         throw new InvalidOperationException();
      }

      if (var1 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.k0r.q4d var2 = new com.aspose.slides.internal.k0r.q4d();
      var1.e2().addItem(var2);
      if (var0.l6() != -1) {
         var2.n5(true);
         var2.n5(n5(var0.l6()));
      } else {
         var2.n5(false);
         var2.n5(0L);
      }

      if (var0.c8() != null && var0.c8().n5().length > 0) {
         var2.l6(true);
      } else {
         var2.l6(false);
      }

      var2.l6(0L);
      var2.k5(0L);
   }

   public static void l6(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.q9u var1) {
      com.aspose.slides.internal.k0r.k4o var2 = new com.aspose.slides.internal.k0r.k4o();
      if (var1 == null) {
         throw new NullReferenceException("TimeNode couldn't be empty.");
      }

      var1.e2().addItem(var2);
      if (var0 != null && var0.c8() != null && var0.c8().n5().length != 0) {
         for (String var6 : var0.c8().n5()) {
            com.aspose.slides.internal.k0r.g5d var7 = new com.aspose.slides.internal.k0r.g5d(var6);
            var2.e2().addItem(var7);
         }
      }
   }
}
