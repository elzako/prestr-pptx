package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$ValueCollection$2 implements IEnumerable {
   // $VF: synthetic field
   final SortedDictionary$ValueCollection n5;

   SortedDictionary$ValueCollection$2(SortedDictionary$ValueCollection this$0) {
      this.n5 = this$0;
   }

   @Override
   public IEnumerator iterator() {
      return new SortedDictionary$ValueCollection$Enumerator(SortedDictionary$ValueCollection.n5(this.n5)).getIEnumerator();
   }
}
