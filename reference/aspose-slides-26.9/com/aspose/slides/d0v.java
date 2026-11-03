package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class d0v {
   public static void n5(x8m var0, com.aspose.slides.internal.k4y.c9t var1) {
      if (var1 != null) {
         Dictionary[] var2 = new Dictionary[]{var0.l6};
         var0.n5 = u7a.n5(var1.k5(), null, var2);
         var0.l6 = var2[0];
         var0.n5(var1.l6());
      }
   }

   public static void n5(x8m var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.c9t> var1, g6c var2) {
      if (var0.n5() != -1) {
         com.aspose.slides.internal.k4y.c9t var3 = (com.aspose.slides.internal.k4y.c9t)var1.invoke();
         u7a.n5(var0.n5, var3.n5());
         if (var0.n5() == 41) {
            var2.n5("PPT serialization of the presetTextShape of type TextShapeType.Custom is not implemented yet.", 2);
         } else {
            var3.n5(var0.n5());
         }
      }
   }
}
