package com.aspose.slides.internal.b7;

public final class j9e extends v2s {
   private x4g n5;
   private int l6;

   public j9e(x4g var1, int var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public final x4g n5() {
      return this.n5;
   }

   public final void n5(x4g var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public v2s k5() {
      return new j9e(this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v2s cloneT() {
      return this.k5();
   }

}
