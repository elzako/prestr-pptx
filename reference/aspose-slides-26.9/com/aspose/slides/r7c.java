package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

class r7c implements IGenericEnumerator<IChartDataCell> {
   private int n5 = -1;
   private List<ChartDataCell> l6;

   r7c(List<ChartDataCell> var1) {
      this.l6 = var1;
   }

   public final IChartDataCell n5() {
      try {
         return this.l6.get_Item(this.n5);
      } catch (IndexOutOfRangeException var2) {
         throw new InvalidOperationException(var2.getMessage(), var2);
      }
   }

   @Override
   public final boolean hasNext() {
      this.n5++;
      return this.n5 < this.l6.size();
   }

   @Override
   public final void reset() {
      this.n5 = -1;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public IChartDataCell next() {
      return this.n5();
   }

}
