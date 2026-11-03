package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.y4.z1;

class u3$l6 implements IGenericEnumerator<Integer> {
   private z1 n5;
   private com.aspose.slides.internal.h0.h0 l6;
   private int k5 = 0;
   private int u3;
   private int a6;

   public u3$l6(z1 var1, com.aspose.slides.internal.h0.h0 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var2.a6();
   }

   @Override
   public final void dispose() {
      this.n5 = null;
      this.l6 = null;
   }

   @Override
   public final boolean hasNext() {
      while (this.k5 < this.u3) {
         com.aspose.slides.internal.k5.u9 var1 = this.n5.n5(this.k5);
         if (var1 != null) {
            this.a6 = this.l6.a6(this.k5);
            this.k5++;
            return true;
         }

         this.k5++;
      }

      return false;
   }

   @Override
   public final void reset() {
      this.k5 = 0;
   }

   public final Integer n5() {
      return this.k5 == -1 ? 0 : this.a6;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Integer next() {
      return this.n5();
   }

}
