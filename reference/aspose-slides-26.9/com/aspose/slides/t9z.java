package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class t9z {
   private ChartDataPoint n5;
   private s7m l6;
   private s7m k5;
   private final g3y u3;
   private p3o a6;
   private f3h u9;
   private static final com.aspose.slides.internal.o9b.c8 h0 = com.aspose.slides.internal.o9b.c8.w4().o8();
   private boolean c8 = true;
   private double t2 = Double.NaN;
   private double s7 = Double.NaN;
   private boolean x8 = false;
   private boolean n3;
   private com.aspose.slides.internal.o9b.c8 y4 = com.aspose.slides.internal.o9b.c8.u3.o8();
   private com.aspose.slides.internal.o9b.c8 e2 = com.aspose.slides.internal.o9b.c8.u3.o8();

   final void n5(boolean var1) {
      if (this.c8 != var1) {
         this.c8 = var1;
         if (this.y4() != null && this.y4().n5() != var1) {
            this.y4().n5(var1);
         }
      }
   }

   t9z(ChartDataPoint var1, g3y var2) {
      this.u3 = var2;
      if (var1 != null) {
         this.n5 = var1;
         if (var2.u9().getErrorBarsXFormat() != null && var2.u9().getErrorBarsXFormat().isVisible()) {
            this.l6 = new s7m(false, this);
         }

         if (var2.u9().getErrorBarsYFormat() != null && var2.u9().getErrorBarsYFormat().isVisible()) {
            this.k5 = new s7m(true, this);
         }

         if (var1.l6() != null) {
            this.a6 = new p3o(var2.t2(), var1.l6(), var2);
         }

         DataLabel var3 = com.aspose.slides.internal.v6g.k5.n5(var1.getLabel(), DataLabel.class);
         if (var3.isVisible()
            || var3.h0() != null && !com.aspose.slides.ms.System.d1.n5(var3.getTextFrameForOverriding().getText())
            || ChartTypeCharacterizer.is3DChart(var2.u9().getType())) {
            this.u9 = new f3h((DataLabel)var1.getLabel(), var2.t2());
         }
      }
   }

   final double n5() {
      if (!com.aspose.slides.ms.System.d2.k5(this.t2)) {
         return this.t2;
      }

      if (this.n5 == null) {
         return 0.0;
      }

      if (this.c8()) {
         return 0.0;
      }

      if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.u3.u9().getType())) {
         if (this.n5.getYValue().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getYValue().getAsLiteralDouble())) {
            return this.n5.getYValue().getAsLiteralDouble();
         } else {
            return this.w1() ? com.aspose.slides.internal.v6g.k5.u3(this.n5.x8().n5(), double.class) : DoubleChartValue.l6(this.n5.getYValue());
         }
      } else if (this.n5.getValue().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getValue().getAsLiteralDouble())) {
         return this.n5.getValue().getAsLiteralDouble();
      } else {
         return this.w1() ? com.aspose.slides.internal.v6g.k5.u3(this.n5.t2().n5(), double.class) : DoubleChartValue.l6(this.n5.getValue());
      }
   }

   final void n5(double var1) {
      this.t2 = var1;
   }

   final double l6() {
      if (!com.aspose.slides.ms.System.d2.k5(this.s7)) {
         return this.s7;
      }

      if (this.n5.getXValue().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getXValue().getAsLiteralDouble())) {
         return this.n5.getXValue().getAsLiteralDouble();
      }

      if (this.w1()) {
         if (this.n5.s7().n5() == null) {
            return Double.NaN;
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(this.n5.s7().n5(), Double.class)
               ? com.aspose.slides.internal.v6g.k5.u3(this.n5.s7().n5(), double.class)
               : Double.NaN;
         }
      } else {
         return this.n5.getXValue().toDouble();
      }
   }

   final void l6(double var1) {
      this.s7 = var1;
   }

   final double k5() {
      if (this.c8()) {
         return 0.0;
      } else if (this.n5.getBubbleSize().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getBubbleSize().getAsLiteralDouble())) {
         return this.n5.getBubbleSize().getAsLiteralDouble();
      } else if (this.w1()) {
         return this.n5.n3().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5.n3().n5(), double.class);
      } else {
         return DoubleChartValue.l6(this.n5.getBubbleSize());
      }
   }

   final String u3() {
      if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.u3.u9().getType())) {
         return this.w1() && !com.aspose.slides.ms.System.d1.n5(this.n5.x8().l6()) ? this.n5.x8().l6() : this.u3.u9().getNumberFormatOfYValues();
      } else {
         return this.w1() && !com.aspose.slides.ms.System.d1.n5(this.n5.t2().l6()) ? this.n5.t2().l6() : this.u3.u9().getNumberFormatOfValues();
      }
   }

   final String a6() {
      if (this.w1()) {
         if (this.s7().getYValue().getDataSourceType() == 0
            && ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.u3.u9().getType())
            && !com.aspose.slides.ms.System.d1.n5(this.s7().x8().l6())) {
            return this.s7().x8().l6();
         }

         if (this.s7().getValue().getDataSourceType() == 0 && !com.aspose.slides.ms.System.d1.n5(this.s7().t2().l6())) {
            return this.s7().t2().l6();
         }
      } else {
         ChartDataCell var1 = null;
         if (this.s7().getYValue().getDataSourceType() == 0 && ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.u3.u9().getType())) {
            var1 = com.aspose.slides.internal.v6g.k5.n5(this.s7().getYValue().getAsCell(), ChartDataCell.class);
         } else if (this.s7().getValue().getDataSourceType() == 0) {
            var1 = com.aspose.slides.internal.v6g.k5.n5(this.s7().getValue().getAsCell(), ChartDataCell.class);
         }

         if (var1 != null && !var1.u3()) {
            return var1.n5(true);
         }
      }

      return this.u3();
   }

   final String u9() {
      return this.u3.u9().getNumberFormatOfXValues();
   }

   final String h0() {
      return this.u3.u9().getNumberFormatOfBubbleSizes();
   }

   final boolean c8() {
      if (this.n5 == null) {
         return this.x8;
      }

      if (ChartTypeCharacterizer.isSeriesUsesValueCoordinate(this.u3.u9().getType())) {
         if (this.n5.getValue().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getValue().getAsLiteralDouble())) {
            return false;
         }

         if (this.w1()) {
            if (this.n5.t2().n5() == null) {
               return true;
            }

            if ("#N/A".equals(this.n5.t2().n5().toString())) {
               this.k5(true);
               return true;
            }

            if (com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.u3(this.n5.t2().n5(), double.class))) {
               return true;
            }
         } else {
            if (this.n5.getValue().getDataSourceType() == 0 && this.n5.getValue().getAsCell() == null) {
               return true;
            }

            if (DoubleChartValue.n5((ISingleCellChartValue)this.n5.getValue())) {
               return true;
            }
         }
      }

      if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.u3.u9().getType())) {
         if (this.n5.getYValue().getDataSourceType() == 2 && !com.aspose.slides.ms.System.d2.k5(this.n5.getYValue().getAsLiteralDouble())) {
            return false;
         }

         if (this.w1()) {
            if (this.n5.x8().n5() == null) {
               return true;
            }

            if ("#N/A".equals(this.n5.x8().n5().toString())) {
               this.k5(true);
               return true;
            }

            if (com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.u3(this.n5.x8().n5(), double.class))) {
               return true;
            }
         } else {
            if (this.n5.getYValue().getDataSourceType() == 0 && this.n5.getYValue().getAsCell() == null
               || this.n5.getXValue().getDataSourceType() == 0 && this.n5.getXValue().getAsCell() == null) {
               return true;
            }

            if (DoubleChartValue.n5((ISingleCellChartValue)this.n5.getYValue()) || DoubleChartValue.n5(this.n5.getXValue())) {
               return true;
            }
         }
      }

      return this.x8;
   }

   final void l6(boolean var1) {
      this.x8 = var1;
   }

   public final boolean t2() {
      return this.n3;
   }

   public final void k5(boolean var1) {
      this.n3 = var1;
   }

   public final ChartDataPoint s7() {
      return this.n5;
   }

   public final s7m x8() {
      return this.l6;
   }

   public final s7m n3() {
      return this.k5;
   }

   public final g3y y4() {
      return this.u3;
   }

   public final p3o e2() {
      return this.a6;
   }

   public final f3h t9() {
      return this.u9;
   }

   final int z1() {
      return this.u3.c8().indexOf(this);
   }

   final int t4() {
      return this.n5.getExplosion() == -1 ? this.u3.u9().getExplosion() : this.n5.getExplosion();
   }

   final boolean q0() {
      return this.n5() < 0.0;
   }

   private com.aspose.slides.internal.o9b.c8 j5() {
      return this.u3.u9().getFormat().getFill().getFillType() == 1 && this.u3.u9().getInvertedSolidFillColor().getColorType() != -1
         ? ((ColorFormat)this.u3.u9().getInvertedSolidFillColor()).u3()
         : h0;
   }

   private boolean w1() {
      return ((ChartData)this.u3.t2().n3().getChartData()).l6().k5() != 2;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      LineFormat var3 = this.z3();
      w5k.n5(var1.u3(), var2.u3(), com.aspose.slides.internal.o9b.c8.u3.o8(), var3, this.u3.t2());
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.z8().o8();
      LineFormat var3 = this.z3();
      if (this.c4() && this.j5().h0() == h0.h0()) {
         com.aspose.slides.internal.o9b.c8.m3().n5(var2);
         var3 = null;
      }

      w5k.n5(var2.o8(), this.y4.o8(), this.u3.t2(), var1.y4(), var3, this.r4(), this.k7(), 1.0F);
      w5k.n5(var2.o8(), this.u3.t2(), var1.y4(), var3, null);
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1) {
      LineFormat var2 = this.z3();
      if (var2 != null) {
         com.aspose.slides.internal.o9b.c8 var3 = (this.u3.u9().getType() == 75 ? com.aspose.slides.internal.o9b.c8.w4() : this.z8()).o8();
         w5k.k5(var3.o8(), this.y4.o8(), this.u3.t2(), var1, var2, this.r4(), this.k7(), 1.0F);
         w5k.n5(var3.o8(), this.u3.t2(), var1, var2, this.k7());
      }
   }

   public final void l6(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.m3().o8();
      FillFormat var3 = this.r4();
      if (this.c4()) {
         if (var3 != null && var3.getFillType() == 3) {
            var3 = this.n5(var3);
         } else {
            this.j5().n5(var2);
            var3 = null;
         }
      }

      w5k.n5(var2.o8(), this.u3.t2(), var1.y4(), var3, this.k7());
   }

   public final boolean k5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();

      try {
         var2.l6(var1.y4());
         return this.l6(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final boolean l6(com.aspose.slides.internal.x4g.s7 var1) {
      IThreeDFormat var2 = this.m1();
      if (var1 != null && var2 != null) {
         n1g var3 = this.y4().t2();
         FillFormat var4 = this.r4();
         LineFormat var5 = this.z3();
         com.aspose.slides.internal.o9b.c8 var6 = this.m3().o8();
         com.aspose.slides.internal.o9b.c8 var7 = (this.u3.u9().getType() == 75 ? com.aspose.slides.internal.o9b.c8.w4() : this.z8()).o8();
         return w5k.n5(var1, var1.s7().y4(), var3, var2, var4, var5, var6.o8(), var7.o8());
      } else {
         return false;
      }
   }

   public final void k5(com.aspose.slides.internal.x4g.s7 var1) {
      this.n5(var1, 1.0F);
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      FillFormat var3 = this.r4();
      IEffectFormat var4 = this.k7();
      w5k.n5(this.m3().o8(), this.u3.t2(), var1, var3, var2, var4);
   }

   public final void n5(k4l var1) {
      n1g var2 = this.u3.t2();
      com.aspose.slides.internal.o9b.y1 var3 = var2.o0().y4();
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

      try {
         var4.l6(var3.y4());
         FillFormat var5 = this.r4();
         a1v var6 = w5k.n5(this.m3().o8(), var5, this.u3.t2(), 1.0F, var4);
         j9e var7 = var2.c8();
         var7.n5(var1, var3.y4(), var6);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, n6u var4) {
      FillFormat var5 = this.r4();
      a1v var6 = w5k.n5(this.m3().o8(), var5, this.u3.t2(), 1.0F, var1);
      n1g var7 = this.u3.t2();
      j9e var8 = var7.c8();
      com.aspose.slides.internal.o9b.y1 var9 = var7.o0().y4();
      var8.n5(var9.y4(), var6, null, var1, var2, var3, var4);
   }

   public final void u3(com.aspose.slides.internal.x4g.s7 var1) {
      FillFormat var2 = this.r4();
      LineFormat var3 = this.z3();
      IEffectFormat var4 = this.k7();
      if (var3 != null && com.aspose.slides.ms.System.d2.k5(var3.getWidth())) {
         w5k.n5(this.m3().o8(), this.u3.t2(), var1, var2, 1.0F, var4);
      } else {
         w5k.n5(this.z8().o8(), this.m3().o8(), this.u3.t2(), var1, var3, var2, var4, 1.0F);
      }
   }

   public final void a6(com.aspose.slides.internal.x4g.s7 var1) {
      IEffectFormat var2 = this.k7();
      if (var2 != null && !var2.isNoEffects()) {
         FillFormat var3 = this.r4();
         LineFormat var4 = this.z3();
         if (var4 == null) {
            throw new NullReferenceException("LineFormat couldn't be empty.");
         }

         if (com.aspose.slides.ms.System.d2.k5(var4.getWidth())) {
            w5k.n5(this.m3().o8(), this.u3.t2(), var1, var3, var2);
         } else {
            w5k.l6(this.z8().o8(), this.m3().o8(), this.u3.t2(), var1, var4, var3, var2, 1.0F);
         }
      }
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.x4g.s7 var2, float var3) {
      FillFormat var4 = this.r4();
      w5k.n5(this.m3().o8(), this.u3.t2(), var1, var2, var4, var3);
   }

   public final void u3(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.m3().o8();
      FillFormat var3 = this.r4();
      if (this.c4()) {
         if (var3 != null && var3.getFillType() == 3) {
            var3 = this.n5(var3);
         } else {
            this.j5().n5(var2);
            var3 = null;
         }
      }

      w5k.l6(var2.o8(), this.u3.t2(), var1.y4(), var3, this.k7());
   }

   public final void u9(com.aspose.slides.internal.x4g.s7 var1) {
      FillFormat var2 = this.r4();
      IEffectFormat var3 = this.k7();
      w5k.n5(this.m3().o8(), this.u3.t2(), var1, var2, var3);
   }

   private FillFormat r4() {
      if (this.n5 == null) {
         return null;
      } else if (this.n5.getFormat().getFill().getFillType() == -1) {
         IFormat var1 = this.n5.u9();
         return this.u3.u9().getFormat().getFill().getFillType() == -1 && var1 != null
            ? (FillFormat)var1.getFill()
            : (FillFormat)this.u3.u9().getFormat().getFill();
      } else {
         return (FillFormat)this.n5.getFormat().getFill();
      }
   }

   final LineFormat z3() {
      if (this.n5 == null) {
         return null;
      } else if (this.n5.getFormat().getLine().getFillFormat().getFillType() == -1) {
         IFormat var1 = this.n5.u9();
         return this.u3.u9().getFormat().getLine().getFillFormat().getFillType() == -1 && var1 != null
            ? (LineFormat)var1.getLine()
            : (LineFormat)this.u3.u9().getFormat().getLine();
      } else {
         return (LineFormat)this.n5.getFormat().getLine();
      }
   }

   final IThreeDFormat m1() {
      if (this.n5 == null) {
         return null;
      }

      if (this.n5.getFormat().getEffect3D().getCamera().getCameraType() == -1) {
         ChartSeries var1 = this.u3.u9();
         if (var1.getFormat().getEffect3D().getCamera().getCameraType() != -1) {
            return var1.getFormat().getEffect3D();
         }

         IFormat var2 = this.n5.u9();
         return var2 != null ? var2.getEffect3D() : var1.getFormat().getEffect3D();
      } else {
         return this.n5.getFormat().getEffect3D();
      }
   }

   final IEffectFormat k7() {
      if (this.n5 == null) {
         return null;
      }

      if (this.n5.getFormat().getEffect().isNoEffects()) {
         ChartSeries var1 = this.u3.u9();
         if (!var1.getFormat().getEffect().isNoEffects()) {
            return var1.getFormat().getEffect();
         } else {
            IEffectFormatEffectiveData var2 = var1.getFormat().getEffect().getEffective();
            if (!var2.isNoEffects()) {
               EffectFormat var4 = new EffectFormat(var1);
               var4.n5(var2);
               return var4;
            } else {
               IFormat var3 = this.n5.u9();
               return var3 != null ? var3.getEffect() : var1.getFormat().getEffect();
            }
         }
      } else {
         return this.n5.getFormat().getEffect();
      }
   }

   private boolean c4() {
      int var1 = this.u3.u9().getType();
      if ((ChartTypeCharacterizer.isChartTypeColumn(var1) || ChartTypeCharacterizer.isChartTypeBar(var1)) && this.q0() && this.s7().getInvertIfNegative()) {
         byte var2 = this.s7().getFormat().getFill().getFillType();
         return var2 != 2 && var2 != 4 && var2 != 0 && this.y4().t2().n3().getStyle() + 1 <= 16;
      } else {
         return false;
      }
   }

   private FillFormat n5(FillFormat var1) {
      FillFormat var2 = new FillFormat(this.s7());
      var2.setFillType((byte)3);
      IPatternFormat var3 = var1.getPatternFormat();
      IPatternFormat var4 = var2.getPatternFormat();
      var4.setPatternStyle(var3.getPatternStyle());
      ((ColorFormat)var4.getForeColor()).copyFrom(var3.getBackColor());
      ((ColorFormat)var4.getBackColor()).copyFrom(var3.getForeColor());
      return var2;
   }

   final com.aspose.slides.internal.o9b.c8 m3() {
      if (com.aspose.slides.internal.o9b.c8.l6(this.y4, com.aspose.slides.internal.o9b.c8.u3)) {
         return this.y4;
      }

      Chart var1 = (Chart)this.u3.u9().getChart();
      int var2 = var1.getStyle() + 1;
      if (!this.u3.u9().isColorVaried()
         || !ChartTypeCharacterizer.isChartTypePie(this.u3.u9().getType())
            && !ChartTypeCharacterizer.isChartTypeDoughnut(this.u3.u9().getType())
            && this.u3.t2().y4().size() != 1) {
         return this.u3.u9().c8();
      }

      int var3 = this.u3.c8().indexOf(this);
      return k3o.n5(var1, var2, this.u3.c8().size())[var3];
   }

   final com.aspose.slides.internal.o9b.c8 z8() {
      if (com.aspose.slides.internal.o9b.c8.l6(this.e2, com.aspose.slides.internal.o9b.c8.u3)) {
         return this.e2;
      } else {
         Chart var1 = (Chart)this.u3.u9().getChart();
         int var2 = var1.getStyle() + 1;
         if (ChartTypeCharacterizer.a6(this.u3.u9().getType())) {
            return this.m3();
         } else if (var2 >= 9 && var2 <= 16) {
            com.aspose.slides.internal.o9b.c8 var7 = var1.n5((byte)1).o8();
            return com.aspose.slides.internal.o9b.c8.n5(255, w5k.n5(var7.o8()).o8());
         } else if (var2 == 33) {
            com.aspose.slides.internal.o9b.c8 var6 = var1.n5((byte)1).o8();
            com.aspose.slides.internal.o9b.c8 var8 = k3o.n5(var6.o8(), 0.925).o8();
            return com.aspose.slides.internal.o9b.c8.n5(255, var8.o8());
         } else if (var2 == 34) {
            com.aspose.slides.internal.o9b.c8 var5 = k3o.l6(this.m3().o8(), 0.5).o8();
            return com.aspose.slides.internal.o9b.c8.n5(255, var5.o8());
         } else if (var2 == 39) {
            return com.aspose.slides.internal.o9b.c8.n5(255, var1.a6()[0].o8());
         } else if (var2 >= 35 && var2 <= 40) {
            int var3 = var2 - 30;
            com.aspose.slides.internal.o9b.c8 var4 = var1.n5((byte)var3).o8();
            k3o.l6(var4.o8(), 0.5).n5(var4);
            return com.aspose.slides.internal.o9b.c8.n5(255, var4.o8());
         } else {
            return com.aspose.slides.internal.o9b.c8.u3;
         }
      }
   }
}
