package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class r7n implements IChartSeriesGroupCollection, r0g {
   private final r0g n5;
   private final List<IChartSeriesGroup> l6 = new List<>();

   @Override
   public final IChartSeriesGroup get_Item(IChartSeries ofSeries) {
      return ofSeries.getParentSeriesGroup();
   }

   @Override
   public final IChartSeriesGroup get_Item(int groupIndex) {
      return this.l6.get_Item(groupIndex);
   }

   r7n(ChartData var1) {
      this.n5 = var1;
   }

   @Override
   public final int size() {
      return this.l6.size();
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

   @Override
   public final IGenericEnumerator<IChartSeriesGroup> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final IGenericEnumerator<IChartSeriesGroup> iteratorJava() {
      return this.l6.iteratorJava();
   }

   final void n5(ChartSeries var1) {
      if (var1.getParentSeriesGroup() == null) {
         this.u3(var1);
      } else if (!ChartTypeCharacterizer.n5(var1, var1.getParentSeriesGroup())) {
         int var2 = var1.getParentSeriesGroup().getGapWidth();
         int var3 = var1.getParentSeriesGroup().getGapDepth();
         this.l6(var1);
         this.u3(var1);
         var1.getParentSeriesGroup().setGapWidth(var2);
         var1.getParentSeriesGroup().setGapDepth(var3);
      }
   }

   final void l6(ChartSeries var1) {
      IChartSeriesGroup var2 = var1.getParentSeriesGroup();
      ((m4d)var2.getSeries()).l6(var1);
      if (var2.getSeries().size() == 0) {
         this.l6.removeItem(var2);
      }
   }

   private void u3(ChartSeries var1) {
      int var2 = ChartTypeCharacterizer.x8(var1.getType());
      if (var2 != 3 && var2 != 28) {
         List$Enumerator var3 = this.l6.iterator();

         try {
            while (var3.hasNext()) {
               ChartSeriesGroup var4 = (ChartSeriesGroup)var3.next();
               if (ChartTypeCharacterizer.n5(var1, var4)) {
                  ((m4d)var4.getSeries()).n5(var1);
                  return;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      this.k5(var1);
   }

   final ChartSeriesGroup k5(ChartSeries var1) {
      ChartSeriesGroup var2 = new ChartSeriesGroup(this, var1);
      int var3 = 0;
      boolean var4 = var2.getChart().getType() == 73;
      int var5 = ChartTypeCharacterizer.t9(var1.getType());

      for (int var6 = 0; var6 < this.l6.size(); var6++) {
         int var7 = ChartTypeCharacterizer.t9(this.l6.get_Item(var6).getSeries().get_Item(0).getType());
         if (!this.n5(this.l6.get_Item(var6).getType(), var2.getType()) && (var4 && var7 > var5 || !var4 && this.l6.get_Item(var6).getType() > var2.getType())) {
            var3 = var6;
            break;
         }

         if (var4 && var7 == var5 || this.l6.get_Item(var6).getType() == var2.getType()) {
            if (this.l6.get_Item(var6).getPlotOnSecondAxis() && !var2.getPlotOnSecondAxis()) {
               var3 = var6;
               break;
            }

            var3 = var6 + 1;
         }

         if (var6 == this.l6.size() - 1) {
            var3 = this.l6.size();
         }
      }

      this.l6.insertItem(var3, var2);
      return var2;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   private boolean n5(int var1, int var2) {
      int[] var3 = new int[]{3, 2, 1, 0};
      return com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), new r7n$1(this, var1))
         && com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), new r7n$2(this, var2));
   }
}
