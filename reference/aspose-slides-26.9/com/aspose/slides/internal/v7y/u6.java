package com.aspose.slides.internal.v7y;

public final class u6 extends k8 {
   private boolean a6;

   public u6(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   private u6(u6 var1) {
      super(var1);
      this.a6 = var1.a6;
   }

   @Override
   public void t2() {
      this.a6 = false;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      do {
         if (!this.a6) {
            this.l6 = this.n5.h0();
            if (this.l6 == null) {
               return null;
            }

            this.u3 = 0;
            this.l6 = this.l6.n5();
            this.a6 = this.l6.z8();
         } else {
            this.a6 = this.l6.j5();
         }
      } while (!this.a6 || !this.l6(this.l6));

      this.u3++;
      return this.l6;
   }

   @Override
   public boolean l6(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1.c8().length() == 0) {
         return false;
      } else {
         return this.e2() ? com.aspose.slides.ms.System.d1.a6(this.n3(), var1.u3()) : true;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u6(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
