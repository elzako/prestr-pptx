package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;

public class ChartSeriesCollection extends DomObject<ChartData> implements IChartSeriesCollection {
   private Chart n5;
   private final b3h<IChartSeries> l6;

   ChartSeriesCollection(ChartData parentImmediate) {
      super(parentImmediate);
      this.l6 = new b3h<>(parentImmediate);
   }

   @Override
   public final IChartSeries get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final IChartSeries add(int type) {
      ChartSeries var2 = new ChartSeries(this, type, false);
      boolean var3 = this.n5(var2);
      var2.k5(var3);
      this.l6.addItem(var2);
      var2.u3();
      return var2;
   }

   @Override
   public final IChartSeries insert(int index, int type) {
      ChartSeries var3 = new ChartSeries(this, type, false);
      boolean var4 = this.n5(var3);
      var3.k5(var4);
      this.l6.insertItem(index, var3);
      var3.u3();
      return var3;
   }

   private boolean n5(ChartSeries var1) {
      if (this.l6.size() > 0) {
         IChartSeries var2 = this.l6.get_Item(0);
         boolean var3 = ChartTypeCharacterizer.is3DChart(var2.getType());

         for (int var4 = 1; var4 < this.l6.size(); var4++) {
            var2 = this.l6.get_Item(var4);
         }

         if (var3 != ChartTypeCharacterizer.is3DChart(var1.getType())) {
            if (var3) {
               throw new CannotCombine2DAnd3DChartsException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"Cannot combine 2D and 3D chart types ", "(the series to be added is 2D and present series is/are 3D)."})
               );
            }

            throw new CannotCombine2DAnd3DChartsException(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Cannot combine 2D and 3D chart types ", "(the series to be added is 3D and present series is/are 2D)."})
            );
         }
      }

      if (((AxesManager)this.n5().getAxes()).n5(var1.getType(), false)) {
         return false;
      } else if (((AxesManager)this.n5().getAxes()).n5(var1.getType(), true)) {
         return true;
      } else {
         throw new AxesCompositionNotCombinableException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Some chart types cannot be combined with other chart types. Select a different chart type. ",
               "Details: axes composition of the series to be added is not combinable with present ",
               "axes composition in chart. So series of this type cannot be added to this chart. ",
               "Preferred axes composition for the series to be added is \"",
               ChartTypeCharacterizer.k5(ChartTypeCharacterizer.n5(var1.getType())),
               "\"."
            })
         );
      }
   }

   final void n5(int var1, IChartSeries var2) {
      if (this.l6.containsItem(var2)) {
         this.l6.removeItem(var2);
         this.l6.insertItem(var1, var2);
      }
   }

   @Override
   public final IChartSeries add(IChartDataCell cellWithSeriesName, int type) {
      for (IChartSeries var4 : this.l6) {
         if (var4.getName().getDataSourceType() == 0
            && var4.getName().getAsCells().getCount() == 1
            && var4.getName().getAsCells().get_Item(0).equals(cellWithSeriesName)) {
            return var4;
         }
      }

      IChartSeries var5 = this.add(type);
      this.u9.l6().n5(cellWithSeriesName);
      var5.getName().setFromOneCell(cellWithSeriesName);
      return var5;
   }

   @Override
   public final IChartSeries add(IChartCellCollection cellsWithSeriesName, int type) {
      for (IChartSeries var4 : this.l6) {
         if (var4.getName().getDataSourceType() == 0
            && var4.getName().getAsCells().getCount() == cellsWithSeriesName.getCount()
            && com.aspose.slides.ms.System.d1.a6(
               var4.getName().getAsCells().getConcatenatedValuesFromCells(), cellsWithSeriesName.getConcatenatedValuesFromCells()
            )) {
            return var4;
         }
      }

      IChartSeries var5 = this.add(type);
      var5.getName().setAsCells(cellsWithSeriesName);
      return var5;
   }

   @Override
   public final IChartSeries add(String name, int type) {
      ChartDataCell var3 = ((ChartDataWorkbook)this.n5().getChartData().getChartDataWorkbook()).t2();
      var3.setValue(name);
      return this.add(var3, type);
   }

   final IChartSeries n5(int var1, IChartSeriesGroup var2, boolean var3) {
      ChartSeries var4 = new ChartSeries(this, var1, true);
      var4.k5(var3);
      this.l6.addItem(var4);
      ((AxesManager)this.n5().getAxes()).l6();
      ((m4d)var2.getSeries()).n5(var4);
      return var4;
   }

   final IChartSeries n5(int var1, boolean var2) {
      ChartSeries var3 = new ChartSeries(this, var1, true);
      var3.k5(var2);
      this.l6.addItem(var3);
      ((AxesManager)this.n5().getAxes()).l6();
      ((r7n)this.n5().getChartData().getSeriesGroups()).k5(var3);
      return var3;
   }

   @Override
   public final int indexOf(IChartSeries value) {
      return this.l6.indexOf(value);
   }

   @Override
   public final void remove(IChartSeries value) {
      if (this.l6.indexOf(value) == -1) {
         throw new ArgumentException("The value parameter was not found in the collection.");
      }

      this.l6.removeItem(value);
      ((AxesManager)this.n5().getAxes()).l6();
      ((r7n)this.n5().getChartData().getSeriesGroups()).l6((ChartSeries)value);
   }

   @Override
   public final void removeAt(int index) {
      this.remove(this.l6.get_Item(index));
   }

   @Override
   public final void clear() {
      while (this.l6.size() > 0) {
         this.removeAt(this.l6.size() - 1);
      }
   }

   final IChart n5() {
      if (this.n5 == null) {
         Chart[] var1 = new Chart[]{this.n5};
         d0u.n5(Chart.class, this.u9, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }

   @Override
   public final IGenericEnumerator<IChartSeries> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final IGenericEnumerator<IChartSeries> iteratorJava() {
      return this.l6.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.l6.copyTo(array, index);
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
