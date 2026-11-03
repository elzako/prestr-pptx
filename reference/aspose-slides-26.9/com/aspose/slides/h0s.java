package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class h0s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "definitions", "context", "trace", "traceGroup", "traceView", "annotation", "annotationXML"
   );

   public static void n5(Ink var0, com.aspose.slides.internal.k4y.v8 var1) {
      if (var1 != null) {
         List$Enumerator var2 = var1.n5().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
               switch (n5.n5(var3.n5())) {
                  case 0:
                     h2i var4 = new h2i();
                     t1o.n5(var0, var4, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.z3s.class));
                     var0.x8().addItem(var4);
                     break;
                  case 1:
                     throw new NotImplementedException("context");
                  case 2:
                     InkTrace var5 = new InkTrace(var0);
                     w4j.n5(var0, var5, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.o3x.class));
                     var0.n5().addItem(var5);
                     break;
                  case 3:
                     q8i var6 = new q8i();
                     r4q.n5(var0, var6, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.z9x.class));
                     var0.k5().addItem(var6);
                     break;
                  case 4:
                     d1l var7 = new d1l();
                     d5k.n5(var0, var7, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.l5u.class));
                     var0.e2().addItem(var7);
                     break;
                  case 5:
                     t7j var8 = new t7j();
                     g1h.n5(var0, var8, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.i3p.class));
                     if (!com.aspose.slides.ms.System.d1.n5(var8.n5())) {
                        var0.z1().addItem(var8);
                     }
                     break;
                  case 6:
                     r3w var9 = new r3w();
                     y2h.n5(var0, var9, com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.k4y.s4z.class));
                     var0.m3().addItem(var9);
                     break;
                  default:
                     throw new NotImplementedException();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public static void n5(Ink var0, com.aspose.slides.internal.k4y.v8 var1, g6c var2) {
      if (var0.z1().size() > 0) {
         List$Enumerator var3 = var0.z1().iterator();

         try {
            while (var3.hasNext()) {
               t7j var4 = (t7j)var3.next();
               com.aspose.slides.internal.k4y.i3p var5 = new com.aspose.slides.internal.k4y.i3p();
               g1h.n5(var4, var5);
               var1.n5(new com.aspose.slides.internal.k4y.g7("annotation", var5));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (var0.x8().size() > 0) {
         List$Enumerator var54 = var0.x8().iterator();

         try {
            while (var54.hasNext()) {
               h2i var60 = (h2i)var54.next();
               com.aspose.slides.internal.k4y.z3s var65 = new com.aspose.slides.internal.k4y.z3s();
               t1o.n5(var1, var60, var65);
               var1.n5(new com.aspose.slides.internal.k4y.g7("definitions", var65));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
               var54.dispose();
            }
         }
      }

      if (var0.y4() != null) {
         com.aspose.slides.internal.k4y.h8y var55 = new com.aspose.slides.internal.k4y.h8y();
         a6g.n5(var0.y4(), var55);
         var1.n5(new com.aspose.slides.internal.k4y.g7("context", var55));
      }

      if (var0.n5().size() > 0) {
         List$Enumerator var56 = var0.n5().iterator();

         try {
            while (var56.hasNext()) {
               InkTrace var61 = (InkTrace)var56.next();
               com.aspose.slides.internal.k4y.o3x var66 = new com.aspose.slides.internal.k4y.o3x();
               w4j.n5(var61, var66);
               var1.n5(new com.aspose.slides.internal.k4y.g7("trace", var66));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var56, IDisposable.class)) {
               var56.dispose();
            }
         }
      }

      if (var0.k5().size() > 0) {
         List$Enumerator var57 = var0.k5().iterator();

         try {
            while (var57.hasNext()) {
               q8i var62 = (q8i)var57.next();
               com.aspose.slides.internal.k4y.z9x var67 = new com.aspose.slides.internal.k4y.z9x();
               r4q.n5(var62, var67);
               var1.n5(new com.aspose.slides.internal.k4y.g7("traceGroup", var67));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var57, IDisposable.class)) {
               var57.dispose();
            }
         }
      }

      if (var0.e2().size() > 0) {
         List$Enumerator var58 = var0.e2().iterator();

         try {
            while (var58.hasNext()) {
               d1l var63 = (d1l)var58.next();
               com.aspose.slides.internal.k4y.l5u var68 = new com.aspose.slides.internal.k4y.l5u();
               d5k.n5(var63, var68);
               var1.n5(new com.aspose.slides.internal.k4y.g7("traceView", var68));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
               var58.dispose();
            }
         }
      }

      if (var0.m3().size() > 0) {
         List$Enumerator var59 = var0.m3().iterator();

         try {
            while (var59.hasNext()) {
               r3w var64 = (r3w)var59.next();
               com.aspose.slides.internal.k4y.s4z var69 = new com.aspose.slides.internal.k4y.s4z();
               y2h.n5(var64, var69);
               var1.n5(new com.aspose.slides.internal.k4y.g7("annotationXML", var69));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var59, IDisposable.class)) {
               var59.dispose();
            }
         }
      }
   }
}
