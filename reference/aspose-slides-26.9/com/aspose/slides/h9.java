package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class h9 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("bgPr", "bgRef");

   public static void n5(IBackground var0, com.aspose.slides.internal.k4y.v4c var1, t5w var2) {
      if (var1 != null) {
         r7 var3 = ((Background)var0).u3();
         var3.n5(var1.n5());
         switch (n5.n5(var1.l6().n5())) {
            case 0:
               com.aspose.slides.internal.k4y.h5t var4 = (com.aspose.slides.internal.k4y.h5t)var1.l6().l6();
               var0.setType((byte)1);
               x9f.n5(var0.getFillFormat(), var4.l6(), var2);
               w5i.n5(var0.getEffectFormat(), var4.k5(), var2);
               var3.n5(var4.n5());
               if (var3.k5() && var0.getFillFormat().getFillType() == 2) {
                  var3.n5(((BaseSlide)var0.getSlide()).n5((byte)0));
                  if (var3.u3() == null) {
                     var3.n5(((BaseSlide)var0.getSlide()).n5((byte)2));
                  }
               }

               var3.n5(var4.u3());
               break;
            case 1:
               com.aspose.slides.internal.k4y.x2y var5 = (com.aspose.slides.internal.k4y.x2y)var1.l6().l6();
               var0.setType((byte)0);
               var3.n5(var5.n5());
               c4i.n5(var0.getStyleColor(), var5.l6());
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.l6().n5(), "\""}));
         }
      }
   }

   public static void n5(IBackground var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.v4c> var1, g6c var2) {
      if (var0 != null && var0.getType() != -1) {
         r7 var3 = ((Background)var0).u3();
         com.aspose.slides.internal.k4y.v4c var4 = (com.aspose.slides.internal.k4y.v4c)var1.invoke();
         var4.n5(var3.n5());
         switch (var0.getType()) {
            case 0:
               com.aspose.slides.internal.k4y.x2y var6 = (com.aspose.slides.internal.k4y.x2y)var4.n5("bgRef").l6();
               c4i.n5(var0.getStyleColor(), new h9$3(var6));
               var6.n5(var3.a6());
               break;
            case 1:
               com.aspose.slides.internal.k4y.h5t var5 = (com.aspose.slides.internal.k4y.h5t)var4.n5("bgPr").l6();
               x9f.n5(var0.getFillFormat(), new h9$1(var5), var2);
               w5i.n5(var0.getEffectFormat(), new h9$2(var5), var2);
               var5.n5(var3.k5());
               var5.n5(var3.l6());
               break;
            default:
               throw new Exception();
         }
      }
   }
}
