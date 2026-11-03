package com.aspose.slides.internal.o8m;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class a5 implements IEnumerator {
   private t1 n5;
   private int l6;

   public a5(t1 var1) {
      this.n5 = var1;
      this.l6 = -1;
   }

   public u6 n5() {
      if (this.l6 < 0) {
         throw new ArgumentOutOfRangeException();
      } else {
         return this.n5.n5(this.l6);
      }
   }

   @Override
   public boolean hasNext() {
      if (++this.l6 < this.n5.size()) {
         return true;
      }

      this.l6 = this.n5.size() - 1;
      return false;
   }

   @Override
   public void reset() {
      this.l6 = -1;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u6 next() {
      return this.n5();
   }

}
