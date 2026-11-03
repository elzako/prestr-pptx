package com.aspose.slides;

class s5g {
   public static void n5(x6s var0, com.aspose.slides.internal.k4y.n6o var1, o9g var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.j8t var3 = var1.h0();
         com.aspose.slides.internal.k4y.s4e var4 = var1.a6();
         var0.l6(var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.l6()) ? var4.l6() : 15.0);
         var0.n5(var4 != null && !com.aspose.slides.ms.System.d2.k5(var4.n5()) ? n5(var4.n5()) : n5(8.43));

         for (com.aspose.slides.internal.k4y.f1j var8 : var3.l6()) {
            if (!var0.k5.containsKey(var8.l6())) {
               var0.k5.addItem(var8.l6(), new q8g(var8.u3(), var8.a6(), com.aspose.slides.ms.System.d2.k5(var8.k5()) ? var0.u9() : var8.k5()));
            }

            for (com.aspose.slides.internal.k4y.u1v var12 : var8.u9()) {
               var2.a6().throwIfInterruptionRequested();
               ChartDataCell var13 = new ChartDataCell(var0);
               x7i.n5(var13, var12, var2);
               var0.n5(var13);
            }
         }

         for (com.aspose.slides.internal.k4y.w0j var19 : var1.u9()) {
            for (com.aspose.slides.internal.k4y.h1v var23 : var19.n5()) {
               for (long var14 = var23.n5(); (var14 & 4294967295L) <= (var23.l6() & 4294967295L); var14++) {
                  if (!var0.u3.containsKey(var14)) {
                     var0.u3.addItem(var14, new r6i(var23.u3(), var23.a6(), com.aspose.slides.ms.System.d2.k5(var23.k5()) ? var0.a6() : n5(var23.k5())));
                  }
               }
            }
         }
      }
   }

   private static double n5(double var0) {
      return com.aspose.slides.ms.System.q1.a6((256.0 * var0 + com.aspose.slides.ms.System.q1.a6(18.285714285714285)) / 256.0 * 7.0) * 0.75;
   }
}
