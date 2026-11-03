package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;

public interface ITagCollection extends IGenericCollection<KeyValuePair<String, String>> {
   int add(String var1, String var2);

   void remove(String var1);

   int indexOfName(String var1);

   boolean contains(String var1);

   void removeAt(int var1);

   void clear();

   String getValueByIndex(int var1);

   String getNameByIndex(int var1);

   String[] getNamesOfTags();

   String get_Item(String var1);

   void set_Item(String var1, String var2);
}
