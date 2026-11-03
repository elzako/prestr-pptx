package com.aspose.slides;

public interface ITabCollection extends IGenericCollection<ITab> {
   ITab get_Item(int var1);

   ITab add(double var1, int var3);

   int add(ITab var1);

   void clear();

   void removeAt(int var1);
}
