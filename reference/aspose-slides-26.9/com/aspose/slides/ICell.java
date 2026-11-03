package com.aspose.slides;

public interface ICell extends ISlideComponent {
   double getOffsetX();

   double getOffsetY();

   int getFirstRowIndex();

   int getFirstColumnIndex();

   double getWidth();

   double getHeight();

   double getMinimalHeight();

   double getMarginLeft();

   void setMarginLeft(double var1);

   double getMarginRight();

   void setMarginRight(double var1);

   double getMarginTop();

   void setMarginTop(double var1);

   double getMarginBottom();

   void setMarginBottom(double var1);

   byte getTextVerticalType();

   void setTextVerticalType(byte var1);

   byte getTextAnchorType();

   void setTextAnchorType(byte var1);

   boolean getAnchorCenter();

   void setAnchorCenter(boolean var1);

   IColumn getFirstColumn();

   IRow getFirstRow();

   int getColSpan();

   int getRowSpan();

   ITextFrame getTextFrame();

   ITable getTable();

   boolean isMergedCell();

   ICellFormat getCellFormat();

   void splitByColSpan(int var1);

   void splitByRowSpan(int var1);

   void splitByHeight(double var1);

   void splitByWidth(double var1);
}
