package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

class c4$n5 implements IGenericEnumerator<o0$n5> {
   private c4 n5;
   private int l6 = -3;
   private o0$n5 k5 = new o0$n5();

   public c4$n5(c4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("mesh");
      }

      this.n5 = c4.n5(var1);
   }

   @Override
   public final boolean hasNext() {
      this.l6 += 3;
      return this.l6 < this.n5.k5().length - 2;
   }

   @Override
   public final void reset() {
      this.l6 = -3;
   }

   public final o0$n5 n5() {
      int var1 = this.n5.k5()[this.l6];
      c4.l6(this.n5)[var1].l6(this.k5.n5.n5);
      c4.k5(this.n5)[var1].l6(this.k5.n5.l6);
      this.n5.l6()[var1].n5(this.k5.n5.k5);
      var1 = this.n5.k5()[this.l6 + 1];
      c4.l6(this.n5)[var1].l6(this.k5.l6.n5);
      c4.k5(this.n5)[var1].l6(this.k5.l6.l6);
      this.n5.l6()[var1].n5(this.k5.l6.k5);
      var1 = this.n5.k5()[this.l6 + 2];
      c4.l6(this.n5)[var1].l6(this.k5.k5.n5);
      c4.k5(this.n5)[var1].l6(this.k5.k5.l6);
      this.n5.l6()[var1].n5(this.k5.k5.k5);
      return this.k5;
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
   public o0$n5 next() {
      return this.n5();
   }

}
