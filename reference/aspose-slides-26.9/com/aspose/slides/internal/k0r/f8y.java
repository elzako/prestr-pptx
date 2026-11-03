package com.aspose.slides.internal.k0r;

public abstract class f8y extends e6r implements j1 {
   private byte[] n5;
   private x5e l6;

   f8y(int var1) {
      this.w1().n5(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c8(this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5 != null) {
         var1.n5(this.n5);
      }
   }

   @Override
   public int n5() {
      return this.n5 == null ? 0 : this.n5.length;
   }

   @Override
   public final byte[] u3() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
      if (this.l6 != null) {
         this.l6.n5();
      }
   }
}
