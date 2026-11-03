package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

class z6y implements IGenericEnumerator<IDataLabel> {
   private int n5 = -1;
   private IChartDataPointCollection l6;

   z6y(IChartDataPointCollection var1) {
      this.l6 = var1;
   }

   public final IDataLabel n5() {
      try {
         this.n5++;
         return this.l6.get_Item(this.n5).getLabel();
      } catch (IndexOutOfRangeException var2) {
         throw new InvalidOperationException();
      }
   }

   @Override
   public final boolean hasNext() {
      int var1 = this.n5;
      var1++;
      return var1 < this.l6.size();
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
   public IDataLabel next() {
      return this.n5();
   }

}
