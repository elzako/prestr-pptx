package com.aspose.slides.internal.v7y;

public class z5 extends s9 {
   private com.aspose.slides.internal.x6s.h0 h0;

   public z5(j9 var1, String var2, String var3, int var4, boolean var5, boolean var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public z5(z5 var1) {
      super(var1);
      this.h0 = l6(var1.h0);
   }

   @Override
   public void t2() {
      this.h0 = null;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while (true) {
         if (this.h0 == null) {
            this.u3 = 0;
            com.aspose.slides.internal.x6s.a6 var1 = this.n5.h0();
            if (var1 == null) {
               return null;
            }

            if (this.e2()) {
               if (this.t9() == 7) {
                  this.h0 = new c8(var1.n5(this.t9(), this.a6), this.n3());
               } else {
                  this.h0 = var1.n5(this.n3(), this.y4(), this.a6);
               }
            } else {
               this.h0 = var1.n5(this.t9(), this.a6);
            }
         }

         if (this.h0.l6()) {
            this.u3++;
            this.l6 = this.h0.k5();
            return this.l6;
         }

         this.h0 = null;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new z5(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
