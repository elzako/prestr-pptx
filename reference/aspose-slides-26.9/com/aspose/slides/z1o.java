package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z1o extends p2n {
   public z1o(t9z var1) {
      super(var1);
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = this.n3().t9().l6();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4 = com.aspose.slides.internal.x7n.l6.l6().e2().z3();
      if (var3.getShowSeriesName()) {
         var1.addItem(this.h0());
      }

      if (var3.getShowCategoryName()) {
         var1.addItem(this.y4());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.e2());
      }

      String var5 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, " "}),(String[])( var1.toArray(new String[0])));
   }

   private String y4() {
      ChartSeries var1 = this.n3().y4().u9();
      n1g var2 = this.n3().y4().t2();
      List var3 = var1.getPlotOnSecondAxis() ? var2.k5() : var2.l6();
      x4 var4 = (x4)var3.get_Item(this.n3().z1());
      DataLabel var5 = this.n3().t9().l6();
      IDataLabelFormat var6 = var5.getDataLabelFormat();
      String var7 = var6.getNumberFormat();
      if (!f6z.l6.containsItem(var7) && !com.aspose.slides.ms.System.d1.n5(var7)) {
         return n5(var4.l6(), var7);
      }

      l5 var8 = var1.getPlotOnSecondAxis() ? var2.z3() : var2.q0();
      return p4.n5(var4.l6(), var8);
   }

   private String e2() {
      DataLabel var1 = this.n3().t9().l6();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      boolean var3 = var2.isNumberFormatLinkedToSource() || var2.getShowPercentage();
      double var4 = this.n3().n5();
      if (!var3) {
         String var7 = var2.getNumberFormat();
         return n5(var4, var7);
      }

      String var6 = this.n3().u3();
      if ("".equals(var6) || f6z.l6.containsItem(var6)) {
         var6 = this.n3().a6();
      }

      return n5(var4, var6);
   }
}
