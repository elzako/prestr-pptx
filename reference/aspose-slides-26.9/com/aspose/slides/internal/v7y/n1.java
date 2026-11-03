package com.aspose.slides.internal.v7y;

public class n1 extends j3 {
   public n1(com.aspose.slides.internal.x6s.a6 var1, int var2) {
      super(var1, var2, false);
   }

   public n1(com.aspose.slides.internal.x6s.a6 var1, String var2, String var3) {
      super(var1, var2, var3, false);
   }

   public n1(n1 var1) {
      super(var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new n1(this);
   }

   @Override
   public boolean l6() {
      while (this.c8 ? this.n5.t4() : this.n5.z1()) {
         this.c8 = false;
         if (this.u9()) {
            this.u9++;
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
