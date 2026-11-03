package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;

class b6w {
   public static void n5(w0j var0, com.aspose.slides.internal.k4y.g7 var1, t5w var2) {
      if (var1 != null) {
         if ("fill".equals(var1.n5())) {
            var0.n5((byte)1);
            com.aspose.slides.internal.k4y.v2s var3 = (com.aspose.slides.internal.k4y.v2s)var1.l6();
            x9f.n5(var0.l6(), var3.n5(), var2);
         } else {
            if (!"fillRef".equals(var1.n5())) {
               throw new Exception();
            }

            var0.n5((byte)2);
            com.aspose.slides.internal.k4y.x2y var4 = (com.aspose.slides.internal.k4y.x2y)var1.l6();
            c4i.n5(var0.k5(), var4.l6());
            var0.n5(var4.n5());
         }
      }
   }

   public static void n5(w0j var0, g7$n5 var1, g6c var2) {
      switch (var0.u3()) {
         case 0:
         default:
            break;
         case 1:
            com.aspose.slides.internal.k4y.v2s var3 = (com.aspose.slides.internal.k4y.v2s)var1.n5("fill").l6();
            x9f.n5(var0.l6(), new b6w$1(var3), true, var2);
            break;
         case 2:
            com.aspose.slides.internal.k4y.x2y var4 = (com.aspose.slides.internal.k4y.x2y)var1.n5("fillRef").l6();
            c4i.n5(var0.k5(), new b6w$2(var4));
            var4.n5(var0.n5());
      }
   }
}
