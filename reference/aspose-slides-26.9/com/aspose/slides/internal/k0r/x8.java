package com.aspose.slides.internal.k0r;

public class x8 extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private byte u3;
   private byte a6;

   public x8() {
      this.w1().n5(11011);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.z1();
      this.a6 = var1.z1();
      var1.x8().seek(2L, 1);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3);
      var1.n5(this.a6);
      var1.n5((byte)0);
      var1.n5((byte)0);
   }

   @Override
   public int n5() {
      return 16;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }
}
