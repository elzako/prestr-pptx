package com.aspose.slides.internal.k0r;

public class o9b extends e6r {
   private int n5;

   public o9b() {
      this.w1().n5(1056);
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1() & 255;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5((byte)this.n5);
   }

   @Override
   public int n5() {
      return 1;
   }
}
