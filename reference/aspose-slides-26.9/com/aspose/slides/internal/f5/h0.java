package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

public final class h0 implements IGenericEnumerator<com.aspose.slides.internal.j3.z8> {
   public com.aspose.slides.internal.j3.z8 n5;
   public com.aspose.slides.internal.j3.z8 l6;
   public boolean k5;

   public h0(com.aspose.slides.internal.j3.z8 var1) {
      this.l6 = var1;
      this.n5 = var1.t1();
      this.k5 = true;
   }

   @Override
   public final boolean hasNext() {
      if (this.k5) {
         this.n5 = this.l6.t1();
         this.k5 = false;
      } else if (this.n5 != null) {
         this.n5 = this.n5.z7();
      }

      return this.n5 != null;
   }

   @Override
   public final void reset() {
      this.k5 = true;
      this.n5 = this.l6.t1();
   }

   public final com.aspose.slides.internal.j3.z8 n5() {
      if (!this.k5 && this.n5 != null) {
         return this.n5;
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public final void dispose() {
      this.l6 = null;
      this.n5 = null;
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
