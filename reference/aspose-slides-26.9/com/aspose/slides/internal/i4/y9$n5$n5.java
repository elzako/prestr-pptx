package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class y9$n5$n5 implements IGenericEnumerator<String> {
   private y9 n5;
   private IGenericEnumerator<String> l6;
   private String k5;
   private boolean u3;

   public y9$n5$n5(y9 var1) {
      this.n5 = var1;
      if (y9.n5(var1) != null) {
         this.u3 = true;
         this.l6 = y9.n5(var1).a6().iterator();
      } else {
         this.l6 = y9.l6(var1).iterator();
      }
   }

   @Override
   public final boolean hasNext() {
      while (this.l6.hasNext()) {
         String var1 = this.l6.next();
         if (this.u3) {
            if (y9.n5(this.n5, var1) != null) {
               continue;
            }

            this.k5 = var1;
            return true;
         }

         this.k5 = var1;
         return true;
      }

      if (this.u3) {
         this.u3 = false;
         this.l6 = y9.l6(this.n5).iterator();
         return this.hasNext();
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      if (y9.n5(this.n5) != null) {
         y9.n5(this.n5).a6().iterator().reset();
      }

      y9.l6(this.n5).iterator().reset();
      if (y9.n5(this.n5) != null) {
         this.l6 = y9.n5(this.n5).a6().iterator();
      } else {
         this.l6 = y9.l6(this.n5).iterator();
      }
   }

   public final String n5() {
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
   public String next() {
      return this.n5();
   }

}
