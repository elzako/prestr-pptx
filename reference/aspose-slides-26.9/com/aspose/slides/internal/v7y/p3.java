package com.aspose.slides.internal.v7y;

public final class p3 extends w5 {
   public p3(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private p3(p3 var1) {
      super(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      super.n5(var1);

      com.aspose.slides.internal.x6s.a6 var2;
      while ((var2 = this.n5.h0()) != null) {
         var2 = var2.n5();
         if (var2.q0() && this.l6(var2)) {
            this.n5(this.a6, var2);
         }
      }

      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new p3(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
