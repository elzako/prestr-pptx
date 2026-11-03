package com.aspose.slides;

import com.aspose.slides.internal.k4y.g7$n5;

class i6d {
   public static void n5(IScaleEffect var0, com.aspose.slides.internal.k4y.q6i var1) {
      if (var1.h0() != null) {
         ((ScaleEffect)var0).n5(new com.aspose.slides.internal.o9b.w1(var1.h0().n5(), var1.h0().l6()));
      }

      if (var1.c8() != null) {
         ((ScaleEffect)var0).l6(new com.aspose.slides.internal.o9b.w1(var1.c8().n5(), var1.c8().l6()));
      }

      if (var1.u9() != null) {
         ((ScaleEffect)var0).k5(new com.aspose.slides.internal.o9b.w1(var1.u9().n5(), var1.u9().l6()));
      }

      var0.setZoomContent(var1.u3());
   }

   public static void n5(IScaleEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.q6i var3 = (com.aspose.slides.internal.k4y.q6i)var1.n5("animScale").l6();
      var2[0] = var3.a6();
      if (!com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).l6().l6()) && !com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).l6().k5())) {
         o5.n5(var3.l6(), ((ScaleEffect)var0).l6().u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).k5().l6()) && !com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).k5().k5())) {
         o5.n5(var3.k5(), ((ScaleEffect)var0).k5().u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).u3().l6()) && !com.aspose.slides.ms.System.n1.k5(((ScaleEffect)var0).u3().k5())) {
         o5.n5(var3.n5(), ((ScaleEffect)var0).u3().u3());
      }

      var3.n5(var0.getZoomContent());
   }
}
