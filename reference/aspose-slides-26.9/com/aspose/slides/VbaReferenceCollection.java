package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class VbaReferenceCollection implements IVbaReferenceCollection {
   private final List<IVbaReference> n5 = new List<>();
   private final VbaProject l6;

   VbaReferenceCollection(VbaProject vbaProject) {
      this.l6 = vbaProject;
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final void add(IVbaReference value) {
      this.l6.n5(value);
      this.n5.addItem(value);
   }

   @Override
   public final IVbaReference get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IVbaReference> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IVbaReference> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   final List<IVbaReference> n5() {
      return this.n5;
   }
}
