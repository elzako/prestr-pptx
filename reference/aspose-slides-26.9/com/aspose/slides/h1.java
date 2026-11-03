package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class h1 {
   private n1g n5;

   public h1(n1g var1) {
      this.n5 = var1;
   }

   final void n5(l5 var1) {
      int var2 = n1g.u3(this.n5.y4());
      IRotation3D var3 = this.n5.n3().getRotation3D();
      float var4 = var3.getRotationX();
      float var5 = var3.getRotationY() & 65535;
      float var6 = this.n5.e5().c8();
      var6 *= (var3.getDepthPercents() & 65535) / 100.0F;
      float var7 = var6 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var8 = var5 <= 180.0F ? var6 + var7 : 0.0F;
      if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
         var8 = 0.0F;
      }

      double var9 = this.n5.m1().t4();
      double var11 = this.n5.m1().z3();
      double var13 = this.n5.m1().q0();
      if (this.n5.m1().c8().isPlotOrderReversed()) {
         var9 = var11 - var9;
      } else {
         var9 -= var13;
      }

      float var15 = this.n5.e5().l6();
      float var16 = this.n5.e5().k5();
      float var17 = this.n5.e5().a6();
      float var18 = this.n5.e5().u3();
      int var19 = com.aspose.slides.internal.v6g.k5.u3(var9 / (var11 - var13) * var18, 14);
      if (var19 != 0) {
         com.aspose.slides.internal.x4g.s7 var20 = new com.aspose.slides.internal.x4g.s7();

         try {
            var20.l6(var15 + var19, var16, var15 + var19, var16 - var17);
            var1.n5(var20, 0.0F, var8);
         } finally {
            if (var20 != null) {
               var20.dispose();
            }
         }
      }

      if (var4 >= 0.0F) {
         com.aspose.slides.internal.x4g.s7 var41 = new com.aspose.slides.internal.x4g.s7();

         try {
            var41.l6(var15, var16, var15, var16 - var17);
            var1.n5(var41, 0.0F, var8);
         } finally {
            if (var41 != null) {
               var41.dispose();
            }
         }
      }

      if (var1.c8().getTickLabelPosition() == 2) {
         var15 += var19;
      }

      float var21 = var1.s7();
      if (var1.c8().getTickLabelPosition() != 3) {
         float var22 = var1.k5().c8();
         var21 += p4.n5(var22) + p4.l6(var22);
      }

      float var42 = var15 - var1.u3 - var21;
      float var43 = var17 / var2;
      List var23 = this.n5.l6();
      boolean var24 = var1.n3() && var23.size() > 0;

      for (int var25 = 0; var25 < var2; var25++) {
         double var26 = var25 * var43;
         var26 += var43 / 2.0F;
         float var28;
         if (var1.c8().isPlotOrderReversed()) {
            var28 = (float)(var16 - var17 + var26) - var1.k5 / 2.0F;
         } else {
            var28 = (float)(var16 - var26) - var1.k5 / 2.0F;
         }

         if (var1.c8().getTickLabelPosition() != 3 && var25 % var1.r4() == 0 && var25 < var1.h0.size()) {
            com.aspose.slides.internal.o9b.c8 var29 = var1.u3().o8();
            String var30;
            if (!var24) {
               var30 = p4.n5(var1.h0.get_Item(var25), var1);
               t7k.n5(var1.h0.get_Item(var25), var1.c8().getNumberFormat(), var29.o8()).n5(var29);
            } else {
               String var31 = var25 < var23.size() ? ((x4)var23.get_Item(var25)).u9() : com.aspose.slides.ms.System.d1.n5;
               boolean var32 = var25 < var23.size() && ((x4)var23.get_Item(var25)).a6();
               var30 = t7k.n5(var1.h0.get_Item(var25), var31, var32);
               t7k.n5(var1.h0.get_Item(var25), var31, var29.o8()).n5(var29);
            }

            com.aspose.slides.internal.o9b.y1 var46 = new com.aspose.slides.internal.o9b.y1(var42, var28, var1.u3, var1.k5);
            j9e.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var46.y4())).y4(),
               var30,
               var1.u9(),
               var1.l6(),
               var29.o8(),
               2,
               2,
               this.n5,
               var8
            );
         }
      }

      this.n5(var1, var19, var2);
      List[] var44 = this.n5.u3();
      if (var44 != null && var44.length > 0 && var23.size() > 0 && var1.c8().getTickLabelPosition() != 3) {
         throw new NotImplementedException("Not implemented parent labels rendering of 3-D Bar Chart");
      }
   }

   final void l6(l5 var1) {
      n1g var2 = var1.d2();
      IRotation3D var3 = var2.n3().getRotation3D();
      byte var4 = var3.getRotationX();
      if (var4 >= 0) {
         float var5 = var2.e5().c8();
         var5 *= (var3.getDepthPercents() & 65535) / 100.0F;
         float var6 = var5 * ((var2.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var7 = var5 + var6;
         if (!var2.n3().getRotation3D().getRightAngleAxes()) {
            var7 = 0.0F;
         }

         boolean var8 = var1.d2().q0().c8().isPlotOrderReversed();
         int var9 = var1.c8().getPosition();
         boolean var10 = var9 == 3 || var9 == 0 && var8;
         if (var2.n3().getRotation3D().getRightAngleAxes() && var10) {
            var7 = 0.0F;
         }

         int var11 = var2.n3().getType() != 73 ? var2.n3().getType() : var2.n3().getChartData().getSeries().get_Item(0).getType();
         com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var2.e5().l6(), var2.e5().k5());
         com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(var2.e5().l6() + var2.e5().u3(), var2.e5().k5());
         if (!var1.d2().q0().c8().isPlotOrderReversed() && var1.d2().q0().c8().getCrossType() != 1) {
            com.aspose.slides.internal.x4g.s7 var43 = new com.aspose.slides.internal.x4g.s7();

            try {
               var43.l6(var12.l6(), var12.k5(), var13.l6(), var12.k5());
               var1.n5(var43, 0.0F, var7);
            } finally {
               if (var43 != null) {
                  var43.dispose();
               }
            }
         } else {
            com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();

            try {
               var14.l6(var12.l6(), var12.k5() - var2.e5().a6(), var13.l6(), var12.k5() - var2.e5().a6());
               var1.n5(var14, 0.0F, var7);
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }
            }
         }

         g3y var44 = var1.d2().y4().get_Item(0);
         t9z var15 = var44.c8().get_Item(0);
         String var16 = var15.u3();
         boolean var17 = false;
         float var18;
         if (!var1.d2().q0().c8().isPlotOrderReversed() && var1.d2().q0().c8().getCrossType() != 1) {
            var18 = var12.k5() + p4.n5(var1.k5().c8());
         } else {
            var18 = var12.k5() - var2.e5().a6() - p4.n5(var1.k5().c8()) - var1.a6().k5();
         }

         List var19 = var1.h0;
         double var20 = var1.c8().isLogarithmic() ? var1.n5(var1.z3()) : var1.z3();
         double var22 = var1.c8().isLogarithmic() ? var1.n5(var1.q0()) : var1.q0();
         double var24 = var1.c8().isLogarithmic() ? var1.n5(var1.w1()) : var1.w1();

         for (int var26 = 0; var26 < var1.h0.size(); var26++) {
            double var27 = com.aspose.slides.internal.v6g.k5.u3(var1.h0.get_Item(var26), double.class);
            double var29 = var1.c8().isLogarithmic() ? var1.l6(var27) : var27;
            if (var26 - 1 > 0
               ? com.aspose.slides.ms.System.q1.n5(g6z.n5(var27, com.aspose.slides.internal.v6g.k5.u3(var19.get_Item(var26 - 1), double.class))) == var24
               : var26 + 1 >= var19.size()
                  || com.aspose.slides.ms.System.q1.n5(g6z.n5(var27, com.aspose.slides.internal.v6g.k5.u3(var19.get_Item(var26 + 1), double.class))) == var24) {
               float var31 = (float)((var27 - var22) / (var20 - var22) * var2.e5().u3());
               if (!var1.c8().isPlotOrderReversed()) {
                  var31 = var12.l6() + var31;
               } else {
                  var31 = var13.l6() - var31;
               }

               if (var1.c8().getTickLabelPosition() != 3) {
                  float var32 = var1.n5;
                  if (ChartTypeCharacterizer.s7(var11)) {
                     var29 /= 100.0;
                     var32 *= 2.0F;
                     var16 = "0%";
                  } else {
                     var29 = var1.c8().isLogarithmic() ? var29 : var29 * p4.n5(var1);
                  }

                  com.aspose.slides.internal.o9b.c8 var33 = var1.u3().o8();
                  String var34;
                  if (var1.n3()) {
                     var34 = t7k.n5(var29, var16, var17);
                     t7k.n5(var29, var16, var33.o8()).n5(var33);
                  } else {
                     var34 = p4.n5(var29, var1);
                     t7k.n5(var29, var1.c8().getNumberFormat(), var33.o8()).n5(var33);
                  }

                  com.aspose.slides.internal.o9b.y1 var35 = new com.aspose.slides.internal.o9b.y1(var31 - var32 / 2.0F, var18, var32, var1.l6);
                  j9e.n5(
                     com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var35.y4())).y4(),
                     var34,
                     var1.u9(),
                     var1.l6(),
                     var33.o8(),
                     1,
                     1,
                     var2,
                     var7
                  );
               }
            }
         }

         this.k5(var1);
      }
   }

   private void n5(l5 var1, int var2, int var3) {
      n1g var4 = var1.d2();
      y9r var5 = var4.e5();
      IRotation3D var6 = var4.n3().getRotation3D();
      float var7 = var6.getRotationY() & 65535;
      float var8 = var4.e5().c8();
      var8 *= (var6.getDepthPercents() & 65535) / 100.0F;
      float var9 = var8 * ((var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var10 = var7 <= 180.0F ? var8 + var9 : 0.0F;
      if ((var1.c8().getMajorTickMark() != 2 || var1.c8().getMinorTickMark() != 2) && var1.c8().isVisible()) {
         com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var4.e5().l6(), var4.e5().k5());
         new com.aspose.slides.internal.o9b.w1();
         new com.aspose.slides.internal.o9b.w1();

         while (var2 >= 0) {
            boolean var14 = false;
            boolean var15 = false;
            switch (var1.c8().getMajorTickMark()) {
               case 0:
                  var14 = true;
                  var15 = true;
                  break;
               case 1:
                  var14 = true;
               case 2:
               default:
                  break;
               case 3:
                  var15 = true;
            }

            boolean var16 = false;
            boolean var17 = false;
            switch (var1.c8().getMinorTickMark()) {
               case 0:
                  var16 = true;
                  var17 = true;
                  break;
               case 1:
                  var16 = true;
               case 2:
               default:
                  break;
               case 3:
                  var17 = true;
            }

            com.aspose.slides.internal.o9b.w1 var12;
            com.aspose.slides.internal.o9b.w1 var13;
            if (var1.c8().isPlotOrderReversed()) {
               var12 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5() - var5.a6());
               var13 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5());
            } else {
               var12 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5());
               var13 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5() - var5.a6());
            }

            float var18 = (var13.k5() - var12.k5()) / var3;
            float var19 = var12.l6();
            float var20 = var12.k5();
            float var21 = p4.n5(var1.k5().c8());

            while (
               var12.k5() <= var20 && var20 <= var13.k5()
                  || var12.k5() >= var20 && var20 >= var13.k5()
                  || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var12.k5())
                  || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var13.k5())
            ) {
               if (var12.k5() <= var20 && var20 <= var13.k5()
                  || var12.k5() >= var20 && var20 >= var13.k5()
                  || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var12.k5())
                  || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var13.k5())) {
                  if (var14) {
                     com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var22.l6(var19, var20, var19 + var21, var20);
                        var1.n5(var22, 0.0F, var10);
                     } finally {
                        if (var22 != null) {
                           var22.dispose();
                        }
                     }
                  }

                  if (var15) {
                     com.aspose.slides.internal.x4g.s7 var72 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var72.l6(var19 - var21, var20, var19, var20);
                        var1.n5(var72, 0.0F, var10);
                     } finally {
                        if (var72 != null) {
                           var72.dispose();
                        }
                     }
                  }
               }

               float var73 = var20 - var1.y2() * var18 / 2.0F;
               if (var12.k5() <= var73 && var73 <= var13.k5()
                  || var12.k5() >= var73 && var73 >= var13.k5()
                  || com.aspose.slides.ms.System.q1.u3(var73) == com.aspose.slides.ms.System.q1.u3(var12.k5())
                  || com.aspose.slides.ms.System.q1.u3(var73) == com.aspose.slides.ms.System.q1.u3(var13.k5())) {
                  if (var16) {
                     com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var23.l6(var19, var73, var19 + var21, var73);
                        var1.n5(var23, 0.0F, var10);
                     } finally {
                        if (var23 != null) {
                           var23.dispose();
                        }
                     }
                  }

                  if (var17) {
                     com.aspose.slides.internal.x4g.s7 var75 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var75.l6(var19 - var21, var73, var19, var73);
                        var1.n5(var75, 0.0F, var10);
                     } finally {
                        if (var75 != null) {
                           var75.dispose();
                        }
                     }
                  }
               }

               var20 += var1.y2() * var18;
            }

            if (var1.y2() * var18 > var13.k5() - var12.k5()) {
               float var74 = var20 - var1.y2() * var18 / 2.0F;
               if (var12.k5() <= var74 && var74 <= var13.k5()
                  || var12.k5() >= var74 && var74 >= var13.k5()
                  || com.aspose.slides.ms.System.q1.u3(var74) == com.aspose.slides.ms.System.q1.u3(var12.k5())
                  || com.aspose.slides.ms.System.q1.u3(var74) == com.aspose.slides.ms.System.q1.u3(var13.k5())) {
                  if (var16) {
                     com.aspose.slides.internal.x4g.s7 var76 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var76.l6(var19, var74, var19 + var21, var74);
                        var1.n5(var76, 0.0F, var10);
                     } finally {
                        if (var76 != null) {
                           var76.dispose();
                        }
                     }
                  }

                  if (var17) {
                     com.aspose.slides.internal.x4g.s7 var77 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var77.l6(var19 - var21, var74, var19, var74);
                        var1.n5(var77, 0.0F, var10);
                     } finally {
                        if (var77 != null) {
                           var77.dispose();
                        }
                     }
                  }
               }
            }

            if (var2 <= 0) {
               break;
            }

            var11.n5(var11.l6() + var2);
            var2 = 0;
         }
      }
   }

   private void k5(l5 var1) {
      if (var1.c8().isVisible()) {
         n1g var2 = var1.d2();
         IRotation3D var3 = var2.n3().getRotation3D();
         float var4 = var2.e5().c8();
         var4 *= (var3.getDepthPercents() & 65535) / 100.0F;
         float var5 = var4 * ((var2.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var6 = var4 + var5;
         if (!var2.n3().getRotation3D().getRightAngleAxes()) {
            var6 = 0.0F;
         }

         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(var2.e5().l6(), var2.e5().k5());
         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var2.e5().l6() + var2.e5().u3(), var2.e5().k5());
         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1();
         boolean var11 = false;
         boolean var12 = false;
         if (!var1.c8().isPlotOrderReversed()) {
            var7.n5(var9);
            var8.n5(var10);
         } else {
            var8.n5(var9);
            var7.n5(var10);
         }

         float var13 = (float)((var10.l6() - var9.l6()) / (var1.z3() - var1.q0()));
         if (var1.c8().getMajorTickMark() != 2) {
            switch (var1.c8().getMajorTickMark()) {
               case 0:
                  var11 = true;
                  var12 = true;
                  break;
               case 1:
                  var11 = true;
               case 2:
               default:
                  break;
               case 3:
                  var12 = true;
            }

            float var14 = var9.l6();
            float var15 = var9.k5();
            float var16 = p4.n5(var1.k5().c8());

            while (
               var9.l6() <= var14 && var14 <= var10.l6()
                  || var9.l6() >= var14 && var14 >= var10.l6()
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var9.l6())
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var10.l6())
            ) {
               if (var11) {
                  com.aspose.slides.internal.x4g.s7 var17 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var17.l6(var14, var15 - var16, var14, var15);
                     var1.n5(var17, 0.0F, var6);
                  } finally {
                     if (var17 != null) {
                        var17.dispose();
                     }
                  }
               }

               if (var12) {
                  com.aspose.slides.internal.x4g.s7 var48 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var48.l6(var14, var15, var14, var15 + var16);
                     var1.n5(var48, 0.0F, var6);
                  } finally {
                     if (var48 != null) {
                        var48.dispose();
                     }
                  }
               }

               var14 += var13 * (float)var1.w1();
            }
         }

         if (var1.c8().getMinorTickMark() != 2) {
            var11 = false;
            var12 = false;
            switch (var1.c8().getMinorTickMark()) {
               case 0:
                  var11 = true;
                  var12 = true;
                  break;
               case 1:
                  var11 = true;
               case 2:
               default:
                  break;
               case 3:
                  var12 = true;
            }

            float var45 = var9.l6();
            float var46 = var9.k5();
            float var47 = p4.l6(var1.k5().c8());

            while (
               var9.l6() <= var45 && var45 <= var10.l6()
                  || var9.l6() >= var45 && var45 >= var10.l6()
                  || com.aspose.slides.ms.System.q1.u3(var45) == com.aspose.slides.ms.System.q1.u3(var9.l6())
                  || com.aspose.slides.ms.System.q1.u3(var45) == com.aspose.slides.ms.System.q1.u3(var10.l6())
            ) {
               if (var11) {
                  com.aspose.slides.internal.x4g.s7 var49 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var49.l6(var45, var46 - var47, var45, var46);
                     var1.n5(var49, 0.0F, var6);
                  } finally {
                     if (var49 != null) {
                        var49.dispose();
                     }
                  }
               }

               if (var12) {
                  com.aspose.slides.internal.x4g.s7 var50 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var50.l6(var45, var46, var45, var46 + var47);
                     var1.n5(var50, 0.0F, var6);
                  } finally {
                     if (var50 != null) {
                        var50.dispose();
                     }
                  }
               }

               var45 += var13 * (float)var1.j5();
            }
         }
      }
   }
}
