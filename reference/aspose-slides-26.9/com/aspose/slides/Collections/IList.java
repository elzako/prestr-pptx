package com.aspose.slides.Collections;

public interface IList extends ICollection {
   boolean isFixedSize();

   boolean isReadOnly();

   Object get_Item(int var1);

   void set_Item(int var1, Object var2);

   int addItem(Object var1);

   void removeItem(Object var1);

   void insertItem(int var1, Object var2);

   void removeAt(int var1);

   void clear();

   boolean contains(Object var1);

   int indexOf(Object var1);
}
