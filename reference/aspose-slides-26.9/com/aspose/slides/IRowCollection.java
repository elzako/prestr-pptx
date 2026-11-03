package com.aspose.slides;

public interface IRowCollection extends IGenericCollection<IRow> {
   IRow get_Item(int var1);

   IRow[] addClone(IRow var1, boolean var2);

   IRow[] insertClone(int var1, IRow var2, boolean var3);

   void removeAt(int var1, boolean var2);
}
