package com.aspose.slides.internal.v7y;

public class r8 extends e9 {
   private com.aspose.slides.internal.x6s.a6 n5;
   private int l6;

   public r8(com.aspose.slides.internal.x6s.a6 var1) {
      this.n5 = var1;
   }

   public r8(com.aspose.slides.internal.x6s.a6 var1, boolean var2) {
      this(var1);
      if (var2) {
         this.l6 = 1;
      }
   }

   public r8(r8 var1) {
      this.n5 = var1.n5.n5();
      this.l6 = var1.l6;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new r8(this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5;
   }

   @Override
   public int u3() {
      return this.l6;
   }

   @Override
   public int a6() {
      return 1;
   }

   @Override
   public boolean l6() {
      if (this.l6 == 0) {
         this.l6 = 1;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void t2() {
      this.l6 = 0;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
