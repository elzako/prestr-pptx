package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class h6n$n5 implements IGenericEnumerator<x6u> {
   private h6n n5;
   private IGenericEnumerator<x6u> l6;

   public h6n$n5(h6n var1) {
      this.n5 = var1;
      this.l6 = var1.n5.getValues().iterator();
   }

   @Override
   public final void reset() {
      this.l6.reset();
   }

   public final x6u n5() {
      return this.l6.next();
   }

   @Override
   public final boolean hasNext() {
      while (this.l6.hasNext()) {
         x6u var1 = this.l6.next();
         if (var1.u3() || !h6n.n5(this.n5).containsKey(var1.k5())) {
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

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x6u next() {
      return this.n5();
   }

}
