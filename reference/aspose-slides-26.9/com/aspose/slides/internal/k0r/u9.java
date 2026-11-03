package com.aspose.slides.internal.k0r;

public class u9 extends e6r {
   private byte[] n5;

   public u9() {
      this.w1().n5(5003);
      this.w1().n5((short)3);
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
