package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;

class SortedDictionary$Enumerator$1 implements IDictionaryEnumerator {
   // $VF: synthetic field
   final SortedDictionary$Enumerator n5;

   SortedDictionary$Enumerator$1(SortedDictionary$Enumerator this$0) {
      this.n5 = this$0;
   }

   @Override
   public DictionaryEntry getEntry() {
      return SortedDictionary$Enumerator.n5(this.n5).l6();
   }

   @Override
   public Object getKey() {
      return SortedDictionary$Enumerator.n5(this.n5).n5;
   }

   @Override
   public Object getValue() {
      return SortedDictionary$Enumerator.n5(this.n5).l6;
   }

   @Override
   public Object next() {
      return this.n5.n5();
   }

   @Override
   public boolean hasNext() {
      return this.n5.l6();
   }

   @Override
   public void reset() {
      this.n5.k5();
   }

   @Override
   public void remove() {
      this.n5.u3();
   }
}
