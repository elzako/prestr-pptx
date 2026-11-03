package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

final class t3x extends x8<ParagraphFormat, t3x> implements IParagraphFormatEffectiveData, t4t {
   g9 k5;
   short u3;
   int a6;
   float u9;
   float h0;
   float c8;
   byte t2;
   byte s7;
   byte x8;
   byte n3;
   float y4;
   float e2;
   float t9;
   float z1;
   SortedList<Double, k8b> t4;
   int q0;
   final c9g z3;
   static final t3x m1 = n5(c9g.s7());
   private static final t3x k7 = new t3x((ParagraphFormat)null, null);

   t3x(ParagraphFormat var1, c9g var2) {
      super(var1);
      this.k5 = new g9(this);
      this.u9();
      if (var2 == null) {
         var2 = new c9g(this);
      }

      this.z3 = var2;
   }

   t3x(ParagraphFormat var1, t3x var2, int var3) {
      super(var1);
      this.u9();
      if (var2 != null) {
         this.k5 = new g9(this, var2.k5);
         this.n5(var2);
         this.z3 = new c9g(this, var2.z3);
      } else {
         this.z3 = new c9g(this);
         this.k5 = new g9(this);
      }
   }

   t3x(n1x var1, ParagraphFormat var2) {
      super(var1);
      this.k5 = new g9(this);
      this.u9();
      this.z3 = new c9g(this, var2.u3());
      this.k5(var2);
   }

   t3x(n1x var1, t3x var2, int var3) {
      super(var1);
      this.u9();
      this.k5 = new g9(this, var2.k5);
      this.n5(var2);
      this.z3 = new c9g(this, var2.z3);
   }

   t3x(n1x var1, t3x var2, ParagraphFormat var3) {
      super(var1);
      this.u9();
      this.k5 = new g9(this, var2.k5);
      this.n5(var2);
      this.z3 = new c9g(this, var2.z3, var3.u3());
      this.k5(var3);
   }

   final void u9() {
      this.u3 = -1;
      this.a6 = -1;
      this.u9 = Float.NaN;
      this.h0 = Float.NaN;
      this.c8 = Float.NaN;
      this.t2 = -1;
      this.s7 = -1;
      this.x8 = -1;
      this.n3 = -1;
      this.y4 = Float.NaN;
      this.e2 = Float.NaN;
      this.t9 = Float.NaN;
      this.z1 = Float.NaN;
      this.t4 = new SortedList<>();
      this.q0 = -1;
   }

   @Override
   public final i6m n5() {
      return this.k5;
   }

   @Override
   public final short l6() {
      return this.u3;
   }

   @Override
   public final IBulletFormatEffectiveData getBullet() {
      return this.k5;
   }

   @Override
   public final short getDepth() {
      return this.u3;
   }

   @Override
   public final int getAlignment() {
      return this.a6;
   }

   final float h0() {
      return this.u9;
   }

   @Override
   public final float getSpaceWithin() {
      if (this.W_() == null) {
         return this.u9;
      }

      Paragraph var1 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_ISlideComponent(), Paragraph.class);
      if (var1 != null && this.u9 >= 0.0F) {
         TextFrame var2 = var1.x8().k5();
         h9z var3 = var2.s7().d2();
         if (var3.getAutofitType() == 1) {
            float var4 = var3.c8();
            return com.aspose.slides.internal.n8e.v4.n5(this.u9 - var4 * 100.0F, 0.0F, Float.POSITIVE_INFINITY);
         }
      }

      return this.u9;
   }

   @Override
   public final float getSpaceBefore() {
      return this.h0;
   }

   @Override
   public final float getSpaceAfter() {
      return this.c8;
   }

   @Override
   public final boolean getEastAsianLineBreak() {
      return this.t2 == 1;
   }

   @Override
   public final boolean getRightToLeft() {
      return this.s7 == 1;
   }

   @Override
   public final boolean getLatinLineBreak() {
      return this.x8 == 1;
   }

   @Override
   public final boolean getHangingPunctuation() {
      return this.n3 == 1;
   }

   @Override
   public final float getMarginLeft() {
      return this.y4;
   }

   @Override
   public final float getMarginRight() {
      return this.e2;
   }

   @Override
   public final float getIndent() {
      return this.t9;
   }

   @Override
   public final float getDefaultTabSize() {
      return this.z1;
   }

   @Override
   public final ITabEffectiveData[] getTabs() {
      ITabEffectiveData[] var1 = new ITabEffectiveData[this.t4.size()];

      for (int var2 = 0; var2 < this.t4.size(); var2++) {
         var1[var2] = this.t4.getValues().get_Item(var2);
      }

      return var1;
   }

   @Override
   public final int getFontAlignment() {
      return this.q0;
   }

   @Override
   public final IPortionFormatEffectiveData getDefaultPortionFormat() {
      return this.z3;
   }

   static t3x n5(ParagraphFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (var1 == null) {
         return m1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Paragraph.class)) {
         Paragraph var6 = (Paragraph)var1;
         TextFrame var3 = var6.x8().k5();
         TextStyle var4 = (TextStyle)var3.getTextFrameFormat().getTextStyle();
         return (t3x)var4.getEffective().getLevel(var6.getParagraphFormat().getDepth() > 0 ? var6.getParagraphFormat().getDepth() : 0);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Field.class)) {
         Field var5 = (Field)var1;
         return var5.k5().n3().n5().t9();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IFormattedTextContainer.class)) {
         IFormattedTextContainer var2 = (IFormattedTextContainer)var1;
         return ((ParagraphFormat)var2.getTextFormat().getParagraphFormat()).t9();
      } else {
         throw new NotImplementedException();
      }
   }

   private static t3x n5(c9g var0) {
      t3x var1 = new t3x(null, var0);
      var1.k5 = g9.u9();
      var1.u3 = 0;
      var1.a6 = 0;
      var1.u9 = 100.0F;
      var1.h0 = 0.0F;
      var1.c8 = 0.0F;
      var1.t2 = 0;
      var1.s7 = 0;
      var1.x8 = 0;
      var1.n3 = 0;
      var1.y4 = 0.0F;
      var1.e2 = 0.0F;
      var1.t9 = 0.0F;
      var1.z1 = 72.0F;
      var1.q0 = 0;
      return var1;
   }

   static t3x c8() {
      return k7;
   }

   static t3x t2() {
      return n5(c9g.x8());
   }

   static t3x s7() {
      return n5(c9g.n3());
   }

   final void n5(t3x var1) {
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      this.x8 = var1.x8;
      this.n3 = var1.n3;
      this.y4 = var1.y4;
      this.e2 = var1.e2;
      this.t9 = var1.t9;
      this.z1 = var1.z1;
      this.t4.clear();
      IGenericEnumerator var2 = var1.t4.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            k8b var4 = new k8b();
            var4.n5((i7b)var3.getValue());
            this.t4.addItem(var4.getPosition(), var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.q0 = var1.q0;
   }

   static boolean l6(ParagraphFormat var0) {
      Paragraph var1 = com.aspose.slides.internal.v6g.k5.n5(var0.getParent_IPresentationComponent(), Paragraph.class);
      GeometryShape var2 = var1 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var1.x8().k5().getParent_Immediate(), GeometryShape.class);
      TextFrame var3 = var1 == null ? null : var1.x8().k5();
      IParagraphFormat var4 = var3 == null ? null : var3.getTextFrameFormat().getTextStyle().getLevel(var1.getParagraphFormat().getDepth());
      if (var2 != null && var2.getShapeStyle() != null && var4 == null) {
         IShapeStyle var5 = var2.getShapeStyle();
         IThemeEffectiveData var6 = var0.getSlide().createThemeEffective();
         IFontsEffectiveData var7 = null;
         switch (var5.getFontCollectionIndex()) {
            case 1:
               var7 = var6.getFontScheme().getMinor();
               break;
            case 2:
               var7 = var6.getFontScheme().getMajor();
         }

         if (var7 != null) {
            return true;
         }
      }

      if (var0.n3() != null) {
         Cell var8 = var0.n3();
         if (var8 != null && var8.n3() != null && var8.n3().l6() != null) {
            return true;
         }
      }

      return false;
   }

   private void n5(IFontsEffectiveData[] var1, c7e[] var2) {
      Paragraph var3 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_IPresentationComponent(), Paragraph.class);
      GeometryShape var4 = var3 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var3.x8().k5().getParent_Immediate(), GeometryShape.class);
      TextFrame var5 = var3 == null ? null : var3.x8().k5();
      IParagraphFormat var6 = var5 == null ? null : var5.getTextFrameFormat().getTextStyle().getLevel(var3.getParagraphFormat().getDepth());
      byte var7 = 0;
      if (var4 != null && var4.getShapeStyle() != null && var6 == null) {
         var7 = var4.getShapeStyle().getFontCollectionIndex();
      }

      Cell var8 = this.W_().n3();
      var2[0] = null;
      if (var8 != null && var8.n3() != null) {
         var2[0] = var8.n3().l6();
         if (var2[0] != null) {
            var7 = var2[0].u9();
         }
      }

      var1[0] = null;
      if (var7 != 0) {
         IThemeEffectiveData var9 = this.W_().getSlide().createThemeEffective();
         switch (var7) {
            case 1:
               var1[0] = var9.getFontScheme().getMinor();
               break;
            case 2:
               var1[0] = var9.getFontScheme().getMajor();
         }
      }
   }

   void n5(i7b var1, ParagraphFormat var2) {
      t3x var3 = (t3x)var1;
      this.k5.n5((i7b)var3.k5);
      this.n5(var3);
      this.z3.l6(var3.z3);
      IFontsEffectiveData var4 = null;
      c7e var5 = null;
      IFontsEffectiveData[] var6 = new IFontsEffectiveData[]{var4};
      c7e[] var7 = new c7e[]{var5};
      this.n5(var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      this.z3.n5(var4, var5);
      this.z3.l6(var2.u3());
      this.k5(var2);
      this.k5.k5(var2.l6());
   }

   final void k5(ParagraphFormat var1) {
      this.k5.l6(var1.l6());
      if (var1.u9() != -1) {
         this.u3 = var1.u9();
      }

      if (var1.getAlignment() != -1) {
         this.a6 = var1.getAlignment();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getSpaceWithin(), Float.NaN)) {
         this.u9 = var1.getSpaceWithin();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getSpaceBefore(), Float.NaN)) {
         this.h0 = var1.getSpaceBefore();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getSpaceAfter(), Float.NaN)) {
         this.c8 = var1.getSpaceAfter();
      }

      if (var1.getEastAsianLineBreak() != -1) {
         this.t2 = var1.getEastAsianLineBreak();
      }

      if (var1.getRightToLeft() != -1) {
         this.s7 = var1.getRightToLeft();
      }

      if (var1.getLatinLineBreak() != -1) {
         this.x8 = var1.getLatinLineBreak();
      }

      if (var1.getHangingPunctuation() != -1) {
         this.n3 = var1.getHangingPunctuation();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getMarginLeft(), Float.NaN)) {
         this.y4 = var1.getMarginLeft();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getMarginRight(), Float.NaN)) {
         this.e2 = var1.getMarginRight();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getIndent(), Float.NaN)) {
         this.t9 = var1.getIndent();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getDefaultTabSize(), Float.NaN)) {
         this.z1 = var1.getDefaultTabSize();
      }

      if (var1.x8() > 0) {
         this.t4.clear();

         for (int var2 = 0; var2 < var1.x8(); var2++) {
            k8b var3 = new k8b((Tab)var1.getTabs().get_Item(var2));
            this.t4.addItem(var3.getPosition(), var3);
         }
      }

      if (var1.getFontAlignment() != -1) {
         this.q0 = var1.getFontAlignment();
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.k5.n5(var1, var2);
      IGenericEnumerator var3 = this.t4.getValues().iterator();

      try {
         while (var3.hasNext()) {
            k8b var4 = (k8b)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.z3.n5(var1, var2);
   }

   @Override
   void n5(IBaseSlide var1) {
      this.k5.n5(var1);
      this.z3.n5(var1);
   }

   boolean l6(t3x var1) {
      if (var1 == null) {
         return false;
      }

      if (com.aspose.slides.ms.System.j8.l6(this, var1)) {
         return true;
      }

      if (this.t4.size() != var1.t4.size()) {
         return false;
      }

      IGenericEnumerator var2 = this.t4.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            double var3 = com.aspose.slides.internal.v6g.k5.u3(var2.next(), double.class);
            if (!var1.t4.containsKey(var3) || !this.t4.get_Item(var3).n5(var1.t4.get_Item(var3))) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var7 = var1.t4.getKeys().iterator();

      try {
         while (var7.hasNext()) {
            double var8 = com.aspose.slides.internal.v6g.k5.u3(var7.next(), double.class);
            if (!this.t4.containsKey(var8) || !var1.t4.get_Item(var8).n5(this.t4.get_Item(var8))) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return this.k5.n5(var1.k5)
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && this.n3 == var1.n3
         && this.y4 == var1.y4
         && this.e2 == var1.e2
         && this.t9 == var1.t9
         && this.z1 == var1.z1
         && this.q0 == var1.q0
         && this.z3.n5(var1.z3);
   }

   static t3x n5(ParagraphFormat var0, t3x var1) {
      return new t3x(var0, var1, 0);
   }

   // $VF: synthetic method
   @Override

   boolean n5(g8 recoveredArg) {
      return this.l6((com.aspose.slides.t3x)recoveredArg);
   }


}
