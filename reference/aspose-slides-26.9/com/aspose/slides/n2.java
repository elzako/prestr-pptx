package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class n2 {
   private final n1g n5;

   public n2(n1g var1) {
      this.n5 = var1;
   }

   final void n5(l5 var1) {
      IRotation3D var2 = this.n5.n3().getRotation3D();
      int var3 = var2.getRotationY() & 65535;
      float var4 = this.n5.e5().c8();
      var4 *= (var2.getDepthPercents() & 65535) / 100.0F;
      float var5 = var4 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var6 = var3 <= 180 ? var4 + var5 : 0.0F;
      if (!var2.getRightAngleAxes()) {
         var6 = 0.0F;
      }

      y9r var7 = this.n5.e5();
      com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(var7.l6(), var7.k5(), var7.u3(), var7.a6());
      com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();

      try {
         com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var8.x8(), var8.n3() - var8.k5());
         com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var8.x8(), var8.n3());
         var9.n5(var10.u3(), var11.u3());
         var1.n5(var9, 0.0F, var6);
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }

      com.aspose.slides.internal.o9b.w1 var38 = new com.aspose.slides.internal.o9b.w1(var8.x8(), var8.n3());
      g3y var39 = this.n5.y4().get_Item(0);
      t9z var12 = var39.c8().get_Item(0);
      String var13 = var12.u3();
      boolean var14 = false;
      float var15 = p4.n5(var1.k5().c8());
      float var16 = var38.l6() - var1.n5 - var15;
      List var17 = var1.h0;
      double var18 = var1.c8().isLogarithmic() ? var1.n5(var1.z3()) : var1.z3();
      double var20 = var1.c8().isLogarithmic() ? var1.n5(var1.q0()) : var1.q0();
      double var22 = var1.c8().isLogarithmic() ? var1.n5(var1.w1()) : var1.w1();

      for (int var24 = 0; var24 < var1.h0.size(); var24++) {
         double var25 = com.aspose.slides.internal.v6g.k5.u3(var1.h0.get_Item(var24), double.class);
         double var27 = var1.c8().isLogarithmic() ? var1.l6(var25) : var25;
         if (var24 - 1 > 0
            ? com.aspose.slides.ms.System.q1.n5(g6z.n5(var25, com.aspose.slides.internal.v6g.k5.u3(var17.get_Item(var24 - 1), double.class))) == var22
            : var24 + 1 >= var17.size()
               || com.aspose.slides.ms.System.q1.n5(g6z.n5(var25, com.aspose.slides.internal.v6g.k5.u3(var17.get_Item(var24 + 1), double.class))) == var22) {
            float var29 = (float)((var25 - var20) / (var18 - var20) * this.n5.e5().a6());
            float var30;
            if (!var1.c8().isPlotOrderReversed()) {
               var30 = var38.k5() - var29;
            } else {
               var30 = var38.k5() - var7.a6() + var29;
            }

            if (var1.c8().getTickLabelPosition() != 3) {
               if (ChartTypeCharacterizer.s7(
                  this.n5.n3().getType() != 73 ? this.n5.n3().getType() : this.n5.n3().getChartData().getSeries().get_Item(0).getType()
               )) {
                  var27 /= 100.0;
                  var13 = "0%";
               }

               var27 = var1.c8().isLogarithmic() ? var27 : var27 * p4.n5(var1);
               com.aspose.slides.internal.o9b.c8 var31 = var1.u3().o8();
               String var32;
               if (var1.n3()) {
                  var32 = t7k.n5(var27, var13, var14);
                  t7k.n5(var27, var13, var31.o8()).n5(var31);
               } else {
                  var32 = p4.n5(var27, var1);
                  t7k.n5(var27, var1.c8().getNumberFormat(), var31.o8()).n5(var31);
               }

               float var33 = var30 - var1.l6 / 2.0F;
               com.aspose.slides.internal.o9b.y1 var34 = new com.aspose.slides.internal.o9b.y1(var16, var33, var1.n5, var1.l6);
               j9e.n5(var34.y4(), var32, var1.u9(), var1.l6(), var31.o8(), 1, 2, this.n5, var6);
            }

            this.n5(var38.l6(), var30, var1, var6);
         }
      }

      this.n5(var38.l6(), var38.k5() - var7.a6(), var38.k5(), var1, var6);
   }

   final void l6(l5 var1) {
      if (var1.c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("CategoryAxisType.Date is not implemented");
      }

      int var2 = n1g.u3(this.n5.y4());
      IRotation3D var3 = this.n5.n3().getRotation3D();
      float var4 = var3.getRotationX();
      float var5 = this.n5.e5().c8();
      var5 *= (var3.getDepthPercents() & 65535) / 100.0F;
      float var6 = var5 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      y9r var7 = this.n5.e5();
      com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(var7.l6(), var7.k5(), var7.u3(), var7.a6());
      float var9 = var5 + var6;
      if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
         var9 = 0.0F;
      }

      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(this.n5.e5().l6(), this.n5.e5().k5());
      com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(this.n5.e5().l6() + this.n5.e5().u3(), this.n5.e5().k5());
      double var12 = this.n5.m1().e2();
      double var14 = this.n5.m1().t9();
      double var16 = this.n5.m1().z1();
      boolean var18 = this.n5.m1().q0() == this.n5.m1().t4();
      if (this.n5.m1().c8().isPlotOrderReversed()) {
         var16 = var12 - var16;
      } else {
         var16 -= var14;
      }

      int var19 = com.aspose.slides.internal.v6g.k5.u3(var16 / (var12 - var14) * this.n5.e5().a6(), 14);
      boolean var20 = var19 != 0;
      float var21 = this.n5.e5().k5();
      if (var1.c8().getTickLabelPosition() == 2) {
         var21 -= var19;
      }

      if (var4 >= 0.0F) {
         com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

         try {
            var22.l6(var7.l6(), var7.k5(), var7.l6() + var7.u3(), var7.k5());
            var1.n5(var22, 0.0F, var9);
         } finally {
            if (var22 != null) {
               var22.dispose();
            }
         }

         if (var20) {
            com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();

            try {
               var23.l6(var7.l6(), var7.k5() - var19, var7.l6() + var7.u3(), var7.k5() - var19);
               var1.n5(var23, 0.0F, var9);
            } finally {
               if (var23 != null) {
                  var23.dispose();
               }
            }
         }
      }

      if (var1.c8().getTickLabelPosition() == 2) {
         var10.l6(var10.k5() - var19);
         var11.l6(var11.k5() - var19);
      }

      List var70 = this.n5.l6();
      float var71 = var1.s7();
      if (var1.c8().getTickLabelPosition() != 3) {
         float var24 = var1.k5().c8();
         var71 += p4.n5(var24) + p4.l6(var24);
      }

      boolean var72 = var1.a0() || this.n5.n3().hasDataTable();
      int var25;
      if (var72) {
         var25 = var2;
      } else {
         var25 = var2 - 1;
         if (var25 == 0) {
            var25 = 1;
         }
      }

      com.aspose.slides.internal.o9b.w1 var26 = new com.aspose.slides.internal.o9b.w1(this.n5.e5().l6(), var21);
      float var27 = var8.s7() / var25;

      for (int var28 = 0; var28 < var2; var28++) {
         int var29 = var28;
         if (var1.c8().isPlotOrderReversed()) {
            var29 = var2 - 1 - var28;
         }

         String var30 = com.aspose.slides.ms.System.d1.n5;
         com.aspose.slides.internal.o9b.c8 var31 = var1.u3().o8();
         if (var29 < var1.h0.size()) {
            var30 = p4.n5(var1.h0.get_Item(var28), var1);
            t7k.n5(var1.h0.get_Item(var29), var1.c8().getNumberFormat(), var31.o8()).n5(var31);
            if (var1.n3() && var70.size() > 0) {
               String var32 = var29 < var70.size() ? ((x4)var70.get_Item(var29)).u9() : com.aspose.slides.ms.System.d1.n5;
               boolean var33 = var29 < var70.size() ? ((x4)var70.get_Item(var29)).a6() : false;
               var30 = t7k.n5(var1.h0.get_Item(var29), var32, var33);
               t7k.n5(var1.h0.get_Item(var29), var32, var31.o8()).n5(var31);
            }
         }

         if (var1.c8().getTickLabelPosition() != 3 && var29 % var1.r4() == 0) {
            com.aspose.slides.internal.o9b.y1 var74 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
            if (var4 >= 0.0F) {
               var74.k5(var27 < 0.0F ? var26.l6() + (var28 + 1) * var27 : var26.l6() + var28 * var27);
               if (!var72) {
                  var74.k5(var74.x8() - var27 / 2.0F);
               }

               var74.u3(var26.k5() + var71);
               var74.l6(com.aspose.slides.ms.System.q1.n5(var27));
               var74.n5(var1.k5);
            } else if (var4 < 0.0F && !var18 && var1.c8().getTickLabelPosition() == 2) {
               var74.k5(var27 > 0.0F ? var26.l6() + var28 * var27 : var26.l6() + (var28 + 1) * var27);
               var74.u3(var26.k5() - var1.k5 - var71);
               var74.l6(com.aspose.slides.ms.System.q1.n5(var27));
               var74.n5(var1.k5);
            }

            int var75 = var1.u9();
            if (var75 != 0) {
               com.aspose.slides.internal.o9b.w1 var34 = var74.u9().u3();
               com.aspose.slides.internal.o9b.f2 var35 = new com.aspose.slides.internal.o9b.f2();
               com.aspose.slides.internal.o9b.l6 var36 = new com.aspose.slides.internal.o9b.l6(1, 1);

               try {
                  com.aspose.slides.internal.o9b.z1 var37 = com.aspose.slides.internal.o9b.z1.n5(var36);

                  try {
                     com.aspose.slides.internal.o9b.e5 var38 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
                     var38.a6(3);
                     var37.n5(var30, var1.k5(), var34.u3(), new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())).l6(var35);
                  } finally {
                     if (var37 != null) {
                        var37.dispose();
                     }
                  }
               } finally {
                  if (var36 != null) {
                     var36.dispose();
                  }
               }

               double var41 = com.aspose.slides.ms.System.q1.n5(var75) / 180.0 * Math.PI;
               float var39 = (float)(var35.l6() * com.aspose.slides.ms.System.q1.c8(var41) + var35.k5() * com.aspose.slides.ms.System.q1.h0(var41));
               float var40 = var35.l6();
               float var43 = var35.k5();
               float var44 = var34.l6();
               float var45 = var34.k5();
               if (var1.c8().getPosition() == 0) {
                  if (var75 > 0) {
                     if (var75 == 90) {
                        var44 = var34.l6() + var39;
                        var45 = var34.k5() + (var35.l6() - var35.k5()) / 2.0F;
                     } else {
                        var44 = var34.l6() + var27 / 2.0F - var39;
                     }
                  } else if (var75 == 0) {
                     var44 = var34.l6() + var27 / 2.0F - var39 / 2.0F;
                  } else {
                     var44 = var34.l6() + var27 / 2.0F;
                  }
               }

               byte var46 = 1;
               if (var75 > 0) {
                  var46 = 2;
               } else if (var75 < 0) {
                  var46 = 0;
               }

               com.aspose.slides.internal.o9b.y1 var47 = new com.aspose.slides.internal.o9b.y1(
                  new com.aspose.slides.internal.o9b.w1(var44, var45), new com.aspose.slides.internal.o9b.f2(var40, var43)
               );
               j9e.n5(var47.y4(), var30, var75, var1.l6(), var31.o8(), var46, 2, this.n5, var9);
            } else {
               j9e.n5(
                  com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var74.y4())).y4(),
                  var30,
                  var75,
                  var1.l6(),
                  var31.o8(),
                  1,
                  2,
                  this.n5,
                  var9
               );
            }
         }
      }

      this.n5(var19, var2, var1, var9);
      com.aspose.slides.internal.o9b.w1 var73 = new com.aspose.slides.internal.o9b.w1(this.n5.e5().l6(), var21);
      if (var1.c8().n5().u9()) {
         this.l6(var1, var73.u3(), var27, var71, var9);
      } else {
         this.n5(var1, var73.u3(), var27, var71, var9);
      }
   }

   private void n5(l5 var1, com.aspose.slides.internal.o9b.w1 var2, float var3, float var4, float var5) {
      if (a6(var1)) {
         if (var1.c8().getTickLabelPosition() != 3) {
            List[] var6 = var1.d2().u3();
            float[] var7 = new float[var6.length];
            com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(1, 1);

            try {
               com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var8);

               try {
                  for (int var10 = 0; var10 < var6.length; var10++) {
                     List var11 = var6[var10];
                     if (var11 != null) {
                        float var12 = 0.0F;

                        for (int var13 = 0; var13 < var11.size(); var13++) {
                           int var14 = p4.n5((x4)var11.get_Item(var13));
                           float var15 = var3 * var14;
                           String var16 = ((x4)var11.get_Item(var13)).l6().toString();
                           com.aspose.slides.internal.o9b.f2 var17 = var9.n5(
                                 var16,
                                 var1.k5(),
                                 new com.aspose.slides.internal.o9b.f2(var15, Float.MAX_VALUE),
                                 new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())
                              )
                              .a6();
                           if (var17.k5() > var12) {
                              var12 = var17.k5();
                           }
                        }

                        var7[var10] = var12;
                     }
                  }
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            float var76 = var1.k5 + 2.0F * var4;
            float var77 = var2.k5();
            float var78 = var77 + var76;
            float var79 = var77;
            float var80 = var77;
            if (var1.c8().getMajorTickMark() != 2 && var1.c8().isVisible()) {
               var80 += u3(var1) + p4.l6(var1.k5().c8());
            }

            List var81 = new List();
            float var82 = 0.5F;

            for (int var83 = var6.length - 1; var83 >= 0; var83--) {
               List var85 = var6[var83];
               if (var85 != null && !var85.isEmpty()) {
                  float var18 = var7[var83];
                  List var19 = var85;
                  if (var1.c8().isPlotOrderReversed()) {
                     var19 = new List(var85);
                     var19.reverse();
                  }

                  float var20 = var78 + var18;
                  float var21 = var2.l6();

                  for (int var22 = 0; var22 < var19.size(); var22++) {
                     x4 var23 = (x4)var19.get_Item(var22);
                     int var24 = p4.n5(var23);
                     float var25 = var3 * var24;
                     String var26 = var23.l6().toString();
                     com.aspose.slides.internal.o9b.y1 var27 = new com.aspose.slides.internal.o9b.y1(var21, var78, var25, var18);
                     j9e.n5(
                        com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var27.y4())).y4(),
                        var26,
                        0,
                        var1.l6(),
                        var1.u3().o8(),
                        1,
                        2,
                        this.n5,
                        var5
                     );
                     var21 += var25;
                     if (var22 < var19.size() - 1) {
                        int var28 = -1;

                        for (int var29 = 0; var29 < var81.size(); var29++) {
                           if (com.aspose.slides.ms.System.q1.n5((Float)((KeyValuePair)var81.get_Item(var29)).getKey() - var21) < 0.5F) {
                              var28 = var29;
                              break;
                           }
                        }

                        if (var28 >= 0) {
                           if (var20 > (Float)((KeyValuePair)var81.get_Item(var28)).getValue()) {
                              var81.set_Item(var28, new KeyValuePair<>(((KeyValuePair)var81.get_Item(var28)).getKey(), var20));
                           }
                        } else {
                           var81.addItem(new KeyValuePair<>(var21, var20));
                        }
                     }
                  }

                  var79 = var20;
                  var78 += var18 + var4;
               }
            }

            List$Enumerator var84 = var81.iterator();

            try {
               while (var84.hasNext()) {
                  KeyValuePair var86 = (KeyValuePair)var84.next();
                  com.aspose.slides.internal.x4g.s7 var88 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var88.l6((Float)var86.getKey(), var80, (Float)var86.getKey(), (Float)var86.getValue());
                     var1.n5(var88, 0.0F, var5);
                  } finally {
                     if (var88 != null) {
                        var88.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var84, IDisposable.class)) {
                  var84.dispose();
               }
            }

            com.aspose.slides.internal.x4g.s7 var87 = new com.aspose.slides.internal.x4g.s7();

            try {
               var87.l6(var2.l6(), var80, var2.l6(), var79);
               var1.n5(var87, 0.0F, var5);
            } finally {
               if (var87 != null) {
                  var87.dispose();
               }
            }

            float var89 = var2.l6() + var3 * n1g.u3(this.n5.y4());
            com.aspose.slides.internal.x4g.s7 var90 = new com.aspose.slides.internal.x4g.s7();

            try {
               var90.l6(var89, var80, var89, var79);
               var1.n5(var90, 0.0F, var5);
            } finally {
               if (var90 != null) {
                  var90.dispose();
               }
            }
         }
      }
   }

   private void l6(l5 var1, com.aspose.slides.internal.o9b.w1 var2, float var3, float var4, float var5) {
      List[] var6 = var1.d2().u3();
      if (var6 != null && var6.length != 0) {
         if (var1.c8().n5().u9()) {
            float[] var7 = new float[var6.length];
            com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(1, 1);

            try {
               com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var8);

               try {
                  for (int var10 = 0; var10 < var6.length; var10++) {
                     List var11 = var6[var10];
                     if (var11 != null) {
                        float var12 = 0.0F;

                        for (int var13 = 0; var13 < var11.size(); var13++) {
                           com.aspose.slides.internal.o9b.f2 var14 = var9.n5(
                                 ((x4)var11.get_Item(var13)).l6().toString(),
                                 var1.k5(),
                                 new com.aspose.slides.internal.o9b.f2(var3, Float.MAX_VALUE),
                                 new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())
                              )
                              .a6();
                           if (var14.k5() > var12) {
                              var12 = var14.k5();
                           }
                        }

                        var7[var10] = var12;
                     }
                  }
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            float var24 = var2.k5() + var1.k5 + var4;

            for (int var25 = var6.length - 1; var25 >= 0; var25--) {
               List var26 = var6[var25];
               if (var26 != null && !var26.isEmpty()) {
                  float var27 = var7[var25];
                  List var28 = var26;
                  if (var1.c8().isPlotOrderReversed()) {
                     var28 = new List(var26);
                     var28.reverse();
                  }

                  int var29 = 0;

                  for (int var15 = 0; var15 < var28.size(); var15++) {
                     x4 var16 = (x4)var28.get_Item(var15);
                     com.aspose.slides.internal.o9b.y1 var17 = new com.aspose.slides.internal.o9b.y1(var2.l6() + var29 * var3, var24, var3, var27);
                     j9e.n5(
                        com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var17.y4())).y4(),
                        var16.l6().toString(),
                        0,
                        var1.l6(),
                        var1.u3().o8(),
                        1,
                        2,
                        this.n5,
                        var5
                     );
                     var29 += p4.n5(var16);
                  }

                  var24 += var27;
               }
            }
         }
      }
   }

   final void k5(l5 var1) {
      double var2 = this.n5.m1().e2();
      double var4 = this.n5.m1().t9();
      double var6 = this.n5.m1().z1();
      if (this.n5.m1().c8().isPlotOrderReversed()) {
         var6 = var2 - var6;
      } else {
         var6 -= var4;
      }

      int var8 = com.aspose.slides.internal.v6g.k5.u3(var6 / (var2 - var4) * this.n5.e5().a6(), 14);
      boolean var9 = var8 != 0;
      IRotation3D var10 = this.n5.n3().getRotation3D();
      float var11 = var10.getRotationY() & 65535;
      float var12 = this.n5.e5().l6() + this.n5.e5().u3();
      float var13 = this.n5.e5().k5();
      float var14 = var1.s7();
      if (var11 > 180.0F) {
         var12 = this.n5.e5().l6() - var1.n5 - var14;
      }

      if (var1.c8().getTickLabelPosition() == 2) {
         var13 -= var8;
      }

      float var15 = (var10.getDepthPercents() & 65535) / 100.0F;
      float var16 = (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var17 = this.n5.e5().h0() * var15 / (1.0F + var16);
      float var18 = var17 * var16;
      float var19 = var17 + var18;
      boolean var20 = u6p.l6(this.n5.n3());
      if (var20) {
         y9r var21 = this.n5.e5();
         com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

         try {
            var22.l6(var21.l6() + var21.u3(), var21.k5(), var21.l6() + var21.u3(), var21.k5() + 1.0F);
            if (var9) {
               var22.n3();
               var22.l6(var21.l6() + var21.u3(), var21.k5() - var8, var21.l6() + var21.u3(), var21.k5() + 1.0F - var8);
               var22.n3();
            }

            if (var10.getRightAngleAxes()) {
               var1.n5(var22, var19, var19);
            } else {
               var1.n5(var22, var19, 0.0F);
            }
         } finally {
            if (var22 != null) {
               var22.dispose();
            }
         }
      }

      float var30;
      if (!var20) {
         var30 = var19 / var1.h0.size();
      } else {
         var30 = var19 / (var1.h0.size() - 1);
      }

      for (int var31 = 0; var31 < var1.h0.size(); var31++) {
         float var23;
         if (!var20) {
            var23 = var30 / 2.0F + var30 * var31 - var1.l6 / 2.0F;
            if (!var10.getRightAngleAxes()) {
               var23 = -(var30 / 2.0F + var30 * (var1.h0.size() - 1 - var31));
            }
         } else {
            var23 = var30 * var31 - var1.l6 / 2.0F;
            if (!var10.getRightAngleAxes()) {
               var23 = var30 * var31 - var1.l6 / 2.0F - var19;
            }
         }

         if (var11 > 180.0F) {
            var23 = var30 * (var31 + 1);
         }

         int var24 = var31;
         if (!var1.c8().isPlotOrderReversed()) {
            var24 = var1.h0.size() - 1 - var31;
         }

         String var25 = p4.n5(var1.h0.get_Item(var24), var1);
         if (var1.c8().getTickLabelPosition() != 3 && var24 % var1.r4() == 0) {
            com.aspose.slides.internal.o9b.y1 var26 = new com.aspose.slides.internal.o9b.y1(var12, var13, var1.n5, var1.l6);
            j9e.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var26.y4())).y4(),
               var25,
               var1.u9(),
               var1.l6(),
               var1.u3().o8(),
               1,
               2,
               this.n5,
               var23
            );
         }
      }
   }

   private void n5(float var1, float var2, l5 var3, float var4) {
      if (var3.c8().getMajorTickMark() != 2 && var3.c8().isVisible()) {
         n1g var5 = var3.d2();
         boolean var6 = false;
         boolean var7 = false;
         switch (var3.c8().getMajorTickMark()) {
            case 0:
               var6 = true;
               var7 = true;
               break;
            case 1:
               var6 = true;
               if (var1 > var5.e5().u9()) {
                  var6 = false;
                  var7 = true;
               }
            case 2:
            default:
               break;
            case 3:
               var7 = true;
               if (var1 > var5.e5().u9()) {
                  var7 = false;
                  var6 = true;
               }
         }

         float var8 = p4.n5(var3.k5().c8());
         if (var6) {
            com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();

            try {
               var9.l6(var1, var2, var1 + var8, var2);
               var3.n5(var9, 0.0F, var4);
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         }

         if (var7) {
            com.aspose.slides.internal.x4g.s7 var18 = new com.aspose.slides.internal.x4g.s7();

            try {
               var18.l6(var1 - var8, var2, var1, var2);
               var3.n5(var18, 0.0F, var4);
            } finally {
               if (var18 != null) {
                  var18.dispose();
               }
            }
         }
      }
   }

   private void n5(float var1, float var2, float var3, l5 var4, float var5) {
      if (var4.c8().getMinorTickMark() != 2 && var4.c8().isVisible()) {
         n1g var6 = var4.d2();
         boolean var7 = false;
         boolean var8 = false;
         switch (var4.c8().getMinorTickMark()) {
            case 0:
               var7 = true;
               var8 = true;
               break;
            case 1:
               var7 = true;
               if (var1 > var6.e5().u9()) {
                  var7 = false;
                  var8 = true;
               }
            case 2:
            default:
               break;
            case 3:
               var8 = true;
               if (var1 > var6.e5().u9()) {
                  var8 = false;
                  var7 = true;
               }
         }

         float var9 = (float)(var4.j5() / (var4.z3() - var4.q0()) * (var3 - var2));
         float var10;
         if (!var4.c8().isPlotOrderReversed()) {
            var10 = var3;
            var9 = -var9;
         } else {
            var10 = var2;
         }

         float var11 = var10;
         float var12 = p4.l6(var4.k5().c8());

         do {
            if (var7) {
               com.aspose.slides.internal.x4g.s7 var13 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var13.l6(var1, var11, var1 + var12, var11);
                  var4.n5(var13, 0.0F, var5);
               } finally {
                  if (var13 != null) {
                     var13.dispose();
                  }
               }
            }

            if (var8) {
               com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var22.l6(var1 - var12, var11, var1, var11);
                  var4.n5(var22, 0.0F, var5);
               } finally {
                  if (var22 != null) {
                     var22.dispose();
                  }
               }
            }

            var11 += var9;
         } while (var2 <= var11 && var11 <= var3);
      }
   }

   private void n5(int var1, int var2, l5 var3, float var4) {
      if (var3.y4() == 4) {
         throw new NotImplementedException("axisRenderContext.AxisType == ChartAxisType.Series");
      }

      n1g var5 = var3.d2();
      if ((var3.c8().getMajorTickMark() != 2 || var3.c8().getMinorTickMark() != 2) && var3.c8().isVisible()) {
         IRotation3D var6 = var5.n3().getRotation3D();
         float var7 = var6.getRotationX();
         float var8 = p4.n5(var3.k5().c8());
         float var9 = u3(var3);
         float var10 = p4.l6(var3.k5().c8());
         boolean var11 = var3.a0() || var3.d2().n3().hasDataTable();
         com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var5.e5().l6(), var5.e5().k5());
         int var13;
         if (var11) {
            var13 = var2;
         } else {
            var13 = var2 - 1;
            if (var13 == 0) {
               var13 = 1;
            }
         }

         if (var7 < 0.0F && var1 > 0) {
            var12.l6(var12.k5() - var1);
            var1 = 0;
         }

         new com.aspose.slides.internal.o9b.w1();
         new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var14;
         com.aspose.slides.internal.o9b.w1 var15;
         if (!var3.c8().isPlotOrderReversed()) {
            var14 = new com.aspose.slides.internal.o9b.w1(var5.e5().l6(), var5.e5().k5() - var1);
            var15 = new com.aspose.slides.internal.o9b.w1(var5.e5().l6() + var5.e5().u3(), var5.e5().k5() - var1);
         } else {
            var14 = new com.aspose.slides.internal.o9b.w1(var5.e5().l6(), var5.e5().k5() - var1);
            var15 = new com.aspose.slides.internal.o9b.w1(var5.e5().l6(), var5.e5().k5() - var1);
         }

         float var16 = (var15.l6() - var14.l6()) / var13;
         float var17 = (var15.k5() - var14.k5()) / var13;
         if (var16 != 0.0F || var17 != 0.0F) {
            while (var1 >= 0) {
               boolean var18 = false;
               boolean var19 = false;
               switch (var3.c8().getMajorTickMark()) {
                  case 0:
                     var18 = true;
                     var19 = true;
                     break;
                  case 1:
                     if (var7 >= 0.0F) {
                        var18 = true;
                     } else {
                        var19 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var7 >= 0.0F) {
                        var19 = true;
                     } else {
                        var18 = true;
                     }
               }

               float var20 = var14.l6();

               for (float var21 = var14.k5();
                  var14.l6() <= var20 && var20 <= var15.l6()
                     || var14.l6() >= var20 && var20 >= var15.l6()
                     || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var14.l6())
                     || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var15.l6());
                  var21 += var3.y2() * var17
               ) {
                  if (var18) {
                     com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var22.l6(var20, var21 - var8, var20, var21 + var9);
                        var3.n5(var22, 0.0F, var4);
                     } finally {
                        if (var22 != null) {
                           var22.dispose();
                        }
                     }
                  }

                  if (var19) {
                     com.aspose.slides.internal.x4g.s7 var75 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var75.l6(var20, var21, var20, var21 + var8 + var9);
                        var3.n5(var75, 0.0F, var4);
                     } finally {
                        if (var75 != null) {
                           var75.dispose();
                        }
                     }
                  }

                  var20 += var3.y2() * var16;
               }

               boolean var76 = false;
               boolean var23 = false;
               switch (var3.c8().getMinorTickMark()) {
                  case 0:
                     var76 = true;
                     var23 = true;
                     break;
                  case 1:
                     if (var7 >= 0.0F) {
                        var76 = true;
                     } else {
                        var23 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var7 >= 0.0F) {
                        var23 = true;
                     } else {
                        var76 = true;
                     }
               }

               var20 = var14.l6() + var3.y2() * var16 / 2.0F;

               for (float var73 = var14.k5() + var3.y2() * var17 / 2.0F;
                  var14.l6() <= var20 && var20 <= var15.l6()
                     || var14.l6() >= var20 && var20 >= var15.l6()
                     || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var14.l6())
                     || com.aspose.slides.ms.System.q1.u3(var20) == com.aspose.slides.ms.System.q1.u3(var15.l6());
                  var73 += var3.y2() * var17
               ) {
                  if (var76) {
                     com.aspose.slides.internal.x4g.s7 var24 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var24.l6(var20, var73 - var10, var20, var73);
                        var3.n5(var24, 0.0F, var4);
                     } finally {
                        if (var24 != null) {
                           var24.dispose();
                        }
                     }
                  }

                  if (var23) {
                     com.aspose.slides.internal.x4g.s7 var77 = new com.aspose.slides.internal.x4g.s7();

                     try {
                        var77.l6(var20, var73, var20, var73 + var10);
                        var3.n5(var77, 0.0F, var4);
                     } finally {
                        if (var77 != null) {
                           var77.dispose();
                        }
                     }
                  }

                  if (var3.c8().getMajorTickMark() == 2) {
                     var20 += var3.y2() * var16 / 2.0F;
                     var73 += var3.y2() * var17 / 2.0F;
                     if (var14.k5() <= var73 && var73 <= var15.k5()
                        || var14.k5() >= var73 && var73 >= var15.k5()
                        || com.aspose.slides.ms.System.q1.u3(var73) == com.aspose.slides.ms.System.q1.u3(var14.k5())
                        || com.aspose.slides.ms.System.q1.u3(var73) == com.aspose.slides.ms.System.q1.u3(var15.k5())) {
                        if (var76) {
                           com.aspose.slides.internal.x4g.s7 var78 = new com.aspose.slides.internal.x4g.s7();

                           try {
                              var78.l6(var20, var73 - var10, var20, var73);
                              var3.n5(var78, 0.0F, var4);
                           } finally {
                              if (var78 != null) {
                                 var78.dispose();
                              }
                           }
                        }

                        if (var23) {
                           com.aspose.slides.internal.x4g.s7 var79 = new com.aspose.slides.internal.x4g.s7();

                           try {
                              var79.l6(var20, var73, var20, var73 + var10);
                              var3.n5(var79, 0.0F, var4);
                           } finally {
                              if (var79 != null) {
                                 var79.dispose();
                              }
                           }
                        }
                     }

                     var20 -= var3.y2() * var16 / 2.0F;
                     var73 -= var3.y2() * var17 / 2.0F;
                  }

                  var20 += var3.y2() * var16;
               }

               if (var1 <= 0) {
                  break;
               }

               var12.l6(var12.k5() - var1);
               var1 = 0;
            }
         }
      }
   }

   static float u3(l5 var0) {
      if (!a6(var0)) {
         return 0.0F;
      }

      float var1 = var0.s7();
      if (var0.c8().getTickLabelPosition() != 3) {
         float var2 = var0.k5().c8();
         var1 += p4.n5(var2) + p4.l6(var2);
      }

      return var1 + var0.k5;
   }

   static boolean a6(l5 var0) {
      List[] var1 = var0.d2().u3();
      return var0.y4() != 4 && !var0.c8().n5().u9() && var1 != null && var1.length > 0;
   }
}
