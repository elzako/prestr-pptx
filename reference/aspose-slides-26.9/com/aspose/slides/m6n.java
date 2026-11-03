package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class m6n {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("multiLvlStrRef", "numRef", "strRef", "numLit", "strLit");

   public static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1, boolean var2, int var3, boolean var4) {
      if (var1 == null) {
         ((ChartCategoryCollection)var0).n5(true);
      } else {
         ((ChartCategoryCollection)var0).l6(((ChartCategoryCollection)var0).h0() || var4);
         if (var1.n5() == 0) {
            n5(var0, var1, var2);
         } else {
            n5(var0, var1, var3);
         }
      }
   }

   private static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1, boolean var2) {
      com.aspose.slides.internal.k4y.g7 var3 = var1.a6();
      switch (n5.n5(var3.n5())) {
         case 0:
            com.aspose.slides.internal.k4y.w9n var4 = (com.aspose.slides.internal.k4y.w9n)var3.l6();
            d0p.n5((ChartCategoryCollection)var0, var4);
            break;
         case 1:
            com.aspose.slides.internal.k4y.z3o var5 = (com.aspose.slides.internal.k4y.z3o)var3.l6();
            ((ChartCategoryCollection)var0).u3().n5(var5.k5().k5());
            d0p.n5(var0, var3, var2);
            break;
         case 2:
            d0p.n5(var0, var3, var2);
            break;
         case 3:
         case 4:
            throw new Exception();
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var3.n5(), "\""}));
      }
   }

   public static void n5(IChartCategoryCollection var0, String var1, ChartDataWorkbook var2, int var3) {
      List var4 = var2.u3(var1);
      int var5 = 0;
      List$Enumerator var6 = var4.iterator();

      try {
         while (var6.hasNext()) {
            g1p var7 = (g1p)var6.next();
            if (var7.h0() == var3 || var7.u3() == var3) {
               ChartDataWorksheet var8 = ((ChartDataWorksheetCollection)var2.getWorksheets()).l6(var7.n5());
               if (var8 != null) {
                  boolean var9 = var7.u3() == var3;
                  int var10 = var9 ? var7.a6() : var7.l6();
                  int var11 = var9 ? var7.u9() : var7.k5();
                  int var12 = 0;

                  for (int var13 = var10; var13 <= var11; var13++) {
                     ChartDataCell var14 = var9 ? var8.l6().l6(var13, var7.k5()) : var8.l6().l6(var7.u9(), var13);
                     if (!var14.isHidden()) {
                        if (var0.size() >= var12 + 1) {
                           var0.get_Item(var12).setAsCell(var14);
                        } else {
                           var0.add(var14);
                        }
                     }

                     var12++;
                  }

                  for (int var20 = 1; var20 < var3; var20++) {
                     int var21 = var5;

                     for (int var15 = var10; var15 <= var11; var15++) {
                        ChartDataCell var16 = var9 ? var8.l6().l6(var15, var7.k5() - var20) : var8.l6().l6(var7.u9() - var20, var15);
                        if (!var16.isHidden()) {
                           var0.get_Item(var21).getGroupingLevels().setGroupingItem(var20, var16);
                           var21++;
                        }
                     }
                  }

                  var5 = var0.size();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   public static void n5(IChartCategoryCollection var0, String var1, IChartDataWorkbook var2, boolean var3) {
      IChartCellCollection var4 = var2.getCellCollection(var1, true);
      int var5 = var4.getCount();
      if (var3) {
         for (int var6 = var4.getCount() - 1; var6 >= 0; var6--) {
            if (var4.get_Item(var6).getValue() != null) {
               var5 = var6 + 1;
               break;
            }
         }
      }

      while (var0.size() > var4.getCount()) {
         var0.removeAt(var0.size() - 1);
      }

      for (int var7 = 0; var7 < var5; var7++) {
         if (var7 >= var0.size()) {
            var0.add(var4.get_Item(var7));
         } else {
            var0.get_Item(var7).setAsCell(var4.get_Item(var7));
         }
      }
   }

   private static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1, int var2) {
      com.aspose.slides.internal.k4y.g7 var3 = var1.a6();
      if (var0.size() <= 0 || !var0.getUseCells()) {
         var0.setUseCells(false);
         switch (n5.n5(var3.n5())) {
            case 0:
            case 1:
            case 2:
               throw new Exception();
            case 3:
               com.aspose.slides.internal.k4y.a8e var4 = (com.aspose.slides.internal.k4y.a8e)var3.l6();

               for (com.aspose.slides.internal.k4y.o8r var18 : var4.a6()) {
                  if ((int)var18.n5() >= var0.size()) {
                     var0.add(com.aspose.slides.ms.System.Xml.f4.k7(var18.k5()));
                  }
               }
               break;
            case 4:
               com.aspose.slides.internal.k4y.p4t var5 = (com.aspose.slides.internal.k4y.p4t)var3.l6();
               if (var5.k5() == null && var5.u3().length == 0) {
                  var0.add(0);
               } else {
                  com.aspose.slides.internal.k4y.l6j[] var6 = var5.u3();
                  int var7 = var2 > 0 ? var2 : (int)var5.k5().n5();
                  int var8 = var6.length;
                  int var9 = -1;

                  for (int var10 = 0; var10 < var7; var10++) {
                     String var11 = null;
                     var9++;
                     if (var10 < var8) {
                        com.aspose.slides.internal.k4y.l6j var12 = var6[var10];
                        int var13 = (int)var12.n5();
                        if (var13 < var0.size()) {
                           var9 = var13;
                           continue;
                        }

                        if (var13 != var9) {
                           for (int var14 = var10; var14 < var13; var14++) {
                              var0.add(var11);
                           }

                           var9 = var13;
                        }

                        var11 = var12.l6();
                     }

                     var0.add(var11);
                  }
               }
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var3.n5(), "\""}));
         }
      }
   }

   public static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l0u> var1, ChartData var2) {
      if (var0.size() != 0) {
         com.aspose.slides.internal.k4y.l0u var3 = (com.aspose.slides.internal.k4y.l0u)var1.invoke();
         if (var0.getUseCells()) {
            if (var2.l6().k5() == 2) {
               n5(var0, var3);
            } else {
               d0p.n5((ChartCategoryCollection)var0, var3);
            }
         } else {
            l6(var0, var3);
         }
      }
   }

   private static void n5(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1) {
      String var2 = ((ChartCategoryCollection)var0).a6();
      if (var0.getGroupingLevelCount() == 1) {
         boolean var3 = true;
         String[] var4 = new String[var0.size()];

         for (int var5 = 0; var5 < var0.size(); var5++) {
            var4[var5] = var0.get_Item(var5).getValue() != null
               ? com.aspose.slides.ms.System.z3.t9(var0.get_Item(var5).getValue(), com.aspose.slides.internal.x7n.l6.k5())
               : null;
            double var6 = 0.0;
            double[] var8 = new double[]{0.0};
            var3 &= var0.get_Item(var5).getValue() == null || com.aspose.slides.ms.System.d2.n5(var4[var5], 503, com.aspose.slides.internal.x7n.l6.k5(), var8);
            var6 = var8[0];
         }

         long var9 = 0L;
         if (var3) {
            com.aspose.slides.internal.k4y.z3o var11 = (com.aspose.slides.internal.k4y.z3o)var1.n5("numRef").l6();
            var11.n5(var2);
            com.aspose.slides.internal.k4y.a8e var19 = var11.n5();
            var19.n5(((ChartCategoryCollection)var0).u3().n5());

            for (int var12 = 0; var12 < var0.size(); var12++) {
               if (var4[var12] != null) {
                  com.aspose.slides.internal.k4y.o8r var13 = var19.l6();
                  var13.n5(var12 & 4294967295L);
                  var13.l6(var4[var12]);
                  if (((var13.n5() & 4294967295L) + 1L & 4294967295L) > (var9 & 4294967295L)) {
                     var9 = (var13.n5() & 4294967295L) + 1L & 4294967295L;
                  }
               }
            }

            var19.n5().n5(var9);
         } else {
            com.aspose.slides.internal.k4y.c9q var22 = (com.aspose.slides.internal.k4y.c9q)var1.n5("strRef").l6();
            var22.n5(var2);
            com.aspose.slides.internal.k4y.p4t var20 = var22.n5();

            for (int var24 = 0; var24 < var0.size(); var24++) {
               if (var4[var24] != null && !com.aspose.slides.ms.System.d1.n5(var4[var24])) {
                  com.aspose.slides.internal.k4y.l6j var26 = var20.l6();
                  var26.n5(var24 & 4294967295L);
                  var26.n5(var4[var24]);
                  if (((var26.n5() & 4294967295L) + 1L & 4294967295L) > (var9 & 4294967295L)) {
                     var9 = (var26.n5() & 4294967295L) + 1L & 4294967295L;
                  }
               }
            }

            var20.n5().n5(var9);
         }
      } else {
         com.aspose.slides.internal.k4y.w9n var15 = (com.aspose.slides.internal.k4y.w9n)var1.n5("multiLvlStrRef").l6();
         var15.n5(var2);
         com.aspose.slides.internal.k4y.x2o var16 = var15.n5();
         var16.n5().n5(var0.size() & 4294967295L);

         for (int var17 = 0; var17 < var0.getGroupingLevelCount(); var17++) {
            com.aspose.slides.internal.k4y.t9z var14 = var16.l6();

            for (int var23 = 0; var23 < var0.size(); var23++) {
               IChartDataCell var21 = var0.get_Item(var23).getGroupingLevels().get_Item(var17);
               if (var21 != null && var21.getValue() != null) {
                  com.aspose.slides.internal.k4y.l6j var25 = var14.n5();
                  var25.n5(var23 & 4294967295L);
                  var25.n5(com.aspose.slides.ms.System.z3.t9(var21.getValue(), com.aspose.slides.internal.x7n.l6.k5()));
               }
            }
         }
      }
   }

   private static void l6(IChartCategoryCollection var0, com.aspose.slides.internal.k4y.l0u var1) {
      boolean var2 = true;
      String[] var3 = new String[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         var3[var4] = var0.get_Item(var4).getValue() != null
            ? com.aspose.slides.ms.System.z3.t9(var0.get_Item(var4).getValue(), com.aspose.slides.internal.x7n.l6.k5())
            : null;
         double var5 = 0.0;
         double[] var7 = new double[]{0.0};
         var2 &= com.aspose.slides.ms.System.d2.n5(var3[var4], 503, com.aspose.slides.internal.x7n.l6.k5(), var7);
         var5 = var7[0];
      }

      if (var2) {
         com.aspose.slides.internal.k4y.a8e var10 = (com.aspose.slides.internal.k4y.a8e)var1.n5("numLit").l6();
         var10.n5("General");
         var10.n5().n5(var0.size() & 4294967295L);

         for (int var8 = 0; var8 < var0.size(); var8++) {
            com.aspose.slides.internal.k4y.o8r var9 = var10.l6();
            var9.n5(var8 & 4294967295L);
            var9.l6(var3[var8]);
         }
      } else {
         com.aspose.slides.internal.k4y.p4t var11 = (com.aspose.slides.internal.k4y.p4t)var1.n5("strLit").l6();
         var11.n5().n5(var0.size() & 4294967295L);

         for (int var13 = 0; var13 < var0.size(); var13++) {
            if (var3[var13] != null) {
               com.aspose.slides.internal.k4y.l6j var14 = var11.l6();
               var14.n5(var13 & 4294967295L);
               var14.n5(var3[var13]);
            }
         }
      }
   }
}
