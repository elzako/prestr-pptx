package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class x4a {
   public static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1, com.aspose.slides.internal.k4y.w2p var2, c1x var3) {
      c9t var4 = ((ChartSeries)var0).n5();
      t5w var5 = var3.n5().n5();
      k5r.n5(var0.getFormat(), var1.s7(), var5);
      n5(var0, var1);
      var4.n5(var1.z1());
      List var6 = n5(var1, var2.l6());
      d0p.n5(var0, var6, 0);
      d0p.n5(var0, var6, 1);
      d0p.n5(var0, var6, 8);
      d0p.n5(var0, var6, 3);
      d0p.n5(var0, var6, 9);
      if (ChartTypeCharacterizer.e2(var0.getType())) {
         ((ChartSeries)var0).t2();
      }

      if (var1.n3() != null) {
         for (com.aspose.slides.internal.k4y.l4s var10 : var1.n3()) {
            n5((ChartSeries)var0, var10, var5);
         }
      }

      if (var1.t9() != null) {
         b4 var11 = n5(var0.getType());
         if (var11 == null) {
            throw new NullReferenceException("LayoutParser cannot be null.");
         }

         var11.n5((ChartSeries)var0, var1.t9());
      }

      var4.n5(var1.u9());
      if (var1.x8() != null) {
         var4.n5(var1.x8());
      }

      var4.l6(var1.c8());
      var4.k5(var1.h0());
      h0y.n5(var0.getLabels(), var1.y4(), var5);
   }

   private static void n5(ChartSeries var0, com.aspose.slides.internal.k4y.l4s var1, t5w var2) {
      long var3 = var1.l6();
      if (var0.getType() == 74 || var0.getType() == 75) {
         IChartDataPointLevel var6 = ((ChartDataPointCollection)var0.getDataPoints()).n5((int)var3);
         if (var6 != null) {
            k5r.n5(var6.getFormat(), var1.k5(), var2);
         }
      } else if (var0.getType() == 76) {
         a0 var5 = null;
         if (var0.s7().n5() - 1 >= (var3 & 4294967295L)) {
            var5 = var0.s7().n5((int)var3);
         }

         if (var5 != null) {
            k5r.n5(var5.c8(), var1.k5(), var2);
         }
      } else {
         r5w.n5(var0.getDataPoints().getOrCreateDataPointByIdx(var3), var1, var2);
      }
   }

   private static b4 n5(int var0) {
      switch (var0) {
         case 74:
            return new o1n();
         case 75:
            return new j5e();
         case 76:
            return new x6g();
         case 77:
            return new w3g();
         case 78:
            return new s5();
         case 79:
            return new h5c();
         case 80:
            return new o8l();
         case 81:
            return new e8m();
         default:
            return null;
      }
   }

   static List<com.aspose.slides.internal.k4y.g7> n5(com.aspose.slides.internal.k4y.x1i var0, com.aspose.slides.internal.k4y.v3y var1) {
      if (var0.e2() == null) {
         return null;
      }

      long var2 = var0.e2().n5();

      for (com.aspose.slides.internal.k4y.g1i var7 : var1.k5()) {
         if (var7.n5() == var2) {
            return var7.l6();
         }
      }

      throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Can't find chartData.Data element with id = ", com.aspose.slides.ms.System.l4.l6(var2)}));
   }

   static com.aspose.slides.internal.k4y.o8n n5(IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var0, int var1) {
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            com.aspose.slides.internal.k4y.o8n var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.o8n.class);
            if (var4 != null && var4.k5() == var1) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   private static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1) {
      com.aspose.slides.internal.k4y.e8j var2 = var1.t2();
      if (var2 != null) {
         String var3 = "";
         com.aspose.slides.internal.k4y.q8h var4 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.q8h.class);
         if (var4 != null) {
            if (var4.n5() != null) {
               var3 = var4.n5().n5();
            } else if (var4.l6() == null) {
               return;
            }

            var0.getName().setDataSourceType(0);
            com.aspose.slides.internal.v6g.k5.n5(var0, ChartSeries.class).k5(var3);
            ((ChartSeries)var0).n5.addItem(var4.l6());
         } else {
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var2.n5().n5(), "\""}));
         }
      }
   }

   public static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1, com.aspose.slides.internal.k4y.w2p var2, j8m var3) {
      if (ChartTypeCharacterizer.e2(var0.getType())) {
         ((ChartSeries)var0).t2();
      }

      c9t var4 = ((ChartSeries)var0).n5();
      k5r.n5(var0.getFormat(), new x4a$1(var1), var3.n5().n5(), null, false);
      var1.n5(var4.u3());
      l6(var0, var1);
      var1.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"{", com.aspose.slides.ms.System.o0.l6(), "}"}));
      var1.n5(l6(var0));
      if ((var4.c8() & 4294967295L) != 4294967295L) {
         var1.k5(var4.c8());
      }

      if (var0.getType() == 77) {
         var1.l6(var4.t2());
         var1.n5(2L);
      } else {
         com.aspose.slides.internal.k4y.g1i var5 = var2.l6().n5();
         var5.n5((var2.l6().k5().length & 4294967295L) - 1L & 4294967295L);
         com.aspose.slides.internal.k4y.b3r var6 = new com.aspose.slides.internal.k4y.b3r();
         var6.n5(var5.n5());
         var1.n5(var6);
         ChartData var7 = (ChartData)var0.getChart().getChartData();
         if (var0.getChart().getChartData().getCategories().size() > 0) {
            if (var7.l6().k5() == 2) {
               w1n.n5((ChartCategoryCollection)var0.getChart().getChartData().getCategories(), var5);
            } else {
               d0p.n5((ChartCategoryCollection)var0.getChart().getChartData().getCategories(), var5);
            }
         }

         if (var7.l6().k5() == 2) {
            n5(var0, 8, var5, var0.getChart().getChartData().getChartDataWorkbook());
            n5(var0, 3, var5, var0.getChart().getChartData().getChartDataWorkbook());
            n5(var0, 0, var5, var0.getChart().getChartData().getChartDataWorkbook());
            n5(var0, 1, var5, var0.getChart().getChartData().getChartDataWorkbook());
            n5(var0, 9, var5, var0.getChart().getChartData().getChartDataWorkbook());
         } else {
            d0p.n5((ChartSeries)var0, 8, var5);
            d0p.n5((ChartSeries)var0, 3, var5);
            d0p.n5((ChartSeries)var0, 0, var5);
            d0p.n5((ChartSeries)var0, 1, var5);
            d0p.n5((ChartSeries)var0, 9, var5);
         }

         n5(var0, var1, var3.n5().n5());
         b4 var8 = n5(var0.getType());
         if (var8 == null) {
            throw new NullReferenceException("LayoutParser cannot be null.");
         }

         var8.n5((ChartSeries)var0, var1);
         var1.n5(var4.h0());
         var1.n5(var4.u9());
         h0y.n5(var0.getLabels(), new x4a$2(var1), var3.n5().n5());
      }
   }

   private static int l6(IChartSeries var0) {
      switch (var0.getType()) {
         case 74:
            return 7;
         case 75:
            return 6;
         case 76:
            return 2;
         case 77:
            return 4;
         case 78:
            return 1;
         case 79:
            return 8;
         case 80:
            return 3;
         case 81:
            return 5;
         default:
            throw new Exception("Unknown series type");
      }
   }

   private static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1, g6c var2) {
      if (var0.getType() == 75 || var0.getType() == 74) {
         l6(var0, var1, var2);
      } else if (var0.getType() == 76) {
         ChartSeries var9 = (ChartSeries)var0;

         for (int var10 = 0; var10 < var9.s7().n5(); var10++) {
            a0 var5 = var9.s7().n5(var10);
            r5w.n5(var5, new x4a$3(var1), var10 & 4294967295L, var2);
         }
      } else {
         IGenericEnumerator var3 = var0.getDataPoints().iterator();

         try {
            while (var3.hasNext()) {
               IChartDataPoint var4 = (IChartDataPoint)var3.next();
               r5w.n5(var4, new x4a$4(var1), var4.getIndex(), var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   static void n5(IChartSeries var0) {
      ChartCategoryCollection var1 = (ChartCategoryCollection)var0.getChart().getChartData().getCategories();
      int var2 = -1;
      String[] var3 = new String[var1.getGroupingLevelCount()];

      for (int var4 = 0; var4 < var1.size(); var4++) {
         for (int var5 = var1.getGroupingLevelCount() - 1; var5 >= 0 && var4 <= var0.getDataPoints().size() - 1; var5--) {
            ChartDataPointLevel var6 = com.aspose.slides.internal.v6g.k5.n5(
               var0.getDataPoints().get_Item(var4).getDataPointLevels().get_Item(var5), ChartDataPointLevel.class
            );
            if (var1.getGroupingLevelCount() == 1) {
               var6.n5(++var2);
            } else {
               Object var7 = ((ChartCategory)var1.get_Item(var4)).n5(var5);
               if (var7 == null) {
                  var6.n5(-1);
               } else {
                  String var8 = var7.toString();
                  if (var4 == 0) {
                     var3[var5] = var8;
                     var6.n5(++var2);
                  } else if (!com.aspose.slides.ms.System.d1.a6(var8, var3[var5]) && !com.aspose.slides.ms.System.d1.n5(var8)) {
                     var3[var5] = var8;
                     var6.n5(++var2);
                  } else {
                     var6.n5(-1);
                  }
               }
            }
         }
      }
   }

   private static void l6(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1, g6c var2) {
      n5(var0);
      ChartCategoryCollection var3 = (ChartCategoryCollection)var0.getChart().getChartData().getCategories();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         for (int var5 = var3.getGroupingLevelCount() - 1; var5 >= 0; var5--) {
            ChartDataPointLevel var6 = com.aspose.slides.internal.v6g.k5.n5(
               var0.getDataPoints().get_Item(var4).getDataPointLevels().get_Item(var5), ChartDataPointLevel.class
            );
            if (var6.c8() != -1) {
               r5w.n5(var6, new x4a$5(var1), var2);
            }
         }
      }
   }

   private static void n5(IChartSeries var0, int var1, com.aspose.slides.internal.k4y.g1i var2, IChartDataWorkbook var3) {
      if (n5(var0.getType(), var1)) {
         IChartCellCollection var4 = var3.getCellCollection("", true);
         IGenericEnumerator var5 = var0.getDataPoints().iterator();

         try {
            while (var5.hasNext()) {
               IChartDataPoint var6 = (IChartDataPoint)var5.next();
               ISingleCellChartValue var7 = k3h.n5(var6, var1);
               if (var7.getAsCell() != null) {
                  var4.add(var7.getAsCell());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         n5(var4, var2, var1);
      }
   }

   private static void n5(IChartCellCollection var0, com.aspose.slides.internal.k4y.g1i var1, int var2) {
      com.aspose.slides.internal.k4y.o8n var3 = (com.aspose.slides.internal.k4y.o8n)var1.n5("numDim").l6();
      com.aspose.slides.internal.k4y.f2z var4 = new com.aspose.slides.internal.k4y.f2z();
      var4.n5(var0.getCellsAddress());
      var3.n5(var4);
      switch (var2) {
         case 0:
            var3.n5(2);
            break;
         case 1:
            var3.n5(3);
         case 2:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 3:
            var3.n5(1);
            break;
         case 8:
            var3.n5(4);
            break;
         case 9:
            var3.n5(6);
      }

      com.aspose.slides.internal.k4y.w0r var5 = var3.l6();
      long var6 = var0.getCount() & 4294967295L;

      for (int var8 = 0; var8 < var0.getCount(); var8++) {
         ChartDataCell var9 = (ChartDataCell)var0.get_Item(var8);
         if (var9.getValue() != null) {
            com.aspose.slides.internal.k4y.t7d var10 = var5.n5();
            var10.n5(var8 & 4294967295L);
            if (((var10.n5() & 4294967295L) + 1L & 4294967295L) > (var6 & 4294967295L)) {
               var6 = (var10.n5() & 4294967295L) + 1L & 4294967295L;
            }

            double var11 = 0.0;
            String var13 = com.aspose.slides.ms.System.z3.t9(var9.t2().z1().n5, com.aspose.slides.internal.x7n.l6.k5());
            double[] var14 = new double[]{0.0};
            boolean var15 = k3h.n5(var13, var14);
            var11 = var14[0];
            if (var15) {
               var10.n5(var13);
            } else {
               var10.n5("0");
            }
         }
      }

      var5.n5(var6);
      if (var0.getCount() > 0 && !"".equals(com.aspose.slides.ms.System.d1.l6(var0.get_Item(0).getCustomNumberFormat()))) {
         var5.n5(n5(var0.get_Item(0).getCustomNumberFormat()));
      }
   }

   private static String n5(String var0) {
      String var1 = com.aspose.slides.internal.r5t.t2.n5().u9().e2().q0();
      String var2 = com.aspose.slides.internal.r5t.t2.n5().u9().e2().z3();
      var0 = com.aspose.slides.ms.System.d1.n5(var0, ",", var2);
      var0 = com.aspose.slides.ms.System.d1.n5(var0, ".", var2);
      int var3 = com.aspose.slides.ms.System.d1.u3(var0, var2);
      return var3 == -1 ? var0 : com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var0, var3, var2.length()), var3, var1);
   }

   static boolean n5(int var0, int var1) {
      switch (var1) {
         case 3:
            if (ChartTypeCharacterizer.n5(var0) == 7 || ChartTypeCharacterizer.n5(var0) == 1) {
               return true;
            }
            break;
         case 8:
            if (ChartTypeCharacterizer.n5(var0) == 0 && var0 != 81) {
               return true;
            }
            break;
         case 9:
            return var0 == 81;
      }

      return false;
   }

   private static void l6(IChartSeries var0, com.aspose.slides.internal.k4y.x1i var1) {
      ChartData var2 = (ChartData)var0.getChart().getChartData();
      boolean var3 = var2.l6().k5() != 2;
      if (var3) {
         if (com.aspose.slides.ms.System.d1.n5(((ChartSeries)var0).x8())) {
            return;
         }
      } else if (var0.getName().getAsCells().getCount() == 0) {
         return;
      }

      com.aspose.slides.internal.k4y.e8j var4 = var1.n5();
      com.aspose.slides.internal.k4y.q8h var5 = (com.aspose.slides.internal.k4y.q8h)var4.n5("txData").l6();
      com.aspose.slides.internal.k4y.f2z var6 = new com.aspose.slides.internal.k4y.f2z();
      if (var3) {
         var6.n5(((ChartSeries)var0).n3());
         var5.n5(var6);
         var5.n5(((ChartSeries)var0).x8());
      } else {
         IChartCellCollection var7 = var0.getName().getAsCells();
         var6.n5(var0.getName().getCellsAddressInWorkbook());
         var5.n5(var6);
         var5.n5(com.aspose.slides.ms.System.z3.t9(var7.get_Item(0).getValue(), com.aspose.slides.internal.x7n.l6.k5()));
      }
   }
}
