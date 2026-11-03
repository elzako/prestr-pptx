package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;

class RBTree$NodeEnumerator$1 implements IEnumerator {
   // $VF: synthetic field
   final RBTree$NodeEnumerator n5;

   RBTree$NodeEnumerator$1(RBTree$NodeEnumerator this$0) {
      this.n5 = this$0;
   }

   @Override
   public Object next() {
      this.n5.l6();
      return RBTree$NodeEnumerator.n5(this.n5).peek();
   }

   @Override
   public boolean hasNext() {
      return this.n5.n5();
   }

   @Override
   public void reset() {
      RBTree$NodeEnumerator.l6(this.n5);
      RBTree$NodeEnumerator.n5(this.n5, null);
   }

   @Override
   public void remove() {
      throw new NotImplementedException();
   }
}
