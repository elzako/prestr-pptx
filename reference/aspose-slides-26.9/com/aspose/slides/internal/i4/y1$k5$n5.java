package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class y1$k5$n5 implements IGenericEnumerator<g7> {
   private y1 n5;
   private IGenericEnumerator<y2> l6;
   private g7 k5;

   public y1$k5$n5(y1 var1) {
      this.n5 = var1;
      this.l6 = var1.l6.n5().iterator();
   }

   @Override
   public final boolean hasNext() {
      while (this.l6.hasNext()) {
         y2 var1 = this.l6.next();
         if (var1.l6()) {
            this.k5 = var1.n5(this.n5);
            return true;
         }
      }

      return false;
   }

   @Override
   public final void reset() {
      this.l6.reset();
   }

   public final g7 n5() {
      return this.k5;
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
   public g7 next() {
      return this.n5();
   }

}
