package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class m4d implements IChartSeriesReadonlyCollection {
   private List<IChartSeries> n5 = new List<>();
   private ChartSeriesGroup l6;

   @Override
   public final IChartSeries get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final int size() {
      return this.n5.size();
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

   @Override
   public final IGenericEnumerator<IChartSeries> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IChartSeries> iteratorJava() {
      return this.n5.iteratorJava();
   }

   m4d(ChartSeriesGroup var1) {
      this.l6 = var1;
   }

   final void n5(ChartSeries var1) {
      var1.n5(this.l6);
      this.n5.addItem(var1);
   }

   final void l6(ChartSeries var1) {
      var1.n5((ChartSeriesGroup)null);
      this.n5.removeItem(var1);
   }

   public final int n5(IChartSeries var1) {
      return this.n5.indexOf(var1);
   }
}
