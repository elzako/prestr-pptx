package com.aspose.slides;

final class i4f extends e8s {
   public final w1g n5 = new w1g();

   public i4f(MathLimit var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      float var4 = g5s.n5(var3.n5, var3.n5 + 1, this.a6().n5(var3.a6));
      w1g var5 = var3.n5();
      var5.n5++;
      var5.a6 = var4 * var3.a6;
      this.n5(var1.getBase(), var3.n5());
      this.n5(var1.getLimit(), var5.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      e8s var2 = this.h0.get_Item(0);
      e8s var3 = this.h0.get_Item(1);
      y1m var4 = var2.u9().n5();
      n3y var5 = var4.l6.l6();
      y1m var6 = var3.u9().n5();
      float var7 = 9.0F * this.n5.a6 / 96.0F;
      float var8 = com.aspose.slides.ms.System.q1.n5((float)(var4.n5), (float)(var3.u9().n5));
      var2.l6((var8 - var4.n5) / 2.0F, 0.0F);
      float var9 = var5.n5() + var7;
      var3.l6((var8 - var6.n5) / 2.0F, var9);
      y1m var10 = new y1m();
      var10.l6 = new n3y(var5.n5, com.aspose.slides.ms.System.q1.n5((float)(var9 + var6.l6.n5()), (float)(var5.n5())) - var5.n5);
      var10.n5 = var8;
      return var10;
   }
}
