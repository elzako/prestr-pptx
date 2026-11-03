package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public abstract class ReadOnlyCollectionBase implements ICollection, IEnumerable {
   private ArrayList n5 = new ArrayList();

   @Override
   public int size() {
      return this.getInnerList().size();
   }

   @Override
   public IEnumerator iterator() {
      return this.getInnerList().iterator();
   }

   protected ReadOnlyCollectionBase() {
   }

   protected ArrayList getInnerList() {
      return this.n5;
   }

   @Override
   public void copyTo(u3 array, int index) {
      synchronized (this.getInnerList()) {
         this.getInnerList().copyTo(array, index);
      }
   }

   @Override
   public Object getSyncRoot() {
      return this.getInnerList().getSyncRoot();
   }

   @Override
   public boolean isSynchronized() {
      return this.getInnerList().isSynchronized();
   }
}
