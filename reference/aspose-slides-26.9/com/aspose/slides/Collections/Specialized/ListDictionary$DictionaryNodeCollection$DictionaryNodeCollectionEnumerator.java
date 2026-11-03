package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;

class ListDictionary$DictionaryNodeCollection$DictionaryNodeCollectionEnumerator implements IEnumerator {
   private IDictionaryEnumerator n5;
   private boolean l6;

   public ListDictionary$DictionaryNodeCollection$DictionaryNodeCollectionEnumerator(IDictionaryEnumerator inner, boolean isKeyList) {
      this.n5 = inner;
      this.l6 = isKeyList;
   }

   @Override
   public Object next() {
      return this.l6 ? this.n5.getKey() : this.n5.getValue();
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
   public void remove() {
      throw new NotSupportedException();
   }
}
