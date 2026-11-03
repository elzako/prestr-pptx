package com.aspose.slides.internal.k0r;

public class a1k extends e6r {
   private int n5;
   private long l6;

   public a1k() {
      this.w1().n5(61754);
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

   public final void n5(boolean var1) {
      if (var1) {
         this.n5 |= 1;
      } else {
         this.n5 &= -2;
      }
   }

   public final void n5(int var1) {
      this.l6 = var1 & 4294967295L;
   }
}
