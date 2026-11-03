package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class s4$n5 implements IGenericEnumerator<Object> {
   private s4 n5;
   private h6 l6;
   private boolean k5;

   public s4$n5(s4 var1) {
      this.n5 = var1;
      this.k5 = true;
   }

   @Override
   public final boolean hasNext() {
      if (this.k5) {
         this.l6 = s4.n5(this.n5);
         this.k5 = false;
         return this.l6 != null;
      } else if (this.l6 != null && this.l6.l6() != null) {
         this.l6 = this.l6.l6();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.k5 = true;
   }

   @Override
   public final Object next() {
      return this.l6;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
