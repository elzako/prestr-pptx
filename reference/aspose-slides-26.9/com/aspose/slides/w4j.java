package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class w4j {
   public static void n5(Ink var0, InkTrace var1, com.aspose.slides.internal.k4y.o3x var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         if (var2.l6() != 0) {
            switch (var2.l6()) {
               case 2:
                  var1.n5(2);
                  break;
               case 3:
                  var1.n5(3);
                  break;
               default:
                  var1.n5(1);
            }
         }

         if (var2.k5() != 0) {
            switch (var2.k5()) {
               case 1:
                  var1.l6(1);
                  break;
               case 2:
                  var1.l6(2);
                  break;
               case 3:
                  var1.l6(3);
                  break;
               default:
                  throw new NotImplementedException("LoadTraceElementData: Continuation - unknown element.");
            }
         }

         var1.l6(var2.u3());
         var1.k5(var2.a6());
         var1.u3(var2.u9());
         if (!com.aspose.slides.ms.System.d1.n5(var2.h0())) {
            var1.n5(com.aspose.slides.ms.System.d2.n5(var2.h0(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         if (!com.aspose.slides.ms.System.d1.n5(var2.c8())) {
            var1.l6(com.aspose.slides.ms.System.d2.n5(var2.c8(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         var1.a6(var2.t2());
      }
   }

   public static void n5(InkTrace var0, com.aspose.slides.internal.k4y.o3x var1) {
      var1.n5(var0.k5());
      var1.l6(var0.u9());
      var1.k5(var0.h0());
      var1.u3(var0.c8());
      if (var0.t2() != 0.0) {
         var1.a6(com.aspose.slides.ms.System.d2.n5(var0.t2(), com.aspose.slides.internal.x7n.l6.k5()));
      }

      if (var0.s7() != 0.0) {
         var1.u9(com.aspose.slides.ms.System.d2.n5(var0.s7(), com.aspose.slides.internal.x7n.l6.k5()));
      }

      var1.h0(var0.x8());
      if (var0.u3() != 0) {
         switch (var0.u3()) {
            case 2:
               var1.n5(2);
               break;
            case 3:
               var1.n5(3);
               break;
            default:
               var1.n5(1);
         }
      }

      if (var0.a6() != 0) {
         switch (var0.a6()) {
            case 1:
               var1.l6(1);
               break;
            case 2:
               var1.l6(2);
               break;
            case 3:
               var1.l6(3);
         }
      }
   }
}
