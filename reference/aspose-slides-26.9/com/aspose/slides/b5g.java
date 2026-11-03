package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class b5g extends p2n {
   public b5g(t9z var1) {
      super(var1);
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = this.n3().t9().l6();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4 = com.aspose.slides.internal.x7n.l6.l6().e2().z3();
      if (var3.getShowLabelValueFromCell()) {
         ChartData var5 = (ChartData)var2.getChart().getChartData();
         if (var5.l6().k5() == 2) {
            var1.addItem(var2.getValueFromCell().getValue().toString());
         } else {
            var1.addItem(var2.n5());
         }
      }

      if (var3.getShowSeriesName()) {
         var1.addItem(this.h0());
      }

      if (var3.getShowCategoryName()) {
         var1.addItem(this.e2());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.t4());
      }

      if (ChartTypeCharacterizer.isChartTypeBubble(this.n3().y4().u9().getType()) && var3.getShowBubbleSize()) {
         var1.addItem(this.y4());
      }

      String var6 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var6, " "}),(String[])( var1.toArray(new String[0])));
   }

   private String y4() {
      DataLabel var1 = this.n3().t9().l6();
      double var2 = this.n3().k5();
      return n5(var2, this.n3().h0());
   }

   private String e2() {
      DataLabel var1 = this.n3().t9().l6();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      boolean var3 = var2.isNumberFormatLinkedToSource() || var2.getShowPercentage();
      f7c var4 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), f7c.class);
      l5 var5 = var4.t9().k5.n5();
      double var6 = this.n3().l6();
      if (!"General".equals(this.n3().u9())) {
         return n5(var6, this.n3().u9());
      }

      if (var3) {
         return n5(var6, this.n3().a6());
      }

      String var8 = var2.getNumberFormat();
      return f6z.l6.containsItem(var8) ? p4.n5(var6, var5) : n5(var6, var8);
   }

   private String t4() {
      DataLabel var1 = this.n3().t9().l6();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      boolean var3 = var2.isNumberFormatLinkedToSource() || var2.getShowPercentage();
      f7c var4 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), f7c.class);
      l5 var5 = var4.t9().l6.n5();
      double var6 = this.n3().n5();
      if (!"General".equals(this.n3().u3())) {
         return n5(var6, this.n3().u3());
      }

      if (var3) {
         return n5(var6, this.n3().a6());
      }

      String var8 = var2.getNumberFormat();
      return f6z.l6.containsItem(var8) ? p4.n5(var6, var5) : n5(var6, var8);
   }
}
