package com.aspose.slides;

public interface IColumnCollection extends IGenericCollection<IColumn> {
   IColumn get_Item(int var1);

   IColumn[] addClone(IColumn var1, boolean var2);

   IColumn[] insertClone(int var1, IColumn var2, boolean var3);

   void removeAt(int var1, boolean var2);
}
