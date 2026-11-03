package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class r4q {
   public static void n5(Ink var0, q8i var1, com.aspose.slides.internal.k4y.z9x var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         var1.l6(var2.l6());
         var1.k5(var2.k5());
         if (var2.h0() != null && var2.h0().length > 0) {
            for (com.aspose.slides.internal.k4y.z9x var6 : var2.h0()) {
               q8i var7 = new q8i();
               n5(var0, var7, var6);
               var1.l6().addItem(var7);
            }
         }

         if (var2.c8() != null && var2.c8().length > 0) {
            for (com.aspose.slides.internal.k4y.o3x var20 : var2.c8()) {
               InkTrace var24 = new InkTrace(var0);
               w4j.n5(var0, var24, var20);
               var1.n5().addItem(var24);
            }
         }

         if (var2.u9() != null && var2.u9().length > 0) {
            for (com.aspose.slides.internal.k4y.l5u var21 : var2.u9()) {
               d1l var25 = new d1l();
               d5k.n5(var0, var25, var21);
               var1.u9().addItem(var25);
            }
         }

         if (var2.a6() != null && var2.a6().length > 0) {
            for (com.aspose.slides.internal.k4y.i3p var22 : var2.a6()) {
               t7j var26 = new t7j();
               g1h.n5(var0, var26, var22);
               var1.h0().addItem(var26);
            }
         }

         if (var2.u3() != null && var2.u3().length > 0) {
            for (com.aspose.slides.internal.k4y.s4z var23 : var2.u3()) {
               r3w var27 = new r3w();
               y2h.n5(var0, var27, var23);
               var1.c8().addItem(var27);
            }
         }
      }
   }

   public static void n5(q8i var0, com.aspose.slides.internal.k4y.z9x var1) {
      var1.n5(var0.k5());
      var1.l6(var0.u3());
      var1.k5(var0.a6());
      if (var0.h0() != null && var0.h0().size() > 0) {
         List$Enumerator var2 = var0.h0().iterator();

         try {
            while (var2.hasNext()) {
               t7j var3 = (t7j)var2.next();
               com.aspose.slides.internal.k4y.i3p var4 = new com.aspose.slides.internal.k4y.i3p();
               g1h.n5(var3, var4);
               var1.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      if (var0.c8() != null && var0.c8().size() > 0) {
         List$Enumerator var40 = var0.c8().iterator();

         try {
            while (var40.hasNext()) {
               r3w var44 = (r3w)var40.next();
               com.aspose.slides.internal.k4y.s4z var48 = new com.aspose.slides.internal.k4y.s4z();
               y2h.n5(var44, var48);
               var1.n5(var48);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
               var40.dispose();
            }
         }
      }

      if (var0.n5() != null && var0.n5().size() > 0) {
         List$Enumerator var41 = var0.n5().iterator();

         try {
            while (var41.hasNext()) {
               InkTrace var45 = (InkTrace)var41.next();
               com.aspose.slides.internal.k4y.o3x var49 = new com.aspose.slides.internal.k4y.o3x();
               w4j.n5(var45, var49);
               var1.n5(var49);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
               var41.dispose();
            }
         }
      }

      if (var0.l6() != null && var0.l6().size() > 0) {
         List$Enumerator var42 = var0.l6().iterator();

         try {
            while (var42.hasNext()) {
               q8i var46 = (q8i)var42.next();
               com.aspose.slides.internal.k4y.z9x var50 = new com.aspose.slides.internal.k4y.z9x();
               n5(var46, var50);
               var1.n5(var50);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
               var42.dispose();
            }
         }
      }

      if (var0.u9() != null && var0.u9().size() > 0) {
         List$Enumerator var43 = var0.u9().iterator();

         try {
            while (var43.hasNext()) {
               d1l var47 = (d1l)var43.next();
               com.aspose.slides.internal.k4y.l5u var51 = new com.aspose.slides.internal.k4y.l5u();
               d5k.n5(var47, var51);
               var1.n5(var51);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
               var43.dispose();
            }
         }
      }
   }
}
