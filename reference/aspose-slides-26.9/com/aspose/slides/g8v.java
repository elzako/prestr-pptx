package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g8v extends com.aspose.slides.internal.v6g.h0<g8v> {
   public g8v() {
   }

   static void n5(n1g var0) {
      if (var0.y4().size() != 0 && n1g.u3(var0.y4()) != 0) {
         List var1 = var0.y4();
         l5 var2 = var0.q0();
         l5 var3 = var0.m1();
         g6z.n5(var0.y4(), var0.y4().get_Item(0), var2, var3);
         boolean var4 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
         boolean var5 = a9k.n5(var0.n3().getType());
         g3y var6 = var0.y4().get_Item(0);
         com.aspose.slides.internal.o9b.y2 var7 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13) + 11,
            com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13) + 11,
            com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13) - 22,
            com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) - 22
         );
         com.aspose.slides.internal.o9b.y2[] var8 = new com.aspose.slides.internal.o9b.y2[]{var7};
         o9b.l6(var0, var8);
         var8[0].u3(var7);
         if (var0.n3().hasLegend()) {
            if (var0.n3().getType() != 30 && var0.n3().getType() != 27 && !var0.t2().n3()) {
               var8[0] = var7;
               z7d.n5(var8, var0);
               var8[0].u3(var7);
            } else {
               g3y var9 = var0.y4().get_Item(0);
               var8[0] = var7;
               z7d.n5(var9, var8, var0);
               var8[0].u3(var7);
            }
         }

         a9k.n5(var7.n3(), var4, var0);
         com.aspose.slides.internal.o9b.y2 var36 = new com.aspose.slides.internal.o9b.y2(var7.s7(), var7.x8(), var7.t2(), var7.l6());
         if (var2.c8() != null && var2.c8().hasTitle() && var2.c8().isVisible()) {
            var8[0] = var7;
            n5(var2, var36.n3(), var8, var4, var0);
            var8[0].u3(var7);
         }

         if (var3.c8() != null && var3.c8().hasTitle() && var3.c8().isVisible()) {
            if (com.aspose.slides.ms.System.n1.k5(var3.h0().u3())) {
               var3.h0().n5(90.0F);
            }

            var8[0] = var7;
            n5(var3, var36.n3(), var8, var4, var0);
            var8[0].u3(var7);
         }

         var8[0] = var7;
         q9o.n5(var8, var6);
         var8[0].u3(var7);
         var0.n5.n5 = new com.aspose.slides.internal.o9b.y2(var7.s7(), var7.x8(), var7.t2(), var7.l6());
         boolean var10 = com.aspose.slides.internal.v6g.k5.n5(var0.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
         if (!com.aspose.slides.internal.v6g.k5.n5(var0.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            var8[0] = var7;
            o9b.n5(var0, var8);
            var8[0].u3(var7);
         }

         var0.n5.n5 = new com.aspose.slides.internal.o9b.y2(var7.s7(), var7.x8(), var7.t2(), var7.l6());
         double var11 = 0.0;
         double var13 = 0.0;
         double[] var15 = new double[]{0.0};
         double[] var16 = new double[]{0.0};
         o9b.n5(var1, var15, var16, var3);
         var11 = var15[0];
         var13 = var16[0];
         boolean var17 = var3.c8() == null || var3.m3();
         boolean var18 = var3.c8() == null || var3.z8();
         o9b.n5(var13, var11, var3.h0, var0.n3().getType(), var7.n3(), var4, (g3y)var1.get_Item(0), var0.m1());
         o9b.n5(var2.h0, var7.n3(), var0.n3().getType(), var1, var4, var2);
         if (var5) {
            u9(var0);
         }

         if (!g6z.n5(var7.n3())) {
            var7.k5(var7.s7() + 2);
            var7.u3(var7.x8() + 2);
            var7.l6(var7.t2() - 4);
            var7.n5(var7.l6() - 4);
            a9k.n5(var7.n3(), var4, var0);
         }

         if (var0.m3().c8() != null && var5 && var0.m3().c8().hasTitle() && var0.m3().c8().isVisible()) {
            var8[0] = var7;
            n5(var0.m3(), var8, var0);
            var8[0].u3(var7);
         }

         int var19 = var0.p8() / 45;
         var8[0] = var7;
         l6(var0, var8, var19);
         var8[0].u3(var7);
         l5 var20 = var0.m3();
         int var21 = n1g.u3(var0.y4());
         com.aspose.slides.internal.o9b.p8 var22 = y9.n5(var20.h0, var7.n3(), var20).u3();
         int var23 = var20.x8() * com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) / 4000;
         if (!g6z.n5(var7.n3()) && var20.c8() != null && var20.c8().getTickLabelPosition() != 3 && var20.c8().isVisible()) {
            com.aspose.slides.internal.o9b.p8 var24 = new com.aspose.slides.internal.o9b.p8(0, 0);
            if (var20.h0() != null) {
               var20.h0().n5.n5.h0().k5(var24);
            }

            if (!var4) {
               com.aspose.slides.internal.o9b.w1[] var40 = u3(var0);
               byte var44 = 0;
               if (var40[0].k5() < var40[1].k5()) {
                  var44 = 1;
               }

               float var49 = com.aspose.slides.ms.System.q1.n5((var40[1].k5() - var40[0].k5()) / var21);
               int var28 = var22.k5() + var23;
               if (var0.s3() > 0) {
                  if (var40[0].k5() == var40[1].k5()) {
                     if (var7.n5() - var24.k5() - com.aspose.slides.internal.v6g.k5.u3(var40[0].k5(), 13) < var28) {
                        if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var7.n5(var7.l6() + (var28 - (var7.n5() - var24.k5() - com.aspose.slides.internal.v6g.k5.u3(var40[0].k5(), 13))));
                        } else {
                           var7.n5(var7.l6() - (var28 - (var7.n5() - var24.k5() - com.aspose.slides.internal.v6g.k5.u3(var40[0].k5(), 13))));
                        }
                     }
                  } else {
                     com.aspose.slides.internal.o9b.p8 var29 = var22.u3();
                     if (var0.q0().c8().getTickLabelPosition() != 3) {
                        var29.n5(var29.l6() + var23);
                     }

                     int var30 = var24.l6() + n5(var0, var29.u3());
                     switch (var19) {
                        case 0:
                        case 4:
                        case 8:
                           if (var7.u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var40[0].l6() + var40[1].l6()), 13) / 2
                              < var30) {
                              int var66 = var30
                                 - (var7.u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var40[0].l6() + var40[1].l6()), 13) / 2);
                              if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                                 var7.l6(var7.t2() + var66);
                              } else {
                                 var7.l6(var7.t2() - var66);
                              }
                           }
                        case 1:
                        case 2:
                        case 5:
                        case 6:
                        default:
                           break;
                        case 3:
                        case 7:
                           if (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var40[0].l6() + var40[1].l6()), 13) / 2 - var7.s7()
                              < var30) {
                              int var31 = var30
                                 - (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var40[0].l6() + var40[1].l6()), 13) / 2 - var7.s7());
                              if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                                 var7.k5(var7.s7() - var31);
                                 var7.l6(var7.t2() + var31);
                              } else {
                                 var7.k5(var7.s7() + var31);
                                 var7.l6(var7.t2() - var31);
                              }
                           }
                     }

                     float var67 = var49 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
                     if (com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var40[var44].k5() + var67, 13) < var22.k5()) {
                        if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var7.n5(var7.l6() + (var22.k5() - com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var40[var44].k5() + var67, 13)));
                        } else {
                           var7.n5(var7.l6() - (var22.k5() - com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var40[var44].k5() + var67, 13)));
                        }
                     }
                  }
               }
            } else {
               com.aspose.slides.internal.o9b.w1 var25 = a6(var0).u3();
               int var26 = var22.l6() + var23;
               int var27 = com.aspose.slides.internal.v6g.k5.u3(var25.l6() - var7.s7(), 13);
               if (var27 < var26) {
                  if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var7.k5(var7.s7() - var26);
                     var7.l6(var7.t2() + var26);
                  } else {
                     var7.k5(var7.s7() + var26);
                     var7.l6(var7.t2() - var26);
                  }
               }
            }

            if (var10 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
               a9k.n5(var7.n3(), false, var0);
            }
         }

         com.aspose.slides.internal.o9b.p8 var39 = p4.n5(var3, (g3y)var1.get_Item(0), var4).u3();
         var3.n5(var39.u3());
         if (var3.c8() != null && !g6z.n5(var7.n3()) && var3.c8().getTickLabelPosition() != 3 && var3.c8().isVisible()) {
            if (!var4) {
               com.aspose.slides.internal.o9b.w1 var42 = a6(var0).u3();
               if (var42.l6() < var0.e5().u9()) {
                  int var46 = com.aspose.slides.internal.v6g.k5.u3(var42.l6() - var7.s7(), 13);
                  if (var3.h0() != null) {
                     var46 -= var3.h0().n5.n5.h0().l6();
                  }

                  int var50 = var39.l6();
                  if (var0.n3().hasDataTable()) {
                     var50 -= var0.s7().u9().l6();
                  }

                  if (var46 < var50) {
                     if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                        var7.k5(var7.s7() - var50);
                        var7.l6(var7.t2() + var50);
                     } else {
                        var7.k5(var7.s7() + var50);
                        var7.l6(var7.t2() - var50);
                     }
                  }
               } else {
                  int var47 = com.aspose.slides.internal.v6g.k5.u3(var7.u9() - var42.l6(), 13);
                  if (var47 < var39.l6()) {
                     if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                        var7.l6(var7.t2() + var39.l6());
                     } else {
                        var7.l6(var7.t2() - var39.l6());
                     }
                  }
               }

               if (var0.s3() >= 0) {
                  switch (var19) {
                     case 1:
                     case 2:
                     case 5:
                     case 6:
                        if (var7.n5() - var42.k5() < var39.k5() / 2) {
                           if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                              var7.n5(var7.l6() + var39.k5() / 2);
                           } else {
                              var7.n5(var7.l6() - var39.k5() / 2);
                           }
                        }
                     case 3:
                     case 4:
                  }
               } else {
                  if (var42.k5() - var0.e5().a6() - var7.x8() < var39.k5() / 2) {
                     if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                        var7.u3(var7.x8() - var39.k5() / 2);
                     } else {
                        var7.u3(var7.x8() + var39.k5() / 2);
                     }
                  }

                  if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var7.n5(var7.l6() + var39.k5() / 2);
                  } else {
                     var7.n5(var7.l6() - var39.k5() / 2);
                  }
               }
            } else {
               com.aspose.slides.internal.o9b.w1[] var41 = k5(var0);
               int var45 = var39.k5();
               if (var7.n5() - com.aspose.slides.internal.v6g.k5.u3(var41[0].k5(), 13) < var45) {
                  if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var7.n5(var7.l6() + (var45 - (var7.n5() - com.aspose.slides.internal.v6g.k5.u3(var41[0].k5(), 13))));
                  } else if ((!ChartTypeCharacterizer.isBar3DChart(var0.n3().getType()) || !var2.c8().isPlotOrderReversed()) && var2.c8().getCrossType() != 1) {
                     var7.n5(var7.l6() - (var45 - (var7.n5() - com.aspose.slides.internal.v6g.k5.u3(var41[0].k5(), 13))));
                  } else {
                     var7.n5(var7.l6() - (var45 - (var7.n5() - com.aspose.slides.internal.v6g.k5.u3(var41[0].k5(), 13))));
                     var7.u3(var7.x8() + var45);
                  }
               }
            }

            if (var10 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
               a9k.n5(var7.n3(), var4, var0);
            }
         }

         com.aspose.slides.internal.o9b.p8 var43 = p4.n5(var2, var7.n3(), var21, var4, (g3y)var1.get_Item(0)).u3();
         var2.n5(var43.u3());
         float var48 = var2.c8() != null ? var2.k5().c8() : 0.0F;
         int var51 = com.aspose.slides.internal.v6g.k5.u3(var2.s7() + p4.n5(var48) + p4.l6(var48) + 0.5, 14);
         if (var0.u3() != null) {
            var51 += var51 * var0.u3().length;
         }

         if (var2.c8() != null && !g6z.n5(var7.n3()) && var2.c8().getTickLabelPosition() != 3 && var2.c8().isVisible()) {
            com.aspose.slides.internal.o9b.p8 var52 = new com.aspose.slides.internal.o9b.p8(0, 0);
            if (var2.c8() != null && var2.c8().hasTitle()) {
               var2.h0().n5.n5.h0().k5(var52);
            }

            if (!var4) {
               com.aspose.slides.internal.o9b.w1[] var58 = k5(var0);
               byte var64 = 0;
               if (var58[0].k5() < var58[1].k5()) {
                  var64 = 1;
               }

               float var69 = com.aspose.slides.ms.System.q1.n5((var58[1].k5() - var58[0].k5()) / var21);
               int var32 = var43.k5() + var51;
               if (var0.s3() >= 0) {
                  if (var58[0].k5() == var58[1].k5()) {
                     if (var7.n5() - var52.k5() - com.aspose.slides.internal.v6g.k5.u3(var58[0].k5(), 13) < var32) {
                        if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var7.n5(var7.l6() + (var32 - (var7.n5() - var52.k5() - com.aspose.slides.internal.v6g.k5.u3(var58[0].k5(), 13))));
                        } else {
                           var7.n5(var7.l6() - (var32 - (var7.n5() - var52.k5() - com.aspose.slides.internal.v6g.k5.u3(var58[0].k5(), 13))));
                        }
                     }
                  } else {
                     com.aspose.slides.internal.o9b.p8 var33 = var43.u3();
                     if (var2.c8().getTickLabelPosition() != 3) {
                        var33.n5(var33.l6() + var51);
                     }

                     int var34 = var52.l6() + n5(var0, var33.u3());
                     switch (var19) {
                        case 1:
                        case 5:
                           if (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var58[0].l6() + var58[1].l6()), 13) / 2 - var7.s7()
                              < var34) {
                              int var70 = var34
                                 - (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var58[0].l6() + var58[1].l6()), 13) / 2 - var7.s7());
                              if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                                 var7.k5(var7.s7() - var70);
                                 var7.l6(var7.t2() + var70);
                              } else {
                                 var7.k5(var7.s7() + var70);
                                 var7.l6(var7.t2() - var70);
                              }
                           }
                           break;
                        case 2:
                        case 6:
                           if (var7.u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var58[0].l6() + var58[1].l6()), 13) / 2
                              < var34) {
                              int var35 = var34
                                 - (var7.u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var58[0].l6() + var58[1].l6()), 13) / 2);
                              if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                                 var7.l6(var7.t2() + var35);
                              } else {
                                 var7.l6(var7.t2() - var35);
                              }
                           }
                        case 3:
                        case 4:
                     }

                     float var71 = var69 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
                     if (com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var58[var64].k5() + var71, 13) < var43.k5()) {
                        if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var7.n5(var7.l6() + (var43.k5() - com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var58[var64].k5() + var71, 13)));
                        } else {
                           var7.n5(var7.l6() - (var43.k5() - com.aspose.slides.internal.v6g.k5.u3(var7.n5() - var58[var64].k5() + var71, 13)));
                        }
                     }
                  }
               }
            } else {
               com.aspose.slides.internal.o9b.w1 var57 = a6(var0).u3();
               int var63 = var43.l6() + var51;
               int var68 = com.aspose.slides.internal.v6g.k5.u3(var57.l6() - var7.s7(), 13);
               if (var68 < var63) {
                  if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var7.k5(var7.s7() - var63);
                     var7.l6(var7.t2() + var63);
                  } else {
                     var7.k5(var7.s7() + var63);
                     var7.l6(var7.t2() - var63);
                  }
               }
            }

            if (var10 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
               a9k.n5(var7.n3(), var4, var0);
            }
         }

         var8[0] = var7;
         n5(var0, var8, var19);
         var8[0].u3(var7);
         if (var3.c8() != null && var3.c8().isVisible()) {
            float var53 = o9b.n5(var4, var0.y4().get_Item(0), var7.n3(), var0.m1());
            int var59 = 0;
            if (var4) {
               var59 = g6z.n5(var0.e5().u3());
            } else {
               var59 = g6z.n5(var0.e5().a6());
            }

            if (var17 && var3.h0.size() > 3 && var53 > var59 && var59 != 0) {
               var3.h0.clear();
               var3.k5(var17);
               var3.u3(var18);
               if (var17) {
                  var3.h0(0.0);
               }

               if (var18) {
                  var3.u9(0.0);
               }

               o9b.n5(var13, var11, var3.h0, var0.y4().get_Item(0).u9().getType(), var7.n3(), var4, var0.y4().get_Item(0), var3);
            }
         }

         if (!var10 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
            com.aspose.slides.internal.o9b.y2 var54 = new com.aspose.slides.internal.o9b.y2(var7.s7(), var7.x8(), var7.t2(), var7.l6());
            var7 = new com.aspose.slides.internal.o9b.y2(var0.n5.n5.s7(), var0.n5.n5.x8(), var0.n5.n5.t2(), var0.n5.n5.l6());
            var0.n5.n5 = new com.aspose.slides.internal.o9b.y2(var54.s7(), var54.x8(), var54.t2(), var54.l6());
         }

         if (var2.c8() != null && var2.c8().hasTitle() && var2.c8().isVisible()) {
            n5(var2, var7.n3(), var4, var39.u3(), var43.u3(), var51);
         }

         if (var3.c8() != null && var3.c8().hasTitle() && var3.c8().isVisible()) {
            n5(var3, var7.n3(), var4, var39.u3(), var43.u3(), var51);
         }

         if (var0.m3().c8() != null && var0.m3().c8().hasTitle() && var0.m3().c8().isVisible()) {
            com.aspose.slides.internal.o9b.p8 var55 = var22.u3();
            if (var0.m3().c8().getTickLabelPosition() != 3) {
               var55.n5(var55.l6() + var23);
            }

            com.aspose.slides.internal.o9b.w1[] var61 = u3(var0);
            b9y var65 = var0.m3().h0();
            if (var61[0].k5() == var61[1].k5()) {
               if (var0.s3() >= 0) {
                  var65.n5.n5.k5(com.aspose.slides.internal.v6g.k5.u3((var61[0].l6() + var61[1].l6()) / 2.0 - var65.n5.n5.t2() / 2.0, 13));
               }
            } else {
               switch (var19) {
                  case 0:
                  case 4:
                  case 8:
                     var65.n5
                        .n5
                        .k5(
                           com.aspose.slides.internal.v6g.k5.u3(
                              com.aspose.slides.ms.System.q1.n5(var61[0].l6() + var61[1].l6()) / 2.0F + n5(var0, var55.u3()), 13
                           )
                        );
                  case 1:
                  case 2:
                  case 5:
                  case 6:
                  default:
                     break;
                  case 3:
                  case 7:
                     var65.n5
                        .n5
                        .k5(
                           com.aspose.slides.internal.v6g.k5.u3(
                              com.aspose.slides.ms.System.q1.n5(var61[0].l6() + var61[1].l6()) / 2.0F - var65.n5.n5.t2() - n5(var0, var55.u3()), 13
                           )
                        );
               }

               var65.n5.n5.u3(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var61[0].k5() + var61[1].k5()) / 2.0F, 13));
            }
         }

         if (var0.n3().hasDataTable() && !var4) {
            com.aspose.slides.internal.o9b.w1[] var56 = k5(var0);
            if (var0.s3() > 0) {
               switch (var19) {
                  case 0:
                  case 3:
                  case 4:
                  case 7:
                  case 8:
                     int var62 = var56[0].l6() < var56[1].l6() ? 0 : 1;
                     var0.s7().n5.k5(com.aspose.slides.internal.v6g.k5.u3(var56[var62].l6(), 13));
                     var0.s7().n5.u3(com.aspose.slides.internal.v6g.k5.u3(var56[var62].k5(), 13));
                     var0.s7().n5.l6(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var56[1].l6() - var56[0].l6()), 13));
                  case 1:
                  case 2:
                  case 5:
                  case 6:
               }
            }
         }
      }
   }

   private static void n5(n1g var0, com.aspose.slides.internal.o9b.y2[] var1, int var2) {
      boolean var3 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
      boolean var4 = com.aspose.slides.internal.v6g.k5.n5(var0.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      a8e var5 = var0.s7();
      if (!g6z.n5(var1[0].n3()) && var0.n3().hasDataTable()) {
         int var6 = u4k.n5(var1[0].n3(), var0);
         if (var6 > var5.c8()) {
            var5.n5(var6);
            int var7 = var6 - var5.c8();
            var5.n5.n5(var5.n5.l6() + var7);
            if (var0.s3() > 0 && !var3) {
               switch (var2) {
                  case 0:
                  case 3:
                  case 4:
                  case 7:
                  case 8:
                     if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                        var1[0].n5(var1[0].l6() + var7 + 2);
                        break;
                     }

                     var1[0].n5(var1[0].l6() - (var7 + 2));
                     break;
                  case 1:
                  case 2:
                  case 5:
                  case 6:
                     if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                        var5.n5.u3(var5.n5.x8() + var7);
                        var1[0].n5(var1[0].l6() + var7);
                     } else {
                        var1[0].n5(var1[0].l6() - var7);
                        var5.n5.u3(var5.n5.x8() - var7);
                     }
               }
            } else if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
               var5.n5.u3(var5.n5.x8() + var7);
               var1[0].n5(var1[0].l6() + var7);
            } else {
               var1[0].n5(var1[0].l6() - var7);
               var5.n5.u3(var5.n5.x8() - var7);
            }

            if (var4 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
               a9k.n5(var1[0].n3(), var3, var0);
            }
         }
      }
   }

   private static void l6(n1g var0, com.aspose.slides.internal.o9b.y2[] var1, int var2) {
      boolean var3 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
      boolean var4 = com.aspose.slides.internal.v6g.k5.n5(var0.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      a8e var5 = var0.s7();
      if (!g6z.n5(var1[0].n3()) && var0.n3().hasDataTable()) {
         com.aspose.slides.internal.o9b.p8 var6 = u4k.n5(var0).u3();
         var5.n5(var6.u3());
         int var7 = u4k.n5(var1[0].n3(), var0);
         var5.n5(var7);
         int var8 = var6.k5() + var7;
         var5.n5.n5(var8);
         if (var0.s3() > 0 && !var3) {
            switch (var2) {
               case 0:
               case 3:
               case 4:
               case 7:
               case 8:
                  if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var1[0].n5(var1[0].l6() + var8 + 2);
                     var1[0].k5(var1[0].s7() - var6.l6());
                     var1[0].l6(var1[0].t2() + var6.l6());
                     break;
                  }

                  var1[0].n5(var1[0].l6() - (var8 + 2));
                  var1[0].k5(var1[0].s7() + var6.l6());
                  var1[0].l6(var1[0].t2() - var6.l6());
                  break;
               case 1:
               case 2:
               case 5:
               case 6:
                  if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var5.n5.k5(var1[0].s7() + var6.l6());
                     var5.n5.u3(var1[0].n5());
                     var5.n5.l6(var1[0].t2() - var6.l6());
                     var1[0].n5(var1[0].l6() + var8);
                  } else {
                     var1[0].n5(var1[0].l6() - var8);
                     var5.n5.k5(var1[0].s7() + var6.l6());
                     var5.n5.u3(var1[0].n5());
                     var5.n5.l6(var1[0].t2() - var6.l6());
                  }
            }
         } else if (!var4 && var0.n3().getPlotArea().getLayoutTargetType() == 0) {
            var5.n5.k5(var1[0].s7() + var6.l6());
            var5.n5.u3(var1[0].n5());
            var5.n5.l6(var1[0].t2() - var6.l6());
            var1[0].n5(var1[0].l6() + var8);
         } else {
            var1[0].n5(var1[0].l6() - var8);
            var5.n5.k5(var1[0].s7() + var6.l6());
            var5.n5.u3(var1[0].n5());
            var5.n5.l6(var1[0].t2() - var6.l6());
         }

         if (var4 || var0.n3().getPlotArea().getLayoutTargetType() == 1) {
            a9k.n5(var1[0].n3(), var3, var0);
         }
      }
   }

   static void l6(n1g var0) {
      n5(var0);
      var0.n5(false);
      var0.v4();
      if (var0.y4().size() != 0 && n1g.u3(var0.y4()) != 0) {
         boolean var1 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
         int var2 = n1g.u3(var0.y4());
         float var3 = o9b.n5(
            com.aspose.slides.internal.v6g.k5.u3(var0.e5().l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var0.e5().u3(), 13), var1, var0.m1()
         );
         double var4 = var0.m1().t4();
         float var6 = o9b.n5(
            com.aspose.slides.internal.v6g.k5.u3(var0.e5().k5() - var0.e5().a6(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var0.e5().a6(), 13),
            var1,
            var0.m1()
         );
         var0.n5.n5();
         com.aspose.slides.internal.o9b.y2 var7 = var0.n5.n5.n3();
         a9k.n5(var1, var0);
         g3y var8 = var0.y4().get_Item(0);
         switch (var0.n3().getType()) {
            case 3:
            case 7:
            case 11:
            case 15:
               d0c.n5(var6, var4, var2, var0);
               break;
            case 4:
            case 8:
            case 12:
            case 16:
               d0c.n5(var4, var2, var0);
               break;
            case 5:
            case 9:
            case 13:
            case 17:
               d0c.l6(var4, var2, var0);
               break;
            case 6:
            case 10:
            case 14:
            case 18:
               d0c.l6(var6, var4, var2, var0);
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 34:
            case 35:
            case 47:
            case 48:
            case 49:
            default:
               break;
            case 25:
               d0c.k5(var6, var4, var2, var0);
               break;
            case 27:
            case 30:
               q9o.n5(var0);
               break;
            case 33:
            case 38:
            case 41:
            case 44:
               t6.n5(var3, var4, var2, var0);
               break;
            case 36:
            case 39:
            case 42:
            case 45:
               t6.n5(var4, var2, var0);
               break;
            case 37:
            case 40:
            case 43:
            case 46:
               t6.l6(var4, var2, var0);
               break;
            case 50:
               v3.n5(var6, var4, var2, var0);
               break;
            case 51:
               v3.n5(var6, var4, var2, false, var0);
               break;
            case 52:
               v3.n5(var6, var4, var2, true, var0);
         }

         if (var0.m1().c8() != null && var0.m1().c8().isVisible()) {
            if (var1) {
               y9.n5(var0.m1());
            } else {
               y9.n5(var0.m1(), var0);
            }
         }

         if (var0.q0().c8() != null && var0.q0().c8().isVisible()) {
            if (var1) {
               y9.n5(var2, var7.n3(), var0.q0(), var0);
            } else {
               y9.n5(var2, var7.n3(), var1, var0.q0(), var0);
            }
         }

         if (var0.m3().c8() != null && var0.m3().c8().isVisible()) {
            y9.l6(var0.m3(), var0);
         }

         if (var0.m1().c8() != null && var0.m1().c8().hasTitle() && var0.m1().c8().isVisible()) {
            n5(var0, var0.m1());
         }

         if (var0.q0().c8() != null && var0.q0().c8().hasTitle() && var0.q0().c8().isVisible()) {
            n5(var0, var0.q0());
         }

         if (var0.m3().c8() != null && var0.m3().c8().hasTitle() && var0.m3().c8().isVisible()) {
            n5(var0, var0.m3());
         }

         if (var0.n3().hasTitle()) {
            var0.x8().n5(var0);
         }

         if (var0.n3().hasDataTable()) {
            a8e var9 = var0.s7();
            u4k.n5(var9.n5.s7(), var9.n5.x8(), var9.n5.t2(), var1, var0);
         }

         if (var0.n3().hasLegend()) {
            if (var0.n3().getType() != 30 && var0.n3().getType() != 27 && !var0.t2().n3()) {
               z7d.n5(var1, var8, var0, (Legend)var0.n3().getLegend());
            } else {
               z7d.n5(var8, var0, (Legend)var0.n3().getLegend(), var0.y4().get_Item(0));
            }
         }

         var0.n5(true);
      }
   }

   static com.aspose.slides.internal.o9b.w1[] k5(n1g var0) {
      com.aspose.slides.internal.o9b.w1 var1 = new com.aspose.slides.internal.o9b.w1(var0.e5().u9(), var0.e5().k5());
      int var2 = var0.p8() % 90;
      if (var2 >= 45) {
         var2 = 90 - var2;
      }

      int var3 = var0.p8() / 45;
      float var4;
      float var5;
      switch (var3) {
         case 0:
         case 3:
         case 4:
         case 7:
         case 8:
            var4 = var0.e5().u3();
            var5 = var0.e5().h0();
            break;
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            var4 = var0.e5().h0();
            var5 = var0.e5().u3();
      }

      float var6 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var2 * Math.PI / 180.0);
      float var7 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
      com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      switch (var3) {
         case 0:
         case 8:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[0].l6() + var6);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[0].n5(var9[0]);
            var8[1].n5(var9[1]);
            var8[3].n5(var9[2]);
            var8[2].n5(var9[3]);
            break;
         case 1:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[0].n5(var9[0]);
            var8[1].n5(var9[1]);
            var8[3].n5(var9[2]);
            var8[2].n5(var9[3]);
            break;
         case 2:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[3].n5(var9[0]);
            var8[2].n5(var9[1]);
            var8[0].n5(var9[2]);
            var8[1].n5(var9[3]);
            break;
         case 3:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[3].n5(var9[0]);
            var8[2].n5(var9[1]);
            var8[0].n5(var9[2]);
            var8[1].n5(var9[3]);
            break;
         case 4:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[3].n5(var9[0]);
            var8[2].n5(var9[1]);
            var8[0].n5(var9[2]);
            var8[1].n5(var9[3]);
            break;
         case 5:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[3].n5(var9[0]);
            var8[2].n5(var9[1]);
            var8[0].n5(var9[2]);
            var8[1].n5(var9[3]);
            break;
         case 6:
            var8[1].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[0].n5(var9[0]);
            var8[1].n5(var9[1]);
            var8[3].n5(var9[2]);
            var8[2].n5(var9[3]);
            break;
         case 7:
            var8[1].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[0].n5(var9[0]);
            var8[1].n5(var9[1]);
            var8[3].n5(var9[2]);
            var8[2].n5(var9[3]);
      }

      return var9;
   }

   static com.aspose.slides.internal.o9b.w1[] u3(n1g var0) {
      com.aspose.slides.internal.o9b.w1 var1 = new com.aspose.slides.internal.o9b.w1(var0.e5().u9(), var0.e5().k5());
      int var2 = var0.p8() % 90;
      if (var2 >= 45) {
         var2 = 90 - var2;
      }

      int var3 = var0.p8() / 45;
      float var4;
      float var5;
      switch (var3) {
         case 0:
         case 3:
         case 4:
         case 7:
         case 8:
            var4 = var0.e5().u3();
            var5 = var0.e5().h0();
            break;
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            var4 = var0.e5().h0();
            var5 = var0.e5().u3();
      }

      float var6 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var2 * Math.PI / 180.0);
      float var7 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
      com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      switch (var3) {
         case 0:
         case 8:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[0].l6() + var6);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[1].n5(var9[0]);
            var8[2].n5(var9[1]);
            break;
         case 1:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[1].n5(var9[0]);
            var8[2].n5(var9[1]);
            break;
         case 2:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[1].n5(var9[0]);
            var8[2].n5(var9[1]);
            break;
         case 3:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[1].n5(var9[0]);
            var8[2].n5(var9[1]);
            break;
         case 4:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[0].n5(var9[0]);
            var8[3].n5(var9[1]);
            break;
         case 5:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[0].n5(var9[0]);
            var8[3].n5(var9[1]);
            break;
         case 6:
            var8[1].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[0].n5(var9[0]);
            var8[3].n5(var9[1]);
            break;
         case 7:
            var8[1].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[0].n5(var9[0]);
            var8[3].n5(var9[1]);
      }

      return var9;
   }

   static com.aspose.slides.internal.o9b.w1 a6(n1g var0) {
      com.aspose.slides.internal.o9b.w1 var1 = new com.aspose.slides.internal.o9b.w1(var0.e5().u9(), var0.e5().k5());
      int var2 = var0.p8() % 90;
      if (var2 >= 45) {
         var2 = 90 - var2;
      }

      int var3 = var0.p8() / 45;
      float var4;
      float var5;
      switch (var3) {
         case 0:
         case 3:
         case 4:
         case 7:
         case 8:
            var4 = var0.e5().u3();
            var5 = var0.e5().h0();
            break;
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            var4 = var0.e5().h0();
            var5 = var0.e5().u3();
      }

      float var6 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var2 * Math.PI / 180.0);
      float var7 = var5 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
      com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      com.aspose.slides.internal.o9b.w1 var9 = com.aspose.slides.internal.o9b.w1.n5.u3();
      switch (var3) {
         case 0:
         case 8:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[0].l6() + var6);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[0].n5(var9);
            break;
         case 1:
            var8[0].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[2].n5(var9);
            break;
         case 2:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var6);
            var8[2].n5(var8[1].l6() + var4);
            var8[3].n5(var8[0].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5() + var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[1].n5(var9);
            break;
         case 3:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() + var4);
            var8[2].n5(var8[1].l6() + var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[3].n5(var9);
            break;
         case 4:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() + var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() + var7);
            var8[3].l6(var8[2].k5());
            var8[2].n5(var9);
            break;
         case 5:
            var8[0].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[1].n5(var8[0].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[0].n5(var9);
            break;
         case 6:
            var8[1].n5(var1.l6() + (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var6);
            var8[2].n5(var8[1].l6() - var4);
            var8[3].n5(var8[0].l6() - var4);
            var8[0].l6(var1.k5() + var7 / 2.0F);
            var8[1].l6(var8[0].k5() - var7);
            var8[2].l6(var8[1].k5());
            var8[3].l6(var8[0].k5());
            var8[3].n5(var9);
            break;
         case 7:
            var8[1].n5(var1.l6() - (var4 + var6) / 2.0F);
            var8[0].n5(var8[1].l6() - var4);
            var8[2].n5(var8[1].l6() - var6);
            var8[3].n5(var8[2].l6() - var4);
            var8[0].l6(var1.k5() - var7 / 2.0F);
            var8[1].l6(var8[0].k5());
            var8[2].l6(var8[1].k5() - var7);
            var8[3].l6(var8[2].k5());
            var8[1].n5(var9);
      }

      return var9;
   }

   private static void n5(n1g var0, l5 var1) {
      var1.h0().n5(var0);
   }

   private static int n5(n1g var0, com.aspose.slides.internal.o9b.p8 var1) {
      int var2 = var0.p8() % 90;
      if (var2 >= 45) {
         var2 = 90 - var2;
      }

      int var3 = var0.p8() / 45;
      int var4;
      int var5;
      switch (var3) {
         case 0:
         case 3:
         case 4:
         case 7:
         case 8:
            var4 = var1.l6();
            var5 = var1.k5();
            break;
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            var4 = var1.k5();
            var5 = var1.l6();
      }

      int var6 = com.aspose.slides.internal.v6g.k5.u3(var5 * com.aspose.slides.ms.System.q1.h0(var2 * Math.PI / 180.0), 14);
      return var4 + var6;
   }

   private static void n5(l5 var0, com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.o9b.y2[] var2, boolean var3, n1g var4) {
      boolean var5 = var3;
      com.aspose.slides.internal.o9b.p8 var6 = com.aspose.slides.internal.o9b.p8.n5.u3();
      if (var0.y4() == 2) {
         var3 = !var3;
      }

      b9y var7 = var0.h0();
      if (var3) {
         com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.8F);
         var7.n5(var8.a6()).k5(var6);
         var7.n5.n5.l6(var6.u3());
         com.aspose.slides.internal.o9b.w1 var9 = a6(var4).u3();
         if (var9.l6() < var4.e5().u9()) {
            int var10 = com.aspose.slides.internal.v6g.k5.u3(var9.l6() - var1.s7(), 13);
            if (var10 < var6.l6()) {
               var2[0].k5(var2[0].s7() + var6.l6());
               var2[0].l6(var2[0].t2() - var6.l6());
            }
         } else {
            int var17 = com.aspose.slides.internal.v6g.k5.u3(var2[0].u9() - var9.l6(), 13);
            if (var17 < var6.l6()) {
               var7.n5.n5.k5(var2[0].u9() - var6.l6());
               var7.n5.n5.u3(var2[0].x8() + (var2[0].l6() - var6.k5()) / 2);
               var2[0].l6(var2[0].t2() - var6.l6());
            }
         }

         a9k.n5(var2[0].n3(), var3, var4);
      } else {
         com.aspose.slides.internal.o9b.w1[] var13 = k5(var4);
         if (var4.s3() == 0) {
            com.aspose.slides.internal.o9b.f2 var16 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.7F);
            var0.h0().n5(var16.a6()).k5(var6);
            boolean var21 = !com.aspose.slides.ms.System.d2.k5(var4.n3().getPlotArea().getHeight())
               || !com.aspose.slides.ms.System.d2.k5(var4.n3().getPlotArea().getWidth());
            com.aspose.slides.internal.o9b.y2 var24 = (var21
                  ? new com.aspose.slides.internal.o9b.y2(var2[0].s7(), var2[0].x8(), var2[0].t2(), var2[0].l6() + var6.k5() - 2)
                  : var2[0])
               .n3();
            var7.n5.n5.l6(var6.u3());
            var7.n5.n5.u3(var24.n5() - var6.k5() - 2);
            int var12 = var2[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var13[0].k5(), 13);
            if (var12 < var6.k5() + 2) {
               var2[0].n5(var2[0].l6() - (var6.k5() + 2 - var12));
            }
         } else if (var4.s3() > 0) {
            if (var13[0].k5() != var13[1].k5()) {
               com.aspose.slides.internal.o9b.f2 var15 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.3F, var2[0].l6() * 0.3F);
               var0.h0().n5(var15.a6()).k5(var6);
               var7.n5.n5.l6(var6.u3());
               int var20 = var4.p8() / 45;
               switch (var20) {
                  case 1:
                  case 5:
                     if (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()), 13) / 2 - var2[0].s7()
                        < var6.l6()) {
                        int var23 = var6.l6()
                           - (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()), 13) / 2 - var2[0].s7());
                        var2[0].k5(var2[0].s7() + var23);
                        var2[0].l6(var2[0].t2() - var23);
                     }
                     break;
                  case 2:
                  case 6:
                     if (var2[0].u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()), 13) / 2
                        < var6.l6()) {
                        int var22 = var6.l6()
                           - (var2[0].u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()), 13) / 2);
                        var2[0].l6(var2[0].t2() - var22);
                     }
                  case 3:
                  case 4:
               }

               if (var2[0].n5() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].k5() + var13[1].k5()), 13) / 2 < var6.k5()) {
                  var2[0]
                     .n5(
                        var2[0].l6()
                           - (
                              var6.k5()
                                 + 2
                                 - (
                                    var2[0].n5()
                                       - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].k5() + var13[1].k5()), 13) / 2
                                 )
                           )
                     );
               }
            } else {
               com.aspose.slides.internal.o9b.f2 var14 = new com.aspose.slides.internal.o9b.f2(var2[0].t2() * 0.8F, var2[0].l6() * 0.7F);
               var0.h0().n5(var14.a6()).k5(var6);
               var7.n5.n5.l6(var6.u3());
               int var18 = 0;
               boolean var11 = false;
               if (var5) {
                  if (var0.y4() == 2 && ChartTypeCharacterizer.isBar3DChart(var4.n3().getType()) && var4.n3().getAxes().getVerticalAxis().getCrossType() == 1) {
                     var7.n5.n5.u3(var2[0].x8());
                     var2[0].u3(var2[0].x8() + var6.k5() + 2);
                     var2[0].n5(var2[0].l6() - (var6.k5() + 2 - var18));
                     var11 = true;
                  } else {
                     var7.n5.n5.u3(var2[0].n5() - var6.k5() - 2);
                  }
               } else {
                  var7.n5.n5.u3(var1.n5() - var6.k5() - 8);
               }

               var18 = var2[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var13[0].k5(), 13);
               if (var18 < var6.k5() + 2 && !var11) {
                  var2[0].n5(var2[0].l6() - (var6.k5() + 2 - var18));
               }
            }
         }

         a9k.n5(var2[0].n3(), var3, var4);
      }
   }

   private static void n5(l5 var0, com.aspose.slides.internal.o9b.y2[] var1, n1g var2) {
      if (!g6z.n5(var1[0].n3())) {
         com.aspose.slides.internal.o9b.p8 var3 = com.aspose.slides.internal.o9b.p8.n5.u3();
         com.aspose.slides.internal.o9b.w1[] var4 = u3(var2);
         b9y var5 = var0.h0();
         boolean var6 = com.aspose.slides.internal.v6g.k5.n5(var2.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
         if (var2.s3() == 0) {
            com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(var1[0].t2() * 0.8F, var1[0].l6() * 0.7F);
            var0.h0().n5(var7.a6()).k5(var3);
            var5.n5.n5.l6(var3.u3());
            var5.n5.n5.u3(var1[0].n5() - var3.k5() - 2);
            if (!var6 && var2.n3().getPlotArea().getLayoutTargetType() == 0) {
               int var12 = var1[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var4[0].k5(), 13);
               if (var12 < var3.k5() + 2) {
                  var1[0].n5(var1[0].l6() + (var3.k5() + 2 - var12));
               }
            } else {
               int var8 = var1[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var4[0].k5(), 13);
               if (var8 < var3.k5() + 2) {
                  var1[0].n5(var1[0].l6() - (var3.k5() + 2 - var8));
               }
            }
         }

         if (var2.s3() > 0) {
            if (var4[0].k5() == var4[1].k5()) {
               com.aspose.slides.internal.o9b.f2 var11 = new com.aspose.slides.internal.o9b.f2(var1[0].t2() * 0.8F, var1[0].l6() * 0.7F);
               var0.h0().n5(var11.a6()).k5(var3);
               var5.n5.n5.l6(var3.u3());
               int var14 = 0;
               var5.n5.n5.u3(var1[0].n5() - var3.k5() - 2);
               if (!var6 && var2.n3().getPlotArea().getLayoutTargetType() == 0) {
                  var14 = var1[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var4[0].k5(), 13);
                  if (var14 < var3.k5() + 2) {
                     var1[0].n5(var1[0].l6() + (var3.k5() + 2 - var14));
                  }
               } else {
                  var14 = var1[0].n5() - com.aspose.slides.internal.v6g.k5.u3(var4[0].k5(), 13);
                  if (var14 < var3.k5() + 2) {
                     var1[0].n5(var1[0].l6() - (var3.k5() + 2 - var14));
                  }
               }
            } else {
               com.aspose.slides.internal.o9b.f2 var10 = new com.aspose.slides.internal.o9b.f2(var1[0].t2() * 0.3F, var1[0].l6() * 0.3F);
               var0.h0().n5(var10.a6()).k5(var3);
               var5.n5.n5.l6(var3.u3());
               int var13 = var2.p8() / 45;
               switch (var13) {
                  case 0:
                  case 4:
                  case 8:
                     if (var1[0].u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].l6() + var4[1].l6()), 13) / 2
                        < var3.l6()) {
                        int var17 = var3.l6()
                           - (var1[0].u9() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].l6() + var4[1].l6()), 13) / 2);
                        if (!var6 && var2.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var1[0].l6(var1[0].t2() + var17);
                        } else {
                           var1[0].l6(var1[0].t2() - var17);
                        }
                     }
                  case 1:
                  case 2:
                  case 5:
                  case 6:
                  default:
                     break;
                  case 3:
                  case 7:
                     if (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].l6() + var4[1].l6()), 13) / 2 - var1[0].s7()
                        < var3.l6()) {
                        int var9 = var3.l6()
                           - (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].l6() + var4[1].l6()), 13) / 2 - var1[0].s7());
                        if (!var6 && var2.n3().getPlotArea().getLayoutTargetType() == 0) {
                           var1[0].k5(var1[0].s7() - var9);
                           var1[0].l6(var1[0].t2() + var9);
                        } else {
                           var1[0].k5(var1[0].s7() + var9);
                           var1[0].l6(var1[0].t2() - var9);
                        }
                     }
               }

               if (var1[0].n5() - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].k5() + var4[1].k5()), 13) / 2 < var3.k5()) {
                  if (!var6 && var2.n3().getPlotArea().getLayoutTargetType() == 0) {
                     var1[0]
                        .n5(
                           var1[0].l6()
                              + (
                                 var3.k5()
                                    + 2
                                    - (
                                       var1[0].n5()
                                          - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].k5() + var4[1].k5()), 13) / 2
                                    )
                              )
                        );
                  } else {
                     var1[0]
                        .n5(
                           var1[0].l6()
                              - (
                                 var3.k5()
                                    + 2
                                    - (
                                       var1[0].n5()
                                          - com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4[0].k5() + var4[1].k5()), 13) / 2
                                    )
                              )
                        );
                  }
               }
            }

            if (var6 || var2.n3().getPlotArea().getLayoutTargetType() == 1) {
               a9k.n5(var1[0].n3(), false, var2);
            }
         }
      }
   }

   private static void n5(
      l5 var0, com.aspose.slides.internal.o9b.y2 var1, boolean var2, com.aspose.slides.internal.o9b.p8 var3, com.aspose.slides.internal.o9b.p8 var4, int var5
   ) {
      boolean var6 = var2;
      com.aspose.slides.internal.o9b.p8 var7 = com.aspose.slides.internal.o9b.p8.n5.u3();
      n1g var8 = var0.d2();
      if (var0.y4() == 2) {
         var3.k5(var7);
         var6 = !var2;
      } else {
         var4.k5(var7);
         if (var0.c8().getTickLabelPosition() != 3) {
            var7.n5(var7.l6() + var5);
         }
      }

      n2z var9 = var0.h0().n5;
      if (var6) {
         com.aspose.slides.internal.o9b.p8 var10 = var9.n5.h0().u3();
         com.aspose.slides.internal.o9b.w1 var11 = a6(var8).u3();
         if (var11.l6() < var8.e5().u9()) {
            var9.n5
               .k5(
                  var0.c8().getTickLabelPosition() == 3
                     ? com.aspose.slides.internal.v6g.k5.u3(var11.l6() - var10.l6(), 13)
                     : com.aspose.slides.internal.v6g.k5.u3(var11.l6() - var7.l6() - var10.l6(), 13)
               );
            var9.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var11.k5() - var8.e5().a6() / 2.0 - var10.k5() / 2.0, 14));
         } else {
            int var12 = com.aspose.slides.internal.v6g.k5.u3(var1.u9() - var11.l6(), 13);
            if (var12 < var10.l6()) {
               return;
            }

            var9.n5
               .k5(
                  var0.c8().getTickLabelPosition() == 3
                     ? com.aspose.slides.internal.v6g.k5.u3(var11.l6(), 13)
                     : com.aspose.slides.internal.v6g.k5.u3(var11.l6() + var7.l6(), 13)
               );
            var9.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var11.k5() - var8.e5().a6() / 2.0 - var10.k5() / 2.0, 14));
         }
      } else {
         com.aspose.slides.internal.o9b.w1[] var13 = k5(var8);
         if (var13[0].k5() == var13[1].k5()) {
            if (var8.s3() >= 0) {
               var9.n5.k5(com.aspose.slides.internal.v6g.k5.u3((var13[0].l6() + var13[1].l6()) / 2.0 - var9.n5.t2() / 2.0, 14));
            }
         } else {
            if ((var8.p8() < 45 || var8.p8() >= 90) && (var8.p8() < 225 || var8.p8() >= 270)) {
               var9.n5
                  .k5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()) / 2.0F + n5(var8, var7.u3()), 13));
            } else {
               var9.n5
                  .k5(
                     com.aspose.slides.internal.v6g.k5.u3(
                        com.aspose.slides.ms.System.q1.n5(var13[0].l6() + var13[1].l6()) / 2.0F - var9.n5.t2() - n5(var8, var7.u3()), 13
                     )
                  );
            }

            var9.n5.u3(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var13[0].k5() + var13[1].k5()) / 2.0F, 13));
         }
      }
   }

   private static void u9(n1g var0) {
      l5 var1 = var0.m3();
      List var2 = var1.h0;
      List var3 = var0.y4();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         g3y var5 = (g3y)var3.get_Item(var4);
         var2.addItem(var5.k5());
      }

      var1.u3(0.0);
      var1.a6((double)var3.size());
      var1.h0((double)var1.y2());
      var1.u9(var1.w1() / 2.0);
   }

   public void n5(g8v var1) {
   }

   public g8v n5() {
      g8v var1 = new g8v();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(g8v var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof g8v) ? false : this.l6((g8v)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g8v Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(g8v bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
