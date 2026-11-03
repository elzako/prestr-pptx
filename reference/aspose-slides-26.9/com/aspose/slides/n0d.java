package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class n0d {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("font", "fontRef");

   public static void n5(c7e var0, com.aspose.slides.internal.k4y.k5w var1) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.g7 var2 = var1.k5();
         if (var2 == null) {
            var0.k5((byte)0);
         } else {
            switch (n5.n5(var2.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.p4l var3 = (com.aspose.slides.internal.k4y.p4l)var2.l6();
                  var0.k5((byte)1);
                  b1u.n5(var0.u3(), var3);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.p6t var4 = (com.aspose.slides.internal.k4y.p6t)var2.l6();
                  var0.k5((byte)2);
                  c4i.n5(var0.a6(), var4.l6());
                  var0.u3(var4.n5());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var2.n5(), "\""}));
            }
         }

         c4i.n5(var0.h0(), var1.u3());
         var0.n5((byte)var1.n5());
         var0.l6((byte)var1.l6());
         var0.t2().n5(var1.a6());
      }
   }

   public static void n5(c7e var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.k5w> var1) {
      if (var0.c8()) {
         com.aspose.slides.internal.k4y.k5w var2 = (com.aspose.slides.internal.k4y.k5w)var1.invoke();
         switch (var0.k5()) {
            case 0:
            default:
               break;
            case 1:
               com.aspose.slides.internal.k4y.p4l var3 = (com.aspose.slides.internal.k4y.p4l)var2.l6("font").l6();
               b1u.l6(var0.u3(), var3);
               break;
            case 2:
               com.aspose.slides.internal.k4y.p6t var4 = (com.aspose.slides.internal.k4y.p6t)var2.l6("fontRef").l6();
               c4i.n5(var0.a6(), new n0d$1(var4));
               var4.n5(var0.u9());
         }

         c4i.n5(var0.h0(), new n0d$2(var2));
         var2.n5(var0.n5());
         var2.l6(var0.l6());
         var2.n5(var0.t2().n5());
      }
   }
}
