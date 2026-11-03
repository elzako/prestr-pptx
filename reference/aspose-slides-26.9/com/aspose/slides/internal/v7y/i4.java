package com.aspose.slides.internal.v7y;

public final class i4 extends k8 {
   private com.aspose.slides.internal.x6s.a6 a6;
   private com.aspose.slides.internal.x6s.h0 u9;

   public i4(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private i4(i4 var1) {
      super(var1);
      this.a6 = k5(var1.a6);
      this.u9 = l6(var1.u9);
   }

   @Override
   public void t2() {
      this.u9 = null;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      if (this.u9 == null) {
         this.a6 = this.n5.h0();
         if (this.a6 == null) {
            return null;
         }

         com.aspose.slides.internal.x6s.a6 var1;
         do {
            var1 = this.a6.n5();
            this.a6 = this.n5.h0();
         } while (var1.k5(this.a6));

         this.a6 = var1;
         this.u9 = s4.n5;
      }

      while (!this.u9.l6()) {
         boolean var2;
         if (this.a6.k5() != 2 && this.a6.k5() != 3) {
            while (!this.a6.z1()) {
               if (!this.a6.q0()) {
                  return null;
               }
            }

            var2 = true;
         } else {
            this.a6.q0();
            var2 = false;
         }

         if (this.e2()) {
            this.u9 = this.a6.n5(this.n3(), this.y4(), var2);
         } else {
            this.u9 = this.a6.n5(this.t9(), var2);
         }
      }

      this.u3++;
      this.l6 = this.u9.k5();
      return this.l6;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new i4(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
