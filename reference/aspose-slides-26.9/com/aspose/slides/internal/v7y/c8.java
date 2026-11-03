package com.aspose.slides.internal.v7y;

public class c8 extends com.aspose.slides.internal.x6s.h0 {
   private com.aspose.slides.internal.x6s.h0 n5;
   private String l6;
   private int u3 = 0;

   public c8(com.aspose.slides.internal.x6s.h0 var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   private c8(c8 var1) {
      this.n5 = var1.n5.n5();
      this.l6 = var1.l6;
      this.u3 = var1.u3;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new c8(this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5.k5();
   }

   @Override
   public int u3() {
      return this.u3;
   }

   @Override
   public boolean l6() {
      while (this.n5.l6()) {
         if (com.aspose.slides.ms.System.d1.a6(this.n5.k5().u3(), this.l6)) {
            this.u3++;
            return true;
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
