package com.aspose.slides.internal.v7y;

public class i6 extends e9 {
   private com.aspose.slides.internal.x6s.a6 n5;
   private j9 l6;
   private int u3;

   public i6(com.aspose.slides.internal.x6s.a6 var1, j9 var2) {
      this.n5 = var1.n5();
      this.l6 = var2;
   }

   protected i6(i6 var1) {
      this.n5 = var1.n5.n5();
      this.l6 = (j9)var1.l6.n5();
      this.u3 = var1.u3;
   }

   @Override
   public void t2() {
      this.l6.t2();
   }

   @Override
   public boolean l6() {
      com.aspose.slides.internal.x6s.a6 var1 = this.l6.h0();
      if (var1 != null) {
         this.u3++;
         if (!this.n5.n5(var1)) {
            this.n5 = var1.n5();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int a6() {
      return this.l6.a6();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5;
   }

   @Override
   public int u3() {
      return this.u3;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new i6(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
