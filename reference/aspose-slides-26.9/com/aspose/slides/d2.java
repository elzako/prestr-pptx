package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class d2 extends DomObject<ChartSeries> implements IGenericEnumerable<a0> {
   private final List<a0> n5;

   public final a0 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   d2(ChartSeries var1) {
      super(var1);
      this.n5 = new b3h<>(var1.getChart().getChartData());
   }

   final void l6() {
      List var1 = new List<>(this.n5);
      this.n5.clear();
      switch (this.u9.getType()) {
         case 76:
            this.u9();
            break;
         case 77:
            this.u3();
            break;
         case 78:
            this.a6();
            break;
         default:
            throw new InvalidOperationException("Aggregated data points are not supported for this series type.");
      }

      this.n5(var1, this.n5);
   }

   final double n5(IChartDataPoint var1) {
      ChartData var2 = (ChartData)this.k5().getChart().getChartData();
      boolean var3 = var2.l6().k5() != 2;
      if (var3) {
         return ((ChartDataPoint)var1).t2().n5() == null ? Double.NaN : com.aspose.slides.internal.v6g.k5.u3(((ChartDataPoint)var1).t2().n5(), double.class);
      } else {
         return var1.getValue().toDouble();
      }
   }

   private void n5(List<a0> var1, List<a0> var2) {
      int var3 = com.aspose.slides.ms.System.q1.l6(var2.size(), var1.size());

      for (int var4 = 0; var4 < var3; var4++) {
         a0 var5 = (a0)var1.get_Item(var4);
         a0 var6 = (a0)var2.get_Item(var4);
         var6.n5(var5);
      }
   }

   private void u3() {
      ChartSeries var1 = null;

      for (int var2 = 0; var2 < this.u9.getChart().getChartData().getSeries().size(); var2++) {
         if (this.u9.getChart().getChartData().getSeries().get_Item(var2).getType() == 76) {
            var1 = (ChartSeries)this.u9.getChart().getChartData().getSeries().get_Item(var2);
            break;
         }
      }

      if (var1 == null) {
         throw new InvalidOperationException("Owner series for Pareto line series can't be found");
      }

      var1.s7().n3();
      double var3 = 0.0;

      for (int var5 = 0; var5 < var1.s7().n5(); var5++) {
         if (!com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.n5(var1.s7().n5(var5), a0.class).n3())) {
            var3 += com.aspose.slides.internal.v6g.k5.n5(var1.s7().n5(var5), a0.class).n3();
         }
      }

      double var6 = 0.0;

      for (int var8 = 0; var8 < var1.s7().n5(); var8++) {
         if (!com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.n5(var1.s7().n5(var8), a0.class).n3())) {
            var6 += com.aspose.slides.internal.v6g.k5.n5(var1.s7().n5(var8), a0.class).n3();
         }

         a0 var9 = new a0(this);
         if (var3 == 0.0) {
            var3 = 1.0;
         }

         var9.n5(var6 / var3);
         this.n5.addItem(var9);
      }
   }

   private void a6() {
      IChartCategoryCollection var1 = this.u9.getChart().getChartData().getCategories();
      Dictionary var2 = new Dictionary();
      List var3 = new List();

      for (int var4 = 0; var4 < this.u9.getDataPoints().size(); var4++) {
         String var5 = com.aspose.slides.ms.System.d1.n5;
         if (var4 < var1.size() && ((ChartCategory)var1.get_Item(var4)).u3() != null) {
            var5 = ((ChartCategory)var1.get_Item(var4)).u3().toString();
         }

         double var6 = this.n5(this.u9.getDataPoints().get_Item(var4));
         if (var2.containsKey(var5)) {
            if (!com.aspose.slides.ms.System.d2.k5(var6)) {
               ((List)var2.get_Item(var5)).addItem(this.u9.getDataPoints().get_Item(var4));
            }
         } else if (!com.aspose.slides.ms.System.d2.k5(var6)) {
            List var8 = new List();
            var8.addItem(this.u9.getDataPoints().get_Item(var4));
            var2.addItem(var5, var8);
            var3.addItem(var5);
         }
      }

      List$Enumerator var13 = var3.iterator();

      try {
         while (var13.hasNext()) {
            String var14 = (String)var13.next();
            ((List)var2.get_Item(var14)).sort(new d2$1(this));
            a0 var9 = new a0(this, (List<IChartDataPoint>)var2.get_Item(var14));
            this.n5.addItem(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private void u9() {
      switch (this.u9.getChart().getAxes().getHorizontalAxis().getAggregationType()) {
         case 0:
            this.h0();
            break;
         case 1:
            if (this.u9.getChart().getChartData().getCategories().size() > 0) {
               this.h0();
            } else {
               this.t2();
            }
            break;
         case 2:
            this.t2();
            break;
         case 3:
            this.c8();
      }
   }

   private void h0() {
      int var1 = this.u9.getChart().getChartData().getCategories().size();
      if (var1 == 0) {
         a0 var12 = new a0(this);
         var12.n5(com.aspose.slides.ms.System.d1.n5);
         var12.n5(0.0);
         this.n5.addItem(var12);

         for (int var13 = 0; var13 < this.u9.getDataPoints().size(); var13++) {
            var12.n5(var12.n3() + this.n5(this.u9.getDataPoints().get_Item(var13)));
         }
      } else {
         Dictionary var2 = new Dictionary();
         List var3 = new List();

         for (int var4 = 0; var4 < this.u9.getDataPoints().size(); var4++) {
            String var5 = com.aspose.slides.ms.System.d1.n5;
            if (var4 < var1) {
               ChartCategory var6 = (ChartCategory)this.u9.getChart().getChartData().getCategories().get_Item(var4);
               if (var6 != null) {
                  if (var6.k5().n5() > 1 && var6.k5().n5(var6.k5().n5() - 1) != null) {
                     var5 = var6.k5().n5(var6.k5().n5() - 1).toString();
                  } else if (var6.u3() != null) {
                     var5 = var6.u3().toString();
                  }
               }
            }

            double var7 = this.n5(this.u9.getDataPoints().get_Item(var4));
            if (com.aspose.slides.ms.System.d2.k5(var7)) {
               var7 = 0.0;
            }

            if (var2.containsKey(var5)) {
               var2.set_Item(var5, (Double)var2.get_Item(var5) + var7);
            } else {
               var2.addItem(var5, var7);
               var3.addItem(var5);
            }
         }

         List$Enumerator var14 = var3.iterator();

         try {
            while (var14.hasNext()) {
               String var15 = (String)var14.next();
               a0 var16 = new a0(this);
               var16.n5(var15);
               var16.n5((Double)var2.get_Item(var15));
               this.n5.addItem(var16);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }
      }
   }

   private void c8() {
      IAxis var1 = this.u9.getChart().getAxes().getHorizontalAxis();
      double var2 = 0.0;
      double var4 = 0.0;
      double[] var6 = new double[]{0.0};
      double[] var7 = new double[]{0.0};
      this.n5(var6, var7);
      var2 = var6[0];
      var4 = var7[0];
      double var8 = 0.0;
      double var10 = 0.0;
      long var12 = var1.getNumberOfBins();
      if (var1.isOverflowBin() || var1.isUnderflowBin()) {
         for (int var14 = 0; var14 < this.u9.getDataPoints().size(); var14++) {
            if (!var1.isAutomaticOverflowBin() && this.n5(this.u9.getDataPoints().get_Item(var14)) > var1.getOverflowBin()) {
               var8++;
            }

            if (!var1.isAutomaticUnderflowBin() && this.n5(this.u9.getDataPoints().get_Item(var14)) <= var1.getUnderflowBin()) {
               var10++;
            }
         }

         if (var8 > 0.0) {
            var4 = var1.getOverflowBin();
            var12--;
         }

         if (var10 > 0.0) {
            var2 = var1.getUnderflowBin();
            var12--;
         }
      }

      double var15 = (var4 - var2) / (var12 & 4294967295L);
      if (var15 != 0.0) {
         double var17 = var2;

         for (int var19 = 0; var19 < com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((var4 - var2) / var15), 14); var19++) {
            String var20 = com.aspose.slides.ms.System.d1.n5("[{0}, {1}]",new Object[]{ var17, var17 + var15});
            var17 += var15;
            a0 var21 = new a0(this);
            var21.n5(var20);
            var21.n5(0.0);
            this.n5.addItem(var21);
         }

         for (int var28 = 0; var28 < this.u9.getDataPoints().size(); var28++) {
            double var22 = this.n5(this.u9.getDataPoints().get_Item(var28));
            if ((var1.isAutomaticOverflowBin() || !(var22 > var1.getOverflowBin())) && (var1.isAutomaticUnderflowBin() || !(var22 <= var1.getUnderflowBin()))) {
               int var24 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((var22 - var2) / var15), 14);
               if (var24 > 0) {
                  var24--;
               }

               com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var24), a0.class)
                  .n5(com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var24), a0.class).n3() + 1.0);
            }
         }
      }

      if (var8 > 0.0) {
         a0 var25 = new a0(this);
         var25.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"> ", com.aspose.slides.ms.System.d2.u9(var1.getOverflowBin())}));
         var25.n5(var8);
         this.n5.insertItem(this.n5.size(), var25);
      }

      if (var10 > 0.0) {
         a0 var29 = new a0(this);
         var29.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"<= ", com.aspose.slides.ms.System.d2.u9(var1.getUnderflowBin())}));
         var29.n5(var10);
         this.n5.insertItem(0, var29);
      }
   }

   private void t2() {
      IAxis var1 = this.u9.getChart().getAxes().getHorizontalAxis();
      double var2 = this.u9.getChart().getAxes().getHorizontalAxis().getAggregationType() == 1 ? this.x8() : var1.getBinWidth();
      double var4 = 0.0;
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      double[] var12 = new double[]{0.0};
      double[] var13 = new double[]{0.0};
      this.n5(var12, var13);
      var4 = var12[0];
      var6 = var13[0];
      if (var1.isOverflowBin() || var1.isUnderflowBin()) {
         for (int var14 = 0; var14 < this.u9.getDataPoints().size(); var14++) {
            double var15 = this.n5(this.u9.getDataPoints().get_Item(var14));
            if (!var1.isAutomaticOverflowBin() && var15 > var1.getOverflowBin()) {
               var8++;
            }

            if (!var1.isAutomaticUnderflowBin() && var15 <= var1.getUnderflowBin()) {
               var10++;
            }
         }

         if (!var1.isAutomaticOverflowBin() && var1.getOverflowBin() < var6) {
            var6 = var1.getOverflowBin();
         }

         if (!var1.isAutomaticUnderflowBin() && var1.getUnderflowBin() > var4) {
            var4 = var1.getUnderflowBin();
         }
      }

      if (var2 != 0.0) {
         double var17 = var4;

         for (int var19 = 0; var19 < com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((var6 - var4) / var2), 14); var19++) {
            String var20 = com.aspose.slides.ms.System.d1.n5("[{0}, {1}]",new Object[]{ var17, var17 + var2});
            var17 += var2;
            a0 var21 = new a0(this);
            var21.n5(var20);
            this.n5.addItem(var21);
         }

         for (int var29 = 0; var29 < this.u9.getDataPoints().size(); var29++) {
            double var22 = this.n5(this.u9.getDataPoints().get_Item(var29));
            if (!com.aspose.slides.ms.System.d2.k5(var22)
               && (var1.isAutomaticOverflowBin() || !(var22 > var1.getOverflowBin()))
               && (var1.isAutomaticUnderflowBin() || !(var22 <= var1.getUnderflowBin()))) {
               int var24 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((var22 - var4) / var2), 14);
               if (var24 > 0) {
                  var24--;
               }

               this.n5.get_Item(var24).n5(this.n5.get_Item(var24).n3() + 1.0);
            }
         }
      }

      if (var8 > 0.0) {
         a0 var27 = new a0(this);
         var27.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"> ", com.aspose.slides.ms.System.d2.u9(var1.getOverflowBin())}));
         var27.n5(var8);
         this.n5.insertItem(this.n5.size(), var27);
      }

      if (var10 > 0.0) {
         a0 var28 = new a0(this);
         var28.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"<= ", com.aspose.slides.ms.System.d2.u9(var1.getUnderflowBin())}));
         var28.n5(var10);
         this.n5.insertItem(0, var28);
      }
   }

   private double s7() {
      double var1 = 0.0;
      int var3 = this.u9.getDataPoints().size();

      for (int var4 = 0; var4 < var3; var4++) {
         double var5 = this.n5(this.u9.getDataPoints().get_Item(var4));
         if (!com.aspose.slides.ms.System.d2.k5(var5)) {
            var1 += this.n5(this.u9.getDataPoints().get_Item(var4));
         }
      }

      double var7 = var1 / var3;
      double var9 = 0.0;

      for (int var11 = 0; var11 < var3; var11++) {
         double var12 = this.n5(this.u9.getDataPoints().get_Item(var11));
         if (!com.aspose.slides.ms.System.d2.k5(var12)) {
            var9 += com.aspose.slides.ms.System.q1.a6(var12 - var7, 2.0);
         }
      }

      return com.aspose.slides.ms.System.q1.z3(var9 / (var3 - 1));
   }

   private double x8() {
      double var1 = this.s7();
      int var3 = this.u9.getDataPoints().size();
      double var4 = 3.5 * var1 / com.aspose.slides.ms.System.q1.a6(var3, 0.33333334F);
      return com.aspose.slides.ms.System.q1.k5(var4);
   }

   private void n3() {
      for (int var1 = 0; var1 < this.n5.size(); var1++) {
         this.n5.get_Item(var1).n5(var1);
      }

      this.n5.sort(new d2$2(this));
   }

   private void n5(double[] var1, double[] var2) {
      var1[0] = this.n5(this.u9.getDataPoints().get_Item(0));
      if (com.aspose.slides.ms.System.d2.k5(var1[0])) {
         for (int var3 = 0; var3 < this.u9.getDataPoints().size(); var3++) {
            var1[0] = this.n5(this.u9.getDataPoints().get_Item(var3));
            if (!com.aspose.slides.ms.System.d2.k5(var1[0])) {
               break;
            }
         }
      }

      var2[0] = var1[0];
      if (this.u9.getDataPoints().size() > 1) {
         for (int var6 = 1; var6 < this.u9.getDataPoints().size(); var6++) {
            double var4 = this.n5(this.u9.getDataPoints().get_Item(var6));
            if (var4 > var2[0]) {
               var2[0] = var4;
            }

            if (var4 < var1[0]) {
               var1[0] = var4;
            }
         }
      }
   }

   final int n5(a0 var1) {
      return this.n5.indexOf(var1);
   }

   final ChartSeries k5() {
      return this.u9;
   }

   @Override
   public final IGenericEnumerator<a0> iterator() {
      return this.n5.iterator();
   }
}
