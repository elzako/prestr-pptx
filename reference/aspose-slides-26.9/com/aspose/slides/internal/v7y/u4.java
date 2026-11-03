package com.aspose.slides.internal.v7y;

public class u4 extends j9 {
   protected com.aspose.slides.internal.x6s.a6 n5;

   public u4() {
      this.k5 = 0;
   }

   protected u4(u4 var1) {
      super(var1);
      this.n5 = var1.n5;
   }

   @Override
   public void t2() {
      this.k5 = 0;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5;
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      this.n5 = var1.k5();
      this.k5 = 0;
      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      if (this.k5 == 0) {
         this.k5 = 1;
         return this.n5;
      } else {
         return null;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      return var1;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u4(this);
   }

   @Override
   public int u9() {
      return 3;
   }

   @Override
   public int u3() {
      return this.k5;
   }

   @Override
   public int a6() {
      return 1;
   }

   @Override
   public int c8() {
      return 23;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
