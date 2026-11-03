package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

class u3$n5$n5 implements IGenericEnumerator<String> {
   private u3 n5;
   private IGenericEnumerator<Integer> l6;
   private IGenericEnumerator<String> k5;
   private String u3;

   public u3$n5$n5(u3 var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.i4.u3.n5(var1).getKeys().iterator();
      this.k5 = com.aspose.slides.internal.i4.u3.l6(var1).iterator();
   }

   @Override
   public final boolean hasNext() {
      if (this.l6.hasNext()) {
         this.u3 = com.aspose.slides.ms.System.a3.l6(this.l6.next());
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
      com.aspose.slides.internal.i4.u3.n5(this.n5).getKeys().iterator().reset();
      com.aspose.slides.internal.i4.u3.l6(this.n5).iterator().reset();
      this.l6 = com.aspose.slides.internal.i4.u3.n5(this.n5).getKeys().iterator();
      this.k5 = com.aspose.slides.internal.i4.u3.l6(this.n5).iterator();
   }

   public final String n5() {
      return this.u3;
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
