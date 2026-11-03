package com.aspose.slides;

class a9k extends com.aspose.slides.internal.v6g.h0<a9k> {
   public a9k() {
   }

   static void n5(com.aspose.slides.internal.o9b.y2 var0, boolean var1, n1g var2) {
      if (!u3(var2.n3().getType())) {
         double var3 = var2.j5() / 100.0;
         double var5 = (var2.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         double var7 = (var2.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0;
         int var9 = 0;
         int var10 = n1g.u3(var2.y4());
         int var11 = var2.y4().size();
         boolean var12 = l6(var2.n3().getType());
         if (var12) {
            var11 = 1;
         }

         if (var2.q0().c8().getCategoryAxisType() == 1) {
            if (k5(var2.n3().getType())) {
               var9 = var2.q0().d5();
            } else {
               var9 = p4.n5(
                     var2.q0().c8().getBaseUnitScale(),
                     com.aspose.slides.internal.v6g.k5.u3(var2.q0().z3(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var2.q0().q0(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var2.q0().z3(), 14),
                     false
                  )
                  + 1;
            }
         } else if (k5(var2.n3().getType())) {
            var9 = l5.n5(var2.q0(), var10);
         } else {
            var9 = var10;
         }

         double var13 = 0.0;
         if (!n5(var2.n3().getType())) {
            var13 = var9 * (var11 + var7) / (var3 + var5 * var3);
         } else {
            var13 = var9 / (var11 * var3);
         }

         double var15 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.h0(var2.s3() * Math.PI / 180.0));
         int var17 = var2.p8() % 90;
         if (var17 >= 45) {
            var17 = 90 - var17;
         }

         double var18 = com.aspose.slides.ms.System.q1.h0(var17 * Math.PI / 180.0);
         int var20 = var2.p8() / 45;
         float var21 = 1.0F;
         if (var2.y4().size() == 1 && (var2.n3().getType() == 6 || var2.n3().getType() == 14 || var2.n3().getType() == 10 || var2.n3().getType() == 18)) {
            var21 = 0.67F;
         }

         double var22 = 0.0;
         double var24 = 0.0;
         double var26 = 0.0;
         double var28 = 0.0;
         switch (var20) {
            case 0:
            case 3:
            case 4:
            case 7:
            case 8:
               if (!var1) {
                  var22 = var0.t2() / (1.0 + var18 / var13);
                  var26 = var0.l6() * var0.t2() / (var0.t2() * var15 / var13 + var0.l6());
               } else {
                  var22 = var0.t2() * var0.t2() / (var0.l6() * var18 / var13 + var0.t2());
                  var26 = var0.t2() / (1.0 + var15 / var13);
               }
               break;
            case 1:
            case 2:
            case 5:
            case 6:
               var22 = var0.t2() / (1.0 / var13 + var18);
               var26 = var0.l6() * var0.t2() / (var0.t2() * var15 + var0.l6());
         }

         var24 = var22 * var0.l6() / var0.t2();
         var28 = var26 * var0.l6() / var0.t2();
         if (var24 < var28) {
            var2.e5().k5((float)var22);
            var2.e5().u3((float)var24);
         } else {
            var2.e5().k5((float)var26);
            var2.e5().u3((float)var28);
         }

         var2.e5().u3(var2.e5().a6() * var21);
         var2.e5().a6(!var1 ? (float)(var2.e5().u3() / var13) : (float)(var2.e5().a6() / var13));
         var2.e5().n5(var0.s7() + (var0.t2() - var2.e5().u3()) / 2.0F);
         var2.e5().l6(var0.x8() + var0.l6() - (var0.l6() - var2.e5().a6()) / 2.0F);
      }
   }

   private static boolean l6(int var0) {
      switch (var0) {
         case 4:
         case 5:
         case 8:
         case 9:
         case 12:
         case 13:
         case 16:
         case 17:
         case 36:
         case 37:
         case 39:
         case 40:
         case 42:
         case 43:
         case 45:
         case 46:
            return true;
         case 6:
         case 7:
         case 10:
         case 11:
         case 14:
         case 15:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 38:
         case 41:
         case 44:
         default:
            return false;
      }
   }

   private static boolean k5(int var0) {
      switch (var0) {
         case 25:
         case 50:
         case 51:
         case 52:
            return true;
         default:
            return false;
      }
   }

   static void n5(boolean var0, n1g var1) {
      if (!u3(var1.n3().getType())) {
         float var2 = var1.e5().u9();
         float var3 = var1.e5().k5();
         com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(var2, var3);
         int var5 = var1.p8() % 90;
         if (var5 >= 45) {
            var5 = 90 - var5;
         }

         int var6 = var1.p8() / 45;
         float var7;
         float var8;
         switch (var6) {
            case 0:
            case 3:
            case 4:
            case 7:
            case 8:
               var7 = var1.e5().u3();
               var8 = var1.e5().h0();
               break;
            case 1:
            case 2:
            case 5:
            case 6:
            default:
               var7 = var1.e5().h0();
               var8 = var1.e5().u3();
         }

         float var9 = var8 * (float)com.aspose.slides.ms.System.q1.h0(var5 * Math.PI / 180.0);
         float var10 = var8 * (float)com.aspose.slides.ms.System.q1.h0(var1.s3() * Math.PI / 180.0);
         com.aspose.slides.internal.o9b.w1[] var11 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 8)
         );
         switch (var6) {
            case 0:
            case 8:
               var11[0].n5(var4.l6() - (var7 + var9) / 2.0F);
               var11[1].n5(var11[0].l6() + var7);
               var11[2].n5(var11[1].l6() + var9);
               var11[3].n5(var11[0].l6() + var9);
               var11[0].l6(var4.k5() + var10 / 2.0F);
               var11[1].l6(var11[0].k5());
               var11[2].l6(var11[1].k5() - var10);
               var11[3].l6(var11[2].k5());
               break;
            case 1:
               var11[0].n5(var4.l6() - (var7 + var9) / 2.0F);
               var11[1].n5(var11[0].l6() + var9);
               var11[2].n5(var11[1].l6() + var7);
               var11[3].n5(var11[0].l6() + var7);
               var11[0].l6(var4.k5() - var10 / 2.0F);
               var11[1].l6(var11[0].k5() + var10);
               var11[2].l6(var11[1].k5());
               var11[3].l6(var11[0].k5());
               break;
            case 2:
               var11[1].n5(var4.l6() - (var7 + var9) / 2.0F);
               var11[0].n5(var11[1].l6() + var9);
               var11[2].n5(var11[1].l6() + var7);
               var11[3].n5(var11[0].l6() + var7);
               var11[0].l6(var4.k5() - var10 / 2.0F);
               var11[1].l6(var11[0].k5() + var10);
               var11[2].l6(var11[1].k5());
               var11[3].l6(var11[0].k5());
               break;
            case 3:
               var11[1].n5(var4.l6() - (var7 + var9) / 2.0F);
               var11[0].n5(var11[1].l6() + var7);
               var11[2].n5(var11[1].l6() + var9);
               var11[3].n5(var11[2].l6() + var7);
               var11[0].l6(var4.k5() - var10 / 2.0F);
               var11[1].l6(var11[0].k5());
               var11[2].l6(var11[1].k5() + var10);
               var11[3].l6(var11[2].k5());
               break;
            case 4:
               var11[0].n5(var4.l6() + (var7 + var9) / 2.0F);
               var11[1].n5(var11[0].l6() - var7);
               var11[2].n5(var11[1].l6() - var9);
               var11[3].n5(var11[2].l6() + var7);
               var11[0].l6(var4.k5() - var10 / 2.0F);
               var11[1].l6(var11[0].k5());
               var11[2].l6(var11[1].k5() + var10);
               var11[3].l6(var11[2].k5());
               break;
            case 5:
               var11[0].n5(var4.l6() + (var7 + var9) / 2.0F);
               var11[1].n5(var11[0].l6() - var9);
               var11[2].n5(var11[1].l6() - var7);
               var11[3].n5(var11[0].l6() - var7);
               var11[0].l6(var4.k5() + var10 / 2.0F);
               var11[1].l6(var11[0].k5() - var10);
               var11[2].l6(var11[1].k5());
               var11[3].l6(var11[0].k5());
               break;
            case 6:
               var11[1].n5(var4.l6() + (var7 + var9) / 2.0F);
               var11[0].n5(var11[1].l6() - var9);
               var11[2].n5(var11[1].l6() - var7);
               var11[3].n5(var11[0].l6() - var7);
               var11[0].l6(var4.k5() + var10 / 2.0F);
               var11[1].l6(var11[0].k5() - var10);
               var11[2].l6(var11[1].k5());
               var11[3].l6(var11[0].k5());
               break;
            case 7:
               var11[1].n5(var4.l6() + (var7 + var9) / 2.0F);
               var11[0].n5(var11[1].l6() - var7);
               var11[2].n5(var11[1].l6() - var9);
               var11[3].n5(var11[2].l6() - var7);
               var11[0].l6(var4.k5() + var10 / 2.0F);
               var11[1].l6(var11[0].k5());
               var11[2].l6(var11[1].k5() - var10);
               var11[3].l6(var11[2].k5());
         }

         var11[4].n5(var11[0].l6());
         var11[5].n5(var11[1].l6());
         var11[6].n5(var11[2].l6());
         var11[7].n5(var11[3].l6());
         var11[4].l6(var11[0].k5() - var1.e5().a6());
         var11[5].l6(var11[1].k5() - var1.e5().a6());
         var11[6].l6(var11[2].k5() - var1.e5().a6());
         var11[7].l6(var11[3].k5() - var1.e5().a6());
         com.aspose.slides.internal.o9b.w1[] var12 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 6)
         );
         float var13 = 0.7F;
         if (var0) {
            if (var1.s3() >= 0) {
               com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
               var14.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[3], var11[7], var11[4]});
               var1.b3().n5(var14, var13);
            }

            com.aspose.slides.internal.x4g.s7 var17 = new com.aspose.slides.internal.x4g.s7();
            var17.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[1], var11[2], var11[3]});
            var1.f2().n5(var17, var13);
            com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
            var15.k5(new com.aspose.slides.internal.o9b.w1[]{var11[2], var11[3], var11[7], var11[6]});
            var1.i1().n5(var15, 1.0F);
            if (var1.m1().c8() != null) {
               if (!var1.m1().c8().isPlotOrderReversed()) {
                  var11[0].n5(var12[0]);
                  var11[1].n5(var12[1]);
                  var11[3].n5(var12[2]);
                  var11[2].n5(var12[3]);
                  var11[7].n5(var12[4]);
                  var11[6].n5(var12[5]);
               } else {
                  var11[1].n5(var12[0]);
                  var11[0].n5(var12[1]);
                  var11[2].n5(var12[2]);
                  var11[3].n5(var12[3]);
                  var11[6].n5(var12[4]);
                  var11[7].n5(var12[5]);
               }

               n5(var12, var1.m1());
            }

            if (var1.q0().c8() != null) {
               if (!var1.q0().c8().isPlotOrderReversed()) {
                  var11[0].n5(var12[0]);
                  var11[4].n5(var12[1]);
                  var11[3].n5(var12[2]);
                  var11[7].n5(var12[3]);
                  var11[2].n5(var12[4]);
                  var11[6].n5(var12[5]);
               } else {
                  var11[4].n5(var12[0]);
                  var11[0].n5(var12[1]);
                  var11[7].n5(var12[2]);
                  var11[3].n5(var12[3]);
                  var11[6].n5(var12[4]);
                  var11[2].n5(var12[5]);
               }

               n5(var12, var1.q0());
            }

            n5(var1, var11, var0);
            var1.i1().n5(var15);
            var1.f2().n5(var17);
         } else {
            com.aspose.slides.internal.x4g.s7 var18 = null;
            com.aspose.slides.internal.x4g.s7 var24 = null;
            if (var1.s3() > 0) {
               com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
               var16.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[1], var11[2], var11[3]});
               var1.b3().n5(var16, var13);
            }

            switch (var6) {
               case 0:
               case 1:
               case 8:
                  var24 = new com.aspose.slides.internal.x4g.s7();
                  var24.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[3], var11[7], var11[4]});
                  var1.f2().n5(var24, var13);
                  var18 = new com.aspose.slides.internal.x4g.s7();
                  var18.k5(new com.aspose.slides.internal.o9b.w1[]{var11[2], var11[3], var11[7], var11[6]});
                  var1.i1().n5(var18, 1.0F);
                  if (var1.m1().c8() != null) {
                     if (!var1.m1().c8().isPlotOrderReversed()) {
                        var11[0].n5(var12[0]);
                        var11[4].n5(var12[1]);
                        var11[3].n5(var12[2]);
                        var11[7].n5(var12[3]);
                        var11[2].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     } else {
                        var11[4].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[7].n5(var12[2]);
                        var11[3].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[2].n5(var12[5]);
                     }

                     n5(var12, var1.m1());
                  }

                  if (var1.q0().c8() != null) {
                     if (!var1.q0().c8().isPlotOrderReversed()) {
                        var11[0].n5(var12[0]);
                        var11[1].n5(var12[1]);
                        var11[3].n5(var12[2]);
                        var11[2].n5(var12[3]);
                        var11[7].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     } else {
                        var11[1].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[2].n5(var12[2]);
                        var11[3].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[7].n5(var12[5]);
                     }

                     n5(var12, var1.q0());
                  }

                  if (var1.m3().c8() != null) {
                     if (!var1.m3().c8().isPlotOrderReversed()) {
                        var11[1].n5(var12[0]);
                        var11[2].n5(var12[1]);
                        var11[0].n5(var12[2]);
                        var11[3].n5(var12[3]);
                        var11[4].n5(var12[4]);
                        var11[7].n5(var12[5]);
                     } else {
                        var11[2].n5(var12[0]);
                        var11[1].n5(var12[1]);
                        var11[3].n5(var12[2]);
                        var11[0].n5(var12[3]);
                        var11[7].n5(var12[4]);
                        var11[4].n5(var12[5]);
                     }

                     n5(var12, var1.m3());
                  }

                  n5(var1, var11, var0);
                  var1.i1().n5(var18);
                  var1.f2().n5(var24);
                  break;
               case 2:
               case 3:
                  var24 = new com.aspose.slides.internal.x4g.s7();
                  var24.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[3], var11[7], var11[4]});
                  var1.f2().n5(var24, var13);
                  var18 = new com.aspose.slides.internal.x4g.s7();
                  var18.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[1], var11[5], var11[4]});
                  var1.i1().n5(var18, 1.0F);
                  if (var1.m1().c8() != null) {
                     if (!var1.m1().c8().isPlotOrderReversed()) {
                        var11[1].n5(var12[0]);
                        var11[5].n5(var12[1]);
                        var11[0].n5(var12[2]);
                        var11[4].n5(var12[3]);
                        var11[3].n5(var12[4]);
                        var11[7].n5(var12[5]);
                     } else {
                        var11[5].n5(var12[0]);
                        var11[1].n5(var12[1]);
                        var11[4].n5(var12[2]);
                        var11[0].n5(var12[3]);
                        var11[7].n5(var12[4]);
                        var11[3].n5(var12[5]);
                     }

                     n5(var12, var1.m1());
                  }

                  if (var1.q0().c8() != null) {
                     if (!var1.q0().c8().isPlotOrderReversed()) {
                        var11[3].n5(var12[0]);
                        var11[2].n5(var12[1]);
                        var11[0].n5(var12[2]);
                        var11[1].n5(var12[3]);
                        var11[4].n5(var12[4]);
                        var11[5].n5(var12[5]);
                     } else {
                        var11[2].n5(var12[0]);
                        var11[3].n5(var12[1]);
                        var11[1].n5(var12[2]);
                        var11[0].n5(var12[3]);
                        var11[5].n5(var12[4]);
                        var11[4].n5(var12[5]);
                     }

                     n5(var12, var1.q0());
                  }

                  if (var1.m3().c8() != null) {
                     if (!var1.m3().c8().isPlotOrderReversed()) {
                        var11[1].n5(var12[0]);
                        var11[2].n5(var12[1]);
                        var11[0].n5(var12[2]);
                        var11[3].n5(var12[3]);
                        var11[4].n5(var12[4]);
                        var11[7].n5(var12[5]);
                     } else {
                        var11[2].n5(var12[0]);
                        var11[1].n5(var12[1]);
                        var11[3].n5(var12[2]);
                        var11[0].n5(var12[3]);
                        var11[7].n5(var12[4]);
                        var11[4].n5(var12[5]);
                     }

                     n5(var12, var1.m3());
                  }

                  n5(var1, var11, var0);
                  var1.i1().n5(var18);
                  var1.f2().n5(var24);
                  break;
               case 4:
               case 5:
                  var18 = new com.aspose.slides.internal.x4g.s7();
                  var18.k5(new com.aspose.slides.internal.o9b.w1[]{var11[0], var11[1], var11[5], var11[4]});
                  var1.i1().n5(var18, 1.0F);
                  var24 = new com.aspose.slides.internal.x4g.s7();
                  var24.k5(new com.aspose.slides.internal.o9b.w1[]{var11[1], var11[2], var11[6], var11[5]});
                  var1.f2().n5(var24, var13);
                  if (var1.m1().c8() != null) {
                     if (!var1.m1().c8().isPlotOrderReversed()) {
                        var11[0].n5(var12[0]);
                        var11[4].n5(var12[1]);
                        var11[1].n5(var12[2]);
                        var11[5].n5(var12[3]);
                        var11[2].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     } else {
                        var11[4].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[5].n5(var12[2]);
                        var11[1].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[2].n5(var12[5]);
                     }

                     n5(var12, var1.m1());
                  }

                  if (var1.q0().c8() != null) {
                     if (!var1.q0().c8().isPlotOrderReversed()) {
                        var11[3].n5(var12[0]);
                        var11[2].n5(var12[1]);
                        var11[0].n5(var12[2]);
                        var11[1].n5(var12[3]);
                        var11[4].n5(var12[4]);
                        var11[5].n5(var12[5]);
                     } else {
                        var11[2].n5(var12[0]);
                        var11[3].n5(var12[1]);
                        var11[1].n5(var12[2]);
                        var11[0].n5(var12[3]);
                        var11[5].n5(var12[4]);
                        var11[4].n5(var12[5]);
                     }

                     n5(var12, var1.q0());
                  }

                  if (var1.m3().c8() != null) {
                     if (!var1.m3().c8().isPlotOrderReversed()) {
                        var11[3].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[2].n5(var12[2]);
                        var11[1].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[5].n5(var12[5]);
                     } else {
                        var11[0].n5(var12[0]);
                        var11[3].n5(var12[1]);
                        var11[1].n5(var12[2]);
                        var11[2].n5(var12[3]);
                        var11[5].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     }

                     n5(var12, var1.m3());
                  }

                  n5(var1, var11, var0);
                  var1.i1().n5(var18);
                  var1.f2().n5(var24);
                  break;
               case 6:
               case 7:
                  var24 = new com.aspose.slides.internal.x4g.s7();
                  var24.k5(new com.aspose.slides.internal.o9b.w1[]{var11[1], var11[2], var11[6], var11[5]});
                  var1.f2().n5(var24, var13);
                  var18 = new com.aspose.slides.internal.x4g.s7();
                  var18.k5(new com.aspose.slides.internal.o9b.w1[]{var11[2], var11[3], var11[7], var11[6]});
                  var1.i1().n5(var18, 1.0F);
                  if (var1.m1().c8() != null) {
                     if (!var1.m1().c8().isPlotOrderReversed()) {
                        var11[3].n5(var12[0]);
                        var11[7].n5(var12[1]);
                        var11[2].n5(var12[2]);
                        var11[6].n5(var12[3]);
                        var11[1].n5(var12[4]);
                        var11[5].n5(var12[5]);
                     } else {
                        var11[7].n5(var12[0]);
                        var11[3].n5(var12[1]);
                        var11[6].n5(var12[2]);
                        var11[2].n5(var12[3]);
                        var11[5].n5(var12[4]);
                        var11[1].n5(var12[5]);
                     }

                     n5(var12, var1.m1());
                  }

                  if (var1.q0().c8() != null) {
                     if (!var1.q0().c8().isPlotOrderReversed()) {
                        var11[0].n5(var12[0]);
                        var11[1].n5(var12[1]);
                        var11[3].n5(var12[2]);
                        var11[2].n5(var12[3]);
                        var11[7].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     } else {
                        var11[1].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[2].n5(var12[2]);
                        var11[3].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[7].n5(var12[5]);
                     }

                     n5(var12, var1.q0());
                  }

                  if (var1.m3().c8() != null) {
                     if (!var1.m3().c8().isPlotOrderReversed()) {
                        var11[3].n5(var12[0]);
                        var11[0].n5(var12[1]);
                        var11[2].n5(var12[2]);
                        var11[1].n5(var12[3]);
                        var11[6].n5(var12[4]);
                        var11[5].n5(var12[5]);
                     } else {
                        var11[0].n5(var12[0]);
                        var11[3].n5(var12[1]);
                        var11[1].n5(var12[2]);
                        var11[2].n5(var12[3]);
                        var11[5].n5(var12[4]);
                        var11[6].n5(var12[5]);
                     }

                     n5(var12, var1.m3());
                  }

                  n5(var1, var11, var0);
                  var1.i1().n5(var18);
                  var1.f2().n5(var24);
            }
         }

         int var23 = n5(var0, var1.m1());
         if (var23 != 0) {
            com.aspose.slides.internal.o9b.w1[] var29 = g8v.k5(var1);
            if (var0) {
               var1.q0().n5(var29[2].l6() + var23, var29[2].k5(), var29[2].l6() + var23, var29[2].k5() - var1.e5().a6());
            } else {
               var1.q0().n5(var29[2].l6(), var29[2].k5() - var23, var29[3].l6(), var29[3].k5() - var23);
            }
         }
      }
   }

   private static int n5(boolean var0, l5 var1) {
      n1g var2 = var1.d2();
      double var3 = var1.z1();
      double var5 = var1.e2();
      double var7 = var1.t9();
      var3 = var1.c8().isPlotOrderReversed() ? var5 - var3 : var3 - var7;
      float var9 = var2.e5().a6();
      if (var0) {
         var9 = var2.e5().u3();
      }

      return com.aspose.slides.internal.v6g.k5.u3(var3 / (var5 - var7) * var9, 14);
   }

   private static void n5(n1g var0, com.aspose.slides.internal.o9b.w1[] var1, boolean var2) {
      if (var0.s3() > 0) {
         com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
         if (var2) {
            var3.n5(var1[0].u3(), var1[3].u3());
            var3.n5(var1[3].u3(), var1[7].u3());
            var3.n5(var1[7].u3(), var1[4].u3());
            var3.n5(var1[4].u3(), var1[0].u3());
         } else {
            var3.n5(var1[0].u3(), var1[1].u3());
            var3.n5(var1[1].u3(), var1[2].u3());
            var3.n5(var1[2].u3(), var1[3].u3());
            var3.n5(var1[3].u3(), var1[0].u3());
         }

         var0.b3().n5(var3);
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.w1[] var0, l5 var1) {
      int var2 = var1.c8().getBaseUnitScale();
      double var3 = var1.e2();
      double var5 = var1.t9();
      double var7 = var1.c8().isLogarithmic() ? var1.n5(var1.w1()) : var1.w1();
      double var9 = var1.c8().isLogarithmic() ? var1.n5(var1.j5()) : var1.j5();
      double var11;
      if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
         var11 = p4.n5(
               var2,
               com.aspose.slides.internal.v6g.k5.u3(var3, 14),
               com.aspose.slides.internal.v6g.k5.u3(var5, 14),
               com.aspose.slides.internal.v6g.k5.u3(var3, 14),
               false
            )
            + 1.0;
      } else {
         var11 = var3 - var5;
      }

      double var13 = (var0[1].l6() - var0[0].l6()) / var11;
      double var15 = (var0[1].k5() - var0[0].k5()) / var11;
      if (var1.c8().getShowMajorGridLines() && var7 > 0.0) {
         double var17;
         if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
            var17 = p4.l6(
               var1.c8().getBaseUnitScale(), var1.m1(), com.aspose.slides.internal.v6g.k5.u3(var7, 14), com.aspose.slides.internal.v6g.k5.u3(var5, 14), false
            );
         } else {
            var17 = var5;
         }

         com.aspose.slides.internal.o9b.w1 var19 = n5(var0[0].u3()).u3();
         com.aspose.slides.internal.o9b.w1 var20 = n5(var0[2].u3()).u3();
         com.aspose.slides.internal.o9b.w1 var21 = n5(var0[4].u3()).u3();

         while (var17 <= var3 || var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1 && var17 <= var3) {
            double var22;
            if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
               var22 = p4.n5(
                  var2,
                  com.aspose.slides.internal.v6g.k5.u3(var17, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                  false
               );
            } else {
               var22 = var17 - var5;
            }

            var19.n5(var0[0].l6() + (float)(var13 * var22));
            var19.l6(var0[0].k5() + (float)(var15 * var22));
            var20.n5(var0[2].l6() + (float)(var13 * var22));
            var20.l6(var0[2].k5() + (float)(var15 * var22));
            var21.n5(var0[4].l6() + (float)(var13 * var22));
            var21.l6(var0[4].k5() + (float)(var15 * var22));
            var1.l6(var19.l6(), var19.k5(), var20.l6(), var20.k5());
            var1.l6(var20.l6(), var20.k5(), var21.l6(), var21.k5());
            if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
               var17 = p4.l6(
                  var1.c8().getBaseUnitScale(),
                  var1.m1(),
                  com.aspose.slides.internal.v6g.k5.u3(var7, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var17, 14),
                  false
               );
            } else {
               var17 += var7;
            }
         }
      }

      if (var1.c8().getShowMinorGridLines() && var9 > 0.0) {
         double var24;
         if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
            var24 = p4.l6(
               var1.c8().getBaseUnitScale(), var1.k7(), com.aspose.slides.internal.v6g.k5.u3(var9, 14), com.aspose.slides.internal.v6g.k5.u3(var5, 14), false
            );
         } else {
            var24 = var5 + var9;
         }

         com.aspose.slides.internal.o9b.w1 var25 = n5(var0[0].u3()).u3();
         com.aspose.slides.internal.o9b.w1 var26 = n5(var0[2].u3()).u3();
         com.aspose.slides.internal.o9b.w1 var27 = n5(var0[4].u3()).u3();

         while (var24 <= var3 || var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1 && var24 <= var3) {
            double var28;
            if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
               var28 = p4.n5(
                  var2,
                  com.aspose.slides.internal.v6g.k5.u3(var24, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var5, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var3, 14),
                  false
               );
            } else {
               var28 = var24 - var5;
            }

            var25.n5(var0[0].l6() + (float)(var13 * var28));
            var25.l6(var0[0].k5() + (float)(var15 * var28));
            var26.n5(var0[2].l6() + (float)(var13 * var28));
            var26.l6(var0[2].k5() + (float)(var15 * var28));
            var27.n5(var0[4].l6() + (float)(var13 * var28));
            var27.l6(var0[4].k5() + (float)(var15 * var28));
            var1.k5(var25.l6(), var25.k5(), var26.l6(), var26.k5());
            var1.k5(var26.l6(), var26.k5(), var27.l6(), var27.k5());
            if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
               var24 = p4.l6(
                  var1.c8().getBaseUnitScale(),
                  var1.k7(),
                  com.aspose.slides.internal.v6g.k5.u3(var9, 14),
                  com.aspose.slides.internal.v6g.k5.u3(var24, 14),
                  false
               );
            } else {
               var24 += var9;
            }
         }
      }
   }

   private static boolean u3(int var0) {
      switch (var0) {
         case 27:
         case 30:
            return true;
         default:
            return false;
      }
   }

   static boolean n5(int var0) {
      switch (var0) {
         case 6:
         case 10:
         case 14:
         case 18:
         case 25:
         case 50:
            return true;
         default:
            return false;
      }
   }

   public static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0) {
      return new com.aspose.slides.internal.o9b.w1(var0.l6(), var0.k5());
   }

   public void n5(a9k var1) {
   }

   public a9k n5() {
      a9k var1 = new a9k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a9k var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a9k) ? false : this.l6((a9k)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a9k Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a9k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
