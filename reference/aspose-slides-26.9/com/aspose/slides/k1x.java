package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class k1x extends p2n {
   public k1x(t9z var1) {
      super(var1);
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = this.n3().t9().l6();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4;
      if ((var3.getShowSeriesName() || !var3.getShowCategoryName() || !var3.getShowPercentage())
         && (
            !var3.getShowPercentage()
               || !var3.getShowValue()
               || var2.c8().getLabels().getDefaultDataLabelFormat().getShowValue()
               || !var2.c8().getLabels().getDefaultDataLabelFormat().getShowPercentage()
         )) {
         var4 = ", ";
      } else {
         var4 = "\n";
      }

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
         var1.addItem(this.y4());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.e2());
      }

      if (var3.getShowPercentage()) {
         var1.addItem(this.t4());
      }

      String var6 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(var6,(String[])( var1.toArray(new String[0])));
   }

   private String y4() {
      g4j var1 = com.aspose.slides.internal.v6g.k5.n5(((u5w)this.y1()).m3(), g4j.class);
      if (this.n3().z1() >= 0 && (var1 == null || !var1.z1())) {
         ChartSeries var2 = this.n3().y4().u9();
         n1g var3 = this.n3().y4().t2();
         List var4 = var2.getPlotOnSecondAxis() ? var3.k5() : var3.l6();
         if (this.n3().z1() < var4.size()) {
            x4 var5 = (x4)var4.get_Item(this.n3().z1());
            return n5(var5.l6(), var5.u9());
         } else {
            return com.aspose.slides.ms.System.a3.l6(this.n3().z1() + 1);
         }
      } else {
         return "Other";
      }
   }

   private String e2() {
      DataLabel var1 = this.n3().t9().l6();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      boolean var3 = var2.isNumberFormatLinkedToSource();
      if (var2.getShowPercentage()) {
         var3 = true;
      }

      double var4 = this.n3().n5();
      if (!var3) {
         String var7 = var2.getShowPercentage() ? "" : var2.getNumberFormat();
         return n5(this.n3().n5(), var7);
      }

      String var6 = this.n3().u3();
      if ("".equals(var6) || f6z.l6.containsItem(var6)) {
         var6 = this.n3().a6();
      }

      return n5(var4, var6);
   }

   private String t4() {
      DataLabel var1 = this.n3().t9().l6();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      String var3 = "";
      if (!var2.isNumberFormatLinkedToSource()) {
         var3 = var2.getNumberFormat();
      }

      if (com.aspose.slides.ms.System.d1.n5(var3) || f6z.l6.containsItem(var3) || "#,##0".equals(var3)) {
         var3 = "0%";
      }

      double var4 = ((u5w)this.y1()).m3().t2();
      return n5(var4, var3);
   }

   @Override
   protected void u3(z5 var1) {
      if (com.aspose.slides.ms.System.d1.n5(this.c8())) {
         this.k5(0.0F);
         this.u3(0.0F);
      } else if (!com.aspose.slides.ms.System.n1.k5(this.x8().getWidth()) && !com.aspose.slides.ms.System.n1.k5(this.x8().getHeight())) {
         Chart var2 = this.y2().u3().n3();
         float var3 = var2.getWidth() * this.x8().getWidth();
         float var4 = var2.getHeight() * this.x8().getHeight();
         this.n5(this.c8(), var3, var4, false);
         this.n5(new d2k(var3, var4));
      } else {
         this.n5((com.aspose.slides.ms.System.d1.n5(this.c8()) ? d2k.k5 : this.n5(this.c8(), var1.n5(), var1.l6())).u3());
      }
   }
}
