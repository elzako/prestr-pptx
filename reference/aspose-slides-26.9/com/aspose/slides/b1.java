package com.aspose.slides;

abstract class b1 {
   private int t2 = 524288;
   private com.aspose.slides.ms.System.o5<Integer> s7 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Integer> x8 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Integer> n3 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Integer> y4 = new com.aspose.slides.ms.System.o5<>();
   protected float n5;
   protected float l6;
   protected float k5;
   protected float u3;
   protected String a6;
   protected String u9;
   private boolean e2;
   protected com.aspose.slides.ms.System.o5<Boolean> h0 = new com.aspose.slides.ms.System.o5<>();
   private final LineFormat t9;
   private final FillFormat z1;
   private final EffectFormat t4;
   private final ColorFormat q0;
   private final LineFormat z3;
   private final FillFormat m1;
   private final v6v k7;
   protected final q1z c8;
   private final r0g m3;
   private long z8;

   protected b1(r0g var1, LineFormat var2, FillFormat var3, LineFormat var4, FillFormat var5, EffectFormat var6, ColorFormat var7, q1z var8) {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
      this.a6 = null;
      this.u9 = null;
      this.m3 = var1;
      this.t9 = var2;
      this.z1 = var3;
      this.z3 = var4;
      this.m1 = var5;
      this.q0 = var7;
      this.t4 = var6;
      this.c8 = var8;
      IPresentationComponent var9 = null;
      IPresentationComponent[] var10 = new IPresentationComponent[]{var9};
      d0u.n5(IPresentationComponent.class, this.m3, var10);
      var9 = var10[0];
      this.k7 = s3p.n5(var9);
   }

   public final ILineFormat n5() {
      return this.t9;
   }

   public final IFillFormat l6() {
      return this.z1;
   }

   public final IEffectFormat k5() {
      return this.t4;
   }

   public final IColorFormat u3() {
      return this.q0;
   }

   public final ILineFormat a6() {
      return this.z3;
   }

   public final IFillFormat u9() {
      return this.m1;
   }

   public final byte h0() {
      return this.l6(0);
   }

   public final void n5(byte var1) {
      if (this.l6(0) != var1) {
         this.n5(0, var1);
         this.s3();
      }
   }

   public final byte c8() {
      return this.l6(2);
   }

   public final void l6(byte var1) {
      if (this.l6(2) != var1) {
         this.n5(2, var1);
         this.s3();
      }
   }

   public final byte t2() {
      return this.l6(4);
   }

   public final void k5(byte var1) {
      if (this.l6(4) != var1) {
         this.n5(4, var1);
         this.s3();
      }
   }

   public final byte s7() {
      return this.l6(6);
   }

   public final void u3(byte var1) {
      if (this.l6(6) != var1) {
         this.n5(6, var1);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final byte x8() {
      return this.l6(8);
   }

   public final void a6(byte var1) {
      if (this.l6(8) != var1) {
         this.n5(8, var1);
         this.s3();
      }

      this.h0 = new com.aspose.slides.ms.System.o5<>();
   }

   public final byte n3() {
      return this.a6(10);
   }

   public final void u9(byte var1) {
      if (this.a6(10) != var1) {
         this.k5(10, var1);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final byte y4() {
      return this.u3(15);
   }

   public final void h0(byte var1) {
      if (this.u3(15) != var1) {
         this.l6(15, var1);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final byte e2() {
      return this.u3(17);
   }

   public final void c8(byte var1) {
      if (this.u3(17) != var1) {
         this.l6(17, var1);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final byte t9() {
      return this.l6(20);
   }

   public final void t2(byte var1) {
      if (this.l6(20) != var1) {
         this.n5(20, var1);
         if (var1 == 1 && this.z3.getFillFormat().getFillType() == -1) {
            this.z3.getFillFormat().setFillType((byte)0);
         }

         this.s3();
      }
   }

   public final byte z1() {
      return this.l6(22);
   }

   public final void s7(byte var1) {
      if (this.l6(22) != var1) {
         this.n5(22, var1);
         if (var1 == 1 && this.m1.getFillType() == -1) {
            this.m1.setFillType((byte)0);
         }

         this.s3();
      }
   }

   public final float t4() {
      return this.n5;
   }

   public final void n5(float var1) {
      float var2 = this.n5;
      this.n5 = com.aspose.slides.internal.n8e.v4.n5(var1, 1.0F, 4000.0F);
      if (this.n5 != var2) {
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
         TextFrame var3 = null;
         TextFrame[] var4 = new TextFrame[]{var3};
         boolean var5 = d0u.n5(TextFrame.class, this.m3, var4);
         var3 = var4[0];
         if (var5) {
            ((TextFrameFormat)var3.getTextFrameFormat()).p8();
         }
      }
   }

   public final IFontData q0() {
      return !this.s7.l6() ? null : this.y2().n5(this.s7.n5() & 65535).l6();
   }

   public final void n5(IFontData var1) {
      if (var1 != null) {
         this.s7 = new com.aspose.slides.ms.System.o5<>(this.y2().n5(0, var1));
      } else {
         this.s7 = new com.aspose.slides.ms.System.o5<>();
      }

      this.s3();
   }

   public final IFontData z3() {
      return !this.x8.l6() ? null : this.y2().n5(this.x8.n5() & 65535).l6();
   }

   public final void l6(IFontData var1) {
      if (var1 != null) {
         this.x8 = new com.aspose.slides.ms.System.o5<>(this.y2().n5(1, var1));
      } else {
         this.x8 = new com.aspose.slides.ms.System.o5<>();
      }

      this.s3();
   }

   public final IFontData m1() {
      return !this.n3.l6() ? null : this.y2().n5(this.n3.n5() & 65535).l6();
   }

   public final void k5(IFontData var1) {
      if (var1 != null) {
         this.n3 = new com.aspose.slides.ms.System.o5<>(this.y2().n5(2, var1));
      } else {
         this.n3 = new com.aspose.slides.ms.System.o5<>();
      }

      this.s3();
   }

   public final IFontData k7() {
      return !this.y4.l6() ? null : this.y2().n5(this.y4.n5() & 65535).l6();
   }

   public final void u3(IFontData var1) {
      if (var1 != null) {
         this.y4 = new com.aspose.slides.ms.System.o5<>(this.y2().n5(v6v.n5(var1.getFontName()), var1));
      } else {
         this.y4 = new com.aspose.slides.ms.System.o5<>();
      }

      this.s3();
   }

   public final float m3() {
      return this.k5;
   }

   public final void l6(float var1) {
      if (this.k5 != var1) {
         this.k5 = var1;
         this.s3();
      }
   }

   public final float z8() {
      return this.l6;
   }

   public final void k5(float var1) {
      if (this.l6 != var1) {
         this.l6 = com.aspose.slides.internal.n8e.v4.n5(var1, 0.0F, 4000.0F);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   public final String j5() {
      return this.a6;
   }

   public final void n5(String var1) {
      if (var1 != null && var1.length() == 0) {
         var1 = null;
      }

      if (!com.aspose.slides.ms.System.d1.a6(this.a6, var1)) {
         this.a6 = var1;
         this.s3();
      }
   }

   public final String w1() {
      return this.u9;
   }

   public final void l6(String var1) {
      if (var1 != null && var1.length() == 0) {
         var1 = null;
      }

      if (!com.aspose.slides.ms.System.d1.a6(this.u9, var1)) {
         this.u9 = var1;
         this.s3();
      }
   }

   public final float r4() {
      return this.u3;
   }

   public final void u3(float var1) {
      if (this.u3 != var1) {
         this.u3 = com.aspose.slides.internal.n8e.v4.n5(var1, -1000.0F, 1000.0F);
         this.s3();
         this.h0 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   final int c4() {
      return this.t2;
   }

   final void n5(int var1) {
      this.t2 = var1;
   }

   final v6v y2() {
      return this.k7;
   }

   final boolean y1() {
      return this.e2;
   }

   final void n5(boolean var1) {
      this.e2 = var1;
   }

   final boolean a0() {
      if (this.z1.u3()) {
         return true;
      }

      if (this.t9.u3()) {
         return true;
      }

      if (!this.t4.isNoEffects()) {
         return true;
      }

      if (!this.h0.l6()) {
         this.h0 = new com.aspose.slides.ms.System.o5<>(false);
         if (!com.aspose.slides.ms.System.n1.k5(this.t4())) {
            (this.h0.l6()
                  ? new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.t4() % 1.0F != 0.0F)
                  : new com.aspose.slides.ms.System.o5<Boolean>())
               .n5(this.h0);
         }

         if (!com.aspose.slides.ms.System.n1.k5(this.r4())) {
            (this.h0.l6() ? new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.r4() != 0.0F) : new com.aspose.slides.ms.System.o5<Boolean>())
               .n5(this.h0);
         }

         (!this.h0.l6()
               ? new com.aspose.slides.ms.System.o5<Boolean>()
               : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || !com.aspose.slides.ms.System.n1.k5(this.z8())))
            .n5(this.h0);
         (!this.h0.l6() ? new com.aspose.slides.ms.System.o5<Boolean>() : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.e2() > 0))
            .n5(this.h0);
         (!this.h0.l6() ? new com.aspose.slides.ms.System.o5<Boolean>() : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.y4() > 0))
            .n5(this.h0);
         (!this.h0.l6() ? new com.aspose.slides.ms.System.o5<Boolean>() : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.n3() > 2))
            .n5(this.h0);
         (!this.h0.l6() ? new com.aspose.slides.ms.System.o5<Boolean>() : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.s7() == 1))
            .n5(this.h0);
         (!this.h0.l6()
               ? new com.aspose.slides.ms.System.o5<Boolean>()
               : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.u3().getColorType() != -1))
            .n5(this.h0);
         (!this.h0.l6()
               ? new com.aspose.slides.ms.System.o5<Boolean>()
               : new com.aspose.slides.ms.System.o5<>(this.h0.n5(boolean.class) || this.p8().l6() && (this.p8().n5() & 65535) != 65535))
            .n5(this.h0);
      }

      return this.h0.n5();
   }

   void n5(c9g var1) {
      this.t9.n5(var1.k5);
      this.z1.n5(var1.u3);
      this.t4.n5(var1.u9);
      this.q0.l6(var1.u9().o8());
      this.z3.n5(var1.c8);
      this.m1.n5(var1.t2);
      this.c8.n5(var1.t2());
      this.n5(0, var1.s7);
      this.n5(2, var1.x8);
      this.n5(4, var1.n3);
      this.n5(6, var1.y4);
      this.n5(8, var1.e2);
      this.k5(10, var1.t9);
      this.l6(15, var1.z1);
      this.l6(17, var1.t4);
      this.n5(19, var1.q0 == 1);
      this.n5(20, var1.z3);
      this.n5(22, var1.m1);
      this.n5 = var1.k7;
      this.n5(var1.z8);
      this.l6(var1.w1);
      this.k5(var1.c4);
      this.u3(var1.y1);
      this.k5 = var1.a0;
      this.l6 = var1.d2;
      this.a6 = var1.d5;
      this.u9 = var1.s3;
      this.u3 = var1.f2;
      this.s3();
   }

   final void l6(c9g var1) {
      this.c8.n5(var1.t2());
      this.n5(0, var1.s7);
      this.n5(2, var1.x8);
      this.n5(4, var1.n3);
      this.n5(6, var1.y4);
      this.n5(8, var1.e2);
      this.k5(10, var1.t9);
      this.l6(15, var1.z1);
      this.l6(17, var1.t4);
      this.n5(19, var1.q0 == 1);
      this.n5(20, var1.z3);
      this.n5(22, var1.m1);
      this.n5 = var1.k7;
      this.k5 = var1.a0;
      this.l6 = var1.d2;
      this.a6 = var1.d5;
      this.u9 = var1.s3;
      this.u3 = var1.f2;
      this.s3();
   }

   void d2() {
      this.n5(524288);
      this.c8.n5(4294967295L);
      this.n5((IFontData)null);
      this.l6((IFontData)null);
      this.k5(null);
      this.u3(null);
      this.t9.h0();
      this.z3.h0();
      this.t4.u9();
      this.z1.h0();
      this.m1.h0();
      this.q0.u9();
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
      this.a6 = null;
      this.u9 = null;
      this.s3();
   }

   void n5(BasePortionFormat var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, PortionFormat.class)) {
         PortionFormat var2 = (PortionFormat)var1;
         this.n5(var2.s7());
         this.c8.n5(var2.y4().n5());
         if (com.aspose.slides.internal.v6g.k5.l6(this, c9h.class)) {
            ((c9h)this).v4().n5(var2.q0().n5());
            ((c9h)this).v4().n5(var2.q0().l6());
         }
      }

      this.n5(var1.getLatinFont());
      this.l6(var1.getEastAsianFont());
      this.k5(var1.getComplexScriptFont());
      this.u3(var1.getSymbolFont());
      this.t9.n5(var1.getLineFormat());
      this.z3.n5(var1.getUnderlineLineFormat());
      this.z1.n5(var1.getFillFormat());
      this.t4.n5(var1.getEffectFormat());
      this.m1.n5(var1.getUnderlineFillFormat());
      this.q0.n5((ColorFormat)var1.getHighlightColor());
      this.n5 = var1.getFontHeight();
      this.l6 = var1.getKerningMinimalSize();
      this.k5 = var1.getEscapement();
      this.u3 = var1.getSpacing();
      this.a6 = var1.getLanguageId();
      this.u9 = var1.getAlternativeLanguageId();
      this.s3();
   }

   void l6(BasePortionFormat var1) {
      if (var1.getLatinFont() != null) {
         this.n5(var1.getLatinFont());
      }

      if (var1.getEastAsianFont() != null) {
         this.l6(var1.getEastAsianFont());
      }

      if (var1.getComplexScriptFont() != null) {
         this.k5(var1.getComplexScriptFont());
      }

      if (var1.getSymbolFont() != null) {
         this.u3(var1.getSymbolFont());
      }

      if (!var1.getLineFormat().isFormatNotDefined()) {
         this.t9.n5(var1.getLineFormat());
      }

      if (!var1.getUnderlineLineFormat().isFormatNotDefined()) {
         this.z3.n5(var1.getUnderlineLineFormat());
      }

      if (var1.getFillFormat().getFillType() != -1) {
         this.z1.n5(var1.getFillFormat());
      }

      if (var1.getUnderlineFillFormat().getFillType() != -1) {
         this.m1.n5(var1.getUnderlineFillFormat());
      }

      if (!var1.getEffectFormat().isNoEffects()) {
         this.t4.n5(var1.getEffectFormat());
      }

      ColorFormat var2 = (ColorFormat)var1.getHighlightColor();
      if (var2 == null || !var2.n3()) {
         this.q0.n5(var2);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getFontHeight())) {
         this.n5 = var1.getFontHeight();
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getKerningMinimalSize())) {
         this.l6 = var1.getKerningMinimalSize();
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getEscapement())) {
         this.k5 = var1.getEscapement();
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getSpacing())) {
         this.u3 = var1.getSpacing();
      }

      if (var1.getLanguageId() != null) {
         this.a6 = var1.getLanguageId();
      }

      if (var1.getAlternativeLanguageId() != null) {
         this.u9 = var1.getAlternativeLanguageId();
      }

      if (var1.getFontBold() != -1) {
         this.n5(var1.getFontBold());
      }

      if (var1.getFontItalic() != -1) {
         this.l6(var1.getFontItalic());
      }

      if (var1.getKumimoji() != -1) {
         this.k5(var1.getKumimoji());
      }

      if (var1.getNormaliseHeight() != -1) {
         this.u3(var1.getNormaliseHeight());
      }

      if (var1.getProofDisabled() != -1) {
         this.a6(var1.getProofDisabled());
      }

      if (var1.getFontUnderline() != -1) {
         this.u9(var1.getFontUnderline());
      }

      if (var1.getTextCapType() != -1) {
         this.h0(var1.getTextCapType());
      }

      if (var1.getStrikethroughType() != -1) {
         this.c8(var1.getStrikethroughType());
      }

      if (var1.isHardUnderlineLine() != -1) {
         this.t2(var1.isHardUnderlineLine());
      }

      if (var1.isHardUnderlineFill() != -1) {
         this.s7(var1.isHardUnderlineFill());
      }

      if ((((PortionFormat)var1).y4().n5() & 4294967295L) != 4294967295L) {
         this.c8.n5(((PortionFormat)var1).y4().n5());
      }

      this.s3();
   }

   void n5(PortionFormat var1) {
      if (this.q0() != null) {
         var1.setLatinFont(this.q0());
      }

      if (this.z3() != null) {
         var1.setEastAsianFont(this.z3());
      }

      if (this.m1() != null) {
         var1.setComplexScriptFont(this.m1());
      }

      if (this.k7() != null) {
         var1.setSymbolFont(this.k7());
      }

      if (!this.t9.isFormatNotDefined()) {
         ((LineFormat)var1.getLineFormat()).n5((ILineFormat)this.t9);
      }

      if (!this.z3.isFormatNotDefined()) {
         ((LineFormat)var1.getUnderlineLineFormat()).n5((ILineFormat)this.z3);
      }

      if (this.z1.getFillType() != -1) {
         ((FillFormat)var1.getFillFormat()).n5((IFillFormat)this.z1);
      }

      if (this.m1.getFillType() != -1) {
         ((FillFormat)var1.getUnderlineFillFormat()).n5((IFillFormat)this.m1);
      }

      if (this.t4 != null) {
         ((EffectFormat)var1.getEffectFormat()).n5((IEffectFormat)this.t4);
      }

      if (this.q0.getColorType() != -1) {
         ((ColorFormat)var1.getHighlightColor()).n5(this.q0);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.n5)) {
         var1.setFontHeight(this.n5);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.l6)) {
         var1.setKerningMinimalSize(this.l6);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.k5)) {
         var1.setEscapement(this.k5);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         var1.setSpacing(this.u3);
      }

      if (this.a6 != null) {
         var1.setLanguageId(this.a6);
      }

      if (this.u9 != null) {
         var1.setAlternativeLanguageId(this.u9);
      }

      if (this.h0() != -1) {
         var1.setFontBold(this.h0());
      }

      if (this.c8() != -1) {
         var1.setFontItalic(this.c8());
      }

      if (this.t2() != -1) {
         var1.setKumimoji(this.t2());
      }

      if (this.s7() != -1) {
         var1.setNormaliseHeight(this.s7());
      }

      if (this.x8() != -1) {
         var1.setProofDisabled(this.x8());
      }

      if (this.n3() != -1) {
         var1.setFontUnderline(this.n3());
      }

      if (this.y4() != -1) {
         var1.setTextCapType(this.y4());
      }

      if (this.e2() != -1) {
         var1.setStrikethroughType(this.e2());
      }

      if (this.t9() != -1) {
         var1.setHardUnderlineLine(this.t9());
      }

      if (this.z1() != -1) {
         var1.setHardUnderlineFill(this.z1());
      }
   }

   void l6(PortionFormat var1) {
      if (this.q0() == null && this.z3() == null && this.m1() == null && this.k7() == null) {
         this.n5(var1.getLatinFont());
         this.l6(var1.getEastAsianFont());
         this.k5(var1.getComplexScriptFont());
         this.u3(var1.getSymbolFont());
      }

      if (this.t9.isFormatNotDefined()) {
         this.t9.n5(var1.getLineFormat());
      }

      if (this.z3.isFormatNotDefined()) {
         this.z3.n5(var1.getUnderlineLineFormat());
      }

      if (this.z1.getFillType() == -1) {
         this.z1.n5(var1.getFillFormat());
      }

      if (this.t4.isNoEffects()) {
         this.t4.n5(var1.getEffectFormat());
      }

      if (this.m1.getFillType() == -1) {
         this.m1.n5(var1.getUnderlineFillFormat());
      }

      if (this.q0.getColorType() == -1) {
         this.q0.n5((ColorFormat)var1.getHighlightColor());
      }

      if (com.aspose.slides.ms.System.n1.k5(this.n5)) {
         this.n5 = var1.getFontHeight();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.l6)) {
         this.l6 = var1.getKerningMinimalSize();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.k5)) {
         this.k5 = var1.getEscapement();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.u3)) {
         this.u3 = var1.getSpacing();
      }

      if (this.a6 == null) {
         this.a6 = var1.getLanguageId();
      }

      if (this.u9 == null) {
         this.u9 = var1.getAlternativeLanguageId();
      }

      if (this.h0() == -1) {
         this.n5(var1.getFontBold());
      }

      if (this.c8() == -1) {
         this.l6(var1.getFontItalic());
      }

      if (this.t2() == -1) {
         this.k5(var1.getKumimoji());
      }

      if (this.s7() == -1) {
         this.u3(var1.getNormaliseHeight());
      }

      if (this.x8() == -1) {
         this.a6(var1.getProofDisabled());
      }

      if (this.n3() == -1) {
         this.u9(var1.getFontUnderline());
      }

      if (this.y4() == -1) {
         this.h0(var1.getTextCapType());
      }

      if (this.e2() == -1) {
         this.c8(var1.getStrikethroughType());
      }

      if (this.t9() == -1) {
         this.t2(var1.isHardUnderlineLine());
      }

      if (this.z1() == -1) {
         this.s7(var1.isHardUnderlineFill());
      }
   }

   final void n5(IPortionFormatEffectiveData var1) {
      if (this.q0() == null && this.z3() == null && this.m1() == null && this.k7() == null) {
         this.n5(var1.getLatinFont());
         this.l6(var1.getEastAsianFont());
         this.k5(var1.getComplexScriptFont());
         this.u3(var1.getSymbolFont());
      }

      if (this.t9.isFormatNotDefined()) {
         this.t9.n5(var1.getLineFormat());
      }

      if (this.z3.isFormatNotDefined()) {
         this.z3.n5(var1.getUnderlineLineFormat());
      }

      if (this.z1.getFillType() == -1 && var1.getFillFormat().getFillType() != -1) {
         this.z1.n5(var1.getFillFormat());
      }

      if (this.m1.getFillType() == -1 && var1.getUnderlineFillFormat().getFillType() != -1) {
         this.m1.n5(var1.getUnderlineFillFormat());
      }

      if (this.q0.getColorType() == -1) {
         this.q0.l6(((c9g)var1).u9().o8());
      }

      if (com.aspose.slides.ms.System.n1.k5(this.n5)) {
         this.n5 = ((c9g)var1).h0();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.l6)) {
         this.l6 = var1.getKerningMinimalSize();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.k5)) {
         this.k5 = var1.getEscapement();
      }

      if (com.aspose.slides.ms.System.n1.k5(this.u3)) {
         this.u3 = var1.getSpacing();
      }

      if (this.a6 == null) {
         this.a6 = var1.getLanguageId();
      }

      if (this.u9 == null) {
         this.u9 = var1.getAlternativeLanguageId();
      }

      if (this.h0() == -1) {
         this.n5((byte)(var1.getFontBold() ? 1 : 0));
      }

      if (this.c8() == -1) {
         this.l6((byte)(var1.getFontItalic() ? 1 : 0));
      }

      if (this.t2() == -1) {
         this.k5((byte)(var1.getKumimoji() ? 1 : 0));
      }

      if (this.s7() == -1) {
         this.u3((byte)(var1.getNormaliseHeight() ? 1 : 0));
      }

      if (this.x8() == -1) {
         this.a6((byte)(var1.getProofDisabled() ? 1 : 0));
      }

      if (this.n3() == -1) {
         this.u9(var1.getFontUnderline());
      }

      if (this.y4() == -1) {
         this.h0(var1.getTextCapType());
      }

      if (this.e2() == -1) {
         this.c8(var1.getStrikethroughType());
      }

      if (this.t9() == -1) {
         this.t2((byte)(var1.isHardUnderlineLine() ? 1 : 0));
      }

      if (this.z1() == -1) {
         this.s7((byte)(var1.isHardUnderlineFill() ? 1 : 0));
      }
   }

   final long d5() {
      return (
               (
                        (
                                 (
                                          ((this.z8 & 4294967295L) + (this.t9.getVersion() & 4294967295L) & 4294967295L) + (this.z1.getVersion() & 4294967295L)
                                             & 4294967295L
                                       )
                                       + (this.t4.getVersion() & 4294967295L)
                                    & 4294967295L
                              )
                              + (this.q0.getVersion() & 4294967295L)
                           & 4294967295L
                     )
                     + (this.z3.getVersion() & 4294967295L)
                  & 4294967295L
            )
            + (this.m1.getVersion() & 4294967295L)
         & 4294967295L;
   }

   protected final void s3() {
      this.z8++;
   }

   final com.aspose.slides.ms.System.o5<Integer> p8() {
      return this.n3;
   }

   protected final byte l6(int var1) {
      long var2 = 3 << var1 & 4294967295L;
      return (byte)(((this.t2 & var2 & 4294967295L & 4294967295L) >> var1) - 1L);
   }

   protected final void n5(int var1, byte var2) {
      int var3 = ~(3 << var1);
      this.t2 &= var3;
      this.t2 |= var2 + 1 << var1;
   }

   protected final boolean k5(int var1) {
      int var2 = 1 << var1;
      return (this.t2 & var2) != 0;
   }

   protected final void n5(int var1, boolean var2) {
      if (var2) {
         this.t2 |= 1 << var1;
      } else {
         this.t2 &= ~(1 << var1);
      }
   }

   protected final byte u3(int var1) {
      long var2 = 3 << var1 & 4294967295L;
      return (byte)(((this.t2 & var2 & 4294967295L & 4294967295L) >> var1) - 1L);
   }

   protected final void l6(int var1, byte var2) {
      int var3 = ~(3 << var1);
      this.t2 &= var3;
      this.t2 |= var2 + 1 << var1;
   }

   protected final byte a6(int var1) {
      long var2 = 31 << var1 & 4294967295L;
      return (byte)(((this.t2 & var2 & 4294967295L & 4294967295L) >> var1) - 1L);
   }

   protected final void k5(int var1, byte var2) {
      int var3 = ~(31 << var1);
      this.t2 &= var3;
      this.t2 |= var2 + 1 << var1;
   }

   public final boolean f2() {
      return this.c4() != 524288 || (this.c8.n5() & 4294967295L) != 4294967295L
         ? false
         : this.t9.isFormatNotDefined()
            && this.z1.t2()
            && EffectFormat.n5(this.t4)
            && ((ColorFormat)this.u3()).n3()
            && this.a6().isFormatNotDefined()
            && this.m1.t2()
            && com.aspose.slides.internal.n8e.v4.n5(this.t4(), Float.NaN)
            && com.aspose.slides.internal.n8e.v4.n5(this.q0(), null)
            && com.aspose.slides.internal.n8e.v4.n5(this.z3(), null)
            && com.aspose.slides.internal.n8e.v4.n5(this.m1(), null)
            && com.aspose.slides.internal.n8e.v4.n5(this.k7(), null)
            && com.aspose.slides.internal.n8e.v4.n5(this.m3(), Float.NaN)
            && com.aspose.slides.internal.n8e.v4.n5(this.z8(), Float.NaN)
            && this.j5() == null
            && this.w1() == null
            && com.aspose.slides.internal.n8e.v4.n5(this.r4(), Float.NaN);
   }

   static boolean n5(b1 var0, IBasePortionFormat var1) {
      if (var1 == null) {
         return false;
      }

      int var2 = var0.c4();
      long var3 = var0.c8.n5();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, b1.class)) {
         var2 = ((b1)var1).c4();
         var3 = ((b1)var1).c8.n5();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, PortionFormat.class)) {
         var2 = ((PortionFormat)var1).s7();
         var3 = ((PortionFormat)var1).y4().n5();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, ChartPortionFormat.class)) {
         var2 = ((ChartPortionFormat)var1).s7();
         var3 = ((ChartPortionFormat)var1).y4().n5();
      }

      return var0.c4() != var2 || (var0.c8.n5() & 4294967295L) != (var3 & 4294967295L)
         ? false
         : com.aspose.slides.internal.n8e.v4.n5(var0.n5(), var1.getLineFormat())
            && com.aspose.slides.internal.n8e.v4.n5(var0.l6(), var1.getFillFormat())
            && com.aspose.slides.internal.n8e.v4.n5(var0.k5(), var1.getEffectFormat())
            && com.aspose.slides.internal.n8e.v4.n5(var0.u3(), var1.getHighlightColor())
            && com.aspose.slides.internal.n8e.v4.n5(var0.a6(), var1.getUnderlineLineFormat())
            && com.aspose.slides.internal.n8e.v4.n5(var0.u9(), var1.getUnderlineFillFormat())
            && com.aspose.slides.internal.n8e.v4.n5(var0.t4(), var1.getFontHeight())
            && com.aspose.slides.internal.n8e.v4.n5(var0.q0(), var1.getLatinFont())
            && com.aspose.slides.internal.n8e.v4.n5(var0.z3(), var1.getEastAsianFont())
            && com.aspose.slides.internal.n8e.v4.n5(var0.m1(), var1.getComplexScriptFont())
            && com.aspose.slides.internal.n8e.v4.n5(var0.k7(), var1.getSymbolFont())
            && com.aspose.slides.internal.n8e.v4.n5(var0.m3(), var1.getEscapement())
            && com.aspose.slides.internal.n8e.v4.n5(var0.z8(), var1.getKerningMinimalSize())
            && com.aspose.slides.ms.System.d1.a6(var0.j5(), var1.getLanguageId())
            && com.aspose.slides.ms.System.d1.a6(var0.w1(), var1.getAlternativeLanguageId())
            && com.aspose.slides.internal.n8e.v4.n5(var0.r4(), var1.getSpacing());
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.internal.v6g.k5.l6(obj, IBasePortionFormat.class) ? n5(this, (IBasePortionFormat)obj) : false;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
