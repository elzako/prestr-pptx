package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@Deprecated
@j3
class Dictionary$ShimEnumeratorJava<TKey, TValue> implements IDictionaryEnumerator, IEnumerable<DictionaryEntry> {
   private Dictionary$EnumeratorJava l6;
   // $VF: synthetic field
   final Dictionary n5;

   public Dictionary$ShimEnumeratorJava(Dictionary<TKey, TValue> var1, Dictionary host) {
      this.n5 = var1;
      this.l6 = new Dictionary$EnumeratorJava();
      host.l6().CloneTo(this.l6);
   }

   @Override
   public boolean hasNext() {
      return this.l6.hasNext();
   }

   @Override
   public DictionaryEntry getEntry() {
      return this.l6.getEntry();
   }

   @Override
   public Object getKey() {
      return this.l6.next().getKey();
   }

   @Override
   public Object getValue() {
      return this.l6.next().getValue();
   }

   @Override
   public Object next() {
      this.l6.next();
      return this.getEntry();
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }

   @Override
   public void reset() {
      this.l6.reset();
   }

   @Override
   public IEnumerator<DictionaryEntry> iterator() {
      return this;
   }
}
