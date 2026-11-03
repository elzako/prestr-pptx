package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
class NameObjectCollectionBase$_KeysEnumerator implements IEnumerator {
   private NameObjectCollectionBase n5;
   private int l6;

   NameObjectCollectionBase$_KeysEnumerator(NameObjectCollectionBase collection) {
      this.n5 = collection;
      this.reset();
   }

   @Override
   public Object next() {
      if (this.l6 >= this.n5.size() && this.l6 >= 0) {
         throw new InvalidOperationException();
      } else {
         return this.n5.baseGetKey(this.l6);
      }
   }

   @Override
   public boolean hasNext() {
      return ++this.l6 < this.n5.size();
   }

   @Override
   public void reset() {
      this.l6 = -1;
   }

   @Override
   public void remove() {
      throw new NotSupportedException();
   }
}
