package com.aspose.slides;

public interface IColorOperationCollection extends IGenericCloneable<IColorOperationCollection>, IGenericCollection<IColorOperation> {
   IColorOperation get_Item(int var1);

   void set_Item(int var1, IColorOperation var2);

   IColorOperation add(int var1, float var2);

   IColorOperation add(int var1);

   IColorOperation insert(int var1, int var2, float var3);

   IColorOperation insert(int var1, int var2);

   void removeAt(int var1);

   void clear();
}
