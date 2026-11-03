package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class h5f extends k3h {
   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3, t5w var4, boolean var5) {
      throw new NotImplementedException();
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.m3 var2) {
      if (var1.getName().getAsCells().getCount() != 0) {
         com.aspose.slides.internal.k4y.w1c var3 = var2.c8();
         com.aspose.slides.internal.k4y.c9q var4 = (com.aspose.slides.internal.k4y.c9q)var3.n5("strRef").l6();
         var4.n5(var1.getName().getCellsAddressInWorkbook());
         com.aspose.slides.internal.k4y.p4t var5 = var4.n5();
         IChartCellCollection var6 = var1.getName().getAsCells();
         var5.n5().n5(var6.getCount() & 4294967295L);

         for (int var7 = 0; var7 < var6.getCount(); var7++) {
            if (var6.get_Item(var7).getValue() != null) {
               com.aspose.slides.internal.k4y.l6j var8 = var5.l6();
               var8.n5(var7 & 4294967295L);
               var8.n5(com.aspose.slides.ms.System.z3.t9(var6.get_Item(var7).getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            }
         }
      }
   }

   @Override
   boolean n5(IChartSeries var1, int var2) {
      IGenericEnumerator var3 = var1.getDataPoints().iterator();

      try {
         while (var3.hasNext()) {
            IChartDataPoint var4 = (IChartDataPoint)var3.next();
            ISingleCellChartValue var5 = n5(var4, var2);
            if (var5.getAsCell() != null) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return false;
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3) {
      IChartData var4 = var1.getChart().getChartData();
      IChartCellCollection var5 = var4.getChartDataWorkbook().getCellCollection("", true);
      IGenericEnumerator var6 = var1.getDataPoints().iterator();

      try {
         while (var6.hasNext()) {
            IChartDataPoint var7 = (IChartDataPoint)var6.next();
            ISingleCellChartValue var8 = n5(var7, var3);
            if (var8.getAsCell() != null) {
               var5.add(var8.getAsCell());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l0u.class)) {
         if (this.l6(var1, var3)) {
            this.n5(var1, var5, (com.aspose.slides.internal.k4y.z3o)((com.aspose.slides.internal.k4y.l0u)var2).n5("numRef").l6(), var3);
         } else {
            this.n5(var5, (com.aspose.slides.internal.k4y.c9q)((com.aspose.slides.internal.k4y.l0u)var2).n5("strRef").l6());
         }
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l6s.class)) {
            throw new Exception();
         }

         this.n5(var1, var5, (com.aspose.slides.internal.k4y.z3o)((com.aspose.slides.internal.k4y.l6s)var2).n5("numRef").l6(), var3);
      }
   }

   private void n5(IChartSeries var1, IChartCellCollection var2, com.aspose.slides.internal.k4y.z3o var3, int var4) {
      var3.n5(var2.getCellsAddress());
      com.aspose.slides.internal.k4y.a8e var5 = var3.n5();
      if (var1.getNumberFormatOfValues() != null) {
         switch (var4) {
            case 0:
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfXValues()))) {
                  var5.n5(var1.getNumberFormatOfXValues());
               }
               break;
            case 1:
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfYValues()))) {
                  var5.n5(var1.getNumberFormatOfYValues());
               }
            case 2:
            default:
               break;
            case 3:
               if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfValues()))) {
                  var5.n5(var1.getNumberFormatOfValues());
               }
         }
      }

      if (var2.getCount() > 0 && !"".equals(com.aspose.slides.ms.System.d1.l6(var2.get_Item(0).getCustomNumberFormat()))) {
         var5.n5(var2.get_Item(0).getCustomNumberFormat());
      }

      long var6 = var2.getCount() & 4294967295L;

      for (int var8 = 0; var8 < var2.getCount(); var8++) {
         ChartDataCell var9 = (ChartDataCell)var2.get_Item(var8);
         if (var9.t2().z1().n5 != null) {
            com.aspose.slides.internal.k4y.o8r var10 = var5.l6();
            var10.n5(var8 & 4294967295L);
            if (((var10.n5() & 4294967295L) + 1L & 4294967295L) > (var6 & 4294967295L)) {
               var6 = (var10.n5() & 4294967295L) + 1L & 4294967295L;
            }

            String var11 = com.aspose.slides.ms.System.z3.t9(var9.t2().z1().n5, com.aspose.slides.internal.x7n.l6.k5());
            double var12 = 0.0;
            double[] var14 = new double[]{0.0};
            boolean var15 = n5(var11, var14);
            var12 = var14[0];
            if (var15) {
               var10.l6(var11);
            } else {
               var10.l6("0");
            }

            if (var1.getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource() && !var9.u3()) {
               String var16 = var9.n5(false);
               if (!com.aspose.slides.ms.System.d1.a6(var5.k5(), var16)) {
                  var10.n5(var16);
               }
            }
         }
      }

      var5.n5().n5(var6);
   }

   private void n5(IChartCellCollection var1, com.aspose.slides.internal.k4y.c9q var2) {
      var2.n5(var1.getCellsAddress());
      com.aspose.slides.internal.k4y.p4t var3 = var2.n5();
      long var4 = 0L;

      for (int var6 = 0; var6 < var1.getCount(); var6++) {
         if (var1.get_Item(var6).getValue() != null) {
            com.aspose.slides.internal.k4y.l6j var7 = var3.l6();
            var7.n5(var6 & 4294967295L);
            var7.n5(com.aspose.slides.ms.System.z3.t9(var1.get_Item(var6).getValue(), com.aspose.slides.internal.x7n.l6.k5()));
            if (((var7.n5() & 4294967295L) + 1L & 4294967295L) > (var4 & 4294967295L)) {
               var4 = (var7.n5() & 4294967295L) + 1L & 4294967295L;
            }
         }
      }

      var3.n5().n5(var4);
   }

   private boolean l6(IChartSeries var1, int var2) {
      boolean var3 = true;

      for (int var4 = 0; var4 < var1.getDataPoints().size(); var4++) {
         ISingleCellChartValue var5 = n5(var1.getDataPoints().get_Item(var4), var2);
         if (!DoubleChartValue.n5(var5) && !StringOrDoubleChartValue.n5(var5)) {
            double var6 = 0.0;
            double[] var8 = new double[]{0.0};
            var3 &= n5(com.aspose.slides.ms.System.z3.t9(var5.getAsCell().getValue(), com.aspose.slides.internal.x7n.l6.k5()), var8);
            var6 = var8[0];
         }
      }

      return var3;
   }
}
