package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class PointCollection implements IPointCollection {
   private List<IPoint> n5 = new List<>();

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   final void n5(IPoint var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final IPoint get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IPoint> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<IPoint> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
