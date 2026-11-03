package com.aspose.slides.internal.z8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class c4 implements IGenericEnumerator<com.aspose.slides.internal.l6.n3> {
   private com.aspose.slides.internal.l6.n3 n5;
   private int l6;
   private y2 k5;
   private com.aspose.slides.internal.l6.n3 u3;

   public c4(com.aspose.slides.internal.l6.n3 var1, y2 var2) {
      this.n5 = var1;
      this.k5 = var2;
   }

   @Override
   public final void dispose() {
      this.n5 = null;
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 >= this.n5.n5()) {
         return false;
      }

      while (this.l6 < this.n5.n5()) {
         com.aspose.slides.internal.l6.n3 var1 = this.n5.n5(this.l6++);
         if (this.k5 == null) {
            this.u3 = var1;
            return true;
         }

         if (!this.k5.n5(var1)) {
            this.u3 = var1;
            return true;
         }
      }

      return false;
   }

   @Override
   public final void reset() {
      this.l6 = 0;
   }

   public final com.aspose.slides.internal.l6.n3 n5() {
      return this.u3;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.l6.n3 next() {
      return this.n5();
   }

}
