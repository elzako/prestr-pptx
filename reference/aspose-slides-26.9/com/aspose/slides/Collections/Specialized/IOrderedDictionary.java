package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IDictionaryEnumerator;

public interface IOrderedDictionary {
   IDictionaryEnumerator iterator();

   void insert(int var1, Object var2, Object var3);

   void removeAt(int var1);

   Object get_Item(int var1);

   void set_Item(int var1, Object var2);
}
