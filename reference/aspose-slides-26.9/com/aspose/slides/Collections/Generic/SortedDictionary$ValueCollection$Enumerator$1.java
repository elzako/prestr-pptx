package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerator;

class SortedDictionary$ValueCollection$Enumerator$1 implements IEnumerator {
   // $VF: synthetic field
   final SortedDictionary$ValueCollection$Enumerator n5;

   SortedDictionary$ValueCollection$Enumerator$1(SortedDictionary$ValueCollection$Enumerator this$0) {
      this.n5 = this$0;
   }

   @Override
   public Object next() {
      SortedDictionary$ValueCollection$Enumerator.n5(this.n5).l6();
      return SortedDictionary$ValueCollection$Enumerator.l6(this.n5);
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
