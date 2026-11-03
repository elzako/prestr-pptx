package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class p4p {
   private final n1g n5;

   public p4p(n1g var1) {
      this.n5 = var1;
   }

   public final List<k4l> n5(float var1) {
      int var2 = n1g.u3(this.n5.y4());
      l5 var3 = this.n5.q0();
      l5 var4 = this.n5.m1();
      boolean var5 = var3.a0() || this.n5.n3().hasDataTable();
      int var6 = var2;
      if (!var5) {
         var6 = var2 == 1 ? 1 : var2 - 1;
      }

      IRotation3D var7 = this.n5.n3().getRotation3D();
      float var8 = this.n5.e5().u3() / var6;
      float var9 = this.n5.e5().c8();
      float var10 = (var7.getDepthPercents() & 65535) / 100.0F;
      var9 *= var10;
      float var11 = var9 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      double var12 = var4.e2();
      double var14 = var4.t9();
      double var16 = var4.c8().isLogarithmic() ? var4.n5((double)this.n5.m1().t4()) : this.n5.m1().t4();
      List var18 = this.n5.y4();
      float var19 = (var9 + var11) / (var18.size() - 1);
      List var20 = new List();
      com.aspose.slides.internal.o9b.c8[] var21 = p2y.n5(this.n5.n3());

      for (int var22 = 0; var22 < var18.size() - 1; var22++) {
         int var23 = var18.size() - 1 - var22;
         if (this.n5.m3().c8().isPlotOrderReversed()) {
            var23 = var22;
         }

         for (int var24 = 0; var24 < var2 - 1; var24++) {
            int var25 = var24;
            if (var3.c8().isPlotOrderReversed()) {
               var25 = var2 - 1 - var24;
            }

            float var26;
            float var27;
            if (this.n5.n3().getRotation3D().getRightAngleAxes()) {
               var26 = var19 * var22;
               var27 = var19 * (var22 + 1);
            } else {
               var26 = var19 * var22 - (var9 + var11);
               var27 = var19 * (var22 + 1) - (var9 + var11);
            }

            t6k var28 = this.n5(var16, var5, var1, var8, var23, var25, var26);
            t6k var29 = this.n5(var16, var5, var1, var8, var23, var25 + 1, var26);
            t6k var30 = this.n5(var16, var5, var1, var8, var23 - 1, var25, var27);
            t6k var31 = this.n5(var16, var5, var1, var8, var23 - 1, var25 + 1, var27);
            List var32 = this.n5(var28, var29, var30, var31);
            List$Enumerator var33 = var32.iterator();

            try {
               while (var33.hasNext()) {
                  k8g var34 = (k8g)var33.next();
                  p2y var35 = new p2y((float)var12, (float)var14, var4.h0.size(), var34.t2(), var34.s7(), var21);
                  var20.addItem(new k4l(var34, var35));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
                  var33.dispose();
               }
            }
         }
      }

      return var20;
   }

   private List<k8g> n5(t6k var1, t6k var2, t6k var3, t6k var4) {
      com.aspose.slides.internal.s6.v3 var5 = var1.l6().h0();
      com.aspose.slides.internal.s6.v3 var6 = var2.l6().h0();
      com.aspose.slides.internal.s6.v3 var7 = var3.l6().h0();
      com.aspose.slides.internal.s6.v3 var8 = var4.l6().h0();
      k8g var9;
      k8g var10;
      if (com.aspose.slides.ms.System.q1.l6(var5.l6(), var6.l6()) <= com.aspose.slides.ms.System.q1.l6(var7.l6(), var8.l6())) {
         if (var5.l6() <= var6.l6()) {
            var9 = new k8g(var4, var1, var2);
            var10 = new k8g(var1, var4, var3);
         } else {
            var9 = new k8g(var3, var1, var2);
            var10 = new k8g(var2, var4, var3);
         }
      } else if (var7.l6() >= var8.l6()) {
         var9 = new k8g(var1, var2, var4);
         var10 = new k8g(var1, var4, var3);
      } else {
         var9 = new k8g(var3, var1, var2);
         var10 = new k8g(var2, var4, var3);
      }

      List var11 = new List();
      var11.addItem(var9);
      var11.addItem(var10);
      return var11;
   }

   private t6k n5(double var1, boolean var3, float var4, float var5, int var6, int var7, float var8) {
      List var9 = this.n5.y4();
      if (var6 >= var9.size()) {
         throw new ArgumentOutOfRangeException("seriesIndex");
      }

      g3y var10 = (g3y)var9.get_Item(var6);
      float var11 = 0.0F;
      float var12 = 0.0F;
      if (var7 < var10.c8().size()) {
         t9z var13 = var10.c8().get_Item(var7);
         l5 var14 = this.n5.m1();
         double var15 = var14.e2();
         double var17 = var14.t9();
         float[] var19 = new float[]{0.0F};
         var11 = this.n5(var14, var1, var13, this.n5.e5().a6(), var15, var17, var19);
         var12 = var19[0];
      }

      float var21 = var4 + var11;
      float var22 = this.n5(this.n5, var5, var7, var3);
      com.aspose.slides.internal.s6.v3 var20 = new com.aspose.slides.internal.s6.v3(var22, var21, var8);
      return new t6k(var20.h0(), var12);
   }

   private float n5(l5 var1, double var2, t9z var4, float var5, double var6, double var8, float[] var10) {
      double var11 = var1.k5(var4.n5());
      var10[0] = (float)(var2 - var11) / (float)(var6 - var8);
      float var13 = var10[0] * var5;
      var10[0] = -var10[0];
      if (var1.c8().isPlotOrderReversed()) {
         var13 = -var13;
      }

      return var13;
   }

   private float n5(n1g var1, float var2, int var3, boolean var4) {
      float var5 = var1.e5().l6() + var2 * var3;
      if (var4) {
         var5 += var2 / 2.0F;
      }

      return var5;
   }
}
