package com.aspose.slides;

import java.awt.Color;

abstract class m4<TLocalData extends BasePortionFormat, TEffectiveData extends m4<TLocalData, TEffectiveData>>
   extends x8<TLocalData, TEffectiveData>
   implements IBasePortionFormatEffectiveData {
   t8r k5;
   f6a u3;
   d0e a6;
   d0e u9;
   final j3z h0;
   t8r c8;
   f6a t2;
   byte s7;
   byte x8;
   byte n3;
   byte y4;
   byte e2;
   byte t9;
   byte z1;
   byte t4;
   byte q0;
   byte z3;
   byte m1;
   float k7;
   FontData m3;
   FontData z8;
   FontData j5;
   FontData w1;
   FontData r4;
   FontData c4;
   FontData y2;
   FontData y1;
   float a0;
   float d2;
   String d5;
   String s3;
   byte p8;
   float f2;
   boolean i1;
   boolean e5;
   boolean b3;
   boolean o0;
   boolean z7;
   boolean v4;
   private static final com.aspose.slides.internal.v6g.u9 u6 = new com.aspose.slides.internal.v6g.u9("+mn-lt", "+mn-ea", "+mn-cs", "+mj-lt", "+mj-ea", "+mj-cs");

   protected m4() {
      super((TLocalData)null);
      this.u3 = new f6a(this);
      this.u9 = new d0e(this);
      this.a6 = new d0e(this);
      this.t2 = new f6a(this);
      this.k7 = Float.NaN;
      this.d2 = Float.NaN;
      this.k5 = t8r.t4;
      this.c8 = t8r.t4;
      this.h0 = new j3z();
      this.h0.n5(com.aspose.slides.internal.o9b.c8.u3.o8());
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.y4 = 0;
      this.e2 = 0;
      this.t9 = 0;
      this.z1 = 0;
      this.t4 = 0;
      this.q0 = 1;
      this.z3 = 0;
      this.m1 = 0;
      this.m3 = v6v.n5;
      this.j5 = v6v.n5;
      this.r4 = v6v.n5;
      FontData var1 = new FontData("Wingdings", (byte)2);
      this.y2 = var1;
      this.a0 = 0.0F;
      this.d5 = null;
      this.s3 = null;
      this.p8 = 0;
      this.f2 = 0.0F;
      this.i1 = true;
      this.e5 = true;
      this.b3 = true;
   }

   m4(TLocalData var1) {
      super((TLocalData)var1);
      this.h0 = new j3z();
      this.t2();
   }

   m4(q6z var1) {
      super(var1);
      this.h0 = new j3z();
      this.t2();
   }

   private void t2() {
      this.k5 = new t8r(this);
      this.u3 = new f6a(this);
      this.u9 = new d0e(this);
      this.a6 = new d0e(this);
      this.c8 = new t8r(this);
      this.t2 = new f6a(this);
      this.s7 = -1;
      this.x8 = -1;
      this.n3 = -1;
      this.y4 = -1;
      this.e2 = -1;
      this.t9 = -1;
      this.z1 = -1;
      this.t4 = -1;
      this.q0 = -1;
      this.z3 = -1;
      this.m1 = -1;
      this.k7 = Float.NaN;
      this.m3 = null;
      this.j5 = null;
      this.r4 = null;
      this.y2 = null;
      this.a0 = Float.NaN;
      this.d2 = Float.NaN;
      this.d5 = null;
      this.s3 = null;
      this.f2 = Float.NaN;
      this.p8 = -1;
   }

   @Override
   public final ILineFormatEffectiveData getLineFormat() {
      return this.k5;
   }

   @Override
   public final IFillFormatEffectiveData getFillFormat() {
      return this.u3;
   }

   @Override
   public final IEffectFormatEffectiveData getEffectFormat() {
      return this.u9;
   }

   @Override
   public final Color getHighlightColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u9());
   }

   com.aspose.slides.internal.o9b.c8 u9() {
      return this.h0.n5();
   }

   @Override
   public final ILineFormatEffectiveData getUnderlineLineFormat() {
      return this.c8;
   }

   @Override
   public final IFillFormatEffectiveData getUnderlineFillFormat() {
      return this.t2;
   }

   @Override
   public final boolean getFontBold() {
      return this.s7 == 1;
   }

   @Override
   public final boolean getFontItalic() {
      return this.x8 == 1;
   }

   @Override
   public final boolean getKumimoji() {
      return this.n3 == 1;
   }

   @Override
   public final boolean getNormaliseHeight() {
      return this.y4 == 1;
   }

   @Override
   public final boolean getProofDisabled() {
      return this.e2 == 1;
   }

   @Override
   public final byte getFontUnderline() {
      return this.t9;
   }

   @Override
   public final byte getTextCapType() {
      return this.z1;
   }

   @Override
   public final byte getStrikethroughType() {
      return this.t4;
   }

   @Override
   public final boolean getSmartTagClean() {
      return this.q0 == 1;
   }

   @Override
   public final boolean isHardUnderlineLine() {
      return this.z3 == 1;
   }

   @Override
   public final boolean isHardUnderlineFill() {
      return this.m1 == 1;
   }

   final float h0() {
      return this.k7;
   }

   @Override
   public final float getFontHeight() {
      if (this.W_() == null) {
         return this.k7;
      }

      Portion var1 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_ISlideComponent(), Portion.class);
      if (var1 != null && var1.n3() != null) {
         TextFrame var2 = var1.n3().x8().k5();
         h9z var3 = var2.s7().d2();
         if (var3.getAutofitType() == 1) {
            float var4 = var3.h0();
            if (var4 != 1.0F && !(this.k7 * var4 < 1.0F)) {
               return (float)com.aspose.slides.ms.System.q1.n5((double)(this.k7 * var4), (short)((short)1));
            }

            return this.k7;
         }
      }

      return this.k7;
   }

   @Override
   public final IFontData getLatinFont() {
      return this.z8;
   }

   @Override
   public final IFontData getEastAsianFont() {
      return this.w1;
   }

   @Override
   public final IFontData getComplexScriptFont() {
      return this.c4;
   }

   @Override
   public final IFontData getSymbolFont() {
      return this.y1;
   }

   @Override
   public final float getEscapement() {
      return this.a0;
   }

   @Override
   public final float getKerningMinimalSize() {
      return this.d2;
   }

   @Override
   public final String getLanguageId() {
      return this.d5;
   }

   @Override
   public final String getAlternativeLanguageId() {
      return this.s3;
   }

   @Override
   public final float getSpacing() {
      return this.f2;
   }

   public final boolean c8() {
      return this.p8 == 1;
   }

   static String n5(IFontSchemeEffectiveData var0, String var1, String var2) {
      if (var1.charAt(0) == '+') {
         if (com.aspose.slides.ms.System.d1.l6(var1, "+mn")) {
            return ((c5z)var0.getMinor()).n5(var2);
         }

         if (com.aspose.slides.ms.System.d1.l6(var1, "+mj")) {
            return ((c5z)var0.getMajor()).n5(var2);
         }
      }

      return null;
   }

   static String n5(IFontSchemeEffectiveData var0, IFontData var1) {
      String var2 = var1.getFontName();
      if (var2.charAt(0) == '+') {
         IFontData var3 = null;
         switch (u6.n5(var2)) {
            case 0:
               var3 = var0.getMinor().getLatinFont();
               break;
            case 1:
               var3 = var0.getMinor().getEastAsianFont();
               break;
            case 2:
               var3 = var0.getMinor().getComplexScriptFont();
               break;
            case 3:
               var3 = var0.getMajor().getLatinFont();
               break;
            case 4:
               var3 = var0.getMajor().getEastAsianFont();
               break;
            case 5:
               var3 = var0.getMajor().getComplexScriptFont();
         }

         var2 = var3 != null ? var3.getFontName() : FontData.a6().getFontName();
      }

      return var2;
   }

   protected final void n5(i7b var1) {
      m4 var2 = (m4)var1;
      this.k5.n5((i7b)var2.k5);
      this.u3.n5((i7b)var2.u3);
      this.a6.n5((i7b)var2.a6);
      this.u9.n5((i7b)var2.u9);
      this.h0.n5(var2.h0);
      this.c8.n5((i7b)var2.c8);
      this.t2.n5((i7b)var2.t2);
      this.s7 = var2.s7;
      this.x8 = var2.x8;
      this.n3 = var2.n3;
      this.y4 = var2.y4;
      this.e2 = var2.e2;
      this.t9 = var2.t9;
      this.z1 = var2.z1;
      this.t4 = var2.t4;
      this.q0 = var2.q0;
      this.z3 = var2.z3;
      this.m1 = var2.m1;
      this.k7 = var2.k7;
      this.m3 = var2.m3;
      this.j5 = var2.j5;
      this.r4 = var2.r4;
      this.y2 = var2.y2;
      this.a0 = var2.a0;
      this.d2 = var2.d2;
      this.d5 = var2.d5;
      this.s3 = var2.s3;
      this.f2 = var2.f2;
      this.p8 = var2.p8;
      this.i1 = var2.i1;
      this.e5 = var2.e5;
      this.b3 = var2.b3;
      this.o0 = var2.o0;
      this.z7 = var2.z7;
      this.v4 = var2.v4;
   }

   final void n5(BasePortionFormat var1) {
      this.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var1.getLineFormat(), LineFormat.class));
      this.u3.k5(com.aspose.slides.internal.v6g.k5.n5(var1.getFillFormat(), FillFormat.class));
      this.u9.l6(com.aspose.slides.internal.v6g.k5.n5(var1.getEffectFormat(), EffectFormat.class));
      this.h0.n5((ColorFormat)var1.getHighlightColor());
      this.c8.l6(com.aspose.slides.internal.v6g.k5.n5(var1.getLineFormat(), LineFormat.class));
      this.c8.l6(com.aspose.slides.internal.v6g.k5.n5(var1.getUnderlineLineFormat(), LineFormat.class));
      this.t2.k5(com.aspose.slides.internal.v6g.k5.n5(var1.getFillFormat(), FillFormat.class));
      this.t2.k5(com.aspose.slides.internal.v6g.k5.n5(var1.getUnderlineFillFormat(), FillFormat.class));
      if (var1.getFontBold() != -1) {
         this.s7 = var1.getFontBold();
      }

      if (var1.getFontItalic() != -1) {
         this.x8 = var1.getFontItalic();
      }

      if (var1.getKumimoji() != -1) {
         this.n3 = var1.getKumimoji();
      }

      if (var1.getNormaliseHeight() != -1) {
         this.y4 = var1.getNormaliseHeight();
      }

      if (var1.getProofDisabled() != -1) {
         this.e2 = var1.getProofDisabled();
      }

      if (var1.getFontUnderline() != -1) {
         this.t9 = var1.getFontUnderline();
      }

      if (var1.getTextCapType() != -1) {
         this.z1 = var1.getTextCapType();
      }

      if (var1.getStrikethroughType() != -1) {
         this.t4 = var1.getStrikethroughType();
      }

      if (var1.isHardUnderlineLine() != -1) {
         this.z3 = var1.isHardUnderlineLine();
      }

      if (var1.isHardUnderlineFill() != -1) {
         this.m1 = var1.isHardUnderlineFill();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getFontHeight(), Float.NaN)) {
         this.k7 = var1.getFontHeight();
      }

      if (var1.getLatinFont() != null) {
         this.m3 = com.aspose.slides.internal.v6g.k5.n5(var1.getLatinFont(), FontData.class);
      }

      if (var1.getEastAsianFont() != null) {
         this.j5 = com.aspose.slides.internal.v6g.k5.n5(var1.getEastAsianFont(), FontData.class);
      }

      if (var1.getComplexScriptFont() != null) {
         this.r4 = com.aspose.slides.internal.v6g.k5.n5(var1.getComplexScriptFont(), FontData.class);
      }

      if (var1.getSymbolFont() != null) {
         this.y2 = com.aspose.slides.internal.v6g.k5.n5(var1.getSymbolFont(), FontData.class);
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getEscapement(), Float.NaN)) {
         this.a0 = var1.getEscapement();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getKerningMinimalSize(), Float.NaN)) {
         this.d2 = var1.getKerningMinimalSize();
      }

      if (var1.getLanguageId() != null) {
         this.d5 = var1.getLanguageId();
      }

      if (var1.getAlternativeLanguageId() != null) {
         this.s3 = var1.getAlternativeLanguageId();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getSpacing(), Float.NaN)) {
         this.f2 = var1.getSpacing();
      }

      this.p8 = (byte)(var1.x8() ? 1 : 0);
      this.i1 = this.i1 && var1.getLatinFont() == null;
      this.e5 = this.e5 && com.aspose.slides.ms.System.n1.k5(var1.getFontHeight());
      this.b3 = this.b3 && var1.getFontBold() == -1;
      this.o0 = false;
      this.z7 = false;
      this.v4 = false;
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.h0.n5(var1, w6a.n5);
      this.k5.n5(var1, var2);
      this.u3.n5(var1, var2);
      this.u9.n5(var1, var2);
      this.c8.n5(var1, var2);
      this.t2.n5(var1, var2);
   }

   final void n5(IBaseSlide var1, IFontData var2) {
      if (var1 != null) {
         IThemeEffectiveData var3 = var1.createThemeEffective();
         IFontSchemeEffectiveData var4 = var3.getFontScheme();
         if (var2 == null) {
            this.z8 = null;
         } else {
            String var5 = var2.getFontName();
            if (!com.aspose.slides.ms.System.d1.n5(var5)) {
               String var6 = null;
               if (var5.charAt(0) == '+') {
                  var6 = n5(var4, var5, this.getLanguageId());
               }

               var5 = !com.aspose.slides.ms.System.d1.n5(var6) ? var6 : n5(var4, var2);
            }

            this.z8 = new FontData(this.m3, var5);
         }

         this.c4 = this.n5(this.r4, var4);
         this.w1 = this.l6(this.j5, var4);
         this.y1 = this.y2;
      } else {
         FontData var7 = FontData.a6();
         this.z8 = var7;
         this.w1 = var7;
         this.c4 = var7;
         this.y1 = var7;
      }
   }

   private FontData n5(FontData var1, IFontSchemeEffectiveData var2) {
      if (var1 == null) {
         return null;
      }

      String var3 = var1.getFontName();
      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         String var4 = null;
         if (var3.charAt(0) == '+') {
            var4 = n5(var2, var3, this.getLanguageId());
         }

         if (!com.aspose.slides.ms.System.d1.n5(var4)) {
            var3 = var4;
         } else {
            var3 = n5(var2, var1);
            if (com.aspose.slides.ms.System.d1.n5(var3)) {
               var3 = this.z8.getFontName();
            }
         }
      }

      return new FontData(var1, var3);
   }

   private FontData l6(FontData var1, IFontSchemeEffectiveData var2) {
      if (var1 == null) {
         return null;
      }

      String var3 = var1.getFontName();
      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         String var4 = null;
         if (var3.charAt(0) == '+') {
            var4 = n5(var2, var3, this.getLanguageId());
         }

         if (!com.aspose.slides.ms.System.d1.n5(var4)) {
            var3 = var4;
         } else {
            var3 = n5(var2, var1);
            if (com.aspose.slides.ms.System.d1.n5(var3)) {
               var3 = this.c4.getFontName();
            }
         }
      }

      return new FontData(var1, var3);
   }

   static <TLocalData extends r0g> boolean n5(TLocalData var0) {
      GeometryShape var1 = null;
      GeometryShape[] var2 = new GeometryShape[]{var1};
      d0u.n5(GeometryShape.class, var0, var2);
      var1 = var2[0];
      if (var1 != null && var1.isGrouped()) {
         d0e var3 = var1.y1().h0();
         if (!var3.isNoEffects() && var3.getGlowEffect() != null) {
            return true;
         }
      }

      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, SmartArtShape.class)) {
         d0e var7 = var1.y1().h0();
         boolean var4 = var7 != null && !var7.isNoEffects() && var7.getOuterShadowEffect() != null;
         if (var4) {
            IFillFormatEffectiveData var5 = var1.getFillFormat().getEffective();
            if (var5.getFillType() == 0
               && var7.getOuterShadowEffect() != null
               && !((k0p)var7.getOuterShadowEffect()).u9()
               && !((k0p)var7.getOuterShadowEffect()).h0()) {
               return true;
            }
         }

         if (var7 != null && !var7.isNoEffects() && var7.getReflectionEffect() != null) {
            return true;
         }
      }

      return false;
   }

   boolean n5(TEffectiveData var1) {
      if (com.aspose.slides.ms.System.j8.l6(this, var1)) {
         return true;
      } else {
         return var1 == null
            ? false
            : this.m1 == var1.m1
               && this.k5.n5(var1.k5)
               && this.u3.k5(var1.u3)
               && this.u9.n5(var1.u9)
               && this.h0.l6(var1.h0)
               && this.c8.n5(var1.c8)
               && this.t2.k5(var1.t2)
               && this.s7 == var1.s7
               && this.x8 == var1.x8
               && this.n3 == var1.n3
               && this.y4 == var1.y4
               && this.e2 == var1.e2
               && this.t9 == var1.t9
               && this.z1 == var1.z1
               && this.t4 == var1.t4
               && this.q0 == var1.q0
               && this.z3 == var1.z3
               && this.k7 == var1.k7
               && (this.z8 != null ? this.z8.n5(var1.z8, true) : var1.z8 == null)
               && (this.w1 != null ? this.w1.n5(var1.w1, true) : var1.w1 == null)
               && (this.c4 != null ? this.c4.n5(var1.c4, true) : var1.c4 == null)
               && (this.y1 != null ? this.y1.n5(var1.y1, true) : var1.y1 == null)
               && this.a0 == var1.a0
               && this.d2 == var1.d2
               && com.aspose.slides.ms.System.d1.a6(this.d5, var1.d5)
               && com.aspose.slides.ms.System.d1.a6(this.s3, var1.s3)
               && this.p8 == var1.p8
               && this.f2 == var1.f2
               && this.o0 == var1.o0
               && this.z7 == var1.z7
               && this.v4 == var1.v4;
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((TEffectiveData)recoveredArg);
   }
}
