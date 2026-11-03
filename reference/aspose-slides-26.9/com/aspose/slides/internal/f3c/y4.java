package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import java.util.Iterator;

public final class y4 implements ICollection, IEnumerable {
   private ArrayList n5 = new ArrayList();

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   public n3 n5(int var1) {
      return (n3)this.n5.get_Item(var1);
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   public e2 n5() {
      return new e2(this.n5);
   }

   public void n5(h0 var1) {
      this.n5.addItem(new n3(var1));
   }

   public void l6() {
      this.n5.clear();
   }

   public boolean l6(h0 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         if (var1.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var2), n3.class).n5())) {
            return true;
         }
      }

      return false;
   }

   // Original IEnumerator forwarding descriptor; javac supplies the Iterator bridge.
   @Override
   public com.aspose.slides.Collections.IEnumerator iterator() {
      return this.n5();
   }




}
