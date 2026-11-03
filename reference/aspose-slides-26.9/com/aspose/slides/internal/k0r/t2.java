package com.aspose.slides.internal.k0r;

public class t2 extends e6r {
   private byte n5;
   private g2 l6;

   public t2() {
      this.w1().n5(2041);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.z1();
      var1.z1();
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1.c8(this.w1().a6() - 2), false);
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      this.l6 = (l8)p5k.n5(var3, null);
      var3.n3();
   }

   @Override
   public int n5() {
      return 2 + this.l6.n5() + 8;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = 0;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, l8.class)) {
         var2 = com.aspose.slides.internal.n8e.v4.n5(((l8)this.l6).t2() * 257);
      }

      var1.n5(com.aspose.slides.internal.n8e.v4.n5(var2));
      this.l6.l6(var1);
   }

   public final void n5(int var1) {
      this.n5 = (byte)var1;
   }

   public final g2 l6() {
      return this.l6;
   }

   public final void n5(g2 var1) {
      this.l6 = var1;
   }
}
