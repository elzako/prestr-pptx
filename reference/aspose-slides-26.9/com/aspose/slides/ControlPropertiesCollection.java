package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public class ControlPropertiesCollection implements IControlPropertiesCollection {
   Dictionary<String, String> n5 = new Dictionary<>();

   ControlPropertiesCollection() {
   }

   @Override
   public final void add(String name, String value) {
      this.n5.addItem(name, value);
   }

   @Override
   public final void remove(String name) {
      this.n5.removeItemByKey(name);
   }

   @Override
   public final String get_Item(String name) {
      Object var2 = null;
      String[] var3 = new String[]{(String)var2};
      this.n5.tryGetValue(name, var3);
      return var3[0];
   }

   @Override
   public final void set_Item(String name, String value) {
      this.n5.set_Item(name, value);
   }

   @Override
   public com.aspose.slides.Collections.Generic.IGenericCollection<String> getNamesOfProperties() {
      return this.n5.getKeys();
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<KeyValuePair<String, String>> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
