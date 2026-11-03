package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class ChartDataWorksheetCollection implements IChartDataWorksheetCollection, r0g {
   ChartDataWorkbook n5;
   private List<IChartDataWorksheet> k5;
   int l6 = 0;

   @Override
   public final IChartDataWorksheet get_Item(int index) {
      if (index >= 0 && index < this.size()) {
         return this.k5.get_Item(index);
      } else {
         throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
      }
   }

   @Override
   public final int size() {
      return this.k5.size();
   }

   ChartDataWorksheetCollection(ChartDataWorkbook parentImmediate) {
      this.n5 = parentImmediate;
      this.k5 = new List<>();
   }

   final ChartDataWorksheet n5(String var1) {
      ChartDataWorksheet var2 = this.n5();
      var2.n5(var1);
      return var2;
   }

   final ChartDataWorksheet n5() {
      ChartDataWorksheet var1 = new ChartDataWorksheet(this);
      if ("*".equals(var1.getName())) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Sheet", com.aspose.slides.ms.System.a3.l6(this.l6)}));
      }

      var1.n5(this.l6++);
      this.k5.addItem(var1);
      return var1;
   }

   final ChartDataWorkbook l6() {
      return this.n5;
   }

   final ChartDataWorksheet l6(String var1) {
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            ChartDataWorksheet var3 = (ChartDataWorksheet)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.getName(), var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   @Override
   public final IGenericEnumerator<IChartDataWorksheet> iteratorJava() {
      return this.k5.iteratorJava();
   }

   @Override
   public final IGenericEnumerator<IChartDataWorksheet> iterator() {
      return this.k5.iterator();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int arrayIndex) {
      this.k5.copyTo(array, arrayIndex);
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
