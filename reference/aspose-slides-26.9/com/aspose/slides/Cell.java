package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;

public class Cell implements ICell, r0g {
   private final TextFrameFormat$n5 u3 = new Cell$1(this);
   private Row a6;
   private Column u9;
   private final z6z h0 = new z6z();
   private final TextFrame c8;
   int n5 = 1;
   int l6 = 1;
   Cell k5 = null;
   private final CellFormat t2;
   private c0u s7 = new c0u();
   private byte x8 = 0;
   private byte n3 = 0;
   private boolean y4 = false;
   private boolean e2 = true;

   Cell(Row parentRow, Column parentColumn) {
      this.s7 = new c0u();
      this.s7.l6 = 7.2;
      this.s7.k5 = 3.6;
      this.s7.u3 = 7.2;
      this.s7.a6 = 3.6;
      this.a6 = parentRow;
      this.u9 = parentColumn;
      this.c8 = new TextFrame(this);
      this.c8.n5.k5 = this.u3;
      this.t2 = new CellFormat(this);
      this.e2 = true;
   }

   @Override
   public final double getOffsetX() {
      return this.a6().u3().c8();
   }

   @Override
   public final double getOffsetY() {
      if (this.k5() != null && this.k5().x9() != null && this.k5().x9().getParentGroup() != null) {
         this.k5().e5().k5();
      }

      return this.a6().u9().c8();
   }

   @Override
   public final int getFirstRowIndex() {
      return this.a6().u9().h0();
   }

   @Override
   public final int getFirstColumnIndex() {
      return this.a6().u3().h0();
   }

   @Override
   public final double getWidth() {
      Cell var1 = this.a6();
      Column var2 = this.u3().u9().n5(var1.u3().h0() + var1.getColSpan() - 1);
      return var1.getColSpan() == 1 ? var2.getWidth() : var2.c8() + var2.getWidth() - var1.u3().c8();
   }

   @Override
   public final double getHeight() {
      Cell var1 = this.a6();
      Row var2 = this.u9().u9().n5(var1.u9().h0() + var1.getRowSpan() - 1);
      return var1.getRowSpan() == 1 ? var2.getHeight() : var2.c8() + var2.getHeight() - var1.u9().c8();
   }

   @Override
   public final double getMinimalHeight() {
      int var1 = this.getFirstRowIndex();
      RowCollection var2 = this.u9().u9();
      double var3 = 0.0;

      for (int var5 = 0; var5 < this.n5; var5++) {
         var3 += var2.n5(var1 + var5).getMinimalHeight();
      }

      return var3;
   }

   final c0u n5() {
      return this.s7;
   }

   final void n5(c0u var1) {
      var1.l6(this.s7);
      this.e2();
   }

   @Override
   public final double getMarginLeft() {
      return this.s7.l6;
   }

   @Override
   public final void setMarginLeft(double value) {
      this.s7.l6 = value;
      this.e2();
   }

   @Override
   public final double getMarginRight() {
      return this.s7.u3;
   }

   @Override
   public final void setMarginRight(double value) {
      this.s7.u3 = value;
      this.e2();
   }

   @Override
   public final double getMarginTop() {
      return this.s7.k5;
   }

   @Override
   public final void setMarginTop(double value) {
      this.s7.k5 = value;
      this.e2();
   }

   @Override
   public final double getMarginBottom() {
      return this.s7.a6;
   }

   @Override
   public final void setMarginBottom(double value) {
      this.s7.a6 = value;
      this.e2();
   }

   @Override
   public final byte getTextVerticalType() {
      return this.x8;
   }

   @Override
   public final void setTextVerticalType(byte value) {
      if (value == -1) {
         throw new Exception(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Value of Cell.TextVerticalType property cannot be ", "TextVerticalType.NotDefined. Set TextVerticalType.Horizontal default value instead."
            })
         );
      }

      this.x8 = value;
      this.e2();
   }

   @Override
   public final byte getTextAnchorType() {
      return this.n3;
   }

   @Override
   public final void setTextAnchorType(byte value) {
      if (value == -1) {
         throw new Exception(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Value of Cell.TextAnchorType property cannot be ", "TextAnchorType.NotDefined. Set TextAnchorType.Top default value instead."
            })
         );
      }

      this.n3 = value;
      this.e2();
      this.c8.n5.c4();
   }

   @Override
   public final boolean getAnchorCenter() {
      return this.y4;
   }

   @Override
   public final void setAnchorCenter(boolean value) {
      this.y4 = value;
      this.e2();
      this.c8.n5.c4();
   }

   @Override
   public final IRow getFirstRow() {
      return this.a6().u9();
   }

   @Override
   public final IColumn getFirstColumn() {
      return this.a6().u3();
   }

   @Override
   public final int getColSpan() {
      return this.l6;
   }

   @Override
   public final int getRowSpan() {
      return this.n5;
   }

   @Override
   public final ITextFrame getTextFrame() {
      return this.c8;
   }

   @Override
   public final ITable getTable() {
      return this.k5();
   }

   @Override
   public final boolean isMergedCell() {
      return this.h0() || this.c8();
   }

   @Override
   public final ICellFormat getCellFormat() {
      return this.t2;
   }

   @Override
   public final void splitByColSpan(int index) {
      if (index >= 1 && index < this.l6) {
         this.n5(index);
      } else {
         throw new ArgumentOutOfRangeException("Index must be grater than 0 and less than ColSpan.");
      }
   }

   @Override
   public final void splitByRowSpan(int index) {
      if (index >= 1 && index < this.n5) {
         this.l6(index);
      } else {
         throw new ArgumentOutOfRangeException("Index must be greater than 0 and less than RowSpan.");
      }
   }

   @Override
   public final void splitByHeight(double height) {
      double var3 = 3.937007874015748E-5;
      height = com.aspose.slides.ms.System.q1.u3(height * 12700.0) / 12700.0;
      double var5 = this.getHeight();
      if (!(height <= 0.0) && !(height >= var5)) {
         RowCollection var7 = this.u9().u9();
         int var8 = this.getFirstRowIndex();

         int var9;
         for (var9 = var8; var7.get_Item(var9).getHeight() <= height; var9++) {
            height -= var7.get_Item(var9).getHeight();
         }

         if (height > var3) {
            var7.l6(var9, height);
            var9++;
         }

         this.l6(var9 - var8);
      } else {
         throw new ArgumentOutOfRangeException("Splitting height must be in greater than 0 and less than cell's minimal height");
      }
   }

   @Override
   public final void splitByWidth(double width) {
      double var3 = this.getWidth();
      if (!(width <= 0.0) && !(width >= var3)) {
         ColumnCollection var5 = this.u3().u9();

         int var6;
         for (var6 = this.getFirstColumnIndex(); var5.get_Item(var6).getWidth() <= width; var6++) {
            width -= var5.get_Item(var6).getWidth();
         }

         if (width > 0.0) {
            var5.l6(var6, width);
            var6++;
         }

         this.n5(var6 - this.getFirstColumnIndex());
      } else {
         throw new ArgumentOutOfRangeException("Splitting width must be in greater than 0 and less than cell's width");
      }
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.u9() != null ? this.u9().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.u9().getPresentation();
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   final z6z l6() {
      return this.h0;
   }

   final Table k5() {
      return this.u9().n5();
   }

   final Column u3() {
      return this.u9;
   }

   final Cell a6() {
      return this.c8() ? this.k5 : this;
   }

   final Row u9() {
      return this.a6;
   }

   final boolean h0() {
      return this.n5 > 1 || this.l6 > 1;
   }

   final boolean c8() {
      return this.k5 != null;
   }

   final int t2() {
      return this.a6().u3().h0() + this.a6().getColSpan();
   }

   final int s7() {
      return this.a6().u9().h0() + this.a6().getRowSpan();
   }

   final void n5(boolean var1) {
      if (var1) {
         this.e2();
      } else {
         this.e2 = false;
      }
   }

   final CellFormat x8() {
      return this.t2;
   }

   final d7f n3() {
      return this.k5().x8().n5(this.u3().h0(), this.u9().h0());
   }

   final void y4() {
      this.k5 = null;
      this.a6 = null;
      this.u9 = null;
   }

   final void l6(boolean var1) {
      this.k5 = null;
      if (this.h0()) {
         int var2 = this.getFirstRowIndex();
         int var3 = this.getFirstColumnIndex();
         Row var4 = this.u9().u9().n5(var2);

         for (int var5 = 1; var5 < this.l6; var5++) {
            if (var3 + var5 > var4.size() - 1) {
               this.l6 = var5;
               break;
            }

            this.n5(var4.n5(var3 + var5), var1);
         }

         for (int var8 = 1; var8 < this.n5; var8++) {
            if (var2 + var8 > this.u9().u9().size() - 1) {
               this.n5 = var8;
               return;
            }

            var4 = this.u9().u9().n5(var2 + var8);

            for (int var6 = 0; var6 < this.l6; var6++) {
               this.n5(var4.n5(var3 + var6), var1);
            }
         }
      }
   }

   final void n5(Cell var1) {
      this.c8.n5((ITextFrame)var1.c8);
      ((LineFormat)this.t2.getBorderLeft()).n5((ILineFormat)((LineFormat)var1.t2.getBorderLeft()));
      ((LineFormat)this.t2.getBorderTop()).n5((ILineFormat)((LineFormat)var1.t2.getBorderTop()));
      ((LineFormat)this.t2.getBorderRight()).n5((ILineFormat)((LineFormat)var1.t2.getBorderRight()));
      ((LineFormat)this.t2.getBorderBottom()).n5((ILineFormat)((LineFormat)var1.t2.getBorderBottom()));
      ((LineFormat)this.t2.getBorderDiagonalDown()).n5((ILineFormat)((LineFormat)var1.t2.getBorderDiagonalDown()));
      ((LineFormat)this.t2.getBorderDiagonalUp()).n5((ILineFormat)((LineFormat)var1.t2.getBorderDiagonalUp()));
      ((FillFormat)this.t2.getFillFormat()).n5((IFillFormat)((FillFormat)var1.t2.getFillFormat()));
      var1.s7.l6(this.s7);
      this.x8 = var1.x8;
      this.n3 = var1.n3;
      this.y4 = var1.y4;
      this.l6().n5(var1.l6());
   }

   final void n5(ITextFrameFormat var1) {
      if (var1.getAnchoringType() != -1) {
         this.n3 = var1.getAnchoringType();
      }

      if (var1.getTextVerticalType() != -1) {
         this.x8 = var1.getTextVerticalType();
      }

      TextFrameFormat.n5(var1).n5(this.s7.l6()).l6(this.s7);
      this.e2();
      this.c8.n5.c4();
   }

   final Cell n5(int var1) {
      Cell var2 = this.u9().n5(this.getFirstColumnIndex() + var1);
      var2.n5 = this.n5;
      var2.l6 = this.l6 - var1;
      this.l6 = var1;
      var2.l6(false);
      var2.n5(this);
      var2.n5(true);
      ((TextFrame)var2.getTextFrame()).n5("");
      this.n5(true);
      this.k5().z1();
      return var2;
   }

   final Cell l6(int var1) {
      Cell var2 = this.u3().n5(this.getFirstRowIndex() + var1);
      var2.l6 = this.l6;
      var2.n5 = this.n5 - var1;
      this.n5 = var1;
      var2.l6(false);
      var2.n5(this);
      ((TextFrame)var2.getTextFrame()).n5("");
      this.k5().z1();
      return var2;
   }

   final void e2() {
      if (!this.e2 && this.u9() != null && this.k5() != null) {
         this.e2 = true;
         this.k5().z1();
      }
   }

   private void n5(Cell var1, boolean var2) {
      if (var2 && !"".equals(((TextFrame)var1.getTextFrame()).t2())) {
         this.getTextFrame().getParagraphs().add(var1.getTextFrame().getParagraphs());
         ((TextFrame)var1.getTextFrame()).n5("");
      }

      var1.k5 = this;
   }

   private void t9() {
      this.e2();
   }

   // $VF: synthetic method
   static void l6(Cell var0) {
      var0.t9();
   }
}
