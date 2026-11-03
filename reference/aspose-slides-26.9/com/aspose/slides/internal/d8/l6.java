package com.aspose.slides.internal.d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class l6<T> implements IGenericEnumerator<T> {
   private int n5 = -1;
   private final T[] l6;
   private int k5;

   public l6(T[] var1, int var2) {
      this.l6 = (T[])var1;
      this.k5 = var2;
      this.reset();
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final boolean hasNext() {
      if (this.n5 + 1 < this.k5) {
         this.n5++;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.n5 = -1;
   }

   @Override
   public final T next() {
      return this.l6[this.n5];
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
