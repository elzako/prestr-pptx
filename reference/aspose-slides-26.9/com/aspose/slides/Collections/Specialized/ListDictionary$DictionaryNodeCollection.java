package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.u3;

class ListDictionary$DictionaryNodeCollection implements ICollection {
   private ListDictionary n5;
   private boolean l6;

   public ListDictionary$DictionaryNodeCollection(ListDictionary dict, boolean isKeyList) {
      this.n5 = dict;
      this.l6 = isKeyList;
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array", "Array cannot be null.");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", "index is less than 0");
      }

      if (index > array.a6()) {
         throw new IndexOutOfRangeException("index is too large");
      }

      if (this.size() > array.a6() - index) {
         throw new ArgumentException("Not enough room in the array");
      }

      for (Object var4 : this) {
         array.k5(var4, index++);
      }
   }

   @Override
   public IEnumerator iterator() {
      return new ListDictionary$DictionaryNodeCollection$DictionaryNodeCollectionEnumerator(this.n5.iterator(), this.l6);
   }
}
