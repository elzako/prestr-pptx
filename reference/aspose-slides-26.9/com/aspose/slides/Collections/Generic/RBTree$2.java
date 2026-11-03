package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

class RBTree$2 implements IEnumerable {
   // $VF: synthetic field
   final RBTree n5;

   RBTree$2(RBTree this$0) {
      this.n5 = this$0;
   }

   @Override
   public IEnumerator iterator() {
      return new RBTree$NodeEnumerator(this.n5.a6());
   }
}
