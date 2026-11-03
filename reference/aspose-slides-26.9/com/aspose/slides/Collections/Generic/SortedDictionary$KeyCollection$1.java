package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.u3;

class SortedDictionary$KeyCollection$1 implements ICollection {
   // $VF: synthetic field
   final SortedDictionary$KeyCollection n5;

   SortedDictionary$KeyCollection$1(SortedDictionary$KeyCollection this$0) {
      this.n5 = this$0;
   }

   @Override
   public int size() {
      return SortedDictionary$KeyCollection.n5(this.n5).size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.n5();
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (this.size() != 0) {
         if (array == null) {
            throw new ArgumentNullException();
         }

         if (index < 0 || array.a6() <= index) {
            throw new ArgumentOutOfRangeException();
         }

         if (array.a6() - index < this.size()) {
            throw new ArgumentException();
         }

         for (Object recoveredElement$var4$1275 : SortedDictionary.n5(SortedDictionary$KeyCollection.n5(this.n5)).u9()) {
            SortedDictionary$Node var4 = (SortedDictionary$Node)recoveredElement$var4$1275;
            array.k5(var4.n5, index++);
         }
      }
   }

   @Override
   public IEnumerator iterator() {
      return new SortedDictionary$KeyCollection$Enumerator(SortedDictionary$KeyCollection.n5(this.n5)).getIEnumerator();
   }
}
