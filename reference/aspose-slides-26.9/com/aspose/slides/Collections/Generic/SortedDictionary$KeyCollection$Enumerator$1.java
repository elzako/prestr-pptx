package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$KeyCollection$Enumerator$1 implements IEnumerator {
   // $VF: synthetic field
   final SortedDictionary$KeyCollection$Enumerator n5;

   SortedDictionary$KeyCollection$Enumerator$1(SortedDictionary$KeyCollection$Enumerator this$0) {
      this.n5 = this$0;
   }

   @Override
   public Object next() {
      SortedDictionary$KeyCollection$Enumerator.n5(this.n5).l6();
      return SortedDictionary$KeyCollection$Enumerator.l6(this.n5);
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
      this.n5._remove();
   }
}
