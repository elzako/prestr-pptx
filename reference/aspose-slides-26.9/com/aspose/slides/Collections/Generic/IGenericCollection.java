package com.aspose.slides.Collections.Generic;

public interface IGenericCollection<T> extends IGenericEnumerable<T> {
   int size();

   boolean isReadOnly();

   void addItem(T var1);

   void clear();

   boolean containsItem(T var1);

   void copyToTArray(T[] var1, int var2);

   boolean removeItem(T var1);
}
