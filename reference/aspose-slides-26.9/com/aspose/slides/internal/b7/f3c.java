package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class f3c extends u6p {
   private r6i n5;

   public final r6i l6() {
      return this.n5;
   }

   public final void n5(r6i var1) {
      if (var1 != this.n5) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.n5 = var1.a6();
      }
   }

   public f3c(r6i var1) {
      this.n5(var1);
   }

   @Override
   public u6p n5() {
      return new f3c(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u6p cloneT() {
      return this.n5();
   }

}
