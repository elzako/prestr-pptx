package com.aspose.slides;

final class q3m extends e8s {
   private final w1g n5 = new w1g();
   private e8s l6;
   private k8l<g6h> k5;
   private d2k u3 = new d2k();

   public q3m(MathNaryOperator var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      this.n5.c8++;
      this.n5(var1.getBase(), this.n5.n5());
      w1g var4 = this.n5.n5();
      var4.n5++;
      float var5 = 0.73F;
      var4.a6 = var5 * var3.a6;
      var4.x8 = 2;
      if (!var1.getHideSuperscript()) {
         this.n5(var1.getSuperscript(), var4.n5());
      }

      if (!var1.getHideSubscript()) {
         this.l6 = this.n5(var1.getSubscript(), var4.n5());
      }
   }

   public final MathNaryOperator n5() {
      return (MathNaryOperator)super.t2;
   }

   @Override
   public void n5(v1l var1) {
      com.aspose.slides.internal.o9b.u3 var2 = null;
      com.aspose.slides.internal.o9b.u3[] var3 = new com.aspose.slides.internal.o9b.u3[]{var2};
      boolean var4 = !this.a6().n5(this.n5(), this.h0.get_Item(0), var3);
      var2 = var3[0];
      if (var4) {
         var2 = var1.l6;
      }

      if (this.k5 != null) {
         c6v var5 = new c6v(var1.n5);

         try {
            var1.n5.n5(this.u3.n5, this.u3.l6);
            this.k5.n5(var1.n5, var2);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }

      super.n5(var1.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      e8s var2 = this.h0.get_Item(0);
      y1m var3 = var2.u9().n5();
      float var4 = this.n5.a6 / 96.0F;
      float var5 = 16.0F * var4;
      float var6 = 26.0F * var4;
      if ((this.n5.t2 || this.n5.s7) && this.h0.size() > 1) {
         this.n5().setLimitLocation(2);
      }

      float var7;
      if (this.l6()) {
         var7 = 130.0F * var4;
         if (this.n5().getLimitLocation() != 1 && com.aspose.slides.internal.v6g.k5.l6(this.n5().getBase(), MathematicalText.class)) {
            var5 = 0.0F;
         }
      } else {
         var7 = var4 * (this.n5.u3 == 0 ? 142.0F : 14.2F);
      }

      if (this.n5.k5 > 0) {
         var7 /= 2.0F;
      }

      float var8 = var7;
      if (this.a6().a6) {
         this.n5().setLimitLocation(2);
         var8 = this.n5.a6;
      }

      if (this.n5().getOperator() == 0) {
         this.k5 = this.a6().n5().n5('∫', this.n5.a6, var8);
      } else {
         this.k5 = this.a6().n5().n5(this.n5().getOperator(), this.n5.a6, var8);
      }

      g6h var9 = this.k5.n5().n5();
      float var10 = 0.0F;
      if (!this.n5().getHideSuperscript()) {
         y1m var11 = this.h0.get_Item(1).u9().n5();
         var10 = var6 + var11.l6.n5();
      }

      this.u3.n5 = 0.0F;
      n3y var20 = new n3y();
      n3y var12 = new n3y(var9.l6 + var10, var9.k5 - var9.l6);
      n3y.n5(var12.l6(), var3.l6.l6()).n5(var20);
      n3y.n5(var20.l6(), new n3y(var7, 0.0F)).n5(var20);
      this.u3.l6 = var20.n5 - var9.l6;
      d2k var21 = new d2k(var9.n5 + var5, var20.n5 - var3.l6.n5);
      float var13 = 0.0F;
      if (!this.n5().getHideSuperscript()) {
         e8s var14 = this.h0.get_Item(1);
         if (this.l6() && this.n5().getLimitLocation() == 1) {
            var13 = 3.0F * var9.n5 / 4.0F;
         } else {
            var13 = var9.n5 / 2.0F;
         }

         var13 -= var14.u9().n5 / 2.0F;
      }

      d2k var24 = d2k.k5.u3();
      if (this.l6 != null) {
         if (this.l6() && this.n5().getLimitLocation() == 1) {
            var24.n5 = var9.n5 / 4.0F;
         } else {
            var24.n5 = var9.n5 / 2.0F;
         }

         y1m var15 = this.l6.u9().n5();
         float var16 = 58.0F * var4;
         float var17 = 12.0F * var4;
         float var18 = com.aspose.slides.ms.System.q1.n5((float)(var17), (float)(var16 - var15.l6.n5));
         var24.n5 = var24.n5 - var15.n5 / 2.0F;
         var24.l6 = this.u3.l6 + var9.k5 + var18;
         float var19 = var24.l6 + var15.l6.n5() - var20.n5;
         var20.l6 = com.aspose.slides.ms.System.q1.n5((float)(var20.l6), (float)(var19));
      }

      float var25 = com.aspose.slides.ms.System.q1.l6(0.0F, var13);
      var25 = com.aspose.slides.ms.System.q1.l6(var25, var24.n5);
      var13 -= var25;
      var24.n5 -= var25;
      var21.n5 -= var25;
      this.u3.n5 -= var25;
      var25 = 0.0F;
      if (this.n5().getOperator() == 8721 && this.n5().getLimitLocation() == 2 && this.l6 != null) {
         var25 = var10;
         var13 = var9.n5 + this.u3.n5;
         var24 = new d2k(var13, var24.l6 - this.l6.u9().l6.n5());
         var21 = new d2k(var21.n5 + com.aspose.slides.ms.System.q1.n5((float)(this.l6.u9().n5), (float)(this.h0.get_Item(1).u9().n5)), var21.l6);
      }

      if (!this.n5().getHideSuperscript()) {
         this.h0.get_Item(1).l6(new d2k(var13, var25));
      }

      if (this.l6 != null) {
         this.l6.l6(var24.u3());
      }

      var2.l6(var21.u3());
      y1m var28 = new y1m();
      var20.n5(var28.l6);
      var28.n5 = var21.n5 + var3.n5;
      return var28;
   }

   private boolean l6() {
      return this.n5().getOperator() == 8747;
   }
}
