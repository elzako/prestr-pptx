package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class y6 {
   private static final String[] n5 = new String[]{
      "%", "h(?![^\"]*\")", "m(?![^\"]*\")(?![,\\d])", "s(?![^\"]*\")", "e\\+", "°", "k?g\\b", "\\bw\\b", "hz", "px|dpi|bps"
   };
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("crosses", "crossesAt", "custUnit", "builtInUnit");

   public static void n5(IAxis var0, com.aspose.slides.internal.k4y.c8 var1, c1x var2) {
      if (var1 != null) {
         t5w var3 = var2.n5().n5();
         n5(var0, var1, var3);
         if (var1.l6().h0() != null) {
            var0.setAutomaticMaxValue(false);
            var0.setMaxValue(var1.l6().h0().n5());
         }

         if (var1.l6().c8() != null) {
            var0.setAutomaticMinValue(false);
            var0.setMinValue(var1.l6().c8().n5());
         }

         if (var1.l6().a6() != null) {
            var0.setLogarithmic(true);
            var0.setLogBase(var1.l6().a6().n5());
         }

         if (var1.l6().u9() != null) {
            var0.setPlotOrderReversed(var1.l6().u9().n5() == 1);
         }

         if (((DocumentProperties)var3.t9().getDocumentProperties()).u9()) {
            var0.setVisible(var1.k5() == null || !var1.k5().n5());
         } else {
            var0.setVisible(var1.k5() != null && !var1.k5().n5());
         }

         var0.setPosition(var1.a6().n5());
         x1f.n5(var0.getMajorGridLinesFormat(), var1.u9(), var3);
         x1f.n5(var0.getMinorGridLinesFormat(), var1.c8(), var3);
         q9u.n5(var0.getTitle(), var1.s7(), var3);
         var0.setTitle(var1.s7() != null);
         if (var1.n3() != null) {
            var0.setNumberFormatLinkedToSource(var1.n3().l6() != 0);
            var0.setNumberFormat(p2i.n5(var1.n3().n5()));
            if (((Axis)var0).k5().k5()) {
               ((Axis)var0).k5().n5(n5(var0.getNumberFormat()));
            }
         }

         if (var1.e2() != null) {
            var0.setMajorTickMark(var1.e2().n5());
         }

         if (var1.z1() != null) {
            var0.setMinorTickMark(var1.z1().n5());
         }

         if (var1.q0() != null) {
            var0.setTickLabelPosition(var1.q0().n5());
         }

         if (var1.y1() != null) {
            var0.setLabelOffset(var1.y1().n5());
         }

         q3.n5(var0.getFormat(), var1.m1(), var3);
         y4k.n5(var0.getTextFormat(), var1.m3(), var3);
         com.aspose.slides.internal.k4y.w4c var4 = var2.k5();
         ((Axis)var0).n5().u3(var1.j5().n5());
         n5(var0, var1.j5().n5(), var4);
         if (var1.aH_() != null) {
            var0.setBaseUnitScale(var1.aH_().n5());
            ((Axis)var0).n5(false);
         }

         if (var1.b3() != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5e.class) && var0.getCategoryAxisType() == 0) {
               var0.setAutomaticTickLabelSpacing(var1.b3().n5() == 0.0);
               var0.setTickLabelSpacing(com.aspose.slides.internal.v6g.k5.a6(var1.b3().n5(), 14));
            } else {
               var0.setAutomaticMajorUnit(var1.b3().n5() == 0.0);
               var0.setMajorUnit(var1.b3().n5());
            }
         }

         if (var1.z7() != null) {
            var0.setMajorUnitScale(var1.z7().n5());
         }

         if (var1.u6() != null) {
            var0.setAutomaticMinorUnit(var1.u6().n5() == 0.0);
            var0.setMinorUnit(var1.u6().n5());
         }

         if (var1.a5() != null) {
            var0.setMinorUnitScale(var1.a5().n5());
         }

         if (var1.d2() != null) {
            var0.setTickLabelSpacing(var1.d2().n5() & 65535);
            var0.setAutomaticTickLabelSpacing(false);
         }

         if (var1.d5() != null) {
            var0.setTickMarksSpacing(var1.d5().n5() & 65535);
            var0.setAutomaticTickMarksSpacing(false);
         }

         if (!var0.isAutomaticMinorUnit()
            && !var0.isAutomaticMajorUnit()
            && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5e.class)
            && var0.getMinorUnit() > var0.getMajorUnit()
            && var0.getMajorUnitScale() == var0.getMinorUnitScale()) {
            var0.setMajorUnitScale(var0.getMinorUnitScale() != 1 && var0.getMinorUnitScale() != 0 ? 3 : 2);
         }
      }
   }

   static void n5(IAxis var0, int var1, com.aspose.slides.internal.k4y.w4c var2) {
      List$Enumerator var3 = var2.u9().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            com.aspose.slides.internal.k4y.c8 var5 = (com.aspose.slides.internal.k4y.c8)var4.l6();
            if (var5.n5().n5() == var1 && var5.w1() != null) {
               switch (l6.n5(var5.w1().n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.n6h var6 = (com.aspose.slides.internal.k4y.n6h)var5.w1().l6();
                     var0.setCrossType(var6.n5());
                     if (var0.getCrossType() == 2 && !var0.isAutomaticMinValue() && !com.aspose.slides.ms.System.d2.k5(var0.getMinValue())) {
                        var0.setCrossAt((float)var0.getMinValue());
                     }
                     break;
                  case 1:
                     com.aspose.slides.internal.k4y.x8w var7 = (com.aspose.slides.internal.k4y.x8w)var5.w1().l6();
                     var0.setCrossType(2);
                     var0.setCrossAt((float)var7.n5());
                     break;
                  default:
                     throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var5.w1().n5(), "\""}));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(IAxis var0, com.aspose.slides.internal.k4y.c8 var1, t5w var2) {
      n7 var3 = ((Axis)var0).n5();
      if (var1.a3() != null && var1.a3().l6() != null) {
         switch (l6.n5(var1.a3().l6().n5())) {
            case 2:
               com.aspose.slides.internal.k4y.x8w var4 = (com.aspose.slides.internal.k4y.x8w)var1.a3().l6().l6();
               var0.setDisplayUnit(10);
               var3.n5(var4.n5());
               break;
            case 3:
               com.aspose.slides.internal.k4y.l3a var5 = (com.aspose.slides.internal.k4y.l3a)var1.a3().l6().l6();
               var0.setDisplayUnit(var5.n5());
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.a3().l6().n5(), "\""}));
         }

         b1m.n5(((Axis)var0).k5(), var1.a3().k5(), var2);
         var3.k5(var1.a3().u3());
      }

      var3.l6(var1.l6().t2());
      if (var1.r4() != null) {
         var3.l6(var1.r4().n5());
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.a0q.class)) {
         var0.setCategoryAxisType(0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5e.class)) {
         var0.setCategoryAxisType(1);
         var0.setCategoryAxisTypeAutomatically();
      }

      if (var1.c4() != null) {
         var3.n5(var1.c4().n5());
      }

      if (var1.s3() != null) {
         var3.n5(var1.s3().n5());
      }

      if (var1.aJ_() != null) {
         var3.l6(var1.aJ_().n5());
      }

      var3.k5(var1.n5().n5());
      var3.n5(var1.f2());
   }

   private static boolean n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return true;
      }

      for (String var4 : n5) {
         if (com.aspose.slides.internal.r7c.c8.u3(var0, var4)) {
            return false;
         }
      }

      return true;
   }

   public static void n5(IAxis var0, com.aspose.slides.internal.k4y.c8 var1, g6c var2) {
      if (var0 != null) {
         var1.l6().l6().n5(var0.isPlotOrderReversed() ? 1 : 2);
         if (!var0.isAutomaticMaxValue()) {
            var1.l6().k5().n5(var0.getMaxValue());
         }

         if (!var0.isAutomaticMinValue()) {
            var1.l6().u3().n5(var0.getMinValue());
         }

         if (var0.isLogarithmic()) {
            var1.l6().n5().n5(var0.getLogBase());
         }

         var1.u3().n5(!var0.isVisible());
         var1.a6().n5(var0.getPosition());
         if (var0.getShowMajorGridLines()) {
            x1f.n5(var0.getMajorGridLinesFormat(), var1.h0(), var2);
         }

         if (var0.getShowMinorGridLines()) {
            x1f.n5(var0.getMinorGridLinesFormat(), var1.t2(), var2);
         }

         if (var0.hasTitle()) {
            q9u.n5(var0.getTitle(), var1.x8(), var2);
         }

         if (!"".equals(com.aspose.slides.ms.System.d1.l6(var0.getNumberFormat()))) {
            com.aspose.slides.internal.k4y.p6x var3 = var1.y4();
            var3.n5((byte)(var0.isNumberFormatLinkedToSource() ? 1 : 0));
            var3.n5(var0.getNumberFormat());
         }

         if (var0.getMajorTickMark() != 0) {
            var1.t9().n5(var0.getMajorTickMark());
         }

         if (var0.getMinorTickMark() != 0) {
            var1.t4().n5(var0.getMinorTickMark());
         }

         if (var0.getTickLabelPosition() != 2) {
            var1.z3().n5(var0.getTickLabelPosition());
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.j9.class) && !var0.isAutomaticTickLabelSpacing()) {
            com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.j9.class).i1().n5((int)(var0.getTickLabelSpacing() & 65535L));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.j9.class) && !var0.isAutomaticTickMarksSpacing()) {
            com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.j9.class).e5().n5((int)(var0.getTickMarksSpacing() & 65535L));
         }

         q3.n5(var0.getFormat(), new y6$1(var1), var2);
         y4k.n5(var0.getTextFormat(), new y6$2(var1), var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5e.class)) {
            com.aspose.slides.internal.k4y.c5e var4 = (com.aspose.slides.internal.k4y.c5e)var1;
            if (!var0.isAutomaticMajorUnit()) {
               if (var0.getMajorUnitScale() != 0) {
                  var4.v4().n5(var0.getMajorUnitScale());
               }

               var4.o0().n5(var0.getMajorUnit());
            }

            if (!var0.isAutomaticMinorUnit()) {
               if (var0.getMinorUnitScale() != 0) {
                  var4.h2().n5(var0.getMinorUnitScale());
               }

               var4.t1().n5(var0.getMinorUnit());
            }

            if (var0.getBaseUnitScale() != 0) {
               var4.aI_().n5(var0.getBaseUnitScale());
            }

            var4.a0().n5(var0.getLabelOffset());
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.a0q.class)) {
            com.aspose.slides.internal.k4y.a0q var5 = (com.aspose.slides.internal.k4y.a0q)var1;
            var5.a0().n5(var0.getLabelOffset());
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.f5n.class)) {
            com.aspose.slides.internal.k4y.f5n var6 = (com.aspose.slides.internal.k4y.f5n)var1;
            if (!var0.isAutomaticMajorUnit()) {
               var6.o0().n5(var0.getMajorUnit());
            }

            if (!var0.isAutomaticMinorUnit()) {
               var6.t1().n5(var0.getMinorUnit());
            }
         }

         l6(var0, var1, var2);
      }
   }

   private static void l6(IAxis var0, com.aspose.slides.internal.k4y.c8 var1, g6c var2) {
      n7 var3 = ((Axis)var0).n5();
      var1.j5().n5(var3.t2());
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.f5n.class)) {
         com.aspose.slides.internal.k4y.f5n var4 = (com.aspose.slides.internal.k4y.f5n)var1;
         if (var0.getDisplayUnit() != 0) {
            var4.p3();
            if (var0.getDisplayUnit() == 10) {
               com.aspose.slides.internal.k4y.x8w var5 = (com.aspose.slides.internal.k4y.x8w)var4.a3().n5("custUnit").l6();
               var5.n5(var3.n5());
            } else {
               com.aspose.slides.internal.k4y.l3a var7 = (com.aspose.slides.internal.k4y.l3a)var4.a3().n5("builtInUnit").l6();
               var7.n5(var0.getDisplayUnit());
            }

            b1m.n5(((Axis)var0).k5(), new y6$3(var4), var2);
            var4.a3().n5(var3.u3());
         }

         if (var3.h0() != -1) {
            var4.f0().n5(var3.h0());
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.a0q.class)) {
         com.aspose.slides.internal.k4y.a0q var6 = (com.aspose.slides.internal.k4y.a0q)var1;
         if (var3.a6() != -1) {
            var6.y2().n5(var3.a6());
         }

         var6.p8().n5(var3.u9());
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c5e.class)
         && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.q2c.class)) {
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.v4.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.v4.class).v0().n5(var3.s7());
         var1.r4().n5(false);
      }

      var1.n5().n5(var3.c8());
      var1.l6().n5(var3.k5());
      var1.n5(var3.l6());
   }
}
