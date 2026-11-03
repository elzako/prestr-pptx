package com.aspose.slides;

public interface ITable extends IBulkTextFormattable, IGraphicalObject {
   ICell get_Item(int var1, int var2);

   IRowCollection getRows();

   IColumnCollection getColumns();

   ITableFormat getTableFormat();

   int getStylePreset();

   void setStylePreset(int var1);

   boolean getRightToLeft();

   void setRightToLeft(boolean var1);

   boolean getFirstRow();

   void setFirstRow(boolean var1);

   boolean getFirstCol();

   void setFirstCol(boolean var1);

   boolean getLastRow();

   void setLastRow(boolean var1);

   boolean getLastCol();

   void setLastCol(boolean var1);

   boolean getHorizontalBanding();

   void setHorizontalBanding(boolean var1);

   boolean getVerticalBanding();

   void setVerticalBanding(boolean var1);

   ICell mergeCells(ICell var1, ICell var2, boolean var3);
}
