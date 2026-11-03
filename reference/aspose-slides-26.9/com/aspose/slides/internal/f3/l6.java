package com.aspose.slides.internal.f3;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

public class l6<TIn, TOut> implements IGenericEnumerator<TOut> {
   private final u3<TIn, TOut> l6;
   public final IGenericEnumerator<TIn> n5;

   public l6(IGenericEnumerator<TIn> var1, u3<TIn, TOut> var2) {
      if (var1 == null) {
         throw new ArgumentNullException("enumerator");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
   }

   @Override
   public final boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public final void reset() {
      this.n5.reset();
   }

   @Override
   public final TOut next() {
      return (TOut)(this.l6 != null ? this.l6.invoke(this.n5.next()) : this.n5.next());
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
