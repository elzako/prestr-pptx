package com.aspose.slides.Collections.Generic;

public interface IGenericList<T> extends IGenericCollection<T> {
   int indexOfItem(T var1);

   void insertItem(int var1, T var2);

   void removeAt(int var1);

   T get_Item(int var1);

   void set_Item(int var1, T var2);
}
