package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

final class l1q extends z3t {
   private final w1g n5 = new w1g();
   private k8l<g6h> n3;
   private d2k y4 = new d2k();

   l1q(MathFraction var1, c0e var2, w1g var3) {
      super(var1, var2, var3.n5());
      if (var1.getFractionType() != 3) {
         throw new ArgumentException();
      }

      var3.n5(this.n5);
   }

   @Override
   protected y1m n5(d2k var1) {
      y1m var2 = this.u3.u9().n5();
      y1m var3 = this.a6.u9().n5();
      n3y var4 = var2.l6.l6();
      n3y var5 = var3.l6.l6();
      float var6 = (var4.n5 + var5.n5) / 2.0F;
      this.n3 = this.a6().n5().n5('/', this.n5.a6, var6);
      float var7 = this.n3.n5().k5 / 2.0F + this.u9.t2();
      n3y var8 = new n3y(var7, this.n3.n5().k5 - var7);
      n3y var9 = n3y.n5(var4.l6(), var5.l6()).l6();
      n3y.n5(var9.l6(), var8.l6()).n5(var9);
      d2k var10 = new d2k(var2.n5 + this.n3.n5().n5, var9.n5 - var5.n5);
      float var11 = var9.n5 - var4.n5;
      this.y4 = new d2k(var2.n5, var9.n5 - var8.n5);
      this.u3.l6(0.0F, var11);
      this.a6.l6(var10.u3());
      y1m var12 = new y1m();
      var12.n5 = var10.n5 + var3.n5;
      var9.n5(var12.l6);
      return var12;
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
