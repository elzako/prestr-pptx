package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class c9g extends m4<PortionFormat, c9g> implements IPortionFormatEffectiveData {
   String u6;
   Hyperlink t1;
   Hyperlink a5;
   long h2;
   private Cell v0;
   private r0g f0;
   private Chart a3;
   private static final Object p3 = new Object();
   private static final c9g x9 = s7();

   private c9g() {
      this.y4();
   }

   c9g(PortionFormat var1, c9g var2) {
      super(var1);
      this.y4();
      this.l6(var2);
   }

   c9g(t3x var1) {
      super(var1);
      this.y4();
   }

   c9g(t3x var1, PortionFormat var2) {
      super(var1);
      this.y4();
      this.l6(var2);
   }

   c9g(t3x var1, c9g var2) {
      super(var1);
      this.y4();
      this.l6(var2);
   }

   c9g(t3x var1, c9g var2, PortionFormat var3) {
      super(var1);
      this.y4();
      this.l6(var2);
      this.l6(var3);
   }

   private void y4() {
      this.h2 = 4294967295L;
      this.u6 = null;
      this.t1 = null;
      this.a5 = null;
   }

   @Override
   public final String getBookmarkId() {
      return this.u6;
   }

   @Override
   public final IHyperlink getHyperlinkClick() {
      return this.t1;
   }

   @Override
   public final IHyperlink getHyperlinkMouseOver() {
      return this.a5;
   }

   final long t2() {
      return this.h2;
   }

   static c9g n5(PortionFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Portion.class)) {
         Portion var10 = (Portion)var1;
         if (var10.getParent_Immediate() == null) {
            return x9;
         }

         Paragraph var3 = var10.n3();
         TextFrame var4 = var3.x8().k5().u3();
         if (var4 != null) {
            IParagraph var5 = null;
            int var6 = var3.x8().indexOf(var3);
            if (var6 >= 0 && var6 < var4.getParagraphs().getCount()) {
               var5 = var4.getParagraphs().get_Item(var6);
            }

            if (var5 != null) {
               int var7 = var3.getPortions().indexOf(var10);
               IPortionCollection var8 = var5.getPortions();
               if (var7 >= 0 && var7 < var8.getCount()) {
                  Portion var9 = (Portion)var8.get_Item(var7);
                  return var9.l6().r4();
               }
            }
         }

         return var3.n5().t9().z3;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Paragraph.class)) {
         Paragraph var2 = (Paragraph)var1;
         return var2.n5().t9().z3;
      } else if (var1 == null) {
         return x9;
      } else {
         throw new NotImplementedException();
      }
   }

   static c9g s7() {
      c9g var0 = new c9g();
      var0.u3 = f6a.e2();
      var0.t2 = f6a.e2();
      var0.k7 = 18.0F;
      var0.d2 = 12.0F;
      var0.h2 = 0L;
      var0.u6 = null;
      var0.t1 = null;
      var0.a5 = null;
      return var0;
   }

   static c9g x8() {
      c9g var0 = new c9g();
      var0.u3 = f6a.e2();
      var0.t2 = f6a.e2();
      var0.k7 = 11.0F;
      var0.d2 = 10.0F;
      var0.h2 = 0L;
      var0.t1 = null;
      var0.a5 = null;
      return var0;
   }

   static c9g n3() {
      c9g var0 = new c9g();
      var0.u3 = f6a.e2();
      var0.t2 = f6a.e2();
      var0.k7 = 12.0F;
      var0.m3 = new FontData("+mn-lt");
      var0.d2 = 12.0F;
      var0.h2 = 0L;
      var0.t1 = null;
      var0.a5 = null;
      return var0;
   }

   final void l6(i7b var1) {
      if (var1 != null) {
         super.n5(var1);
         c9g var2 = (c9g)var1;
         this.h2 = var2.h2;
         this.u6 = var2.u6;
         this.t1 = var2.t1;
         this.a5 = var2.a5;
      }
   }

   void n5(i7b var1, PortionFormat var2) {
      this.l6(var1);
      this.l6(var2);
      GeometryShape var3 = null;
      GeometryShape[] var4 = new GeometryShape[]{var3};
      d0u.n5(GeometryShape.class, var2, var4);
      var3 = var4[0];
      if (var3 != null && var3.isGrouped()) {
         d0e var5 = var3.y1().h0();
         if (!var5.isNoEffects() && var5.getGlowEffect() != null) {
            this.a6.a6 = var5.a6;
            this.v4 = true;
         }
      }

      if (var3 != null && !com.aspose.slides.internal.v6g.k5.l6(var3, SmartArtShape.class)) {
         d0e var9 = var3.y1().h0();
         boolean var6 = var9 != null && !var9.isNoEffects() && var9.getOuterShadowEffect() != null;
         if (var6) {
            IFillFormatEffectiveData var7 = var3.getFillFormat().getEffective();
            if (var7.getFillType() == 0
               && var9.getOuterShadowEffect() != null
               && !((k0p)var9.getOuterShadowEffect()).u9()
               && !((k0p)var9.getOuterShadowEffect()).h0()) {
               this.a6.h0 = var9.h0;
               this.z7 = true;
            }
         }

         if (this.u9.getReflectionEffect() == null && var9 != null && !var9.isNoEffects() && var9.getReflectionEffect() != null) {
            this.a6.t2 = var9.t2;
            this.o0 = true;
         }
      }
   }

   final void l6(PortionFormat var1) {
      synchronized (p3) {
         if (var1.y2()) {
            return;
         }
      }

      super.n5(var1);
      if ((var1.y4().n5() & 4294967295L) != 4294967295L) {
         this.h2 = var1.y4().n5();
      }

      if (var1.getBookmarkId() != null) {
         this.u6 = var1.getBookmarkId();
      }

      if (var1.getHyperlinkClick() != null) {
         this.t1 = com.aspose.slides.internal.v6g.k5.n5(var1.getHyperlinkClick(), Hyperlink.class);
      }

      if (var1.getHyperlinkMouseOver() != null) {
         this.a5 = com.aspose.slides.internal.v6g.k5.n5(var1.getHyperlinkMouseOver(), Hyperlink.class);
      }
   }

   final void n5(IFontsEffectiveData var1, c7e var2) {
      if (var1 != null) {
         if (var1.getLatinFont() != null) {
            this.m3 = com.aspose.slides.internal.v6g.k5.n5(var1.getLatinFont(), FontData.class);
         }

         if (var1.getEastAsianFont() != null) {
            this.j5 = com.aspose.slides.internal.v6g.k5.n5(var1.getEastAsianFont(), FontData.class);
         }

         if (var1.getComplexScriptFont() != null) {
            this.r4 = com.aspose.slides.internal.v6g.k5.n5(var1.getComplexScriptFont(), FontData.class);
         }
      }

      if (var2 != null) {
         if (var2.n5() != -1) {
            this.s7 = var2.n5();
         }

         if (var2.l6() != -1) {
            this.x8 = var2.l6();
         }

         if (var2.h0().getColorType() != -1) {
            this.u3.t2().n5((ColorFormat)var2.h0());
         }
      }
   }

   @Override
   void n5(IBaseSlide var1) {
      IFontData var2 = null;
      if (var1 != null) {
         IThemeEffectiveData var3 = var1.createThemeEffective();
         IFontSchemeEffectiveData var4 = var3.getFontScheme();
         var2 = this.m3;
         if (this.i1) {
            this.f0 = this.W_();
            Cell[] var5 = new Cell[]{this.v0};
            d0u.n5(Cell.class, this.f0, var5);
            this.v0 = var5[0];
            if (this.v0 != null) {
               if (this.v0.n3().l6() != null && this.v0.n3().l6().u9() == 2) {
                  var2 = var4.getMajor().getLatinFont();
               } else {
                  var2 = var4.getMinor().getLatinFont();
               }
            }

            Chart[] var6 = new Chart[]{this.a3};
            d0u.n5(Chart.class, this.W_(), var6);
            this.a3 = var6[0];
            if (this.a3 != null) {
               IThemeEffectiveData var7 = this.a3.createThemeEffective();
               var2 = var7.getFontScheme().getMinor().getLatinFont();
            }
         } else if (var2.getFontName().charAt(0) == '+') {
            Chart[] var8 = new Chart[]{this.a3};
            d0u.n5(Chart.class, this.W_(), var8);
            this.a3 = var8[0];
            if (this.a3 != null) {
               var2 = d2n.n5(var2, this.a3.createThemeEffective().getFontScheme());
            }
         }
      }

      this.n5(var1, var2);
   }

   boolean n5(c9g var1) {
      return !super.n5(var1)
         ? false
         : this.h2 == var1.h2 && com.aspose.slides.ms.System.d1.a6(this.u6, var1.u6) && this.t1.equals(var1.t1) && this.a5.equals(var1.a5);
   }

   static c9g n5(PortionFormat var0, c9g var1) {
      return new c9g(var0, var1);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.c9g)recoveredArg);
   }
}
