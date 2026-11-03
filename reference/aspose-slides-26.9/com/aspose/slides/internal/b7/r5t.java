package com.aspose.slides.internal.b7;

public final class r5t extends m5 {
   private o9 n5;

   public final o9 k5() {
      return this.n5;
   }

   public final void n5(o9 var1) {
      if (var1 != this.n5) {
         this.n5 = null != var1 ? var1.n3() : null;
      }
   }

   @Override
   public g1p l6() {
      return new r5t(this);
   }

   private r5t(r5t var1) {
      super(var1);
      this.n5(var1.k5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g1p cloneT() {
      return this.l6();
   }

}
