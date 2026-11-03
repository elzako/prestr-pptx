package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.u3;

class Collection$1 implements ICollection {
   // $VF: synthetic field
   final Collection n5;

   Collection$1(Collection this$0) {
      this.n5 = this$0;
   }

   @Override
   public int size() {
      return Collection.n5(this.n5).size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return Collection.l6(this.n5);
   }

   @Override
   public void copyTo(u3 array, int index) {
      Collection.n5(this.n5).copyToTArray((Object[])u3.n5(array), index);
   }

   @Override
   public IEnumerator iterator() {
      return Collection.n5(this.n5).iterator();
   }
}
