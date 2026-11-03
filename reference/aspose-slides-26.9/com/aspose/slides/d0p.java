package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

class d0p {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("strRef", "v", "numRef", "strLit");

   static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.m3 var1) {
      com.aspose.slides.internal.k4y.w1c var2 = var1.h0();
      if (var2 != null) {
         switch (n5.n5(var2.n5().n5())) {
            case 0:
               var0.getName().setDataSourceType(0);
               com.aspose.slides.internal.k4y.c9q var3 = (com.aspose.slides.internal.k4y.c9q)var2.n5().l6();
               com.aspose.slides.internal.v6g.k5.n5(var0, ChartSeries.class).k5(var3.l6());
               if (var3.k5() != null) {
                  com.aspose.slides.internal.k4y.l6j[] var4 = var3.k5().u3();
                  if (var4 != null) {
                     for (com.aspose.slides.internal.k4y.l6j var8 : var4) {
                        ((ChartSeries)var0).n5.addItem(var8.l6());
                     }
                  }
               }
               break;
            case 1:
               var0.getName().setDataSourceType(1);
               var0.getName().setAsLiteralString((String)var2.n5().k5());
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var2.n5().n5(), "\""}));
         }
      }
   }

   static void n5(IChartSeries var0, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var1, int var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.o8n var3 = null;
         ChartDataPointCollection var4 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class);
         switch (var2) {
            case 0:
               var3 = x4a.n5(var1, 2);
               if (var3 != null && var3.u3() != null) {
                  var4.n5(var3.u3().n5());
               }
               break;
            case 1:
               var3 = x4a.n5(var1, 3);
               if (var3 != null && var3.u3() != null) {
                  var4.l6(var3.u3().n5());
               }
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
               break;
            case 3:
               var3 = x4a.n5(var1, 1);
               if (var3 != null && var3.u3() != null) {
                  var4.k5(var3.u3().n5());
               }
               break;
            case 8:
               var3 = x4a.n5(var1, 4);
               if (var3 != null && var3.u3() != null) {
                  var4.t2(var3.u3().n5());
               }
               break;
            case 9:
               var3 = x4a.n5(var1, 6);
               if (var3 != null && var3.u3() != null) {
                  var4.s7(var3.u3().n5());
               }
         }

         if (var3 != null) {
            if (var3.a6().length != 0) {
               if (var3.a6()[0].k5() != null) {
                  switch (var2) {
                     case 0:
                        var0.setNumberFormatOfXValues(var3.a6()[0].k5());
                        break;
                     case 1:
                        var0.setNumberFormatOfYValues(var3.a6()[0].k5());
                     case 2:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     default:
                        break;
                     case 3:
                        var0.setNumberFormatOfValues(var3.a6()[0].k5());
                        break;
                     case 8:
                        com.aspose.slides.internal.v6g.k5.n5(var0, ChartSeries.class).n5(var3.a6()[0].k5());
                        break;
                     case 9:
                        com.aspose.slides.internal.v6g.k5.n5(var0, ChartSeries.class).l6(var3.a6()[0].k5());
                  }
               }

               for (int var5 = var0.getDataPoints().size(); var5 < (var3.a6()[0].l6() & 4294967295L); var5++) {
                  ((ChartDataPointCollection)var0.getDataPoints()).n5();
               }

               for (com.aspose.slides.internal.k4y.t7d var8 : var3.a6()[0].u3()) {
                  int var9 = (int)var8.n5();
                  ChartDataPoint var10 = (ChartDataPoint)var0.getDataPoints().get_Item(var9);
                  double var11 = 0.0;
                  double[] var13 = new double[]{0.0};
                  boolean var14 = k3h.n5(var8.l6(), var13);
                  var11 = var13[0];
                  if (var14) {
                     n5(var2, var10, var11, com.aspose.slides.ms.System.d1.n5);
                  } else {
                     n5(var2, var10, var8.l6(), com.aspose.slides.ms.System.d1.n5);
                  }
               }
            }
         }
      }
   }

   static void n5(int var0, ChartDataPoint var1, Object var2, String var3) {
      u0a var4 = j2p.n5(var1, var0);
      var4.n5(var2);
      var4.n5(var3);
   }

   static void l6(IChartSeries var0, com.aspose.slides.internal.k4y.m3 var1) {
      com.aspose.slides.internal.k4y.j6e var2 = com.aspose.slides.internal.k4y.f2.n5(var1.a6());
      if (var2 != null) {
         if (var2.n5() != null) {
            com.aspose.slides.internal.v6g.k5.n5(var0.getLabels(), DataLabelCollection.class).n5(var2.n5());
            if (var2.l6() != null) {
               for (com.aspose.slides.internal.k4y.l6j var6 : var2.l6().n5()) {
                  if (((var6.n5() & 4294967295L) + 1L & 4294967295L) <= var0.getLabels().getCount()) {
                     com.aspose.slides.internal.v6g.k5.n5(var0.getLabels().get_Item((int)var6.n5()), DataLabel.class).n5(var6.l6());
                  }
               }
            }
         }
      }
   }

   static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.g7 var1, boolean var2) {
      int var3 = var0.size();
      switch (n5.n5(var1.n5())) {
         case 0:
            com.aspose.slides.internal.k4y.c9q var16 = (com.aspose.slides.internal.k4y.c9q)var1.l6();
            if (var16 == null) {
               return;
            }

            com.aspose.slides.internal.v6g.k5.n5(var0, ChartCategoryCollection.class).n5(var16.l6());
            if (var16.k5() == null || var16.k5().u3() == null) {
               return;
            }

            int var14 = (int)var16.k5().k5().n5();
            com.aspose.slides.internal.k4y.l6j[] var17 = var16.k5().u3();
            if (var2 && var17.length > 0) {
               var14 = (int)var17[var17.length - 1].n5() + 1;
            }

            for (int var18 = var3; var18 < var14; var18++) {
               com.aspose.slides.internal.v6g.k5.n5(var0, ChartCategoryCollection.class).n5((Object)null);
            }

            for (com.aspose.slides.internal.k4y.l6j var12 : var17) {
               int var13 = (int)var12.n5();
               if (var13 >= var3 && var12.l6() != null) {
                  ((ChartCategory)var0.get_Item(var13)).n5((Object)com.aspose.slides.ms.System.d1.n5(var12.l6(), "_x000d_", ""));
               }
            }
         case 1:
         default:
            break;
         case 2:
            com.aspose.slides.internal.k4y.z3o var4 = (com.aspose.slides.internal.k4y.z3o)var1.l6();
            if (var4 == null) {
               return;
            }

            com.aspose.slides.internal.v6g.k5.n5(var0, ChartCategoryCollection.class).n5(var4.l6());
            if (var4.k5() == null || var4.k5().a6() == null) {
               return;
            }

            int var5 = (int)var4.k5().u3().n5();
            com.aspose.slides.internal.k4y.o8r[] var6 = var4.k5().a6();
            if (var2 && var6.length > 0) {
               var5 = (int)var6[var6.length - 1].n5() + 1;
            }

            for (int var7 = var3; var7 < var5; var7++) {
               com.aspose.slides.internal.v6g.k5.n5(var0, ChartCategoryCollection.class).n5((Object)null);
            }

            for (com.aspose.slides.internal.k4y.o8r var10 : var6) {
               int var11 = (int)var10.n5();
               if (var11 >= var3 && com.aspose.slides.ms.System.u3.n5(t4d.n5, var10.k5()) < 0) {
                  ((ChartCategory)var0.get_Item(var11)).n5(com.aspose.slides.ms.System.z3.n3(var10.k5(), com.aspose.slides.internal.x7n.l6.k5()));
                  ((ChartCategory)var0.get_Item(var11)).n5(var10.l6());
               }
            }
            break;
         case 3:
            throw new InvalidOperationException("strLit values can't be loaded into categories cache");
      }
   }

   public static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.w9n var1) {
      if (var0.size() <= 0) {
         if (var1 != null) {
            if (var1.k5() != null || var1.l6() != null) {
               var0.clear();
               int var2 = 0;
               int var3 = 0;
               if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
                  var0.n5(var1.l6());
               }

               if (var1.k5() != null) {
                  if (var1.k5().k5() != null) {
                     var2 = (int)var1.k5().k5().n5();
                  }

                  if (var1.k5().u3() != null) {
                     var3 = var1.k5().u3().length;
                  }
               }

               if (var2 == 0 && !com.aspose.slides.ms.System.d1.n5(var0.k5())) {
                  ChartData var4 = com.aspose.slides.internal.v6g.k5.n5(
                     com.aspose.slides.internal.v6g.k5.n5(var0, r0g.class).getParent_Immediate().getParent_Immediate(), ChartData.class
                  );
                  ChartDataWorkbook var5 = new ChartDataWorkbook(var4);
                  List var6 = var5.u3(var0.k5());
                  if (var6.size() == 0) {
                     return;
                  }

                  int var7 = ((g1p)var6.get_Item(0)).a6();
                  int var8 = ((g1p)var6.get_Item(0)).u9();

                  for (int var9 = 1; var9 < var6.size(); var9++) {
                     if (((g1p)var6.get_Item(var9)).a6() < var7) {
                        var7 = ((g1p)var6.get_Item(var9)).a6();
                     }

                     if (((g1p)var6.get_Item(var9)).u9() < var8) {
                        var8 = ((g1p)var6.get_Item(var9)).u9();
                     }
                  }

                  var2 = var8 - var7 + 1;
               }

               for (int var10 = 0; var10 < var2; var10++) {
                  ChartCategory var12 = var0.n5((Object)null);

                  for (int var14 = 1; var14 < var3; var14++) {
                     var12.k5().n5(var14, null);
                  }
               }

               for (int var11 = 0; var11 < var3; var11++) {
                  for (com.aspose.slides.internal.k4y.l6j var17 : var1.k5().u3()[var11].l6()) {
                     ((ChartCategory)var0.get_Item((int)var17.n5())).k5().n5(var11, var17.l6());
                  }
               }
            }
         }
      }
   }

   static void n5(ChartSeries var0, int var1, com.aspose.slides.internal.k4y.g1i var2) {
      if (x4a.n5(var0.getType(), var1)) {
         com.aspose.slides.internal.k4y.o8n var3 = (com.aspose.slides.internal.k4y.o8n)var2.n5("numDim").l6();
         com.aspose.slides.internal.k4y.f2z var4 = new com.aspose.slides.internal.k4y.f2z();
         com.aspose.slides.internal.k4y.w0r var5 = var3.l6();
         switch (var1) {
            case 0:
               var3.n5(2);
               var4.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class).s7());
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getNumberFormatOfXValues()))) {
                  var5.n5(var0.getNumberFormatOfXValues());
               }
               break;
            case 1:
               var3.n5(3);
               var4.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class).x8());
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getNumberFormatOfYValues()))) {
                  var5.n5(var0.getNumberFormatOfYValues());
               }
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
               break;
            case 3:
               var3.n5(1);
               var4.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class).n3());
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getNumberFormatOfValues()))) {
                  var5.n5(var0.getNumberFormatOfValues());
               }
               break;
            case 8:
               var3.n5(4);
               var4.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class).q0());
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.u9()))) {
                  var5.n5(var0.u9());
               }
               break;
            case 9:
               var3.n5(6);
               var4.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints(), ChartDataPointCollection.class).z3());
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.u9()))) {
                  var5.n5(var0.h0());
               }
         }

         var3.n5(var4);
         long var6 = var0.getDataPoints().size() & 4294967295L;
         Object var8 = null;

         for (int var9 = 0; var9 < (var6 & 4294967295L); var9++) {
            switch (var1) {
               case 0:
                  var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints().get_Item(var9), ChartDataPoint.class).s7().n5();
                  break;
               case 1:
                  var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints().get_Item(var9), ChartDataPoint.class).x8().n5();
               case 2:
               case 4:
               case 5:
               case 6:
               case 7:
               default:
                  break;
               case 3:
                  var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints().get_Item(var9), ChartDataPoint.class).t2().n5();
                  break;
               case 8:
                  var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints().get_Item(var9), ChartDataPoint.class).t4().n5();
                  break;
               case 9:
                  var8 = com.aspose.slides.internal.v6g.k5.n5(var0.getDataPoints().get_Item(var9), ChartDataPoint.class).q0().n5();
            }

            if (var8 != null) {
               com.aspose.slides.internal.k4y.t7d var10 = var5.n5();
               var10.n5(var9 & 4294967295L);
               if (((var10.n5() & 4294967295L) + 1L & 4294967295L) > (var6 & 4294967295L)) {
                  var6 = (var10.n5() & 4294967295L) + 1L & 4294967295L;
               }

               var10.n5(com.aspose.slides.ms.System.z3.t9(var8, com.aspose.slides.internal.x7n.l6.k5()));
            }
         }

         var5.n5(var6);
      }
   }

   static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1) {
      String var2 = var0.k5();
      int var3 = ((ChartCategory)var0.get_Item(0)).k5().n5();
      if (var3 == 0) {
         boolean var4 = true;
         String[] var5 = new String[var0.size()];

         for (int var6 = 0; var6 < var0.size(); var6++) {
            Object var7 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var6), ChartCategory.class).n5();
            var5[var6] = var7 != null ? com.aspose.slides.ms.System.z3.t9(var7, com.aspose.slides.internal.x7n.l6.k5()) : null;
            var4 &= var7 == null || com.aspose.slides.internal.v6g.k5.l6(var7, Double.class);
         }

         long var8 = var0.size() & 4294967295L;
         if (var4) {
            com.aspose.slides.internal.k4y.z3o var10 = (com.aspose.slides.internal.k4y.z3o)var1.n5("numRef").l6();
            var10.n5(var2);
            com.aspose.slides.internal.k4y.a8e var11 = var10.n5();
            var11.n5(var0.u3().n5());

            for (int var12 = 0; var12 < var0.size(); var12++) {
               if (var5[var12] != null) {
                  com.aspose.slides.internal.k4y.o8r var13 = var11.l6();
                  var13.n5(var12 & 4294967295L);
                  var13.l6(var5[var12]);
                  if (((var13.n5() & 4294967295L) + 1L & 4294967295L) > (var8 & 4294967295L)) {
                     var8 = (var13.n5() & 4294967295L) + 1L & 4294967295L;
                  }
               }
            }

            var11.n5().n5(var8);
         } else {
            com.aspose.slides.internal.k4y.c9q var18 = (com.aspose.slides.internal.k4y.c9q)var1.n5("strRef").l6();
            var18.n5(var2);
            com.aspose.slides.internal.k4y.p4t var20 = var18.n5();

            for (int var22 = 0; var22 < var0.size(); var22++) {
               if (var5[var22] != null && !com.aspose.slides.ms.System.d1.n5(var5[var22])) {
                  com.aspose.slides.internal.k4y.l6j var24 = var20.l6();
                  var24.n5(var22 & 4294967295L);
                  var24.n5(var5[var22]);
                  if (((var24.n5() & 4294967295L) + 1L & 4294967295L) > (var8 & 4294967295L)) {
                     var8 = (var24.n5() & 4294967295L) + 1L & 4294967295L;
                  }
               }
            }

            var20.n5().n5(var8);
         }
      } else {
         com.aspose.slides.internal.k4y.w9n var14 = (com.aspose.slides.internal.k4y.w9n)var1.n5("multiLvlStrRef").l6();
         var14.n5(var2);
         com.aspose.slides.internal.k4y.x2o var15 = var14.n5();
         var15.n5().n5(var0.size() & 4294967295L);

         for (int var16 = 0; var16 < var3; var16++) {
            com.aspose.slides.internal.k4y.t9z var17 = var15.l6();

            for (int var19 = 0; var19 < var0.size(); var19++) {
               Object var21 = ((ChartCategory)var0.get_Item(var19)).k5().n5(var16);
               if (var21 != null) {
                  com.aspose.slides.internal.k4y.l6j var23 = var17.n5();
                  var23.n5(var19 & 4294967295L);
                  var23.n5(com.aspose.slides.ms.System.z3.t9(var21, com.aspose.slides.internal.x7n.l6.k5()));
               }
            }
         }
      }
   }

   static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.g1i var1) {
      n5(var0, (com.aspose.slides.internal.k4y.a9k)var1.n5("strDim").l6());
   }

   static void n5(ChartCategoryCollection var0, com.aspose.slides.internal.k4y.a9k var1) {
      var1.n5(1);
      com.aspose.slides.internal.k4y.f2z var2 = new com.aspose.slides.internal.k4y.f2z();
      var2.n5(var0.k5());
      var1.n5(var2);
      int var3 = ((ChartCategory)var0.get_Item(0)).k5().n5();
      if (var3 == 0) {
         com.aspose.slides.internal.k4y.p4u var4 = var1.l6();
         var4.n5(var0.size() & 4294967295L);

         for (int var5 = 0; var5 < var0.size(); var5++) {
            Object var6 = ((ChartCategory)var0.get_Item(var5)).n5();
            if (var6 != null) {
               com.aspose.slides.internal.k4y.i0c var7 = var4.n5();
               var7.n5(var5 & 4294967295L);
               var7.n5(com.aspose.slides.ms.System.z3.t9(var6, com.aspose.slides.internal.x7n.l6.k5()));
            }
         }
      } else {
         for (int var9 = 0; var9 < var3; var9++) {
            com.aspose.slides.internal.k4y.p4u var10 = var1.l6();
            var10.n5(var0.size() & 4294967295L);

            for (int var11 = 0; var11 < var0.size(); var11++) {
               Object var12 = ((ChartCategory)var0.get_Item(var11)).k5().n5(var9);
               if (var12 != null) {
                  com.aspose.slides.internal.k4y.i0c var8 = var10.n5();
                  var8.n5(var11 & 4294967295L);
                  var8.n5(com.aspose.slides.ms.System.z3.t9(var12, com.aspose.slides.internal.x7n.l6.k5()));
               }
            }
         }
      }
   }
}
