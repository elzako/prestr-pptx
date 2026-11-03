package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.u3;

class OrderedDictionary$OrderedCollection implements ICollection {
   private ArrayList n5;
   private boolean l6;

   public OrderedDictionary$OrderedCollection(ArrayList list, boolean isKeyList) {
      this.n5 = list;
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
      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         DictionaryEntry var4 = k5.u3(this.n5.get_Item(var3), DictionaryEntry.class).Clone();
         if (this.l6) {
            array.k5(var4.getKey(), index + var3);
         } else {
            array.k5(var4.getValue(), index + var3);
         }
      }
   }

   @Override
   public IEnumerator iterator() {
      return new OrderedDictionary$OrderedCollection$OrderedCollectionEnumerator(this.n5.iterator(), this.l6);
   }
}
