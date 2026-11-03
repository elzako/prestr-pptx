package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$KeyCollection$2 implements IEnumerable {
   // $VF: synthetic field
   final SortedDictionary$KeyCollection n5;

   SortedDictionary$KeyCollection$2(SortedDictionary$KeyCollection this$0) {
      this.n5 = this$0;
   }

   @Override
   public IEnumerator iterator() {
      return new SortedDictionary$KeyCollection$Enumerator(SortedDictionary$KeyCollection.n5(this.n5)).getIEnumerator();
   }
}
