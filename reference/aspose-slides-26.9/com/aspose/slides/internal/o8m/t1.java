package com.aspose.slides.internal.o8m;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import java.util.Iterator;

public final class t1 implements ICollection, IEnumerable {
   private ArrayList n5 = new ArrayList();
   private boolean l6;

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   public u6 n5(int var1) {
      return (u6)this.n5.get_Item(var1);
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   public int n5(u6 var1) {
      return this.l6 ? 0 : this.n5.addItem(var1);
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   public a5 n5() {
      return new a5(this);
   }

   // Original IEnumerator forwarding descriptor; javac supplies the Iterator bridge.
   @Override
   public com.aspose.slides.Collections.IEnumerator iterator() {
      return this.n5();
   }




}
