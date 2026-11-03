package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class Hashtable$KeyCollection implements ICollection, IEnumerable {
   private Hashtable n5;

   Hashtable$KeyCollection(Hashtable hashtable) {
      this.n5 = hashtable;
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array", "Array cannot be null");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
      }

      if (array.a6() - arrayIndex < this.n5.size()) {
         throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
      }

      this.n5.n5(array, arrayIndex);
   }

   @Override
   public IEnumerator iterator() {
      return new Hashtable$HashtableEnumerator(this.n5, 1);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }
}
