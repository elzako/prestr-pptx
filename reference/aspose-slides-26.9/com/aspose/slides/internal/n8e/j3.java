package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class j3<T> implements IGenericEnumerator<T> {
   private final IGenericEnumerator<T> n5;
   private final f5$n5 l6;
   private final Object k5;
   private T u3;
   private boolean a6 = true;
   private boolean u9 = false;

   public j3(IGenericEnumerator<T> var1, f5$n5 var2, Object var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void reset() {
      this.n5.reset();
      this.u3 = null;
   }

   @Override
   public final T next() {
      if (this.a6) {
         this.hasNext();
      }

      this.a6 = true;
      return this.u3;
   }

   @Override
   public final boolean hasNext() {
      if (!this.a6) {
         return this.u9;
      }

      while (this.n5.hasNext()) {
         this.u3 = this.n5.next();
         this.a6 = false;
         if (this.l6.n5(this.u3, this.k5)) {
            this.u9 = true;
            return true;
         }
      }

      this.u9 = false;
      return this.u9;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
