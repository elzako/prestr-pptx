package com.aspose.slides.internal.k0r;

public class o9i extends e6r {
   private long n5;
   private long l6;
   private long k5;
   private int u3;

   public o9i() {
      this.w1().n5(61761);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      var1.c4();
      this.u3 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(0L);
      var1.l6(this.u3);
   }

   @Override
   public int n5() {
      return 20;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.u3 |= 1;
      } else {
         this.u3 &= -2;
      }
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.u3 |= 2;
      } else {
         this.u3 &= -3;
      }
   }

   public final void k5(boolean var1) {
      if (var1) {
         this.u3 |= 4;
      } else {
         this.u3 &= -5;
      }
   }
}
