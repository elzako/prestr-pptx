package com.aspose.slides.internal.k0r;

public class p1 extends e6r {
   private long n5;
   private int l6;

   public p1() {
      super(61450, (byte)2);
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void n5(boolean var1) {
      this.l6 |= 1;
      if (!var1) {
         this.l6 ^= 1;
      }
   }

   public final boolean k5() {
      return (this.l6 & 2) != 0;
   }

   public final void l6(boolean var1) {
      this.l6 |= 2;
      if (!var1) {
         this.l6 ^= 2;
      }
   }

   public final void k5(boolean var1) {
      this.l6 |= 4;
      if (!var1) {
         this.l6 ^= 4;
      }
   }

   public final void u3(boolean var1) {
      this.l6 |= 8;
      if (!var1) {
         this.l6 ^= 8;
      }
   }

   public final void a6(boolean var1) {
      this.l6 |= 16;
      if (!var1) {
         this.l6 ^= 16;
      }
   }

   public final boolean u3() {
      return (this.l6 & 32) != 0;
   }

   public final void u9(boolean var1) {
      this.l6 |= 32;
      if (!var1) {
         this.l6 ^= 32;
      }
   }

   public final boolean a6() {
      return (this.l6 & 64) != 0;
   }

   public final void h0(boolean var1) {
      this.l6 |= 64;
      if (!var1) {
         this.l6 ^= 64;
      }
   }

   public final boolean u9() {
      return (this.l6 & 128) != 0;
   }

   public final void c8(boolean var1) {
      this.l6 |= 128;
      if (!var1) {
         this.l6 ^= 128;
      }
   }

   public final void t2(boolean var1) {
      this.l6 |= 256;
      if (!var1) {
         this.l6 ^= 256;
      }
   }

   public final void s7(boolean var1) {
      this.l6 |= 512;
      if (!var1) {
         this.l6 ^= 512;
      }
   }

   public final boolean h0() {
      return (this.l6 & 1024) != 0;
   }

   public final void x8(boolean var1) {
      this.l6 |= 1024;
      if (!var1) {
         this.l6 ^= 1024;
      }
   }

   public final boolean c8() {
      return (this.l6 & 2048) != 0;
   }

   public final void n3(boolean var1) {
      this.l6 |= 2048;
      if (!var1) {
         this.l6 ^= 2048;
      }
   }

   public final int t2() {
      return this.w1().k5();
   }

   public final void n5(int var1) {
      this.w1().n5((short)var1);
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
}
