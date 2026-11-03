package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

final class k3i extends z3t {
   public b2v n5 = new b2v();
   private d2k n3 = new d2k();
   private float y4;
   private float e2;

   k3i(MathFraction var1, c0e var2, w1g var3) {
      super(var1, var2, var3.n5());
      if (var1.getFractionType() != 1 && var1.getFractionType() != 4) {
         throw new ArgumentException();
      }
   }

   public final e8s n5() {
      return this.u3;
   }

   public final e8s l6() {
      return this.a6;
   }

   @Override
   protected y1m n5(d2k var1) {
      y1m var2 = this.u3.u9().n5();
      y1m var3 = this.a6.u9().n5();
      l5f var4 = new l5f();
      var4.n5 = this.u9.t2();
      var4.l6 = this.u9.h0();
      var4.k5 = this.u9.c8();
      var4.u3 = this.u9.a6();
      var4.a6 = this.u9.u9();
      float var5 = this.k5 / 96.0F;
      if (this.l6.l6 == 0 && !com.aspose.slides.internal.v6g.k5.l6(this.x8, k3i.class)) {
         var4.l6 += 14.0F * var5;
         var4.a6 += 14.0F * var5;
         var4.u3 = 73.0F * var5;
         if (var3.l6.n5 > this.k5) {
            var4.k5 *= 2.0F;
         }

         if (this.l6.h0) {
            var4.a6 = this.u9.u9() + 17.0F * var5;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, k3i.class)) {
         var4.l6 = 12.0F * var5;
      }

      if (this.l6.l6 > 0 && !com.aspose.slides.internal.v6g.k5.l6(this.x8, k3i.class)) {
         var4.l6 *= 0.5F;
         var4.k5 *= 0.8F;
         var4.a6 += 5.0F * var5;
         var4.u3 += 2.0F * var5;
      }

      float var6 = this.u9.s7();
      float var7 = var6 / 2.0F;
      w4h.n5(var2.l6.l6(), var3.l6.l6(), var7, var4.n5()).n5(this.n5);
      this.e2 = var4.n5;
      y1m var8 = new y1m();
      var8.n5 = com.aspose.slides.ms.System.q1.n5((float)(var2.n5), (float)(var3.n5));
      w4h.n5(var2.l6.l6(), var3.l6.l6(), var7, var4.n5(), this.n5.n5()).n5(var8.l6);
      this.n3.l6 = var6;
      this.n3.n5 = var8.n5;
      this.y4 = var8.l6.n5 - var4.n5;
      if (!this.a6().h0.n5()) {
         this.y4 -= var6;
      }

      d2k var9 = new d2k();
      var9.n5 = (var8.n5 - var2.n5) / 2.0F;
      var9.l6 = var8.l6.n5 - var2.l6.n5 - this.n5.n5;
      d2k var10 = new d2k();
      var10.n5 = (var8.n5 - var3.n5) / 2.0F;
      var10.l6 = var8.l6.n5 - var3.l6.n5 + this.n5.l6;
      if (!this.a6().h0.n5()) {
         var10 = new d2k();
         var10.n5 = (var8.n5 - var3.n5) / 2.0F;
         var10.l6 = var8.l6.n5 - var3.l6.n5 + this.n5.l6 - var7 * 2.0F;
      }

      this.a6.l6(var10.u3());
      this.u3.l6(var9.u3());
      return var8;
   }

   @Override
   public void n5(v1l var1) {
      if (this.u3().getFractionType() == 1) {
         float var2 = this.y4;
         float var3 = this.u9.s7();
         com.aspose.slides.internal.o9b.u3 var4 = this.n5(var1.l6);
         var1.n5
            .n5(
               new com.aspose.slides.internal.o9b.y1(0.0F, var2 - var3 / 2.0F, this.n3.n5, var3),
               null,
               new a1v(((com.aspose.slides.internal.o9b.i1)var4).h0().o8())
            );
      }

      super.n5(var1.n5());
   }

   public final float k5() {
      return this.y4;
   }
}
