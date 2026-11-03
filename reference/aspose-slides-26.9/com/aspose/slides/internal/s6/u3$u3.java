package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

class u3$u3 implements IGenericEnumerator<a6> {
   private IGenericEnumerator<a6> n5;
   private IGenericEnumerator<l6> l6;

   public u3$u3(IGenericEnumerable<l6> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("contourCollection");
      }

      this.l6 = var1.iterator();
   }

   @Override
   public final boolean hasNext() {
      if (this.n5 != null && this.n5.hasNext()) {
         return true;
      } else if (this.l6.hasNext()) {
         this.n5 = this.l6.next().k5().iterator().Clone();
         this.n5.hasNext();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.n5 = null;
      this.l6.reset();
   }

   public final a6 n5() {
      return this.n5 != null ? this.n5.next() : null;
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
   public a6 next() {
      return this.n5();
   }

}
