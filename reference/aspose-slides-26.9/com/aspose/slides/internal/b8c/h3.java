package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.IEnumerator;

public class h3 implements IEnumerator<x4> {
   private IEnumerator<x4> n5;

   public h3(IEnumerator<x4> var1) {
      this.n5 = var1;
   }

   @Override
   public final void reset() {
      this.n5.reset();
   }

   @Override
   public final boolean hasNext() {
      return this.n5.hasNext();
   }

   public final x4 n5() {
      return this.n5.next();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x4 next() {
      return this.n5();
   }

}
