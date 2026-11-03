package com.aspose.slides.internal.k0r;

public class j6 extends e6r {
   private int n5;
   private byte l6;
   private byte k5;
   private byte u3;

   public j6() {
      this.w1().n5(4045);
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.z1();
      this.k5 = var1.z1();
      this.u3 = var1.z1();
      var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
      var1.n5((byte)0);
   }

   @Override
   public int n5() {
      return 8;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final byte k5() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void k5(byte var1) {
      this.u3 = var1;
   }
}
