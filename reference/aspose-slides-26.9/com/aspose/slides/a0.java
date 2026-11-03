package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a0 extends DomObject<d2> {
   private String n5;
   private DataLabel l6;
   private DataLabel k5;
   private DataLabel u3;
   private DataLabel a6;
   private DataLabel h0;
   private DataLabel c8;
   private double t2 = Double.NaN;
   private double s7 = Double.NaN;
   private double x8 = Double.NaN;
   private double n3 = Double.NaN;
   private double y4 = Double.NaN;
   private double e2 = 0.0;
   private long t9 = 0L;
   private List<IChartDataPoint> z1 = new List<>();
   private List<IChartDataPoint> t4 = new List<>();
   private int q0 = 0;
   private int z3 = 0;
   private Format m1;
   private DataLabel k7;
   private int m3 = 0;
   private boolean z8 = false;
   private double j5;

   a0(d2 var1) {
      super(var1);
   }

   a0(d2 var1, List<IChartDataPoint> var2) {
      super(var1);
      ChartSeries var3 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), ChartSeries.class);
      double[] var4 = new double[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         var4[var5] = var1.n5((IChartDataPoint)var2.get_Item(var5));
      }

      this.s7 = this.n5(var4, 0.25);
      this.t2 = this.n5(var4, 0.5);
      this.x8 = this.n5(var4, 0.75);
      this.t9 = var2.size() & 4294967295L;
      double var6 = this.x8 - this.s7;
      double var8 = this.s7 - 1.5 * var6;
      double var10 = this.x8 + 1.5 * var6;

      for (int var12 = 0; var12 < var2.size(); var12++) {
         double var13 = var1.n5((IChartDataPoint)var2.get_Item(var12));
         if (var13 >= var8) {
            this.y4 = var13;
            break;
         }
      }

      for (int var15 = var2.size() - 1; var15 >= 0; var15--) {
         double var18 = var1.n5((IChartDataPoint)var2.get_Item(var15));
         if (var18 <= var10) {
            this.n3 = var18;
            break;
         }
      }

      for (int var16 = 0; var16 < var2.size(); var16++) {
         this.e2 = this.e2 + var1.n5((IChartDataPoint)var2.get_Item(var16));
      }

      this.e2 = this.e2 / var2.size();
      if (var3.getShowOutlierPoints() || var3.getShowInnerPoints()) {
         for (int var17 = 0; var17 < var2.size(); var17++) {
            double var19 = var1.n5((IChartDataPoint)var2.get_Item(var17));
            if (var3.getShowOutlierPoints() && (var19 < this.y4 || var19 > this.n3)) {
               this.k7().addItem((IChartDataPoint)var2.get_Item(var17));
            }

            if (var3.getShowInnerPoints() && var19 > this.y4 && var19 < this.n3) {
               this.m3().addItem((IChartDataPoint)var2.get_Item(var17));
            }
         }
      }
   }

   public final IDataLabel n5() {
      if (this.l6 == null) {
         this.l6 = new DataLabel(this);
      }

      return this.l6;
   }

   public final IDataLabel l6() {
      if (this.k5 == null) {
         this.k5 = new DataLabel(this);
      }

      return this.k5;
   }

   public final IDataLabel k5() {
      if (this.u3 == null) {
         this.u3 = new DataLabel(this);
      }

      return this.u3;
   }

   public final IDataLabel u3() {
      if (this.a6 == null) {
         this.a6 = new DataLabel(this);
      }

      return this.a6;
   }

   public final IDataLabel a6() {
      if (this.h0 == null) {
         this.h0 = new DataLabel(this);
      }

      return this.h0;
   }

   public final IDataLabel u9() {
      if (this.c8 == null) {
         this.c8 = new DataLabel(this);
      }

      return this.c8;
   }

   public final IDataLabel h0() {
      if (this.k7 == null) {
         this.k7 = new DataLabel(this);
      }

      return this.k7;
   }

   public final IFormat c8() {
      if (this.m1 == null) {
         this.m1 = new Format(this);
      }

      return this.m1;
   }

   final void n5(a0 var1) {
      ((FillFormat)this.c8().getFill()).n5(var1.c8().getFill());
      ((LineFormat)this.c8().getLine()).n5(var1.c8().getLine());
      ((EffectFormat)this.c8().getEffect()).n5(var1.c8().getEffect());
      ((DataLabel)this.h0()).n5(var1.h0());
      ((DataLabel)this.a6()).n5(var1.a6());
      ((DataLabel)this.n5()).n5(var1.n5());
      ((DataLabel)this.k5()).n5(var1.k5());
      ((DataLabel)this.n5()).n5(var1.n5());
      ((DataLabel)this.l6()).n5(var1.l6());
      ((DataLabel)this.u3()).n5(var1.u3());
      ((DataLabel)this.u9()).n5(var1.u9());
   }

   final String t2() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final d2 s7() {
      return this.u9;
   }

   final ChartSeries x8() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(this.u9, r0g.class).getParent_Immediate(), ChartSeries.class);
   }

   final double n3() {
      return this.j5;
   }

   final void n5(double var1) {
      this.j5 = var1;
   }

   private double n5(double[] var1, double var2) {
      com.aspose.slides.ms.System.u3.a6(com.aspose.slides.ms.System.u3.n5((Object)(var1)));
      if (var1.length == 1) {
         return var1[0];
      }

      if (var1.length == 2) {
         double var4 = (var1[0] + var1[1]) / 2.0;
         if (var2 == 0.25) {
            return this.x8().getQuartileMethod() == 0 ? var1[0] : (var1[0] + var4) / 2.0;
         }

         if (var2 == 0.5) {
            return var4;
         }

         if (var2 == 0.75) {
            return this.x8().getQuartileMethod() == 0 ? var1[1] : (var1[1] + var4) / 2.0;
         }
      }

      int var6 = var1.length;
      double var7 = this.x8().getQuartileMethod() == 0 ? (var6 + 1) * var2 : (var6 - 1) * var2 + 1.0;
      if (var7 == 1.0) {
         return var1[0];
      }

      if (var7 == var6) {
         return var1[var6 - 1];
      }

      int var9 = com.aspose.slides.internal.v6g.k5.u3(var7, 14);
      double var10 = var7 - var9;
      return var1[var9 - 1] + var10 * (var1[var9] - var1[var9 - 1]);
   }

   final double y4() {
      return this.k7().size() > 0 && this.u9.n5(this.z1.get_Item(0)) < this.z3() ? this.u9.n5(this.z1.get_Item(0)) : this.z3();
   }

   final double e2() {
      return this.k7().size() > 0 && this.u9.n5(this.z1.get_Item(this.z1.size() - 1)) > this.m1()
         ? this.u9.n5(this.z1.get_Item(this.z1.size() - 1))
         : this.m1();
   }

   final double t9() {
      return this.e2;
   }

   final double z1() {
      return this.t2;
   }

   final double t4() {
      return this.s7;
   }

   final double q0() {
      return this.x8;
   }

   final double z3() {
      return this.y4;
   }

   final double m1() {
      return this.n3;
   }

   final List<IChartDataPoint> k7() {
      return this.z1;
   }

   final List<IChartDataPoint> m3() {
      return this.t4;
   }

   final long z8() {
      return this.t9;
   }

   final int j5() {
      return this.q0;
   }

   final void n5(int var1) {
      this.q0 = var1;
   }
}
