package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;

class i8s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("effect", "effectRef");

   public static void n5(v3x var0, com.aspose.slides.internal.k4y.g7 var1, t5w var2) {
      if (var1 != null) {
         var0.n5(0L);
         var0.n5((byte)0);
         switch (n5.n5(var1.n5())) {
            case 0:
               com.aspose.slides.internal.k4y.x4g var3 = (com.aspose.slides.internal.k4y.x4g)var1.l6();
               var0.n5((byte)1);
               w5i.n5(new i8s$1(var0), var3.n5(), var2);
               break;
            case 1:
               com.aspose.slides.internal.k4y.x2y var4 = (com.aspose.slides.internal.k4y.x2y)var1.l6();
               var0.n5((byte)2);
               c4i.n5(var0.k5(), var4.l6());
               var0.n5(var4.n5());
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      }
   }

   public static void n5(v3x var0, g7$n5 var1, g6c var2) {
      switch (var0.n5()) {
         case 0:
         default:
            break;
         case 1:
            com.aspose.slides.internal.k4y.x4g var3 = (com.aspose.slides.internal.k4y.x4g)var1.n5("effect").l6();
            w5i.n5(var0.l6(), new i8s$2(var3), var2);
            break;
         case 2:
            com.aspose.slides.internal.k4y.x2y var4 = (com.aspose.slides.internal.k4y.x2y)var1.n5("effectRef").l6();
            c4i.n5(var0.k5(), new i8s$3(var4));
            var4.n5(var0.u3());
      }
   }
}
