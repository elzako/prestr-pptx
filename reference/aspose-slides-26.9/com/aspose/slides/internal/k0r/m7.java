package com.aspose.slides.internal.k0r;

public class m7 extends e6r {
   private int n5;
   private int l6;
   private int k5;
   private short u3;

   public m7() {
      this.w1().n5(3011);
      this.w1().n5((byte)0);
      this.w1().n5((short)0);
      this.u3 = 0;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.z1() & 255;
      this.k5 = var1.z1() & 255;
      this.u3 = var1.k7();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5((byte)this.l6);
      var1.n5((byte)this.k5);
      var1.n5(this.u3);
   }

   @Override
   public int n5() {
      return 8;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int u3() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }
}
