package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class l5 {
   private b9y s7;
   private Axis x8;
   private boolean n3 = true;
   private boolean y4;
   private int e2;
   private boolean t9 = true;
   private boolean z1 = true;
   private double t4;
   private double q0;
   private int z3 = 1;
   private boolean m1 = true;
   private int k7 = 1;
   private v4y m3;
   private com.aspose.slides.internal.o9b.n3 z8;
   private final n1g j5;
   float n5 = 0.0F;
   float l6 = 0.0F;
   float k5 = 0.0F;
   float u3 = 0.0F;
   float a6 = 0.0F;
   float u9 = 0.0F;
   List<Object> h0 = new List<>();
   int c8 = 0;
   boolean t2 = true;
   private boolean w1;
   private com.aspose.slides.internal.o9b.p8 r4 = new com.aspose.slides.internal.o9b.p8();
   private int c4;
   private int y2;
   private int y1;
   private float a0;
   private double d2;
   private double d5;
   private int s3;
   private int p8;

   l5(Axis var1, n1g var2, int var3) {
      this.j5 = var2;
      if (var1 != null) {
         this.e2 = var3;
         this.x8 = var1;
         if (var1.hasTitle()) {
            this.s7 = new b9y((ChartTitle)var1.getTitle(), var2, false);
         }

         TextFrameFormat var4 = (TextFrameFormat)var1.getTextFormat().getTextBlockFormat();
         float var5 = var4.getRotationAngle();
         if (!com.aspose.slides.ms.System.n1.k5(var5) && var5 != -1000.0F) {
            this.n3 = false;
            this.n5(com.aspose.slides.internal.v6g.k5.u3(((TextFrameFormat)var1.getTextFormat().getTextBlockFormat()).getRotationAngle(), 13) * -1);
         }

         switch (var4.y1()) {
            case 1:
            case 3:
            case 4:
            case 5:
               this.n3 = false;
               this.n5(true);
               break;
            case 2:
               this.n3 = false;
               this.n5(true);
               this.n5(this.u9() + 270);
         }

         this.k5(var1.getLabelOffset() & 65535);
         if ("".equals(var1.getNumberFormat()) && "General".equals(var1.getNumberFormat()) || var1.isNumberFormatLinkedToSource()) {
            this.y4 = true;
         }

         this.n5(var1.getCrossAt());
         this.u3(var1.getMinValue());
         this.a6(var1.getMaxValue());
         this.u3(var1.getMajorUnitScale());
         this.a6(var1.getMinorUnitScale());
         if (!var1.isAutomaticMajorUnit()) {
            if (var1.isLogarithmic() && var1.getMajorUnit() < var1.getLogBase()) {
               this.k5(true);
            } else {
               this.k5(false);
               this.h0(var1.getMajorUnit());
            }
         }

         if (!var1.isAutomaticMinorUnit()) {
            this.u3(false);
            this.u9(var1.getMinorUnit());
         }

         this.u9((int)var1.getTickLabelSpacing());
         this.a6(var1.isAutomaticTickLabelSpacing());
         this.m3 = new v4y(this);
      }
   }

   public final boolean n5() {
      return this.w1;
   }

   public final void n5(boolean var1) {
      this.w1 = var1;
   }

   public final com.aspose.slides.internal.o9b.n3 l6() {
      if (this.z8 == null) {
         this.z8 = this.j5.n3().n5(this.x8.getTextFormat());
      }

      return this.z8;
   }

   public final com.aspose.slides.internal.o9b.n3 k5() {
      float var1 = this.l6().c8() * 0.75F / w5k.n5();
      return com.aspose.slides.internal.o9b.n3.n5(this.l6().l6(), var1, this.l6().x8());
   }

   public final com.aspose.slides.internal.o9b.c8 u3() {
      Chart var1 = this.j5.n3();
      com.aspose.slides.internal.o9b.c8 var2 = var1.n5((byte)(var1.getStyle() + 1 > 40 ? 1 : 0)).o8();
      return this.x8 != null && this.x8.isVisible() && this.x8.getTickLabelPosition() != 3 ? var1.n5(this.x8.getTextFormat(), var2.o8()) : var2;
   }

   public final com.aspose.slides.internal.o9b.p8 a6() {
      return this.r4.u3();
   }

   public final void n5(com.aspose.slides.internal.o9b.p8 var1) {
      this.r4 = var1.u3();
   }

   public final int u9() {
      return this.c4;
   }

   public final void n5(int var1) {
      this.c4 = var1;
   }

   final b9y h0() {
      return this.s7;
   }

   final Axis c8() {
      return this.x8;
   }

   final boolean t2() {
      return this.n3;
   }

   final void l6(boolean var1) {
      this.n3 = var1;
   }

   final int s7() {
      return this.y2;
   }

   final void l6(int var1) {
      this.y2 = var1;
   }

   public final int x8() {
      return this.y1;
   }

   public final void k5(int var1) {
      this.y1 = var1;
   }

   public final boolean n3() {
      return this.y4;
   }

   public final int y4() {
      return this.e2;
   }

   final double n5(double var1) {
      return com.aspose.slides.ms.System.q1.n5((double)(var1), (double)(this.c8().getLogBase()));
   }

   final double l6(double var1) {
      return com.aspose.slides.ms.System.q1.a6(this.c8().getLogBase(), var1);
   }

   final double e2() {
      return this.c8().isLogarithmic() ? this.n5(this.z3()) : this.z3();
   }

   final double t9() {
      return this.c8().isLogarithmic() ? this.n5(this.q0()) : this.q0();
   }

   final double z1() {
      return this.c8().isLogarithmic() ? this.n5((double)this.t4()) : this.t4();
   }

   final double k5(double var1) {
      if (var1 > this.e2()) {
         var1 = this.e2();
      }

      if (var1 < this.t9()) {
         var1 = this.t9();
      }

      return var1;
   }

   final float t4() {
      return this.a0;
   }

   final void n5(float var1) {
      this.a0 = var1;
   }

   final double q0() {
      return this.d2;
   }

   final void u3(double var1) {
      this.d2 = var1;
   }

   final double z3() {
      return this.d5;
   }

   final void a6(double var1) {
      this.d5 = var1;
   }

   final int m1() {
      return this.s3;
   }

   final void u3(int var1) {
      this.s3 = var1;
   }

   final int k7() {
      return this.p8;
   }

   final void a6(int var1) {
      this.p8 = var1;
   }

   public final boolean m3() {
      return this.t9;
   }

   public final void k5(boolean var1) {
      this.t9 = var1;
   }

   public final boolean z8() {
      return this.z1;
   }

   public final void u3(boolean var1) {
      this.z1 = var1;
   }

   public final double j5() {
      return this.t4;
   }

   public final void u9(double var1) {
      this.t4 = var1;
      this.u3(false);
   }

   public final double w1() {
      return this.q0;
   }

   public final void h0(double var1) {
      this.q0 = var1;
      if (var1 > 0.0) {
         this.t9 = false;
      }
   }

   public final int r4() {
      return this.z3;
   }

   public final void u9(int var1) {
      if (var1 > 0) {
         this.z3 = var1;
      }
   }

   public final boolean c4() {
      return this.m1;
   }

   public final void a6(boolean var1) {
      this.m1 = var1;
   }

   public final int y2() {
      return this.k7;
   }

   final v4y y1() {
      return this.m3;
   }

   public final boolean a0() {
      boolean var1 = this.y4() == 0
         && this.j5.n3().getChartData().getCategories() != null
         && this.j5.n3().getChartData().getCategories().getGroupingLevelCount() > 1;
      return this.c8() != null && !var1 ? this.c8().getAxisBetweenCategories() : true;
   }

   public final n1g d2() {
      return this.j5;
   }

   final int h0(int var1) {
      int var2;
      if (!this.a0() && !this.d2().n3().hasDataTable()) {
         var2 = p4.n5(
            var1,
            com.aspose.slides.internal.v6g.k5.u3(this.z3(), 14),
            com.aspose.slides.internal.v6g.k5.u3(this.q0(), 14),
            com.aspose.slides.internal.v6g.k5.u3(this.z3(), 14),
            false
         );
         if (var2 == 0) {
            var2 = 1;
         }
      } else {
         var2 = p4.n5(
               var1,
               com.aspose.slides.internal.v6g.k5.u3(this.z3(), 14),
               com.aspose.slides.internal.v6g.k5.u3(this.q0(), 14),
               com.aspose.slides.internal.v6g.k5.u3(this.z3(), 14),
               false
            )
            + 1;
      }

      return var2;
   }

   final int d5() {
      return this.h0(this.c8().getBaseUnitScale());
   }

   static int n5(l5 var0, int var1) {
      int var2;
      if (!var0.a0() && !var0.d2().n3().hasDataTable()) {
         var2 = var1 - 1;
         if (var2 == 0) {
            var2 = 1;
         }
      } else {
         var2 = var1;
      }

      return var2;
   }

   final double s3() {
      if (this.c8().getDisplayUnit() == 10) {
         return 1.0 / this.c8().n5().n5();
      }

      if (this.c8().getDisplayUnit() == 9) {
         return 1.0E-12;
      }

      int var3 = this.c8().getDisplayUnit() == 0 ? 0 : this.c8().getDisplayUnit() + 1;
      return com.aspose.slides.ms.System.q1.a6(10.0, -var3);
   }

   public final void n5(float var1, float var2, float var3, float var4) {
      com.aspose.slides.internal.o9b.c8 var5 = this.p8().o8();
      LineFormat var6 = (LineFormat)this.c8().getFormat().getLine();
      LineFormat var7 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().c4().l6().getLine(), LineFormat.class);
      l6v var8 = w5k.n5(var5.o8(), var6, this.j5, 1.0F, var7);
      if (this.e2 != 0 && this.e2 != 1) {
         var8.a6(this.c8().getFormat().getLine().getBeginArrowheadStyle());
         var8.u3(this.c8().getFormat().getLine().getEndArrowheadStyle());
      } else {
         var8.a6(this.c8().getFormat().getLine().getEndArrowheadStyle());
         var8.u3(this.c8().getFormat().getLine().getBeginArrowheadStyle());
      }

      com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();

      try {
         var9.n5(new com.aspose.slides.internal.o9b.w1(var1, var2), new com.aspose.slides.internal.o9b.w1(var3, var4));
         com.aspose.slides.internal.x4g.s7 var10 = (com.aspose.slides.internal.x4g.s7)var9.deepClone();
         this.j5.d2().n5(var10, var8, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public final void l6(float var1, float var2, float var3, float var4) {
      com.aspose.slides.internal.o9b.c8 var5 = this.p8().o8();
      LineFormat var6 = (LineFormat)this.c8().getMajorGridLinesFormat().getLine();
      LineFormat var7 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().m1().l6().getLine(), LineFormat.class);
      l6v var8 = w5k.n5(var5.o8(), var6, this.j5, 1.0F, var7);
      var8.k5((byte)2);
      com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();

      try {
         var9.n5(new com.aspose.slides.internal.o9b.w1(var1, var2), new com.aspose.slides.internal.o9b.w1(var3, var4));
         com.aspose.slides.internal.x4g.s7 var10 = (com.aspose.slides.internal.x4g.s7)var9.deepClone();
         this.j5.d2().n5(var10, var8, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public final void k5(float var1, float var2, float var3, float var4) {
      double var5 = this.j5.n3().getStyle() + 1 <= 40 ? 0.5 : 0.9;
      com.aspose.slides.internal.o9b.c8 var7 = this.c8(var5).o8();
      LineFormat var8 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().k7().l6().getLine(), LineFormat.class);
      LineFormat var9 = (LineFormat)this.c8().getMinorGridLinesFormat().getLine();
      w5k.n5(new com.aspose.slides.internal.o9b.w1(var1, var2), new com.aspose.slides.internal.o9b.w1(var3, var4), var7.o8(), var9, this.j5, var8);
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3) {
      com.aspose.slides.internal.o9b.c8 var4 = this.p8().o8();
      LineFormat var5 = (LineFormat)this.c8().getFormat().getLine();
      LineFormat var6 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().c4().l6().getLine(), LineFormat.class);
      l6v var7 = w5k.n5(var4.o8(), var5, this.j5, 1.0F, var6);
      if (this.e2 != 0 && this.e2 != 1) {
         var7.a6(this.c8().getFormat().getLine().getBeginArrowheadStyle());
         var7.u3(this.c8().getFormat().getLine().getEndArrowheadStyle());
      } else {
         var7.a6(this.c8().getFormat().getLine().getEndArrowheadStyle());
         var7.u3(this.c8().getFormat().getLine().getBeginArrowheadStyle());
      }

      com.aspose.slides.internal.o9b.y1 var8 = this.j5.o0().y4();
      com.aspose.slides.internal.x4g.s7 var9 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

      try {
         if (this.j5.n3().getRotation3D().getRightAngleAxes()) {
            var1.s7().a6(var8);
         }

         j9e var10 = this.j5.c8();
         var10.n5(var8.y4(), null, var7, var9, var2, var3);
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public final void l6(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3) {
      com.aspose.slides.internal.o9b.c8 var4 = this.p8().o8();
      LineFormat var5 = (LineFormat)this.c8().getMajorGridLinesFormat().getLine();
      LineFormat var6 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().m1().l6().getLine(), LineFormat.class);
      l6v var7 = w5k.n5(var4.o8(), var5, this.j5, 1.0F, var6);
      var7.k5((byte)2);
      j9e var8 = this.j5.c8();
      com.aspose.slides.internal.o9b.y1 var9 = this.j5.o0().y4();
      if (this.j5.n3().getRotation3D().getRightAngleAxes()) {
         var1.s7().a6(var9);
      }

      var8.n5(var9.y4(), null, var7, var1, var2, var3);
   }

   public final void k5(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3) {
      double var4 = this.j5.n3().getStyle() + 1 <= 40 ? 0.5 : 0.9;
      com.aspose.slides.internal.o9b.c8 var6 = this.c8(var4).o8();
      LineFormat var7 = (LineFormat)this.c8().getMinorGridLinesFormat().getLine();
      LineFormat var8 = com.aspose.slides.internal.v6g.k5.n5(this.j5.n3().t9().k7().l6().getLine(), LineFormat.class);
      l6v var9 = w5k.n5(var6.o8(), var7, this.j5, 1.0F, var8);
      j9e var10 = this.j5.c8();
      com.aspose.slides.internal.o9b.y1 var11 = this.j5.o0().y4();
      if (this.j5.n3().getRotation3D().getRightAngleAxes()) {
         var1.s7().a6(var11);
      }

      var10.n5(var11.y4(), null, var9, var1, var2, var3);
   }

   private com.aspose.slides.internal.o9b.c8 p8() {
      return this.n5(0.75, (byte)0);
   }

   private com.aspose.slides.internal.o9b.c8 c8(double var1) {
      return this.n5(var1, (byte)0);
   }

   private com.aspose.slides.internal.o9b.c8 n5(double var1, byte var3) {
      Chart var4 = this.j5.n3();
      com.aspose.slides.internal.o9b.c8 var5 = var4.n5(var3).o8();
      w5k.n5(var5.o8(), var1).n5(var5);
      return com.aspose.slides.internal.o9b.c8.n5(255, var5.o8());
   }
}
