package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$3 implements IEnumerable {
   // $VF: synthetic field
   final SortedDictionary n5;

   SortedDictionary$3(SortedDictionary this$0) {
      this.n5 = this$0;
   }

   @Override
   public IEnumerator iterator() {
      return new SortedDictionary$Enumerator(this.n5.k5()).getIEnumerator();
   }
}
