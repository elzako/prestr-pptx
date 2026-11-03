package com.aspose.slides.internal.f3c;

import com.aspose.slides.Collections.IEnumerator;

public class s7$n5 implements IEnumerator {
   private IEnumerator n5;

   public s7$n5(s7 var1) {
      this.n5 = var1.iterator();
   }

   public u9 n5() {
      return (u9)this.n5.next();
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
   public u9 next() {
      return this.n5();
   }

}
