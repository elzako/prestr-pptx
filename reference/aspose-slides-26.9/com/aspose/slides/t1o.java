package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class t1o {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "brush", "canvas", "canvasTransform", "context", "inkSource", "mapping", "timestamp", "trace", "traceFormat", "traceGroup", "traceView"
   );

   public static void n5(Ink var0, h2i var1, com.aspose.slides.internal.k4y.z3s var2) {
      if (var2 != null) {
         List$Enumerator var3 = var2.n5().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
               switch (n5.n5(var4.n5())) {
                  case 0:
                     InkBrush var5 = new InkBrush();
                     r6d.n5(var0, var5, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.n8o.class));
                     var1.n5().addItem(var5);
                     break;
                  case 1:
                     c2u var6 = new c2u();
                     m4k.n5(var0, var6, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.u4z.class));
                     var1.l6().addItem(var6);
                     break;
                  case 2:
                     k2a var7 = new k2a();
                     t3n.n5(var0, var7, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.n1d.class));
                     var1.k5().addItem(var7);
                     break;
                  case 3:
                     r6s var8 = new r6s();
                     a6g.n5(var0, var8, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.h8y.class));
                     var1.u3().addItem(var8);
                     break;
                  case 4:
                     l7m var9 = new l7m();
                     q3e.n5(var0, var9, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.c6l.class));
                     var1.a6().addItem(var9);
                     break;
                  case 5:
                     q1p var10 = new q1p();
                     r6f.n5(var0, var10, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.p1n.class));
                     var1.u9().addItem(var10);
                     break;
                  case 6:
                     y4i var11 = new y4i();
                     b6a.n5(var0, var11, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.o6m.class));
                     var1.h0().addItem(var11);
                     break;
                  case 7:
                     InkTrace var12 = new InkTrace(var0);
                     w4j.n5(var0, var12, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.o3x.class));
                     var1.c8().addItem(var12);
                     break;
                  case 8:
                     a9j var13 = new a9j();
                     a2y.n5(var0, var13, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.o0s.class));
                     var1.t2().addItem(var13);
                     break;
                  case 9:
                     q8i var14 = new q8i();
                     r4q.n5(var0, var14, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.z9x.class));
                     var1.s7().addItem(var14);
                     break;
                  case 10:
                     d1l var15 = new d1l();
                     d5k.n5(var0, var15, com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k4y.l5u.class));
                     var1.x8().addItem(var15);
                     break;
                  default:
                     throw new NotImplementedException();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.v8 var0, h2i var1, com.aspose.slides.internal.k4y.z3s var2) {
      if (var1.l6().size() > 0) {
         List$Enumerator var3 = var1.l6().iterator();

         try {
            while (var3.hasNext()) {
               c2u var4 = (c2u)var3.next();
               com.aspose.slides.internal.k4y.u4z var5 = new com.aspose.slides.internal.k4y.u4z();
               m4k.n5(var4, var5);
               var2.n5(new com.aspose.slides.internal.k4y.g7("canvas", var5));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (var1.k5().size() > 0) {
         List$Enumerator var149 = var1.k5().iterator();

         try {
            while (var149.hasNext()) {
               k2a var159 = (k2a)var149.next();
               com.aspose.slides.internal.k4y.n1d var169 = new com.aspose.slides.internal.k4y.n1d();
               t3n.n5(var159, var169);
               var2.n5(new com.aspose.slides.internal.k4y.g7("canvasTransform", var169));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var149, IDisposable.class)) {
               var149.dispose();
            }
         }
      }

      if (var1.u3().size() > 0) {
         List$Enumerator var150 = var1.u3().iterator();

         try {
            while (var150.hasNext()) {
               r6s var160 = (r6s)var150.next();
               com.aspose.slides.internal.k4y.h8y var170 = new com.aspose.slides.internal.k4y.h8y();
               a6g.n5(var160, var170);
               var2.n5(new com.aspose.slides.internal.k4y.g7("context", var170));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var150, IDisposable.class)) {
               var150.dispose();
            }
         }
      }

      if (var1.n5().size() > 0) {
         List$Enumerator var151 = var1.n5().iterator();

         try {
            while (var151.hasNext()) {
               InkBrush var161 = (InkBrush)var151.next();
               com.aspose.slides.internal.k4y.n8o var171 = new com.aspose.slides.internal.k4y.n8o();
               r6d.n5(var161, var171);
               var2.n5(new com.aspose.slides.internal.k4y.g7("brush", var171));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var151, IDisposable.class)) {
               var151.dispose();
            }
         }
      }

      if (var1.a6().size() > 0) {
         List$Enumerator var152 = var1.a6().iterator();

         try {
            while (var152.hasNext()) {
               l7m var162 = (l7m)var152.next();
               com.aspose.slides.internal.k4y.c6l var172 = new com.aspose.slides.internal.k4y.c6l();
               q3e.n5(var162, var172);
               var2.n5(new com.aspose.slides.internal.k4y.g7("inkSource", var172));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var152, IDisposable.class)) {
               var152.dispose();
            }
         }
      }

      if (var1.u9().size() > 0) {
         List$Enumerator var153 = var1.u9().iterator();

         try {
            while (var153.hasNext()) {
               q1p var163 = (q1p)var153.next();
               com.aspose.slides.internal.k4y.p1n var173 = new com.aspose.slides.internal.k4y.p1n();
               r6f.n5(var163, var173);
               var2.n5(new com.aspose.slides.internal.k4y.g7("mapping", var173));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var153, IDisposable.class)) {
               var153.dispose();
            }
         }
      }

      if (var1.h0().size() > 0) {
         List$Enumerator var154 = var1.h0().iterator();

         try {
            while (var154.hasNext()) {
               y4i var164 = (y4i)var154.next();
               com.aspose.slides.internal.k4y.o6m var174 = new com.aspose.slides.internal.k4y.o6m();
               b6a.n5(var164, var174);
               var2.n5(new com.aspose.slides.internal.k4y.g7("timestamp", var174));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var154, IDisposable.class)) {
               var154.dispose();
            }
         }
      }

      if (var1.c8().size() > 0) {
         List$Enumerator var155 = var1.c8().iterator();

         try {
            while (var155.hasNext()) {
               InkTrace var165 = (InkTrace)var155.next();
               com.aspose.slides.internal.k4y.o3x var175 = new com.aspose.slides.internal.k4y.o3x();
               w4j.n5(var165, var175);
               var2.n5(new com.aspose.slides.internal.k4y.g7("trace", var175));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var155, IDisposable.class)) {
               var155.dispose();
            }
         }
      }

      if (var1.s7().size() > 0) {
         List$Enumerator var156 = var1.s7().iterator();

         try {
            while (var156.hasNext()) {
               q8i var166 = (q8i)var156.next();
               com.aspose.slides.internal.k4y.z9x var176 = new com.aspose.slides.internal.k4y.z9x();
               r4q.n5(var166, var176);
               var2.n5(new com.aspose.slides.internal.k4y.g7("traceGroup", var176));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var156, IDisposable.class)) {
               var156.dispose();
            }
         }
      }

      if (var1.t2().size() > 0) {
         List$Enumerator var157 = var1.t2().iterator();

         try {
            while (var157.hasNext()) {
               a9j var167 = (a9j)var157.next();
               com.aspose.slides.internal.k4y.o0s var177 = new com.aspose.slides.internal.k4y.o0s();
               a2y.n5(var167, var177);
               var2.n5(new com.aspose.slides.internal.k4y.g7("traceFormat", var177));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var157, IDisposable.class)) {
               var157.dispose();
            }
         }
      }

      if (var1.x8().size() > 0) {
         List$Enumerator var158 = var1.x8().iterator();

         try {
            while (var158.hasNext()) {
               d1l var168 = (d1l)var158.next();
               com.aspose.slides.internal.k4y.l5u var178 = new com.aspose.slides.internal.k4y.l5u();
               d5k.n5(var168, var178);
               var2.n5(new com.aspose.slides.internal.k4y.g7("traceView", var178));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var158, IDisposable.class)) {
               var158.dispose();
            }
         }
      }
   }
}
