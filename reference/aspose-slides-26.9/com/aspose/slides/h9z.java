package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;

class h9z extends x8<TextFrameFormat, h9z> implements ITextFrameFormatEffectiveData {
   private double u3 = Double.NaN;
   private double a6 = Double.NaN;
   private double u9 = Double.NaN;
   private double h0 = Double.NaN;
   private byte c8 = -1;
   private byte t2 = -1;
   private byte s7 = -1;
   private byte x8 = -1;
   private byte n3 = -1;
   private int y4 = 0;
   private double e2 = Double.NaN;
   private byte t9 = -1;
   private float z1 = Float.NaN;
   private byte t4 = -1;
   private a8r q0 = new a8r();
   private float z3 = Float.NaN;
   private float m1 = Float.NaN;
   private byte k7 = -1;
   private byte m3 = -1;
   private byte z8 = -1;
   private byte j5 = -1;
   private byte w1 = -1;
   private byte r4 = -1;
   private boolean c4 = false;
   static final h9z k5 = y4();

   h9z(TextFrameFormat var1) {
      super(var1);
   }

   @Override
   public final ITextStyleEffectiveData getTextStyle() {
      return !this.c4 ? this.W_().h0().getEffective() : null;
   }

   @Override
   public final double getMarginLeft() {
      return this.u3;
   }

   @Override
   public final double getMarginRight() {
      return this.a6;
   }

   @Override
   public final double getMarginTop() {
      return this.u9;
   }

   @Override
   public final double getMarginBottom() {
      return this.h0;
   }

   @Override
   public final boolean getWrapText() {
      return this.c8 == 1;
   }

   @Override
   public final byte getAnchoringType() {
      return this.t2;
   }

   @Override
   public final boolean getCenterText() {
      return this.s7 == 1;
   }

   @Override
   public final byte getTextVerticalType() {
      return this.x8;
   }

   @Override
   public final byte getAutofitType() {
      return this.n3;
   }

   @Override
   public final int getColumnCount() {
      return this.y4;
   }

   @Override
   public final float getColumnSpacing() {
      return (float)this.e2;
   }

   final a8r u9() {
      return this.q0;
   }

   final float h0() {
      return this.z3;
   }

   final float c8() {
      return this.m1;
   }

   final boolean t2() {
      return this.k7 == 1;
   }

   final byte s7() {
      return this.m3;
   }

   final boolean x8() {
      return this.z8 == 1;
   }

   final boolean n3() {
      return this.r4 == 1;
   }

   static h9z n5(TextFrameFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)) {
         TextFrame var7 = (TextFrame)var1;
         h9z var8 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var7.getParent_Immediate(), GeometryShape.class)) {
            GeometryShape var4 = (GeometryShape)var7.getParent_Immediate();
            GeometryShape var5 = com.aspose.slides.internal.v6g.k5.n5(var4.getBasePlaceholder(), GeometryShape.class);
            if (var5 != null) {
               TextFrame var6 = null;
               if (com.aspose.slides.internal.v6g.k5.l6(var5, AutoShape.class)) {
                  var6 = ((AutoShape)var5).l6();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var5, SmartArtShape.class)) {
                  var6 = ((SmartArtShape)var5).k5();
               }

               var8 = var6 != null ? var6.n5.d2() : k5;
            } else {
               var8 = k5;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var7.getParent_Immediate(), Cell.class)) {
            var8 = k5;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var7.getParent_Immediate(), IOverridableText.class)) {
            IOverridableText var9 = (IOverridableText)var7.getParent_Immediate();
            var8 = ((TextFrameFormat)var9.getTextFormat().getTextBlockFormat()).d2();
         }

         return var8;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IFormattedTextContainer.class)) {
         IFormattedTextContainer var2 = (IFormattedTextContainer)var1;
         Chart var3 = (Chart)var2.getChart();
         throw new NotImplementedException();
      } else if (var1 == null) {
         throw new Exception("textFrameFormatParent must not be null");
      } else {
         throw new NotImplementedException();
      }
   }

   private static h9z y4() {
      h9z var0 = new h9z((TextFrameFormat)null);
      var0.c4 = true;
      var0.u3 = 7.2;
      var0.a6 = 7.2;
      var0.u9 = 3.6;
      var0.h0 = 3.6;
      var0.c8 = 1;
      var0.t2 = 0;
      var0.s7 = 0;
      var0.x8 = 0;
      var0.n3 = 0;
      var0.y4 = 1;
      var0.e2 = 0.0;
      var0.t9 = 0;
      var0.z1 = 0.0F;
      var0.t4 = 0;
      var0.q0.n5 = 0;
      var0.z3 = 1.0F;
      var0.m1 = 0.0F;
      var0.k7 = 0;
      var0.m3 = 0;
      var0.z8 = 0;
      var0.j5 = 0;
      var0.w1 = 0;
      var0.r4 = 0;
      return var0;
   }

   final void n5(i7b var1) {
      h9z var2 = (h9z)var1;
      this.u3 = var2.u3;
      this.a6 = var2.a6;
      this.u9 = var2.u9;
      this.h0 = var2.h0;
      this.c8 = var2.c8;
      this.t2 = var2.t2;
      this.s7 = var2.s7;
      this.x8 = var2.x8;
      this.n3 = var2.n3;
      this.y4 = var2.y4;
      this.e2 = var2.e2;
      this.t9 = var2.t9;
      this.z1 = var2.z1;
      this.t4 = var2.t4;
      this.q0.n5((i7b)var2.q0);
      this.z3 = var2.z3;
      this.m1 = var2.m1;
      this.k7 = var2.k7;
      this.m3 = var2.m3;
      this.z8 = var2.z8;
      this.j5 = var2.j5;
      this.w1 = var2.w1;
      this.r4 = var2.r4;
   }

   void n5(i7b var1, TextFrameFormat var2) {
      this.n5(var1);
      TextFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getParent_Immediate(), TextFrame.class);
      Cell var4 = var3 != null ? com.aspose.slides.internal.v6g.k5.n5(var3.getParent_Immediate(), Cell.class) : null;
      if (!com.aspose.slides.ms.System.j8.n5(var2.getMarginLeft(), Double.NaN)) {
         this.u3 = var2.getMarginLeft();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getMarginRight(), Double.NaN)) {
         this.a6 = var2.getMarginRight();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getMarginTop(), Double.NaN)) {
         this.u9 = var2.getMarginTop();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getMarginBottom(), Double.NaN)) {
         this.h0 = var2.getMarginBottom();
      }

      if (var2.getWrapText() != -1) {
         this.c8 = var2.getWrapText();
      }

      if (var2.getAnchoringType() != -1) {
         this.t2 = var2.getAnchoringType();
      }

      if (var4 != null && var4.getTextAnchorType() != -1) {
         this.t2 = var4.getTextAnchorType();
      }

      if (var2.getCenterText() != -1) {
         this.s7 = var2.getCenterText();
      }

      if (var4 != null) {
         int var5 = var4.getAnchorCenter() ? 1 : 0;
         if (var5 != -1) {
            this.s7 = (byte)var5;
         }
      }

      if (var2.getTextVerticalType() != -1) {
         this.x8 = var2.getTextVerticalType();
      }

      if (var2.getAutofitType() != -1) {
         this.n3 = var2.getAutofitType();
      }

      if (var2.getColumnCount() != 0) {
         this.y4 = var2.getColumnCount();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getColumnSpacing(), Double.NaN)) {
         this.e2 = var2.getColumnSpacing();
      }

      if (var2.s7() != -1) {
         this.t9 = var2.s7();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.getRotationAngle(), Float.NaN)) {
         this.z1 = var2.getRotationAngle();
      }

      if (var2.x8() != -1) {
         this.t4 = var2.x8();
      }

      this.q0.n5(var2.c8());
      if (!com.aspose.slides.ms.System.j8.n5(var2.n3(), Float.NaN)) {
         this.z3 = var2.n3();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var2.y4(), Float.NaN)) {
         this.m1 = var2.y4();
      }

      if (var2.e2() != -1) {
         this.k7 = var2.e2();
      }

      if (var2.t9() != -1) {
         this.m3 = var2.t9();
      }

      if (var2.z1() != -1) {
         this.z8 = var2.z1();
      }

      if (var2.t4() != -1) {
         this.j5 = var2.t4();
      }

      this.w1 = (byte)(var2.q0() ? 0 : 1);
      if (var2.j5() != -1) {
         this.r4 = var2.j5();
      }
   }

   boolean n5(h9z var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.u3 == var1.u3
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
               && this.t4 == var1.t4
               && this.q0.n5(var1.q0)
               && this.z3 == var1.z3
               && this.m1 == var1.m1
               && this.k7 == var1.k7
               && this.m3 == var1.m3
               && this.z8 == var1.z8
               && this.j5 == var1.j5
               && this.w1 == var1.w1
               && this.r4 == var1.r4;
      }
   }

   static h9z n5(TextFrameFormat var0, h9z var1) {
      h9z var2 = new h9z(var0);
      if (var1 != null) {
         var2.n5((i7b)var1);
      }

      return var2;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.h9z)recoveredArg);
   }
}
