package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class p4l extends f1c {
   private p6 n5;

   public final p6 l6() {
      return this.n5;
   }

   public final void n5(p6 var1) {
      if (var1 != this.n5) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.n5();
      }
   }

   public p4l(p6 var1) {
      this.n5(var1);
   }

   @Override
   public f1c n5() {
      return new p4l(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f1c cloneT() {
      return this.n5();
   }

}
