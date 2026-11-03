package com.aspose.slides;

class o7o {
   public static void n5(Ink var0, q8v var1, com.aspose.slides.internal.k4y.j0p var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         var1.l6(var2.l6());
         switch (var2.k5()) {
            case 1:
               var1.n5(1);
               break;
            case 2:
               var1.n5(2);
               break;
            case 3:
               var1.n5(3);
               break;
            case 4:
               var1.n5(4);
               break;
            default:
               var1.n5(0);
         }

         var1.k5(var2.u3());
         if (!com.aspose.slides.ms.System.n1.k5(var2.a6())) {
            var1.n5(var2.a6());
         }

         if (!com.aspose.slides.ms.System.n1.k5(var2.u9())) {
            var1.l6(var2.u9());
         }

         if (var2.h0() == 2) {
            var1.l6(1);
         }

         var1.u3(var2.c8());
         var1.a6(var2.t2());
         if (var2.s7() != null) {
            q1p var3 = new q1p();
            r6f.n5(var0, var3, var2.s7());
            var1.n5(var3);
         }
      }
   }

   public static void n5(q8v var0, com.aspose.slides.internal.k4y.j0p var1) {
      var1.n5(var0.n5());
      var1.l6(var0.l6());
      if (var0.k5() != 0) {
         switch (var0.k5()) {
            case 1:
               var1.n5(1);
               break;
            case 2:
               var1.n5(2);
               break;
            case 3:
               var1.n5(3);
               break;
            case 4:
               var1.n5(4);
         }
      }

      var1.k5(var0.u3());
      var1.n5((float)var0.a6());
      var1.l6((float)var0.u9());
      if (var0.h0() != 0) {
         var1.l6(2);
      }

      var1.u3(var0.c8());
      var1.a6(var0.t2());
      if (var0.s7() != null) {
         com.aspose.slides.internal.k4y.p1n var2 = new com.aspose.slides.internal.k4y.p1n();
         r6f.n5(var0.s7(), var2);
         var1.n5(var2);
      }
   }
}
