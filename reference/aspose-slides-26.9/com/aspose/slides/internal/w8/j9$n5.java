package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class j9$n5 implements IGenericEnumerator<com.aspose.slides.internal.j3.z8> {
   private IGenericEnumerator<z6> n5;

   public j9$n5(List<z6> var1) {
      this.n5 = var1.iterator().Clone();
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

   public final com.aspose.slides.internal.j3.z8 n5() {
      return this.n5.next();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.j3.z8 next() {
      return this.n5();
   }

}
