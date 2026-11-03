package com.aspose.slides;

class h5c extends b4 {
   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.d6z var2) {
      if (var2.l6() != null) {
         var1.setShowConnectorLines(var2.l6().n5() == 1);
      }

      if (var2.u9() != null) {
         for (int var3 = 0; var3 < var2.u9().n5().length; var3++) {
            long var4 = var2.u9().n5()[var3];
            if ((var4 & 4294967295L) < var1.getDataPoints().size()) {
               com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints().get_Item((int)var4), ChartDataPoint.class).setSetAsTotal(true);
            }
         }
      }
   }

   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.x1i var2) {
      com.aspose.slides.internal.k4y.d6z var3 = new com.aspose.slides.internal.k4y.d6z();
      if (!var1.getShowConnectorLines()) {
         com.aspose.slides.internal.k4y.x4t var4 = new com.aspose.slides.internal.k4y.x4t();
         var4.n5((byte)0);
         var3.n5(var4);
      }

      com.aspose.slides.internal.k4y.k1i var6 = new com.aspose.slides.internal.k4y.k1i();

      for (int var5 = 0; var5 < var1.getDataPoints().size(); var5++) {
         if (com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints().get_Item(var5), ChartDataPoint.class).getSetAsTotal()) {
            var6.n5(var5 & 4294967295L);
         }
      }

      if (var6.n5().length > 0) {
         var3.n5(var6);
      }

      var2.n5(var3);
   }
}
