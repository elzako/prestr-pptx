package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public abstract class g1p implements IGenericCloneable<g1p> {
   private w1n n5;

   public w1n u3() {
      return this.n5;
   }

   public void n5(w1n var1) {
      if (var1 != this.n5) {
         this.n5 = null != var1 ? var1.c8() : null;
      }
   }

   public abstract g1p l6();

   protected g1p() {
   }

   protected g1p(g1p var1) {
      this.n5(var1.u3());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g1p cloneT() {
      return this.l6();
   }

}
