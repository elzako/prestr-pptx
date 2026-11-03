package com.aspose.slides;

public interface IMathMatrix extends IMathElement {
   IMathElement get_Item(int var1, int var2);

   void set_Item(int var1, int var2, IMathElement var3);

   int getRowCount();

   int getColumnCount();

   boolean getHidePlaceholders();

   void setHidePlaceholders(boolean var1);

   int getBaseJustification();

   void setBaseJustification(int var1);

   long getMinColumnWidth();

   void setMinColumnWidth(long var1);

   int getColumnGapRule();

   void setColumnGapRule(int var1);

   long getColumnGap();

   void setColumnGap(long var1);

   int getRowGapRule();

   void setRowGapRule(int var1);

   long getRowGap();

   void setRowGap(long var1);

   int getColumnAlignment(int var1);

   void setColumnAlignment(int var1, int var2);

   void setColumnsAlignment(int var1, long var2, int var4);

   void insertRowBefore(int var1);

   void insertRowAfter(int var1);

   void deleteRow(int var1);

   void insertColumnBefore(int var1);

   void insertColumnAfter(int var1);

   void deleteColumn(int var1);
}
