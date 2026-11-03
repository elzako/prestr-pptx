package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.IDisposable;

class o2e {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("delete", "txPr");

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.k6r var1, t5w var2) {
      if (var1 == null) {
         var0.setLegend(false);
      } else {
         var0.setLegend(true);
         ILegend var3 = var0.getLegend();
         n5(var3, var1);
         if (var1.s7() != null) {
            var3.setOverlay(var1.s7().n5());
         } else {
            boolean var4 = false;
            Slide var5 = com.aspose.slides.internal.v6g.k5.n5(var0.getSlide(), Slide.class);
            if (var5 != null) {
               String var6 = ((DocumentProperties)var5.getPresentation().getDocumentProperties()).getAppVersion();
               if (var6 != null && !com.aspose.slides.ms.System.d1.a6(var6, com.aspose.slides.ms.System.d1.n5)) {
                  String[] var7 = com.aspose.slides.ms.System.d1.n5(var6, '.');
                  if (var7.length > 0) {
                     try {
                        int var8 = com.aspose.slides.ms.System.a3.n5(var7[0]);
                        if (var8 <= 12) {
                           var4 = true;
                        }
                     } catch (FormatException var12) {
                     }
                  }
               }
            }

            var3.setOverlay(!var4);
         }

         if (var1.h0() != null) {
            var3.setPosition(var1.h0().n5());
         }

         k5r.n5(var3.getFormat(), var1.x8(), var2);
         y4k.n5(var3.getTextFormat(), var1.n3(), var2);

         for (com.aspose.slides.internal.k4y.p2n var16 : var1.c8()) {
            if ((var16.n5().n5() & 4294967295L) < var3.getEntries().getCount()) {
               ILegendEntryProperties var17 = var3.getEntries().get_Item((int)var16.n5().n5());
               com.aspose.slides.internal.k4y.g7 var9 = var16.l6();
               if (var9 != null) {
                  switch (n5.n5(var9.n5())) {
                     case 0:
                        com.aspose.slides.internal.k4y.c8q var10 = (com.aspose.slides.internal.k4y.c8q)var9.l6();
                        var17.setHide(var10.n5());
                        break;
                     case 1:
                        com.aspose.slides.internal.k4y.j3z var11 = (com.aspose.slides.internal.k4y.j3z)var9.l6();
                        y4k.n5(var17.getTextFormat(), var11, var2);
                        break;
                     default:
                        throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element: ", var9.n5()}));
                  }
               }

               ((LegendEntryProperties)var17).k5().n5(var16.k5());
            }
         }
      }
   }

   private static void n5(ILegend var0, com.aspose.slides.internal.k4y.k6r var1) {
      s1b var2 = ((Legend)var0).n5();
      c4f.n5(var2, var1.t2());
      var2.n5(var1.y4());
   }

   public static void n5(IChart var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.k6r> var1, g6c var2) {
      if (var0.hasLegend()) {
         ILegend var3 = var0.getLegend();
         com.aspose.slides.internal.k4y.k6r var4 = (com.aspose.slides.internal.k4y.k6r)var1.invoke();
         var4.u3().n5(var3.getOverlay());
         var4.n5().n5(var3.getPosition());
         k5r.n5(var3.getFormat(), new o2e$1(var4), var2, null, false);
         y4k.n5(var3.getTextFormat(), new o2e$2(var4), var2);
         List var5 = new List();
         if (var0.getChartData().getSeries().size() == 1
            && (
               z7d.n5((Chart)var0)
                  || ChartTypeCharacterizer.isChartTypePie(var0.getChartData().getSeries().get_Item(0).getType())
                  || ChartTypeCharacterizer.isChartTypeDoughnut(var0.getChartData().getSeries().get_Item(0).getType())
            )) {
            IGenericEnumerator var49 = var0.getChartData().getSeries().get_Item(0).getDataPoints().iterator();

            try {
               while (var49.hasNext()) {
                  IChartDataPoint var50 = (IChartDataPoint)var49.next();
                  var5.addItem((LegendEntryProperties)var50.getRelatedLegendEntry());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var49, IDisposable.class)) {
                  var49.dispose();
               }
            }
         } else {
            List var6 = new List();
            IGenericEnumerator var7 = var0.getChartData().getSeriesGroups().iterator();

            try {
               while (var7.hasNext()) {
                  IChartSeriesGroup var8 = (IChartSeriesGroup)var7.next();
                  IGenericEnumerator var9 = var8.getSeries().iterator();

                  try {
                     while (var9.hasNext()) {
                        IChartSeries var10 = (IChartSeries)var9.next();
                        var5.addItem((LegendEntryProperties)var10.getRelatedLegendEntry());
                        if (var10.getTrendLines() != null) {
                           IGenericEnumerator var11 = var10.getTrendLines().iterator();

                           try {
                              while (var11.hasNext()) {
                                 ITrendline var12 = (ITrendline)var11.next();
                                 var6.addItem((LegendEntryProperties)var12.getRelatedLegendEntry());
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                                 var11.dispose();
                              }
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                        var9.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }

            var5.addRange(var6);
         }

         long var16 = 0L;
         List$Enumerator var51 = var5.iterator();

         try {
            while (var51.hasNext()) {
               LegendEntryProperties var52 = (LegendEntryProperties)var51.next();
               ChartSeries var53 = com.aspose.slides.internal.v6g.k5.n5(var52.l6(), ChartSeries.class);
               if (var53 == null || !var53.l6()) {
                  if (var52.getHide() || y4k.n5(var52.getTextFormat()) || var52.k5().n5() != null) {
                     com.aspose.slides.internal.k4y.p2n var54 = var4.l6();
                     var54.n5().n5(var16);
                     if (var52.getHide()) {
                        var54.n5("delete");
                     } else {
                        y4k.n5(var52.getTextFormat(), new o2e$3(var54), "txPr", var2);
                     }

                     var54.n5(var52.k5().n5());
                  }

                  var16++;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var51, IDisposable.class)) {
               var51.dispose();
            }
         }

         l6(var3, var4);
      }
   }

   private static void l6(ILegend var0, com.aspose.slides.internal.k4y.k6r var1) {
      s1b var2 = ((Legend)var0).n5();
      c4f.n5(var2, new o2e$4(var1));
      var2.n5(var1.y4());
   }
}
