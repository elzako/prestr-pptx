package com.aspose.slides;

final class TextParam implements IGenericCloneable<TextParam>, Cloneable {
   public final d2k n5 = new d2k();
   private boolean t9;
   public final com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private boolean z1;
   final String k5;
   public Portion u3;
   private e2n t4;
   public c9g a6;
   private boolean q0;
   private boolean z3;
   private boolean m1 = true;
   boolean u9;
   ShapeFrame h0;
   IReflectionEffectiveData c8;
   IGlowEffectiveData t2;
   IOuterShadowEffectiveData s7;
   IOuterShadowEffectiveData x8;
   IGlowEffectiveData n3;
   IInnerShadowEffectiveData y4;
   IBaseSlide e2;
   private TextParam$FontArgs k7 = new TextParam$FontArgs();
   private boolean m3;
   private byte z8 = 0;
   private e4z j5 = null;
   private e4z w1 = null;
   private short r4;
   private float c4 = Float.NaN;
   private float y2 = 0.0F;
   private float y1 = 576.0F;
   private l6v a0;
   private a1v d2;
   private byte d5 = 0;
   private byte s3;
   private String p8;
   private com.aspose.slides.ms.System.o5<Boolean> f2 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Boolean> i1 = new com.aspose.slides.ms.System.o5<>();
   private byte e5;
   private int b3;
   private byte[] o0;
   private final k6j z7;
   private float[] v4;
   private boolean u6;

   public TextParam(Presentation presentation, float dpi, TextParam$FontArgs font) {
      font.CloneTo(this.k7);
      this.m3 = false;
      this.r4 = 0;
      this.d2 = new a1v(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.z7 = presentation.t9();
      this.k5 = presentation.a6().getDefaultRegularFont();
      this.p8 = font.Name;
      this.y1 = dpi;
      com.aspose.slides.internal.o9b.c8.w4().n5(this.l6);
   }

   public TextParam(
      Portion portion,
      c9g portionFormatEffective,
      TextParam$FontArgs font,
      byte charset,
      byte pitchFamily,
      byte[] panose,
      String defaultFontName,
      d2k size,
      BaseSlide slide,
      s5u rc,
      byte textVerticalType
   ) {
      font.CloneTo(this.k7);
      this.m3 = false;
      this.r4 = 0;
      this.d2 = new a1v(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.u3 = portion;
      this.z7 = slide.z1().t9();
      this.y1 = 72.0F;
      this.p8 = font.Name;
      this.k5 = defaultFontName;
      this.s3 = charset;
      this.b3 = pitchFamily & 255;
      this.o0 = panose;
      this.e5 = textVerticalType;
      size.n5(this.n5);
      this.a6 = portionFormatEffective;
      if (portionFormatEffective != null) {
         this.y2 = portionFormatEffective.getSpacing();
         this.z8 = portionFormatEffective.getTextCapType();
         this.r4 = com.aspose.slides.internal.v6g.k5.l6(
            com.aspose.slides.ms.System.q1.u3(portionFormatEffective.getEscapement() + (portionFormatEffective.getEscapement() >= 0.0F ? 0.001F : -0.001F)), 14
         );
         ShapeFrame var12 = new ShapeFrame(0.0F, 0.0F, size.n5, size.l6, (byte)0, (byte)0, 0.0F);
         this.d2 = a1v.n5(new j5m(var12.cloneT(), null, null, slide, rc), portionFormatEffective.getFillFormat(), (byte)1, null);
         this.a0 = new l6v(new j5m(var12.cloneT(), null, null, slide, rc), portionFormatEffective.getLineFormat(), 0);
         if (portionFormatEffective.getStrikethroughType() > 0) {
            this.d5 = portionFormatEffective.getStrikethroughType();
         }

         this.s7 = portionFormatEffective.getEffectFormat().getOuterShadowEffect();
         this.x8 = portionFormatEffective.a6.getOuterShadowEffect();
         this.c8 = portionFormatEffective.getEffectFormat().getReflectionEffect();
         this.t2 = portionFormatEffective.getEffectFormat().getGlowEffect();
         this.n3 = portionFormatEffective.a6.getGlowEffect();
         this.y4 = portionFormatEffective.getEffectFormat().getInnerShadowEffect();
         GroupShape var13 = null;
         GroupShape[] var14 = new GroupShape[]{var13};
         d0u.n5(GroupShape.class, portion, var14);
         var13 = var14[0];
         IEffectFormatEffectiveData var15 = var13 != null ? var13.getEffectFormat().getEffective() : null;
         if (this.s7 != null || this.x8 != null) {
            this.m3 = this.s7 != null || this.x8 != null;
            this.m3 = true;
            if (var15 != null && var15.getOuterShadowEffect() != null) {
               this.z3 = var13.getShapes().size() > 1;
            }
         }

         if ((this.t2 != null || this.n3 != null) && var15 != null && var15.getGlowEffect() != null) {
            this.z3 = var13.getShapes().size() > 1;
         }

         if (portionFormatEffective.o0) {
            this.c8 = portionFormatEffective.a6.getReflectionEffect();
            GeometryShape var16 = null;
            GeometryShape[] var17 = new GeometryShape[]{var16};
            d0u.n5(GeometryShape.class, portion, var17);
            var16 = var17[0];
            this.h0 = var16.e5().n3();
            this.u9 = true;
         }
      }

      this.e2 = slide;
      if (rc != null && rc.s7()) {
         e4z var18 = this.d2();
         if (var18 != null && var18.l6().n5().z7()) {
            this.u6 = true;
         }
      }
   }

   public final boolean n5() {
      return this.t9;
   }

   public final void n5(boolean var1) {
      this.t9 = var1;
   }

   public final byte l6() {
      return this.e5;
   }

   public final short k5() {
      return this.r4;
   }

   public final a1v u3() {
      return this.d2;
   }

   public final void n5(a1v var1) {
      this.d2 = var1;
   }

   public final l6v a6() {
      return this.a0;
   }

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.d2.n5();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.d2 = new a1v(var1.o8());
   }

   public final com.aspose.slides.internal.o9b.c8 h0() {
      if (this.s7 != null) {
         return ((k0p)this.s7).l6();
      } else {
         return this.x8 != null ? ((k0p)this.x8).l6() : com.aspose.slides.internal.o9b.c8.m3().o8();
      }
   }

   public final com.aspose.slides.internal.o9b.c8 c8() {
      return this.u9();
   }

   public final boolean t2() {
      return this.k7.Bold;
   }

   public final boolean s7() {
      return this.k7.Italic;
   }

   public final boolean x8() {
      return this.m3;
   }

   final boolean n3() {
      return this.z1;
   }

   final void l6(boolean var1) {
      this.z1 = var1;
   }

   public final boolean y4() {
      return this.k7.Underline;
   }

   public final byte e2() {
      return this.z8;
   }

   public final byte t9() {
      com.aspose.slides.internal.f8y.n5.n5(this.d5 != -1);
      return this.d5;
   }

   public final void n5(byte var1) {
      this.d5 = var1;
   }

   public final short z1() {
      return com.aspose.slides.internal.v6g.k5.l6(this.k7.Height, 13);
   }

   public final float t4() {
      return this.k7.Height;
   }

   public final float q0() {
      return this.y2;
   }

   public final void n5(float var1) {
      this.y2 = var1;
   }

   public final String z3() {
      return this.k7.Name;
   }

   public final void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(this.k7.Name, var1)) {
         this.j5 = null;
      }

      this.k7.Name = var1;
   }

   public final byte m1() {
      return this.s3;
   }

   public final int k7() {
      return this.b3;
   }

   public final byte[] m3() {
      return this.o0;
   }

   public final float[] z8() {
      return this.v4;
   }

   public final void n5(float[] var1) {
      this.v4 = var1;
   }

   public final com.aspose.slides.ms.System.o5<Boolean> j5() {
      return this.f2;
   }

   public final void n5(com.aspose.slides.ms.System.o5<Boolean> var1) {
      var1.n5(this.f2);
   }

   public final com.aspose.slides.ms.System.o5<Boolean> w1() {
      return this.i1;
   }

   public final void l6(com.aspose.slides.ms.System.o5<Boolean> var1) {
      var1.n5(this.i1);
   }

   public final TextParam r4() {
      return (TextParam)this.f0();
   }

   public final TextParam l6(float var1) {
      if (this.k7.Height != var1) {
         TextParam var2 = (TextParam)this.f0();
         var2.k7.Height = var1;
         var2.j5 = null;
         return var2;
      } else {
         return this.r4();
      }
   }

   final float c4() {
      return this.c4;
   }

   final void k5(float var1) {
      this.c4 = var1;
   }

   public final void n5(e2n var1) {
      this.t4 = var1;
   }

   final String y2() {
      return this.p8;
   }

   final boolean y1() {
      return this.p8 != null && !com.aspose.slides.ms.System.d1.a6(this.p8, this.k7.Name);
   }

   final void l6(String var1) {
      this.p8 = this.k7.Name;
      this.k7.Name = var1;
   }

   final void a0() {
      this.k7.Name = this.p8;
   }

   final e4z d2() {
      if (this.j5 == null) {
         float var1 = this.u3(this.y1);
         boolean var2 = this.z8 == 1;

         try {
            this.j5 = this.z7.n5(this.z3(), this.s3, this.b3, var1, n8z.n5(this.z3(), this.e5()), var2);
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
            this.j5 = this.z7.n5("Arial", this.s3, this.b3, var1, this.e5(), var2);
         }
      }

      return this.j5;
   }

   final e4z d5() {
      if (this.w1 == null) {
         float var1 = this.u3(this.y1);
         boolean var2 = this.z8 == 1;

         try {
            this.w1 = this.z7.n5(this.z3(), this.s3, this.b3, var1, n8z.n5(this.z3(), this.e5()), var2, true);
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
            this.w1 = this.z7.n5("Arial", this.s3, this.b3, var1, this.e5(), var2);
         }
      }

      return this.w1;
   }

   final boolean s3() {
      return this.q0;
   }

   final void k5(boolean var1) {
      this.q0 = var1;
   }

   final boolean k5(String var1) {
      c4y var2 = this.z7.l6(var1);
      return var2 != null;
   }

   final float p8() {
      return this.t4() * 1.2F * this.y1 / 72.0F;
   }

   final float f2() {
      return this.u3(this.y1);
   }

   final float u3(float var1) {
      return (this.k5() == 0 ? 1.0F : 0.66F) * this.t4() * var1 / 96.0F;
   }

   final float i1() {
      com.aspose.slides.internal.o9b.y4 var1;
      try {
         var1 = new com.aspose.slides.internal.o9b.y4(this.z3());
      } catch (RuntimeException var5) {
         com.aspose.slides.internal.n8e.v4.n5(var5);

         try {
            var1 = new com.aspose.slides.internal.o9b.y4("Arial");
         } catch (RuntimeException var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
            return this.d2().l6().s7() / 2.0F;
         }
      }

      int var2 = this.e5();
      float var3 = this.p8() * var1.a6(var2) / var1.u9(var2);
      var1.u9();
      return var3 / 2.0F;
   }

   final int e5() {
      byte var1 = 0;
      if (this.t2()) {
         var1 |= 1;
      }

      if (this.s7()) {
         var1 |= 2;
      }

      if (this.y4()) {
         var1 |= 4;
      }

      return var1;
   }

   final boolean b3() {
      return this.c8 != null;
   }

   final boolean o0() {
      return this.t2 != null || this.n3 != null;
   }

   final boolean z7() {
      return this.y4 != null;
   }

   final boolean v4() {
      return this.x8 != null;
   }

   final boolean u6() {
      return this.z3;
   }

   final boolean t1() {
      return ((Fonts)this.e2.getPresentation().getMasterTheme().getFontScheme().getMinor()).l6();
   }

   final boolean a5() {
      return this.u6;
   }

   final boolean h2() {
      float var1 = 1.0E-6F;
      h9z var2 = this.u3.n3().x8().k5().s7().d2();
      return var2.getAutofitType() == 1 && com.aspose.slides.ms.System.q1.n5(var2.h0() - 1.0F) > 1.0E-6F;
   }

   boolean v0() {
      return this.m1;
   }

   void u3(boolean var1) {
      this.m1 = var1;
   }

   protected Object f0() {
      try {
         TextParam var1 = (TextParam)super.clone();
         if (this.a0 != null) {
            var1.a0 = this.a0.w1();
         }

         if (this.d2 != null) {
            var1.d2 = this.d2.s7();
         }

         if (this.k7 != null) {
            var1.k7 = this.k7.Clone();
         }

         if (this.j5 != null) {
            var1.j5 = this.j5;
         }

         var1.p8 = new String(this.p8);
         if (this.f2 != null) {
            var1.f2 = this.f2.k5();
         }

         if (this.i1 != null) {
            var1.i1 = this.i1.k5();
         }

         var1.n5.n5 = this.n5.n5;
         var1.n5.l6 = this.n5.l6;
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public TextParam cloneT() {
      return this.r4();
   }

}
