package com.aspose.slides;

final class l4i extends e8s {
   private final w1g n5 = new w1g();
   private final d2k l6 = new d2k();
   private final float k5;

   public l4i(MathMatrix var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);

      for (int var4 = 0; var4 < var1.getRowCount(); var4++) {
         for (int var5 = 0; var5 < var1.getColumnCount(); var5++) {
            IMathElement var6 = var1.get_Item(var4, var5);
            this.n5(var6, var3.n5());
         }
      }

      float var7 = var3.a6 / 96.0F;
      new d2k(97.0F * var7, 68.0F * var7).n5(this.l6);
      if (this.a6().l6()) {
         new d2k(97.0F * var7, 112.0F * var7).n5(this.l6);
      }

      this.k5 = 23.0F * var3.a6 / 72.0F;
   }

   public final MathMatrix n5() {
      return (MathMatrix)super.t2;
   }

   @Override
   protected y1m n5(d2k var1) {
      MathMatrix var2 = this.n5();
      n3y[] var3 = (n3y[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(n3y.class), var2.getRowCount())
      );

      for (int var4 = 0; var4 < var2.getRowCount(); var4++) {
         n3y var5 = new n3y(0.0F, 0.0F);

         for (int var6 = 0; var6 < var2.getColumnCount(); var6++) {
            e8s var7 = this.n5(var4, var6);
            n3y.n5(var5.l6(), var7.u9().l6.l6()).n5(var5);
         }

         var5.n5(var3[var4]);
      }

      float[] var14 = new float[var2.getColumnCount()];
      float var15 = 0.0F;

      for (int var16 = 0; var16 < var2.getColumnCount(); var16++) {
         float var18 = 0.0F;

         for (int var8 = 0; var8 < var2.getRowCount(); var8++) {
            e8s var9 = this.n5(var8, var16);
            var18 = com.aspose.slides.ms.System.q1.n5((float)(var18), (float)(var9.u9().n5));
         }

         var15 += var18;
         if (var16 + 1 < var2.getColumnCount()) {
            var15 += this.l6.n5;
         }

         var14[var16] = var18;
      }

      float var17 = 0.0F;

      for (int var19 = 0; var19 < var2.getRowCount(); var19++) {
         n3y var21 = var3[var19].l6();
         float var23 = 0.0F;

         for (int var10 = 0; var10 < var2.getColumnCount(); var10++) {
            float var11 = var14[var10];
            e8s var12 = this.n5(var19, var10);
            y1m var13 = var12.u9().n5();
            var12.l6(var23 + (var11 - var13.n5) / 2.0F, var17 + var21.n5 - var13.l6.n5);
            var23 += var11;
            if (var10 + 1 < var2.getColumnCount()) {
               var23 += this.l6.n5;
            }
         }

         var17 += var21.n5();
         if (var19 + 1 < var2.getRowCount()) {
            if (this.a6().l6()) {
               var17 += com.aspose.slides.ms.System.q1.n5((float)(this.k5), (float)(this.l6.l6 - var21.n5()));
            } else {
               var17 += com.aspose.slides.ms.System.q1.n5((float)(this.k5), (float)(this.l6.l6 - var21.l6));
            }
         }
      }

      p1e var20 = this.a6().n5(this.n5.a6);
      y1m var22 = new y1m();
      d1.n5(var17, var20.t2()).n5(var22.l6);
      var22.n5 = var15;
      return var22;
   }

   private e8s n5(int var1, int var2) {
      return this.h0.get_Item(var1 * this.n5().getColumnCount() + var2);
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(n3y.class, new l4i$1());
   }
}
