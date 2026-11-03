package com.aspose.slides.internal.k0r;

class b0 extends e6r {
   long[] n5;

   b0() {
      this.w1().n5(1042);
      this.w1().n5((short)0);
   }

   @Override
   public int n5() {
      return this.n5.length * 4;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = new long[this.w1().a6() / 4];

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         this.n5[var2] = var1.c4();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         var1.n5(this.n5[var2] & 4294967295L);
      }
   }
}
