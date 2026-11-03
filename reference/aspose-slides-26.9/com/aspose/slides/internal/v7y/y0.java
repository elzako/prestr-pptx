package com.aspose.slides.internal.v7y;

public final class y0 extends k8 {
   private com.aspose.slides.internal.x6s.h0 a6;
   private c2<com.aspose.slides.internal.x6s.a6> u9;

   public y0(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
      this.u9 = new c2<>();
   }

   private y0(y0 var1) {
      super(var1);
      this.a6 = l6(var1.a6);
      this.u9 = var1.u9.k5();
   }

   @Override
   public void t2() {
      this.a6 = null;
      this.u9.clear();
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      if (this.a6 == null) {
         com.aspose.slides.internal.x6s.a6 var1 = this.n5.h0();
         if (var1 == null) {
            return null;
         }

         com.aspose.slides.internal.x6s.a6 var2 = var1.n5();

         do {
            var2.n5(var1);
         } while ((var1 = this.n5.h0()) != null);

         if (var2.k5() == 2 || var2.k5() == 3) {
            var2.q0();
         }

         do {
            this.u9.n5(var2.n5());
         } while (var2.q0());

         this.a6 = var2.n5(9, true);
      }

      while (this.a6.l6()) {
         this.l6 = this.a6.k5();
         if (this.l6.l6(this.u9.l6())) {
            this.u9.n5();
            if (this.u9.size() == 0) {
               this.l6 = null;
               this.a6 = null;
               return null;
            }
         } else if (this.l6(this.l6)) {
            this.u3++;
            return this.l6;
         }
      }

      com.aspose.slides.internal.f8y.n5.n5("Algorithm error: we missed the centinel node");
      return null;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new y0(this);
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
