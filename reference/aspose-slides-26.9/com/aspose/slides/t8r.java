package com.aspose.slides;

final class t8r extends x8<LineFormat, t8r> implements ILineFormatEffectiveData {
   private double z3;
   private byte m1;
   float[] k5;
   byte u3;
   byte a6;
   byte u9;
   byte h0;
   float c8;
   byte t2;
   byte s7;
   byte x8;
   byte n3;
   byte y4;
   byte e2;
   z1a t9;
   z1z z1;
   static final t8r t4 = h0();
   static final t8r q0 = c8();

   t8r(LineFormat var1) {
      super(var1);
      this.t2();
   }

   t8r(q6z var1) {
      super(var1);
      this.t2();
   }

   private void t2() {
      this.z3 = Double.NaN;
      this.m1 = -1;
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
      this.t9 = new z1a();
      this.z1 = new z1z();
   }

   final void u9() {
      this.z3 = Double.NaN;
      this.m1 = -1;
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
      this.t9.n5();
      this.z1.n5();
   }

   @Override
   public final ILineFillFormatEffectiveData getFillFormat() {
      return this.t9;
   }

   @Override
   public final ISketchFormatEffectiveData getSketchFormat() {
      return this.z1;
   }

   @Override
   public final double getWidth() {
      return this.z3;
   }

   @Override
   public final byte getDashStyle() {
      return this.m1;
   }

   @Override
   public final float[] getCustomDashPattern() {
      return this.k5;
   }

   @Override
   public final byte getCapStyle() {
      return this.u3;
   }

   @Override
   public final byte getStyle() {
      return this.a6;
   }

   @Override
   public final byte getAlignment() {
      return this.u9;
   }

   @Override
   public final byte getJoinStyle() {
      return this.h0;
   }

   @Override
   public final float getMiterLimit() {
      return this.c8;
   }

   @Override
   public final byte getBeginArrowheadStyle() {
      return this.t2;
   }

   @Override
   public final byte getEndArrowheadStyle() {
      return this.s7;
   }

   @Override
   public final byte getBeginArrowheadWidth() {
      return this.x8;
   }

   @Override
   public final byte getEndArrowheadWidth() {
      return this.n3;
   }

   @Override
   public final byte getBeginArrowheadLength() {
      return this.y4;
   }

   @Override
   public final byte getEndArrowheadLength() {
      return this.e2;
   }

   @Override
   public final boolean equals(ILineFormatEffectiveData lf) {
      t8r var2 = com.aspose.slides.internal.v6g.k5.n5(lf, t8r.class);
      return var2 == null ? false : this.n5(var2);
   }

   static t8r h0() {
      t8r var0 = new t8r((LineFormat)null);
      var0.t9.n5 = 0;
      var0.t9.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.t9.h0().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.t9.h0().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      var0.z1.l6 = -1;
      var0.z1.n5 = 1219033472L;
      var0.z3 = 0.75;
      var0.m1 = 0;
      var0.k5 = null;
      var0.u3 = 2;
      var0.a6 = 0;
      var0.u9 = 0;
      var0.h0 = 0;
      var0.c8 = 10.0F;
      var0.t2 = 0;
      var0.s7 = 0;
      var0.x8 = 1;
      var0.n3 = 1;
      var0.y4 = 1;
      var0.e2 = 1;
      return var0;
   }

   static t8r c8() {
      t8r var0 = new t8r((LineFormat)null);
      var0.t9.n5 = 1;
      var0.t9.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.t9.h0().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.t9.h0().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      var0.z1.l6 = -1;
      var0.z1.n5 = 1219033472L;
      var0.z3 = 0.75;
      var0.m1 = 0;
      var0.k5 = null;
      var0.u3 = 2;
      var0.a6 = 0;
      var0.u9 = 0;
      var0.h0 = 2;
      var0.c8 = 10.0F;
      var0.t2 = 0;
      var0.s7 = 0;
      var0.x8 = 1;
      var0.n3 = 1;
      var0.y4 = 1;
      var0.e2 = 1;
      return var0;
   }

   static t8r n5(LineFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Table.class)) {
         return q0;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, Shape.class)) {
         Shape var6 = (Shape)var1;
         if (com.aspose.slides.internal.v6g.k5.l6(var6, GeometryShape.class) && ((GeometryShape)var6).getShapeStyle() != null) {
            IShapeStyle var8 = ((GeometryShape)var6).getShapeStyle();
            s8u var4 = (s8u)n5((q1v)var0).createThemeEffective();
            if (var4 != null) {
               t8r var5 = var4.l6(var8.getLineStyleIndex() & 65535);
               return var5 != null ? var5 : t4;
            } else {
               return t4;
            }
         } else {
            Shape var7 = (Shape)var6.getBasePlaceholder();
            return var7 != null ? var7.l6(var7).c8() : t4;
         }
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, FormatScheme.class)) {
            return t4;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, Cell.class)) {
            Cell var2 = (Cell)var1;
            t8r var3 = null;
            if (var0 == var2.getCellFormat().getBorderLeft()) {
               var3 = var2.x8().u9().h0();
            } else if (var0 == var2.getCellFormat().getBorderTop()) {
               var3 = var2.x8().u9().c8();
            } else if (var0 == var2.getCellFormat().getBorderRight()) {
               var3 = var2.x8().u9().t2();
            } else if (var0 == var2.getCellFormat().getBorderBottom()) {
               var3 = var2.x8().u9().s7();
            } else if (var0 == var2.getCellFormat().getBorderDiagonalDown()) {
               var3 = var2.x8().u9().x8();
            } else if (var0 == var2.getCellFormat().getBorderDiagonalUp()) {
               var3 = var2.x8().u9().n3();
            }

            if (var3 != null) {
               return var3;
            } else if (((Table)var2.getTable()).y2() != null) {
               return ((LineFormat)var2.getTable().getLineFormat()).c8();
            } else {
               return var0 != var2.getCellFormat().getBorderDiagonalDown() && var0 != var2.getCellFormat().getBorderDiagonalUp() ? q0 : t4;
            }
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(var1, z2x.class) ? t4 : t4;
         }
      }
   }

   final void n5(i7b var1) {
      t8r var2 = (t8r)var1;
      this.z3 = var2.z3;
      this.m1 = var2.m1;
      this.k5 = null;
      if (var2.k5 != null) {
         this.k5 = new float[var2.k5.length];
         com.aspose.slides.ms.System.u3.n5((Object)(var2.k5)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0);
      }

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
      this.t9.n5((i7b)var2.t9);
      this.z1.n5((i7b)var2.z1);
   }

   void n5(i7b var1, LineFormat var2) {
      this.n5(var1);
      this.l6(var2);
      IPresentationComponent var3 = var2.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var3, SmartArtShape.class)) {
         SmartArtShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, SmartArtShape.class);
         k7t var5 = var4.y4().c8();
         if (var5.t4()) {
            this.t9.n5 = 0;
         }

         if (var5.d2() != -1) {
            this.t2 = var5.d2();
         }

         if (var5.d5() != -1) {
            this.s7 = var5.d5();
         }
      }
   }

   final void l6(LineFormat var1) {
      if (!com.aspose.slides.ms.System.j8.n5(var1.getWidth(), Double.NaN)) {
         this.z3 = var1.getWidth();
      }

      if (var1.getDashStyle() != -1) {
         this.m1 = var1.getDashStyle();
      }

      if (var1.getCustomDashPattern() != null) {
         this.k5 = new float[var1.getCustomDashPattern().length];
         com.aspose.slides.ms.System.u3.n5((Object)(var1.getCustomDashPattern())).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0);
      }

      if (var1.getCapStyle() != -1) {
         this.u3 = var1.getCapStyle();
      }

      if (var1.getStyle() != -1) {
         this.a6 = var1.getStyle();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getAlignment(), (byte)-1)) {
         this.u9 = var1.getAlignment();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getJoinStyle(), (byte)-1)) {
         this.h0 = var1.getJoinStyle();
      }

      if (!com.aspose.slides.ms.System.j8.n5(var1.getMiterLimit(), Float.NaN)) {
         this.c8 = var1.getMiterLimit();
      }

      if (var1.getBeginArrowheadStyle() != -1) {
         this.t2 = var1.getBeginArrowheadStyle();
      }

      if (var1.getEndArrowheadStyle() != -1) {
         this.s7 = var1.getEndArrowheadStyle();
      }

      if (var1.getBeginArrowheadWidth() != -1) {
         this.x8 = var1.getBeginArrowheadWidth();
      }

      if (var1.getEndArrowheadWidth() != -1) {
         this.n3 = var1.getEndArrowheadWidth();
      }

      if (var1.getBeginArrowheadLength() != -1) {
         this.y4 = var1.getBeginArrowheadLength();
      }

      if (var1.getEndArrowheadLength() != -1) {
         this.e2 = var1.getEndArrowheadLength();
      }

      this.t9.n5((LineFillFormat)var1.getFillFormat());
      this.z1.n5((SketchFormat)var1.getSketchFormat());
   }

   static boolean k5(LineFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArtShape.class)) {
         SmartArtShape var2 = com.aspose.slides.internal.v6g.k5.n5(var1, SmartArtShape.class);
         if (var2.y4().c8().t4()) {
            return true;
         }

         if (var2.y4().c8().d2() != -1) {
            return true;
         }

         if (var2.y4().c8().d5() != -1) {
            return true;
         }
      }

      return false;
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      this.t9.n5(var1, var2);
   }

   boolean n5(t8r var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1)
            ? true
            : this.t9.equals(var1.t9)
               && this.z1.equals(var1.z1)
               && this.z3 == var1.z3
               && this.m1 == var1.m1
               && this.k5 == var1.k5
               && this.u3 == var1.u3
               && this.a6 == var1.a6
               && this.u9 == var1.u9
               && this.h0 == var1.h0
               && this.c8 == var1.c8
               && this.getBeginArrowheadStyle() == var1.getBeginArrowheadStyle()
               && this.getBeginArrowheadLength() == var1.getBeginArrowheadLength()
               && this.getBeginArrowheadWidth() == var1.getBeginArrowheadWidth()
               && this.getEndArrowheadStyle() == var1.getEndArrowheadStyle()
               && this.getEndArrowheadLength() == var1.getEndArrowheadLength()
               && this.getEndArrowheadWidth() == var1.getEndArrowheadWidth();
      }
   }

   static t8r n5(LineFormat var0, t8r var1) {
      t8r var2 = new t8r(var0);
      if (var1 != null) {
         var2.n5((i7b)var1);
      }

      return var2;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.t8r)recoveredArg);
   }
}
