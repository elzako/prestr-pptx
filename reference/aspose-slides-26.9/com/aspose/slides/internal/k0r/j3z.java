package com.aspose.slides.internal.k0r;

public class j3z extends v4m {
   private com.aspose.slides.ms.System.o5<Boolean> n5 = new com.aspose.slides.ms.System.o5<>();

   public j3z() {
      this.n5(0);
   }

   public j3z(boolean var1) {
      this.n5(0);
      this.n5(new byte[1]);
      this.k5()[0] = (byte)(var1 ? 1 : 0);
   }

   public final boolean a6() {
      if (!this.n5.l6()) {
         this.u3();
      }

      return this.n5.n5();
   }

   @Override
   protected void u3() {
      this.n5 = new com.aspose.slides.ms.System.o5<>((this.k5()[0] & 255) != 0);
   }
}
