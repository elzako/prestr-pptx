package com.aspose.slides.internal.k0r;

public abstract class v4m extends e6r {
   private byte n5;
   private byte[] l6;

   v4m() {
      this.w1().n5(61762);
      this.w1().n5((byte)0);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      this.l6 = var1.c8(this.w1().a6() - 1);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6);
   }

   @Override
   public int n5() {
      return 1 + this.l6.length;
   }

   public final int l6() {
      return this.n5 & 0xFF;
   }

   protected final void n5(int var1) {
      this.n5 = (byte)var1;
   }

   public final byte[] k5() {
      return this.l6;
   }

   protected final void n5(byte[] var1) {
      this.l6 = var1;
   }

   protected abstract void u3();
}
