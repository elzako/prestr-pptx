package com.aspose.slides.internal.k0r;

public class m8 extends e6r {
   private long n5;
   private int l6;

   public m8() {
      this.w1().n5(4049);
      this.n5 = 0L;
      this.l6 = 1;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.m3();
      var1.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      var1.l6(this.l6);
      var1.l6(0);
   }

   @Override
   public int n5() {
      return 12;
   }
}
