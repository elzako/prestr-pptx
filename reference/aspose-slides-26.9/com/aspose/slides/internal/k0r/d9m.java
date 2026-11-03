package com.aspose.slides.internal.k0r;

public class d9m extends e6r {
   private int n5;
   private long l6;

   public d9m() {
      this.w1().n5(61755);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.c4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.n5(this.l6 & 4294967295L);
   }

   @Override
   public int n5() {
      return 8;
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

   public final boolean k5() {
      return (this.n5 & 2) == 2;
   }

   public final void l6(boolean var1) {
      if (var1) {
         this.n5 |= 2;
      } else {
         this.n5 &= -3;
      }
   }

   public final long u3() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }
}
