package com.aspose.slides;

class x1f {
   public static void n5(IChartLinesFormat var0, com.aspose.slides.internal.k4y.n9p var1, t5w var2) {
      var0.getLine().getFillFormat().setFillType((byte)(var1 == null ? 0 : -1));
      if (var1 != null) {
         com.aspose.slides.internal.k4y.b9y var3 = var1.l6();
         if (var3 != null) {
            r9x.n5(var0.getLine().getFillFormat(), var3.c8());
            if (var3.x8() != null || var3.n3() != null) {
               var2.n5("3D properties on series lines are not supported and will be ignored.", 1);
            }

            i3z.n5(var0.getLine(), var3.t2());
            w5i.n5(var0.getEffect(), var3.s7(), var2);
            ((ChartLinesFormat)var0).n5().n5(var3.y4());
         }
      }
   }

   public static void n5(IChartLinesFormat var0, com.aspose.slides.internal.k4y.n9p var1, g6c var2) {
      if (var1 != null && var0 != null && (!var0.getLine().isFormatNotDefined() || !var0.getEffect().isNoEffects())) {
         com.aspose.slides.internal.k4y.b9y var3 = var1.n5();
         i3z.n5(var0.getLine(), new x1f$1(var3));
         w5i.n5(var0.getEffect(), new x1f$2(var3), var2);
         var3.n5(((ChartLinesFormat)var0).n5().n5());
      }
   }
}
