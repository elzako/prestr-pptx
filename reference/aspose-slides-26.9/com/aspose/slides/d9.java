package com.aspose.slides;

class d9 {
   public static void n5(IChartTitle var0, com.aspose.slides.internal.k4y.n8n var1, t5w var2) {
      if (var1 != null) {
         k5r.n5(var0.getFormat(), var1.a6(), var2);
         w5s.n5(var0, var1.u3(), var1.u9(), var2);
         y5s var3 = ((ChartTitle)var0).n5();
         var3.n5(var1.h0());
      }
   }

   public static void n5(IChartTitle var0, com.aspose.slides.internal.k4y.n8n var1, g6c var2) {
      y5s var3 = ((ChartTitle)var0).n5();
      k5r.n5(var0.getFormat(), new d9$1(var1), var2, null, false);
      ITextFrame var4 = var0.getTextFrameForOverriding();
      if (var4 != null && var4.getParagraphs().getCount() != 0) {
         com.aspose.slides.internal.k4y.e8j var5 = var1.n5();
         com.aspose.slides.internal.k4y.j3z var6 = (com.aspose.slides.internal.k4y.j3z)var5.n5("rich").l6();
         o4z.n5(var4, var6, var2);
      }

      y4k.n5(var0.getTextFormat(), new d9$2(var1), var2, var0);
      var1.n5(var3.u3());
   }
}
