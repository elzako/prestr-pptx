package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class k6r {
   public static void n5(IDataLabelCollection var0, com.aspose.slides.internal.k4y.a4s var1, t5w var2) {
      if (var1 != null) {
         a9t var3 = ((DataLabelCollection)var0).l6();
         if (var1.z1() != null) {
            var0.getDefaultDataLabelFormat().setNumberFormat(var1.z1().n5());
            var0.getDefaultDataLabelFormat().setNumberFormatLinkedToSource(var1.z1().l6() == 1);
         }

         if (var1.t4() != null) {
            k5r.n5(var0.getDefaultDataLabelFormat().getFormat(), var1.t4(), var2);
         }

         if (var1.q0() != null) {
            y4k.n5(var0.getDefaultDataLabelFormat().getTextFormat(), var1.q0(), var2);
         }

         if (var1.z3() != null) {
            ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(var1.z3().n5());
         }

         if (((DocumentProperties)var2.t9().getDocumentProperties()).u9()) {
            var0.getDefaultDataLabelFormat().setShowLegendKey(var1.m1() != null && var1.m1().n5());
            var0.getDefaultDataLabelFormat().setShowValue(var1.k7() != null && var1.k7().n5());
            var0.getDefaultDataLabelFormat().setShowCategoryName(var1.m3() != null && var1.m3().n5());
            var0.getDefaultDataLabelFormat().setShowSeriesName(var1.z8() != null && var1.z8().n5());
         } else {
            var0.getDefaultDataLabelFormat().setShowLegendKey(var1.m1() == null || var1.m1().n5());
            var0.getDefaultDataLabelFormat().setShowValue(var1.k7() == null || var1.k7().n5());
            var0.getDefaultDataLabelFormat().setShowCategoryName(var1.m3() == null || var1.m3().n5());
            var0.getDefaultDataLabelFormat().setShowSeriesName(var1.z8() == null || var1.z8().n5());
         }

         if (var1.j5() != null) {
            var0.getDefaultDataLabelFormat().setShowPercentage(var1.j5().n5());
         }

         if (var1.w1() != null) {
            var0.getDefaultDataLabelFormat().setShowBubbleSize(var1.w1().n5());
         }

         if (var1.c4() != null) {
            var0.getDefaultDataLabelFormat().setShowLeaderLines(var1.c4().n5());
         }

         if (var1.y2() != null) {
            x1f.n5(((DataLabelCollection)var0).getLeaderLinesFormat(), var1.y2(), var2);
         }

         if (var1.r4() != null) {
            var0.getDefaultDataLabelFormat().setSeparator(var1.r4());
         }

         if (var1.y1() != null && ((com.aspose.slides.internal.k4y.c8q)var1.y1().l6()).n5()) {
            var0.hide();
         }

         com.aspose.slides.internal.k4y.c4z var4 = new com.aspose.slides.internal.k4y.c4z(var1.a0());
         var3.n5(var4.h0().toArray(new com.aspose.slides.internal.k4y.z6y[0]));
         if (var4.k5() != null) {
            var0.getDefaultDataLabelFormat().setShowLabelAsDataCallout(true);
            n5v.n5(((DataLabelCollection)var0).u3(), var4.k5(), var2);
         }

         if (var4.n5() != null) {
            var0.getDefaultDataLabelFormat().setShowLeaderLines(var4.n5().n5());
         }

         if (var4.l6() != null) {
            IChartLinesFormat var5 = ((DataLabelCollection)var0).getLeaderLinesFormat();
            i3z.n5(var5.getLine(), var4.l6().t2());
         }

         if (var4.u9() != null) {
            var0.getDefaultDataLabelFormat().setShowLabelValueFromCell(var4.u9().n5());
         }

         if (var1.t9() != null) {
            for (com.aspose.slides.internal.k4y.l9a var8 : var1.t9()) {
               if ((var8.e2().n5() & 4294967295L) <= var0.getParentSeries().getDataPoints().size() - 1) {
                  IDataLabel var9 = var0.getParentSeries().getDataPoints().get_Item((int)var8.e2().n5()).getLabel();
                  a6z.n5(var9, var8, var2);
               }
            }
         }
      }
   }

   public static void n5(IDataLabelCollection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.a4s> var1, g6c var2) {
      if (var1 != null && n5(var0)) {
         com.aspose.slides.internal.k4y.a4s var3 = (com.aspose.slides.internal.k4y.a4s)var1.invoke();
         IDataLabelFormat var4 = var0.getDefaultDataLabelFormat();
         var3.u9().n5(var4.getShowLegendKey());
         var3.h0().n5(var4.getShowValue());
         var3.c8().n5(var4.getShowCategoryName());
         var3.t2().n5(var4.getShowSeriesName());
         var3.s7().n5(var4.getShowPercentage());
         var3.x8().n5(var4.getShowBubbleSize());
         var3.n3().n5(var4.getShowLeaderLines());
         if (ChartTypeCharacterizer.isChartTypePie(((DataLabelCollection)var0).getParentSeries().getType())) {
            x1f.n5(((DataLabelCollection)var0).getLeaderLinesFormat(), var3.y4(), var2);
         }

         if (!"".equals(var4.getSeparator())) {
            var3.l6(var4.getSeparator());
         }

         if (var4.getPosition() != -1) {
            var3.a6().n5(var4.getPosition());
         }

         DataLabelFormat var5 = (DataLabelFormat)var0.getDefaultDataLabelFormat();
         k5r.n5(var5.getFormat(), new k6r$1(var3), var2, null, true);
         y4k.n5(var5.u9(), new k6r$2(var3), var2);
         if (!"".equals(var4.getNumberFormat())) {
            com.aspose.slides.internal.k4y.p6x var6 = var3.l6();
            var6.n5(var4.getNumberFormat());
            var6.n5((byte)(var4.isNumberFormatLinkedToSource() ? 1 : 0));
         }

         if (var3.r4() == null && var3.z3() == null && var3.t4() == null && var3.q0() == null && var3.z1() == null && !var0.isVisible()) {
            com.aspose.slides.internal.k4y.c8q var10 = (com.aspose.slides.internal.k4y.c8q)var3.n5("delete").l6();
            var10.n5(true);
            var3.n5((com.aspose.slides.internal.k4y.c8q)null);
            var3.l6((com.aspose.slides.internal.k4y.c8q)null);
            var3.k5(null);
            var3.u3(null);
            var3.a6(null);
            var3.u9(null);
            var3.h0(null);
         }

         for (int var8 = 0; var8 < var0.getCount(); var8++) {
            a6z.n5(var0.get_Item(var8), new k6r$3(var3), var8 & 4294967295L, var0.getDefaultDataLabelFormat(), var2);
         }

         com.aspose.slides.internal.k4y.c4z var9 = new com.aspose.slides.internal.k4y.c4z(null);
         boolean var11 = false;
         if (!ChartTypeCharacterizer.isChartTypePie(((DataLabelCollection)var0).getParentSeries().getType())
            && var0.getDefaultDataLabelFormat().getShowLeaderLines()) {
            if (var0.getDefaultDataLabelFormat().getShowLeaderLines()) {
               var11 = true;
            }

            var9.n5(new com.aspose.slides.internal.k4y.b9y());
            boolean var7 = !((DataLabelCollection)var0).getLeaderLinesFormat().getLine().isFormatNotDefined();
            if (var7) {
               i3z.n5(((DataLabelCollection)var0).getLeaderLinesFormat().getLine(), new k6r$4(var9));
            }
         }

         com.aspose.slides.internal.k4y.b9y var12 = null;
         if (var0.getDefaultDataLabelFormat().getShowLabelAsDataCallout()) {
            var12 = new com.aspose.slides.internal.k4y.b9y();
            n5v.n5(((DataLabelCollection)var0).u3(), var12, var2);
         }

         var9.n5(var0.getDefaultDataLabelFormat(), var12, var11, ((DataLabelCollection)var0).l6().n5(), var3.e2());
      }
   }

   static boolean n5(IDataLabelCollection var0) {
      boolean var1 = false;
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            IDataLabel var3 = (IDataLabel)var2.next();
            if (a6z.n5(var3, var0.getDefaultDataLabelFormat())) {
               var1 = true;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IDataLabelFormat var7 = var0.getDefaultDataLabelFormat();
      return var1
         || var7.getShowBubbleSize()
         || var7.getShowCategoryName()
         || var7.getShowLegendKey()
         || var7.getShowPercentage()
         || var7.getShowSeriesName()
         || var7.getShowValue()
         || var7.getShowLeaderLines()
         || var7.getShowLabelValueFromCell();
   }
}
