package com.aspose.slides;

class s5 extends b4 {
   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.d6z var2) {
      if (var2.l6() != null) {
         var1.setShowInnerPoints(var2.l6().u3() == 1);
         var1.setShowOutlierPoints(var2.l6().a6() == 1);
         var1.setShowMeanLine(var2.l6().l6() == 1);
         var1.setShowMeanMarkers(var2.l6().k5() == 1);
      }

      if (var2.a6() != null) {
         if (var2.a6().n5() == 1) {
            var1.setQuartileMethod(1);
         } else {
            var1.setQuartileMethod(0);
         }
      }
   }

   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.x1i var2) {
      com.aspose.slides.internal.k4y.d6z var3 = new com.aspose.slides.internal.k4y.d6z();
      com.aspose.slides.internal.k4y.x4t var4 = new com.aspose.slides.internal.k4y.x4t();
      var4.l6((byte)(var1.getShowMeanLine() ? 1 : 0));
      var4.u3((byte)(var1.getShowInnerPoints() ? 1 : 0));
      var4.a6((byte)(var1.getShowOutlierPoints() ? 1 : 0));
      var4.k5((byte)(var1.getShowMeanMarkers() ? 1 : 0));
      var3.n5(var4);
      com.aspose.slides.internal.k4y.r0s var5 = new com.aspose.slides.internal.k4y.r0s();
      if (var1.getQuartileMethod() == 1) {
         var5.n5(1);
      } else {
         var5.n5(2);
      }

      var3.n5(var5);
      var2.n5(var3);
   }
}
