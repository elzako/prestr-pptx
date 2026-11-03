package com.aspose.slides.internal.k0r;

public class g0 extends e6r {
   private long n5;
   private long l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private byte u9;
   private long h0;

   public g0() {
      this.w1().n5(11017);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.z1();
      this.u3 = var1.z1();
      this.a6 = var1.z1();
      this.u9 = var1.z1();
      this.h0 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5);
      var1.n5(this.u3);
      var1.n5(this.a6);
      var1.n5(this.u9);
      var1.n5(this.h0 & 4294967295L);
   }

   @Override
   public int n5() {
      return 16;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long k5() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final byte u3() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
   }

   public final void k5(byte var1) {
      this.a6 = var1;
   }

   public final void u3(byte var1) {
      this.u9 = var1;
   }
}
