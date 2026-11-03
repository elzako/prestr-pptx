package com.aspose.slides;

import com.aspose.slides.exceptions.SerializationException;

class i4 {
   public static void n5(IAxis var0, com.aspose.slides.internal.k4y.n3p var1, c1x var2) {
      if (var1 != null) {
         n7 var3 = ((Axis)var0).n5();
         var3.n5(var1.k7());
         t5w var4 = var2.n5().n5();
         var0.setVisible(!var1.t2());
         if (com.aspose.slides.internal.v6g.k5.l6(var1.s7().l6(), com.aspose.slides.internal.k4y.t2a.class)) {
            com.aspose.slides.internal.k4y.t2a var5 = com.aspose.slides.internal.v6g.k5.n5(var1.s7().l6(), com.aspose.slides.internal.k4y.t2a.class);
            if (var5.n5() != null) {
               var0.setAutomaticMaxValue(false);
               double var6 = 0.0;
               double[] var8 = new double[]{0.0};
               boolean var9 = com.aspose.slides.ms.System.d2.n5(var5.n5(), 167, com.aspose.slides.internal.x7n.l6.k5(), var8);
               var6 = var8[0];
               if (var9) {
                  var0.setMaxValue(var6);
               }
            }

            if (var5.l6() != null) {
               var0.setAutomaticMinValue(false);
               double var16 = 0.0;
               double[] var22 = new double[]{0.0};
               boolean var25 = com.aspose.slides.ms.System.d2.n5(var5.l6(), 167, com.aspose.slides.internal.x7n.l6.k5(), var22);
               var16 = var22[0];
               if (var25) {
                  var0.setMinValue(var16);
               }
            }

            if (var5.k5() != null) {
               var0.setAutomaticMajorUnit(true);
               double var18 = 0.0;
               double[] var23 = new double[]{0.0};
               boolean var26 = com.aspose.slides.ms.System.d2.n5(var5.k5(), 167, com.aspose.slides.internal.x7n.l6.k5(), var23);
               var18 = var23[0];
               if (var26) {
                  var0.setMajorUnit(var18);
               }
            }

            if (var5.u3() != null) {
               var0.setAutomaticMinorUnit(true);
               double var20 = 0.0;
               double[] var24 = new double[]{0.0};
               boolean var27 = com.aspose.slides.ms.System.d2.n5(var5.u3(), 167, com.aspose.slides.internal.x7n.l6.k5(), var24);
               var20 = var24[0];
               if (var27) {
                  var0.setMajorUnit(var20);
               }
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0, Axis.class)) {
            Axis var14 = (Axis)var0;
            var14.n5(Double.NaN);
            if (com.aspose.slides.internal.v6g.k5.l6(var1.s7().l6(), com.aspose.slides.internal.k4y.b1k.class)) {
               com.aspose.slides.internal.k4y.b1k var10 = com.aspose.slides.internal.v6g.k5.n5(var1.s7().l6(), com.aspose.slides.internal.k4y.b1k.class);
               if (var10.n5() != null) {
                  double var11 = 0.0;
                  double[] var28 = new double[]{0.0};
                  boolean var13 = com.aspose.slides.ms.System.d2.n5(var10.n5(), 511, com.aspose.slides.internal.x7n.l6.k5(), var28);
                  var11 = var28[0];
                  if (var13) {
                     var14.n5(var11);
                     if (var14.getChart().getChartData().getSeries().size() > 0 && var14.getChart().getChartData().getSeries().get_Item(0).getType() == 79) {
                        var14.getChart()
                           .getChartData()
                           .getSeries()
                           .get_Item(0)
                           .getParentSeriesGroup()
                           .setGapWidth(com.aspose.slides.internal.v6g.k5.k5(var11 * 100.0, 14));
                     }
                  }
               }
            }
         }

         n5(var0.getMajorGridLinesFormat(), var1.y4(), var2);
         n5(var0.getMinorGridLinesFormat(), var1.e2(), var2);
         if (var1.t9() != null) {
            var0.setMajorTickMark(n5(var1.t9()));
            var3.k5(var1.t9().l6());
         } else {
            var0.setMajorTickMark(2);
         }

         if (var1.z1() != null) {
            var0.setMinorTickMark(n5(var1.z1()));
            var3.u3(var1.z1().l6());
         } else {
            var0.setMinorTickMark(2);
         }

         q3.n5(var0.getFormat(), var1.z3(), var4);
         y4k.n5(var0.getTextFormat(), var1.m1(), var4);
         if (var1.q0() != null) {
            var0.setNumberFormatLinkedToSource(var1.q0().l6() != 0);
            var0.setNumberFormat(p2i.n5(var1.q0().n5()));
         }

         if (var1.t4() != null) {
            var3.l6(var1.t4().n5());
         } else {
            var0.setTickLabelPosition(3);
         }

         d9.n5(var0.getTitle(), var1.x8(), var4);
         var0.setTitle(var1.x8() != null);
         if (var1.n3() != null) {
            if (var1.n3().k5() != null) {
               a9y.n5(((Axis)var0).k5(), var1.n3().k5(), var4);
            }

            switch (var1.n3().l6()) {
               case 0:
                  var0.setDisplayUnit(0);
                  break;
               case 1:
                  var0.setDisplayUnit(1);
                  break;
               case 2:
                  var0.setDisplayUnit(2);
                  break;
               case 3:
                  var0.setDisplayUnit(3);
                  break;
               case 4:
                  var0.setDisplayUnit(4);
                  break;
               case 5:
                  var0.setDisplayUnit(5);
                  break;
               case 6:
                  var0.setDisplayUnit(6);
                  break;
               case 7:
                  var0.setDisplayUnit(7);
                  break;
               case 8:
                  var0.setDisplayUnit(8);
                  break;
               case 9:
                  var0.setDisplayUnit(9);
                  break;
               case 10:
                  var0.setNumberFormat("0%");
            }
         }
      }
   }

   private static int n5(com.aspose.slides.internal.k4y.t7b var0) {
      switch (var0.n5()) {
         case 1:
            return 1;
         case 2:
            return 3;
         case 3:
            return 0;
         case 4:
            return 2;
         default:
            throw new SerializationException("Not supported element value");
      }
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
            return 3;
         case 1:
            return 1;
         case 2:
            return 4;
         case 3:
            return 2;
         default:
            throw new SerializationException("TickMarkType value");
      }
   }

   private static void n5(IChartLinesFormat var0, com.aspose.slides.internal.k4y.t4e var1, c1x var2) {
      var0.getLine().getFillFormat().setFillType((byte)(var1 == null ? 0 : -1));
      if (var1 != null) {
         com.aspose.slides.internal.k4y.b9y var3 = var1.l6();
         if (var3 != null) {
            i3z.n5(var0.getLine(), var3.t2());
            w5i.n5(var0.getEffect(), var3.s7(), var2.n5().n5());
            ((ChartLinesFormat)var0).n5().n5(var3.y4());
         }
      }
   }

   private static boolean n5(IChartLinesFormat var0) {
      return var0 != null && (!var0.getLine().isFormatNotDefined() || !var0.getEffect().isNoEffects());
   }

   public static void n5(IChartLinesFormat var0, com.aspose.slides.internal.k4y.t4e var1, g6c var2) {
      if (n5(var0)) {
         com.aspose.slides.internal.k4y.b9y var3 = var1.n5();
         i3z.n5(var0.getLine(), new i4$1(var3));
         w5i.n5(var0.getEffect(), new i4$2(var3), var2);
         var3.n5(((ChartLinesFormat)var0).n5().n5());
      }
   }

   public static void n5(IAxis var0, com.aspose.slides.internal.k4y.n3p var1, g6c var2, long var3) {
      if (var0 != null) {
         var1.n5(var3);
         n7 var5 = ((Axis)var0).n5();
         var1.n5(var5.x8());
         var1.n5(!var0.isVisible());
         if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getNumberFormat()))) {
            com.aspose.slides.internal.k4y.n9v var6 = var1.u9();
            var6.n5((byte)(var0.isNumberFormatLinkedToSource() ? 1 : 0));
            var6.n5(var0.getNumberFormat());
         }

         if (var0.hasTitle()) {
            d9.n5(var0.getTitle(), var1.n5(), var2);
         }

         q3.n5(var0.getFormat(), new i4$3(var1), var2);
         y4k.n5(var0.getTextFormat(), new i4$4(var1), var2);
         if (n5(var0.getMajorGridLinesFormat()) || var0.getMajorGridLinesFormat().getLine().getFillFormat().getFillType() == -1) {
            n5(var0.getMajorGridLinesFormat(), var1.k5(), var2);
         }

         if (n5(var0.getMinorGridLinesFormat()) || var0.getMinorGridLinesFormat().getLine().getFillFormat().getFillType() == -1) {
            n5(var0.getMinorGridLinesFormat(), var1.u3(), var2);
         }

         if (var0.getMajorTickMark() != 2) {
            com.aspose.slides.internal.k4y.t7b var7 = new com.aspose.slides.internal.k4y.t7b();
            var7.n5(n5(var0.getMajorTickMark()));
            var7.n5(var5.y4());
            var1.n5(var7);
         }

         if (var0.getMinorTickMark() != 2) {
            com.aspose.slides.internal.k4y.t7b var8 = new com.aspose.slides.internal.k4y.t7b();
            var8.n5(n5(var0.getMinorTickMark()));
            var8.n5(var5.e2());
            var1.n5(var8);
         }

         if (var0.getTickLabelPosition() != 3) {
            var1.a6();
            if (var5.n3() != null) {
               var1.t4().n5(var5.n3());
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.s7().l6(), com.aspose.slides.internal.k4y.t2a.class)) {
            if (var0.getDisplayUnit() != 0) {
               var1.l6();
               a9y.n5(((Axis)var0).k5(), new i4$5(var1), var2);
               switch (var0.getDisplayUnit()) {
                  case 1:
                     var1.n3().n5(1);
                     break;
                  case 2:
                     var1.n3().n5(2);
                     break;
                  case 3:
                     var1.n3().n5(3);
                     break;
                  case 4:
                     var1.n3().n5(4);
                     break;
                  case 5:
                     var1.n3().n5(5);
                     break;
                  case 6:
                     var1.n3().n5(6);
                     break;
                  case 7:
                     var1.n3().n5(7);
                     break;
                  case 8:
                     var1.n3().n5(8);
                     break;
                  case 9:
                     var1.n3().n5(9);
                  case 10:
               }
            }

            com.aspose.slides.internal.k4y.t2a var9 = com.aspose.slides.internal.v6g.k5.n5(var1.s7().l6(), com.aspose.slides.internal.k4y.t2a.class);
            if (!var0.isAutomaticMaxValue()) {
               var9.n5(com.aspose.slides.ms.System.Xml.f4.n5(var0.getMaxValue()));
            }

            if (!var0.isAutomaticMinValue()) {
               var9.l6(com.aspose.slides.ms.System.Xml.f4.n5(var0.getMinValue()));
            }

            if (!var0.isAutomaticMajorUnit()) {
               var9.k5(com.aspose.slides.ms.System.Xml.f4.n5(var0.getMajorUnit()));
            }

            if (!var0.isAutomaticMinorUnit()) {
               var9.u3(com.aspose.slides.ms.System.Xml.f4.n5(var0.getMinorUnit()));
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1.s7().l6(), com.aspose.slides.internal.k4y.b1k.class)) {
            com.aspose.slides.internal.k4y.b1k var10 = com.aspose.slides.internal.v6g.k5.n5(var1.s7().l6(), com.aspose.slides.internal.k4y.b1k.class);
            if (var0.getChart().getChartData().getSeries().size() > 0) {
               var10.n5(com.aspose.slides.ms.System.Xml.f4.n5(var0.getChart().getChartData().getSeries().get_Item(0).getGapWidth() / 100.0F));
            }
         }
      }
   }
}
