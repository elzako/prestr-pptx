package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class p4j {
   private n1g n5;

   public p4j(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      int var2 = n1g.u3(this.n5.y4());
      double var3 = this.n5.m1().t4();
      float var5 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().k5() - this.n5.e5().a6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().a6(), 13),
         var1,
         this.n5.m1()
      );
      l5 var6 = this.n5.q0();
      l5 var7 = this.n5.m1();
      boolean var8 = var6.a0() || this.n5.n3().hasDataTable();
      int var9;
      if (var8) {
         var9 = var2;
      } else {
         var9 = var2 - 1;
         if (var9 == 0) {
            var9 = 1;
         }
      }

      IRotation3D var10 = this.n5.n3().getRotation3D();
      float var11 = this.n5.e5().u3() / var9;
      float var12 = this.n5.e5().c8();
      float var13 = (var10.getDepthPercents() & 65535) / 100.0F;
      var12 *= var13;
      float var14 = var12 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      double var15 = var7.e2();
      double var17 = var7.t9();
      var3 = var7.c8().isLogarithmic() ? var7.n5(var3) : var3;
      List var19 = this.n5.y4();
      float var20 = var12 / var19.size();
      float var21 = var14 / var19.size();
      List var22 = new List();

      for (int var23 = 0; var23 < var19.size(); var23++) {
         int var24 = var19.size() - 1 - var23;
         if (this.n5.m3().c8().isPlotOrderReversed()) {
            var24 = var23;
         }

         g3y var25 = (g3y)var19.get_Item(var24);

         for (int var26 = 0; var26 < var2 - 1; var26++) {
            int var27 = var26;
            if (var6.c8().isPlotOrderReversed()) {
               var27 = var2 - 1 - var26;
            }

            t9z var28 = var25.c8().get_Item(var27);
            t9z var29 = var25.c8().get_Item(var27 + 1);
            if (var28 != null && !var28.c8() && var29 != null) {
               float var30 = n5(var7, var3, var28, this.n5.e5().a6(), var15, var17);
               float var31 = var5 + var30;
               float var32 = n5(this.n5, var11, var26, var8);
               float var33 = n5(var7, var3, var29, this.n5.e5().a6(), var15, var17);
               float var34 = var5 + var33;
               float var35 = n5(this.n5, var11, var26 + 1, var8);
               float var36 = 1.0F;
               com.aspose.slides.internal.x4g.s7 var37 = new com.aspose.slides.internal.x4g.s7();
               var37.l6(var32, var31 + 2.0F * var36, var35, var34 + 2.0F * var36);
               com.aspose.slides.internal.o9b.m3 var38 = new com.aspose.slides.internal.o9b.m3(com.aspose.slides.internal.o9b.c8.u3.o8(), var36);

               try {
                  com.aspose.slides.internal.n2d.y4.n5(var37, var38);
               } finally {
                  if (var38 != null) {
                     var38.dispose();
                  }
               }

               float var39;
               if (var10.getRightAngleAxes()) {
                  var39 = (var20 + var21) * (var23 + 1) - var21 / 2.0F;
               } else {
                  var39 = (var20 + var21) * (var23 + 1) - (var12 + var14) - var21 / 2.0F;
               }

               var28.n5(var37, var20, var39, null);
               float var40 = var39 - var20 / 2.0F;
               v2o var41 = n5(var32, var5, var30, var27, var25.l6(), var40);
               var22.addItem(var41);
               if (var2 - 2 == var27) {
                  var41 = n5(var35, var5, var33, var27 + 1, var25.l6(), var40);
                  var22.addItem(var41);
               }
            }
         }

         v2s.n5(var22, this.n5);
      }
   }

   private static float n5(l5 var0, double var1, t9z var3, float var4, double var5, double var7) {
      double var9 = var0.k5(var3.n5());
      float var11 = (float)(var1 - var9) / (float)(var5 - var7) * var4;
      if (var0.c8().isPlotOrderReversed()) {
         var11 = -var11;
      }

      return var11;
   }

   private static float n5(n1g var0, float var1, int var2, boolean var3) {
      float var4 = var0.e5().l6() + var1 * var2;
      if (var3) {
         var4 += var1 / 2.0F;
      }

      return var4;
   }

   private static v2o n5(float var0, float var1, float var2, int var3, int var4, float var5) {
      boolean var6 = g6z.n5(var2, 0.0) <= 0.0;
      com.aspose.slides.internal.o9b.w1 var7 = n5(var0, var1, var2, var6).u3();
      return new v2o(var4, var3, var7.u3(), var6, var5);
   }

   private static com.aspose.slides.internal.o9b.w1 n5(float var0, float var1, float var2, boolean var3) {
      float var4 = 8.0F;
      float var5 = -8.0F;
      if (var3) {
         var2 -= var5;
      } else {
         var2 += var5;
      }

      var0 += var4;
      float var6 = var1 + var2;
      return new com.aspose.slides.internal.o9b.w1(var0, var6);
   }
}
