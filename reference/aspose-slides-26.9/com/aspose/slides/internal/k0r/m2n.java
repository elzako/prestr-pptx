package com.aspose.slides.internal.k0r;

public class m2n extends e6r {
   private long n5;
   private int l6;
   private int k5 = 2;

   m2n() {
      this.w1().n5((byte)2);
      this.w1().n5(1024);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      this.k5 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.l6(this.k5);
   }

   @Override
   public int n5() {
      return 12;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void n5(boolean var1) {
      this.l6 = var1 ? 1 : 0;
   }
}
