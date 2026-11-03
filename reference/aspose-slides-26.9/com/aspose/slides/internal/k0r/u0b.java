package com.aspose.slides.internal.k0r;

public class u0b extends e6r {
   protected byte[] n5;

   u0b() {
   }

   u0b(int var1) {
      this.w1().n5(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c8(this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5 != null) {
         var1.n5(this.n5);
      }
   }

   @Override
   public int n5() {
      return this.n5 == null ? 0 : this.n5.length;
   }
}
