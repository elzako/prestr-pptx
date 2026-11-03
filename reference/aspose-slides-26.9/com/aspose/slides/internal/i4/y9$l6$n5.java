package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class y9$l6$n5 implements IGenericEnumerator<g7> {
   private y9 n5;
   private IGenericEnumerator<String> l6;

   public y9$l6$n5(y9 var1) {
      this.n5 = var1;
      this.l6 = var1.a6().iterator();
   }

   @Override
   public final boolean hasNext() {
      return this.l6.hasNext();
   }

   @Override
   public final void reset() {
      this.l6.reset();
   }

   public final g7 n5() {
      return this.n5.n5(this.l6.next());
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
