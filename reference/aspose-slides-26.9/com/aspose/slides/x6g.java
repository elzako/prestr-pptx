package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class x6g extends b4 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("binSize", "binCount");

   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.d6z var2) {
      if (var1.getChart().getChartData().getSeries().size() <= 1) {
         IAxis var3 = var1.getChart().getAxes().getHorizontalAxis();
         if (com.aspose.slides.internal.v6g.k5.l6(var2.k5().l6(), com.aspose.slides.internal.k4y.d4r.class)) {
            com.aspose.slides.internal.k4y.d4r var4 = (com.aspose.slides.internal.k4y.d4r)var2.k5().l6();
            if (var4.k5() == null) {
               var3.setAggregationType(1);
            } else {
               switch (n5.n5(var4.k5().n5())) {
                  case 0:
                     var3.setBinWidth(com.aspose.slides.internal.v6g.k5.u3(var4.k5().k5(), double.class));
                     var3.setAggregationType(2);
                     break;
                  case 1:
                     var3.setNumberOfBins(com.aspose.slides.internal.v6g.k5.u3(var4.k5().k5(), long.class));
                     var3.setAggregationType(3);
                     break;
                  default:
                     throw new NotImplementedException();
               }
            }

            if (var4.l6() != null) {
               var3.setOverflowBin(true);
               if ("auto".equals(var4.l6())) {
                  var3.setAutomaticOverflowBin(true);
               } else {
                  var3.setAutomaticOverflowBin(false);
                  var3.setOverflowBin(com.aspose.slides.ms.System.Xml.f4.k7(var4.l6()));
               }
            }

            if (var4.n5() != null) {
               var3.setUnderflowBin(true);
               if ("auto".equals(var4.n5())) {
                  var3.setAutomaticUnderflowBin(true);
               } else {
                  var3.setAutomaticUnderflowBin(false);
                  var3.setUnderflowBin(com.aspose.slides.ms.System.Xml.f4.k7(var4.n5()));
               }
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2.k5().l6(), com.aspose.slides.internal.k4y.p2h.class)) {
            var3.setAggregationType(0);
         }
      }
   }

   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.x1i var2) {
      IAxis var3 = var1.getChart().getAxes().getHorizontalAxis();
      com.aspose.slides.internal.k4y.d6z var4 = new com.aspose.slides.internal.k4y.d6z();
      com.aspose.slides.internal.k4y.d4r var5 = null;
      switch (var3.getAggregationType()) {
         case 0:
            var4.n5("aggregation");
            break;
         case 1:
            var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5("binning").l6(), com.aspose.slides.internal.k4y.d4r.class);
            break;
         case 2:
            var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5("binning").l6(), com.aspose.slides.internal.k4y.d4r.class);
            var5.n5("binSize").n5(var3.getBinWidth());
            break;
         case 3:
            var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5("binning").l6(), com.aspose.slides.internal.k4y.d4r.class);
            var5.n5("binCount").n5(var3.getNumberOfBins());
      }

      if (var5 != null) {
         var5.n5(2);
         if (var3.isOverflowBin()) {
            var5.k5(var3.isAutomaticOverflowBin() ? "auto" : com.aspose.slides.ms.System.Xml.f4.n5(var3.getOverflowBin()));
         }

         if (var3.isUnderflowBin()) {
            var5.l6(var3.isAutomaticUnderflowBin() ? "auto" : com.aspose.slides.ms.System.Xml.f4.n5(var3.getUnderflowBin()));
         }
      }

      var2.n5(var4);
   }
}
