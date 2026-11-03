package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class m7a extends a0p {
   private float l6 = Float.NaN;
   private ChartDataPointLevel k5;

   public m7a(ChartDataPointLevel var1, n1g var2) {
      super(new f3h((DataLabel)var1.getLabel(), var2));
      this.k5 = var1;
   }

   @Override
   protected String k5() {
      List var1 = new List();
      DataLabel var2 = (DataLabel)this.k5.getLabel();
      IDataLabelFormat var3 = var2.getDataLabelFormat();
      String var4 = com.aspose.slides.internal.x7n.l6.l6().e2().z3();
      if (var3.getShowSeriesName()) {
         var1.addItem(this.n3());
      }

      if (var3.getShowCategoryName()) {
         var1.addItem(this.y4());
      }

      if (var3.getShowValue() && this.k5.h0().getDataPointLevels().get_Item(0) == this.k5) {
         var1.addItem(this.e2());
      }

      String var5 = this.l6(var4);
      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, " "}),(String[])( var1.toArray(new String[0])));
   }

   private String n3() {
      ChartSeries var1 = this.k5.h0().u3().l6();
      boolean var2 = ((ChartData)var1.getChart().getChartData()).l6().k5() != 2;
      return var2 ? var1.x8() : var1.getName().toString();
   }

   private String y4() {
      return this.k5.u9();
   }

   private String e2() {
      DataLabel var1 = (DataLabel)this.k5.getLabel();
      IDataLabelFormat var2 = var1.getDataLabelFormat();
      ChartData var3 = (ChartData)this.k5.h0().u3().l6().getChart().getChartData();
      double var4 = var3.l6().k5() != 2 ? com.aspose.slides.internal.v6g.k5.u3(this.k5.h0().t4().n5(), double.class) : this.k5.h0().getSizeValue().toDouble();
      String var6 = var2.getNumberFormat();
      if (com.aspose.slides.ms.System.d1.n5(var6) || f6z.l6.containsItem(var6)) {
         var6 = this.k5.h0().u3().l6().u9();
      }

      return n5(var4, var6);
   }

   @Override
   protected void u3(z5 var1) {
      d2k var2 = (com.aspose.slides.ms.System.d1.n5(this.c8()) ? d2k.k5 : this.n5(this.c8(), var1.n5(), var1.l6())).u3();

      for (String var3 = this.c8();
         var2.l6 > var1.l6() && var3.length() > 1;
         this.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var3, "..."}), var1.n5(), var1.l6()).n5(var2)
      ) {
         if (com.aspose.slides.ms.System.d1.u9(var3, ' ', '-').length > 1) {
            if (com.aspose.slides.ms.System.d1.k5(var3, ' ') > com.aspose.slides.ms.System.d1.k5(var3, '-')) {
               var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, com.aspose.slides.ms.System.d1.k5(var3, ' '));
            } else {
               var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, com.aspose.slides.ms.System.d1.k5(var3, '-'));
            }
         } else {
            var3 = com.aspose.slides.ms.System.d1.l6(var3, 0, var3.length() - 1);
         }
      }

      this.n5(var2.u3());
   }

   final float h0() {
      return this.l6;
   }

   final void n5(float var1) {
      this.l6 = var1;
   }

   @Override
   protected float u9() {
      return this.h0();
   }

   public final void n5(double var1) {
      this.n5(var1 < 180.0 ? -((float)var1) + 90.0F : -((float)var1) - 90.0F);
   }
}
