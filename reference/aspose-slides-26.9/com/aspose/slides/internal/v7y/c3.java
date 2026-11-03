package com.aspose.slides.internal.v7y;

public final class c3 extends k8 {
   private boolean a6 = false;

   public c3(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private c3(c3 var1) {
      super(var1);
      this.a6 = var1.a6;
   }

   @Override
   public void t2() {
      this.a6 = false;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      do {
         if (!this.a6) {
            this.l6 = this.n5.h0();
            if (this.l6 == null) {
               return null;
            }

            this.u3 = 0;
            this.l6 = this.l6.n5();
            this.a6 = this.l6.e2();
         } else {
            this.a6 = this.l6.t9();
         }
      } while (!this.a6 || !this.l6(this.l6));

      this.u3++;
      return this.l6;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1 != null && var1.k5() == 2 && this.l6(var1)) {
         com.aspose.slides.internal.x6s.a6 var2 = var1.n5();
         if (var2.q0()) {
            return this.n5.n5(var2);
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new c3(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
