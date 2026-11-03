package com.aspose.slides.internal.k0r;

public class x2y extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private int a6;

   public x2y() {
      this.w1().n5(61760);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
      this.a6 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3 & 4294967295L);
      var1.l6(this.a6);
   }

   @Override
   public int n5() {
      return 20;
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

   public final long u3() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final long a6() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.a6 |= 1;
      } else {
         this.a6 &= -2;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.a6 |= 2;
      } else {
         this.a6 &= -3;
      }
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.a6 |= 4;
      } else {
         this.a6 &= -5;
      }
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.a6 |= 8;
      } else {
         this.a6 &= -9;
      }
   }
}
