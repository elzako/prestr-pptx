package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class DigitalSignatureCollection extends DomObject<Presentation> implements IDigitalSignatureCollection {
   private final List<IDigitalSignature> n5 = new List<>();

   DigitalSignatureCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final IDigitalSignature get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final void add(IDigitalSignature signature) {
      this.n5.addItem(signature);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   @Override
   public final IGenericEnumerator<IDigitalSignature> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IDigitalSignature> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }
}
