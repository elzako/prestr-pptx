package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public interface IControlPropertiesCollection extends IGenericEnumerable<KeyValuePair<String, String>> {
   int getCount();

   void add(String var1, String var2);

   void remove(String var1);

   String get_Item(String var1);

   void set_Item(String var1, String var2);

   com.aspose.slides.Collections.Generic.IGenericCollection<String> getNamesOfProperties();

   void clear();
}
