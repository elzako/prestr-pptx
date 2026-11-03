package com.aspose.slides.internal.k0r;

public class n2 extends e6r {
   private long n5;
   private int l6;

   public n2() {
      this.w1().n5(1019);
      this.w1().n5((short)7);
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   final void l6(int var1) {
      switch (var1) {
         case 0:
            this.n5 = 0L;
            this.l6 = 2160;
            break;
         case 1:
            this.n5 = 1L;
            this.l6 = 2880;
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.l6(this.l6);
   }

   @Override
   public int n5() {
      return 8;
   }
}
