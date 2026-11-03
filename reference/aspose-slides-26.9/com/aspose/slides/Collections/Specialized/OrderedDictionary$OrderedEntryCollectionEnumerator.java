package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.v6g.k5;

class OrderedDictionary$OrderedEntryCollectionEnumerator implements IDictionaryEnumerator, IEnumerator {
   private IEnumerator n5;

   public OrderedDictionary$OrderedEntryCollectionEnumerator(IEnumerator listEnumerator) {
      this.n5 = listEnumerator;
   }

   @Override
   public boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public void reset() {
      this.n5.reset();
   }

   @Override
   public Object next() {
      return this.n5.next();
   }

   @Override
   public DictionaryEntry getEntry() {
      return k5.u3(this.n5.next(), DictionaryEntry.class);
   }

   @Override
   public Object getKey() {
      return this.getEntry().getKey();
   }

   @Override
   public Object getValue() {
      return this.getEntry().getValue();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
