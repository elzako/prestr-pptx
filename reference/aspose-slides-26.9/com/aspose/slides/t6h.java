package com.aspose.slides;

final class t6h {
   private double n5;
   private byte l6;
   private float[] k5;
   private byte u3;
   private byte a6;
   private byte u9;
   private byte h0;
   private float c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;
   private byte y4;
   private byte e2;
   private LineFillFormat t9;
   private SketchFormat z1;
   private com.aspose.slides.ms.System.o5<Boolean> t4 = new com.aspose.slides.ms.System.o5<>();
   private long q0;

   t6h(LineFillFormat var1, SketchFormat var2) {
      this.t9 = var1;
      this.z1 = var2;
      this.n5 = Double.NaN;
      this.l6 = -1;
      this.k5 = null;
      this.u3 = -1;
      this.a6 = -1;
      this.u9 = -1;
      this.h0 = -1;
      this.c8 = Float.NaN;
      this.t2 = -1;
      this.s7 = -1;
      this.x8 = -1;
      this.n3 = -1;
      this.y4 = -1;
      this.e2 = -1;
   }

   public final boolean n5() {
      return this.t9.getFillType() == -1
         && this.z1.getSketchType() == -1
         && com.aspose.slides.ms.System.d2.k5(this.n5)
         && this.u9 == -1
         && this.a6 == -1
         && this.h0 == -1
         && this.u3 == -1
         && this.l6 == -1
         && com.aspose.slides.ms.System.n1.k5(this.c8)
         && this.t2 == -1
         && this.y4 == -1
         && this.x8 == -1
         && this.s7 == -1
         && this.e2 == -1
         && this.n3 == -1;
   }

   public final double l6() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = com.aspose.slides.internal.n8e.v4.n5(var1, 0.0, 4096.0);
      this.z3();
   }

   public final byte k5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
      this.z3();
   }

   public final float[] u3() {
      return this.k5;
   }

   public final void n5(float[] var1) {
      this.k5 = var1;
      if (var1 != null) {
         this.l6 = 11;
      }

      this.z3();
   }

   public final byte a6() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
      this.z3();
   }

   public final byte u9() {
      return this.a6;
   }

   public final void k5(byte var1) {
      this.a6 = var1;
      this.z3();
   }

   public final byte h0() {
      return this.u9;
   }

   public final void u3(byte var1) {
      this.u9 = var1;
      this.z3();
   }

   public final byte c8() {
      return this.h0;
   }

   public final void a6(byte var1) {
      this.h0 = var1;
      this.z3();
   }

   public final float t2() {
      return this.c8;
   }

   public final void n5(float var1) {
      this.c8 = var1;
      this.z3();
   }

   public final byte s7() {
      return this.t2;
   }

   public final void u9(byte var1) {
      this.t2 = var1;
      this.z3();
   }

   public final byte x8() {
      return this.s7;
   }

   public final void h0(byte var1) {
      this.s7 = var1;
      this.z3();
   }

   public final byte n3() {
      return this.x8;
   }

   public final void c8(byte var1) {
      this.x8 = var1;
      this.z3();
   }

   public final byte y4() {
      return this.n3;
   }

   public final void t2(byte var1) {
      this.n3 = var1;
      this.z3();
   }

   public final byte e2() {
      return this.y4;
   }

   public final void s7(byte var1) {
      this.y4 = var1;
      this.z3();
   }

   public final byte t9() {
      return this.e2;
   }

   public final void x8(byte var1) {
      this.e2 = var1;
      this.z3();
   }

   public final boolean n5(LineFormat var1) {
      return var1 == null
         ? false
         : this.t9.equals(var1.getFillFormat())
            && this.z1.equals(var1.getSketchFormat())
            && com.aspose.slides.internal.n8e.v4.n5(this.n5, var1.getWidth())
            && this.u9 == var1.getAlignment()
            && this.a6 == var1.getStyle()
            && this.h0 == var1.getJoinStyle()
            && this.u3 == var1.getCapStyle()
            && com.aspose.slides.internal.n8e.v4.n5(this.c8, var1.getMiterLimit())
            && this.t2 == var1.getBeginArrowheadStyle()
            && this.y4 == var1.getBeginArrowheadLength()
            && this.x8 == var1.getBeginArrowheadWidth()
            && this.s7 == var1.getEndArrowheadStyle()
            && this.e2 == var1.getEndArrowheadLength()
            && this.n3 == var1.getEndArrowheadWidth()
            && this.l6 == var1.getDashStyle();
   }

   @Override
   public final boolean equals(Object lineFormat) {
      if (lineFormat == null) {
         return false;
      }

      LineFormat var2 = com.aspose.slides.internal.v6g.k5.n5(lineFormat, LineFormat.class);
      return var2 == null ? false : this.n5((LineFormat)lineFormat);
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.internal.n2d.q0.n5(
         this.n5, this.l6, this.u3, this.a6, this.u9, this.h0, this.c8, this.t2, this.s7, this.x8, this.n3, this.y4, this.e2
      );
      return var1 + com.aspose.slides.internal.n2d.q0.n5(this.k5);
   }

   final boolean z1() {
      if (this.t9.a6()) {
         return true;
      }

      if (!this.t4.l6()) {
         this.t4 = new com.aspose.slides.ms.System.o5<>(false);
      }

      return this.t4.n5();
   }

   final void t4() {
      if (!this.t9.u9()
         || !this.z1.u9()
         || !com.aspose.slides.internal.n8e.v4.n5(this.n5, Double.NaN)
         || this.u9 != -1
         || this.a6 != -1
         || this.h0 != -1
         || this.u3 != -1
         || !com.aspose.slides.internal.n8e.v4.n5(this.c8, Float.NaN)
         || this.t2 != -1
         || this.y4 != -1
         || this.x8 != -1
         || this.s7 != -1
         || this.e2 != -1
         || this.n3 != -1
         || this.l6 != -1) {
         this.l6 = -1;
         this.n5 = Double.NaN;
         this.u3 = -1;
         this.a6 = -1;
         this.u9 = -1;
         this.h0 = -1;
         this.c8 = Float.NaN;
         this.t2 = -1;
         this.s7 = -1;
         this.x8 = -1;
         this.n3 = -1;
         this.y4 = -1;
         this.e2 = -1;
         this.k5 = null;
         this.t9.h0();
         this.z1.h0();
         this.z3();
      }
   }

   final void l6(LineFormat var1) {
      if (!this.n5(var1)) {
         this.k5(var1);
         this.z3();
      }
   }

   final void k5(LineFormat var1) {
      this.l6 = var1.getDashStyle();
      this.n5 = var1.getWidth();
      this.u3 = var1.getCapStyle();
      this.a6 = var1.getStyle();
      this.u9 = var1.getAlignment();
      this.h0 = var1.getJoinStyle();
      this.c8 = var1.getMiterLimit();
      this.t2 = var1.getBeginArrowheadStyle();
      this.s7 = var1.getEndArrowheadStyle();
      this.x8 = var1.getBeginArrowheadWidth();
      this.n3 = var1.getEndArrowheadWidth();
      this.y4 = var1.getBeginArrowheadLength();
      this.e2 = var1.getEndArrowheadLength();
      this.k5 = var1.getCustomDashPattern();
      this.t9.n5(var1.getFillFormat());
      this.z1.n5(var1.getSketchFormat());
   }

   final void n5(ILineFormatEffectiveData var1) {
      this.l6 = var1.getDashStyle();
      this.n5 = var1.getWidth();
      this.u3 = var1.getCapStyle();
      this.a6 = var1.getStyle();
      this.u9 = var1.getAlignment();
      this.h0 = var1.getJoinStyle();
      this.c8 = var1.getMiterLimit();
      this.t2 = var1.getBeginArrowheadStyle();
      this.s7 = var1.getEndArrowheadStyle();
      this.x8 = var1.getBeginArrowheadWidth();
      this.n3 = var1.getEndArrowheadWidth();
      this.y4 = var1.getBeginArrowheadLength();
      this.e2 = var1.getEndArrowheadLength();
      this.k5 = var1.getCustomDashPattern();
      if (var1.getFillFormat().getFillType() != -1) {
         this.t9.n5(var1.getFillFormat());
      }

      if (var1.getSketchFormat().getSketchType() != -1) {
         this.z1.n5(var1.getSketchFormat());
      }

      this.z3();
   }

   final long q0() {
      return ((this.q0 & 4294967295L) + (this.t9.getVersion() & 4294967295L) & 4294967295L) + (this.z1.getVersion() & 4294967295L) & 4294967295L;
   }

   private void z3() {
      this.q0++;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "LineFormat: ", com.aspose.slides.ms.System.s3.n5(LineStyle.class, this.a6), ", width ", com.aspose.slides.ms.System.d2.u9(this.n5)
      );
   }
}
