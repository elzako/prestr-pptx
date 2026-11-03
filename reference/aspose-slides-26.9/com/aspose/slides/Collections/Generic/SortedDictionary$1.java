package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.u3;

class SortedDictionary$1 implements IDictionary {
   // $VF: synthetic field
   final SortedDictionary n5;

   SortedDictionary$1(SortedDictionary this$0) {
      this.n5 = this$0;
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public Object get_Item(Object o) {
      return this.n5.n5(SortedDictionary.n5(this.n5, o));
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.n5.n5(SortedDictionary.n5(this.n5, key), SortedDictionary.l6(this.n5, value));
   }

   @Override
   public ICollection getKeys() {
      return new SortedDictionary$KeyCollection(this.n5.k5()).getICollection();
   }

   @Override
   public ICollection getValues() {
      return new SortedDictionary$ValueCollection(this.n5.k5()).getICollection();
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5.l6(SortedDictionary.n5(this.n5, key), SortedDictionary.l6(this.n5, value));
   }

   @Override
   public void removeItem(Object o) {
      this.n5.k5(SortedDictionary.n5(this.n5, o));
   }

   @Override
   public void clear() {
      this.n5.l6();
   }

   @Override
   public boolean contains(Object key) {
      return this.n5.l6(SortedDictionary.n5(this.n5, key));
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new SortedDictionary$Enumerator(this.n5.k5()).getIDictionaryEnumerator();
   }

   @Override
   public int size() {
      return this.n5.n5();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.k5();
   }

   @Override
   public void copyTo(u3 objects, int i) {
      Object var3 = u3.n5(objects);
      if (!(var3 instanceof KeyValuePair[])) {
         throw new ArgumentException();
      }

      this.n5.n5((KeyValuePair[])u3.n5(objects), i);
   }
}
