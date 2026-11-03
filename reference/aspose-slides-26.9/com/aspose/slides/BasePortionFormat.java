package com.aspose.slides;

public abstract class BasePortionFormat extends PVIObject implements IBasePortionFormat {
   private FillFormat n5;
   private FillFormat l6;
   private LineFormat k5;
   private LineFormat u3;
   private EffectFormat a6;
   private ColorFormat u9;
   private q1z h0;

   BasePortionFormat(r0g parent) {
      super(parent);
   }

   @Override
   void N_() {
      this.n5 = new FillFormat(this);
      this.l6 = new FillFormat(this);
      this.k5 = new LineFormat(this);
      this.u3 = new LineFormat(this);
      this.a6 = new EffectFormat(this);
      this.u9 = new ColorFormat(this);
      this.h0 = new q1z(this);
   }

   b1 l6() {
      return (b1)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().d5();
   }

   @Override
   public final ILineFormat getLineFormat() {
      this.m3();
      return this.k5;
   }

   final LineFormat u3() {
      return this.k5;
   }

   @Override
   public final IFillFormat getFillFormat() {
      this.m3();
      return this.n5;
   }

   final FillFormat a6() {
      return this.n5;
   }

   @Override
   public final IEffectFormat getEffectFormat() {
      this.m3();
      return this.a6;
   }

   final EffectFormat u9() {
      return this.a6;
   }

   @Override
   public final IColorFormat getHighlightColor() {
      this.m3();
      return this.u9;
   }

   final ColorFormat h0() {
      return this.u9;
   }

   @Override
   public final ILineFormat getUnderlineLineFormat() {
      this.m3();
      return this.u3;
   }

   final LineFormat c8() {
      return this.u3;
   }

   @Override
   public final IFillFormat getUnderlineFillFormat() {
      this.m3();
      return this.l6;
   }

   final FillFormat t2() {
      return this.l6;
   }

   @Override
   public final byte getFontBold() {
      return this.n5(t2q.m1);
   }

   @Override
   public final void setFontBold(byte value) {
      this.n5(t2q.m1, value);
   }

   @Override
   public final byte getFontItalic() {
      return this.n5(t2q.z3);
   }

   @Override
   public final void setFontItalic(byte value) {
      this.n5(t2q.z3, value);
   }

   @Override
   public final byte getKumimoji() {
      return this.n5(t2q.q0);
   }

   @Override
   public final void setKumimoji(byte value) {
      this.n5(t2q.q0, value);
   }

   @Override
   public final byte getNormaliseHeight() {
      return this.n5(t2q.t4);
   }

   @Override
   public final void setNormaliseHeight(byte value) {
      this.n5(t2q.t4, value);
   }

   @Override
   public final byte getProofDisabled() {
      return this.n5(t2q.z1);
   }

   @Override
   public final void setProofDisabled(byte value) {
      this.n5(t2q.z1, value);
   }

   @Override
   public final byte getFontUnderline() {
      return this.n5(t2q.y4);
   }

   @Override
   public final void setFontUnderline(byte value) {
      this.n5(t2q.y4, value);
   }

   @Override
   public final byte getTextCapType() {
      return this.n5(t2q.n3);
   }

   @Override
   public final void setTextCapType(byte value) {
      this.n5(t2q.n3, value);
   }

   @Override
   public final byte getStrikethroughType() {
      return this.n5(t2q.x8);
   }

   @Override
   public final void setStrikethroughType(byte value) {
      this.n5(t2q.x8, value);
   }

   @Override
   public final byte isHardUnderlineLine() {
      return this.n5(t2q.t9);
   }

   @Override
   public final void setHardUnderlineLine(byte value) {
      this.n5(t2q.t9, value);
   }

   @Override
   public final byte isHardUnderlineFill() {
      return this.n5(t2q.e2);
   }

   @Override
   public final void setHardUnderlineFill(byte value) {
      this.n5(t2q.e2, value);
   }

   @Override
   public final float getFontHeight() {
      return this.n5(t2q.u3);
   }

   @Override
   public final void setFontHeight(float value) {
      this.n5(t2q.u3, value);
   }

   @Override
   public final IFontData getLatinFont() {
      return this.n5(t2q.s7);
   }

   @Override
   public final void setLatinFont(IFontData value) {
      this.n5(t2q.s7, value);
   }

   @Override
   public final IFontData getEastAsianFont() {
      return this.n5(t2q.t2);
   }

   @Override
   public final void setEastAsianFont(IFontData value) {
      this.n5(t2q.t2, value);
   }

   @Override
   public final IFontData getComplexScriptFont() {
      return this.n5(t2q.c8);
   }

   @Override
   public final void setComplexScriptFont(IFontData value) {
      this.n5(t2q.c8, value);
   }

   @Override
   public final IFontData getSymbolFont() {
      return this.n5(t2q.h0);
   }

   @Override
   public final void setSymbolFont(IFontData value) {
      this.n5(t2q.h0, value);
   }

   @Override
   public final float getEscapement() {
      return this.n5(t2q.k5);
   }

   @Override
   public final void setEscapement(float value) {
      this.n5(t2q.k5, value);
   }

   @Override
   public final float getKerningMinimalSize() {
      return this.n5(t2q.l6);
   }

   @Override
   public final void setKerningMinimalSize(float value) {
      this.n5(t2q.l6, value);
   }

   @Override
   public final String getLanguageId() {
      return this.n5(t2q.u9);
   }

   @Override
   public final void setLanguageId(String value) {
      this.n5(t2q.u9, value);
   }

   @Override
   public final String getAlternativeLanguageId() {
      return this.n5(t2q.a6);
   }

   @Override
   public final void setAlternativeLanguageId(String value) {
      this.n5(t2q.a6, value);
   }

   @Override
   public final float getSpacing() {
      return this.n5(t2q.n5);
   }

   @Override
   public final void setSpacing(float value) {
      this.n5(t2q.n5, value);
   }

   @Override
   public final boolean getSpellCheck() {
      return this.x8();
   }

   @Override
   public final void setSpellCheck(boolean value) {
      this.n5(value);
   }

   final int s7() {
      return this.z3() ? this.l6().c4() : 524288;
   }

   final boolean x8() {
      return this.n5(t2q.k7);
   }

   final void n5(boolean var1) {
      this.n5(t2q.k7, var1);
   }

   final boolean n3() {
      return this.z3() ? this.l6().a0() : false;
   }

   final q1z y4() {
      this.m3();
      return this.h0;
   }

   final void e2() {
      if (this.z3()) {
         this.k7();
         this.l6().d2();
      }
   }

   final void n5(BasePortionFormat var1) {
      if (this.z3() || var1 == null || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final void l6(BasePortionFormat var1) {
      if (this.z3() || var1 == null || var1.z3()) {
         this.k7();
         this.l6().l6(var1);
      }
   }

   final void n5(PortionFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   final void l6(PortionFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().l6(var1);
      }
   }

   final void n5(IPortionFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   static boolean k5(PortionFormat var0) {
      if (com.aspose.slides.internal.n8e.v4.n5(Float.NaN, var0.getFontHeight())
         && com.aspose.slides.internal.n8e.v4.n5(null, var0.getLatinFont())
         && com.aspose.slides.internal.n8e.v4.n5(null, var0.getEastAsianFont())
         && com.aspose.slides.internal.n8e.v4.n5(null, var0.getComplexScriptFont())
         && com.aspose.slides.internal.n8e.v4.n5(null, var0.getSymbolFont())
         && com.aspose.slides.internal.n8e.v4.n5(Float.NaN, var0.getEscapement())
         && com.aspose.slides.internal.n8e.v4.n5(Float.NaN, var0.getKerningMinimalSize())
         && null == var0.getLanguageId()
         && null == var0.getAlternativeLanguageId()
         && com.aspose.slides.internal.n8e.v4.n5(Float.NaN, var0.getSpacing())) {
         int var1 = var0.s7();
         long var2 = var0.y4().n5();
         if (524288 == var1 && 4294967295L == (var2 & 4294967295L)) {
            if (var0.getFillFormat().getFillType() != -1
               || var0.getUnderlineFillFormat().getFillType() != -1
               || !var0.getUnderlineLineFormat().isFormatNotDefined()) {
               return false;
            } else if (!n5((LineFormat)var0.getLineFormat())) {
               return false;
            } else {
               return !n5((EffectFormat)var0.getEffectFormat()) ? false : n5((ColorFormat)var0.getHighlightColor());
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean n5(ColorFormat var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.z3() ? var0.l6().j5() : true;
      }
   }

   private static boolean n5(EffectFormat var0) {
      return var0 != null && var0.isNoEffects();
   }

   private static boolean n5(LineFormat var0) {
      if (var0 == null) {
         return false;
      } else {
         return var0.z3() ? ((t6h)var0.m1()).n5() : true;
      }
   }
}
