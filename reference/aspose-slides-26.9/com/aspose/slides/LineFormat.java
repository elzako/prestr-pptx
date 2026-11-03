package com.aspose.slides;

public final class LineFormat extends PVIObject implements ILineFormat {
   private u5x u3;
   final com.aspose.slides.internal.v6g.n5<u5x> n5 = new LineFormat$1(this);
   private s7n a6;
   final com.aspose.slides.internal.v6g.n5<s7n> l6 = new LineFormat$2(this);
   static final com.aspose.slides.internal.f3.a6<LineFormat, t8r, t8r> k5 = new LineFormat$6();
   private LineFillFormat u9;
   private SketchFormat h0;
   private t8r c8;

   LineFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u9 = new LineFillFormat(this);
      this.u9.n5.l6(new LineFormat$3(this));
      this.u9.l6.l6(new LineFormat$4(this));
      this.h0 = new SketchFormat(this);
      this.h0.n5.l6(new LineFormat$5(this));
   }

   @Override
   Object M_() {
      return new t6h(this.u9, this.h0);
   }

   final t6h l6() {
      return (t6h)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().q0();
   }

   @Override
   public boolean equals(Object obj) {
      LineFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, LineFormat.class);
      if (var2 == null) {
         return false;
      } else if (this.z3()) {
         return this.l6().n5(var2);
      } else {
         return var2.z3() ? var2.l6().n5(this) : true;
      }
   }

   @Override
   public final boolean isFormatNotDefined() {
      return !this.z3() || this.l6().n5();
   }

   @Override
   public final ILineFillFormat getFillFormat() {
      this.m3();
      return this.u9;
   }

   @Override
   public final ISketchFormat getSketchFormat() {
      this.m3();
      return this.h0;
   }

   @Override
   public final double getWidth() {
      return this.z3() ? this.l6().l6() : Double.NaN;
   }

   @Override
   public final void setWidth(double value) {
      this.n5(Double.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final byte getDashStyle() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setDashStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final float[] getCustomDashPattern() {
      return this.z3() ? this.l6().u3() : null;
   }

   @Override
   public final void setCustomDashPattern(float[] value) {
      this.n5((Object)null, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final byte getCapStyle() {
      return this.z3() ? this.l6().a6() : -1;
   }

   @Override
   public final void setCapStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.s7();
      }
   }

   @Override
   public final byte getStyle() {
      return this.z3() ? this.l6().u9() : -1;
   }

   @Override
   public final void setStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().k5(value);
         this.s7();
      }
   }

   @Override
   public final byte getAlignment() {
      return this.z3() ? this.l6().h0() : -1;
   }

   @Override
   public final void setAlignment(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().u3(value);
         this.s7();
      }
   }

   @Override
   public final byte getJoinStyle() {
      return this.z3() ? this.l6().c8() : -1;
   }

   @Override
   public final void setJoinStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().a6(value);
         this.s7();
      }
   }

   @Override
   public final float getMiterLimit() {
      return this.z3() ? this.l6().t2() : Float.NaN;
   }

   @Override
   public final void setMiterLimit(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final byte getBeginArrowheadStyle() {
      return this.z3() ? this.l6().s7() : -1;
   }

   @Override
   public final void setBeginArrowheadStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().u9(value);
         this.s7();
      }
   }

   @Override
   public final byte getEndArrowheadStyle() {
      return this.z3() ? this.l6().x8() : -1;
   }

   @Override
   public final void setEndArrowheadStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().h0(value);
         this.s7();
      }
   }

   @Override
   public final byte getBeginArrowheadWidth() {
      return this.z3() ? this.l6().n3() : -1;
   }

   @Override
   public final void setBeginArrowheadWidth(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().c8(value);
         this.s7();
      }
   }

   @Override
   public final byte getEndArrowheadWidth() {
      return this.z3() ? this.l6().y4() : -1;
   }

   @Override
   public final void setEndArrowheadWidth(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().t2(value);
         this.s7();
      }
   }

   @Override
   public final byte getBeginArrowheadLength() {
      return this.z3() ? this.l6().e2() : -1;
   }

   @Override
   public final void setBeginArrowheadLength(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().s7(value);
         this.s7();
      }
   }

   @Override
   public final byte getEndArrowheadLength() {
      return this.z3() ? this.l6().t9() : -1;
   }

   @Override
   public final void setEndArrowheadLength(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().x8(value);
         this.s7();
      }
   }

   @Override
   public final boolean equals(ILineFormat lineFormat) {
      LineFormat var2 = com.aspose.slides.internal.v6g.k5.n5(lineFormat, LineFormat.class);
      if (var2 == null) {
         return false;
      } else if (this.z3()) {
         return this.l6().n5(var2);
      } else {
         return var2.z3() ? var2.l6().n5(this) : true;
      }
   }

   @Override
   public final ILineFormatEffectiveData getEffective() {
      return this.c8();
   }

   final boolean u3() {
      return this.z3() ? this.l6().z1() : false;
   }

   final void n5(ILineFormat var1) {
      if (!this.isFormatNotDefined() || !var1.isFormatNotDefined()) {
         this.k7();
         this.l6().l6((LineFormat)var1);
         this.s7();
      }
   }

   final void l6(ILineFormat var1) {
      if (!this.isFormatNotDefined() || !var1.isFormatNotDefined()) {
         this.k7();
         this.l6().k5((LineFormat)var1);
      }
   }

   final void n5(ILineFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.s7();
   }

   final LineFormat a6() {
      LineFormat var1 = new LineFormat(this.getParent_Immediate());
      var1.n5((ILineFormat)this);
      return var1;
   }

   final void u9() {
      if (this.z3()) {
         if (!this.isFormatNotDefined()) {
            this.k7();
            this.l6().t4();
            this.s7();
         }
      }
   }

   final void h0() {
      if (!this.isFormatNotDefined()) {
         this.k7();
         this.l6().t4();
         this.s7();
      }
   }

   final t8r c8() {
      t8r[] var1 = new t8r[]{this.c8};
      t8r var2 = t8r.n5(t8r.class, var1, this, k5);
      this.c8 = var1[0];
      if (this.c8 != null) {
         this.c8.n5(t8r.class);
      }

      return var2;
   }

   private void s7() {
      u5x var1 = this.u3;
      if (var1 != null && !this.n5.n5()) {
         var1.n5(this);
      }
   }

   private void x8() {
      s7n var1 = this.a6;
      if (var1 != null && !this.l6.n5()) {
         var1.n5();
      }
   }

   final void n5(Shape var1) {
      this.l6(var1);
      this.z8();
      this.t2();
   }

   final void t2() {
      this.c8 = null;
   }

   // $VF: synthetic method
   static u5x n5(LineFormat var0, u5x var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static s7n n5(LineFormat var0, s7n var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static void n5(LineFormat var0) {
      var0.s7();
   }

   // $VF: synthetic method
   static void l6(LineFormat var0) {
      var0.x8();
   }
}
