package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class u3b {
   public static void n5(z4a var0, com.aspose.slides.internal.k4y.r2d var1, t5w var2) {
      if (var1.u9() != null) {
         var0.k5(var1.u9().n5() == 1 || var1.u9().n5() == 0);
      }

      if (var1.a6() != null) {
         var0.n5(new com.aspose.slides.ms.System.o5<>(var1.a6().n5()));
      }

      if (var1.n5() != null) {
         var0.n5(var1.n5().n5() == 1 || var1.n5().n5() == 0);
      }

      if (var1.u3() != null) {
         var0.l6(o5b.l6(com.aspose.slides.internal.v6g.k5.n5(var1.u3().l6(), com.aspose.slides.internal.k4y.g3p.class)));
      }

      if (var1.l6() != null) {
         var0.n5(w2p.x8(var1.l6().n5()));
      }

      if (var1.k5() != null) {
         var0.l6(w2p.y4(var1.k5().n5()));
      }
   }

   public static void n5(z4a var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r2d> var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("runProperties");
      }

      if (var1 == null) {
         throw new ArgumentNullException("addDelegate");
      }

      z4a var3 = new z4a();
      com.aspose.slides.internal.k4y.r2d var4 = (com.aspose.slides.internal.k4y.r2d)var1.invoke();
      if (var0.u9() != var3.u9()) {
         var4.l6(o5b.n5(var0.u9()));
      }

      if (var0.a6().l6()) {
         com.aspose.slides.internal.k4y.s1y var5 = new com.aspose.slides.internal.k4y.s1y();
         var5.n5(var0.a6().n5());
         var4.n5(var5);
      }

      if (var0.n5() != var3.n5()) {
         var4.n5(o5b.n5(var0.n5()));
      }

      if (var0.l6() != var3.l6()) {
         var4.n5(new com.aspose.slides.internal.k4y.g7("nor", o5b.n5(var0.l6())));
      }

      if (var0.k5() != var3.k5()) {
         com.aspose.slides.internal.k4y.y1w var6 = new com.aspose.slides.internal.k4y.y1w();
         var6.n5(w2p.n3(var0.k5()));
         var4.n5(var6);
      }

      if (var0.u3() != var3.u3()) {
         com.aspose.slides.internal.k4y.c1m var7 = new com.aspose.slides.internal.k4y.c1m();
         var7.n5(w2p.e2(var0.u3()));
         var4.n5(var7);
      }
   }
}
