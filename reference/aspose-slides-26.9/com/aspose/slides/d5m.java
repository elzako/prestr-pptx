package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class d5m extends k3h {
   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3, t5w var4, boolean var5) {
      this.l6(var1, var2, var3);
      com.aspose.slides.internal.k4y.p4t var6 = (com.aspose.slides.internal.k4y.p4t)((com.aspose.slides.internal.k4y.l0u)var2).a6().l6();

      for (com.aspose.slides.internal.k4y.l6j var10 : var6.u3()) {
         ISingleCellChartValue var11 = n5(var1.getDataPoints().getOrCreateDataPointByIdx(var10.n5()), var3);
         ((IStringOrDoubleChartValue)var11).setAsLiteralString(var10.l6());
      }
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.m3 var2) {
      if (var1.getName().getAsLiteralString() != null) {
         com.aspose.slides.internal.k4y.w1c var3 = var2.c8();
         var3.n5(new com.aspose.slides.internal.k4y.g7("v", var1.getName().getAsLiteralString()));
      }
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l0u.class)) {
         this.n5(var1.getDataPoints(), (com.aspose.slides.internal.k4y.p4t)((com.aspose.slides.internal.k4y.l0u)var2).n5("strLit").l6(), var3);
      } else {
         throw new Exception();
      }
   }

   private void n5(IChartDataPointCollection var1, com.aspose.slides.internal.k4y.p4t var2, int var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < var1.size(); var5++) {
         ISingleCellChartValue var6 = n5(var1.get_Item(var5), var3);
         if (com.aspose.slides.internal.v6g.k5.l6(var6, DoubleChartValue.class)) {
            DoubleChartValue var7 = (DoubleChartValue)var6;
            if (!DoubleChartValue.n5(var7, false, false)) {
               com.aspose.slides.internal.k4y.l6j var8 = var2.l6();
               var8.n5(var5 & 4294967295L);
               var8.n5(DoubleChartValue.n5(var7));
               var4++;
            }
         } else {
            StringOrDoubleChartValue var9 = (StringOrDoubleChartValue)var6;
            if (!StringOrDoubleChartValue.n5(var9, false)) {
               com.aspose.slides.internal.k4y.l6j var10 = var2.l6();
               var10.n5(var5 & 4294967295L);
               var10.n5(StringOrDoubleChartValue.n5(var9));
               var4++;
            }
         }
      }

      var2.n5().n5(var4 & 4294967295L);
   }
}
