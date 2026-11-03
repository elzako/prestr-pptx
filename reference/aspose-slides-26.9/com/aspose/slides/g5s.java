package com.aspose.slides;

final class g5s extends e8s {
   private w1g n5 = new w1g();
   private final e8s l6;
   private final e8s k5;
   private final p1e u3;

   g5s(MathSuperscriptElement var1, c0e var2, w1g var3) {
      this(var1, var1.getSuperscript(), var2, var3.n5());
   }

   g5s(MathSubscriptElement var1, c0e var2, w1g var3) {
      this(var1, var1.getSubscript(), var2, var3.n5());
   }

   private g5s(BaseScript var1, IMathElement var2, c0e var3, w1g var4) {
      super(var1, var3);
      this.l6 = this.n5(var1.getBase(), var4.n5());
      var4.n5(this.n5);
      this.n5.l6++;
      this.u3 = this.a6().n5(var4.a6);
      float var5 = n5(var4.l6, this.n5.l6, this.u3);
      if (com.aspose.slides.internal.v6g.k5.l6(this.x8, s7b.class)) {
         var5 = 0.76F;
      }

      this.n5.a6 = var5 * var4.a6;
      if (var4.h0) {
         this.n5.a6 = var4.a6 * 3.0F / 4.0F;
      }

      this.n5.y4 = 1.1F;
      this.k5 = this.n5(var2, this.n5.n5());
   }

   public static float n5(int var0, int var1, p1e var2) {
      float var3 = 0.01F * var2.t4();
      float var4 = 0.01F * var2.z1();
      if (var1 == var0 + 1) {
         if (var1 == 1) {
            return var4;
         }

         if (var1 == 2) {
            return var3;
         }
      }

      return 1.0F;
   }

   @Override
   protected y1m n5(d2k var1) {
      y1m var2 = this.l6.u9().n5();
      y1m var3 = this.k5.u9().n5();
      float var4 = var2.n5 + this.u3.t9() * 1.3F;
      if ((!com.aspose.slides.internal.v6g.k5.l6(this.l6, w2k.class) || !(this.l6.h0.get_Item(0).u9().l6.n5() > this.a6().n5))
         && (!(var2.l6.n5() > this.a6().n5 + 0.1F) || !(var2.l6.n5() > var3.l6.n5()))) {
         y1m var5 = new y1m();
         n3y var6 = new n3y();
         if (!com.aspose.slides.internal.v6g.k5.l6(this.t2, MathSuperscriptElement.class)) {
            k6n var11 = new k6n();
            var11.k5 = this.u3.m1();
            var11.n5 = this.u3.q0();
            var11.l6 = this.u3.z3();
            n3y var12 = var2.l6.l6();
            float var14 = var11.n5;
            d5w.l6(var12.l6(), var3.l6.l6(), var14).n5(var6);
            float var13 = var2.l6.n5 - var3.l6.n5 + var14;
            this.k5.l6(var4, var13);
            var5.n5 = com.aspose.slides.ms.System.q1.n5((float)(var2.n5), (float)(var3.n5 + var4));
            var6.n5(var5.l6);
            return var5;
         }

         j6m var7 = new j6m();
         var7.n5 = this.u3.n3();
         var7.l6 = this.u3.e2();
         var7.k5 = this.u3.y4();
         if ((this.n5.k5 > 0 || this.n5.t2) && !this.n5.u9 && this.n5.l6 > 0) {
            var7.n5 *= 0.8F;
            var7.l6 *= 0.8F;
            var7.k5 *= 0.8F;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.l6, w2k.class) && var2.l6.n5() > this.a6().n5) {
            var7.n5 = ((w2k)this.l6).l6() / 96.0F * 55.0F;
         }

         float var8 = com.aspose.slides.ms.System.q1.n5((float)(var7.n5), (float)(var3.l6.l6 + var7.k5));
         float var9 = var2.l6.n5 - var3.l6.n5 - var8;
         d5w.n5(var2.l6.l6(), var3.l6.l6(), var8).n5(var6);
         float var10 = 0.0F;
         if (com.aspose.slides.internal.v6g.k5.l6(this.k5, k3i.class)
            && this.n5.u3 == 0
            && this.n5.a6 - ((k3i)this.k5).k5() - this.u3.s7() < 0.0F
            && this.k5.u9().l6.n5 / this.n5.a6 < 2.0F
            && -var9 > var2.l6.n5() / 2.0F + this.u3.s7()) {
            var10 = -this.u3.s7() / 2.0F;
            var6.n5 += var10;
         }

         this.l6.l6(0.0F, -var9 + var10);
         this.k5.l6(var4, var10);
         var5.n5 = com.aspose.slides.ms.System.q1.n5((float)(var2.n5), (float)(var3.n5 + var4));
         var6.n5(var5.l6);
         return var5;
      } else {
         return this.n5(var2.n5(), var3.n5(), var4);
      }
   }

   final y1m n5(y1m var1, y1m var2, float var3) {
      y1m var4 = new y1m();
      new n3y();
      float var6 = var2.l6.n5 / 2.0F;
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, b4i.class) && var2.l6.n5 < ((b4i)this.k5).l6 * 0.6F) {
         var6 *= 0.8F;
      }

      n3y var5 = new n3y();
      var5.n5 = var1.l6.n5 + var6;
      var5.l6 = var1.l6.l6;
      this.l6.l6(0.0F, var6);
      this.k5.l6(var3, 0.0F);
      var4.n5 = com.aspose.slides.ms.System.q1.n5((float)(var1.n5), (float)(var2.n5 + var3));
      var5.n5(var4.l6);
      return var4;
   }
}
