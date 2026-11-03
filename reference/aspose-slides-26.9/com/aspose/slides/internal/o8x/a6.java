package com.aspose.slides.internal.o8x;

public class a6 extends n5 {
   private int u3;

   public a6(h0 var1, int var2) {
      super(var1);
      this.u3 = var2;
   }

   public a6(a6 var1) {
      super(var1);
      this.u3 = var1.u3;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new a6(this);
   }

   @Override
   public boolean l6() {
      if (this.l6 == 0) {
         if (!this.n5.u3(this.u3)) {
            return false;
         }
      } else if (!this.n5.a6(this.u3)) {
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
