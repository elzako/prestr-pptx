package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

class HybridDictionary$1 implements IEnumerable {
   // $VF: synthetic field
   final HybridDictionary n5;

   HybridDictionary$1(HybridDictionary this$0) {
      this.n5 = this$0;
   }

   @Override
   public IEnumerator iterator() {
      return HybridDictionary.n5(this.n5).iterator();
   }
}
