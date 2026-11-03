package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class f5<T> implements IGenericEnumerator<T> {
   private final IGenericEnumerator<T> n5;
   private final f5$n5 l6;
   private final Object k5;

   public f5(IGenericEnumerator<T> var1, f5$n5 var2, Object var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void reset() {
      this.n5.reset();
   }

   @Override
   public final T next() {
      return this.n5.next();
   }

   @Override
   public final boolean hasNext() {
      while (this.n5.hasNext()) {
         if (this.l6.n5(this.n5.next(), this.k5)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
