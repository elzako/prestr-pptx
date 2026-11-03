package com.aspose.slides;

class p5k {
   public static void n5(ICell var0, com.aspose.slides.internal.k4y.w3k var1, int var2, int var3, int var4, int var5, t5w var6) {
      if (var1 != null) {
         Cell var7 = (Cell)var0;
         z6z var8 = ((Cell)var0).l6();
         o4z.n5(var0.getTextFrame(), var1.a6(), var6);
         var0.getTextFrame().getTextFrameFormat().setWrapText((byte)1);
         com.aspose.slides.internal.k4y.b1r var9 = var1.u9();
         if (var9 != null) {
            ((CellFormat)var7.getCellFormat()).u3();
            i3z.n5(var7.getCellFormat().getBorderLeft(), var9.t9());
            i3z.n5(var7.getCellFormat().getBorderTop(), var9.t4());
            i3z.n5(var7.getCellFormat().getBorderDiagonalDown(), var9.z3());
            i3z.n5(var7.getCellFormat().getBorderDiagonalUp(), var9.m1());
            i3z.n5(var7.getCellFormat().getBorderRight(), var9.z1());
            i3z.n5(var7.getCellFormat().getBorderBottom(), var9.q0());
            x9f.n5(var7.getCellFormat().getFillFormat(), var9.m3(), var6);
            var0.setMarginLeft(var9.h0());
            var0.setMarginRight(var9.c8());
            var0.setMarginTop(var9.t2());
            var0.setMarginBottom(var9.s7());
            var0.setTextVerticalType(var9.x8() == -1 ? 0 : var9.x8());
            var0.setTextAnchorType(var9.n3() == -1 ? 0 : var9.n3());
            var0.setAnchorCenter(var9.y4());
            var8.n5(var9.e2());
            var8.n5(var9.k7());
            var8.l6(var9.z8());
            ((CellFormat)var7.getCellFormat()).a6();
         }

         var0.getTextFrame().getTextFrameFormat().setTextVerticalType(var0.getTextVerticalType());
         var8.n5(var1.h0());
      }
   }

   public static void n5(ICell var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.w3k> var1, g6c var2) {
      com.aspose.slides.internal.k4y.w3k var3 = (com.aspose.slides.internal.k4y.w3k)var1.invoke();
      Cell var4 = (Cell)var0;
      z6z var5 = var4.l6();
      o4z.n5(var0.getTextFrame(), new p5k$1(var3), var2);
      Cell var6 = var4.c8() ? var4.a6() : null;
      com.aspose.slides.internal.k4y.b1r var7 = var3.l6();
      i3z.n5(var4.getCellFormat().getBorderLeft(), new p5k$2(var7));
      i3z.n5(var4.getCellFormat().getBorderRight(), new p5k$3(var7));
      i3z.n5(var4.getCellFormat().getBorderTop(), new p5k$4(var7));
      i3z.n5(var4.getCellFormat().getBorderBottom(), new p5k$5(var7));
      i3z.n5(var4.getCellFormat().getBorderDiagonalDown(), new p5k$6(var7));
      i3z.n5(var4.getCellFormat().getBorderDiagonalUp(), new p5k$7(var7));
      x9f.n5(var4.getCellFormat().getFillFormat(), new p5k$8(var7), var2);
      var7.n5(var0.getMarginLeft());
      var7.l6(var0.getMarginRight());
      var7.k5(var0.getMarginTop());
      var7.u3(var0.getMarginBottom());
      var7.n5(var0.getTextVerticalType());
      var7.l6(var0.getTextAnchorType());
      var7.n5(var0.getAnchorCenter());
      var7.k5(var5.n5());
      var7.n5(var5.l6());
      var7.n5(var5.u3());
      if (var6 != null) {
         if (var6.u3().h0() != var4.u3().h0()) {
            var3.n5(true);
         } else {
            var3.l6(var6.getColSpan());
         }

         if (var6.u9().h0() != var4.u9().h0()) {
            var3.l6(true);
         } else {
            var3.n5(var6.getRowSpan());
         }
      } else {
         var3.l6(var0.getColSpan());
         var3.n5(var0.getRowSpan());
      }

      var3.n5(var5.k5());
   }
}
