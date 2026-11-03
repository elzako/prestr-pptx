package com.aspose.slides.internal.l6z;

class c4 extends j3 {
   private long n5;
   private int l6;

   @Override
   public int n5() {
      return 3;
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.r4();
   }

   @Override
   protected void l6(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(2L);
      var1.n5(this.l6 & 65535);
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }
}
