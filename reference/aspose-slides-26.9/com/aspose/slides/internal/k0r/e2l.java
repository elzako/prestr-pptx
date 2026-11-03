package com.aspose.slides.internal.k0r;

public class e2l extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private int u3;

   public e2l() {
      this.w1().n5(61736);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.l6(this.u3);
   }

   @Override
   public int n5() {
      return 16;
   }

   public final int l6() {
      return (int)this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1 & 4294967295L;
   }

   public final long k5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long u3() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }
}
