package com.aspose.slides.internal.i9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;

public class l6<T> implements IGenericEnumerator<T> {
   private IGenericList<T> n5;
   private int l6;

   public l6(IGenericList<T> var1) {
      this.n5 = var1;
      this.l6 = var1.size();
   }

   @Override
   public final void dispose() {
      this.n5 = null;
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 > 0) {
         this.l6--;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.l6 = this.n5.size();
   }

   @Override
   public final T next() {
      return this.n5.get_Item(this.l6);
   }

   public final int n5() {
      return this.l6;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
