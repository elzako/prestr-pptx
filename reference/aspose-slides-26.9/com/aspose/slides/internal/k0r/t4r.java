package com.aspose.slides.internal.k0r;

public class t4r extends e6r {
   private long n5;
   private int l6;

   public t4r() {
      this.w1().n5(1058);
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

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.r4();
      var1.r4();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 65535);
      var1.n5(0);
   }

   @Override
   public int n5() {
      return 8;
   }
}
