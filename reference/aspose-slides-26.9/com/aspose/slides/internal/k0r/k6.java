package com.aspose.slides.internal.k0r;

public class k6 extends e6r {
   private long n5;
   private long l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private byte t2;

   public k6() {
      this.w1().n5(4083);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3() & 4294967295L;
      this.l6 = var1.m3() & 4294967295L;
      this.k5 = var1.z1();
      this.u3 = var1.z1();
      this.a6 = var1.z1();
      byte var2 = var1.z1();
      this.u9 = (var2 & 255 & 1) > 0;
      this.h0 = (var2 & 255 & 2) > 0;
      this.c8 = (var2 & 255 & 4) > 0;
      this.t2 = var1.z1();
      var1.z1();
      var1.z1();
      var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5);
      var1.n5(this.u3);
      var1.n5(this.a6);
      byte var2 = 0;
      if (this.u9) {
         var2 = (byte)(var2 & 0xFF | 1);
      }

      if (this.h0) {
         var2 = (byte)(var2 & 0xFF | 2);
      }

      if (this.c8) {
         var2 = (byte)(var2 & 0xFF | 4);
      }

      var1.n5(var2);
      var1.n5(this.t2);
      var1.n5((byte)0);
      var1.n5((byte)0);
      var1.n5((byte)0);
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

   public final int a6() {
      return this.a6 & 0xFF;
   }

   public final void n5(int var1) {
      this.a6 = (byte)var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   public final byte c8() {
      return this.t2;
   }

   public final void l6(byte var1) {
      this.t2 = var1;
   }
}
