package com.aspose.slides.internal.v7y;

public class w8 extends k8 {
   private com.aspose.slides.internal.x6s.h0 a6 = s4.n5;

   public w8(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   protected w8(w8 var1) {
      super(var1);
      this.a6 = l6(var1.a6);
   }

   @Override
   public void t2() {
      this.a6 = s4.n5;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while (!this.a6.l6()) {
         com.aspose.slides.internal.x6s.a6 var1 = this.n5.h0();
         if (var1 == null) {
            return null;
         }

         if (this.e2()) {
            if (this.t9() == 7) {
               this.a6 = new c8(var1.u9(this.t9()), this.n3());
            } else {
               this.a6 = var1.a6(this.n3(), this.y4());
            }
         } else {
            this.a6 = var1.u9(this.t9());
         }

         this.u3 = 0;
      }

      this.u3++;
      this.l6 = this.a6.k5();
      return this.l6;
   }

   @Override
   public final com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1 != null && this.l6(var1)) {
         com.aspose.slides.internal.x6s.a6 var2 = var1.n5();
         return var2.k5() != 2 && var2.q0() ? this.n5.n5(var2) : null;
      } else {
         return null;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new w8(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
