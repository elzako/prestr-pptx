package com.aspose.slides.internal.k0r;

public class u2 extends e6r {
   private long n5;
   private int l6;
   private int k5;

   public u2() {
      this.w1().n5(4100);
      this.l6 = 0;
      this.k5 = 1077;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.r4() & 65535;
      this.k5 = var1.r4() & 65535;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 65535);
      var1.n5(this.k5 & 65535);
   }

   @Override
   public int n5() {
      return 8;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return (this.l6 & 1) == 1;
   }

   public final void n5(boolean var1) {
      if (var1) {
         this.l6 |= 1;
      } else {
         this.l6 &= -2;
      }
   }

   public final boolean u3() {
      return (this.l6 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.l6 |= 2;
      } else {
         this.l6 &= -3;
      }
   }
}
