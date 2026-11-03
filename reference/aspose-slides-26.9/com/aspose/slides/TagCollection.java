package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class TagCollection implements ITagCollection {
   private final SortedList<String, String> n5 = new SortedList<>();

   TagCollection() {
   }

   final SortedList<String, String> n5() {
      return this.n5;
   }

   @Override
   public final int size() {
      return this.n5().size();
   }

   @Override
   public final int add(String name, String value) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      if (this.n5().containsKey(name)) {
         this.n5().set_Item(name, value);
      } else {
         this.n5().addItem(name, value);
      }

      return this.n5().indexOfKey(name);
   }

   @Override
   public final void remove(String name) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      this.n5().removeItemByKey(name);
   }

   @Override
   public final int indexOfName(String name) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      return this.n5().indexOfKey(name);
   }

   @Override
   public final boolean contains(String name) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      return this.n5().containsKey(name);
   }

   @Override
   public final void removeAt(int index) {
      this.n5().removeAt(index);
   }

   @Override
   public final void clear() {
      this.n5().clear();
   }

   @Override
   public final String getValueByIndex(int index) {
      return this.n5().getValues().get_Item(index);
   }

   @Override
   public final String getNameByIndex(int index) {
      return this.n5().getKeys().get_Item(index);
   }

   @Override
   public final String[] getNamesOfTags() {
      String[] var1 = new String[this.n5().getKeys().size()];
      this.n5().getKeys().copyToTArray(var1, 0);
      return var1;
   }

   @Override
   public final String get_Item(String name) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      Object var2 = null;
      String[] var3 = new String[]{(String)var2};
      this.n5().tryGetValue(name, var3);
      return var3[0];
   }

   @Override
   public final void set_Item(String name, String value) {
      if (name == null) {
         throw new ArgumentNullException("name");
      }

      name = com.aspose.slides.ms.System.d1.t2(name);
      this.n5().set_Item(name, value);
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5().copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
      return this.n5().iterator();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, String>> iteratorJava() {
      return this.n5().iteratorJava();
   }
}
