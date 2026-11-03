package com.aspose.slides;

class t4n {
   public static void n5(x6q var0, com.aspose.slides.internal.k4y.o9i var1, t5w var2) {
      if (var1 != null) {
         if (var1.l6() != null) {
            com.aspose.slides.internal.k4y.a2w var3 = var1.l6();
            v1x.n5(var0.n5(), var3.t2());
            v1x.n5(var0.l6(), var3.s7());
            v1x.n5(var0.k5(), var3.x8());
            v1x.n5(var0.u3(), var3.n3());
            v1x.n5(var0.a6(), var3.y4());
            v1x.n5(var0.u9(), var3.e2());
            v1x.n5(var0.h0(), var3.t9());
            v1x.n5(var0.c8(), var3.z1());
            var0.x8().n5(var3.t4());
         }

         b6w.n5(var0.t2(), var1.k5(), var2);
         var0.x8().n5(var1.u3());
      }
   }

   public static void n5(x6q var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.o9i> var1, g6c var2) {
      if (var0.s7()) {
         com.aspose.slides.internal.k4y.o9i var3 = (com.aspose.slides.internal.k4y.o9i)var1.invoke();
         if (var0.n5().n5() != 0
            || var0.l6().n5() != 0
            || var0.k5().n5() != 0
            || var0.u3().n5() != 0
            || var0.a6().n5() != 0
            || var0.u9().n5() != 0
            || var0.h0().n5() != 0
            || var0.c8().n5() != 0
            || var0.x8().n5() != null) {
            com.aspose.slides.internal.k4y.a2w var4 = var3.n5();
            v1x.n5(var0.n5(), new t4n$1(var4));
            v1x.n5(var0.l6(), new t4n$2(var4));
            v1x.n5(var0.k5(), new t4n$3(var4));
            v1x.n5(var0.u3(), new t4n$4(var4));
            v1x.n5(var0.a6(), new t4n$5(var4));
            v1x.n5(var0.u9(), new t4n$6(var4));
            v1x.n5(var0.h0(), new t4n$7(var4));
            v1x.n5(var0.c8(), new t4n$8(var4));
            var4.n5(var0.x8().n5());
         }

         b6w.n5(var0.t2(), new t4n$9(var3), var2);
         var3.n5(var0.x8().l6());
      }
   }
}
