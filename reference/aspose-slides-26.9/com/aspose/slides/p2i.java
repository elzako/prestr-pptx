package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class p2i {
   public static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.m3 var1, com.aspose.slides.internal.k4y.k7 var2, c1x var3) {
      if (var1 == null) {
         throw new Exception("seriesElementData must not be null.");
      }

      t5w var4 = var3.n5().n5();
      c9t var5 = ((ChartSeries)var0).n5();
      var5.n5(var1.n5().n5());
      var0.setOrder((int)var1.l6().n5());
      d0p.n5(var0, var1);
      k5r.n5(var0.getFormat(), var1.k5(), var4);
      v9t.n5(var0.getMarker(), var1.aE_(), var4);
      var5.n5(var1.z8());
      if (var1.c4() != null) {
         var0.setInvertIfNegative(var1.c4().n5());
      } else if (n5(var4)) {
         var0.setInvertIfNegative(false);
      }

      if (var2.a0() != null) {
         ((ChartSeries)var0).l6(var2.a0().n5());
      }

      if (var1.z1() != null) {
         ((ChartSeries)var0).l6(var1.z1().n5());
      }

      if (var1.k7() != null) {
         for (com.aspose.slides.internal.k4y.l6z var9 : var1.k7()) {
            ITrendline var10 = var0.getTrendLines().add(var9.n3().n5());
            f2e.n5(var10, var9, var4);
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.i5k.class)) {
         com.aspose.slides.internal.k4y.i5k var14 = (com.aspose.slides.internal.k4y.i5k)var1;
         if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.u3r.class)) {
            if (var2.f2() != null) {
               var0.setBar3DShape(var2.f2().n5());
            }

            if (var14.a0() != null) {
               var0.setBar3DShape(var14.a0().n5());
            }
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.t6w.class)) {
         com.aspose.slides.internal.k4y.t6w var15 = (com.aspose.slides.internal.k4y.t6w)var1;
         if (var15.y2() != null) {
            var0.setExplosion((int)var15.y2().n5());
         }
      }

      boolean var16 = var3.k5().h0() == null && t9p.n5(var2, var3);
      k3h var17 = null;
      if (var1.aA_() != null) {
         var17 = n5(var0, var1.aA_().n5());
         var17.n5(var0, var1.aA_(), 0, var4, var16);
      }

      if (var1.aB_() != null) {
         var17 = n5(var0, var1.aB_().n5());
         var17.n5(var0, var1.aB_(), 1, var4, var16);
      }

      if (var1.aK_() != null) {
         var17 = n5(var0, var1.aK_().n5());
         var17.n5(var0, var1.aK_(), 2, var4, var16);
      }

      if (var1.aG_() != null) {
         var17 = n5(var0, var1.aG_().n5());
         var17.n5(var0, var1.aG_(), 3, var4, var16);
      }

      n5(var0, var1, var4);
      var0.setNumberFormatOfValues(n5(var1.aG_()));
      var0.setNumberFormatOfXValues(n5(var1.aA_()));
      var0.setNumberFormatOfYValues(n5(var1.aB_()));
      var0.setNumberFormatOfBubbleSizes(n5(var1.aK_()));
      int var22 = var0.getDataPoints().size();
      if (var1.z3() != null) {
         ChartDataPointCollection var23 = (ChartDataPointCollection)var0.getDataPoints();

         for (int var26 = 0; var26 < var1.z3().length; var26++) {
            com.aspose.slides.internal.k4y.v0v var11 = var1.z3()[var26];
            long[] var12 = new long[]{var11.u9().n5()};
            ChartDataPoint var13 = com.aspose.slides.internal.v6g.k5.n5(var23.n5(new p2i$1(var12)), ChartDataPoint.class);
            if (var13 == null) {
               var13 = (ChartDataPoint)var23.n5();
               var13.n5(var12[0]);
            }

            t5g.n5(var13, var11, var4);
         }
      }

      k6r.n5(var0.getLabels(), var2.t2(), var4);
      k6r.n5(var0.getLabels(), var1.t4(), var4);
      if (var22 < var0.getDataPoints().size()) {
         for (int var24 = var22; var24 < var0.getDataPoints().size(); var24++) {
            ((ChartDataPoint)var0.getDataPoints().get_Item(var24)).l6(true);
         }
      }

      var5.n5(var1.a6());
      com.aspose.slides.internal.k4y.e2l var25 = com.aspose.slides.internal.k4y.i4w.n5(var1.a6());
      if (var25 != null) {
         c4i.n5(var0.getInvertedSolidFillColor(), var25.n5());
      }

      d0p.l6(var0, var1);
   }

   private static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.m3 var1, t5w var2) {
      Object var3 = null;
      if (var1.j5() != null) {
         for (com.aspose.slides.internal.k4y.y4g var7 : var1.j5()) {
            if (var7.h0().n5() == 1) {
               n5(var0, var7, var2);
            } else if (var7.h0().n5() == 2) {
               l6(var0, var7, var2);
            }
         }
      } else if (var1.w1() != null) {
         com.aspose.slides.internal.k4y.y4g var4 = var1.w1();
         if (var4.h0() != null) {
            if (var4.h0().n5() == 1) {
               n5(var0, var4, var2);
            } else if (var4.h0().n5() == 2) {
               l6(var0, var4, var2);
            }
         } else if (ChartTypeCharacterizer.isErrorBarsXAllowed(var0.getType()) && !ChartTypeCharacterizer.isErrorBarsYAllowed(var0.getType())) {
            n5(var0, var4, var2);
         } else if (!ChartTypeCharacterizer.isErrorBarsXAllowed(var0.getType()) && ChartTypeCharacterizer.isErrorBarsYAllowed(var0.getType())) {
            l6(var0, var4, var2);
         } else if (!ChartTypeCharacterizer.isErrorBarsXAllowed(var0.getType()) && !ChartTypeCharacterizer.isErrorBarsYAllowed(var0.getType())
            || ChartTypeCharacterizer.isErrorBarsXAllowed(var0.getType()) && ChartTypeCharacterizer.isErrorBarsYAllowed(var0.getType())) {
            throw new Exception("illegal situation");
         }
      }
   }

   private static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.y4g var1, t5w var2) {
      e5k.n5(((ChartSeries)var0).getErrorBarsXFormat(), var1, var2);
      if (((ChartSeries)var0).getErrorBarsXFormat().getValueType() == 0) {
         if (var1.n3() != null) {
            k3h var3 = n5(var0, var1.n3().n5());
            var3.n5(var0, var1.n3(), 5, var2, false);
         }

         if (var1.x8() != null) {
            k3h var4 = n5(var0, var1.x8().n5());
            var4.n5(var0, var1.x8(), 4, var2, false);
         }
      }
   }

   private static void l6(IChartSeries var0, com.aspose.slides.internal.k4y.y4g var1, t5w var2) {
      e5k.n5(((ChartSeries)var0).getErrorBarsYFormat(), var1, var2);
      if (((ChartSeries)var0).getErrorBarsYFormat().getValueType() == 0) {
         if (var1.n3() != null) {
            k3h var3 = n5(var0, var1.n3().n5());
            var3.n5(var0, var1.n3(), 7, var2, false);
         }

         if (var1.x8() != null) {
            k3h var4 = n5(var0, var1.x8().n5());
            var4.n5(var0, var1.x8(), 6, var2, false);
         }
      }
   }

   private static String n5(com.aspose.slides.internal.k4y.l6s var0) {
      return var0 != null ? n5(var0.u3()) : com.aspose.slides.ms.System.d1.n5;
   }

   private static String n5(com.aspose.slides.internal.k4y.l0u var0) {
      return var0 != null ? n5(var0.u3()) : com.aspose.slides.ms.System.d1.n5;
   }

   static String n5(String var0) {
      if (var0 != null) {
         if ("Standard".equals(var0)) {
            var0 = "General";
         }

         return var0;
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   static boolean n5(com.aspose.slides.internal.k4y.k7 var0, c1x var1) {
      List var2 = f4.n5(var1);
      int var3 = 0;

      for (com.aspose.slides.internal.k4y.y4x var7 : var0.aD_()) {
         if (var2.containsItem(var7.n5())) {
            var3++;
         }
      }

      boolean var8 = false;
      if (var3 != 0) {
         if (var3 > var0.aD_().length) {
            throw new Exception();
         }

         var8 = true;
      }

      return var8;
   }

   public static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.m3 var1, com.aspose.slides.internal.k4y.k7 var2, j8m var3) {
      c9t var4 = ((ChartSeries)var0).n5();
      g6c var5 = var3.n5().n5();
      var1.n5().n5(var4.n5());
      var1.l6().n5(var0.getOrder() & 4294967295L);
      k3h var6 = null;
      var6 = n5(var0, var0.getName().getDataSourceType());
      var6.n5(var0, var1);
      k5r.n5(var0.getFormat(), new p2i$2(var1), var5, null, false);
      v9t.n5(var0.getMarker(), new p2i$3(var1), var5);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.s0.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.s0.class).n5(var4.l6());
      }

      if (((ChartSeries)var0).getErrorBarsXFormat() != null && ((ChartSeries)var0).getErrorBarsXFormat().isVisible()) {
         com.aspose.slides.internal.k4y.y4g var7 = var1.r4();
         var7.n5().n5(1);
         e5k.n5(((ChartSeries)var0).getErrorBarsXFormat(), var7, var5);
         if (((ChartSeries)var0).getErrorBarsXFormat().getValueType() == 0) {
            var6 = n5(var0, ((ChartDataPointCollection)var0.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXMinusValues());
            var6.n5(var0, var7.u3(), 5);
            var6 = n5(var0, ((ChartDataPointCollection)var0.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXPlusValues());
            var6.n5(var0, var7.k5(), 4);
         }
      }

      if (((ChartSeries)var0).getErrorBarsYFormat() != null && ((ChartSeries)var0).getErrorBarsYFormat().isVisible()) {
         com.aspose.slides.internal.k4y.y4g var26 = var1.r4();
         var26.n5().n5(2);
         e5k.n5(((ChartSeries)var0).getErrorBarsYFormat(), var26, var5);
         if (((ChartSeries)var0).getErrorBarsYFormat().getValueType() == 0) {
            var6 = n5(var0, ((ChartDataPointCollection)var0.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYMinusValues());
            var6.n5(var0, var26.u3(), 7);
            var6 = n5(var0, ((ChartDataPointCollection)var0.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYPlusValues());
            var6.n5(var0, var26.k5(), 6);
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.p3.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.p3.class).e2().n5(var0.getInvertIfNegative());
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.y0.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.y0.class).y4().n5(var0.getSmooth());
      }

      if (var0.getTrendLines() != null) {
         IGenericEnumerator var27 = var0.getTrendLines().iterator();

         try {
            while (var27.hasNext()) {
               ITrendline var8 = (ITrendline)var27.next();
               f2e.n5(var8, var1.m3(), var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.i5k.class)) {
         com.aspose.slides.internal.k4y.i5k var28 = (com.aspose.slides.internal.k4y.i5k)var1;
         if (var0.getBar3DShape() != -1) {
            var28.d2().n5(var0.getBar3DShape());
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.t6w.class)) {
         com.aspose.slides.internal.k4y.t6w var29 = (com.aspose.slides.internal.k4y.t6w)var1;
         if (var0.getExplosion() != 0) {
            var29.y1().n5(var0.getExplosion() & 4294967295L);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.g4d.class)) {
         com.aspose.slides.internal.k4y.g4d var30 = (com.aspose.slides.internal.k4y.g4d)var1;
         var30.s3().n5(var0.getType() == 69);
      }

      k6r.n5(var0.getLabels(), new p2i$4(var1), var5);
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.z6.class)) {
         com.aspose.slides.internal.k4y.z6 var31 = (com.aspose.slides.internal.k4y.z6)var1;
         if (var0.getPlotOnSecondAxis() && var0.getChart().getChartData().getUseSecondaryCategories()) {
            m6n.n5(var0.getChart().getChartData().getSecondaryCategories(), new p2i$5(var31), (ChartData)var0.getChart().getChartData());
         } else if (var0.getOrder() > 0 || ((ChartCategoryCollection)var0.getChart().getChartData().getCategories()).h0()) {
            m6n.n5(var0.getChart().getChartData().getCategories(), new p2i$6(var31), (ChartData)var0.getChart().getChartData());
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.o5.class)) {
         var6 = n5(var0, var0.getDataPoints().getDataSourceTypeForXValues());
         if (var6.n5(var0, 0)) {
            var6.n5(var0, com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.o5.class).t2(), 0);
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.j8.class)) {
         var6 = n5(var0, var0.getDataPoints().getDataSourceTypeForYValues());
         if (var6.n5(var0, 1)) {
            var6.n5(var0, com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.j8.class).s7(), 1);
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.g4d.class)) {
         var6 = n5(var0, var0.getDataPoints().getDataSourceTypeForBubbleSizes());
         if (var6.n5(var0, 2)) {
            var6.n5(var0, com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.g4d.class).p8(), 2);
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.z6.class)) {
         var6 = n5(var0, var0.getDataPoints().getDataSourceTypeForValues());
         if (var6.n5(var0, 3)) {
            var6.n5(var0, com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.z6.class).x8(), 3);
         }
      }

      IGenericEnumerator var32 = var0.getDataPoints().iterator();

      try {
         while (var32.hasNext()) {
            IChartDataPoint var33 = (IChartDataPoint)var32.next();
            t5g.n5(var33, new p2i$7(var1), var33.getIndex(), var0.getDataPoints().size() & 4294967295L, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
            var32.dispose();
         }
      }

      var1.n5(var4.k5());
      if (var0.getFormat().getFill().getFillType() == 1 && var0.getInvertedSolidFillColor().getColorType() != -1) {
         String var34 = com.aspose.slides.ms.System.a3.n5(((ColorFormat)var0.getInvertedSolidFillColor()).u3().h0() & 16777215, "X6");
         if (var1.a6() == null) {
            var1.u9();
         }

         com.aspose.slides.internal.k4y.i4w.n5(var1.a6(), var34);
      }

      ChartData var35 = (ChartData)var0.getChart().getChartData();
      List var9 = new List();
      if (var0.getLabels().getDefaultDataLabelFormat().getShowLabelValueFromCell()) {
         if (var1.a6() == null) {
            var1.u9();
         }

         for (int var10 = 0; var10 < var0.getLabels().getCount(); var10++) {
            if (var35.l6().k5() == 2) {
               if (var0.getLabels().get_Item(var10).getValueFromCell() != null && var0.getLabels().get_Item(var10).getValueFromCell().getValue() != null) {
                  var9.addItem(var0.getLabels().get_Item(var10).getValueFromCell().getValue().toString());
               } else {
                  var9.addItem(null);
               }
            } else {
               var9.addItem(com.aspose.slides.internal.v6g.k5.n5(var0.getLabels().get_Item(var10), DataLabel.class).n5());
            }
         }
      }

      String var36 = var35.l6().k5() == 2 ? ((DataLabelCollection)var0.getLabels()).k5() : ((DataLabelCollection)var0.getLabels()).n5();
      com.aspose.slides.internal.k4y.f2.n5(var1.a6(), var0.getLabels(), var36, var9);
   }

   static boolean n5(t5w var0) {
      boolean var1 = false;
      String var2 = ((DocumentProperties)var0.t9().getDocumentProperties()).getAppVersion();
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         String[] var3 = com.aspose.slides.ms.System.d1.n5(var2, '.');
         if (var3.length > 0) {
            try {
               int var4 = com.aspose.slides.ms.System.a3.n5(var3[0]);
               if (var4 <= 12) {
                  var1 = true;
               }
            } catch (FormatException var5) {
            }
         }
      }

      return var1;
   }

   static k3h n5(IChartSeries var0, int var1) {
      switch (var1) {
         case 0:
            if (((ChartData)var0.getChart().getChartData()).l6().k5() == 2) {
               return new h5f();
            }

            return new j2p();
         case 1:
            return new d5m();
         case 2:
            return new d9v();
         default:
            throw new InvalidOperationException("Unknown data source type");
      }
   }
}
