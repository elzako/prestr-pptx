package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class k1d {
   final void n5(n1g var1) {
      if (var1.y4().size() != 0 && n1g.u3(var1.y4()) != 0) {
         List var2 = var1.y4();
         l5 var3 = var1.q0();
         l5 var4 = var1.m1();
         ChartPlotArea var5 = (ChartPlotArea)var1.n3().getPlotArea();
         g6z.n5(var1.y4(), var1.y4().get_Item(0), var3, var4);
         boolean var6 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
         g3y var7 = var1.y4().get_Item(0);
         com.aspose.slides.internal.o9b.y2 var8 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(var1.y1(), 13) + 11,
            com.aspose.slides.internal.v6g.k5.u3(var1.a0(), 13) + 11,
            com.aspose.slides.internal.v6g.k5.u3(var1.c4(), 13) - 22,
            com.aspose.slides.internal.v6g.k5.u3(var1.y2(), 13) - 22
         );
         com.aspose.slides.internal.o9b.y1 var9 = com.aspose.slides.internal.o9b.y1.n5(var8).y4();
         com.aspose.slides.internal.o9b.y2[] var10 = new com.aspose.slides.internal.o9b.y2[]{var8};
         this.l6(var1, var10);
         var10[0].u3(var8);
         var8.u3(var1.n5.n5);
         var10[0] = var8;
         o9b.l6(var1, var10);
         var10[0].u3(var8);
         var10[0] = var8;
         this.k5(var1, var10);
         var10[0].u3(var8);
         o8m.n5(var1, var6, var8.n3());
         var10[0] = var8;
         this.u3(var1, var10);
         var10[0].u3(var8);
         var10[0] = var8;
         q9o.n5(var10, var7);
         var10[0].u3(var8);
         if (var5.isLocationAutocalculated()) {
            var8.u3(var1.n5.n5);
         }

         double var11 = 0.0;
         double var13 = 0.0;
         double[] var15 = new double[]{0.0};
         double[] var16 = new double[]{0.0};
         o9b.n5(var2, var15, var16, var4);
         var11 = var15[0];
         var13 = var16[0];
         boolean var17 = var4.c8() == null || var4.m3();
         boolean var18 = var4.c8() == null || var4.z8();
         o9b.n5(var13, var11, var4.h0, var1.n3().getType(), var8.n3(), var6, (g3y)var2.get_Item(0), var1.m1(), var1.m1().l6());
         o9b.n5(var3.h0, var8.n3(), var1.n3().getType(), var2, var6, var3);
         this.u3(var1);
         var10[0] = var8;
         this.a6(var1, var10);
         var10[0].u3(var8);
         v7u.n5(var1);
         var10[0] = var8;
         v7u.n5(var1, var10);
         var10[0].u3(var8);
         com.aspose.slides.internal.o9b.p8 var19 = new com.aspose.slides.internal.o9b.p8();
         com.aspose.slides.internal.o9b.p8 var20 = new com.aspose.slides.internal.o9b.p8();
         com.aspose.slides.internal.o9b.p8 var21 = new com.aspose.slides.internal.o9b.p8();
         int var22 = 0;
         List[] var23 = new List[]{var2};
         com.aspose.slides.internal.o9b.p8[] var24 = new com.aspose.slides.internal.o9b.p8[]{var19};
         com.aspose.slides.internal.o9b.p8[] var25 = new com.aspose.slides.internal.o9b.p8[]{var20};
         com.aspose.slides.internal.o9b.p8[] var26 = new com.aspose.slides.internal.o9b.p8[]{var21};
         int[] var27 = new int[]{0};
         a1.n5(var1, var23, var8.n3(), var24, var25, var26, var27);
         var2 = var23[0];
         var24[0].k5(var19);
         var25[0].k5(var20);
         var26[0].k5(var21);
         var22 = var27[0];
         var10[0] = var8;
         this.n5(var1, var10, var19.u3(), var20.u3(), var21.u3(), var22);
         var10[0].u3(var8);
         if (var4.c8() != null && var4.c8().isVisible()) {
            float var28 = o9b.n5(var6, var1.y4().get_Item(0), var8.n3(), var1.m1(), var1.m1().l6());
            int var29 = var1.n3().getType();
            boolean var30 = ChartTypeCharacterizer.s7(var29 != 73 ? var29 : var1.n3().getChartData().getSeries().get_Item(0).getType());
            if (var30 || var1.n3().getType() == 4 || var1.n3().getType() == 3) {
               float var31 = var8.l6() / var9.k5();
               var28 *= var31;
            }

            int var36;
            if (var6) {
               var36 = g6z.n5(var1.e5().u3());
            } else {
               var36 = g6z.n5(var1.e5().a6());
            }

            if (var17 && var4.h0.size() > 3 && var28 > var36 && var36 != 0) {
               var4.h0.clear();
               var4.k5(var17);
               var4.u3(var18);
               if (var17) {
                  var4.h0(0.0);
               }

               if (var18) {
                  var4.u9(0.0);
               }

               o9b.n5(var13, var11, var4.h0, var1.y4().get_Item(0).u9().getType(), var8.n3(), var6, var1.y4().get_Item(0), var4, var4.l6());
            }
         }

         this.n5(var1, var6);
         var10[0] = var8;
         this.n5(var1, var19.u3(), var20.u3(), var21.u3(), var22, var10);
         var10[0].u3(var8);
         this.k5(var1);
         this.n5(var1, com.aspose.slides.internal.o9b.y1.n5(var8).y4());
         this.l6(var1);
      }
   }

   private void n5(n1g var1, com.aspose.slides.internal.o9b.y2[] var2) {
      if (u6p.k5(var1.n3()) && !var1.n3().getRotation3D().getRightAngleAxes()) {
         float var3 = 4.0F;
         if (!(var1.i1().u3() <= var3 * var1.i1().a6())) {
            l5 var4 = var1.m3();
            com.aspose.slides.internal.o9b.n3 var5 = var4.l6() != null ? var4.l6() : var4.k5();
            com.aspose.slides.internal.o9b.c8 var6 = var4.u3().o8();
            byte var7 = 1;
            byte var8 = 2;
            float var9 = var4.n5;
            List$Enumerator var10 = var4.h0.iterator();

            try {
               while (var10.hasNext()) {
                  Object var11 = var10.next();
                  String var12 = p4.n5(var11, var4);
                  com.aspose.slides.internal.o9b.f2 var13 = this.n5(var12, var5, var6.o8(), var4.u9(), var7, var8, var1).a6();
                  if (var9 < var13.l6()) {
                     var9 = var13.l6();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            var2[0] = new com.aspose.slides.internal.o9b.y2(
               com.aspose.slides.internal.v6g.k5.u3(var2[0].s7() + var9 / 2.0F, 13),
               com.aspose.slides.internal.v6g.k5.u3(var2[0].x8() + var9 / 2.0F, 13),
               com.aspose.slides.internal.v6g.k5.u3(var2[0].t2() - var9, 13),
               com.aspose.slides.internal.v6g.k5.u3(var2[0].l6() - var9 / 2.0F, 13)
            );
            o8m.n5(var1, false, var2[0].n3());
         }
      }
   }

   private com.aspose.slides.internal.o9b.f2 n5(
      String var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.c8 var3, float var4, int var5, int var6, n1g var7
   ) {
      AutoShape var8 = j9e.n5(var1, var2, var3.o8(), var5, var6, var7);
      s3z.l6(var8.l6().u3);
      com.aspose.slides.internal.o9b.y1 var9 = x5h.n5(s3z.n5(var8.l6().u3)).y4();
      TextFrameFormat var10 = (TextFrameFormat)var8.l6().getTextFrameFormat();
      float var11 = (float)(var10.u3().l6 + var10.u3().u3);
      float var12 = (float)(var10.u3().k5 + var10.u3().a6);
      if (!com.aspose.slides.ms.System.n1.k5(var11)) {
         var9.l6(var9.s7() + var11);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var12)) {
         var9.n5(var9.k5() + var12);
      }

      z3y var13 = new z3y(var9.y4());
      if (var4 != 0.0F) {
         var13.n5(var4);
      }

      boolean var14 = var10.getTextVerticalType() == 4
         || var10.getTextVerticalType() == 3
         || var10.getTextVerticalType() == 5
         || var10.getTextVerticalType() == 6;
      if (var14) {
         var8.setWidth((float)com.aspose.slides.ms.System.q1.l6((double)var13.k5()));
         var8.setHeight((float)com.aspose.slides.ms.System.q1.l6((double)var13.l6()));
      } else {
         var8.setWidth((float)com.aspose.slides.ms.System.q1.l6((double)var13.l6()));
         var8.setHeight((float)com.aspose.slides.ms.System.q1.l6((double)var13.k5()));
      }

      s3z.l6(var8.l6().u3);
      return new com.aspose.slides.internal.o9b.f2(var13.l6(), var13.k5());
   }

   private void l6(n1g var1) {
      if (var1.m1().c8() != null) {
         l5 var2 = var1.m1();
         double var3 = var2.z1();
         double var5 = var2.e2();
         double var7 = var2.t9();
         if (var2.c8().getCrossType() == 1) {
            var3 = var5;
         }

         if (var3 > var5) {
            var3 = var5;
         }

         if (var3 < var7) {
            var3 = var7;
         }

         var2.n5(var2.c8().isLogarithmic() ? (float)var2.l6(var3) : (float)var3);
      }
   }

   private void n5(n1g var1, com.aspose.slides.internal.o9b.y1 var2) {
      if (u6p.l6(var1.n3())) {
         q0h.n5(var1, var2.y4());
      }
   }

   private void n5(n1g var1, boolean var2) {
      if (var1.m3().c8() != null && var1.m3().c8().isVisible() && !var2) {
         float var3 = (var1.n3().getRotation3D().getDepthPercents() & 65535) / 100.0F;
         float var4 = (var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         float var5 = var1.e5().h0() * var3 / (1.0F + var4);
         float var6 = var5 * var4;
         float var7 = var5 + var6;
         int var8 = var1.m3().h0.size();
         float var9 = 2.5F * var1.m3().l6;
         if (var8 * var9 > var7) {
            List var10 = new List();
            var10.addItem(0);
            var10.addItem(var8 - 1);

            for (int var11 = 1; var11 < var8 - 1; var11++) {
               var10.addItem(var11);
            }

            for (int var12 = 1; var12 < var10.size(); var12++) {
               if ((var12 + 1) * var9 >= var7) {
                  var1.m3().h0.set_Item((Integer)var10.get_Item(var12), null);
               }
            }
         }
      }
   }

   private void l6(n1g var1, com.aspose.slides.internal.o9b.y2[] var2) {
      ChartPlotArea var3 = (ChartPlotArea)var1.n3().getPlotArea();
      if (!var3.isLocationAutocalculated()) {
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var1.c4(), 13);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.y2(), 13);
         var2[0].k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var3.getX() * var4 / 2.0F, 13));
         var2[0].u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0() + var3.getY() * var5 / 2.0F, 13));
         var2[0].l6(com.aspose.slides.internal.v6g.k5.u3(var4 * (var3.getX() / 2.0F + var3.getWidth()), 13));
         var2[0].n5(com.aspose.slides.internal.v6g.k5.u3(var5 * (var3.getY() + var3.getHeight()), 13));
         if (var2[0].x8() < var1.a0()) {
            var2[0].n5(var2[0].l6() + var2[0].x8());
            var2[0].u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0(), 13));
         }

         if (var2[0].s7() < var1.y1()) {
            var2[0].l6(var2[0].t2() + var2[0].s7());
            var2[0].k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1(), 13));
         }

         if (var2[0].t2() + var2[0].s7() > var1.y1() + var4) {
            var2[0].k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1(), 13) + var4 - var2[0].t2());
         }

         if (var2[0].l6() + var2[0].x8() > var1.a0() + var5) {
            var2[0].u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0(), 13) + var5 - var2[0].l6());
         }

         if (var2[0].u9() > var1.y1() + var1.c4()) {
            var2[0].l6(com.aspose.slides.internal.v6g.k5.u3(var1.y1(), 13) + com.aspose.slides.internal.v6g.k5.u3(var1.c4(), 13) - var2[0].s7());
         }

         if (var2[0].n5() > var1.a0() + var1.y2()) {
            var2[0].n5(com.aspose.slides.internal.v6g.k5.u3(var1.a0(), 13) + com.aspose.slides.internal.v6g.k5.u3(var1.y2(), 13) - var2[0].x8());
         }
      }
   }

   private void k5(n1g var1, com.aspose.slides.internal.o9b.y2[] var2) {
      if (var1.n3().hasLegend()) {
         if (var1.n3().getType() != 30 && var1.n3().getType() != 27 && !var1.t2().n3()) {
            z7d.n5(var2, var1);
         } else {
            g3y var3 = var1.y4().get_Item(0);
            z7d.n5(var3, var2, var1);
         }
      }
   }

   private void u3(n1g var1, com.aspose.slides.internal.o9b.y2[] var2) {
      l5 var3 = var1.q0();
      l5 var4 = var1.m1();
      boolean var5 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
      if (var3.c8() != null && var3.c8().hasTitle() && var3.c8().isVisible()) {
         this.n5(var3, var2, var5, var1);
      }

      if (var4.c8() != null && var4.c8().hasTitle() && var4.c8().isVisible()) {
         if (com.aspose.slides.ms.System.n1.k5(var4.h0().u3())) {
            var4.h0().n5(90.0F);
         }

         this.n5(var4, var2, var5, var1);
      }

      if (var1.m3().c8() != null && var1.m3().c8().hasTitle() && var1.m3().c8().isVisible()) {
         b9y var6 = var1.m3().h0();
         com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.8F);
         com.aspose.slides.internal.o9b.p8 var8 = var6.n5(var7.a6()).u3();
         var2[0].l6(var2[0].t2() - var8.l6());
         o8m.n5(var1, var5, var2[0].n3());
      }
   }

   private void a6(n1g var1, com.aspose.slides.internal.o9b.y2[] var2) {
      if (!g6z.n5(var2[0].n3())) {
         var2[0].k5(var2[0].s7() + 2);
         var2[0].u3(var2[0].x8() + 2);
         var2[0].l6(var2[0].t2() - 4);
         var2[0].n5(var2[0].l6() - 4);
         boolean var3 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
         o8m.n5(var1, var3, var2[0].n3());
      }
   }

   private void n5(
      n1g var1,
      com.aspose.slides.internal.o9b.y2[] var2,
      com.aspose.slides.internal.o9b.p8 var3,
      com.aspose.slides.internal.o9b.p8 var4,
      com.aspose.slides.internal.o9b.p8 var5,
      int var6
   ) {
      if (!g6z.n5(var2[0].n3())) {
         IRotation3D var7 = var1.n3().getRotation3D();
         float var8 = var7.getRotationX();
         boolean var9 = var8 == 0.0F && var7.getRightAngleAxes();
         boolean var10 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
         boolean var11 = false;
         if (com.aspose.slides.internal.v6g.k5.l6(var1.n3().getPlotArea(), ChartPlotArea.class)) {
            var11 = ((ChartPlotArea)var1.n3().getPlotArea()).isLocationAutocalculated();
         }

         if (!var11) {
            int var12 = var3.l6();
            if (var9) {
               var12 = 0;
            }

            var2[0].l6(var2[0].t2() + var5.l6() + var12);
            var2[0].n5(var2[0].l6() + var4.k5());
            var1.n5.n5.l6(var1.n5.n5.t2() + var5.l6() + var12);
            var1.n5.n5.n5(var1.n5.n5.l6() + var4.k5());
         }

         l5 var23 = var1.q0();
         l5 var13 = var1.m1();
         l5 var14 = var1.m3();
         boolean var15 = !var7.getRightAngleAxes();
         boolean var16 = var1.n3().hasLegend() && var1.n3().getLegend().getPosition() == 2;
         boolean var17 = var14.c8() != null && var14.c8().isVisible() && var14.c8().getTickLabelPosition() != 3 && var5.l6() != 0;
         if (var14.c8() != null && var14.c8().isVisible() && var14.c8().getTickLabelPosition() != 3) {
            if (var10 && (var1.n3().getType() != 33 || var1.n3().u9() != 3)) {
               int var24 = var14.x8() * com.aspose.slides.internal.v6g.k5.u3(var1.y2(), 13) / 4000;
               com.aspose.slides.internal.o9b.w1 var28 = new com.aspose.slides.internal.o9b.w1(var1.e5().l6(), var1.e5().k5());
               int var33 = var5.l6() + var24;
               int var21 = com.aspose.slides.internal.v6g.k5.u3(var28.l6() - var2[0].s7(), 13);
               if (var21 < var33) {
                  if (!var11 && var1.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var2[0].k5(var2[0].s7() - var33);
                     var2[0].l6(var2[0].t2() + var33);
                  } else {
                     var2[0].k5(var2[0].s7() + var33);
                     var2[0].l6(var2[0].t2() - var33);
                  }
               }

               if (var11 || var1.n3().getPlotArea().getLayoutTargetType() == 1) {
                  o8m.n5(var1, false, var2[0].n3());
               }
            } else {
               float var18 = var1.e5().l6() + var1.e5().u3();
               float var19 = var2[0].u9();
               float var20 = var19 - var18 - var5.l6();
               if (var20 < 0.0F) {
                  var2[0].l6(com.aspose.slides.internal.v6g.k5.u3(var2[0].t2() + var20, 13));
                  o8m.n5(var1, var10, var2[0].n3());
               }
            }

            this.n5(var1, var2);
         }

         if (var13.c8() != null && var13.c8().isVisible() && var13.c8().getTickLabelPosition() != 3 && !var1.n3().hasDataTable()) {
            if (!var10) {
               float var25;
               if (var1.n3().getRotation3D().getRightAngleAxes() && u6p.u3(var1.n3().getType()) && !var13.c8().hasTitle()) {
                  float var29 = var2[0].s7() + var1.e5().s7() + var3.l6() - var1.e5().l6();
                  var25 = var29 > var3.l6() * 0.1 ? var29 : 0.0F;
               } else {
                  var25 = var3.l6();
               }

               if (var25 > 0.0F) {
                  int var30 = 0;
                  if (var9) {
                     var30 = com.aspose.slides.internal.v6g.k5.u3(var1.e5().s7(), 13);
                  }

                  float var34 = var25 - var30;
                  if (var15 && var16 && var17) {
                     com.aspose.slides.internal.o9b.y1 var38 = j9e.n5(var1, var1.o0().y4(), com.aspose.slides.internal.o9b.y1.n5(var2[0]).y4(), 0.0F).y4();
                     if (var1.n5.n5.s7() > var38.x8() - var3.l6()) {
                        var34 = (var1.n5.n5.s7() - (var38.x8() - var3.l6())) * 0.5F;
                     }
                  }

                  var2[0].k5(var2[0].s7() + (int)var34);
                  var2[0].l6(var2[0].t2() - (int)(var25 - var30));
                  o8m.n5(var1, var10, var2[0].n3());
               }
            } else {
               float var26 = var2[0].n5() - (var1.e5().k5() + var1.e5().x8() + var3.k5());
               if (var26 < 0.0F && var8 >= 0.0F) {
                  var2[0].n5(var2[0].l6() + (int)var26);
                  int var31 = var13.c8().getPosition();
                  if (var31 == 3 || var31 == 0 && var23.c8().isPlotOrderReversed()) {
                     var2[0].u3(var2[0].x8() - (int)var26);
                     if (u6p.k5(var1.n3())) {
                        var2[0].n5(var2[0].l6() - var3.k5() / 2);
                     }
                  }

                  o8m.n5(var1, var10, var2[0].n3());
               }
            }
         }

         if (var23.c8() != null && var23.c8().isVisible() && var23.c8().getTickLabelPosition() != 3 && !var1.n3().hasDataTable()) {
            com.aspose.slides.internal.o9b.p8 var27 = new com.aspose.slides.internal.o9b.p8(0, 0);
            float var32 = var1.e5().k5();
            if (!var10) {
               if (u6p.u3(var1.n3().getType()) && var1.n3().getRotation3D().getRightAngleAxes()) {
                  float var35 = (float)(var23.h0.size() * var4.l6()) + (var23.h0.size() - 1) * var6;
                  if (var35 > var1.e5().u3()) {
                     byte var39 = 45;
                     var1.q0().n5(var39);
                     int var22 = n1g.u3(var1.y4());
                     a1.n5(var23, var2[0].n3(), var22, var10, var1.y4().get_Item(0)).k5(var4);
                     var23.n5(var4.u3());
                  }
               }

               int var36 = var4.k5() + var6;
               if (var8 >= 0.0F) {
                  float var40 = var2[0].n5() - var27.k5() - var32 - var1.e5().x8();
                  if (var40 < var36) {
                     if (var9) {
                        var2[0].u3(var2[0].x8() - (int)(var4.k5() - var40));
                     } else if (var1.q0().u9() != 0 && var40 < 0.0F && var15) {
                        var2[0].n5(var2[0].l6() - (int)(var36 - var40 * 0.7F));
                     } else {
                        var2[0].n5(var2[0].l6() - (int)(var36 - var40));
                     }

                     o8m.n5(var1, var10, var2[0].n3());
                  }
               }
            } else {
               int var37 = var4.l6() + var6 - (u6p.k5(var1.n3()) ? var5.l6() / 2 : 0);
               int var41 = com.aspose.slides.internal.v6g.k5.u3(var2[0].s7() - (var1.e5().l6() - var1.e5().s7()), 13);
               if (var41 < var37) {
                  if (!var11 && var1.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var2[0].k5(var2[0].s7() - var37);
                     var2[0].l6(var2[0].t2() + var37);
                  } else {
                     var2[0].k5(var2[0].s7() + var37);
                     var2[0].l6(var2[0].t2() - var37);
                  }
               }

               if (var11 || var1.n3().getPlotArea().getLayoutTargetType() == 1) {
                  o8m.n5(var1, var10, var2[0].n3());
               }
            }
         }
      }
   }

   private void n5(
      n1g var1,
      com.aspose.slides.internal.o9b.p8 var2,
      com.aspose.slides.internal.o9b.p8 var3,
      com.aspose.slides.internal.o9b.p8 var4,
      int var5,
      com.aspose.slides.internal.o9b.y2[] var6
   ) {
      boolean var7 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
      l5 var8 = var1.q0();
      l5 var9 = var1.m1();
      if (var8.c8() != null && var8.c8().hasTitle() && var8.c8().isVisible()) {
         this.n5(var8, var6[0].n3(), var7, var2.u3(), var8.a6().u3(), var5);
      }

      if (var9.c8() != null && var9.c8().hasTitle() && var9.c8().isVisible()) {
         this.n5(var9, var6[0].n3(), var7, var2.u3(), var8.a6().u3(), var5);
      }

      if (var1.m3().c8() != null && var1.m3().c8().hasTitle() && var1.m3().c8().isVisible()) {
         b9y var10 = var1.m3().h0();
         com.aspose.slides.internal.o9b.f2 var11 = new com.aspose.slides.internal.o9b.f2(var6[0].t2() * 0.8F, var6[0].l6() * 0.8F);
         com.aspose.slides.internal.o9b.p8 var12 = var10.n5(var11.a6()).u3();
         com.aspose.slides.internal.o9b.p8 var13 = var12.u3();
         com.aspose.slides.internal.o9b.y2 var14 = var1.n5.n5.n3();
         var10.n5.n5.k5(var14.u9());
         var10.n5.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var1.e5().k5() + var4.k5() - var13.k5() / 2.0F, 13));
         var10.n5.n5.l6(var13.u3());
      }
   }

   private void k5(n1g var1) {
      boolean var2 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
      if (var1.n3().hasDataTable()) {
         a8e var3 = var1.s7();
         com.aspose.slides.internal.o9b.p8 var4 = var3.u9().u3();
         int var5 = var3.c8();
         int var6 = var4.k5() + var5;
         var3.n5.n5(var6);
         if (!var2 && var1.n3().getRotation3D().getRightAngleAxes()) {
            IRotation3D var14 = var1.n3().getRotation3D();
            float var8 = var14.getRotationX();
            float var9 = var1.e5().u3();
            float var10 = var1.e5().u9();
            float var11 = var1.e5().k5();
            com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var10 - var9 / 2.0F, var11);
            com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(var10 + var9 / 2.0F, var11);
            if (var8 > 0.0F) {
               if (var12.l6() < var13.l6()) {
                  var3.n5.k5(com.aspose.slides.internal.v6g.k5.u3(var12.l6(), 13));
                  var3.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var12.k5(), 13));
               } else {
                  var3.n5.k5(com.aspose.slides.internal.v6g.k5.u3(var13.l6(), 13));
                  var3.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var13.k5(), 13));
               }

               var3.n5.l6(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13.l6() - var12.l6()), 13));
            }
         } else {
            com.aspose.slides.internal.o9b.y2 var7 = var1.n5.n5.n3();
            var3.n5.k5(var7.s7() + var4.l6());
            var3.n5.u3(var7.n5() - var6);
            var3.n5.l6(var7.t2() - var4.l6());
         }
      }
   }

   private void u3(n1g var1) {
      if (u6p.k5(var1.n3())) {
         l5 var2 = var1.m3();
         List var3 = var2.h0;
         List var4 = var1.y4();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            g3y var6 = (g3y)var4.get_Item(var5);
            var3.addItem(var6.k5());
         }

         var2.u3(0.0);
         var2.a6((double)var4.size());
         var2.h0((double)var2.y2());
         var2.u9(var2.w1() / 2.0);
      }
   }

   private void n5(l5 var1, com.aspose.slides.internal.o9b.y2[] var2, boolean var3, n1g var4) {
      if (var1.y4() == 2) {
         var3 = !var3;
      }

      b9y var5 = var1.h0();
      if (var3) {
         com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.8F);
         com.aspose.slides.internal.o9b.p8 var7 = var5.n5(var6.a6()).u3();
         var2[0].k5(var2[0].s7() + var7.l6());
         var2[0].l6(var2[0].t2() - var7.l6());
      } else {
         com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.7F);
         com.aspose.slides.internal.o9b.p8 var9 = var1.h0().n5(var8.a6()).u3();
         if (var1.c8().getPosition() == 3) {
            var2[0].u3(var2[0].x8() + var9.k5() + 2);
         }

         var2[0].n5(var2[0].l6() - (var9.k5() + 2));
      }

      o8m.n5(var4, var3, var2[0].n3());
   }

   private void n5(
      l5 var1, com.aspose.slides.internal.o9b.y2 var2, boolean var3, com.aspose.slides.internal.o9b.p8 var4, com.aspose.slides.internal.o9b.p8 var5, int var6
   ) {
      boolean var7 = var3;
      com.aspose.slides.internal.o9b.p8 var8 = com.aspose.slides.internal.o9b.p8.n5.u3();
      n1g var9 = var1.d2();
      if (var1.y4() == 2) {
         var4.k5(var8);
         var7 = !var3;
      } else {
         var5.k5(var8);
         if (var1.c8().getTickLabelPosition() != 3) {
            var8.n5(var8.l6() + var6);
         }
      }

      n2z var10 = var1.h0().n5;
      if (var7) {
         com.aspose.slides.internal.o9b.f2 var11 = new com.aspose.slides.internal.o9b.f2(var2.t2() * 0.8F, var2.l6() * 0.8F);
         com.aspose.slides.internal.o9b.p8 var12 = var1.h0().n5(var11.a6()).u3();
         var10.n5.l6(var12.u3());
         var10.n5.k5(com.aspose.slides.internal.v6g.k5.u3(var9.e5().l6() - var8.l6(), 13));
         var10.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var9.e5().k5() - var9.e5().a6() / 2.0F - var12.k5(), 13));
      } else {
         com.aspose.slides.internal.o9b.f2 var13 = new com.aspose.slides.internal.o9b.f2(var2.t2() * 0.8F, var2.l6() * 0.7F);
         com.aspose.slides.internal.o9b.p8 var14 = var1.h0().n5(var13.a6()).u3();
         var10.n5.l6(var14.u3());
         if (var1.c8().getPosition() == 3) {
            var10.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var9.e5().k5() - var9.e5().a6() - var8.k5() - 2.0F * var6 - 4.0F, 13));
         } else {
            var10.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var9.e5().k5() + var8.k5() + var6, 13));
         }

         var10.n5.k5(com.aspose.slides.internal.v6g.k5.u3(var9.e5().u9() - var14.l6() / 2.0F, 13));
      }
   }
}
