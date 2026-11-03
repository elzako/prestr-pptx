package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

public final class e2 implements IEnumerator {
   private IEnumerator n5;

   public e2(IEnumerable var1) {
      this.n5 = var1.iterator();
   }

   public n3 n5() {
      return (n3)this.n5.next();
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
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n3 next() {
      return this.n5();
   }

}
