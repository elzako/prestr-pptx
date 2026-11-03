package com.aspose.slides.internal.k0r;

public class c5q extends e6r {
   private long n5;
   private int l6;
   private long k5;

   public c5q() {
      this.w1().n5(61748);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      this.k5 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.n5(this.k5 & 4294967295L);
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
      if (var1) {
         this.l6 |= 1;
      } else {
         this.l6 &= -2;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.l6 |= 2;
      } else {
         this.l6 &= -3;
      }
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.l6 |= 4;
      } else {
         this.l6 &= -5;
      }
   }

   public final void u3(boolean var1) {
      if (var1) {
         this.l6 |= 8;
      } else {
         this.l6 &= -9;
      }
   }

   public final void a6(boolean var1) {
      if (var1) {
         this.l6 |= 16;
      } else {
         this.l6 &= -17;
      }
   }

   public final void u9(boolean var1) {
      if (var1) {
         this.l6 |= 32;
      } else {
         this.l6 &= -33;
      }
   }

   public final int k5() {
      return (int)this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1 & 4294967295L;
   }
}
