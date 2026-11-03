package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public class PieSplitCustomPointCollection implements IPieSplitCustomPointCollection {
   private final IChartSeriesGroup n5;
   private final List<IChartDataPoint> l6;

   @Override
   public final IChartDataPoint get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final void add(int dataPointIndex) {
      if (dataPointIndex < 0) {
         throw new ArgumentOutOfRangeException();
      }

      IChartDataPointCollection var2 = this.n5.get_Item(0).getDataPoints();
      if (dataPointIndex >= var2.size()) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Point with index '{0}' was not found", new Object[]{dataPointIndex}), "dataPointIndex");
      }

      IChartDataPoint var3 = var2.get_Item(dataPointIndex);
      if (this.l6.containsItem(var3)) {
         throw new ArgumentException("Data point is already added");
      }

      this.l6.addItem(var3);
   }

   public void addItem(IChartDataPoint dataPoint) {
      this.n5(dataPoint);
   }

   final void n5(IChartDataPoint var1) {
      IChartDataPointCollection var2 = this.n5.get_Item(0).getDataPoints();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            IChartDataPoint var4 = (IChartDataPoint)var3.next();
            if (var4 == var1) {
               this.l6.addItem(var1);
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      throw new ArgumentException("Coudn't find dataPoint in parent series. Allowed adding dataPoint only from same chart and parent series");
   }

   public boolean removeItem(IChartDataPoint dataPoint) {
      return this.l6(dataPoint);
   }

   final boolean l6(IChartDataPoint var1) {
      return this.l6.removeItem(var1);
   }

   @Override
   public final void remove(int dataPointIndex) {
      if (dataPointIndex < 0) {
         throw new ArgumentOutOfRangeException();
      }

      IChartDataPointCollection var2 = this.n5.get_Item(0).getDataPoints();
      if (dataPointIndex >= var2.size()) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Point with index '{0}' was not found", new Object[]{dataPointIndex}), "dataPointIndex");
      }

      this.l6.removeItem(var2.get_Item(dataPointIndex));
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   public boolean containsItem(IChartDataPoint item) {
      return this.k5(item);
   }

   final boolean k5(IChartDataPoint var1) {
      return this.l6.containsItem(var1);
   }

   public void copyToTArray(IChartDataPoint[] array, int arrayIndex) {
      this.n5(array, arrayIndex);
   }

   final void n5(IChartDataPoint[] var1, int var2) {
      this.l6.copyToTArray(var1, var2);
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final boolean isReadOnly() {
      return this.l6.isReadOnly();
   }

   public final boolean isSynchronized() {
      return false;
   }

   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<IChartDataPoint> iterator() {
      return this.l6.iterator();
   }

   public final IGenericEnumerator<IChartDataPoint> iteratorJava() {
      return this.l6.iteratorJava();
   }

   PieSplitCustomPointCollection(IChartSeriesGroup parentSeriesGroup) {
      this.n5 = parentSeriesGroup;
      this.l6 = new List<>();
   }
}
