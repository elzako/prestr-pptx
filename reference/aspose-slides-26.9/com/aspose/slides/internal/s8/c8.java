package com.aspose.slides.internal.s8;

import com.aspose.slides.ms.System.d5;

public class c8 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.k1.x8 var2 = new com.aspose.slides.internal.k1.x8();
      int var3 = var1.r4();
      if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.k5.class), var3)) {
         var2.n5(var3 & 65535);
         var2.n5((com.aspose.slides.internal.k1.c8)new a6().n5(var1));
         int var4 = var1.r4();
         if (var2.n5() == 2) {
            if (!d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.s7.class), var4)) {
               throw new com.aspose.slides.internal.p5.l6("Invalid WmfHatchStyle for WmfLogBrush");
            }

            var2.l6(var4 & 65535);
         }

         return var2;
      } else {
         throw new com.aspose.slides.internal.p5.l6("Invalid WmfBrushStyle for WmfLogBrush");
      }
   }
}
