package com.aspose.slides.internal.k0r;

public class n9 extends e6r {
   private long n5;
   private int l6;

   n9() {
      this.w1().n5(4115);
      this.w1().n5((short)1);
      this.w1().n5((byte)1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
   }

   @Override
   public int n5() {
      return 8;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }
}
