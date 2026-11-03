package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class x6b {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "action", "actionGroup", "actionData", "actionDataGroup", "trace", "traceGroup"
   );

   public static void n5(InkActions var0, com.aspose.slides.internal.k4y.h1k var1) {
      if (var1 != null) {
         if (var1.k5() != null) {
            h2i var2 = new h2i();
            t1o.n5((Ink)null, var2, var1.k5());
            var0.n5(var2);
         }

         var0.n5(var1.n5());
         var0.l6(var1.l6());
         List$Enumerator var9 = var1.u3().iterator();

         try {
            while (var9.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var9.next();
               switch (n5.n5(var3.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.b4h var4 = com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.b4h.class);
                     m3z var5 = new m3z(var0);
                     n5(var5, var4);
                     var0.x8().addItem(var5);
                     break;
                  case 1:
                     throw new NotImplementedException("InkAction:actionGroup");
                  default:
                     throw new NotImplementedException();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }
      }
   }

   public static void n5(m3z var0, com.aspose.slides.internal.k4y.b4h var1) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.u5h var5 : var1.a6()) {
            var0.n5().addItem(var5.n5(), var5.l6());
         }

         int var12 = 0;
         int[] var14 = new int[]{0};
         boolean var15 = com.aspose.slides.ms.System.a3.n5(var1.u3(), var14);
         var12 = var14[0];
         if (var15) {
            var0.n5(var12);
         }

         var0.l6(var1.k5());
         var0.n5(var1.l6());
         List$Enumerator var16 = var1.u9().iterator();

         try {
            while (var16.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var16.next();
               switch (n5.n5(var6.n5())) {
                  case 2:
                     com.aspose.slides.internal.k4y.r6r var7 = com.aspose.slides.internal.v6g.k5.n5(var6.k5(), com.aspose.slides.internal.k4y.r6r.class);
                     u2l var8 = new u2l(var0);
                     n5(var8, var7);
                     var0.l6().addItem(var8);
                     break;
                  case 3:
                     throw new NotImplementedException("InkAction:actionDataGroup");
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }
      }
   }

   public static void n5(u2l var0, com.aspose.slides.internal.k4y.r6r var1) {
      if (var1 != null) {
         var0.k5(var1.k5());
         var0.l6(var1.l6());
         var0.n5(var1.n5());
         List$Enumerator var2 = var1.u3().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
               Ink var4 = new Ink(var0.u3().a6().x9());
               var4.x8().addItem(var0.u3().a6().u9());
               switch (n5.n5(var3.n5())) {
                  case 4:
                     InkTrace var5 = new InkTrace(var4);
                     w4j.n5(null, var5, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.o3x.class));
                     var4.n5().addItem(var5);
                     break;
                  case 5:
                     q8i var6 = new q8i();
                     r4q.n5(null, var6, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.z9x.class));
                     var4.k5().addItem(var6);
               }

               var0.k5().addItem(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public static void n5(InkActions var0, com.aspose.slides.internal.k4y.h1k var1, g6c var2) {
      var1.l6(var0.k5());
      var1.n5(var0.n5());
      if (var0.u9() != null) {
         com.aspose.slides.internal.k4y.z3s var3 = new com.aspose.slides.internal.k4y.z3s();
         t1o.n5((com.aspose.slides.internal.k4y.v8)null, var0.u9(), var3);
         var1.n5(var3);
      }

      if (!var0.x8().isEmpty()) {
         List$Enumerator var9 = var0.x8().iterator();

         try {
            while (var9.hasNext()) {
               m3z var4 = (m3z)var9.next();
               com.aspose.slides.internal.k4y.b4h var5 = new com.aspose.slides.internal.k4y.b4h();
               l6(var4, var5);
               var1.n5(new com.aspose.slides.internal.k4y.g7("action", var5));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }
      }
   }

   public static void l6(m3z var0, com.aspose.slides.internal.k4y.b4h var1) {
      var1.k5(com.aspose.slides.ms.System.a3.l6(var0.u9()));
      var1.l6(var0.u3());
      var1.n5(var0.k5());
      Dictionary$Enumerator var2 = var0.n5().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            com.aspose.slides.internal.k4y.u5h var4 = var1.n5();
            var4.n5((String)var3.getKey());
            var4.l6((String)var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var13 = var0.l6().iterator();

      try {
         while (var13.hasNext()) {
            u2l var14 = (u2l)var13.next();
            com.aspose.slides.internal.k4y.r6r var5 = new com.aspose.slides.internal.k4y.r6r();
            l6(var14, var5);
            var1.n5(new com.aspose.slides.internal.k4y.g7("actionData", var5));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   public static void l6(u2l var0, com.aspose.slides.internal.k4y.r6r var1) {
      var1.l6(var0.l6());
      var1.k5(var0.a6());
      var1.n5(var0.n5());
      var1.n5(var0.n5());
      List$Enumerator var2 = var0.k5().iterator();

      try {
         while (var2.hasNext()) {
            Ink var3 = (Ink)var2.next();
            if (!var3.n5().isEmpty()) {
               List$Enumerator var4 = var3.n5().iterator();

               try {
                  while (var4.hasNext()) {
                     InkTrace var5 = (InkTrace)var4.next();
                     com.aspose.slides.internal.k4y.o3x var6 = new com.aspose.slides.internal.k4y.o3x();
                     w4j.n5(var5, var6);
                     var1.n5(new com.aspose.slides.internal.k4y.g7("trace", var6));
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }

            if (!var3.e2().isEmpty()) {
               List$Enumerator var22 = var3.e2().iterator();

               try {
                  while (var22.hasNext()) {
                     d1l var23 = (d1l)var22.next();
                     com.aspose.slides.internal.k4y.l5u var24 = new com.aspose.slides.internal.k4y.l5u();
                     d5k.n5(var23, var24);
                     var1.n5(new com.aspose.slides.internal.k4y.g7("traceView", var24));
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
                     var22.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
