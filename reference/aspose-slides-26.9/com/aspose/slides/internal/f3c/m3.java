package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;

public final class m3 implements IEnumerator {
   private IEnumerator n5;

   public m3(ArrayList var1) {
      this.n5 = var1.iterator();
   }

   public m1 n5() {
      return (m1)this.n5.next();
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
   public m1 next() {
      return this.n5();
   }

}
