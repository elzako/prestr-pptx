package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class u3$k5$n5<T> implements IGenericEnumerator<T> {
   IEnumerator n5;
   // $VF: synthetic field
   final u3$k5 l6;

   private u3$k5$n5(u3$k5 var1) {
      this.l6 = var1;
      this.n5 = u3$k5.n5(this.l6).iterator();
   }

   @Override
   public T next() {
      return (T)this.n5.next();
   }

   @Override
   public void remove() {
      this.n5.remove();
   }

   @Override
   public boolean hasNext() {
      return this.n5.hasNext();
   }

   @Override
   public void reset() {
      this.n5.reset();
   }

   @Override
   public void dispose() {
   }

   // $VF: synthetic method
   u3$k5$n5(u3$k5 var1, a6 var2) {
      this(var1);
   }
}
