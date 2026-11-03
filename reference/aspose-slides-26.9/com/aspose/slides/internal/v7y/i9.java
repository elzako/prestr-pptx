package com.aspose.slides.internal.v7y;

public final class i9 extends w5 {
   private boolean u9;

   public i9(j9 var1, String var2, String var3, int var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.u9 = var5;
   }

   private i9(i9 var1) {
      super(var1);
      this.u9 = var1.u9;
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      super.n5(var1);
      com.aspose.slides.internal.x6s.a6 var2 = null;

      com.aspose.slides.internal.x6s.a6 var3;
      while ((var3 = this.n5.h0()) != null) {
         if (!this.u9 || !this.l6(var3) || this.n5(this.a6, var3)) {
            if (var2 == null || !var2.n5(var3)) {
               var2 = var3.n5();
            }

            while (var2.q0() && (!this.l6(var2) || this.n5(this.a6, var2))) {
            }
         }
      }

      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new i9(this);
   }

   @Override
   public int u3() {
      return this.a6.size() - this.k5 + 1;
   }

   @Override
   public int c8() {
      return super.c8() | 8;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
