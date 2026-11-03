package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

class c1s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "r",
      "f",
      "d",
      "sSub",
      "sSup",
      "sSubSup",
      "sPre",
      "rad",
      "eqArr",
      "func",
      "nary",
      "limLow",
      "limUpp",
      "acc",
      "bar",
      "box",
      "groupChr",
      "borderBox",
      "m",
      "phant"
   );

   public static void n5(com.aspose.slides.internal.k4y.g7 var0, IMathElementCollection var1, t5w var2, MathPortion var3) {
      switch (n5.n5(var0.n5())) {
         case 0:
            com.aspose.slides.internal.k4y.e8x var16 = (com.aspose.slides.internal.k4y.e8x)var0.k5();
            k3k var17 = x9m.n5(var16, var2, var3);
            IGenericEnumerator var18 = var17.l6().iterator();

            try {
               while (var18.hasNext()) {
                  y0v var19 = (y0v)var18.next();
                  o6z var20 = com.aspose.slides.internal.v6g.k5.n5(var19, o6z.class);
                  if (var20 != null) {
                     MathematicalText var21 = new MathematicalText(var20.n5(), (PortionFormat)var17.a6());
                     if (var17.k5() != null) {
                        var21.n5(new z4a(var17.k5()));
                     }

                     var1.add(var21);
                  }
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                  var18.dispose();
               }
            }
         case 1:
            com.aspose.slides.internal.k4y.k6l var4 = (com.aspose.slides.internal.k4y.k6l)var0.k5();
            MathFraction var5 = o0y.n5(var4, var2);
            var1.add(var5);
            break;
         case 2:
            com.aspose.slides.internal.k4y.w7k var6 = (com.aspose.slides.internal.k4y.w7k)var0.k5();
            MathDelimiter var7 = z5p.n5(var6, var2);
            var1.add(var7);
            break;
         case 3:
            com.aspose.slides.internal.k4y.x3s var8 = (com.aspose.slides.internal.k4y.x3s)var0.k5();
            var1.add(s6s.n5(var8, var2));
            break;
         case 4:
            com.aspose.slides.internal.k4y.t8f var9 = (com.aspose.slides.internal.k4y.t8f)var0.k5();
            var1.add(s6s.n5(var9, var2));
            break;
         case 5:
            com.aspose.slides.internal.k4y.a6c var10 = (com.aspose.slides.internal.k4y.a6c)var0.k5();
            var1.add(s6s.n5(var10, var2));
            break;
         case 6:
            com.aspose.slides.internal.k4y.f7s var11 = (com.aspose.slides.internal.k4y.f7s)var0.k5();
            var1.add(s6s.n5(var11, var2));
            break;
         case 7:
            com.aspose.slides.internal.k4y.o9p var12 = (com.aspose.slides.internal.k4y.o9p)var0.k5();
            var1.add(m7c.n5(var12, var2));
            break;
         case 8:
            com.aspose.slides.internal.k4y.m1j var13 = (com.aspose.slides.internal.k4y.m1j)var0.k5();
            var1.add(s4.n5(var13, var2));
            break;
         case 9:
            var1.add(z7o.n5((com.aspose.slides.internal.k4y.i3t)var0.k5(), var2));
            break;
         case 10:
            var1.add(p0i.n5((com.aspose.slides.internal.k4y.x6g)var0.k5(), var2));
            break;
         case 11:
            var1.add(l1p.n5((com.aspose.slides.internal.k4y.b9g)var0.k5(), var2));
            break;
         case 12:
            var1.add(c5f.n5((com.aspose.slides.internal.k4y.m6c)var0.k5(), var2));
            break;
         case 13:
            var1.add(s7.n5((com.aspose.slides.internal.k4y.b3x)var0.k5(), var2));
            break;
         case 14:
            var1.add(z0.n5((com.aspose.slides.internal.k4y.q7l)var0.k5(), var2));
            break;
         case 15:
            var1.add(b3x.n5((com.aspose.slides.internal.k4y.r3m)var0.k5(), var2));
            break;
         case 16:
            var1.add(w7k.n5((com.aspose.slides.internal.k4y.h9j)var0.k5(), var2));
            break;
         case 17:
            var1.add(x6.n5((com.aspose.slides.internal.k4y.r2v)var0.k5(), var2));
            break;
         case 18:
            var1.add(d1w.n5((com.aspose.slides.internal.k4y.e8a)var0.k5(), var2));
            break;
         case 19:
            var1.add(a1f.n5((com.aspose.slides.internal.k4y.d2m)var0.k5(), var2));
            break;
         default:
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5("The type {0} not yet supported", new Object[]{var0.n5()}));
      }
   }

   public static com.aspose.slides.internal.k4y.g7 n5(IMathElement var0, g6c var1) {
      String var2 = e5m.n5(var0);
      com.aspose.slides.internal.k4y.b3 var3 = g3x.n5(var0, var1);
      return new com.aspose.slides.internal.k4y.g7(var2, var3);
   }
}
