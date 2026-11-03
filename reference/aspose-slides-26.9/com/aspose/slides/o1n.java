package com.aspose.slides;

class o1n extends b4 {
   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.d6z var2) {
      if (var2.n5() == null) {
         var1.setParentLabelLayout(2);
      } else {
         switch (var2.n5().n5()) {
            case 0:
            case 3:
               var1.setParentLabelLayout(2);
               break;
            case 1:
               var1.setParentLabelLayout(1);
               break;
            case 2:
               var1.setParentLabelLayout(0);
         }
      }
   }

   @Override
   void n5(ChartSeries var1, com.aspose.slides.internal.k4y.x1i var2) {
      com.aspose.slides.internal.k4y.d6z var3 = new com.aspose.slides.internal.k4y.d6z();
      com.aspose.slides.internal.k4y.l9e var4 = new com.aspose.slides.internal.k4y.l9e();
      switch (var1.getParentLabelLayout()) {
         case 0:
            var4.n5(2);
            break;
         case 1:
            var4.n5(1);
            break;
         case 2:
            var4.n5(3);
      }

      var3.n5(var4);
      var2.n5(var3);
   }
}
