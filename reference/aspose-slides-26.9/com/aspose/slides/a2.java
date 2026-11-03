package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a2 extends a0p {
   private ChartDataPointLevel l6;

   a2(ChartDataPointLevel var1, n1g var2) {
      super(new f3h((DataLabel)var1.getLabel(), var2));
      this.l6 = var1;
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = (DataLabel)this.l6.getLabel();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4 = com.aspose.slides.internal.x7n.l6.l6().e2().z3();
      if (var3.getShowSeriesName()) {
         var1.addItem(this.h0());
      }

      if (var3.getShowCategoryName()) {
         var1.addItem(this.n3());
      }

      String var5 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, " "}),(String[])( var1.toArray(new String[0])));
   }

   private String n3() {
      return this.l6.u9();
   }

   protected final String h0() {
      ChartSeries var1 = this.l6.h0().u3().l6();
      boolean var2 = ((ChartData)var1.getChart().getChartData()).l6().k5() != 2;
      return var2 ? var1.x8() : var1.getName().toString();
   }
}
