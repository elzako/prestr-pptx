package com.aspose.slides.internal.k0r;

class s1 extends e6r {
   private long n5;
   private long l6;

   s1() {
      this.w1().n5(4015);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 4294967295L);
   }

   @Override
   public int n5() {
      return 8;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
   }

   public final long l6() {
      return this.n5;
   }
}
