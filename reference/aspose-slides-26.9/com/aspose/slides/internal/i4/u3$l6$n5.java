package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class u3$l6$n5 implements IGenericEnumerator<g7> {
   private u3 n5;
   private IGenericEnumerator<g7> l6;
   private IGenericEnumerator<g7> k5;
   private g7 u3;

   public u3$l6$n5(u3 var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.i4.u3.n5(var1).getValues().iterator();
      this.k5 = com.aspose.slides.internal.i4.u3.k5(var1).iterator();
   }

   @Override
   public final boolean hasNext() {
      if (this.l6.hasNext()) {
         this.u3 = this.l6.next();
         return true;
      } else if (this.k5.hasNext()) {
         this.u3 = this.k5.next();
         return true;
      } else {
         this.u3 = null;
         return false;
      }
   }

   @Override
   public final void reset() {
      com.aspose.slides.internal.i4.u3.n5(this.n5).iterator().reset();
      com.aspose.slides.internal.i4.u3.k5(this.n5).iterator().reset();
      this.l6 = com.aspose.slides.internal.i4.u3.n5(this.n5).getValues().iterator();
      this.k5 = com.aspose.slides.internal.i4.u3.k5(this.n5).iterator();
   }

   public final g7 n5() {
      return this.u3;
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         this.n5 = null;
         this.l6 = null;
      }
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
