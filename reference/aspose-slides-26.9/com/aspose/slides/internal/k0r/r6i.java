package com.aspose.slides.internal.k0r;

public class r6i extends e6r {
   private boolean n5 = false;
   private boolean l6 = false;

   r6i() {
      this.w1().n5(1022);
   }

   final void l6() {
      this.n5 = true;
      this.l6 = false;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      var1.z1();
      this.n5 = (var1.z1() & 255) != 0;
      this.l6 = (var1.z1() & 255) != 0;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5((byte)0);
      var1.n5((byte)(this.n5 ? 1 : 0));
      var1.n5((byte)(this.l6 ? 1 : 0));
   }

   @Override
   public int n5() {
      return 3;
   }
}
