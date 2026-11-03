package com.aspose.slides.internal.v7y;

public final class a7 extends k8 {
   public a7(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private a7(a7 var1) {
      super(var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while ((this.l6 = this.n5.h0()) != null) {
         if (this.l6(this.l6)) {
            this.u3 = 1;
            return this.l6;
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new a7(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
