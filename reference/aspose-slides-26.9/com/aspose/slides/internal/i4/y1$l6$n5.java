package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

class y1$l6$n5 implements IGenericEnumerator<String> {
   private y1 n5;
   private IGenericEnumerator<KeyValuePair<String, y2>> l6;
   private IGenericEnumerator<String> k5;
   private y1 u3;
   private String a6;
   private boolean u9;

   public y1$l6$n5(y1 var1) {
      this.n5 = var1;
      this.u3 = y1.l6(var1);
      if (this.u3 != l5.n5 && this.u3 != y5.n5 && this.u3 != null) {
         this.k5 = this.u3.a6().iterator();
      } else {
         this.l6 = var1.l6.iterator();
      }

      this.u9 = false;
   }

   @Override
   public final boolean hasNext() {
      if (this.u3 != l5.n5 && this.u3 != y5.n5 && this.u3 != null && !this.u9) {
         while (this.k5.hasNext()) {
            String var1 = this.k5.next();
            if (!this.n5.k5(var1)) {
               this.a6 = var1;
               return true;
            }
         }

         this.u9 = true;
         this.l6 = this.n5.l6.iterator();
      }

      while (this.l6.hasNext()) {
         KeyValuePair var2 = this.l6.next().Clone();
         if (((y2)var2.getValue()).l6() && ((y2)var2.getValue()).a6() == this.n5) {
            this.a6 = (String)var2.getKey();
            return true;
         }
      }

      return false;
   }

   @Override
   public final void reset() {
      if (this.u3 != l5.n5 && this.u3 != y5.n5 && this.u3 != null) {
         this.k5 = this.u3.a6().iterator();
         this.k5.reset();
         this.u9 = false;
      } else {
         this.l6 = this.n5.l6.iterator();
      }

      this.n5.l6.iterator().reset();
   }

   public final String n5() {
      return this.a6;
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
