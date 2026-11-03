package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public final class Table extends GraphicalObject implements ITable {
   final RowCollection n5;
   final ColumnCollection l6;
   private g0h u3;
   private final TableFormat a6;
   com.aspose.slides.ms.System.o0 k5 = com.aspose.slides.ms.System.o0.n5.k5();
   private byte u9;

   Table(r0g parentImmediate) {
      super(parentImmediate, new r8x());
      this.a6 = new TableFormat(this);
      this.n5 = new RowCollection(this);
      this.l6 = this.n5.k5;
      this.n5(new m0m(this));
   }

   final m0m n5() {
      return (m0m)super.e5();
   }

   @Override
   public final ICell get_Item(int columnIndex, int rowIndex) {
      return this.n5.get_Item(rowIndex).get_Item(columnIndex);
   }

   @Override
   public final IRowCollection getRows() {
      return this.n5;
   }

   @Override
   public final IColumnCollection getColumns() {
      return this.l6;
   }

   @Override
   public final ITableFormat getTableFormat() {
      return this.a6;
   }

   @Override
   public final ICell mergeCells(ICell cell1, ICell cell2, boolean allowSplitting) {
      String var4 = "Can't break merged cells";
      Cell var5 = (Cell)cell1;
      Cell var6 = (Cell)cell2;
      if (var5 == var6) {
         return var5;
      }

      int var7 = com.aspose.slides.ms.System.q1.l6(var5.getFirstColumnIndex(), var6.getFirstColumnIndex());
      int var8 = com.aspose.slides.ms.System.q1.l6(var5.getFirstRowIndex(), var6.getFirstRowIndex());
      int var9 = com.aspose.slides.ms.System.q1.n5(var5.t2(), var6.t2());
      int var10 = com.aspose.slides.ms.System.q1.n5(var5.s7(), var6.s7());
      int var11 = var7;

      while (var11 < var9) {
         IColumn var12 = this.l6.get_Item(var11);
         Cell var13 = (Cell)var12.get_Item(var8);
         int var14 = var13.getFirstRowIndex();
         if (var14 < var8) {
            if (!allowSplitting) {
               throw new PptxEditException(var4);
            }

            var13.l6(var8 - var14);
         }

         var13 = (Cell)var12.get_Item(var10 - 1);
         int var15 = var13.getFirstRowIndex();
         if (var15 + var13.getRowSpan() > var10) {
            if (!allowSplitting) {
               throw new PptxEditException(var4);
            }

            var13.l6(var10 - var15);
         }

         var11 += var13.getColSpan();
      }

      var11 = var8;

      while (var11 < var10) {
         Row var17 = this.n5.n5(var11);
         Cell var19 = (Cell)var17.get_Item(var7);
         int var22 = var19.getFirstColumnIndex();
         if (var22 < var7) {
            if (!allowSplitting) {
               throw new PptxEditException(var4);
            }

            var19.n5(var7 - var22);
         }

         var19 = (Cell)var17.get_Item(var9 - 1);
         int var23 = var19.getFirstColumnIndex();
         if (var23 + var19.getColSpan() > var9) {
            if (!allowSplitting) {
               throw new PptxEditException(var4);
            }

            var19.n5(var10 - var23);
         }

         var11 += var19.getRowSpan();
      }

      Cell var21 = this.n5(var7, var8);
      var21.k5 = null;
      var21.l6 = var9 - var7;
      var21.n5 = var10 - var8;
      var21.l6(true);
      this.n5.n5(var8, var10 - var8);
      this.l6.n5(var7, var9 - var7);
      this.z1();
      return var21;
   }

   @Override
   public final int getStylePreset() {
      if (com.aspose.slides.ms.System.o0.n5(this.k5, com.aspose.slides.ms.System.o0.n5)) {
         return this.u9() == null ? 0 : -1;
      } else {
         return ((Presentation)this.getPresentation()).z8().l6(this.k5.k5());
      }
   }

   @Override
   public final void setStylePreset(int value) {
      if (value == 0) {
         this.n5((com.aspose.slides.z2x)null);
         com.aspose.slides.ms.System.o0.n5.k5(this.k5);
      } else if (value == -1) {
         if (this.u9() == null) {
            this.n5(new z2x(this, com.aspose.slides.ms.System.o0.n5.k5(), null));
         }

         com.aspose.slides.ms.System.o0.n5.k5(this.k5);
      } else {
         com.aspose.slides.ms.System.o0 var2 = ((Presentation)this.getPresentation()).z8().n5(value).k5();
         if (com.aspose.slides.ms.System.o0.n5(var2, com.aspose.slides.ms.System.o0.n5)) {
            return;
         }

         var2.k5(this.k5);
         this.n5(((Presentation)this.getPresentation()).z8().n5(var2.k5()));
      }

      this.z1();
   }

   @Override
   public final boolean getRightToLeft() {
      return (this.u9 & 255 & 1) != 0;
   }

   @Override
   public final void setRightToLeft(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 1);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 254);
      }
   }

   @Override
   public final boolean getFirstRow() {
      return (this.u9 & 255 & 2) != 0;
   }

   @Override
   public final void setFirstRow(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 2);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 253);
      }

      this.z1();
   }

   @Override
   public final boolean getFirstCol() {
      return (this.u9 & 255 & 4) != 0;
   }

   @Override
   public final void setFirstCol(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 4);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 251);
      }

      this.z1();
   }

   @Override
   public final boolean getLastRow() {
      return (this.u9 & 255 & 8) != 0;
   }

   @Override
   public final void setLastRow(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 8);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 247);
      }

      this.z1();
   }

   @Override
   public final boolean getLastCol() {
      return (this.u9 & 255 & 16) != 0;
   }

   @Override
   public final void setLastCol(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 16);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 239);
      }

      this.z1();
   }

   @Override
   public final boolean getHorizontalBanding() {
      return (this.u9 & 255 & 32) != 0;
   }

   @Override
   public final void setHorizontalBanding(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 32);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 223);
      }

      this.z1();
   }

   @Override
   public final boolean getVerticalBanding() {
      return (this.u9 & 255 & 64) != 0;
   }

   @Override
   public final void setVerticalBanding(boolean value) {
      if (value) {
         this.u9 = (byte)(this.u9 & 0xFF | 64);
      } else {
         this.u9 = (byte)(this.u9 & 0xFF & 191);
      }

      this.z1();
   }

   @Override
   public final void setTextFormat(IPortionFormat source) {
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            List$Enumerator var4 = var3.u3.iterator();

            try {
               while (var4.hasNext()) {
                  Cell var5 = (Cell)var4.next();
                  IGenericEnumerator var6 = var5.getTextFrame().getParagraphs().iterator();

                  try {
                     while (var6.hasNext()) {
                        Paragraph var7 = (Paragraph)var6.next();
                        IGenericEnumerator var8 = var7.getPortions().iterator();

                        try {
                           while (var8.hasNext()) {
                              Portion var9 = (Portion)var8.next();
                              ((PortionFormat)var9.getPortionFormat()).l6((BasePortionFormat)source);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                              var8.dispose();
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(IParagraphFormat source) {
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            List$Enumerator var4 = var3.u3.iterator();

            try {
               while (var4.hasNext()) {
                  Cell var5 = (Cell)var4.next();
                  IGenericEnumerator var6 = var5.getTextFrame().getParagraphs().iterator();

                  try {
                     while (var6.hasNext()) {
                        Paragraph var7 = (Paragraph)var6.next();
                        ((ParagraphFormat)var7.getParagraphFormat()).n5(source);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(ITextFrameFormat source) {
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            List$Enumerator var4 = var3.u3.iterator();

            try {
               while (var4.hasNext()) {
                  Cell var5 = (Cell)var4.next();
                  ((TextFrameFormat)var5.getTextFrame().getTextFrameFormat()).l6(source);
                  var5.n5(source);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final r8x k5() {
      return (r8x)super.t4();
   }

   final z2x u9() {
      return this.k5().n5();
   }

   final void n5(z2x var1) {
      this.k5().n5(var1);
   }

   @Override
   public IFillFormat getFillFormat() {
      return this.getTableFormat().getFillFormat();
   }

   final g0h x8() {
      if (this.u3 == null) {
         this.u3 = new g0h(this);
      }

      return this.u3;
   }

   final TableFormat y4() {
      return (TableFormat)this.getTableFormat();
   }

   static ILineFormat n5(Cell var0, Cell var1, boolean var2) {
      if (var0 == null && var1 == null) {
         return null;
      }

      if (var0 == null) {
         ILineFormat var9 = var1.getCellFormat().getBorderTop();
         if (var2) {
            var9 = var1.getCellFormat().getBorderLeft();
         }

         if (var9.getFillFormat().getFillType() == -1 || var9.getFillFormat().getFillType() == 0) {
            ILineFormat var11 = var1.a6().getCellFormat().getBorderTop();
            if (var2) {
               var11 = var1.a6().getCellFormat().getBorderLeft();
            }

            if (var11.getFillFormat().getFillType() != -1 && var11.getFillFormat().getFillType() != 0) {
               var9 = var11;
            }
         }

         return var9;
      } else if (var1 == null) {
         ILineFormat var8 = var0.getCellFormat().getBorderBottom();
         if (var2) {
            var8 = var0.getCellFormat().getBorderRight();
         }

         if (var8.getFillFormat().getFillType() == -1 || var8.getFillFormat().getFillType() == 0) {
            ILineFormat var10 = var0.a6().getCellFormat().getBorderBottom();
            if (var2) {
               var10 = var0.a6().getCellFormat().getBorderRight();
            }

            if (var10.getFillFormat().getFillType() != -1 && var10.getFillFormat().getFillType() != 0) {
               var8 = var10;
            }
         }

         return var8;
      } else {
         if (var1.c8() && var1.a6() == var0.a6()) {
            return null;
         }

         ILineFormat var4 = var0.getCellFormat().getBorderBottom();
         if (var2) {
            var4 = var0.getCellFormat().getBorderRight();
         }

         ILineFormat var5 = var1.getCellFormat().getBorderTop();
         if (var2) {
            var5 = var1.getCellFormat().getBorderLeft();
         }

         boolean var6 = var4.getFillFormat().getFillType() == -1 || var4.getFillFormat().getFillType() == 0;
         boolean var7 = var5.getFillFormat().getFillType() == -1 || var5.getFillFormat().getFillType() == 0;
         if (var6 && var7) {
            ILineFormat var3;
            if (var2) {
               if (var0.a6().u9().h0() > var1.a6().u9().h0()) {
                  var3 = var0.a6().getCellFormat().getBorderRight();
               } else {
                  var3 = var1.a6().getCellFormat().getBorderLeft();
               }
            } else if (var0.a6().u3().h0() > var1.a6().u3().h0()) {
               var3 = var0.a6().getCellFormat().getBorderBottom();
            } else {
               var3 = var1.a6().getCellFormat().getBorderTop();
            }

            return var3;
         } else {
            return !var7 && !var1.c8() ? var5 : var4;
         }
      }
   }

   static ILineFormat l6(Cell var0, Cell var1, boolean var2) {
      if (var0 == null && var1 == null) {
         return null;
      }

      if (var0 == null) {
         ILineFormat var10 = var2 ? var1.getCellFormat().getBorderLeft() : var1.getCellFormat().getBorderTop();
         if (var1.c8()) {
            ILineFormat var12 = var2 ? var1.a6().getCellFormat().getBorderLeft() : var1.a6().getCellFormat().getBorderTop();
            if (var12.getFillFormat().getFillType() != -1) {
               var10 = var12;
            }
         }

         return var10;
      } else if (var1 == null) {
         ILineFormat var9 = var2 ? var0.getCellFormat().getBorderRight() : var0.getCellFormat().getBorderBottom();
         if (var0.c8()) {
            ILineFormat var11 = var2 ? var0.a6().getCellFormat().getBorderRight() : var0.a6().getCellFormat().getBorderBottom();
            if (var11.getFillFormat().getFillType() != -1) {
               var9 = var11;
            }
         }

         return var9;
      } else {
         if (var1.c8() && var1.a6() == var0.a6()) {
            return null;
         }

         ILineFormat var4 = var2 ? var0.getCellFormat().getBorderRight() : var0.getCellFormat().getBorderBottom();
         ILineFormat var5 = var2 ? var1.getCellFormat().getBorderLeft() : var1.getCellFormat().getBorderTop();
         boolean var6 = var4.getFillFormat().getFillType() == -1;
         boolean var7 = var5.getFillFormat().getFillType() == -1;
         if (var6 && var7) {
            ILineFormat var3;
            if (var2) {
               if (var0.a6().u9().h0() > var1.a6().u9().h0()) {
                  var3 = var0.a6().getCellFormat().getBorderRight();
               } else {
                  var3 = var1.a6().getCellFormat().getBorderLeft();
               }
            } else if (var0.a6().u3().h0() > var1.a6().u3().h0()) {
               var3 = var0.a6().getCellFormat().getBorderBottom();
            } else {
               var3 = var1.a6().getCellFormat().getBorderTop();
            }

            return var3;
         } else {
            if (var0.c8()) {
               ILineFormat var8 = null;
               if (var2) {
                  if (var0.a6().getCellFormat().getBorderRight().getFillFormat().getFillType() == 0 || var0.a6().u9().h0() >= var1.a6().u9().h0()) {
                     var8 = var0.a6().getCellFormat().getBorderRight();
                  }
               } else if (var0.a6().getCellFormat().getBorderBottom().getFillFormat().getFillType() == 0 || var0.a6().u3().h0() >= var1.a6().u3().h0()) {
                  var8 = var0.a6().getCellFormat().getBorderBottom();
               }

               if (var8 != null && var8.getFillFormat().getFillType() != -1) {
                  var4 = var8;
               }
            }

            if (var1.c8()) {
               ILineFormat var15 = null;
               if (var2) {
                  if (var1.a6().getCellFormat().getBorderLeft().getFillFormat().getFillType() == 0 || var0.a6().u9().h0() <= var1.a6().u9().h0()) {
                     var15 = var1.a6().getCellFormat().getBorderLeft();
                  }
               } else if (var1.a6().getCellFormat().getBorderTop().getFillFormat().getFillType() == 0 || var0.a6().u3().h0() <= var1.a6().u3().h0()) {
                  var15 = var1.a6().getCellFormat().getBorderTop();
               }

               if (var15 != null && var15.getFillFormat().getFillType() != -1) {
                  var5 = var15;
               }
            }

            var6 = var4.getFillFormat().getFillType() == -1 || var0.c8() && ((LineFormat)var4).getParent_Immediate() == (r0g)var0.getCellFormat();
            var7 = var5.getFillFormat().getFillType() == -1 || var1.c8() && ((LineFormat)var5).getParent_Immediate() == (r0g)var1.getCellFormat();
            return var6 && !var7 ? var5 : var4;
         }
      }
   }

   final void e2() {
      this.n5.k5();
      this.l6.u3();
   }

   final void n5(double[] var1, double[] var2) {
      this.e2();

      for (int var3 = 0; var3 < var1.length; var3++) {
         this.l6.n5(var1[var3]);
      }

      for (int var4 = 0; var4 < var2.length; var4++) {
         this.n5.n5(com.aspose.slides.ms.System.q1.l6(var2[var4], 0.0));
      }

      this.z1();
   }

   final Cell n5(int var1, int var2) {
      return this.n5.n5(var2).n5(var1);
   }

   @Override
   void n5(e4c var1, e4c var2, x4t var3) {
      super.n5(var1.u9(), var2.u9(), var3.n5());
      this.n5().q0();
   }

   @Override
   void s7() {
      super.s7();
      this.n5(((Slide)this.j9()).w1().l6(this.getPlaceholder().getIndex()).p8());
   }

   final void z1() {
      this.n5().l6();
      this.u3 = null;
   }

   @Override
   void c8() {
      IGenericEnumerator var1 = this.getRows().iterator();

      try {
         while (var1.hasNext()) {
            Row var2 = (Row)var1.next();
            IGenericEnumerator var3 = var2.iterator();

            try {
               while (var3.hasNext()) {
                  Cell var4 = (Cell)var3.next();
                  var4.n5(false);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.n5().u3();
   }

   @Override
   void n5(float var1, float var2, float var3) {
      super.n5((float)var1, var2, var3);
      IGenericEnumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            Row var5 = (Row)var4.next();
            List$Enumerator var6 = var5.u3.iterator();

            try {
               while (var6.hasNext()) {
                  Cell var7 = (Cell)var6.next();
                  TextFrame var8 = (TextFrame)var7.getTextFrame();
                  if (var8 == null) {
                     return;
                  }

                  Shape[] var9 = this.f2();
                  TextFrameFormat var10 = (TextFrameFormat)var8.getTextFrameFormat();
                  var10.h0().n5(var3);
                  var7.setMarginTop(var7.getMarginTop() * var3);
                  var7.setMarginLeft(var7.getMarginLeft() * var3);
                  var7.setMarginRight(var7.getMarginRight() * var3);
                  var7.setMarginBottom(var7.getMarginBottom() * var3);
                  IGenericEnumerator var11 = var8.getParagraphs().iterator();

                  try {
                     while (var11.hasNext()) {
                        Paragraph var12 = (Paragraph)var11.next();
                        var12.n5().n5(var3);
                        IGenericEnumerator var13 = var12.getPortions().iterator();

                        try {
                           while (var13.hasNext()) {
                              Portion var14 = (Portion)var13.next();
                              var14.l6().n5(var3);
                              if (com.aspose.slides.ms.System.n1.k5(var14.l6().getFontHeight()) && var9.length == 0) {
                                 var14.l6().setFontHeight(var14.l6().r4().h0());
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                              var13.dispose();
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        var11.dispose();
                     }
                  }

                  var10.n5(c0u.n5(var10.u3(), var3).l6());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            var5.setMinimalHeight(var5.getMinimalHeight() * var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IGenericEnumerator var50 = this.l6.iterator();

      try {
         while (var50.hasNext()) {
            IColumn var51 = (IColumn)var50.next();
            var51.setWidth(var51.getWidth() * var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var50, IDisposable.class)) {
            var50.dispose();
         }
      }
   }

   @Override
   IFillFormatEffectiveData z3() {
      return this.getTableFormat().getEffective().getFillFormat();
   }

   @Override
   void k5(float var1) {
      if (!this.d5()) {
         this.n5(var1);
         double var2 = var1 / this.n5.l6();
         IGenericEnumerator var4 = this.getRows().iterator();

         try {
            while (var4.hasNext()) {
               IRow var5 = (IRow)var4.next();
               var5.setMinimalHeight(var2 * var5.getHeight());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         super.k5(var1);
      }
   }

   @Override
   void l6(float var1) {
      if (!this.d5()) {
         this.n5(var1);
         double var2 = var1 / this.l6.k5();
         IGenericEnumerator var4 = this.getColumns().iterator();

         try {
            while (var4.hasNext()) {
               IColumn var5 = (IColumn)var4.next();
               var5.setWidth(var2 * var5.getWidth());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         super.l6(var1);
      }
   }

   private void n5(float var1) {
      if (var1 < 0.0F || com.aspose.slides.ms.System.n1.k5(var1) || com.aspose.slides.ms.System.n1.l6(var1)) {
         throw new ArgumentException("Value must be a non-negative finite number.");
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   r8x t4() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   r8x h0() {
      return this.k5();
   }

}
