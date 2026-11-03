package com.aspose.slides.internal.v7y;

public class d1 extends j3 {
   private int t2 = 0;

   public d1(com.aspose.slides.internal.x6s.a6 var1, int var2, boolean var3) {
      super(var1, var2, var3);
   }

   public d1(com.aspose.slides.internal.x6s.a6 var1, String var2, String var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public d1(d1 var1) {
      super(var1);
      this.t2 = var1.t2;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new d1(this);
   }

   @Override
   public boolean l6() {
      if (this.c8) {
         this.c8 = false;
         if (this.h0 && this.u9()) {
            this.u9 = 1;
            return true;
         }
      }

      label30:
      do {
         if (this.n5.t4()) {
            this.t2++;
         } else {
            while (this.t2 != 0) {
               if (this.n5.z1()) {
                  continue label30;
               }

               this.n5.q0();
               this.t2--;
            }

            return false;
         }
      } while (!this.u9());

      this.u9++;
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
