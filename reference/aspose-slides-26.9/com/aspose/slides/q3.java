package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class q3 {
   public static void n5(IAxisFormat var0, com.aspose.slides.internal.k4y.b9y var1, t5w var2) {
      if (var1 != null) {
         if (var1.x8() == null && var1.n3() == null) {
            x9f.n5(var0.getFill(), var1.c8(), var2);
            i3z.n5(var0.getLine(), var1.t2());
            w5i.n5(var0.getEffect(), var1.s7(), var2);
            n5(var0, var1);
         } else {
            throw new Exception();
         }
      }
   }

   private static void n5(IAxisFormat var0, com.aspose.slides.internal.k4y.b9y var1) {
      q2 var2 = ((AxisFormat)var0).n5();
      var2.n5(var1.y4());
   }

   public static void n5(IAxisFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.b9y> var1, g6c var2) {
      if (n5(var0)) {
         com.aspose.slides.internal.k4y.b9y var3 = (com.aspose.slides.internal.k4y.b9y)var1.invoke();
         x9f.n5(var0.getFill(), new q3$1(var3), var2);
         i3z.n5(var0.getLine(), new q3$2(var3));
         w5i.n5(var0.getEffect(), new q3$3(var3), var2);
         l6(var0, var3);
      }
   }

   private static void l6(IAxisFormat var0, com.aspose.slides.internal.k4y.b9y var1) {
      q2 var2 = ((AxisFormat)var0).n5();
      var1.n5(var2.n5());
   }

   static boolean n5(IAxisFormat var0) {
      return var0.getFill().getFillType() != -1 || !var0.getLine().isFormatNotDefined() || !var0.getEffect().isNoEffects();
   }
}
