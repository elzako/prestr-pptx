package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a1 {
   static void n5(
      n1g var0,
      List<g3y>[] var1,
      com.aspose.slides.internal.o9b.y2 var2,
      com.aspose.slides.internal.o9b.p8[] var3,
      com.aspose.slides.internal.o9b.p8[] var4,
      com.aspose.slides.internal.o9b.p8[] var5,
      int[] var6
   ) {
      com.aspose.slides.internal.o9b.p8.n5.k5(var3[0]);
      com.aspose.slides.internal.o9b.p8.n5.k5(var4[0]);
      com.aspose.slides.internal.o9b.p8.n5.k5(var5[0]);
      var6[0] = 0;
      l5 var7 = var0.q0();
      l5 var8 = var0.m1();
      boolean var9 = ChartTypeCharacterizer.isChartTypeBar(var0.n3().getType());
      l5 var10 = var0.m3();
      n5(var10.h0, var2.n3(), var10).k5(var5[0]);
      n5(var8, (g3y)var1[0].get_Item(0), var9).k5(var3[0]);
      var8.n5(var3[0].u3());
      int var11 = n1g.u3(var0.y4());
      n5(var7, var2.n3(), var11, var9, (g3y)var1[0].get_Item(0)).k5(var4[0]);
      var7.n5(var4[0].u3());
      float var12 = var7.c8() != null ? var7.k5().c8() : 0.0F;
      var6[0] = com.aspose.slides.internal.v6g.k5.u3(var7.s7() + p4.n5(var12) + p4.l6(var12) + 0.5, 14);
      if (var0.u3() != null) {
         var6[0] += var6[0] * var0.u3().length;
      }
   }

   static com.aspose.slides.internal.o9b.p8 n5(List<Object> var0, com.aspose.slides.internal.o9b.y2 var1, l5 var2) {
      if (var2.c8() != null && var2.c8().getTickLabelPosition() != 3 && var0.size() != 0) {
         short var3 = 250;
         com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
         int var5 = var0.size();
         var4.n5((float)var1.t2() / var5 * var2.r4());
         var4.l6(var1.l6() * 0.5F);
         int var6 = 0;
         int var7 = 0;

         for (int var8 = 0; var8 < var0.size(); var8++) {
            String var9 = "";
            var9 = p4.n5(var2.h0.get_Item(var8), var2);
            com.aspose.slides.internal.o9b.p8 var10 = h6l.n5(var9, var2.u9(), var2.k5(), var4.a6(), 1, 1).u3();
            if (var10.l6() > var6) {
               var6 = var10.l6();
            }

            if (var10.k5() > var7) {
               var7 = var10.k5();
            }

            if (var8 == 0) {
               com.aspose.slides.internal.o9b.p8 var11 = h6l.n5("a", var2.u9(), var2.k5(), var1.h0().u3(), 1, 1).u3();
               var2.l6(var11.l6() * var2.x8() / var3);
            }
         }

         var2.n5 = var6;
         var2.l6 = var7;
         return new com.aspose.slides.internal.o9b.p8(var6, var7);
      } else {
         return new com.aspose.slides.internal.o9b.p8(0, 0);
      }
   }

   static com.aspose.slides.internal.o9b.p8 n5(l5 var0, g3y var1, boolean var2) {
      n1g var3 = var0.d2();
      if (var0.c8() != null && var0.c8().isVisible() && var0.c8().getTickLabelPosition() != 3) {
         t9z var4 = var1.c8().get_Item(0);
         String var5 = var4.a6();
         boolean var6 = false;
         int var7 = 0;
         int var8 = 0;
         List var9 = var0.h0;
         double var10 = var0.c8().isLogarithmic() ? var0.n5(var0.w1()) : var0.w1();
         double var12 = 1.0E-10;

         for (int var14 = 0; var14 < var0.h0.size(); var14++) {
            double var15 = com.aspose.slides.internal.v6g.k5.u3(var9.get_Item(var14), double.class);
            double var17 = var0.c8().isLogarithmic() ? var0.l6(var15) : var15;
            if (var14 - 1 > 0
               ? !(
                  com.aspose.slides.ms.System.q1.n5(
                           g6z.n5(
                              var10,
                              com.aspose.slides.ms.System.q1.n5(g6z.n5(var15, com.aspose.slides.internal.v6g.k5.u3(var9.get_Item(var14 - 1), double.class)))
                           )
                        )
                        / var10
                     > 1.0E10
               )
               : var14 + 1 >= var9.size()
                  || !(
                     com.aspose.slides.ms.System.q1.n5(
                              g6z.n5(
                                 var10,
                                 com.aspose.slides.ms.System.q1.n5(g6z.n5(var15, com.aspose.slides.internal.v6g.k5.u3(var9.get_Item(var14 + 1), double.class)))
                              )
                           )
                           / var12
                        > 1.0E10
                  )) {
               if (ChartTypeCharacterizer.s7(var1.u9().getType())) {
                  var17 /= 100.0;
                  var5 = "0%";
               }

               var17 = var0.c8().isLogarithmic() ? var17 : var17 * n5(var0);
               String var19 = var0.n3() ? t7k.n5(var17, var5, var6) : p4.n5(var17, var0);
               com.aspose.slides.internal.o9b.p8 var20 = h6l.n5(var19, var0.u9(), var0.k5(), var3.n5.n5.h0().u3(), 1, 1).u3();
               if (var20.l6() > var7) {
                  var7 = var20.l6();
               }

               if (var20.k5() > var8) {
                  var8 = var20.k5();
               }
            }
         }

         float var21 = n5(var0.k5().c8());
         if (var2) {
            var8 += com.aspose.slides.internal.v6g.k5.u3(2.0F * var21 + 0.5, 14);
         } else {
            var7 += com.aspose.slides.internal.v6g.k5.u3(2.0F * var21 + 0.5, 14);
         }

         var0.n5 = var7;
         var0.l6 = var8;
         return new com.aspose.slides.internal.o9b.p8(var7, var8);
      } else {
         return new com.aspose.slides.internal.o9b.p8(0, 0);
      }
   }

   static com.aspose.slides.internal.o9b.p8 n5(l5 var0, com.aspose.slides.internal.o9b.y2 var1, int var2, boolean var3, g3y var4) {
      if (var0.c8() != null && var0.c8().isVisible() && var0.c8().getTickLabelPosition() != 3 && !g6z.n5(var1.n3())) {
         if (var3 && var0.t2()) {
            var0.l6(false);
         }

         if (var0.t2()) {
            return u3(var0, var1.n3(), var2, var3, var4);
         } else {
            return var0.u9() != 0 && var0.u9() != 90 && var0.u9() != -90 ? l6(var0, var1.n3(), var2, var3, var4) : k5(var0, var1.n3(), var2, var3, var4);
         }
      } else {
         return new com.aspose.slides.internal.o9b.p8(0, 0);
      }
   }

   private static com.aspose.slides.internal.o9b.p8 l6(l5 var0, com.aspose.slides.internal.o9b.y2 var1, int var2, boolean var3, g3y var4) {
      n1g var5 = var0.d2();
      boolean var6 = false;
      if (var0.c8().getCategoryAxisType() == 1) {
         var6 = true;
         var0.a6(false);
         var0.u9(1);
      }

      List var7 = new List<>(var0.h0);
      if (var0.c8().isLogarithmic()) {
         for (int var8 = 0; var8 < var7.size(); var8++) {
            var7.set_Item(var8, var0.l6(com.aspose.slides.ms.System.z3.n3(var7.get_Item(var8))));
         }
      }

      List[] var9;
      List var30;
      if (var0.y4() == 0) {
         var30 = var5.l6();
         var9 = var5.u3();
      } else {
         var30 = var5.k5();
         var9 = var5.a6();
      }

      short var10 = 300;
      String var11 = var4.c8().get_Item(0).u9();
      boolean var12 = false;
      if (!ChartTypeCharacterizer.isChartTypeScatter(var4.u9().getType()) && !ChartTypeCharacterizer.isChartTypeBubble(var4.u9().getType())) {
         if (var0.c8().isNumberFormatLinkedToSource() && var30.size() > 0) {
            var12 = true;
         }

         if (var9 != null && var9.length > 0 && var30.size() > 0) {
            var12 = true;
         }
      } else {
         var12 = var0.n3();
      }

      com.aspose.slides.internal.o9b.f2 var13 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      int var14 = 0;
      if (!var6) {
         if (!var0.a0() && !var0.d2().n3().hasDataTable()) {
            var14 = var2 - 1;
            if (var14 == 0) {
               var14 = 1;
            }
         } else {
            var14 = var2;
         }
      } else {
         var14 = var7.size();
      }

      float var15 = 0.0F;
      float var16 = 0.0F;
      int var17 = 0;
      int var18 = 0;
      float var19 = 0.5F;
      float var20 = 0.0F;
      if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var4.u9().getType())) {
         com.aspose.slides.internal.o9b.f2 var21 = h6l.k5("3", var0.k5()).a6();
         if (var3) {
            var20 = (float)var1.l6() / var7.size();
            var20 += var21.k5();
         } else {
            var20 = (float)var1.t2() / var7.size();
            var20 += var21.l6();
         }
      } else if (var3) {
         var20 = (float)var1.l6() / var14 * var0.r4();
      } else {
         var20 = (float)var1.t2() / var14 * var0.r4();
      }

      com.aspose.slides.internal.o9b.p8 var37 = new com.aspose.slides.internal.o9b.p8(0, 0);

      for (int var22 = 0; var22 < var7.size(); var22++) {
         int var23 = var7.size() - 1 - var22;
         com.aspose.slides.internal.o9b.f2[] var24 = new com.aspose.slides.internal.o9b.f2[]{var13};
         n5(var0, var1.n3(), var3, var7, var22, var24, var19, var20, var19);
         var24[0].l6(var13);
         if (var22 == 0) {
            h6l.n5("a", var0.k5()).k5(var37);
            var0.l6(var37.l6() * var0.x8() / var10);
         }

         String var25 = n5(var0, var4, 0, var12, var22, var30, var7, var11, null);
         com.aspose.slides.internal.o9b.p8 var26 = h6l.n5(var25, var0.u9(), var0.k5(), var13.a6(), 1, 1).u3();
         if (var26.l6() > var15) {
            var15 = var26.l6();
         }

         if (var26.k5() > var16) {
            var16 = var26.k5();
         }

         float var27 = var15;
         if (var3) {
            var27 = var16;
         }

         switch (var0.c8().getPosition()) {
            case 0:
               if (var0.c8().isPlotOrderReversed()) {
                  if (var0.u9() > 0) {
                     float var51 = var23 * var20 + var20 / 2.0F;
                     if (var27 > var51) {
                        float var66 = var27 - var51;
                        if (var66 > var17) {
                           var17 = com.aspose.slides.internal.v6g.k5.u3(var66, 13);
                        }
                     }
                  } else {
                     float var52 = var22 * var20 + var20 / 2.0F;
                     if (var27 > var52) {
                        float var67 = var27 - var52;
                        if (var67 > var18) {
                           var18 = com.aspose.slides.internal.v6g.k5.u3(var67, 13);
                        }
                     }
                  }
               } else if (var0.u9() > 0) {
                  float var53 = var22 * var20 + var20 / 2.0F;
                  if (var27 > var53) {
                     float var68 = var27 - var53;
                     if (var68 > var17) {
                        var17 = com.aspose.slides.internal.v6g.k5.u3(var68, 13);
                     }
                  }
               } else {
                  float var54 = var23 * var20 + var20 / 2.0F;
                  if (var27 > var54) {
                     float var69 = var27 - var54;
                     if (var69 > var18) {
                        var18 = com.aspose.slides.internal.v6g.k5.u3(var69, 13);
                     }
                  }
               }
               break;
            case 1:
               if (var0.c8().isPlotOrderReversed()) {
                  if (var0.u9() > 0) {
                     float var47 = var23 * var20 + var20 / 2.0F;
                     if (var27 > var47) {
                        float var62 = var27 - var47;
                        if (var62 > var17) {
                           var17 = com.aspose.slides.internal.v6g.k5.u3(var62, 13);
                        }
                     }
                  } else {
                     float var48 = var22 * var20 + var20 / 2.0F;
                     if (var27 > var48) {
                        float var63 = var27 - var48;
                        if (var63 > var18) {
                           var18 = com.aspose.slides.internal.v6g.k5.u3(var63, 13);
                        }
                     }
                  }
               } else if (var0.u9() > 0) {
                  float var49 = var22 * var20 + var20 / 2.0F;
                  if (var27 > var49) {
                     float var64 = var27 - var49;
                     if (var64 > var17) {
                        var17 = com.aspose.slides.internal.v6g.k5.u3(var64, 13);
                     }
                  }
               } else {
                  float var50 = var23 * var20 + var20 / 2.0F;
                  if (var27 > var50) {
                     float var65 = var27 - var50;
                     if (var65 > var18) {
                        var18 = com.aspose.slides.internal.v6g.k5.u3(var65, 13);
                     }
                  }
               }
               break;
            case 2:
               if (var0.c8().isPlotOrderReversed()) {
                  if (var0.u9() < 0) {
                     float var43 = var23 * var20 + var20 / 2.0F;
                     if (var27 > var43) {
                        float var58 = var27 - var43;
                        if (var58 > var17) {
                           var17 = com.aspose.slides.internal.v6g.k5.u3(var58, 13);
                        }
                     }
                  } else {
                     float var44 = var22 * var20 + var20 / 2.0F;
                     if (var27 > var44) {
                        float var59 = var27 - var44;
                        if (var59 > var18) {
                           var18 = com.aspose.slides.internal.v6g.k5.u3(var59, 13);
                        }
                     }
                  }
               } else if (var0.u9() < 0) {
                  float var45 = var22 * var20 + var20 / 2.0F;
                  if (var27 > var45) {
                     float var60 = var27 - var45;
                     if (var60 > var17) {
                        var17 = com.aspose.slides.internal.v6g.k5.u3(var60, 13);
                     }
                  }
               } else {
                  float var46 = var23 * var20 + var20 / 2.0F;
                  if (var27 > var46) {
                     float var61 = var27 - var46;
                     if (var61 > var18) {
                        var18 = com.aspose.slides.internal.v6g.k5.u3(var61, 13);
                     }
                  }
               }
               break;
            case 3:
               if (var0.c8().isPlotOrderReversed()) {
                  if (var0.u9() < 0) {
                     float var28 = var23 * var20 + var20 / 2.0F;
                     if (var27 > var28) {
                        float var29 = var27 - var28;
                        if (var29 > var17) {
                           var17 = com.aspose.slides.internal.v6g.k5.u3(var29, 13);
                        }
                     }
                  } else {
                     float var40 = var22 * var20 + var20 / 2.0F;
                     if (var27 > var40) {
                        float var55 = var27 - var40;
                        if (var55 > var18) {
                           var18 = com.aspose.slides.internal.v6g.k5.u3(var55, 13);
                        }
                     }
                  }
               } else if (var0.u9() < 0) {
                  float var41 = var22 * var20 + var20 / 2.0F;
                  if (var27 > var41) {
                     float var56 = var27 - var41;
                     if (var56 > var17) {
                        var17 = com.aspose.slides.internal.v6g.k5.u3(var56, 13);
                     }
                  }
               } else {
                  float var42 = var23 * var20 + var20 / 2.0F;
                  if (var27 > var42) {
                     float var57 = var27 - var42;
                     if (var57 > var18) {
                        var18 = com.aspose.slides.internal.v6g.k5.u3(var57, 13);
                     }
                  }
               }
         }
      }

      var0.u3 = var15;
      var0.k5 = var16;
      float[] var38 = new float[]{var15};
      float[] var39 = new float[]{var16};
      n5(var0, var1.n3(), var3, var13.a6(), var38, var39);
      var15 = var38[0];
      var16 = var39[0];
      n5(var0, var3, var4, var15, var16, var17, var18);
      return new com.aspose.slides.internal.o9b.p8(com.aspose.slides.internal.v6g.k5.u3(var15, 13), com.aspose.slides.internal.v6g.k5.u3(var16, 13));
   }

   private static void n5(
      l5 var0,
      com.aspose.slides.internal.o9b.y2 var1,
      boolean var2,
      List<Object> var3,
      int var4,
      com.aspose.slides.internal.o9b.f2[] var5,
      float var6,
      float var7,
      float var8
   ) {
      int var9 = var3.size() - 1 - var4;
      if (var2) {
         if (var0.c8().isPlotOrderReversed()) {
            if (var0.u9() > 0) {
               var5[0].n5(var1.t2() * var6);
               var5[0].l6(var1.l6() - var4 * var7 - var7 / 2.0F);
            } else {
               var5[0].n5(var1.t2() * var6);
               var5[0].l6(var1.l6() - var9 * var7 - var7 / 2.0F);
            }
         } else if (var0.u9() > 0) {
            var5[0].n5(var1.t2() * var6);
            var5[0].l6(var1.l6() - var9 * var7 - var7 / 2.0F);
         } else {
            var5[0].n5(var1.t2() * var6);
            var5[0].l6(var1.l6() - var4 * var7 - var7 / 2.0F);
         }
      } else if (var0.c8().isPlotOrderReversed()) {
         if (var0.u9() > 0) {
            var5[0].n5(var1.t2() - var4 * var7 - var7 / 2.0F);
            var5[0].l6(var1.l6() * var8);
         } else {
            var5[0].n5(var1.t2() - var9 * var7 - var7 / 2.0F);
            var5[0].l6(var1.l6() * var8);
         }
      } else if (var0.u9() > 0) {
         var5[0].n5(var1.t2() - var9 * var7 - var7 / 2.0F);
         var5[0].l6(var1.l6() * var8);
      } else {
         var5[0].n5(var1.t2() - var4 * var7 - var7 / 2.0F);
         var5[0].l6(var1.l6() * var8);
      }

      if (var5[0].l6() < var1.t2() * var6) {
         var5[0].n5(var1.t2() * var6);
      }

      if (var5[0].k5() < var1.l6() * var8) {
         var5[0].l6(var1.l6() * var8);
      }
   }

   private static void n5(l5 var0, boolean var1, g3y var2, float var3, float var4, int var5, int var6) {
      var0.n5 = var3;
      var0.l6 = var4;
      if (n5(var0, var2)) {
         if (var1) {
            var0.a6 = var4 / 2.0F;
         } else {
            var0.a6 = var3 / 2.0F;
         }

         var0.u9 = var0.a6;
      } else if (p4.l6(var0, var2)) {
         var0.a6 = var5;
         var0.u9 = var6;
      }
   }

   private static com.aspose.slides.internal.o9b.p8 k5(l5 var0, com.aspose.slides.internal.o9b.y2 var1, int var2, boolean var3, g3y var4) {
      boolean var5 = false;
      if (var0.c8().getCategoryAxisType() == 1) {
         var5 = true;
         var0.a6(false);
         var0.u9(1);
      }

      List var6 = new List<>(var0.h0);
      if (var0.c8().isLogarithmic()) {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            var6.set_Item(var7, var0.l6(com.aspose.slides.ms.System.z3.n3(var6.get_Item(var7))));
         }
      }

      n1g var39 = var0.d2();
      List var8;
      List[] var9;
      if (var0.y4() == 0) {
         var8 = var39.l6();
         var9 = var39.u3();
      } else {
         var8 = var39.k5();
         var9 = var39.a6();
      }

      int var10 = l6(var0);
      short var11 = 300;
      String var12 = var4.c8().get_Item(0).u9();
      boolean var13 = false;
      if (!ChartTypeCharacterizer.isChartTypeScatter(var4.u9().getType()) && !ChartTypeCharacterizer.isChartTypeBubble(var4.u9().getType())) {
         if (var0.c8().isNumberFormatLinkedToSource() && var8.size() > 0) {
            var13 = true;
         }

         if (var9 != null && var9.length > 0 && var8.size() > 0) {
            var13 = true;
         }
      } else {
         var13 = var0.n3();
      }

      com.aspose.slides.internal.o9b.f2 var14 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      int var15 = 0;
      if (!var5) {
         var15 = l5.n5(var0, var2);
      } else {
         var15 = var6.size();
      }

      int var16 = n5(var1.n3(), var3, var4, var15);
      int var17 = 0;
      int var18 = 0;
      float var19 = 0.5F;
      float var20 = 0.0F;
      float var21 = 0.0F;
      boolean var22 = false;
      int var23 = 0;
      String[] var24 = new String[var6.size()];

      float var46;
      float var47;
      while (true) {
         var46 = 0.0F;
         var47 = 0.0F;
         boolean var41 = false;
         var18 = 0;
         com.aspose.slides.internal.o9b.f2[] var27 = new com.aspose.slides.internal.o9b.f2[]{var14};
         boolean var28 = n5(var0, var1.n3(), var3, var4, var27, var6, var19, var15, var16, var10);
         var27[0].l6(var14);
         if (!var28) {
            float[] var29 = new float[]{0.0F};
            float[] var30 = new float[]{0.0F};
            int[] var31 = new int[]{0};
            int[] var32 = new int[]{0};
            n5(var0, var3, var4, var6, var23, var11, var13, var8, var12, var24, var14.a6(), var29, var30, var31, var32);
            var46 = var29[0];
            var47 = var30[0];
            var17 = var31[0];
            var18 = var32[0];
            var23++;
            var0.k5 = var47;
            var0.u3 = var46;
            if (!var0.c4() || var22) {
               break;
            }

            float var33 = var14.k5();
            float[] var34 = new float[]{var20};
            float[] var35 = new float[]{var21};
            float[] var36 = new float[]{var33};
            boolean[] var37 = new boolean[]{var22};
            boolean var38 = n5(var0, var3, var46, var34, var47, var14.a6(), var15, var16, var35, var36, var37);
            var20 = var34[0];
            var21 = var35[0];
            var33 = var36[0];
            var22 = var37[0];
            if (!var38) {
               break;
            }
            continue;
         }
      }

      if (var0.c8().isPlotOrderReversed()) {
         float var49 = var17;
         var18 = com.aspose.slides.internal.v6g.k5.u3(var49, 13);
      }

      return new com.aspose.slides.internal.o9b.p8(com.aspose.slides.internal.v6g.k5.u3(var46, 13), com.aspose.slides.internal.v6g.k5.u3(var47, 13));
   }

   private static void n5(
      l5 var0,
      boolean var1,
      g3y var2,
      List<Object> var3,
      int var4,
      int var5,
      boolean var6,
      List<x4> var7,
      String var8,
      String[] var9,
      com.aspose.slides.internal.o9b.f2 var10,
      float[] var11,
      float[] var12,
      int[] var13,
      int[] var14
   ) {
      n1g var15 = var0.d2();
      com.aspose.slides.internal.o9b.p8 var16 = h6l.n5("a", var0.k5()).u3();

      for (int var17 = 0; var17 < var3.size(); var17 += var0.r4()) {
         if (var17 == 0 && var4 <= 0) {
            if (var0.u9() == 0) {
               var0.l6(g6z.k5((double)(var16.l6() * var0.x8()) / var5));
            } else {
               var0.l6(0);
            }
         }

         String var18 = n5(var0, var2, var4, var6, var17, var7, var3, var8, var9);
         if (var18 == null) {
            var18 = "";
         }

         com.aspose.slides.internal.o9b.f2 var19 = new com.aspose.slides.internal.o9b.f2();
         if (var0.u9() == 0 && !var1) {
            h6l.n5(var18, var0.l6(), var15, var10.a6(), var0.u9()).l6(var19);
         } else {
            com.aspose.slides.internal.o9b.p8.n5(h6l.n5(var18, var0.u9(), var0.k5(), var10.a6(), 1, 1)).l6(var19);
         }

         if (var19.l6() > var11[0]) {
            var11[0] = var19.l6();
         }

         if (var19.k5() > var12[0]) {
            var12[0] = var19.k5();
         }

         if (var17 == 0) {
            if (var1) {
               var13[0] = com.aspose.slides.internal.v6g.k5.u3(var19.k5(), 13) / 2;
            } else {
               var13[0] = com.aspose.slides.internal.v6g.k5.u3(var19.l6(), 13) / 2;
            }
         }

         if (var17 == var3.size() - 1) {
            if (var1) {
               var14[0] = com.aspose.slides.internal.v6g.k5.u3(var19.k5(), 13) / 2;
            } else {
               var14[0] = com.aspose.slides.internal.v6g.k5.u3(var19.l6(), 13) / 2;
            }
         }
      }
   }

   private static boolean n5(
      l5 var0,
      com.aspose.slides.internal.o9b.y2 var1,
      boolean var2,
      g3y var3,
      com.aspose.slides.internal.o9b.f2[] var4,
      List<Object> var5,
      float var6,
      int var7,
      int var8,
      int var9
   ) {
      n1g var10 = var0.d2();
      com.aspose.slides.internal.o9b.p8 var11 = h6l.n5("a", var0.k5()).u3();
      if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var3.u9().getType())) {
         com.aspose.slides.internal.o9b.f2 var12 = h6l.k5("3", var0.k5()).a6();
         if (var2) {
            var4[0].l6((float)var1.l6() / var5.size());
            var4[0].n5(var1.t2() * var6);
            var4[0].l6(var4[0].k5() + g6z.n5(var12.k5()));
         } else {
            var4[0].n5((float)var1.t2() / var5.size());
            var4[0].l6(var1.l6() * var6);
            var4[0].n5(var4[0].l6() + g6z.n5(var12.l6()));
         }
      } else if (var2) {
         var4[0].l6((float)var1.l6() / var7 * var0.r4());
         if (!com.aspose.slides.internal.v6g.k5.n5(var10.n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated() && var0.d2().z8()) {
            var4[0].n5(var0.d2().c4());
         } else {
            var4[0].n5(var1.t2() * var6);
         }

         if (var0.c4()) {
            if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 0 && var0.r4() < var7) {
               if (var4[0].k5() < var11.k5()) {
                  var0.u9(var0.r4() + var8);
                  return true;
               }
            } else if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 90 && var4[0].k5() < var11.l6() && var0.r4() < var7) {
               var0.u9(var0.r4() + var8);
               return true;
            }
         }
      } else {
         if (var9 > var0.r4()) {
            var4[0].n5((float)var1.t2() / var7 * var9);
         } else {
            var4[0].n5((float)var1.t2() / var7 * var0.r4());
         }

         var4[0].l6(var1.l6() * var6);
         if (var0.c4()) {
            if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 0) {
               if (var4[0].l6() < var11.l6()) {
                  var0.u9(var0.r4() + var8);
                  return true;
               }
            } else if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 90 && var4[0].l6() < var11.k5()) {
               var0.u9(var0.r4() + var8);
               return true;
            }
         }
      }

      return false;
   }

   private static void n5(l5 var0, com.aspose.slides.internal.o9b.y2 var1, boolean var2, com.aspose.slides.internal.o9b.f2 var3, float[] var4, float[] var5) {
      List var6;
      List[] var7;
      if (var0.y4() == 0) {
         var6 = var0.d2().l6();
         var7 = var0.d2().u3();
      } else {
         var6 = var0.d2().k5();
         var7 = var0.d2().a6();
      }

      if (var7 != null && var7.length > 0 && var6.size() > 0) {
         var0.u9(1);
         byte var8 = 0;
         if (var2) {
            var8 = 90;
         }

         for (int var9 = 0; var9 < var7.length; var9++) {
            List var10 = var7[var9];
            if (var2) {
               var3.l6((float)var1.l6() / var10.size());
               var3.n5(var1.t2() * 0.5F);
            } else {
               var3.n5((float)var1.t2() / var10.size());
               var3.l6(var1.l6() * 0.5F);
            }

            com.aspose.slides.internal.o9b.p8 var11 = n5(var10, var8, var3.a6(), var0).u3();
            if (var2) {
               var4[0] += var11.l6();
            } else {
               var5[0] += var11.k5();
            }
         }
      }
   }

   static com.aspose.slides.internal.o9b.p8 n5(List<x4> var0, int var1, com.aspose.slides.internal.o9b.f2 var2, l5 var3) {
      var2.n5(var2.l6() + 4.0F);
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var0.size(); var6++) {
         x4 var7 = (x4)var0.get_Item(var6);
         String var8 = t7k.n5(var7.l6(), var7.u9(), var7.a6());
         com.aspose.slides.internal.o9b.p8 var9 = h6l.n5(var8, var1, var3.k5(), var2.a6(), 1, 1).u3();
         if (var9.l6() > var4) {
            var4 = var9.l6();
         }

         if (var9.k5() > var5) {
            var5 = var9.k5();
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var4, var5);
   }

   private static int n5(com.aspose.slides.internal.o9b.y2 var0, boolean var1, g3y var2, int var3) {
      byte var4 = 1;
      if (!ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var2.u9().getType())) {
         if (var1) {
            if ((float)var0.l6() / var3 < 1.0F) {
               float var5 = (float)var0.l6() / var3 * 10.0F;
               var4 *= 10;
               if (var5 < 1.0F) {
                  var4 *= 10;
               }
            }
         } else if ((float)var0.t2() / var3 < 1.0F) {
            float var6 = (float)var0.t2() / var3 * 10.0F;
            var4 *= 10;
            if (var6 < 1.0F) {
               var4 *= 10;
            }
         }
      }

      return var4;
   }

   static float n5(float var0) {
      return var0 * 0.4F * w5k.n5();
   }

   static double n5(l5 var0) {
      byte var1 = 0;
      if (var0.c8() != null) {
         var1 = (byte)(var0.c8().getDisplayUnit() == 0 ? 0 : var0.c8().getDisplayUnit() + 1);
      }

      return com.aspose.slides.ms.System.q1.a6(10.0, -var1);
   }

   static boolean n5(l5 var0, g3y var1) {
      if (var0.c8() == null || !var0.c8().isVisible() || var0.c8().getTickLabelPosition() == 3) {
         return false;
      } else {
         return var0.y4() == 2
               || var0.y4() == 3
               || ChartTypeCharacterizer.isChartTypeScatter(var1.u9().getType())
               || ChartTypeCharacterizer.isChartTypeBubble(var1.u9().getType())
            ? true
            : !var0.a0() && var0.u9() == 0 && ChartTypeCharacterizer.isChartTypeRadar(var1.u9().getType());
      }
   }

   private static com.aspose.slides.internal.o9b.p8 u3(l5 var0, com.aspose.slides.internal.o9b.y2 var1, int var2, boolean var3, g3y var4) {
      n1g var5 = var0.d2();
      boolean var6 = false;
      if (var0.c8().getCategoryAxisType() == 1) {
         var6 = true;
         var0.a6(false);
         var0.u9(1);
      }

      List var7 = new List<>(var0.h0);
      if (var0.c8().isLogarithmic()) {
         for (int var8 = 0; var8 < var7.size(); var8++) {
            var7.set_Item(var8, var0.l6(com.aspose.slides.ms.System.z3.n3(var7.get_Item(var8))));
         }
      }

      boolean var9 = false;
      List[] var10;
      List var48;
      if (var0.y4() == 0) {
         var48 = var5.l6();
         var10 = var5.u3();
         IChartCategoryCollection var11 = var5.n3().getChartData().getCategories();
         var9 = var11 != null && var11.size() > 0;
      } else {
         var48 = var5.k5();
         var10 = var5.a6();
         IChartCategoryCollection var50 = var5.n3().getChartData().getSecondaryCategories();
         var9 = var50 != null && var50.size() > 0;
      }

      boolean var51 = var10 != null && var10.length > 0;
      int var12 = l6(var0);
      short var13 = 300;
      String var14 = var4.c8().get_Item(0).u9();
      boolean var15 = false;
      var15 = var0.n3();
      com.aspose.slides.internal.o9b.f2 var16 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      int var17 = 0;
      if (!var6) {
         var17 = l5.n5(var0, var2);
      } else {
         var17 = var7.size();
      }

      boolean var18 = !var0.d2().n3().getRotation3D().getRightAngleAxes();
      if (var18 && !var3) {
         com.aspose.slides.internal.o9b.y1 var19 = j9e.n5(var0.d2(), var0.d2().o0().y4(), com.aspose.slides.internal.o9b.y1.n5(var1).y4(), 0.0F).y4();
         com.aspose.slides.internal.o9b.y2.l6(var19.y4()).u3(var1);
      }

      int var54 = n5(var1.n3(), var3, var4, var17);
      int var20 = 0;
      int var21 = 0;
      float var22 = 0.5F;
      float var23 = 0.5F;
      float var24 = 0.0F;
      float var25 = 0.0F;
      float var26 = 0.0F;
      boolean var27 = false;
      boolean var28 = ChartTypeCharacterizer.is3DChart(var5.n3().getType());
      com.aspose.slides.internal.o9b.p8 var29 = h6l.n5("a", var0.k5()).u3();
      int var30 = 0;
      float[][] var31 = new float[var7.size()][2];
      com.aspose.slides.internal.o9b.p8[] var32 = (com.aspose.slides.internal.o9b.p8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.p8.class), var7.size())
      );
      String[] var33 = new String[var7.size()];

      float var34;
      float var35;
      boolean var67;
      do {
         while (true) {
            var34 = 0.0F;
            var35 = 0.0F;
            var20 = 0;
            var21 = 0;
            float var36 = 0.0F;
            com.aspose.slides.internal.o9b.f2[] var37 = new com.aspose.slides.internal.o9b.f2[]{var16};
            float[] var38 = new float[]{0.0F};
            boolean var39 = n5(var0, var1.n3(), var3, var4, var37, var7, var23, var22, var17, var54, var12, var38);
            var37[0].l6(var16);
            var36 = var38[0];
            if (!var39) {
               float var40 = 0.0F;
               if (var0.u9() == 45) {
                  var40 = n5(var1.n3(), var3, var4, var7, var17);
               }

               float var41 = 0.0F;
               float var42 = 0.0F;

               for (int var43 = 0; var43 < var7.size(); var43++) {
                  if (var0.u9() == 45) {
                     var37[0] = var16;
                     n5(var0, var1.n3(), var3, var7, var43, var37, var23, var40, var22);
                     var37[0].l6(var16);
                  }

                  if (var43 == 0 && var30 <= 0) {
                     var0.l6(var29.l6() * var0.x8() / var13);
                  }

                  String var44 = n5(var0, var4, var30, var15, var43, var48, var7, var14, var33);
                  float var45;
                  float var46;
                  if (var30 <= 0) {
                     var45 = h6l.n5(var44, var0.k5(), !var28);
                     var46 = h6l.l6(var44, var0.k5()).l6();
                     var31[var43][0] = var45;
                     var31[var43][1] = var46;
                  } else {
                     var45 = var31[var43][0];
                     var46 = var31[var43][1];
                  }

                  if (var45 > var41) {
                     var41 = var45;
                  }

                  if (var46 > var42) {
                     var42 = var46;
                  }

                  com.aspose.slides.internal.o9b.p8 var47 = new com.aspose.slides.internal.o9b.p8(0, 0);
                  if (var9) {
                     h6l.n5(var44, var0.u9(), var0.k5(), var16.a6(), 1, 1).k5(var47);
                  } else if (var30 <= 0) {
                     h6l.n5(var44, var0.k5()).k5(var47);
                     var47.k5(var32[var43]);
                  } else {
                     var32[var43].k5(var47);
                  }

                  if (var47.l6() > var34) {
                     var34 = var47.l6();
                  }

                  if (var47.k5() > var35) {
                     var35 = var47.k5();
                  }

                  if (var43 == 0) {
                     if (var3) {
                        var20 = var47.k5() / 2;
                     } else {
                        var20 = var0.u9() == 45
                           ? com.aspose.slides.internal.v6g.k5.u3(var47.l6() - var40 * 0.6, 14)
                           : com.aspose.slides.internal.v6g.k5.u3(var47.l6() * 0.65, 14);
                     }
                  }

                  if (var43 == var7.size() - 1) {
                     if (var3) {
                        var21 = var47.k5() / 2;
                     } else {
                        var21 = var47.l6() / 2;
                     }
                  }
               }

               var30++;
               if (var0.u9() == 45) {
                  var36 = (var1.t2() - var34 + var29.l6()) / var17;
                  var41 = h6l.n5("a", 45, var0.k5(), var16.a6(), 1, 1).l6();
               }

               var0.k5 = var35;
               var0.u3 = var34;
               if (var9 && var41 > var36 * 0.8) {
                  if (n5(var0, var3, var35, var29.u3(), var42, var34, var51)) {
                     continue;
                  }
                  break;
               } else {
                  if (var3) {
                     if (!(var16.k5() / var35 > 2.5) || !(var22 > 0.2) || !(var16.l6() * 0.8 > var41)) {
                        break;
                     }

                     var22 *= 0.8F;
                  } else {
                     if (var0.u9() == 45 || !(var16.l6() / var34 > 2.0F) || !(var23 > 0.3)) {
                        break;
                     }

                     var23 = var23 * 4.0F / 5.0F;
                  }
                  continue;
               }
            }
         }

         if (!var0.c4() || var27) {
            break;
         }

         float[] var62 = new float[]{var24};
         float[] var64 = new float[]{var25};
         float[] var65 = new float[]{var26};
         boolean[] var66 = new boolean[]{var27};
         var67 = n5(var0, var3, var34, var62, var35, var16.a6(), var17, var54, var64, var65, var66);
         var24 = var62[0];
         var25 = var64[0];
         var26 = var65[0];
         var27 = var66[0];
      } while (var67);

      if (var0.c8().isPlotOrderReversed()) {
         int var63 = var20;
         var20 = var21;
         var21 = var63;
      }

      float[] var60 = new float[]{var34};
      float[] var61 = new float[]{var35};
      n5(var0, var1.n3(), var3, var16.a6(), var60, var61);
      var34 = var60[0];
      var35 = var61[0];
      n5(var0, var3, var4, var34, var35, var20, var21);
      return new com.aspose.slides.internal.o9b.p8(com.aspose.slides.internal.v6g.k5.u3(var34, 13), com.aspose.slides.internal.v6g.k5.u3(var35, 13));
   }

   private static boolean n5(
      l5 var0,
      com.aspose.slides.internal.o9b.y2 var1,
      boolean var2,
      g3y var3,
      com.aspose.slides.internal.o9b.f2[] var4,
      List<Object> var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      float[] var11
   ) {
      com.aspose.slides.internal.o9b.p8 var12 = h6l.n5("a", var0.k5()).u3();
      if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var3.u9().getType())) {
         com.aspose.slides.internal.o9b.f2 var13 = h6l.k5("3", var0.k5()).a6();
         if (var2) {
            var4[0].l6((float)var1.l6() / var5.size());
            var4[0].n5(var1.t2() * var6);
            var4[0].l6(var4[0].k5() + g6z.n5(var13.k5()));
            var11[0] = var4[0].k5();
         } else {
            var4[0].n5((float)var1.t2() / var5.size());
            var4[0].l6(var1.l6() * var7);
            var4[0].n5(var4[0].l6() + g6z.n5(var13.l6()));
            var11[0] = var4[0].l6();
         }
      } else if (var2) {
         var4[0].l6((float)var1.l6() / var8 * var0.r4());
         var4[0].n5(var1.t2() * var6);
         if (var0.c4()) {
            if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 0 && var0.r4() < var8) {
               if (var4[0].k5() < var12.k5()) {
                  var0.u9(var0.r4() + var9);
                  return true;
               }
            } else if (com.aspose.slides.ms.System.q1.n5(var0.u9()) == 90 && var4[0].k5() < var12.l6() && var0.r4() < var8) {
               var0.u9(var0.r4() + var9);
               return true;
            }
         }

         var11[0] = var4[0].k5();
      } else {
         if (var10 > var0.r4()) {
            var4[0].n5((float)var1.t2() / var8 * var10);
         } else {
            var4[0].n5((float)var1.t2() / var8 * var0.r4());
         }

         var4[0].l6(var1.l6() * var7);
         var11[0] = var4[0].l6();
      }

      return false;
   }

   private static int l6(l5 var0) {
      n1g var1 = var0.d2();
      boolean var2 = false;
      List var3;
      if (var0.y4() == 0) {
         var3 = var1.l6();
         var2 = var1.l6().size() > 0;
      } else {
         var3 = var1.k5();
         var2 = var1.k5().size() > 0;
      }

      if (!var2) {
         return 1;
      }

      if (var3.size() == 1) {
         return 1;
      }

      int var4 = 1;
      int var5 = Integer.MAX_VALUE;
      float var6 = 0.0F;
      float var7 = 0.0F;
      boolean var8 = true;

      for (int var9 = 0; var9 < var3.size(); var9++) {
         x4 var10 = (x4)var3.get_Item(var9);
         if (var10.l6() != null && !var10.l6().equals("")) {
            if (var8) {
               if (var9 == 0) {
                  var6 = 100.0F;
               }

               if (!(var6 > 0.0F)) {
                  return 1;
               }

               var8 = false;
            } else {
               if (var9 == var3.size()) {
                  var7 = 100.0F;
               }

               var7 = var6 < var7 / 2.0F ? var6 : var7 / 2.0F;
               var6 = var7;
               var4 = g6z.k5(var6 + 1.0F + var7);
               if (var4 <= 1) {
                  return 1;
               }

               if (var4 < var5) {
                  var5 = var4;
               }
            }
         } else if (var8) {
            var6++;
         } else {
            var7++;
         }
      }

      return var5 == Integer.MAX_VALUE ? 1 : var5;
   }

   private static boolean n5(
      l5 var0,
      boolean var1,
      float var2,
      float[] var3,
      float var4,
      com.aspose.slides.internal.o9b.f2 var5,
      int var6,
      int var7,
      float[] var8,
      float[] var9,
      boolean[] var10
   ) {
      if (var1) {
         if ((var2 != var3[0] || var4 != var8[0] || var9[0] != var5.k5()) && var4 > var5.k5() - 5.0F && var0.r4() < var6) {
            var3[0] = var2;
            var8[0] = var4;
            var9[0] = var5.k5();
            var0.u9(var0.r4() + var7);
            return true;
         }

         if (var0.r4() > 1) {
            var0.u9(var0.r4() - var7);
            if (var0.r4() < 1) {
               var0.u9(1);
            }

            var10[0] = true;
            return true;
         }
      } else {
         if ((var2 != var3[0] || var4 != var8[0] || var9[0] != var5.l6()) && var2 > var5.l6() - 5.0F && var0.r4() < var6) {
            var3[0] = var2;
            var8[0] = var4;
            var9[0] = var5.l6();
            var0.u9(var0.r4() + var7);
            return true;
         }

         if (var0.r4() > 1) {
            var0.u9(var0.r4() - var7);
            if (var0.r4() < 1) {
               var0.u9(1);
            }

            var10[0] = true;
            return true;
         }
      }

      return false;
   }

   private static boolean n5(l5 var0, boolean var1, float var2, com.aspose.slides.internal.o9b.p8 var3, float var4, float var5, boolean var6) {
      if (var1) {
         if (var0.u9() == 0 && var2 > var3.k5() * 1.5F) {
            var0.n5(45);
            return true;
         }

         if (var0.u9() == 45) {
            double var7 = com.aspose.slides.ms.System.q1.n5(var0.u9()) / 180.0 * Math.PI;
            double var9 = var4 * com.aspose.slides.ms.System.q1.c8(var7) + var3.k5() * com.aspose.slides.ms.System.q1.h0(var7);
            if (var9 > var5) {
               var0.n5(90);
               return true;
            }
         }
      } else if (!var6) {
         switch (var0.u9()) {
            case 0:
               var0.n5(45);
               return true;
            case 45:
               var0.n5(90);
               return true;
         }
      } else if (var0.u9() != 90) {
         var0.n5(90);
         return true;
      }

      return false;
   }

   private static String n5(l5 var0, g3y var1, int var2, boolean var3, int var4, List<x4> var5, List<Object> var6, String var7, String[] var8) {
      String var11;
      if (var2 > 0 && var8 != null) {
         var11 = var8[var4];
      } else {
         if (var3) {
            String var9;
            boolean var10;
            if (var4 < var5.size()) {
               var9 = ((x4)var5.get_Item(var4)).u9();
               var10 = ((x4)var5.get_Item(var4)).a6();
            } else {
               var9 = "";
               var10 = false;
            }

            if ("".equals(var9) || "General".equals(var9)) {
               var9 = var0.c8().getNumberFormat();
            }

            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var1.u9().getType())) {
               var11 = t7k.n5(com.aspose.slides.internal.v6g.k5.u3(var6.get_Item(var4), double.class) * n5(var0), var7, false);
            } else {
               var11 = t7k.n5(var6.get_Item(var4), var9, var10);
            }
         } else {
            var11 = p4.n5(var6.get_Item(var4), var0);
         }

         if (var8 != null) {
            var8[var4] = var11;
         }
      }

      return var11;
   }

   private static float n5(com.aspose.slides.internal.o9b.y2 var0, boolean var1, g3y var2, List<Object> var3, int var4) {
      float var5;
      if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var2.u9().getType())) {
         if (var1) {
            var5 = (float)var0.l6() / var3.size();
         } else {
            var5 = (float)var0.t2() / var3.size();
         }
      } else if (var1) {
         var5 = (float)var0.l6() / var4;
      } else {
         var5 = (float)var0.t2() / var4;
      }

      return var5;
   }
}
