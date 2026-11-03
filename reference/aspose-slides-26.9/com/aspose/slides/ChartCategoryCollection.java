package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class ChartCategoryCollection extends DomObject<ChartData> implements IChartCategoryCollection {
   private String n5;
   private boolean l6;
   private boolean k5;
   private boolean u3 = true;
   private final b3h<IChartCategory> a6;
   private final Dictionary<String, ChartCategory> h0;
   private final l7h c8;

   ChartCategoryCollection(ChartData parentImmediate) {
      super(parentImmediate);
      this.a6 = new b3h<>(parentImmediate);
      this.h0 = new Dictionary<>();
      this.c8 = new l7h();
   }

   @Override
   public final IChartCategory get_Item(int index) {
      return this.a6.get_Item(index);
   }

   @Override
   public final boolean getUseCells() {
      return this.u3;
   }

   @Override
   public final void setUseCells(boolean value) {
      this.u3 = value;
   }

   @Override
   public final int getGroupingLevelCount() {
      if (this.getUseCells() && this.u9.l6().k5() != 2) {
         return this.size() > 0 ? ((ChartCategory)this.get_Item(0)).k5().n5() : 0;
      }

      int var1 = 0;

      for (IChartCategory var3 : this.a6) {
         int var4 = var3.getGroupingLevels() != null ? ((ChartCategoryLevelsManager)var3.getGroupingLevels()).n5() : 0;
         if (var1 < var4) {
            var1 = var4;
         }
      }

      return var1 + 1;
   }

   @Override
   public final IChartCategory add(IChartDataCell chartDataCell) {
      if (this.u3) {
         String var2 = ((ChartDataCell)chartDataCell).a6();
         ChartCategory var3;
         if (this.h0.containsKey(var2)) {
            var3 = this.h0.get_Item(var2);
         } else {
            var3 = new ChartCategory(this);
            this.a6.addItem(var3);
            this.l6(var3);
         }

         var3.setAsCell(chartDataCell);
         return var3;
      } else {
         throw new InvalidOperationException("For using worksheet set UseCells property to true.");
      }
   }

   @Override
   public final IChartCategory add(Object value) {
      ChartCategory var2 = new ChartCategory(this);
      if (this.u3) {
         ChartDataCell var3 = ((ChartDataWorkbook)this.u9.getChartDataWorkbook()).t2();
         var3.setValue(value);
         var2.setAsCell(var3);
         this.l6(var2);
      } else {
         var2.setAsLiteral(value);
      }

      this.a6.addItem(var2);
      return var2;
   }

   final ChartCategory n5(Object var1) {
      ChartCategory var2 = new ChartCategory(this);
      var2.n5(var1);
      this.a6.addItem(var2);
      return var2;
   }

   @Override
   public final int indexOf(IChartCategory value) {
      return this.a6.indexOf(value);
   }

   @Override
   public final void remove(IChartCategory value) {
      this.n5(value);
      value.remove();
   }

   @Override
   public final void removeAt(int index) {
      this.n5(this.get_Item(index));
      this.get_Item(index).remove();
   }

   @Override
   public final void clear() {
      synchronized (this.a6) {
         for (IChartCategory var5 : this.a6.toArray(new IChartCategory[0])) {
            this.n5(var5);
            var5.remove();
         }
      }
   }

   final void n5() {
      synchronized (this.a6) {
         for (IChartCategory var5 : this.a6.toArray(new IChartCategory[0])) {
            this.n5(var5);
         }

         this.a6.clear();
      }
   }

   @Override
   public final IGenericEnumerator<IChartCategory> iterator() {
      return this.a6.iterator();
   }

   @Override
   public final IGenericEnumerator<IChartCategory> iteratorJava() {
      return this.a6.iteratorJava();
   }

   @Override
   public final int size() {
      return this.a6.size();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.a6.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   final boolean l6() {
      boolean var1 = true;

      for (int var2 = 0; var2 < this.getGroupingLevelCount(); var2++) {
         for (int var3 = 0; var3 < this.size(); var3++) {
            Object var4 = com.aspose.slides.internal.v6g.k5.n5(this.get_Item(var3), ChartCategory.class).n5(var2);
            if (var4 != null) {
               double var5 = 0.0;
               double[] var7 = new double[]{0.0};
               var1 &= k3h.n5(com.aspose.slides.ms.System.z3.t9(var4, com.aspose.slides.internal.x7n.l6.k5()), var7);
               var5 = var7[0];
            }
         }
      }

      return var1;
   }

   final String k5() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final l7h u3() {
      return this.c8;
   }

   final void n5(ChartCategory var1) {
      this.n5((IChartCategory)var1);
      if (!this.a6.removeItem(var1)) {
         throw new ArgumentException("The value parameter was not found in the collection.");
      }
   }

   final String a6() {
      IChartDataWorkbook var1 = this.u9.getChartDataWorkbook();
      ChartCellCollection var2 = (ChartCellCollection)var1.getCellCollection("", true);

      for (IChartCategory var4 : this.a6) {
         var2.add(var4.getAsCell());
      }

      if (this.getGroupingLevelCount() == 1) {
         return var2.getCellsAddress();
      }

      for (int var6 = 1; var6 < this.getGroupingLevelCount(); var6++) {
         for (IChartCategory var5 : this.a6) {
            if (var5.getGroupingLevels().get_Item(var6) != null) {
               var2.add(var5.getGroupingLevels().get_Item(var6));
            }
         }
      }

      return var2.n5();
   }

   final List<KeyValuePair<Integer, String>> n5(int var1) {
      List var2 = new List();
      int var3 = 0;
      if (this.size() == 0) {
         return var2;
      }

      Object var4 = com.aspose.slides.internal.v6g.k5.n5(this.get_Item(0), ChartCategory.class).n5(var1);

      for (int var5 = 1; var5 < this.size(); var5++) {
         Object var6 = ((ChartCategory)this.get_Item(var5)).n5(var1);
         boolean var7 = var6 != null && !"".equals(var6.toString()) && (var4 == null || !com.aspose.slides.ms.System.d1.a6(var4.toString(), var6.toString()));
         if (var1 == 0 || var7) {
            var2.addItem(new KeyValuePair<>(var3, var4 != null ? var4.toString() : com.aspose.slides.ms.System.d1.n5));
            var3 = var5;
            var4 = var6;
         }
      }

      var2.addItem(new KeyValuePair<>(var3, var4 != null ? var4.toString() : com.aspose.slides.ms.System.d1.n5));
      return var2;
   }

   final boolean u9() {
      return this.l6;
   }

   final void n5(boolean var1) {
      this.l6 = var1;
   }

   final boolean h0() {
      return this.k5;
   }

   final void l6(boolean var1) {
      this.k5 = var1;
   }

   private void n5(IChartCategory var1) {
      if (w8d.n5(ChartData.class, this.u9).l6().k5() == 2) {
         if (this.u3 && var1.getAsCell() != null) {
            String var2 = ((ChartDataCell)var1.getAsCell()).a6();
            this.h0.removeItemByKey(var2);
         }
      }
   }

   private void l6(IChartCategory var1) {
      if (this.u3 && var1.getAsCell() != null) {
         String var2 = ((ChartDataCell)var1.getAsCell()).a6();
         if (!this.h0.containsKey(var2)) {
            this.h0.addItem(var2, (ChartCategory)var1);
         }
      }
   }
}
