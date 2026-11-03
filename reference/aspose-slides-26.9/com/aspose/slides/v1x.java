package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class v1x {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("ln", "lnRef");

   public static void n5(v9r var0, com.aspose.slides.internal.k4y.l4w var1) {
      if (var1 != null) {
         var0.n5(0L);
         var0.n5((byte)0);
         if (var1.n5() != null) {
            switch (n5.n5(var1.n5().n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.r5w var2 = (com.aspose.slides.internal.k4y.r5w)var1.n5().l6();
                  var0.n5((byte)1);
                  i3z.n5(var0.l6(), var2);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.x2y var3 = (com.aspose.slides.internal.k4y.x2y)var1.n5().l6();
                  var0.n5((byte)2);
                  c4i.n5(var0.k5(), var3.l6());
                  var0.n5(var3.n5());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5().n5(), "\""}));
            }
         }
      }
   }

   public static void n5(v9r var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l4w> var1) {
      if (var0.n5() != 0) {
         com.aspose.slides.internal.k4y.l4w var2 = (com.aspose.slides.internal.k4y.l4w)var1.invoke();
         switch (var0.n5()) {
            case 1:
               com.aspose.slides.internal.k4y.r5w var3 = (com.aspose.slides.internal.k4y.r5w)var2.n5("ln").l6();
               i3z.l6(var0.l6(), var3);
               break;
            case 2:
               com.aspose.slides.internal.k4y.x2y var4 = (com.aspose.slides.internal.k4y.x2y)var2.n5("lnRef").l6();
               c4i.n5(var0.k5(), new v1x$1(var4));
               var4.n5(var0.u3());
         }
      }
   }
}
