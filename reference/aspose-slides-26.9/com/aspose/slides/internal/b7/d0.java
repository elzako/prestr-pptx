package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class d0 extends n9 {
   private p6 n5;

   public final void n5(p6 var1) {
      if (this.n5 != var1) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.n5();
      }
   }

   public d0() {
      this.n5(l6());
   }

   public d0(p6 var1) {
      this.n5(var1);
   }

   @Override
   public n9 n5() {
      return new d0(this.n5);
   }

   private static p6 l6() {
      return p6.n5(79, 129, 189);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n9 cloneT() {
      return this.n5();
   }

}
