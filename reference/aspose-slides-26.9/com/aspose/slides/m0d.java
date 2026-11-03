package com.aspose.slides;

final class m0d extends z3t {
   private final w1g n5 = new w1g();
   private k8l<g6h> n3;
   private d2k y4 = new d2k();

   m0d(MathFraction var1, c0e var2, w1g var3) {
      super(var1, var2, var3.n5());
      var3.n5(this.n5);
   }

   @Override
   protected y1m n5(d2k var1) {
      y1m var2 = this.u3.u9().n5();
      y1m var3 = this.a6.u9().n5();
      n3y var4 = var2.l6.l6();
      n3y var5 = var3.l6.l6();
      l5f var6 = new l5f();
      var6.n5 = this.u9.t2();
      var6.l6 = 0.0F;
      var6.k5 = this.u9.c8();
      var6.u3 = 0.0F;
      var6.a6 = 0.0F;
      float var7 = 0.0F;
      b2v var8 = w4h.n5(var4.l6(), var5.l6(), var7, var6.n5()).n5();
      n3y var9 = w4h.n5(var4.l6(), var5.l6(), var7, var6.n5(), var8.n5()).l6();
      float var10 = var9.n5 - var4.n5 - var8.n5;
      float var11 = (var4.n5 + var5.n5) * 0.7F;
      this.n3 = this.a6().n5().n5('/', this.n5.a6, var11);
      float var12 = this.u9.x8();
      float var13 = this.u9.k5() / 2.0F;
      float var14 = var4.n5() - var13;
      this.y4 = new d2k(var2.n5 + (var12 - this.n3.n5().n5) / 2.0F, var14);
      var13 = var2.n5 + var12;
      var14 = var9.n5 - var5.n5 + var8.l6;
      this.u3.l6(0.0F, var10);
      this.a6.l6(var13, var14);
      y1m var15 = new y1m();
      var15.n5 = com.aspose.slides.ms.System.q1.n5((float)(var2.n5), (float)(var13 + var3.n5));
      var9.n5(var15.l6);
      return var15;
   }

   @Override
   public void n5(v1l var1) {
      c6v var2 = new c6v(var1.n5);

      try {
         var1.n5.n5(this.y4.n5, this.y4.l6);
         com.aspose.slides.internal.o9b.u3 var3 = this.n5(var1.l6);
         this.n3.n5(var1.n5, var3);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      super.n5(var1.n5());
   }
}
