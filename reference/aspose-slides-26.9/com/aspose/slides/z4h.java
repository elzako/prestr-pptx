package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

class z4h implements IGenericEnumerator<d6b> {
   private int l6;
   private d6b k5 = new d6b();
   public final String n5;

   public z4h(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("str");
      }

      this.n5 = var1;
      this.reset();
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final boolean hasNext() {
      if (this.l6 + 1 < this.n5.length()) {
         this.l6++;
         char var1 = this.n5.charAt(this.l6);
         if (com.aspose.slides.ms.System.t9.a6(var1)) {
            if (this.l6 + 1 < this.n5.length()) {
               this.l6++;
               this.k5 = new d6b(var1, this.n5.charAt(this.l6));
            } else {
               this.k5 = new d6b(var1);
            }
         } else {
            this.k5 = new d6b(var1);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void reset() {
      this.l6 = -1;
      d6b.n5.n5(this.k5);
   }

   public final d6b n5() {
      return this.k5;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d6b next() {
      return this.n5();
   }

}
