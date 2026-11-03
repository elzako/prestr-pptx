package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class t4d {
   static final String[] n5 = new String[]{"#DIV/0!", "#NAME?", "#VALUE!", "#NULL!", "#NUM!", "#REF!", "#N/A", "#GETTING_DATA"};
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "strRef", "v", "multiLvlStrRef", "numRef", "numLit", "strLit"
   );

   public static void n5(IChart var0, t5w var1, com.aspose.slides.internal.k4y.w4c var2, com.aspose.slides.internal.k4y.w2p var3) {
      com.aspose.slides.internal.c8m.r7[] var4 = null;
      if (var1.k7() != null) {
         var4 = var1.k7().n5(com.aspose.slides.internal.c8m.a1.n5);
      }

      ChartData var5 = (ChartData)var0.getChartData();
      if (var0.getChartData().getDataSourceType() != 1) {
         if (var4 != null && var4.length > 0) {
            var5.l6().n5(new com.aspose.slides.internal.z0k.e2(var4[0].l6().a6()));
            var4[0].l6().n5(true);
            ((n6o)var5.l6()).n5(com.aspose.slides.internal.z0k.z1.n5(var4[0].l6().l6()));
            String var7 = var4[0].l6().y4().n5();
            if ("application/vnd.ms-excel.sheet.macroEnabled.12".equals(var7)) {
               var5.l6().n5(1);
            } else if ("application/vnd.ms-excel.sheet.binary.macroEnabled.12".equals(var7)) {
               var5.l6().n5(4);
            } else {
               var5.l6().n5(0);
            }
         } else {
            ChartDataWorkbook var6 = new ChartDataWorkbook((ChartData)var0.getChartData());
            if (var2 != null) {
               n5(var6, var2);
            } else {
               n5(var6, var3);
            }

            var5.l6().n5(new com.aspose.slides.internal.z0k.e2());
            var6.n5(var5.l6().c8());
         }
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.z0k.e2 var1) {
      if (var1 != null) {
         com.aspose.slides.internal.q7.l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.getPresentation(), Presentation.class).w1();
         List var3 = n5((ChartData)var0.getChartData());
         ((ChartData)var0.getChartData()).l6().n5(var1, var3, var2, InterruptionToken.getNone());
      }
   }

   private static void n5(ChartDataWorkbook var0, com.aspose.slides.internal.k4y.w2p var1) {
      for (com.aspose.slides.internal.k4y.g1i var5 : var1.l6().k5()) {
         List$Enumerator var6 = var5.l6().iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var7.l6(), com.aspose.slides.internal.k4y.o8n.class)) {
                  com.aspose.slides.internal.k4y.o8n var8 = com.aspose.slides.internal.v6g.k5.n5(var7.l6(), com.aspose.slides.internal.k4y.o8n.class);
                  n5(var5, var0, var8);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var7.l6(), com.aspose.slides.internal.k4y.a9k.class)) {
                  com.aspose.slides.internal.k4y.a9k var16 = com.aspose.slides.internal.v6g.k5.n5(var7.l6(), com.aspose.slides.internal.k4y.a9k.class);
                  n5(var5, var0, var16);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      for (com.aspose.slides.internal.k4y.x1i var15 : var1.k5().u3().l6().u3()) {
         n5(var15, var0);
      }
   }

   private static String n5(com.aspose.slides.internal.k4y.g1i var0, com.aspose.slides.internal.k4y.o8n var1, ChartDataWorkbook var2) {
      if (var1.a6().length == 0) {
         return "";
      }

      if (var1.a6()[0].u3().length == 0) {
         return "";
      }

      com.aspose.slides.internal.k4y.t7d[] var3 = var1.a6()[0].u3();
      int var4 = (int)var0.n5() + 1;
      byte var5 = 1;
      int var6 = (int)var3[var3.length - 1].n5() + 1;
      if (var6 == 1) {
         String var13 = x6s.k5(var5, var4);
         String var14 = com.aspose.slides.ms.System.d1.t2(var13);

         for (int var16 = 0; var16 < var14.length(); var16++) {
            char var18 = var13.charAt(var16);
            if (com.aspose.slides.ms.System.t9.u3(var18)) {
               var14 = com.aspose.slides.ms.System.d1.n5(var14, var16, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5("Sheet1!{0}", new Object[]{com.aspose.slides.ms.System.d1.n5(var14, 0, "$")});
      } else {
         String var7 = x6s.k5(1, var4);
         String var8 = com.aspose.slides.ms.System.d1.t2(var7);

         for (int var9 = 0; var9 < var8.length(); var9++) {
            char var10 = var7.charAt(var9);
            if (com.aspose.slides.ms.System.t9.u3(var10)) {
               var8 = com.aspose.slides.ms.System.d1.n5(var8, var9, "$");
               break;
            }
         }

         String var15 = x6s.k5(var5 + var6 - 1, var4);
         String var17 = com.aspose.slides.ms.System.d1.t2(var15);

         for (int var11 = 0; var11 < var17.length(); var11++) {
            char var12 = var15.charAt(var11);
            if (com.aspose.slides.ms.System.t9.u3(var12)) {
               var17 = com.aspose.slides.ms.System.d1.n5(var17, var11, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5(
            "Sheet1!{0}:{1}",new Object[]{ com.aspose.slides.ms.System.d1.n5(var8, 0, "$"), com.aspose.slides.ms.System.d1.n5(var17, 0, "$")
         });
      }
   }

   private static String n5(com.aspose.slides.internal.k4y.g1i var0, com.aspose.slides.internal.k4y.a9k var1, ChartDataWorkbook var2) {
      if (var1.a6().length == 0) {
         return "";
      }

      if (var1.a6()[0].k5().length == 0) {
         return "";
      }

      com.aspose.slides.internal.k4y.i0c[] var3 = var1.a6()[0].k5();
      byte var4 = 0;
      byte var5 = 1;
      int var6 = (int)var3[var3.length - 1].n5() + 1;
      if (var6 == 1) {
         String var13 = x6s.k5(1, var4);
         String var14 = com.aspose.slides.ms.System.d1.t2(var13);

         for (int var16 = 0; var16 < var14.length(); var16++) {
            char var18 = var13.charAt(var16);
            if (com.aspose.slides.ms.System.t9.u3(var18)) {
               var14 = com.aspose.slides.ms.System.d1.n5(var14, var16, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5("Sheet1!{0}", new Object[]{com.aspose.slides.ms.System.d1.n5(var14, 0, "$")});
      } else {
         String var7 = x6s.k5(var5, var4);
         String var8 = com.aspose.slides.ms.System.d1.t2(var7);

         for (int var9 = 0; var9 < var8.length(); var9++) {
            char var10 = var7.charAt(var9);
            if (com.aspose.slides.ms.System.t9.u3(var10)) {
               var8 = com.aspose.slides.ms.System.d1.n5(var8, var9, "$");
               break;
            }
         }

         String var15 = x6s.k5(var5 + var6 - 1, var4);
         String var17 = com.aspose.slides.ms.System.d1.t2(var15);

         for (int var11 = 0; var11 < var17.length(); var11++) {
            char var12 = var15.charAt(var11);
            if (com.aspose.slides.ms.System.t9.u3(var12)) {
               var17 = com.aspose.slides.ms.System.d1.n5(var17, var11, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5(
            "Sheet1!{0}:{1}",new Object[]{ com.aspose.slides.ms.System.d1.n5(var8, 0, "$"), com.aspose.slides.ms.System.d1.n5(var17, 0, "$")
         });
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.x1i var0, ChartDataWorkbook var1) {
      com.aspose.slides.internal.k4y.e8j var2 = var0.t2();
      if (var2 != null) {
         String var3 = "";
         com.aspose.slides.internal.k4y.q8h var4 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.q8h.class);
         if (var4 != null) {
            if (var4.n5() != null) {
               var3 = var4.n5().n5();
               List var5 = var1.u3(var3);
               if (var5.size() == 0) {
                  int var6 = (int)var0.e2().n5() + 1;
                  byte var7 = 0;
                  String var8 = x6s.k5(var7, var6);
                  String var9 = com.aspose.slides.ms.System.d1.t2(var8);

                  for (int var10 = 0; var10 < var9.length(); var10++) {
                     char var11 = var8.charAt(var10);
                     if (com.aspose.slides.ms.System.t9.u3(var11)) {
                        var9 = com.aspose.slides.ms.System.d1.n5(var9, var10, "$");
                        break;
                     }
                  }

                  String var14 = com.aspose.slides.ms.System.d1.n5("Sheet1!{0}", new Object[]{com.aspose.slides.ms.System.d1.n5(var9, 0, "$")});
                  var5 = var1.u3(var14);
               }

               ChartDataWorksheet var13 = var1.l6(((g1p)var5.get_Item(0)).n5());
               var13.l6()
                  .l6(((g1p)var5.get_Item(0)).a6(), ((g1p)var5.get_Item(0)).l6())
                  .setValue(com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.q8h.class).l6());
            }
         } else {
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var2.n5().n5(), "\""}));
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.g1i var0, ChartDataWorkbook var1, com.aspose.slides.internal.k4y.o8n var2) {
      if (var2 != null) {
         if (var2.u3() == null) {
            var2.n5().n5(com.aspose.slides.ms.System.d1.n5);
         }

         List var3 = var1.u3(var2.u3().n5());
         if (var3.size() == 0) {
            var2.u3().n5(n5(var0, var2, var1));
            var3 = var1.u3(var2.u3().n5());
         }

         int var4 = 0;
         long var5 = var2.a6()[0].l6();
         com.aspose.slides.internal.k4y.t7d[] var7 = var2.a6()[0].u3();
         List$Enumerator var8 = var3.iterator();

         try {
            while (var8.hasNext()) {
               g1p var9 = (g1p)var8.next();
               ChartDataWorksheet var10 = var1.l6(var9.n5());

               for (int var11 = var9.a6(); var11 <= var9.u9(); var11++) {
                  for (int var12 = var9.l6(); var12 <= var9.k5(); var12++) {
                     if (var4 < (var5 & 4294967295L)) {
                        com.aspose.slides.internal.k4y.t7d var13 = n5(var7, var4);
                        if (var13 != null) {
                           ChartDataCell var14 = var10.l6().l6(var11, var12);
                           var14.setValue(com.aspose.slides.ms.System.d2.n5(var13.l6(), com.aspose.slides.internal.x7n.l6.k5()));
                        }
                     }

                     var4++;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.g1i var0, ChartDataWorkbook var1, com.aspose.slides.internal.k4y.a9k var2) {
      if (var2 != null) {
         if (var2.u3() == null && var2.a6().length > 0) {
            var2.n5();
            var2.u3().n5(com.aspose.slides.ms.System.d1.n5);
         }

         List var3 = var1.u3(var2.u3().n5());
         if (var3.size() == 0) {
            var2.u3().n5(n5(var0, var2, var1));
            var3 = var1.u3(var2.u3().n5());
         }

         if (var2.a6().length > 1) {
            com.aspose.slides.internal.k4y.p4u[] var4 = var2.a6();
            com.aspose.slides.internal.k4y.i0c[][] var5 = new com.aspose.slides.internal.k4y.i0c[var4.length][];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = var4[var6].k5();
            }

            int var29 = 0;
            List$Enumerator var7 = var3.iterator();

            try {
               while (var7.hasNext()) {
                  g1p var8 = (g1p)var7.next();
                  ChartDataWorksheet var9 = var1.l6(var8.n5());
                  boolean var10 = var8.u3() == var4.length;
                  int var11 = var10 ? var8.a6() : var8.l6();
                  int var12 = var10 ? var8.u9() : var8.k5();

                  for (int var13 = var11; var13 <= var12; var13++) {
                     for (int var14 = 0; var14 < var5.length; var14++) {
                        com.aspose.slides.internal.k4y.i0c var15 = n5(var5[var14], var29);
                        if (var15 != null) {
                           ChartDataCell var16 = var10 ? var9.l6().l6(var13, var8.k5() - var14) : var9.l6().l6(var8.u9() - var14, var13);
                           var16.setValue(var15.l6());
                        }
                     }

                     var29++;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         } else {
            com.aspose.slides.internal.k4y.i0c[] var27 = var2.a6()[0].k5();
            int var28 = 0;
            long var18 = var2.a6()[0].l6();
            List$Enumerator var30 = var3.iterator();

            try {
               while (var30.hasNext()) {
                  g1p var31 = (g1p)var30.next();
                  ChartDataWorksheet var32 = var1.l6(var31.n5());

                  for (int var33 = var31.a6(); var33 <= var31.u9(); var33++) {
                     for (int var34 = var31.l6(); var34 <= var31.k5(); var34++) {
                        if (var28 < (var18 & 4294967295L)) {
                           com.aspose.slides.internal.k4y.i0c var35 = n5(var27, var28);
                           if (var35 != null) {
                              ChartDataCell var36 = var32.l6().l6(var33, var34);
                              var36.setValue(var35.l6());
                           }
                        }

                        var28++;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.i0c n5(com.aspose.slides.internal.k4y.i0c[] var0, int var1) {
      for (com.aspose.slides.internal.k4y.i0c var5 : var0) {
         if ((var5.n5() & 4294967295L) == var1) {
            return var5;
         }
      }

      return null;
   }

   private static com.aspose.slides.internal.k4y.t7d n5(com.aspose.slides.internal.k4y.t7d[] var0, int var1) {
      for (com.aspose.slides.internal.k4y.t7d var5 : var0) {
         if ((var5.n5() & 4294967295L) == var1) {
            return var5;
         }
      }

      return null;
   }

   static void n5(ChartDataWorkbook var0, IChartData var1) {
      IGenericEnumerator var2 = var1.getSeries().iterator();

      try {
         while (var2.hasNext()) {
            ChartSeries var3 = (ChartSeries)var2.next();
            ChartDataPointCollection var4 = (ChartDataPointCollection)var3.getDataPoints();
            if (var3.y4() == 0 && var3.getName().getDataSourceType() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.n3())) {
               IChartCellCollection var5 = var0.getCellCollection(var3.n3(), false);
               if (var5.getCount() > 0) {
                  if (var5.getCount() == var3.n5.size()) {
                     for (int var6 = 0; var6 < var5.getCount(); var6++) {
                        var5.get_Item(var6).setValue(var3.n5.get_Item(var6));
                     }
                  } else {
                     var5.get_Item(0).setValue(var3.x8());
                  }
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.n3())) {
               IChartCellCollection var17 = var0.getCellCollection(var4.n3(), false);
               int var29 = com.aspose.slides.ms.System.q1.l6(var17.getCount(), var3.getDataPoints().size());

               for (int var7 = 0; var7 < var29; var7++) {
                  var17.get_Item(var7).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var7), ChartDataPoint.class).t2().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.x8())) {
               IChartCellCollection var18 = var0.getCellCollection(var4.x8(), false);
               int var30 = com.aspose.slides.ms.System.q1.l6(var18.getCount(), var3.getDataPoints().size());

               for (int var42 = 0; var42 < var30; var42++) {
                  var18.get_Item(var42).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var42), ChartDataPoint.class).x8().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.s7())) {
               IChartCellCollection var19 = var0.getCellCollection(var4.s7(), false);
               int var31 = com.aspose.slides.ms.System.q1.l6(var19.getCount(), var3.getDataPoints().size());

               for (int var43 = 0; var43 < var31; var43++) {
                  var19.get_Item(var43).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var43), ChartDataPoint.class).s7().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.y4())) {
               IChartCellCollection var20 = var0.getCellCollection(var4.y4(), false);
               int var32 = com.aspose.slides.ms.System.q1.l6(var20.getCount(), var3.getDataPoints().size());

               for (int var44 = 0; var44 < var32; var44++) {
                  var20.get_Item(var44).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var44), ChartDataPoint.class).n3().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.e2())) {
               IChartCellCollection var21 = var0.getCellCollection(var4.e2(), false);
               int var33 = com.aspose.slides.ms.System.q1.l6(var21.getCount(), var3.getDataPoints().size());

               for (int var45 = 0; var45 < var33; var45++) {
                  var21.get_Item(var45).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var45), ChartDataPoint.class).y4().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.t9())) {
               IChartCellCollection var22 = var0.getCellCollection(var4.t9(), false);
               int var34 = com.aspose.slides.ms.System.q1.l6(var22.getCount(), var3.getDataPoints().size());

               for (int var46 = 0; var46 < var34; var46++) {
                  var22.get_Item(var46).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var46), ChartDataPoint.class).e2().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.z1())) {
               IChartCellCollection var23 = var0.getCellCollection(var4.z1(), true);
               int var35 = com.aspose.slides.ms.System.q1.l6(var23.getCount(), var3.getDataPoints().size());

               for (int var47 = 0; var47 < var35; var47++) {
                  var23.get_Item(var47).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var47), ChartDataPoint.class).t9().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.t4())) {
               IChartCellCollection var24 = var0.getCellCollection(var4.t4(), false);
               int var36 = com.aspose.slides.ms.System.q1.l6(var24.getCount(), var3.getDataPoints().size());

               for (int var48 = 0; var48 < var36; var48++) {
                  var24.get_Item(var48).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var48), ChartDataPoint.class).z1().n5());
               }
            }

            if (var3.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var4.q0())) {
               IChartCellCollection var25 = var0.getCellCollection(var4.q0(), false);
               int var37 = com.aspose.slides.ms.System.q1.l6(var25.getCount(), var3.getDataPoints().size());

               for (int var49 = 0; var49 < var37; var49++) {
                  var25.get_Item(var49).setValue(com.aspose.slides.internal.v6g.k5.n5(var3.getDataPoints().get_Item(var49), ChartDataPoint.class).t4().n5());
               }
            }

            if (!com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.v6g.k5.n5(var3.getLabels(), DataLabelCollection.class).n5())) {
               List var26 = var0.n5(com.aspose.slides.internal.v6g.k5.n5(var3.getLabels(), DataLabelCollection.class).n5(), true, true);
               int var38 = com.aspose.slides.ms.System.q1.l6(var26.size(), var3.getLabels().getCount());

               for (int var50 = 0; var50 < var38; var50++) {
                  ((ChartDataCell)var26.get_Item(var50)).setValue(var3.getLabels().get_Item(var50).getValueFromCell().getValue());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1.getCategories() != null && var1.getCategories().size() > 0) {
         ChartCategoryCollection var13 = (ChartCategoryCollection)var1.getCategories();
         String var15 = var13.k5();
         int var27 = var13.getGroupingLevelCount();
         IChartCellCollection var39 = var0.getCellCollection(var15, true);
         if (var27 > 1) {
            int var51 = 0;

            for (int var8 = 0; var8 < var1.getCategories().size(); var8++) {
               for (int var9 = var27 - 1; var9 >= 0; var9--) {
                  ChartCategory var10 = com.aspose.slides.internal.v6g.k5.n5(var1.getCategories().get_Item(var8), ChartCategory.class);
                  var39.get_Item(var51).setValue(var10.k5().n5(var9));
                  var51++;
               }
            }
         } else {
            int var52 = com.aspose.slides.ms.System.q1.l6(var39.getCount(), var1.getCategories().size());

            for (int var55 = 0; var55 < var52; var55++) {
               var39.get_Item(var55).setValue(com.aspose.slides.internal.v6g.k5.n5(var1.getCategories().get_Item(var55), ChartCategory.class).n5());
            }
         }
      }

      if (var1.getSecondaryCategories() != null && var1.getSecondaryCategories().size() > 0 && var1.getSecondaryCategories().getUseCells()) {
         String var14 = ((ChartCategoryCollection)var1.getSecondaryCategories()).k5();
         int var16 = var1.getSecondaryCategories().getGroupingLevelCount();
         IChartCellCollection var28 = var0.getCellCollection(var14, true);
         if (var16 > 0) {
            int var40 = 0;

            for (int var53 = 0; var53 < var1.getSecondaryCategories().size(); var53++) {
               for (int var56 = 0; var56 < var16; var56++) {
                  var1.getSecondaryCategories().get_Item(var53).getGroupingLevels().setGroupingItem(var56, var28.get_Item(var40));
                  var40++;
               }
            }
         } else {
            int var41 = com.aspose.slides.ms.System.q1.l6(var28.getCount(), var1.getSecondaryCategories().size());

            for (int var54 = 0; var54 < var41; var54++) {
               var28.get_Item(var54).setValue(com.aspose.slides.internal.v6g.k5.n5(var1.getSecondaryCategories().get_Item(var54), ChartCategory.class).n5());
               var1.getSecondaryCategories().get_Item(var54).setAsCell(var28.get_Item(var54));
            }
         }
      }
   }

   static void n5(ChartDataWorkbook var0, com.aspose.slides.internal.k4y.w4c var1) {
      List$Enumerator var2 = var1.a6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            com.aspose.slides.internal.k4y.k7 var4 = (com.aspose.slides.internal.k4y.k7)var3.l6();
            n5(var4.l6(), var0);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.m3[] var0, ChartDataWorkbook var1) {
      for (com.aspose.slides.internal.k4y.m3 var5 : var0) {
         n5(var5.h0(), var1);
         n5(var5.aF_(), var1);
         n5(var5.aA_(), var1);
         n5(var5.aB_(), var1);
         n5(var5.aG_(), var1);
         n5(var5.aK_(), var1);
         if (var5.j5() != null) {
            n5(var5.j5(), var1);
         } else if (var5.w1() != null) {
            n5(new com.aspose.slides.internal.k4y.y4g[]{var5.w1()}, var1);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.w1c var0, ChartDataWorkbook var1) {
      if (var0 != null) {
         switch (l6.n5(var0.n5().n5())) {
            case 0:
               com.aspose.slides.internal.k4y.c9q var2 = (com.aspose.slides.internal.k4y.c9q)var0.n5().l6();
               n5(var2, var1);
               return;
            case 1:
               return;
            default:
               throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var0.n5().n5(), "\""}));
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.y4g[] var0, ChartDataWorkbook var1) {
      if (var0 != null) {
         for (com.aspose.slides.internal.k4y.y4g var5 : var0) {
            n5(var5.n3(), var1);
            n5(var5.x8(), var1);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.l0u var0, ChartDataWorkbook var1) {
      if (var0 != null) {
         switch (l6.n5(var0.a6().n5())) {
            case 0:
               com.aspose.slides.internal.k4y.c9q var4 = (com.aspose.slides.internal.k4y.c9q)var0.a6().l6();
               n5(var4, var1);
               break;
            case 1:
            default:
               throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var0.a6().n5(), "\""}));
            case 2:
               com.aspose.slides.internal.k4y.w9n var2 = (com.aspose.slides.internal.k4y.w9n)var0.a6().l6();
               n5(var2, var1);
               break;
            case 3:
               com.aspose.slides.internal.k4y.z3o var3 = (com.aspose.slides.internal.k4y.z3o)var0.a6().l6();
               n5(var3, var1);
               break;
            case 4:
            case 5:
               return;
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.l6s var0, ChartDataWorkbook var1) {
      if (var0 != null) {
         switch (l6.n5(var0.a6().n5())) {
            case 3:
               com.aspose.slides.internal.k4y.z3o var2 = (com.aspose.slides.internal.k4y.z3o)var0.a6().l6();
               n5(var2, var1);
               return;
            case 4:
               return;
            default:
               throw new ArgumentOutOfRangeException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var0.a6().n5(), "\""}));
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.c9q var0, ChartDataWorkbook var1) {
      com.aspose.slides.internal.k4y.p4t var2 = var0.k5();
      if (var2 != null && var2.k5() != null) {
         com.aspose.slides.internal.k4y.l6j[] var3 = var2.u3();
         long var4 = var2.k5().n5();
         if ((var4 & 4294967295L) > 0L && var3.length > 0) {
            List var6 = var1.n5(var0);
            int var7 = 0;
            List$Enumerator var8 = var6.iterator();

            try {
               while (var8.hasNext()) {
                  g1p var9 = (g1p)var8.next();
                  ChartDataWorksheet var10 = var1.l6(var9.n5());

                  for (int var11 = var9.a6(); var11 <= var9.u9(); var11++) {
                     for (int var12 = var9.l6(); var12 <= var9.k5(); var12++) {
                        if (var7 < (var4 & 4294967295L)) {
                           com.aspose.slides.internal.k4y.l6j var13 = n5(var3, var7);
                           if (var13 != null) {
                              var10.l6().l6(var11, var12).setValue(var13.l6());
                           }
                        }

                        var7++;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.z3o var0, ChartDataWorkbook var1) {
      com.aspose.slides.internal.k4y.a8e var2 = var0.k5();
      if (var2 != null && var2.u3() != null) {
         com.aspose.slides.internal.k4y.o8r[] var3 = var2.a6();
         long var4 = var2.u3().n5();
         if ((var4 & 4294967295L) > 0L && var3.length > 0) {
            String var6 = var2.k5();
            List var7 = var1.n5(var0);
            int var8 = 0;
            List$Enumerator var9 = var7.iterator();

            try {
               while (var9.hasNext()) {
                  g1p var10 = (g1p)var9.next();
                  ChartDataWorksheet var11 = var1.l6(var10.n5());

                  for (int var12 = var10.a6(); var12 <= var10.u9(); var12++) {
                     for (int var13 = var10.l6(); var13 <= var10.k5(); var13++) {
                        if (var8 < (var4 & 4294967295L)) {
                           com.aspose.slides.internal.k4y.o8r var14 = n5(var3, var8);
                           if (var14 != null && !com.aspose.slides.ms.System.d1.n5(var14.k5())) {
                              ChartDataCell var15 = var11.l6().l6(var12, var13);
                              var15.setValue(com.aspose.slides.ms.System.d2.n5(var14.k5(), com.aspose.slides.internal.x7n.l6.k5()));
                              if (!com.aspose.slides.ms.System.d1.n5(var14.l6()) && !com.aspose.slides.ms.System.d1.a6(var14.l6(), var6)) {
                                 var15.setCustomNumberFormat(var14.l6());
                              }
                           }
                        }

                        var8++;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.w9n var0, ChartDataWorkbook var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x2o var2 = var0.k5();
         if (var2 != null && var2.k5() != null) {
            com.aspose.slides.internal.k4y.t9z[] var3 = var2.u3();
            if ((var2.k5().n5() & 4294967295L) > 0L && var3.length > 0) {
               com.aspose.slides.internal.k4y.l6j[][] var4 = new com.aspose.slides.internal.k4y.l6j[var3.length][];

               for (int var5 = 0; var5 < var4.length; var5++) {
                  var4[var5] = var3[var5].l6();
               }

               List var20 = var1.u3(var0.l6());
               int var6 = 0;
               List$Enumerator var7 = var20.iterator();

               try {
                  while (var7.hasNext()) {
                     g1p var8 = (g1p)var7.next();
                     if (var8.h0() == var3.length || var8.u3() == var3.length) {
                        ChartDataWorksheet var9 = var1.l6(var8.n5());
                        boolean var10 = var8.u3() == var3.length;
                        int var11 = var10 ? var8.a6() : var8.l6();
                        int var12 = var10 ? var8.u9() : var8.k5();

                        for (int var13 = var11; var13 <= var12; var13++) {
                           for (int var14 = 0; var14 < var4.length; var14++) {
                              com.aspose.slides.internal.k4y.l6j var15 = n5(var4[var14], var6);
                              if (var15 != null) {
                                 ChartDataCell var16 = var10 ? var9.l6().l6(var13, var8.k5() - var14) : var9.l6().l6(var8.u9() - var14, var13);
                                 var16.setValue(var15.l6());
                              }
                           }

                           var6++;
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.o8r n5(com.aspose.slides.internal.k4y.o8r[] var0, int var1) {
      for (com.aspose.slides.internal.k4y.o8r var5 : var0) {
         if ((var5.n5() & 4294967295L) == var1 && com.aspose.slides.ms.System.u3.n5(n5, var5.k5()) < 0) {
            return var5;
         }
      }

      return null;
   }

   private static com.aspose.slides.internal.k4y.l6j n5(com.aspose.slides.internal.k4y.l6j[] var0, int var1) {
      for (com.aspose.slides.internal.k4y.l6j var5 : var0) {
         if ((var5.n5() & 4294967295L) == var1) {
            return var5;
         }
      }

      return null;
   }

   private static List<String> n5(ChartData var0) {
      List var1 = new List();
      IGenericEnumerator var2 = var0.getSeries().iterator();

      try {
         while (var2.hasNext()) {
            ChartSeries var3 = (ChartSeries)var2.next();
            if (!com.aspose.slides.ms.System.d1.n5(var3.n3())) {
               var1.addItem(var3.n3());
            }

            ChartDataPointCollection var4 = (ChartDataPointCollection)var3.getDataPoints();
            if (!com.aspose.slides.ms.System.d1.n5(var4.n3())) {
               var1.addItem(var4.n3());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.x8())) {
               var1.addItem(var4.x8());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.s7())) {
               var1.addItem(var4.s7());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.y4())) {
               var1.addItem(var4.y4());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.e2())) {
               var1.addItem(var4.e2());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.t9())) {
               var1.addItem(var4.t9());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.z1())) {
               var1.addItem(var4.z1());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var4.t4())) {
               var1.addItem(var4.t4());
            }

            if (!com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.v6g.k5.n5(var3.getLabels(), DataLabelCollection.class).n5())) {
               var1.addItem(com.aspose.slides.internal.v6g.k5.n5(var3.getLabels(), DataLabelCollection.class).n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var0.getCategories() != null
         && !com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getCategories(), ChartCategoryCollection.class).k5())) {
         var1.addItem(com.aspose.slides.internal.v6g.k5.n5(var0.getCategories(), ChartCategoryCollection.class).k5());
      }

      if (var0.getSecondaryCategories() != null
         && !com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.v6g.k5.n5(var0.getSecondaryCategories(), ChartCategoryCollection.class).k5())) {
         var1.addItem(com.aspose.slides.internal.v6g.k5.n5(var0.getSecondaryCategories(), ChartCategoryCollection.class).k5());
      }

      var1.sort();

      for (int var8 = 0; var8 < var1.size() - 1; var8++) {
         if (com.aspose.slides.ms.System.d1.a6((String)var1.get_Item(var8), (String)var1.get_Item(var8 + 1))) {
            var1.removeAt(var8);
            var8--;
         }
      }

      return var1;
   }
}
