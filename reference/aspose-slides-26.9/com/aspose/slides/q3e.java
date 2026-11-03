package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class q3e {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "threshold", "resolution", "quantization", "noise", "accuracy", "crossCoupling", "skew", "minBandwidth", "peakRate", "distortion"
   );

   public static void n5(Ink var0, l7m var1, com.aspose.slides.internal.k4y.c6l var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         var1.l6(var2.l6());
         var1.k5(var2.k5());
         var1.u3(var2.u3());
         var1.a6(var2.a6());
         var1.u9(var2.u9());
         if (var2.h0() != null) {
            a9j var3 = new a9j();
            a2y.n5(var0, var3, var2.h0());
            var1.n5(var3);
         }

         if (var2.c8() != null) {
            k3r var8 = new k3r();
            c4d.n5(var0, var8, var2.c8());
            var1.n5(var8);
         }

         if (var2.t2() != null) {
            var1.n5(com.aspose.slides.ms.System.d2.n5(var2.t2().n5(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         if (var2.s7() != null) {
            z4s var9 = new z4s();
            s1a.n5(var0, var9, var2.s7());
            var1.n5(var9);
         }

         if (var2.x8() != null && var2.x8().length > 0) {
            throw new NotImplementedException("SourcePropertyList");
         }

         if (var2.n3() != null && var2.n3().n5().length > 0) {
            for (com.aspose.slides.internal.k4y.w2e var6 : var2.n3().n5()) {
               q8v var7 = var1.h0() != null ? var1.h0().l6(var6.n5()) : null;
               if (var7 != null) {
                  switch (n5.n5(var6.l6())) {
                     case 0:
                        var7.k5(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        var7.u9(var6.u3());
                        break;
                     case 1:
                        var7.u3(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        var7.h0(var6.u3());
                        break;
                     case 2:
                        var7.k5(com.aspose.slides.ms.System.a3.n5(var6.k5()));
                        break;
                     case 3:
                        var7.a6(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        break;
                     case 4:
                        var7.u9(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        var7.c8(var6.u3());
                        break;
                     case 5:
                        var7.h0(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        break;
                     case 6:
                        var7.c8(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        break;
                     case 7:
                        var7.u3(com.aspose.slides.ms.System.a3.n5(var6.k5()));
                        break;
                     case 8:
                        var7.t2(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        break;
                     case 9:
                        var7.s7(com.aspose.slides.ms.System.Xml.f4.k7(var6.k5()));
                        var7.t2(var6.u3());
                        break;
                     default:
                        throw new NotImplementedException();
                  }
               }
            }
         }
      }
   }

   public static void n5(l7m var0, com.aspose.slides.internal.k4y.c6l var1) {
      var1.n5(var0.n5());
      var1.l6(var0.l6());
      var1.k5(var0.k5());
      var1.u3(var0.u3());
      var1.a6(var0.a6());
      var1.u9(var0.u9());
      if (var0.h0() != null) {
         com.aspose.slides.internal.k4y.o0s var2 = new com.aspose.slides.internal.k4y.o0s();
         a2y.n5(var0.h0(), var2);
         var1.n5(var2);
      }

      if (var0.c8() != null && var0.c8().l6() != 0.0) {
         com.aspose.slides.internal.k4y.i9f var9 = new com.aspose.slides.internal.k4y.i9f();
         c4d.n5(var0.c8(), var9);
         var1.n5(var9);
      }

      if (var0.t2() != 0.0) {
         com.aspose.slides.internal.k4y.y6s var10 = new com.aspose.slides.internal.k4y.y6s();
         var10.n5(com.aspose.slides.ms.System.d2.n5(var0.t2(), com.aspose.slides.internal.x7n.l6.k5()));
         var1.n5(var10);
      }

      if (var0.s7() != null) {
         com.aspose.slides.internal.k4y.c8k var11 = new com.aspose.slides.internal.k4y.c8k();
         s1a.n5(var0.s7(), var11);
         var1.n5(var11);
      }

      if (var0.x8() != null && var0.x8().size() > 0) {
         throw new NotImplementedException("WriteSourcePropertyList");
      }

      com.aspose.slides.internal.k4y.o2i var12 = new com.aspose.slides.internal.k4y.o2i();
      if (var0.h0() != null && var0.h0().l6().size() > 0) {
         List$Enumerator var3 = var0.h0().l6().iterator();

         try {
            while (var3.hasNext()) {
               q8v var4 = (q8v)var3.next();
               com.aspose.slides.internal.k4y.w2e var5 = new com.aspose.slides.internal.k4y.w2e();
               if (var4.y4() != 0.0) {
                  var5.n5(var4.l6());
                  var5.l6("resolution");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.y4()));
                  var5.u3(var4.e2());
                  var12.n5(var5);
               }

               if (var4.x8() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("threshold");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.x8()));
                  var5.u3(var4.n3());
                  var12.n5(var5);
               }

               if (var4.t9() != 0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("quantization");
                  var5.k5(com.aspose.slides.ms.System.a3.n5(var4.t9(), com.aspose.slides.internal.x7n.l6.k5()));
                  var12.n5(var5);
               }

               if (var4.z1() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("noise");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.z1()));
                  var12.n5(var5);
               }

               if (var4.t4() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("accuracy");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.t4()));
                  var5.u3(var4.q0());
                  var12.n5(var5);
               }

               if (var4.z3() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("crossCoupling");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.z3()));
                  var12.n5(var5);
               }

               if (var4.m1() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("skew");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.m1()));
                  var12.n5(var5);
               }

               if (var4.k7() != 0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("minBandwidth");
                  var5.k5(com.aspose.slides.ms.System.a3.n5(var4.k7(), com.aspose.slides.internal.x7n.l6.k5()));
                  var12.n5(var5);
               }

               if (var4.m3() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("peakRate");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.m3()));
                  var12.n5(var5);
               }

               if (var4.z8() != 0.0) {
                  var5 = new com.aspose.slides.internal.k4y.w2e();
                  var5.n5(var4.l6());
                  var5.l6("distortion");
                  var5.k5(com.aspose.slides.ms.System.Xml.f4.n5(var4.z8()));
                  var5.u3(var4.j5());
                  var12.n5(var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (var12.n5().length > 0) {
         var1.n5(var12);
      }
   }
}
