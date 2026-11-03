package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$Enumerator$2 implements IEnumerator {
   // $VF: synthetic field
   final SortedDictionary$Enumerator n5;

   SortedDictionary$Enumerator$2(SortedDictionary$Enumerator this$0) {
      this.n5 = this$0;
   }

   @Override
   public Object next() {
      return SortedDictionary$Enumerator.n5(this.n5).n5();
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
