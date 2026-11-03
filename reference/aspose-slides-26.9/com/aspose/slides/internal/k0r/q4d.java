package com.aspose.slides.internal.k0r;

public class q4d extends e6r {
   private int n5;
   private long l6;
   private long k5;
   private long u3;

   public q4d() {
      this.w1().n5(61747);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3 & 4294967295L);
   }

   @Override
   public int n5() {
      return 16;
   }

   public final boolean l6() {
      return (this.n5 & 1) == 1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.n5 |= 1;
      } else {
         this.n5 &= -2;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.n5 |= 4;
      } else {
         this.n5 &= -5;
      }
   }

   public final long k5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final void k5(long var1) {
      this.u3 = var1;
   }
}
