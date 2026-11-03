package com.aspose.slides.internal.k0r;

public class x4g extends e6r {
   private byte n5;

   x4g() {
      this.w1().n5(1060);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
   }

   @Override
   public int n5() {
      return 1;
   }

   public final boolean l6() {
      return (this.n5 & 255 & 1) == 1;
   }

   public final boolean k5() {
      return (this.n5 & 255 & 2) == 2;
   }

   public final boolean u3() {
      return (this.n5 & 255 & 8) == 8;
   }
}
