package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class SmartArtShapeCollection implements ISmartArtShapeCollection {
   private List<ISmartArtShape> n5 = new List<>();

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ISmartArtShape get_Item(int index) {
      return this.n5.get_Item(index);
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

   @Override
   public final IGenericEnumerator<ISmartArtShape> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISmartArtShape> iteratorJava() {
      return this.n5.iteratorJava();
   }

   SmartArtShapeCollection() {
   }

   final void n5(ISmartArtShape var1) {
      this.n5.addItem(var1);
   }
}
