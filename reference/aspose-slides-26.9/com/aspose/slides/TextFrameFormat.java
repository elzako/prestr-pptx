package com.aspose.slides;

public final class TextFrameFormat extends PVIObject implements IChartTextBlockFormat, ITextFrameFormat {
   final ParagraphFormat$n5 n5 = new TextFrameFormat$1(this);
   static final com.aspose.slides.internal.f3.a6<TextFrameFormat, h9z, h9z> l6 = new TextFrameFormat$2();
   TextFrameFormat$n5 k5;
   long u3 = 0L;
   private int a6 = 0;
   private TextStyle u9;
   private x8m h0;
   private c3d c8;
   private p6k t2;
   private ThreeDFormat s7;
   private h9z x8;
   private static final h9z n3 = h9z.k5;

   TextFrameFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   public TextFrameFormat() {
      super(null);
   }

   @Override
   void N_() {
      this.s7 = new ThreeDFormat(this);
      this.u9 = new TextStyle(this);
      this.h0 = new x8m(this);
      this.c8 = new c3d(this);
      this.t2 = new p6k(this);
      if (this.getParent_IPresentationComponent() != null && this.getParent_IPresentationComponent().getPresentation() != null) {
         this.u9.n5.l6(this.n5);
         ((TextStyle)((Presentation)this.getParent_IPresentationComponent().getPresentation()).getDefaultTextStyle()).n5.l6(this.n5);
      }
   }

   @Override
   Object M_() {
      return new u0k(this.u9, this.s7, this.h0, this.c8, this.t2);
   }

   final u0k l6() {
      return (u0k)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().f2();
   }

   @Override
   public final ITextStyle getTextStyle() {
      return this.h0();
   }

   @Override
   public final IThreeDFormat getThreeDFormat() {
      this.m3();
      return this.s7;
   }

   final c0u u3() {
      return this.z3() ? this.l6().k5() : u0k.n5;
   }

   final void n5(c0u var1) {
      this.n5(u0k.n5.l6(), var1.l6());
      if (this.z3()) {
         this.l6().n5(var1.l6());
         this.p8();
      }
   }

   static c0u n5(ITextFrameFormat var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, TextFrameFormat.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(var0, TextFrameFormat.class).u3();
      }

      c0u var1 = new c0u();
      var1.l6 = var0.getMarginLeft();
      var1.k5 = var0.getMarginTop();
      var1.u3 = var0.getMarginRight();
      var1.a6 = var0.getMarginBottom();
      return var1;
   }

   static c0u n5(ITextFrameFormatEffectiveData var0) {
      c0u var1 = new c0u();
      var1.l6 = var0.getMarginLeft();
      var1.k5 = var0.getMarginTop();
      var1.u3 = var0.getMarginRight();
      var1.a6 = var0.getMarginBottom();
      return var1;
   }

   @Override
   public final double getMarginLeft() {
      return this.u3().l6;
   }

   @Override
   public final void setMarginLeft(double value) {
      c0u var3 = this.u3().l6();
      var3.l6 = value;
      this.n5(var3.l6());
   }

   @Override
   public final double getMarginRight() {
      return this.u3().u3;
   }

   @Override
   public final void setMarginRight(double value) {
      c0u var3 = this.u3().l6();
      var3.u3 = value;
      this.n5(var3.l6());
   }

   @Override
   public final double getMarginTop() {
      return this.u3().k5;
   }

   @Override
   public final void setMarginTop(double value) {
      c0u var3 = this.u3().l6();
      var3.k5 = value;
      this.n5(var3.l6());
   }

   @Override
   public final double getMarginBottom() {
      return this.u3().a6;
   }

   @Override
   public final void setMarginBottom(double value) {
      c0u var3 = this.u3().l6();
      var3.a6 = value;
      this.n5(var3.l6());
   }

   @Override
   public final byte getWrapText() {
      return this.z3() ? this.l6().c8() : -1;
   }

   @Override
   public final void setWrapText(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final byte getAnchoringType() {
      return this.z3() ? this.l6().t2() : -1;
   }

   @Override
   public final void setAnchoringType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.p8();
      }
   }

   @Override
   public final byte getCenterText() {
      return this.z3() ? this.l6().x8() : -1;
   }

   @Override
   public final void setCenterText(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().u3(value);
         this.p8();
      }
   }

   @Override
   public final byte getTextVerticalType() {
      return this.z3() ? this.l6().n3() : -1;
   }

   @Override
   public final void setTextVerticalType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().a6(value);
         this.p8();
      }
   }

   @Override
   public final byte getAutofitType() {
      return this.z3() ? this.l6().y4() : -1;
   }

   @Override
   public final void setAutofitType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().u9(value);
         this.p8();
      }
   }

   @Override
   public final int getColumnCount() {
      return this.z3() ? this.l6().e2() : 0;
   }

   @Override
   public final void setColumnCount(int value) {
      if (value < 0) {
         value = 0;
      }

      this.n5(0, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.p8();
      }
   }

   @Override
   public final double getColumnSpacing() {
      return this.z3() ? this.l6().t9() : Double.NaN;
   }

   @Override
   public final void setColumnSpacing(double value) {
      if (value < 0.0) {
         value = 0.0;
      }

      this.n5(Double.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.p8();
      }
   }

   @Override
   public final float getRotationAngle() {
      return this.z3() ? this.l6().z1() : Float.NaN;
   }

   @Override
   public final void setRotationAngle(float value) {
      this.n5(Float.NaN, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final byte getTransform() {
      return this.z3() ? this.l6().s7() : -1;
   }

   @Override
   public final void setTransform(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().k5(value);
      }
   }

   @Override
   public final boolean getKeepTextFlat() {
      return this.z3() ? this.l6().n5() : false;
   }

   @Override
   public final void setKeepTextFlat(boolean value) {
      this.n5(false, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final ITextFrameFormatEffectiveData getEffective() {
      return this.d2();
   }

   final c3d a6() {
      this.m3();
      return this.c8;
   }

   final p6k u9() {
      this.m3();
      return this.t2;
   }

   final TextStyle h0() {
      this.m3();
      return this.u9;
   }

   final x8m c8() {
      this.m3();
      return this.h0;
   }

   final byte t2() {
      return this.z3() ? this.l6().m1() : -1;
   }

   final void n5(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().h0(var1);
      }
   }

   final byte s7() {
      return this.z3() ? this.l6().k7() : -1;
   }

   final void l6(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().c8(var1);
      }
   }

   final byte x8() {
      return this.z3() ? this.l6().m3() : -1;
   }

   final void k5(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().t2(var1);
      }
   }

   final float n3() {
      return this.z3() ? this.l6().j5() : Float.NaN;
   }

   final void n5(float var1) {
      this.n5(Float.NaN, var1);
      if (this.z3()) {
         this.l6().l6(var1);
      }
   }

   final float y4() {
      return this.z3() ? this.l6().w1() : Float.NaN;
   }

   final void l6(float var1) {
      this.n5(Float.NaN, var1);
      if (this.z3()) {
         this.l6().k5(var1);
      }
   }

   final byte e2() {
      return this.z3() ? this.l6().r4() : -1;
   }

   final void u3(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().s7(var1);
      }
   }

   final byte t9() {
      return this.z3() ? this.l6().c4() : -1;
   }

   final void a6(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().x8(var1);
      }
   }

   final byte z1() {
      return this.z3() ? this.l6().y2() : -1;
   }

   final void u9(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().n3(var1);
      }
   }

   final byte t4() {
      return this.z3() ? this.l6().y1() : -1;
   }

   final void h0(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().y4(var1);
      }
   }

   final boolean q0() {
      return this.z3() ? this.l6().a0() : false;
   }

   final void n5(boolean var1) {
      this.n5(false, var1);
      if (this.z3()) {
         this.l6().l6(var1);
      }
   }

   final byte j5() {
      return this.z3() ? this.l6().d2() : -1;
   }

   final void c8(byte var1) {
      this.n5((byte)-1, var1);
      if (this.z3()) {
         this.l6().e2(var1);
      }
   }

   final boolean w1() {
      return this.z3() ? this.l6().d5() : false;
   }

   final void n5(TextFrameFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final void l6(ITextFrameFormat var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final boolean r4() {
      if (!this.z3()) {
         return true;
      }

      this.k7();
      return this.l6().p8();
   }

   final void c4() {
      this.k7();
      this.l6().i1();
   }

   final int y2() {
      this.m3();
      return this.a6;
   }

   final byte y1() {
      if (this.getTextVerticalType() == -1) {
         ISlideComponent var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_IPresentationComponent(), ISlideComponent.class);
         BaseSlide var2 = var1 != null ? (BaseSlide)var1.getSlide() : null;
         TextFrame var3 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), TextFrame.class);
         Shape var4 = var3 != null ? com.aspose.slides.internal.v6g.k5.n5(var3.getParent_Immediate(), Shape.class) : null;
         if (var2 != null && var4 != null && var4.getPlaceholder() != null) {
            Shape[] var5 = var2.n5(var4.getPlaceholder());
            if (var5.length > 0) {
               AutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5[0], AutoShape.class);
               if (var6 != null && var6.getTextFrame() != null) {
                  return ((TextFrameFormat)var6.getTextFrame().getTextFrameFormat()).y1();
               }
            }
         }
      }

      return this.getTextVerticalType();
   }

   final boolean n5(ITextFrameFormat[] var1) {
      c0u var2 = this.u3().l6();
      boolean var3 = com.aspose.slides.internal.n8e.v4.n5(var2.l6, com.aspose.slides.ms.System.q1.n5((double)(n3.getMarginLeft()), 1))
         && com.aspose.slides.internal.n8e.v4.n5(var2.u3, com.aspose.slides.ms.System.q1.n5((double)(n3.getMarginRight()), 1))
         && com.aspose.slides.internal.n8e.v4.n5(var2.k5, com.aspose.slides.ms.System.q1.n5((double)(n3.getMarginTop()), 1))
         && com.aspose.slides.internal.n8e.v4.n5(var2.a6, com.aspose.slides.ms.System.q1.n5((double)(n3.getMarginBottom()), 1));
      if (var3) {
         return false;
      }

      for (ITextFrameFormat var7 : var1) {
         c0u var8 = n5(var7).l6();
         boolean var9 = !com.aspose.slides.ms.System.d2.k5(var8.l6)
            || !com.aspose.slides.ms.System.d2.k5(var8.u3)
            || !com.aspose.slides.ms.System.d2.k5(var8.k5)
            || !com.aspose.slides.ms.System.d2.k5(var8.a6);
         if (var9) {
            boolean var10 = com.aspose.slides.internal.n8e.v4.n5(var2.l6, var8.l6)
               && com.aspose.slides.internal.n8e.v4.n5(var2.u3, var8.u3)
               && com.aspose.slides.internal.n8e.v4.n5(var2.k5, var8.k5)
               && com.aspose.slides.internal.n8e.v4.n5(var2.a6, var8.a6);
            return !var10;
         }
      }

      return true;
   }

   final void a0() {
      if (this.z3()) {
         this.k7();
         this.l6().s3();
      }
   }

   final h9z d2() {
      h9z[] var1 = new h9z[]{this.x8};
      h9z var2 = h9z.n5(h9z.class, var1, this, l6);
      this.x8 = var1[0];
      if (this.x8 != null) {
         this.x8.n5(h9z.class);
      }

      return var2;
   }

   final void d5() {
      this.x8 = null;
      if (this.u9 != null) {
         this.u9.t2();
      }
   }

   final long s3() {
      return (
               (this.u3 & 4294967295L)
                     + (
                        (
                              this.getParent_IPresentationComponent() != null
                                    && com.aspose.slides.internal.v6g.k5.l6(this.getParent_IPresentationComponent(), Shape.class)
                                 ? ((Shape)this.getParent_IPresentationComponent()).s7
                                 : 0L
                           )
                           & 4294967295L
                     )
                  & 4294967295L
            )
            + (this.y2() & 4294967295L)
         & 4294967295L;
   }

   final void p8() {
      this.u3++;
      if (this.k5 != null) {
         this.k5.n5();
      }
   }
}
