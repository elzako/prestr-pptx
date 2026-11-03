package com.aspose.slides.internal.k0r;

public class a2w extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private long u9;
   private int h0;
   private int c8;

   public a2w() {
      this.w1().n5(61735);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
      this.a6 = var1.c4();
      this.u9 = var1.c4();
      this.h0 = var1.m3();
      this.c8 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3 & 4294967295L);
      var1.n5(this.a6 & 4294967295L);
      var1.n5(this.u9 & 4294967295L);
      var1.l6(this.h0);
      var1.l6(this.c8);
   }

   @Override
   public int n5() {
      return 32;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return (int)this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1 & 4294967295L;
   }

   public final long u3() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final boolean u9() {
      return (this.c8 & 1) == 1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.c8 |= 1;
      } else {
         this.c8 &= -2;
      }
   }

   public final boolean h0() {
      return (this.c8 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.c8 |= 2;
      } else {
         this.c8 &= -3;
      }
   }

   public final boolean c8() {
      return (this.c8 & 8) == 8;
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.c8 |= 8;
      } else {
         this.c8 &= -9;
      }
   }

   public final boolean t2() {
      return (this.c8 & 16) == 16;
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.c8 |= 16;
      } else {
         this.c8 &= -17;
      }
   }
}
