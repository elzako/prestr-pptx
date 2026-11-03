package com.aspose.slides.internal.k0r;

public class o8m extends e6r {
   private int n5;

   public o8m() {
      this.w1().n5(12010);
      this.w1().n5((byte)0);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1.m3());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.l6());
   }

   @Override
   public int n5() {
      return 4;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return this.l6(1);
   }

   private boolean l6(int var1) {
      return (this.l6() & 1 << var1) != 0;
   }
}
