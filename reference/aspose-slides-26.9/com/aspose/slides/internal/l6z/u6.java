package com.aspose.slides.internal.l6z;

class u6 extends j3 {
   private long n5;
   private int l6;

   @Override
   public int n5() {
      return 9;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.c4();
      if ((var2 & 4294967295L) != 4L) {
         throw new d1();
      }

      this.n5 = var1.c4();
      this.l6 = var1.r4();
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(4L);
      var1.n5(this.n5 & 4294967295L);
      var1.n5(this.l6 & 65535);
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }
}
