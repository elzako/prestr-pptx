package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class GradientStopCollectionEffectiveData implements IGradientStopCollectionEffectiveData, i7b {
   private List<IGradientStopEffectiveData> n5 = new List<>();

   GradientStopCollectionEffectiveData() {
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IGradientStopEffectiveData get_Item(int index) {
      return this.n5.get_Item(index);
   }

   final void n5(float var1, ColorFormat var2) {
      GradientStopEffectiveData var3 = new GradientStopEffectiveData(var1, var2);
      this.n5.addItem(var3);
   }

   final void n5(GradientStopEffectiveData var1) {
      GradientStopEffectiveData var2 = new GradientStopEffectiveData(var1);
      this.n5.addItem(var2);
   }

   final void n5() {
      this.n5.clear();
   }

   @Override
   public final IGenericEnumerator<IGradientStopEffectiveData> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IGradientStopEffectiveData> iteratorJava() {
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
}
