package com.aspose.slides.internal.f3;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

public class n5<TIn, TOut> implements IGenericEnumerable<TOut> {
   private final u3<TIn, TOut> l6;
   public final IGenericEnumerable<TIn> n5;

   public n5(IGenericEnumerable<TIn> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("enumerable");
      }

      this.n5 = var1;
      this.l6 = null;
   }

   public n5(IGenericEnumerable<TIn> var1, u3<TIn, TOut> var2) {
      if (var1 == null) {
         throw new ArgumentNullException("enumerable");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final IGenericEnumerator<TOut> iterator() {
      return new l6<>(this.n5.iterator(), this.l6);
   }
}
