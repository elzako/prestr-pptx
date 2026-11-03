package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

class b3h<T> extends List<T> {
   private ChartData n5;

   public b3h(IChartData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("chartData argument can't be null");
      }

      this.n5 = (ChartData)var1;
   }

   @Override
   public final void addItem(T item) {
      super.addItem(item);
   }

   @Override
   public final boolean removeItem(T item) {
      return super.removeItem(item);
   }

   @Override
   public final void insertItem(int index, T item) {
      super.insertItem(index, item);
   }
}
