package com.aspose.slides.internal.k0r;

public class r6 extends e6r {
   private int n5;
   private int l6;
   private long k5;
   private int u3;
   private long a6;

   r6() {
      this.w1().n5(4035);
      this.w1().n5((byte)1);
      this.n5 = 1;
      this.l6 = 0;
      this.k5 = 0L;
      this.u3 = 4;
      this.a6 = 0L;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.m3();
      this.k5 = var1.c4();
      this.u3 = var1.m3();
      this.a6 = var1.c4();
      var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.n5(this.k5 & 4294967295L);
      var1.l6(this.u3);
      var1.n5(this.a6 & 4294967295L);
      var1.l6(8015616);
   }

   @Override
   public int n5() {
      return 24;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   public final long u3() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }
}
