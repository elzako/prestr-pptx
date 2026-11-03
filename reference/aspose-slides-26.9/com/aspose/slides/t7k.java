package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class t7k extends com.aspose.slides.internal.v6g.h0<t7k> {
   public t7k() {
   }

   static com.aspose.slides.internal.o9b.f2 n5(List<g3y> var0, int var1, int var2, int var3, n1g var4, l5 var5) {
      g3y var6 = (g3y)var0.get_Item(var1);
      t9z var7 = var6.c8().get_Item(var2);
      f3h var8 = var7.t9();
      if (!var8.l6().isVisible() && "".equals(var8.k5().getText())) {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      }

      boolean var9 = false;
      List var11;
      List var12;
      if (var5.y4() == 0) {
         IChartCategoryCollection var10 = var4.n3().getChartData().getCategories();
         var9 = var10 != null && var10.size() > 0;
         var11 = var4.l6();
         var12 = var11;
      } else {
         IChartCategoryCollection var35 = var4.n3().getChartData().getSecondaryCategories();
         var9 = var35 != null && var35.size() > 0;
         var11 = var4.k5();
         var12 = var11;
      }

      String var36 = var8.l6().getDataLabelFormat().getNumberFormat();
      boolean var13 = false;
      boolean var14 = var8.l6().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(var8.l6().getDataLabelFormat().getNumberFormat());
      String var15 = var6.k5();
      String var16 = "";
      if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var6.u9().getType())) {
         Double var17 = var7.l6();
         var16 = n5(var17, var36, var13);
         if (var14) {
            var16 = n5(var17, var7.u9(), false);
         }
      } else if (var9) {
         String var38 = var2 < var11.size() ? ((x4)var12.get_Item(var2)).u9() : "";
         boolean var18 = var2 < var11.size() && ((x4)var12.get_Item(var2)).a6();
         if (var14) {
            var36 = var38;
            var13 = var18;
         }

         if (var36 == null) {
            var36 = var5.c8().getNumberFormat();
         }

         if (var2 < var11.size()) {
            Object var19 = ((x4)var11.get_Item(var2)).l6();
            int var20 = o9b.n5(var19, false);
            Object var21 = ((x4)var12.get_Item(var2)).l6();
            if (var20 == -1) {
               var16 = "";
            } else {
               var16 = n5(var21, var36, var13);
            }
         } else {
            var16 = "";
         }
      } else {
         var16 = var2 >= var5.h0.size() ? "" : n5(var5.h0.get_Item(var2), var36, var13);
      }

      l5 var39 = p4.l6(var5);
      double var22 = var7.n5();
      var22 = var39.c8().isLogarithmic() ? var39.l6(var22) : var22;
      var22 = var39.c8().isLogarithmic() ? var22 : var22 * p4.n5(var39);
      String var40 = n5(var22, var36, var13);
      if (var14) {
         String var41;
         if (var8.l6().c8().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource()) {
            var41 = var7.a6();
         } else {
            var41 = var7.u3();
         }

         var40 = n5(var22, var41, false);
      }

      String var42 = n5(var7.k5(), var36, var13);
      if (var14) {
         var42 = n5(var7.k5(), var7.h0(), false);
      }

      String var24 = n5(var8.l6());
      com.aspose.slides.internal.o9b.n3 var25 = var8.a6();
      int var26 = com.aspose.slides.internal.v6g.k5.u3(var8.h0(), 13);
      byte var27 = 1;
      byte var28 = 1;
      com.aspose.slides.internal.o9b.f2 var29 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      IDataLabelFormat var30 = var8.l6().getDataLabelFormat();
      if (var30.getShowLegendKey()) {
         z7d.n5(var4).l6(var29);
      }

      String var31 = "";
      if (com.aspose.slides.ms.System.d1.n5(var8.k5().getText())) {
         if (var30.getShowSeriesName()) {
            var31 = com.aspose.slides.ms.System.d1.n5(var31, var15);
         }

         if (var30.getShowCategoryName()) {
            if (!"".equals(var31)) {
               var31 = com.aspose.slides.ms.System.d1.n5(var31, var24);
            }

            var31 = com.aspose.slides.ms.System.d1.n5(var31, var16);
         }

         if (var30.getShowValue()) {
            if (!"".equals(var31)) {
               var31 = com.aspose.slides.ms.System.d1.n5(var31, var24);
            }

            var31 = com.aspose.slides.ms.System.d1.n5(var31, var40);
         }

         if (var30.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(var6.u9().getType())) {
            if (!"".equals(var31)) {
               var31 = com.aspose.slides.ms.System.d1.n5(var31, var24);
            }

            var31 = com.aspose.slides.ms.System.d1.n5(var31, var42);
         }
      } else {
         var31 = var8.k5().getText();
      }

      com.aspose.slides.internal.o9b.f2 var32 = new com.aspose.slides.internal.o9b.f2(var3, var4.y2() * 0.5F);
      com.aspose.slides.internal.o9b.p8 var33 = h6l.n5(var31, var26, var25, var32.a6(), var27, var28).u3();
      if ("".equals(var31)) {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      } else {
         return var30.getShowLegendKey()
            ? new com.aspose.slides.internal.o9b.f2(var33.l6() + var29.l6(), var33.k5())
            : new com.aspose.slides.internal.o9b.f2(var33.l6(), var33.k5());
      }
   }

   static void n5(List<g3y> var0, int var1, int var2, com.aspose.slides.internal.o9b.y2 var3, n1g var4, l5 var5) {
      com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(var3.s7(), var3.x8(), var3.t2(), var3.l6());
      n5(var0, var1, var2, var6.y4(), var4, var5);
   }

   static void n5(List<g3y> var0, int var1, int var2, com.aspose.slides.internal.o9b.y1 var3, n1g var4, l5 var5) {
      g3y var6 = (g3y)var0.get_Item(var1);
      t9z var7 = var6.c8().get_Item(var2);
      f3h var8 = var7.t9();
      if (var8.l6().isVisible() || !"".equals(var8.k5().getText())) {
         if (!com.aspose.slides.ms.System.n1.k5(var8.l6().getY()) || !(var3.n3() < 0.0F) && !(var3.l6() > var4.a0() + var4.y2())) {
            if (ChartTypeCharacterizer.is3DChart(var4.n3().getType())) {
               n5(var3.x8(), var3.n3(), var8, var3.c8().a6(), var4);
               com.aspose.slides.internal.o9b.y2 var9 = var8.k5.n5.n3();
               var3 = new com.aspose.slides.internal.o9b.y1(var9.s7(), var9.x8(), var9.t2(), var9.l6());
            }

            com.aspose.slides.internal.o9b.y1[] var43 = new com.aspose.slides.internal.o9b.y1[]{var3};
            var4.n5(var43);
            var43[0].a6(var3);
            boolean var10 = false;
            List var12;
            List var13;
            if (var5.y4() == 0) {
               IChartCategoryCollection var11 = var4.n3().getChartData().getCategories();
               var10 = var11 != null && var11.size() > 0;
               var12 = var4.l6();
               var13 = var12;
            } else {
               IChartCategoryCollection var45 = var4.n3().getChartData().getSecondaryCategories();
               var10 = var45 != null && var45.size() > 0;
               var12 = var4.k5();
               var13 = var12;
            }

            String var46 = var8.l6().getDataLabelFormat().getNumberFormat();
            boolean var14 = false;
            boolean var15 = var8.l6().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(var8.l6().getDataLabelFormat().getNumberFormat());
            String var16 = var6.k5();
            String var17 = "";
            boolean var18 = false;
            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var6.u9().getType())) {
               Double var19 = var7.l6();
               var17 = n5(var19, var46, var14);
               if (var15) {
                  var17 = n5(var19, var7.u9(), false);
                  var18 = n5(var19, var7.u9());
               }
            } else if (var10) {
               String var48 = var2 < var12.size() ? ((x4)var13.get_Item(var2)).u9() : "";
               boolean var20 = var2 < var12.size() && ((x4)var13.get_Item(var2)).a6();
               if (var15) {
                  var46 = var48;
                  var14 = var20;
               }

               if (var46 == null) {
                  var46 = var5.c8().getNumberFormat();
               }

               if (var2 < var12.size()) {
                  Object var21 = ((x4)var12.get_Item(var2)).l6();
                  int var22 = o9b.n5(var21, false);
                  Object var23 = ((x4)var13.get_Item(var2)).l6();
                  if (var22 == -1) {
                     var17 = "";
                  } else {
                     var17 = n5(var23, var46, var14);
                  }

                  if (var15) {
                     var18 = n5(var21, var46);
                  }
               } else {
                  var17 = "";
               }
            } else {
               var17 = var2 >= var5.h0.size() ? "" : n5(var5.h0.get_Item(var2), var46, var14);
               if (var2 < var5.h0.size() && var15) {
                  var18 = n5(var5.h0.get_Item(var2), var46);
               }
            }

            l5 var49 = p4.l6(var5);
            double var24 = var7.n5();
            var24 = var49.c8().isLogarithmic() ? var49.l6(var24) : var24;
            var24 = var49.c8().isLogarithmic() ? var24 : var24 * p4.n5(var49);
            String var50 = n5(var24, var46, var14);
            boolean var51 = false;
            if (var15) {
               String var26;
               if (var8.l6().c8().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource()) {
                  var26 = var7.a6();
               } else {
                  var26 = var7.u3();
               }

               var50 = n5(var24, var26, false);
               var51 = n5(var24, var7.u3());
            }

            String var54 = n5(var7.k5(), var46, var14);
            if (var15) {
               var54 = n5(var54, var7.h0(), false);
            }

            String var27;
            if ("".equals(var8.l6().getDataLabelFormat().getSeparator())) {
               var27 = ", ";
            } else {
               var27 = var8.l6().getDataLabelFormat().getSeparator();
            }

            com.aspose.slides.internal.o9b.n3 var28 = var8.t2();
            com.aspose.slides.internal.o9b.c8 var29 = var8.s7().o8();
            int var30 = com.aspose.slides.internal.v6g.k5.u3(var8.h0(), 13);
            com.aspose.slides.internal.o9b.f2 var31 = z7d.n5(var4).a6();
            int var32 = com.aspose.slides.internal.v6g.k5.u3(var3.x8(), 13);
            int var33 = com.aspose.slides.internal.v6g.k5.u3(var3.n3(), 13);
            int var34 = com.aspose.slides.internal.v6g.k5.u3(var3.s7(), 13);
            int var35 = com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13);
            IDataLabelFormat var36 = var8.l6().getDataLabelFormat();
            int var37 = var36.getShowLegendKey() ? var32 - 3 : var32;
            int var38 = var33 - 3;
            int var39 = var36.getShowLegendKey() ? var34 + 6 : var34;
            int var40 = var35 + 6;
            var8.k5.n5 = new com.aspose.slides.internal.o9b.y2(var37, var38, var39, var40);
            var8.k5.n5();
            if (var36.getShowLegendKey()) {
               com.aspose.slides.internal.o9b.y1 var41 = new com.aspose.slides.internal.o9b.y1(var3.x8(), var3.n3(), var31.l6(), var31.k5());
               z7d.n5(var41.y4(), var6, var7);
               var32 += com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
               var34 -= com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
            }

            String var55 = "";
            if (com.aspose.slides.ms.System.d1.n5(var8.k5().getText())) {
               if (var36.getShowSeriesName()) {
                  var55 = com.aspose.slides.ms.System.d1.n5(var55, var16);
               }

               if (var36.getShowCategoryName()) {
                  if (!"".equals(var55)) {
                     var55 = com.aspose.slides.ms.System.d1.n5(var55, var27);
                  }

                  var55 = com.aspose.slides.ms.System.d1.n5(var55, var17);
               }

               if (var36.getShowValue()) {
                  if (!"".equals(var55)) {
                     var55 = com.aspose.slides.ms.System.d1.n5(var55, var27);
                  }

                  var55 = com.aspose.slides.ms.System.d1.n5(var55, var50);
               }

               if (var36.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(var6.u9().getType())) {
                  if (!"".equals(var55)) {
                     var55 = com.aspose.slides.ms.System.d1.n5(var55, var27);
                  }

                  var55 = com.aspose.slides.ms.System.d1.n5(var55, var54);
               }
            } else {
               var55 = var8.k5().getText();
            }

            com.aspose.slides.internal.o9b.y2 var42 = new com.aspose.slides.internal.o9b.y2(var32, var33, var34, var35);
            if (var18 || var51) {
               com.aspose.slides.internal.o9b.c8.z0().n5(var29);
            }

            h6l.n5(com.aspose.slides.internal.o9b.y1.n5(var42).y4(), var55, var30, var28, var29.o8(), 1, 2, var4);
         }
      }
   }

   static String n5(DataLabel var0) {
      return var0.getDataLabelFormat().getSeparator();
   }

   static String l6(DataLabel var0) {
      String var1 = "";
      if ("".equals(var0.getDataLabelFormat().getSeparator())) {
         if (var0.getDataLabelFormat().getShowCategoryName()
            && var0.getDataLabelFormat().getShowPercentage()
            && !var0.getDataLabelFormat().getShowSeriesName()
            && !var0.getDataLabelFormat().getShowValue()) {
            var1 = "\n";
         } else {
            var1 = ", ";
         }
      } else {
         var1 = var0.getDataLabelFormat().getSeparator();
      }

      return var1;
   }

   static String n5(Object var0, String var1, boolean var2) {
      if (var0 == null) {
         return "";
      }

      if (var1 != null || var0 == null) {
         String var3 = "";

         try {
            if (n5(var1) && (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class) || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class))) {
               com.aspose.slides.ms.System.j5 var4 = new com.aspose.slides.ms.System.j5();
               if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
                  double var10 = com.aspose.slides.internal.v6g.k5.u3(var0, double.class);
                  n5(var10).u3(var4);
                  return f6z.n5(var4.m3(), var1, var2);
               }

               double var5 = ((Integer)var0).intValue();
               n5(var5).u3(var4);
               return f6z.n5(var4.m3(), var1, var2);
            }

            var3 = f6z.n5(var0, var1, false);
         } catch (RuntimeException var8) {
            com.aspose.slides.internal.n8e.v4.n5(var8);
            if (var0 instanceof Double) {
               var3 = com.aspose.slides.ms.System.d2.u9((Double)var0);
            } else {
               var3 = var0.toString();
            }
         }

         return var3;
      } else {
         return var0 instanceof Double ? com.aspose.slides.ms.System.d2.u9((Double)var0) : var0.toString();
      }
   }

   static com.aspose.slides.internal.o9b.c8 n5(Object var0, String var1, com.aspose.slides.internal.o9b.c8 var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return var2;
      }

      if ((com.aspose.slides.internal.v6g.k5.l6(var0, Double.class) || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class))
         && com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var1), "[red]") > 0) {
         double var3;
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
            var3 = (Double)var0;
         } else {
            var3 = ((Integer)var0).intValue();
         }

         return var3 < 0.0 ? com.aspose.slides.internal.o9b.c8.z0() : var2;
      } else {
         return var2;
      }
   }

   static boolean n5(Object var0, String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return false;
      }

      if ((com.aspose.slides.internal.v6g.k5.l6(var0, Double.class) || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class))
         && com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var1), "[red]") > 0) {
         double var2;
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
            var2 = (Double)var0;
         } else {
            var2 = ((Integer)var0).intValue();
         }

         if (var2 < 0.0) {
            return true;
         }
      }

      return false;
   }

   private static boolean n5(String var0) {
      String[] var1 = new String[]{
         "MMM",
         "DD",
         "YYYY",
         "YY",
         "M/",
         "/M",
         "/D",
         "D/",
         "/Y",
         "Y/",
         "-M",
         "M-",
         "-D",
         "D-",
         "-Y",
         "Y-",
         "MM/DD",
         "DD/MM",
         "M/D",
         "D/M",
         "MM-DD",
         "DD-MM",
         "M-D",
         "D-M",
         "H:MM",
         "MM:SS",
         "Дк",
         "ФВ",
         "ИХ",
         "К±",
         "·Ц",
         "Гл",
         "MM"
      };

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (com.aspose.slides.ms.System.d1.c8(var0, var1[var2]) != -1
            || com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.t2(var0), var1[var2]) != -1) {
            return true;
         }
      }

      return false;
   }

   private static com.aspose.slides.ms.System.j5 n5(double var0) {
      com.aspose.slides.ms.System.j5 var2 = new com.aspose.slides.ms.System.j5(1899, 12, 30, 0, 0, 1);
      if (var0 < 0.0) {
         return var2;
      }

      if (var0 > 2958465.99) {
         return new com.aspose.slides.ms.System.j5(9999, 12, 31, 23, 59, 59);
      }

      if (var0 < 60.0) {
         var0++;
      }

      return com.aspose.slides.ms.System.j5.n5(var2, com.aspose.slides.ms.System.s4.n5(var0)).m3();
   }

   static int n5(int var0) {
      switch (var0) {
         case 0:
         case 3:
         case 6:
         case 7:
         case 10:
         case 11:
         case 14:
         case 15:
         case 18:
         case 33:
         case 34:
         case 38:
         case 41:
         case 44:
         case 79:
            return 6;
         case 1:
         case 2:
         case 4:
         case 5:
         case 8:
         case 9:
         case 12:
         case 13:
         case 16:
         case 17:
         case 32:
         case 35:
         case 36:
         case 37:
         case 39:
         case 40:
         case 42:
         case 43:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 66:
         case 67:
            return 2;
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 68:
         case 69:
            return 7;
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
            return 1;
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         default:
            return 2;
      }
   }

   static void n5(float var0, float var1, f3h var2, com.aspose.slides.internal.o9b.f2 var3, n1g var4) {
      if (var2.n3()) {
         var2.k5.n5 = new com.aspose.slides.internal.o9b.y2(g6z.k5(var0), g6z.k5(var1), g6z.n5(var3.l6()), g6z.n5(var3.k5()));
         float var5 = (float)var2.k5.n5.s7() + var2.k5.n5.t2();
         float var6 = var4.n3().getX() + var4.n3().getWidth();
         if (var5 > var6) {
            var2.k5.n5.l6(com.aspose.slides.internal.v6g.k5.u3(var2.k5.n5.t2() - (var5 - var6), 13));
         }
      } else {
         var0 = var0 >= 0.0F ? var0 : var4.y1();
         var1 = var1 >= 0.0F ? var1 : var4.a0();
         var0 = var0 + var3.l6() <= var4.y1() + var4.c4() ? var0 : var4.c4() - var3.l6() + var4.y1();
         var1 = var1 + var3.k5() <= var4.a0() + var4.y2() ? var1 : var4.y2() - var3.k5() + var4.a0();
         float var11 = var2.l6().getX();
         float var12 = var2.l6().getY();
         if (ChartTypeCharacterizer.isChartTypeBar(var2.n5().n3().getType())) {
            if (var2.n5().q0().c8() != null && var2.n5().q0().c8().isPlotOrderReversed()) {
               var12 *= -1.0F;
            }

            if (var2.n5().m1().c8() != null && var2.n5().m1().c8().isPlotOrderReversed()) {
               var11 *= -1.0F;
            }
         }

         if (ChartTypeCharacterizer.isChartTypeColumn(var2.n5().n3().getType())) {
            if (var2.n5().q0().c8() != null && var2.n5().q0().c8().isPlotOrderReversed()) {
               var11 *= -1.0F;
            }

            if (var2.n5().m1().c8() != null && var2.n5().m1().c8().isPlotOrderReversed()) {
               var12 *= -1.0F;
            }
         }

         var2.k5.n5 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(g6z.k5(var0) + var4.c4() * var11, 13),
            g6z.k5(var1) + com.aspose.slides.internal.v6g.k5.u3(var4.y2() * var12, 13),
            g6z.n5(var3.l6()),
            g6z.n5(var3.k5())
         );
      }
   }

   public void n5(t7k var1) {
   }

   public t7k n5() {
      t7k var1 = new t7k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(t7k var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof t7k) ? false : this.l6((t7k)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t7k Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(t7k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
