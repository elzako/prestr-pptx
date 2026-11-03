package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.v6g.k5;

class OrderedDictionary$OrderedCollection$OrderedCollectionEnumerator implements IEnumerator {
   private boolean n5;
   private IEnumerator l6;

   public OrderedDictionary$OrderedCollection$OrderedCollectionEnumerator(IEnumerator listEnumerator, boolean isKeyList) {
      this.l6 = listEnumerator;
      this.n5 = isKeyList;
   }

   @Override
   public Object next() {
      DictionaryEntry var1 = k5.u3(this.l6.next(), DictionaryEntry.class).Clone();
      return this.n5 ? var1.getKey() : var1.getValue();
   }

   @Override
   public boolean hasNext() {
      return this.l6.hasNext();
   }

   @Override
   public void reset() {
      this.l6.reset();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
