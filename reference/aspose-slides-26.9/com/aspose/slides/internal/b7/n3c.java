package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class n3c extends v2s {
   private e5 n5;

   public final void n5(e5 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      if (var1 != this.n5) {
         this.n5 = var1.k5();
      }
   }

   public n3c(e5 var1) {
      this.n5(var1);
   }

   @Override
   public v2s k5() {
      return new n3c(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v2s cloneT() {
      return this.k5();
   }

}
