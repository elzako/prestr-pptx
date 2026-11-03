package com.aspose.slides.Collections.Generic;

class SortedDictionary$4<TKey, TValue> implements IGenericEnumerable<KeyValuePair<TKey, TValue>> {
   // $VF: synthetic field
   final SortedDictionary n5;

   SortedDictionary$4(SortedDictionary this$0) {
      this.n5 = this$0;
   }

   @Override
   public IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
      return new SortedDictionary$Enumerator(this.n5.k5());
   }
}
