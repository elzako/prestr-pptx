package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class t6g extends p2n {
   public t6g(t9z var1) {
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
         var1.addItem(this.y4());
      }

      if (var3.getShowValue()) {
         var1.addItem(this.e2());
      }

      String var6 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var6, " "}),(String[])( var1.toArray(new String[0])));
   }

   private String y4() {
      ChartSeries var1 = this.n3().y4().u9();
      n1g var2 = this.n3().y4().t2();
      List var3 = var1.getPlotOnSecondAxis() ? var2.k5() : var2.l6();
      if (this.n3().z1() >= var3.size()) {
         return com.aspose.slides.ms.System.d1.n5;
      }

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
      f7c var4 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), f7c.class);
      ChartSeries var5 = this.n3().y4().u9();
      n1g var6 = this.n3().y4().t2();
      l5 var7 = null;
      if (var4 != null) {
         var7 = ChartTypeCharacterizer.isChartTypeBar(var4.e2().u9().getType()) ? var4.t9().k5.n5() : var4.t9().l6.n5();
      }

      l5 var8 = n5(var5, var6, var7);
      double var9 = this.n3().n5() * (var8 == null ? 1.0 : var8.s3());
      var9 = n5(var9);
      if (!var3) {
         String var13 = var2.getNumberFormat();
         if (f6z.l6.containsItem(var13)) {
            return var8 == null ? t7k.n5(var9, var13, false) : p4.n5(var9, var8);
         } else {
            return n5(var9, var13);
         }
      } else {
         String var11 = this.n3().u3();
         if ("".equals(var11) || f6z.l6.containsItem(var11)) {
            var11 = this.n3().a6();
         }

         return n5(var9, var11);
      }
   }

   private static l5 n5(ChartSeries var0, n1g var1, l5 var2) {
      if (var0 != null && var1 != null) {
         if (var0.getPlotOnSecondAxis()) {
            if (var1.k7() != null) {
               return var1.k7();
            }
         } else if (var1.m1() != null) {
            return var1.m1();
         }
      }

      return var2;
   }

   @Override
   protected com.aspose.slides.internal.o9b.c8 a6() {
      return t7k.n5(this.n3().n5(), this.n3().u3(), this.n3().t9().u9().o8());
   }
}
