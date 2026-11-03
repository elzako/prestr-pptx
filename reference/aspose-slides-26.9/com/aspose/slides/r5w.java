package com.aspose.slides;

class r5w {
   public static void n5(IChartDataPoint var0, com.aspose.slides.internal.k4y.l4s var1, t5w var2) {
      if (var1 != null) {
         k5r.n5(var0.getFormat(), var1.k5(), var2);
         ((ChartDataPoint)var0).k5().n5(var1.u3());
      }
   }

   public static void n5(IChartDataPoint var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l4s> var1, long var2, g6c var4) {
      if (var1 != null && k5r.n5(var0.getFormat(), null)) {
         ChartDataPoint var5 = (ChartDataPoint)var0;
         com.aspose.slides.internal.k4y.l4s var6 = (com.aspose.slides.internal.k4y.l4s)var1.invoke();
         var6.n5(var2);
         var6.n5(var5.k5().k5());
         k5r.n5(var0.getFormat(), new r5w$1(var6), var4, null, false);
      }
   }

   public static void n5(a0 var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l4s> var1, long var2, g6c var4) {
      if (var1 != null && var0.c8() != null && k5r.n5(var0.c8(), null)) {
         com.aspose.slides.internal.k4y.l4s var5 = (com.aspose.slides.internal.k4y.l4s)var1.invoke();
         var5.n5(var2);
         k5r.n5(var0.c8(), new r5w$2(var5), var4, null, false);
      }
   }

   public static void n5(ChartDataPointLevel var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l4s> var1, g6c var2) {
      if (var1 != null && var0.getFormat() != null && k5r.n5(var0.getFormat(), null)) {
         com.aspose.slides.internal.k4y.l4s var3 = (com.aspose.slides.internal.k4y.l4s)var1.invoke();
         var3.n5(var0.c8() & 4294967295L);
         k5r.n5(var0.getFormat(), new r5w$3(var3), var2, null, false);
      }
   }
}
