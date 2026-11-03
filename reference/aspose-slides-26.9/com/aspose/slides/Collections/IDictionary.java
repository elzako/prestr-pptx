package com.aspose.slides.Collections;

public interface IDictionary extends ICollection {
   boolean isFixedSize();

   boolean isReadOnly();

   Object get_Item(Object var1);

   void set_Item(Object var1, Object var2);

   ICollection getKeys();

   ICollection getValues();

   void addItem(Object var1, Object var2);

   void removeItem(Object var1);

   void clear();

   boolean contains(Object var1);

   IDictionaryEnumerator iterator();
}
