package com.aspose.slides.internal.o8x;

public class u9 extends n5 {
   private h0 u3;
   private int a6;
   private boolean u9;

   public u9(h0 var1, int var2, boolean var3) {
      super(var1);
      this.a6 = var2;
      this.u9 = var3;
      if (var1.k5() != 0) {
         this.u3 = new h0(var1);
         this.u3.w1();
      }
   }

   public u9(u9 var1) {
      super(var1);
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u9(this);
   }

   @Override
   public boolean l6() {
      if (this.u9) {
         this.u9 = false;
         if (this.n5.s7(this.a6)) {
            this.l6++;
            return true;
         }
      }

      if (!this.n5.n5(this.a6, this.u3)) {
         return false;
      }

      this.l6++;
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
