package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class y9 extends com.aspose.slides.internal.v6g.h0<y9> {
   public y9() {
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

   static void n5(l5 var0, n1g var1) {
      y9r var2 = var1.e5();
      com.aspose.slides.internal.o9b.w1 var3 = g8v.a6(var1).u3();
      var0.n5(var3.l6(), var3.k5(), var3.l6(), var3.k5() - var2.a6());
      g3y var4 = var1.y4().get_Item(0);
      t9z var5 = var4.c8().get_Item(0);
      String var6 = var5.u3();
      boolean var7 = false;
      float var8 = 0.0F;
      byte var9 = 2;
      float var10 = p4.n5(var0.k5().c8());
      if (var3.l6() > var1.e5().u9()) {
         var9 = 0;
         var8 = var3.l6();
         var8 += var10;
      } else {
         var8 = var3.l6() - var0.n5;
         var8 -= var10;
      }

      List var11 = var0.h0;
      double var12 = var0.c8().isLogarithmic() ? var0.n5(var0.z3()) : var0.z3();
      double var14 = var0.c8().isLogarithmic() ? var0.n5(var0.q0()) : var0.q0();
      double var16 = var0.c8().isLogarithmic() ? var0.n5(var0.w1()) : var0.w1();

      for (int var18 = 0; var18 < var0.h0.size(); var18++) {
         double var19 = com.aspose.slides.internal.v6g.k5.u3(var0.h0.get_Item(var18), double.class);
         double var21 = var0.c8().isLogarithmic() ? var0.l6(var19) : var19;
         if (var18 - 1 > 0
            ? com.aspose.slides.ms.System.q1.n5(g6z.n5(var19, com.aspose.slides.internal.v6g.k5.u3(var11.get_Item(var18 - 1), double.class))) == var16
            : var18 + 1 >= var11.size()
               || com.aspose.slides.ms.System.q1.n5(g6z.n5(var19, com.aspose.slides.internal.v6g.k5.u3(var11.get_Item(var18 + 1), double.class))) == var16) {
            float var23 = (float)((var19 - var14) / (var12 - var14) * var1.e5().a6());
            if (!var0.c8().isPlotOrderReversed()) {
               var23 = var3.k5() - var23;
            } else {
               var23 = var3.k5() - var2.a6() + var23;
            }

            if (var0.c8().getTickLabelPosition() != 3) {
               if (ChartTypeCharacterizer.s7(var1.n3().getType() != 73 ? var1.n3().getType() : var1.n3().getChartData().getSeries().get_Item(0).getType())) {
                  var21 /= 100.0;
                  var6 = "0%";
               }

               String var24 = "";
               var21 = var0.c8().isLogarithmic() ? var21 : var21 * p4.n5(var0);
               com.aspose.slides.internal.o9b.c8 var25 = var0.u3().o8();
               if (var0.n3()) {
                  var24 = t7k.n5(var21, var6, var7);
                  t7k.n5(var21, var6, var25.o8()).n5(var25);
               } else {
                  var24 = p4.n5(var21, var0);
                  t7k.n5(var21, var0.c8().getNumberFormat(), var25.o8()).n5(var25);
               }

               com.aspose.slides.internal.o9b.y1 var26 = new com.aspose.slides.internal.o9b.y1(var8, var23 - var0.l6 / 2.0F, var0.n5, var0.l6);
               h6l.n5(
                  com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var26.y4())).y4(),
                  var24,
                  var0.u9(),
                  var0.l6(),
                  var25.o8(),
                  var9,
                  2,
                  var1
               );
            }

            n5(var3.l6(), var23, var0);
         }
      }

      n5(var3.l6(), var3.k5() - var2.a6(), var3.k5(), var0);
   }

   private static void n5(float var0, float var1, l5 var2) {
      if (var2.c8().getMajorTickMark() != 2 && var2.c8().isVisible()) {
         n1g var3 = var2.d2();
         boolean var4 = false;
         boolean var5 = false;
         switch (var2.c8().getMajorTickMark()) {
            case 0:
               var4 = true;
               var5 = true;
               break;
            case 1:
               var4 = true;
               if (var0 > var3.e5().u9()) {
                  var4 = false;
                  var5 = true;
               }
            case 2:
            default:
               break;
            case 3:
               var5 = true;
               if (var0 > var3.e5().u9()) {
                  var5 = false;
                  var4 = true;
               }
         }

         float var6 = p4.n5(var2.k5().c8());
         if (var4) {
            var2.n5(var0, var1, var0 + var6, var1);
         }

         if (var5) {
            var2.n5(var0 - var6, var1, var0, var1);
         }
      }
   }

   private static void n5(float var0, float var1, float var2, l5 var3) {
      if (var3.c8().getMinorTickMark() != 2 && var3.c8().isVisible()) {
         n1g var4 = var3.d2();
         boolean var5 = false;
         boolean var6 = false;
         switch (var3.c8().getMinorTickMark()) {
            case 0:
               var5 = true;
               var6 = true;
               break;
            case 1:
               var5 = true;
               if (var0 > var4.e5().u9()) {
                  var5 = false;
                  var6 = true;
               }
            case 2:
            default:
               break;
            case 3:
               var6 = true;
               if (var0 > var4.e5().u9()) {
                  var6 = false;
                  var5 = true;
               }
         }

         float var7 = (float)(var3.j5() / (var3.z3() - var3.q0()) * (var2 - var1));
         float var8;
         if (!var3.c8().isPlotOrderReversed()) {
            var8 = var2;
            var7 = -var7;
         } else {
            var8 = var1;
         }

         float var9 = var8;
         float var10 = p4.l6(var3.k5().c8());

         do {
            if (var5) {
               var3.n5(var0, var9, var0 + var10, var9);
            }

            if (var6) {
               var3.n5(var0 - var10, var9, var0, var9);
            }

            var9 += var7;
         } while (var1 <= var9 && var9 <= var2);
      }
   }

   static void n5(int var0, com.aspose.slides.internal.o9b.y2 var1, boolean var2, l5 var3, n1g var4) {
      if (var3.c8().getCategoryAxisType() == 1) {
         k5(var3, var4);
      } else {
         com.aspose.slides.internal.o9b.w1[] var5 = g8v.k5(var4);
         double var6 = var4.m1().e2();
         double var8 = var4.m1().t9();
         double var10 = var4.m1().z1();
         boolean var12 = var4.m1().q0() == var4.m1().t4();
         if (var4.m1().c8().isPlotOrderReversed()) {
            var10 = var6 - var10;
         } else {
            var10 -= var8;
         }

         int var13 = com.aspose.slides.internal.v6g.k5.u3(var10 / (var6 - var8) * var4.e5().a6(), 14);
         if (var13 != 0) {
            var3.n5(var5[0].l6(), var5[0].k5() - var13, var5[1].l6(), var5[1].k5() - var13);
         }

         if (var4.s3() >= 0) {
            var3.n5(var5[0].l6(), var5[0].k5(), var5[1].l6(), var5[1].k5());
         }

         if (var3.c8().getTickLabelPosition() == 2) {
            var5[0].l6(var5[0].k5() - var13);
            var5[1].l6(var5[1].k5() - var13);
         }

         List var14 = var4.l6();
         float var15 = var3.s7();
         if (var3.c8().getTickLabelPosition() != 3) {
            float var16 = var3.k5().c8();
            var15 += p4.n5(var16) + p4.l6(var16);
         }

         boolean var32 = var3.a0() || var4.n3().hasDataTable();
         int var17;
         if (var32) {
            var17 = var0;
         } else {
            var17 = var0 - 1;
            if (var17 == 0) {
               var17 = 1;
            }
         }

         double var18 = var5[1].l6() == var5[0].l6()
            ? Math.PI / 2
            : com.aspose.slides.ms.System.q1.t9(com.aspose.slides.ms.System.q1.n5((var5[0].k5() - var5[1].k5()) / (var5[1].l6() - var5[0].l6())));
         double var20 = 180.0 * var18 / Math.PI;
         float var22 = (var5[1].l6() - var5[0].l6()) / var17;
         float var23 = (var5[1].k5() - var5[0].k5()) / var17;
         com.aspose.slides.internal.o9b.w1 var24 = com.aspose.slides.internal.o9b.w1.n5.u3();

         for (int var25 = 0; var25 < var0; var25++) {
            int var26 = var25;
            if (var3.c8().isPlotOrderReversed()) {
               var26 = var0 - 1 - var25;
            }

            String var27 = "";
            com.aspose.slides.internal.o9b.c8 var28 = var3.u3().o8();
            if (var26 < var3.h0.size()) {
               var27 = p4.n5(var3.h0.get_Item(var25), var3);
               t7k.n5(var3.h0.get_Item(var26), var3.c8().getNumberFormat(), var28.o8()).n5(var28);
               if (var3.n3() && var14.size() > 0) {
                  String var29 = "";
                  boolean var30 = false;
                  var29 = var26 < var14.size() ? ((x4)var14.get_Item(var26)).u9() : "";
                  var30 = var26 < var14.size() ? ((x4)var14.get_Item(var26)).a6() : false;
                  var27 = t7k.n5(var3.h0.get_Item(var26), var29, var30);
                  t7k.n5(var3.h0.get_Item(var26), var29, var28.o8()).n5(var28);
               }
            }

            if (var3.c8().getTickLabelPosition() != 3 && var26 % var3.r4() == 0) {
               com.aspose.slides.internal.o9b.y1 var38 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
               boolean var41 = false;
               if (var32) {
                  if (var4.s3() >= 0) {
                     if (var5[0].k5() == var5[1].k5()) {
                        var38.k5(var22 < 0.0F ? var5[0].l6() + (var25 + 1) * var22 : var5[0].l6() + var25 * var22);
                        var38.u3(var5[0].k5() + var15);
                        var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                        var38.n5(var3.k5);
                        var41 = true;
                        var24.n5(var22 < 0.0F ? var38.x8() - var22 / 2.0F : var38.x8() + var22 / 2.0F);
                        var24.l6(var38.n3());
                     } else if (var18 <= Math.PI / 4) {
                        var38.k5(var22 < 0.0F ? var5[0].l6() + (var25 + 1) * var22 : var5[0].l6() + var25 * var22);
                        var38.u3(var23 > 0.0F ? var5[0].k5() + (var25 + 1) * var23 : var5[0].k5() + var25 * var23);
                        var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                        var38.n5(var3.k5);
                     } else {
                        var38.k5(var23 > 0.0F ? var5[0].l6() + var25 * var22 : var5[0].l6() + (var25 + 1) * var22);
                        var38.k5(
                           var22 * var23 <= 0.0F
                              ? var38.x8() + var15 * (float)com.aspose.slides.ms.System.q1.h0(var18)
                              : var38.x8() - var15 * (float)com.aspose.slides.ms.System.q1.h0(var18) - var3.u3
                        );
                        var38.u3(var23 > 0.0F ? var5[0].k5() + var25 * var23 : var5[0].k5() + (var25 + 1) * var23);
                        var38.u3(var38.n3() + (com.aspose.slides.ms.System.q1.n5(var23) - var3.k5) * (float)com.aspose.slides.ms.System.q1.h0(var18) / 2.0F);
                        var38.l6(var3.u3);
                        var38.n5(var3.k5);
                     }
                  } else if (var4.s3() < 0 && !var12 && var3.c8().getTickLabelPosition() == 2) {
                     if (var5[0].k5() == var5[1].k5()) {
                        var38.k5(var22 > 0.0F ? var5[0].l6() + var25 * var22 : var5[0].l6() + (var25 + 1) * var22);
                        var38.u3(var5[0].k5() - var3.k5 - var15);
                        var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                        var38.n5(var3.k5);
                     } else if (var18 <= Math.PI / 4) {
                        var38.k5(var22 < 0.0F ? var5[0].l6() + (var25 + 1) * var22 : var5[0].l6() + var25 * var22);
                        var38.u3(var23 < 0.0F ? var5[0].k5() + (var25 + 1) * var23 : var5[0].k5() + var25 * var23);
                        var38.u3(var38.n3() - var3.k5);
                        var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                        var38.n5(var3.k5);
                     } else {
                        var38.k5(var23 < 0.0F ? var5[0].l6() + var25 * var22 : var5[0].l6() + (var25 + 1) * var22);
                        var38.k5(
                           var22 * var23 >= 0.0F
                              ? var38.x8() + var15 * (float)com.aspose.slides.ms.System.q1.h0(var18)
                              : var38.x8() - var15 * (float)com.aspose.slides.ms.System.q1.h0(var18) - var3.u3
                        );
                        var38.u3(var23 < 0.0F ? var5[0].k5() + var25 * var23 : var5[0].k5() + (var25 + 1) * var23);
                        var38.u3(var38.n3() - (com.aspose.slides.ms.System.q1.n5(var23) - var3.k5) * (float)com.aspose.slides.ms.System.q1.h0(var18) / 2.0F);
                        var38.u3(var38.n3() - var3.k5);
                        var38.l6(var3.u3);
                        var38.n5(var3.k5);
                     }
                  }
               } else if (var4.s3() >= 0) {
                  if (var5[0].k5() == var5[1].k5()) {
                     var38.k5(var22 < 0.0F ? var5[0].l6() + var25 * var22 + var22 / 2.0F : var5[0].l6() + var25 * var22 - var22 / 2.0F);
                     var38.u3(var5[0].k5() + var15);
                     var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                     var38.n5(var3.k5);
                  } else if (var18 <= Math.PI / 4) {
                     var38.k5(var5[0].l6() + var25 * var22 - com.aspose.slides.ms.System.q1.n5(var22) / 2.0F);
                     var38.u3(var5[0].k5() + var25 * var23 + var15);
                     var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                     var38.n5(var3.k5);
                  } else {
                     var38.k5(var5[0].l6() + var25 * var22);
                     var38.k5(
                        var22 * var23 <= 0.0F
                           ? var38.x8() + var15 * (float)com.aspose.slides.ms.System.q1.h0(var18)
                           : var38.x8() - var15 * (float)com.aspose.slides.ms.System.q1.h0(var18) - var3.u3
                     );
                     var38.u3(var5[0].k5() + var25 * var23 - var3.k5 / 2.0F);
                     var38.l6(var3.u3);
                     var38.n5(var3.k5);
                  }
               } else if (var4.s3() < 0 && !var12 && var3.c8().getTickLabelPosition() == 2) {
                  if (var5[0].k5() == var5[1].k5()) {
                     var38.k5(var22 > 0.0F ? var5[0].l6() + var25 * var22 - var22 / 2.0F : var5[0].l6() + var25 * var22 + var22 / 2.0F);
                     var38.u3(var5[0].k5() - var3.k5 - var15);
                     var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                     var38.n5(var3.k5);
                  } else if (var18 <= Math.PI / 4) {
                     var38.k5(var5[0].l6() + var25 * var22 - com.aspose.slides.ms.System.q1.n5(var22) / 2.0F);
                     var38.u3(var5[0].k5() + var25 * var23);
                     var38.u3(var38.n3() - (var3.k5 + var15));
                     var38.l6(com.aspose.slides.ms.System.q1.n5(var22));
                     var38.n5(var3.k5);
                  } else {
                     var38.k5(var5[0].l6() + var25 * var22);
                     var38.k5(
                        var22 * var23 >= 0.0F
                           ? var38.x8() + var15 * (float)com.aspose.slides.ms.System.q1.h0(var18)
                           : var38.x8() - var15 * (float)com.aspose.slides.ms.System.q1.h0(var18) - var3.u3
                     );
                     var38.u3(var5[0].k5() + var25 * var23 - var3.k5 / 2.0F);
                     var38.l6(var3.u3);
                     var38.n5(var3.k5);
                  }
               }

               if (var3.u9() != 0 && var3.u9() != 90 && var3.u9() != -90 && var41) {
                  p4.n5(var27, var24.u3(), new com.aspose.slides.internal.o9b.f2(var3.u3, var3.k5), var28.o8(), var3);
               } else {
                  h6l.n5(
                     com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var38.y4())).y4(),
                     var27,
                     var3.u9(),
                     var3.l6(),
                     var28.o8(),
                     1,
                     2,
                     var4
                  );
               }
            }
         }

         n5(var13, var0, var3);
         List[] var33 = var4.u3();
         float var34 = var5[0].k5();
         byte var35 = 1;
         if (var33 != null && var33.length > 0 && var14.size() > 0 && var3.c8().getTickLabelPosition() != 3) {
            float var36;
            if (!var3.c8().isPlotOrderReversed()) {
               var36 = var5[0].l6();
            } else {
               var36 = var5[1].l6();
            }

            float var39 = var34 + var15 * (var33.length + 1) + var3.l6;
            boolean var42 = false;
            if (var5[0].k5() == var5[1].k5()) {
               p4.n5(var33, var36, var39, var15, var42, var22, var35, var34, var1.n3(), var2, var3);
            }
         }
      }
   }

   private static void k5(l5 var0, n1g var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = g8v.k5(var1);
      double var3;
      if (var1.m1().c8().isPlotOrderReversed()) {
         var3 = var1.m1().z3() - var1.m1().t4();
      } else {
         var3 = var1.m1().t4() - var1.m1().q0();
      }

      int var5 = com.aspose.slides.internal.v6g.k5.u3(var3 / (var1.m1().z3() - var1.m1().q0()) * var1.e5().a6(), 14);
      if (var5 != 0) {
         var0.n5(var2[0].l6(), var2[0].k5() - var5, var2[1].l6(), var2[1].k5() - var5);
      }

      if (var1.s3() >= 0) {
         var0.n5(var2[0].l6(), var2[0].k5(), var2[1].l6(), var2[1].k5());
      }

      if (var0.c8().getTickLabelPosition() == 2) {
         var2[0].l6(var2[0].k5() - var5);
         var2[1].l6(var2[1].k5() - var5);
      }

      List var6 = var1.l6();
      float var7 = var0.s7();
      if (var0.c8().getTickLabelPosition() != 3) {
         float var8 = var0.k5().c8();
         var7 += p4.n5(var8) + p4.l6(var8);
      }

      double var9 = var2[1].l6() == var2[0].l6()
         ? Math.PI / 2
         : com.aspose.slides.ms.System.q1.t9(com.aspose.slides.ms.System.q1.n5((var2[0].k5() - var2[1].k5()) / (var2[1].l6() - var2[0].l6())));
      boolean var11 = var0.a0() || var1.n3().hasDataTable();
      int var12 = var0.d5();
      float var13 = (var2[1].l6() - var2[0].l6()) / var12;
      float var14 = (var2[1].k5() - var2[0].k5()) / var12;
      List var15 = var0.h0;

      for (int var16 = 0; var16 < var15.size(); var16++) {
         int var17 = var16;
         if (var0.c8().isPlotOrderReversed()) {
            var17 = var15.size() - 1 - var16;
         }

         int var18 = com.aspose.slides.ms.System.z3.h0(var0.h0.get_Item(var16));
         String var19 = "";
         com.aspose.slides.internal.o9b.c8 var20 = var0.u3().o8();
         if (var17 < var0.h0.size()) {
            var19 = p4.n5(var0.h0.get_Item(var17), var0);
            t7k.n5(var0.h0.get_Item(var17), var0.c8().getNumberFormat(), var20.o8()).n5(var20);
            if (var0.n3() && var6.size() > 0) {
               String var21 = "";
               boolean var22 = false;
               var21 = var17 < var6.size() ? ((x4)var6.get_Item(var17)).u9() : "";
               var22 = var17 < var6.size() && ((x4)var6.get_Item(var17)).a6();
               var19 = t7k.n5(var0.h0.get_Item(var17), var21, var22);
               t7k.n5(var0.h0.get_Item(var17), var21, var20.o8()).n5(var20);
            }
         }

         if (var0.c8().getTickLabelPosition() != 3) {
            com.aspose.slides.internal.o9b.y1 var24 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
            if (var11) {
               if (var1.s3() >= 0) {
                  if (var2[0].k5() == var2[1].k5()) {
                     var24.k5(var13 < 0.0F ? var2[0].l6() + (var16 + 1) * var13 : var2[0].l6() + var16 * var13);
                     var24.u3(var2[0].k5() + var7);
                     var24.l6(com.aspose.slides.ms.System.q1.n5(var13));
                     var24.n5(var0.l6);
                  } else if (var9 <= Math.PI / 4) {
                     var24.k5(var13 < 0.0F ? var2[0].l6() + (var16 + 1) * var13 : var2[0].l6() + var16 * var13);
                     var24.u3(var14 > 0.0F ? var2[0].k5() + (var16 + 1) * var14 : var2[0].k5() + var16 * var14);
                     var24.l6(var0.n5);
                     var24.n5(var0.l6);
                  } else {
                     var24.k5(var14 > 0.0F ? var2[0].l6() + var16 * var13 : var2[0].l6() + (var16 + 1) * var13);
                     var24.k5(
                        var13 * var14 <= 0.0F
                           ? var24.x8() + var7 * (float)com.aspose.slides.ms.System.q1.h0(var9)
                           : var24.x8() - var7 * (float)com.aspose.slides.ms.System.q1.h0(var9) - var0.n5
                     );
                     var24.u3(var14 > 0.0F ? var2[0].k5() + var16 * var14 : var2[0].k5() + (var16 + 1) * var14);
                     var24.u3(var24.n3() + (com.aspose.slides.ms.System.q1.n5(var14) - var0.l6) * (float)com.aspose.slides.ms.System.q1.h0(var9) / 2.0F);
                     var24.l6(var0.n5);
                     var24.n5(var0.l6);
                  }
               } else if (var1.s3() < 0 && var3 != 0.0 && var0.c8().getTickLabelPosition() == 2) {
                  if (var2[0].k5() == var2[1].k5()) {
                     var24.k5(var13 > 0.0F ? var2[0].l6() + var16 * var13 : var2[0].l6() + (var16 + 1) * var13);
                     var24.u3(var2[0].k5() - var0.l6 - var7);
                     var24.l6(var0.n5);
                     var24.n5(var0.l6);
                  } else if (var9 <= Math.PI / 4) {
                     var24.k5(var13 < 0.0F ? var2[0].l6() + (var16 + 1) * var13 : var2[0].l6() + var16 * var13);
                     var24.u3(var14 < 0.0F ? var2[0].k5() + (var16 + 1) * var14 : var2[0].k5() + var16 * var14);
                     var24.u3(var24.n3() - var0.l6);
                     var24.l6(var0.n5);
                     var24.n5(var0.l6);
                  } else {
                     var24.k5(var14 < 0.0F ? var2[0].l6() + var16 * var13 : var2[0].l6() + (var16 + 1) * var13);
                     var24.k5(
                        var13 * var14 >= 0.0F
                           ? var24.x8() + var7 * (float)com.aspose.slides.ms.System.q1.h0(var9)
                           : var24.x8() - var7 * (float)com.aspose.slides.ms.System.q1.h0(var9) - var0.n5
                     );
                     var24.u3(var14 < 0.0F ? var2[0].k5() + var16 * var14 : var2[0].k5() + (var16 + 1) * var14);
                     var24.u3(var24.n3() - (com.aspose.slides.ms.System.q1.n5(var14) - var0.l6) * (float)com.aspose.slides.ms.System.q1.h0(var9) / 2.0F);
                     var24.u3(var24.n3() - var0.l6);
                     var24.l6(var0.n5);
                     var24.n5(var0.l6);
                  }
               }
            } else if (var1.s3() >= 0) {
               if (var2[0].k5() == var2[1].k5()) {
                  var24.k5(var13 < 0.0F ? var2[0].l6() + var16 * var13 + var13 / 2.0F : var2[0].l6() + var16 * var13 - var13 / 2.0F);
                  var24.u3(var2[0].k5() + var7);
                  var24.l6(com.aspose.slides.ms.System.q1.n5(var13));
                  var24.n5(var0.l6);
               } else if (var9 <= Math.PI / 4) {
                  var24.k5(var2[0].l6() + var16 * var13 - com.aspose.slides.ms.System.q1.n5(var13) / 2.0F);
                  var24.u3(var2[0].k5() + var16 * var14 + var7);
                  var24.l6(com.aspose.slides.ms.System.q1.n5(var13));
                  var24.n5(var0.l6);
               } else {
                  var24.k5(var2[0].l6() + var16 * var13);
                  var24.k5(
                     var13 * var14 <= 0.0F
                        ? var24.x8() + var7 * (float)com.aspose.slides.ms.System.q1.h0(var9)
                        : var24.x8() - var7 * (float)com.aspose.slides.ms.System.q1.h0(var9) - var0.n5
                  );
                  var24.u3(var2[0].k5() + var16 * var14 - var0.l6 / 2.0F);
                  var24.l6(var0.n5);
                  var24.n5(var0.l6);
               }
            } else if (var1.s3() < 0 && var3 != 0.0 && var0.c8().getTickLabelPosition() == 2) {
               if (var2[0].k5() == var2[1].k5()) {
                  var24.k5(var13 > 0.0F ? var2[0].l6() + var16 * var13 - var13 / 2.0F : var2[0].l6() + var16 * var13 + var13 / 2.0F);
                  var24.u3(var2[0].k5() - var0.l6 - var7);
                  var24.l6(com.aspose.slides.ms.System.q1.n5(var13));
                  var24.n5(var0.l6);
               } else if (var9 <= Math.PI / 4) {
                  var24.k5(var2[0].l6() + var16 * var13 - com.aspose.slides.ms.System.q1.n5(var13) / 2.0F);
                  var24.u3(var2[0].k5() + var16 * var14);
                  var24.u3(var24.n3() - (var0.l6 + var7));
                  var24.l6(com.aspose.slides.ms.System.q1.n5(var13));
                  var24.n5(var0.l6);
               } else {
                  var24.k5(var2[0].l6() + var16 * var13);
                  var24.k5(
                     var13 * var14 >= 0.0F
                        ? var24.x8() + var7 * (float)com.aspose.slides.ms.System.q1.h0(var9)
                        : var24.x8() - var7 * (float)com.aspose.slides.ms.System.q1.h0(var9) - var0.n5
                  );
                  var24.u3(var2[0].k5() + var16 * var14 - var0.l6 / 2.0F);
                  var24.l6(var0.n5);
                  var24.n5(var0.l6);
               }
            }

            h6l.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var24.y4())).y4(), var19, var0.u9(), var0.l6(), var20.o8(), 1, 2, var1
            );
         }
      }

      n5(var5, var0);
   }

   private static void n5(int var0, int var1, l5 var2) {
      n1g var3 = var2.d2();
      if ((var2.c8().getMajorTickMark() != 2 || var2.c8().getMinorTickMark() != 2) && var2.c8().isVisible()) {
         float var4 = p4.n5(var2.k5().c8());
         float var5 = p4.l6(var2.k5().c8());
         boolean var6 = var2.a0() || var2.d2().n3().hasDataTable();
         com.aspose.slides.internal.o9b.w1[] var7;
         if (var2.y4() == 4) {
            var7 = g8v.u3(var3);
            var6 = true;
         } else {
            var7 = g8v.k5(var3);
         }

         double var8 = var7[1].l6() == var7[0].l6()
            ? Math.PI / 2
            : com.aspose.slides.ms.System.q1.t9(com.aspose.slides.ms.System.q1.n5((var7[0].k5() - var7[1].k5()) / (var7[1].l6() - var7[0].l6())));
         int var10;
         if (var6) {
            var10 = var1;
         } else {
            var10 = var1 - 1;
            if (var10 == 0) {
               var10 = 1;
            }
         }

         if (var3.s3() < 0 && var0 > 0) {
            var7[0].l6(var7[0].k5() - var0);
            var7[1].l6(var7[1].k5() - var0);
            var0 = 0;
         }

         while (true) {
            com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1();
            if (var8 <= Math.PI / 4) {
               boolean var21 = false;
               boolean var22 = false;
               switch (var2.c8().getMajorTickMark()) {
                  case 0:
                     var21 = true;
                     var22 = true;
                     break;
                  case 1:
                     if (var3.s3() >= 0) {
                        var21 = true;
                     } else {
                        var22 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var3.s3() >= 0) {
                        var22 = true;
                     } else {
                        var21 = true;
                     }
               }

               if (!var2.c8().isPlotOrderReversed()) {
                  var7[0].n5(var11);
                  var7[1].n5(var12);
               } else {
                  var7[1].n5(var11);
                  var7[0].n5(var12);
               }

               float var23 = (var12.l6() - var11.l6()) / var10;
               float var24 = (var12.k5() - var11.k5()) / var10;
               if (var23 == 0.0F && var24 == 0.0F) {
                  return;
               }

               float var27 = var11.l6();

               for (float var32 = var11.k5();
                  var11.l6() <= var27 && var27 <= var12.l6()
                     || var11.l6() >= var27 && var27 >= var12.l6()
                     || com.aspose.slides.ms.System.q1.u3(var27) == com.aspose.slides.ms.System.q1.u3(var11.l6())
                     || com.aspose.slides.ms.System.q1.u3(var27) == com.aspose.slides.ms.System.q1.u3(var12.l6());
                  var32 += var2.y2() * var24
               ) {
                  if (var21) {
                     var2.n5(var27, var32 - var4, var27, var32);
                  }

                  if (var22) {
                     var2.n5(var27, var32, var27, var32 + var4);
                  }

                  var27 += var2.y2() * var23;
               }

               boolean var35 = false;
               boolean var36 = false;
               switch (var2.c8().getMinorTickMark()) {
                  case 0:
                     var35 = true;
                     var36 = true;
                     break;
                  case 1:
                     if (var3.s3() >= 0) {
                        var35 = true;
                     } else {
                        var36 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var3.s3() >= 0) {
                        var36 = true;
                     } else {
                        var35 = true;
                     }
               }

               var27 = var11.l6() + var2.y2() * var23 / 2.0F;

               for (float var33 = var11.k5() + var2.y2() * var24 / 2.0F;
                  var11.l6() <= var27 && var27 <= var12.l6()
                     || var11.l6() >= var27 && var27 >= var12.l6()
                     || com.aspose.slides.ms.System.q1.u3(var27) == com.aspose.slides.ms.System.q1.u3(var11.l6())
                     || com.aspose.slides.ms.System.q1.u3(var27) == com.aspose.slides.ms.System.q1.u3(var12.l6());
                  var33 += var2.y2() * var24
               ) {
                  if (var35) {
                     var2.n5(var27, var33 - var5, var27, var33);
                  }

                  if (var36) {
                     var2.n5(var27, var33, var27, var33 + var5);
                  }

                  if (var2.c8().getMajorTickMark() == 2) {
                     var27 += var2.y2() * var23 / 2.0F;
                     var33 += var2.y2() * var24 / 2.0F;
                     if (var11.k5() <= var33 && var33 <= var12.k5()
                        || var11.k5() >= var33 && var33 >= var12.k5()
                        || com.aspose.slides.ms.System.q1.u3(var33) == com.aspose.slides.ms.System.q1.u3(var11.k5())
                        || com.aspose.slides.ms.System.q1.u3(var33) == com.aspose.slides.ms.System.q1.u3(var12.k5())) {
                        if (var35) {
                           var2.n5(var27, var33 - var5, var27, var33);
                        }

                        if (var36) {
                           var2.n5(var27, var33, var27, var33 + var5);
                        }
                     }

                     var27 -= var2.y2() * var23 / 2.0F;
                     var33 -= var2.y2() * var24 / 2.0F;
                  }

                  var27 += var2.y2() * var23;
               }
            } else {
               boolean var13 = false;
               boolean var14 = false;
               switch (var2.c8().getMajorTickMark()) {
                  case 0:
                     var13 = true;
                     var14 = true;
                     break;
                  case 1:
                     if (var3.p8() >= 90 && (var3.p8() < 225 || var3.p8() >= 270)) {
                        var14 = true;
                     } else {
                        var13 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var3.p8() >= 90 && (var3.p8() < 225 || var3.p8() >= 270)) {
                        var13 = true;
                     } else {
                        var14 = true;
                     }
               }

               if (!var2.c8().isPlotOrderReversed()) {
                  var7[0].n5(var11);
                  var7[1].n5(var12);
               } else {
                  var7[1].n5(var11);
                  var7[0].n5(var12);
               }

               float var15 = (var12.l6() - var11.l6()) / var10;
               float var16 = (var12.k5() - var11.k5()) / var10;
               if (var15 == 0.0F && var16 == 0.0F) {
                  return;
               }

               float var17 = var11.l6();

               for (float var18 = var11.k5();
                  var11.k5() <= var18 && var18 <= var12.k5()
                     || var11.k5() >= var18 && var18 >= var12.k5()
                     || com.aspose.slides.ms.System.q1.u3(var18) == com.aspose.slides.ms.System.q1.u3(var11.k5())
                     || com.aspose.slides.ms.System.q1.u3(var18) == com.aspose.slides.ms.System.q1.u3(var12.k5());
                  var18 += var2.y2() * var16
               ) {
                  if (var13) {
                     var2.n5(var17, var18, var17 + var4, var18);
                  }

                  if (var14) {
                     var2.n5(var17 - var4, var18, var17, var18);
                  }

                  var17 += var2.y2() * var15;
               }

               boolean var19 = false;
               boolean var20 = false;
               switch (var2.c8().getMinorTickMark()) {
                  case 0:
                     var19 = true;
                     var20 = true;
                     break;
                  case 1:
                     if (var3.p8() >= 90 && (var3.p8() < 225 || var3.p8() >= 270)) {
                        var20 = true;
                     } else {
                        var19 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var3.p8() >= 90 && (var3.p8() < 225 || var3.p8() >= 270)) {
                        var19 = true;
                     } else {
                        var20 = true;
                     }
               }

               var17 = var11.l6() + var2.y2() * var15 / 2.0F;

               for (float var30 = var11.k5() + var2.y2() * var16 / 2.0F;
                  var11.k5() <= var30 && var30 <= var12.k5()
                     || var11.k5() >= var30 && var30 >= var12.k5()
                     || com.aspose.slides.ms.System.q1.u3(var30) == com.aspose.slides.ms.System.q1.u3(var11.k5())
                     || com.aspose.slides.ms.System.q1.u3(var30) == com.aspose.slides.ms.System.q1.u3(var12.k5());
                  var30 += var2.y2() * var16
               ) {
                  if (var19) {
                     var2.n5(var17, var30, var17 + var5, var30);
                  }

                  if (var20) {
                     var2.n5(var17 - var5, var30, var17, var30);
                  }

                  if (var2.c8().getMajorTickMark() == 2) {
                     var17 += var2.y2() * var15 / 2.0F;
                     var30 += var2.y2() * var16 / 2.0F;
                     if (var11.k5() <= var30 && var30 <= var12.k5()
                        || var11.k5() >= var30 && var30 >= var12.k5()
                        || com.aspose.slides.ms.System.q1.u3(var30) == com.aspose.slides.ms.System.q1.u3(var11.k5())
                        || com.aspose.slides.ms.System.q1.u3(var30) == com.aspose.slides.ms.System.q1.u3(var12.k5())) {
                        if (var19) {
                           var2.n5(var17, var30, var17 + var5, var30);
                        }

                        if (var20) {
                           var2.n5(var17 - var5, var30, var17, var30);
                        }
                     }

                     var17 -= var2.y2() * var15 / 2.0F;
                     var30 -= var2.y2() * var16 / 2.0F;
                  }

                  var17 += var2.y2() * var15;
               }
            }

            if (var0 <= 0) {
               return;
            }

            var7[0].l6(var7[0].k5() - var0);
            var7[1].l6(var7[1].k5() - var0);
            var0 = 0;
         }
      }
   }

   private static void n5(int var0, l5 var1) {
      n1g var2 = var1.d2();
      if ((var1.c8().getMajorTickMark() != 2 || var1.c8().getMinorTickMark() != 2) && var1.c8().isVisible()) {
         float var3 = p4.n5(var1.k5().c8());
         float var4 = p4.l6(var1.k5().c8());
         com.aspose.slides.internal.o9b.w1[] var5 = g8v.k5(var2);
         double var6 = var5[1].l6() == var5[0].l6()
            ? Math.PI / 2
            : com.aspose.slides.ms.System.q1.t9(com.aspose.slides.ms.System.q1.n5((var5[0].k5() - var5[1].k5()) / (var5[1].l6() - var5[0].l6())));
         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();
         int var10 = var1.c8().getBaseUnitScale();
         int var11 = var1.d5();
         if (var2.s3() < 0 && var0 > 0) {
            var5[0].l6(var5[0].k5() - var0);
            var5[1].l6(var5[1].k5() - var0);
            var0 = 0;
         }

         while (true) {
            if (var6 <= Math.PI / 4) {
               boolean var21 = false;
               boolean var22 = false;
               switch (var1.c8().getMajorTickMark()) {
                  case 0:
                     var21 = true;
                     var22 = true;
                     break;
                  case 1:
                     if (var2.s3() >= 0) {
                        var21 = true;
                     } else {
                        var22 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var2.s3() >= 0) {
                        var22 = true;
                     } else {
                        var21 = true;
                     }
               }

               if (!var1.c8().isPlotOrderReversed()) {
                  var5[0].n5(var8);
                  var5[1].n5(var9);
               } else {
                  var5[1].n5(var8);
                  var5[0].n5(var9);
               }

               float var23 = (var9.l6() - var8.l6()) / var11;
               float var24 = (var9.k5() - var8.k5()) / var11;
               float var26 = var8.l6();

               for (float var29 = var8.k5();
                  var8.l6() <= var26 && var26 <= var9.l6()
                     || var8.l6() >= var26 && var26 >= var9.l6()
                     || com.aspose.slides.ms.System.q1.u3(var26) == com.aspose.slides.ms.System.q1.u3(var8.l6())
                     || com.aspose.slides.ms.System.q1.u3(var26) == com.aspose.slides.ms.System.q1.u3(var9.l6());
                  var29 += var24
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.m1(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.w1(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     )
               ) {
                  if (var21) {
                     var1.n5(var26, var29 - var3, var26, var29);
                  }

                  if (var22) {
                     var1.n5(var26, var29, var26, var29 + var3);
                  }

                  var26 += var23
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.m1(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.w1(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     );
               }

               boolean var31 = false;
               boolean var32 = false;
               switch (var1.c8().getMinorTickMark()) {
                  case 0:
                     var31 = true;
                     var32 = true;
                     break;
                  case 1:
                     if (var2.s3() >= 0) {
                        var31 = true;
                     } else {
                        var32 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var2.s3() >= 0) {
                        var32 = true;
                     } else {
                        var31 = true;
                     }
               }

               var26 = var8.l6();

               for (float var30 = var8.k5();
                  var8.l6() <= var26 && var26 <= var9.l6()
                     || var8.l6() >= var26 && var26 >= var9.l6()
                     || com.aspose.slides.ms.System.q1.u3(var26) == com.aspose.slides.ms.System.q1.u3(var8.l6())
                     || com.aspose.slides.ms.System.q1.u3(var26) == com.aspose.slides.ms.System.q1.u3(var9.l6());
                  var30 += var24
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.k7(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.j5(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     )
               ) {
                  if (var31) {
                     var1.n5(var26, var30 - var4, var26, var30);
                  }

                  if (var32) {
                     var1.n5(var26, var30, var26, var30 + var4);
                  }

                  var26 += var23
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.k7(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.j5(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     );
               }
            } else {
               boolean var12 = false;
               boolean var13 = false;
               switch (var1.c8().getMajorTickMark()) {
                  case 0:
                     var12 = true;
                     var13 = true;
                     break;
                  case 1:
                     if (var2.p8() >= 90 && (var2.p8() < 225 || var2.p8() >= 270)) {
                        var13 = true;
                     } else {
                        var12 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var2.p8() >= 90 && (var2.p8() < 225 || var2.p8() >= 270)) {
                        var12 = true;
                     } else {
                        var13 = true;
                     }
               }

               if (!var1.c8().isPlotOrderReversed()) {
                  var5[0].n5(var8);
                  var5[1].n5(var9);
               } else {
                  var5[1].n5(var8);
                  var5[0].n5(var9);
               }

               float var14 = (var9.l6() - var8.l6()) / var11;
               float var15 = (var9.k5() - var8.k5()) / var11;
               float var16 = var8.l6();

               for (float var17 = var8.k5();
                  var8.k5() <= var17 && var17 <= var9.k5()
                     || var8.k5() >= var17 && var17 >= var9.k5()
                     || com.aspose.slides.ms.System.q1.u3(var17) == com.aspose.slides.ms.System.q1.u3(var8.k5())
                     || com.aspose.slides.ms.System.q1.u3(var17) == com.aspose.slides.ms.System.q1.u3(var9.k5());
                  var17 += var15
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.m1(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.w1(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     )
               ) {
                  if (var12) {
                     var1.n5(var16, var17, var16 + var3, var17);
                  }

                  if (var13) {
                     var1.n5(var16 - var3, var17, var16, var17);
                  }

                  var16 += var14
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.m1(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.w1(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           false
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        false
                     );
               }

               boolean var18 = false;
               boolean var19 = false;
               switch (var1.c8().getMinorTickMark()) {
                  case 0:
                     var18 = true;
                     var19 = true;
                     break;
                  case 1:
                     if (var2.p8() >= 90 && (var2.p8() < 225 || var2.p8() >= 270)) {
                        var19 = true;
                     } else {
                        var18 = true;
                     }
                  case 2:
                  default:
                     break;
                  case 3:
                     if (var2.p8() >= 90 && (var2.p8() < 225 || var2.p8() >= 270)) {
                        var18 = true;
                     } else {
                        var19 = true;
                     }
               }

               var16 = var8.l6();
               float var28 = var8.k5();

               while (
                  var8.k5() <= var28 && var28 <= var9.k5()
                     || var8.k5() >= var28 && var28 >= var9.k5()
                     || com.aspose.slides.ms.System.q1.u3(var28) == com.aspose.slides.ms.System.q1.u3(var8.k5())
                     || com.aspose.slides.ms.System.q1.u3(var28) == com.aspose.slides.ms.System.q1.u3(var9.k5())
               ) {
                  if (var18) {
                     var1.n5(var16, var28, var16 + var4, var28);
                  }

                  if (var19) {
                     var1.n5(var16 - var4, var28, var16, var28);
                  }

                  boolean var20 = false;
                  var16 += var14
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.k7(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.j5(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           var20
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        var20
                     );
                  var28 += var15
                     * p4.n5(
                        var10,
                        p4.l6(
                           var1.c8().getBaseUnitScale(),
                           var1.k7(),
                           com.aspose.slides.internal.v6g.k5.u3(var1.j5(), 14),
                           com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                           var20
                        ),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                        var20
                     );
               }
            }

            if (var0 <= 0) {
               return;
            }

            var5[0].l6(var5[0].k5() - var0);
            var5[1].l6(var5[1].k5() - var0);
            var0 = 0;
         }
      }
   }

   static void n5(l5 var0) {
      n1g var1 = var0.d2();
      int var2 = var1.n3().getType() != 73 ? var1.n3().getType() : var1.n3().getChartData().getSeries().get_Item(0).getType();
      com.aspose.slides.internal.o9b.w1[] var3 = g8v.k5(var1);
      if (!var0.d2().q0().c8().isPlotOrderReversed() && var0.d2().q0().c8().getCrossType() != 1) {
         var0.n5(var3[0].l6(), var3[0].k5(), var3[1].l6(), var3[1].k5());
      } else {
         var0.n5(var3[2].l6(), var3[2].k5() - var1.e5().a6(), var3[3].l6(), var3[3].k5() - var1.e5().a6());
      }

      g3y var4 = var0.d2().y4().get_Item(0);
      t9z var5 = var4.c8().get_Item(0);
      String var6 = var5.u3();
      boolean var7 = false;
      float var8 = 0.0F;
      if (!var0.d2().q0().c8().isPlotOrderReversed() && var0.d2().q0().c8().getCrossType() != 1) {
         var8 = var3[0].k5() + p4.n5(var0.k5().c8());
      } else {
         var8 = var3[2].k5() - var1.e5().a6() - p4.n5(var0.k5().c8()) - var0.a6().k5();
      }

      List var9 = var0.h0;
      double var10 = var0.c8().isLogarithmic() ? var0.n5(var0.z3()) : var0.z3();
      double var12 = var0.c8().isLogarithmic() ? var0.n5(var0.q0()) : var0.q0();
      double var14 = var0.c8().isLogarithmic() ? var0.n5(var0.w1()) : var0.w1();

      for (int var16 = 0; var16 < var0.h0.size(); var16++) {
         double var17 = com.aspose.slides.internal.v6g.k5.u3(var0.h0.get_Item(var16), double.class);
         double var19 = var0.c8().isLogarithmic() ? var0.l6(var17) : var17;
         if (var16 - 1 > 0
            ? com.aspose.slides.ms.System.q1.n5(g6z.n5(var17, com.aspose.slides.internal.v6g.k5.u3(var9.get_Item(var16 - 1), double.class))) == var14
            : var16 + 1 >= var9.size()
               || com.aspose.slides.ms.System.q1.n5(g6z.n5(var17, com.aspose.slides.internal.v6g.k5.u3(var9.get_Item(var16 + 1), double.class))) == var14) {
            float var21 = (float)((var17 - var12) / (var10 - var12) * var1.e5().u3());
            if (!var0.d2().q0().c8().isPlotOrderReversed() && var0.d2().q0().c8().getCrossType() != 1) {
               if (!var0.c8().isPlotOrderReversed()) {
                  var21 = var3[0].l6() + var21;
               } else {
                  var21 = var3[1].l6() - var21;
               }
            } else if (!var0.c8().isPlotOrderReversed()) {
               var21 = var3[2].l6() + var21;
            } else {
               var21 = var3[3].l6() - var21;
            }

            if (var0.c8().getTickLabelPosition() != 3) {
               if (ChartTypeCharacterizer.s7(var2)) {
                  var19 /= 100.0;
                  var6 = "0%";
               }

               String var22 = "";
               var19 = var0.c8().isLogarithmic() ? var19 : var19 * p4.n5(var0);
               com.aspose.slides.internal.o9b.c8 var23 = var0.u3().o8();
               if (var0.n3()) {
                  var22 = t7k.n5(var19, var6, var7);
                  t7k.n5(var19, var6, var23.o8()).n5(var23);
               } else {
                  var22 = p4.n5(var19, var0);
                  t7k.n5(var19, var0.c8().getNumberFormat(), var23.o8()).n5(var23);
               }

               com.aspose.slides.internal.o9b.y1 var24 = new com.aspose.slides.internal.o9b.y1(var21 - var0.n5 / 2.0F, var8, var0.n5, var0.l6);
               h6l.n5(
                  com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var24.y4())).y4(),
                  var22,
                  var0.u9(),
                  var0.l6(),
                  var23.o8(),
                  1,
                  1,
                  var1
               );
            }
         }
      }

      l6(var0);
   }

   private static void l6(l5 var0) {
      if (var0.c8().isVisible()) {
         n1g var1 = var0.d2();
         com.aspose.slides.internal.o9b.w1[] var2 = g8v.k5(var1);
         com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1();
         boolean var5 = false;
         boolean var6 = false;
         if (!var0.c8().isPlotOrderReversed()) {
            var2[0].n5(var3);
            var2[1].n5(var4);
         } else {
            var2[1].n5(var3);
            var2[0].n5(var4);
         }

         float var7 = (float)((var4.l6() - var3.l6()) / (var0.z3() - var0.q0()));
         if (var0.c8().getMajorTickMark() != 2) {
            switch (var0.c8().getMajorTickMark()) {
               case 0:
                  var5 = true;
                  var6 = true;
                  break;
               case 1:
                  var5 = true;
               case 2:
               default:
                  break;
               case 3:
                  var6 = true;
            }

            float var8 = var3.l6();
            float var9 = var3.k5();
            float var10 = p4.n5(var0.k5().c8());

            while (
               var3.l6() <= var8 && var8 <= var4.l6()
                  || var3.l6() >= var8 && var8 >= var4.l6()
                  || com.aspose.slides.ms.System.q1.u3(var8) == com.aspose.slides.ms.System.q1.u3(var3.l6())
                  || com.aspose.slides.ms.System.q1.u3(var8) == com.aspose.slides.ms.System.q1.u3(var4.l6())
            ) {
               if (var5) {
                  var0.n5(var8, var9 - var10, var8, var9);
               }

               if (var6) {
                  var0.n5(var8, var9, var8, var9 + var10);
               }

               var8 += var7 * (float)var0.w1();
            }
         }

         if (var0.c8().getMinorTickMark() != 2) {
            var5 = false;
            var6 = false;
            switch (var0.c8().getMinorTickMark()) {
               case 0:
                  var5 = true;
                  var6 = true;
                  break;
               case 1:
                  var5 = true;
               case 2:
               default:
                  break;
               case 3:
                  var6 = true;
            }

            float var13 = var3.l6();
            float var14 = var3.k5();
            float var15 = p4.l6(var0.k5().c8());

            while (
               var3.l6() <= var13 && var13 <= var4.l6()
                  || var3.l6() >= var13 && var13 >= var4.l6()
                  || com.aspose.slides.ms.System.q1.u3(var13) == com.aspose.slides.ms.System.q1.u3(var3.l6())
                  || com.aspose.slides.ms.System.q1.u3(var13) == com.aspose.slides.ms.System.q1.u3(var4.l6())
            ) {
               if (var5) {
                  var0.n5(var13, var14 - var15, var13, var14);
               }

               if (var6) {
                  var0.n5(var13, var14, var13, var14 + var15);
               }

               var13 += var7 * (float)var0.j5();
            }
         }
      }
   }

   static void n5(int var0, com.aspose.slides.internal.o9b.y2 var1, l5 var2, n1g var3) {
      if (var2.c8().getCategoryAxisType() == 1) {
         u3(var2, var3);
      } else {
         com.aspose.slides.internal.o9b.w1[] var4 = g8v.k5(var3);
         double var5;
         if (var3.m1().c8().isPlotOrderReversed()) {
            var5 = var3.m1().z3() - var3.m1().t4();
         } else {
            var5 = var3.m1().t4() - var3.m1().q0();
         }

         int var7 = com.aspose.slides.internal.v6g.k5.u3(var5 / (var3.m1().z3() - var3.m1().q0()) * var3.e5().u3(), 14);
         if (var7 != 0) {
            var2.n5(var4[0].l6() + var7, var4[0].k5(), var4[0].l6() + var7, var4[0].k5() - var3.e5().a6());
         }

         if (var3.s3() >= 0) {
            var2.n5(var4[0].l6(), var4[0].k5(), var4[0].l6(), var4[0].k5() - var3.e5().a6());
         }

         if (var2.c8().getTickLabelPosition() == 2) {
            var4[0].n5(var4[0].l6() + var7);
         }

         float var8 = 0.0F;
         float var9 = var2.s7();
         if (var2.c8().getTickLabelPosition() != 3) {
            float var10 = var2.k5().c8();
            var9 += p4.n5(var10) + p4.l6(var10);
         }

         byte var26 = 2;
         var8 = var4[0].l6() - var2.u3 - var9;
         float var11 = var3.e5().a6() / var0;
         List var12 = var3.l6();
         boolean var13 = var2.n3() && var12.size() > 0;

         for (int var14 = 0; var14 < var0; var14++) {
            double var15 = var14 * var11;
            var15 += var11 / 2.0F;
            float var17;
            if (var2.c8().isPlotOrderReversed()) {
               var17 = (float)(var4[0].k5() - var3.e5().a6() + var15) - var2.k5 / 2.0F;
            } else {
               var17 = (float)(var4[0].k5() - var15) - var2.k5 / 2.0F;
            }

            if (var2.c8().getTickLabelPosition() != 3 && var14 % var2.r4() == 0 && var14 < var2.h0.size()) {
               String var18 = "";
               com.aspose.slides.internal.o9b.c8 var19 = var2.u3().o8();
               if (!var13) {
                  var18 = p4.n5(var2.h0.get_Item(var14), var2);
                  t7k.n5(var2.h0.get_Item(var14), var2.c8().getNumberFormat(), var19.o8()).n5(var19);
               } else {
                  String var20 = "";
                  boolean var21 = false;
                  var20 = var14 < var12.size() ? ((x4)var12.get_Item(var14)).u9() : "";
                  var21 = var14 < var12.size() && ((x4)var12.get_Item(var14)).a6();
                  var18 = t7k.n5(var2.h0.get_Item(var14), var20, var21);
                  t7k.n5(var2.h0.get_Item(var14), var20, var19.o8()).n5(var19);
               }

               com.aspose.slides.internal.o9b.y1 var33 = new com.aspose.slides.internal.o9b.y1(var8, var17, var2.u3, var2.k5);
               h6l.n5(
                  com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var33.y4())).y4(),
                  var18,
                  var2.u9(),
                  var2.l6(),
                  var19.o8(),
                  var26,
                  2,
                  var3
               );
            }
         }

         l6(var7, var0, var2);
         List[] var27 = var3.u3();
         if (var27 != null && var27.length > 0 && var12.size() > 0 && var2.c8().getTickLabelPosition() != 3) {
            float var29 = 0.0F;
            if (!var2.c8().isPlotOrderReversed()) {
               var29 = var4[0].k5();
            } else {
               var29 = var4[0].k5() - var3.e5().a6();
            }

            var8 = var4[0].l6() - var9 * (var27.length + 1) - var2.n5;
            float var22 = var4[0].l6();
            boolean var23 = true;
            p4.n5(var27, var23, var11, var1.n3(), var9, var22, var8, var29, var2);
         }
      }
   }

   private static void u3(l5 var0, n1g var1) {
      y9r var2 = var1.e5();
      com.aspose.slides.internal.o9b.w1[] var3 = g8v.k5(var1);
      double var4;
      if (var1.m1().c8().isPlotOrderReversed()) {
         var4 = var1.m1().z3() - var1.m1().t4();
      } else {
         var4 = var1.m1().t4() - var1.m1().q0();
      }

      int var6 = com.aspose.slides.internal.v6g.k5.u3(var4 / (var1.m1().z3() - var1.m1().q0()) * var1.e5().u3(), 14);
      if (var6 != 0) {
         var0.n5(var3[0].l6() + var6, var3[0].k5(), var3[0].l6() + var6, var3[0].k5() - var1.e5().a6());
      }

      if (var1.s3() >= 0) {
         var0.n5(var3[0].l6(), var3[0].k5(), var3[0].l6(), var3[0].k5() - var1.e5().a6());
      }

      if (var0.c8().getTickLabelPosition() == 2) {
         var3[0].n5(var3[0].l6() + var6);
      }

      List var7 = var0.h0;
      float var8 = 0.0F;
      float var9 = var0.s7();
      float var10 = var0.l6 / 2.0F;
      byte var11 = 2;
      var8 = var3[0].l6() - var0.n5 - var9;
      List var12 = var1.l6();
      boolean var13 = var0.n3() && var12.size() > 0;
      int var14 = com.aspose.slides.internal.v6g.k5.u3(var0.z3(), 14);
      int var15 = com.aspose.slides.internal.v6g.k5.u3(var0.q0(), 14);
      int var16 = var0.c8().getBaseUnitScale();
      int var17 = p4.n5(var16, var14, var15, var14, false) + 1;
      float var18 = var2.a6() / var17;

      for (int var19 = 0; var19 < var7.size(); var19++) {
         int var20 = com.aspose.slides.ms.System.z3.h0(var0.h0.get_Item(var19));
         int var21 = p4.n5(var16, var20, var15, var14, false);
         float var22 = var18 * var21;
         var22 += var18 / 2.0F;
         float var23 = var0.c8().isPlotOrderReversed() ? var3[0].k5() - var1.e5().a6() + var22 : var3[0].k5() - var22;
         if (var0.c8().getTickLabelPosition() != 3 && var19 % var0.r4() == 0 && var19 < var0.h0.size()) {
            String var24 = "";
            com.aspose.slides.internal.o9b.c8 var25 = var0.u3().o8();
            if (!var13) {
               var24 = p4.n5(var0.h0.get_Item(var19), var0);
               t7k.n5(var0.h0.get_Item(var19), var0.c8().getNumberFormat(), var25.o8()).n5(var25);
            } else {
               String var26 = "";
               boolean var27 = false;
               var26 = var19 < var12.size() ? ((x4)var12.get_Item(var19)).u9() : "";
               var27 = var19 < var12.size() && ((x4)var12.get_Item(var19)).a6();
               var24 = t7k.n5(var0.h0.get_Item(var19), var26, var27);
               t7k.n5(var0.h0.get_Item(var19), var26, var25.o8()).n5(var25);
            }

            com.aspose.slides.internal.o9b.y1 var32 = new com.aspose.slides.internal.o9b.y1(var8, var23 - var10, var0.n5, var0.l6);
            h6l.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var32.y4())).y4(),
               var24,
               var0.u9(),
               var0.l6(),
               var25.o8(),
               var11,
               2,
               var1
            );
         }
      }

      l6(var6, var0);
   }

   private static void l6(int var0, int var1, l5 var2) {
      n1g var3 = var2.d2();
      y9r var4 = var3.e5();
      if ((var2.c8().getMajorTickMark() != 2 || var2.c8().getMinorTickMark() != 2) && var2.c8().isVisible()) {
         com.aspose.slides.internal.o9b.w1[] var5 = g8v.k5(var3);
         new com.aspose.slides.internal.o9b.w1();
         new com.aspose.slides.internal.o9b.w1();

         while (true) {
            boolean var8 = false;
            boolean var9 = false;
            switch (var2.c8().getMajorTickMark()) {
               case 0:
                  var8 = true;
                  var9 = true;
                  break;
               case 1:
                  var8 = true;
               case 2:
               default:
                  break;
               case 3:
                  var9 = true;
            }

            boolean var10 = false;
            boolean var11 = false;
            switch (var2.c8().getMinorTickMark()) {
               case 0:
                  var10 = true;
                  var11 = true;
                  break;
               case 1:
                  var10 = true;
               case 2:
               default:
                  break;
               case 3:
                  var11 = true;
            }

            com.aspose.slides.internal.o9b.w1 var6;
            com.aspose.slides.internal.o9b.w1 var7;
            if (var2.c8().isPlotOrderReversed()) {
               var6 = new com.aspose.slides.internal.o9b.w1(var5[0].l6(), var5[0].k5() - var4.a6());
               var7 = new com.aspose.slides.internal.o9b.w1(var5[0].l6(), var5[0].k5());
            } else {
               var6 = new com.aspose.slides.internal.o9b.w1(var5[0].l6(), var5[0].k5());
               var7 = new com.aspose.slides.internal.o9b.w1(var5[0].l6(), var5[0].k5() - var4.a6());
            }

            float var12 = (var7.k5() - var6.k5()) / var1;
            float var13 = var6.l6();
            float var14 = var6.k5();
            float var15 = p4.n5(var2.k5().c8());

            while (
               var6.k5() <= var14 && var14 <= var7.k5()
                  || var6.k5() >= var14 && var14 >= var7.k5()
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var6.k5())
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var7.k5())
            ) {
               if (var6.k5() <= var14 && var14 <= var7.k5()
                  || var6.k5() >= var14 && var14 >= var7.k5()
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var6.k5())
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var7.k5())) {
                  if (var8) {
                     var2.n5(var13, var14, var13 + var15, var14);
                  }

                  if (var9) {
                     var2.n5(var13 - var15, var14, var13, var14);
                  }
               }

               float var16 = var14 - var2.y2() * var12 / 2.0F;
               if (var6.k5() <= var16 && var16 <= var7.k5()
                  || var6.k5() >= var16 && var16 >= var7.k5()
                  || com.aspose.slides.ms.System.q1.u3(var16) == com.aspose.slides.ms.System.q1.u3(var6.k5())
                  || com.aspose.slides.ms.System.q1.u3(var16) == com.aspose.slides.ms.System.q1.u3(var7.k5())) {
                  if (var10) {
                     var2.n5(var13, var16, var13 + var15, var16);
                  }

                  if (var11) {
                     var2.n5(var13 - var15, var16, var13, var16);
                  }
               }

               var14 += var2.y2() * var12;
            }

            if (var2.y2() * var12 > var7.k5() - var6.k5()) {
               float var17 = var14 - var2.y2() * var12 / 2.0F;
               if (var6.k5() <= var17 && var17 <= var7.k5()
                  || var6.k5() >= var17 && var17 >= var7.k5()
                  || com.aspose.slides.ms.System.q1.u3(var17) == com.aspose.slides.ms.System.q1.u3(var6.k5())
                  || com.aspose.slides.ms.System.q1.u3(var17) == com.aspose.slides.ms.System.q1.u3(var7.k5())) {
                  if (var10) {
                     var2.n5(var13, var17, var13 + var15, var17);
                  }

                  if (var11) {
                     var2.n5(var13 - var15, var17, var13, var17);
                  }
               }
            }

            if (var0 <= 0) {
               return;
            }

            var5[0].n5(var5[0].l6() + var0);
            var0 = 0;
         }
      }
   }

   private static void l6(int var0, l5 var1) {
      n1g var2 = var1.d2();
      y9r var3 = var2.e5();
      if ((var1.c8().getMajorTickMark() != 2 || var1.c8().getMinorTickMark() != 2) && var1.c8().isVisible()) {
         com.aspose.slides.internal.o9b.w1[] var4 = g8v.k5(var2);
         new com.aspose.slides.internal.o9b.w1();
         new com.aspose.slides.internal.o9b.w1();

         while (true) {
            boolean var7 = false;
            boolean var8 = false;
            switch (var1.c8().getMajorTickMark()) {
               case 0:
                  var7 = true;
                  var8 = true;
                  break;
               case 1:
                  var7 = true;
               case 2:
               default:
                  break;
               case 3:
                  var8 = true;
            }

            com.aspose.slides.internal.o9b.w1 var5;
            com.aspose.slides.internal.o9b.w1 var6;
            if (var1.c8().isPlotOrderReversed()) {
               var5 = new com.aspose.slides.internal.o9b.w1(var4[0].l6(), var4[0].k5() - var3.a6());
               var6 = new com.aspose.slides.internal.o9b.w1(var4[0].l6(), var4[0].k5());
            } else {
               var5 = new com.aspose.slides.internal.o9b.w1(var4[0].l6(), var4[0].k5());
               var6 = new com.aspose.slides.internal.o9b.w1(var4[0].l6(), var4[0].k5() - var3.a6());
            }

            int var9 = var1.c8().getBaseUnitScale();
            double var10;
            if (var1.y4() == 0 && var1.c8().getCategoryAxisType() == 1) {
               var10 = p4.n5(
                     var9,
                     com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                     false
                  )
                  + 1.0;
            } else {
               var10 = var1.z3() - var1.q0();
            }

            float var12 = (float)((var6.k5() - var5.k5()) / var10);
            float var13 = var5.l6();
            float var14 = var5.k5();
            float var15 = p4.n5(var1.k5().c8());

            while (
               var5.k5() <= var14 && var14 <= var6.k5()
                  || var5.k5() >= var14 && var14 >= var6.k5()
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var5.k5())
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var6.k5())
            ) {
               if (var7) {
                  var1.n5(var13, var14, var13 + var15, var14);
               }

               if (var8) {
                  var1.n5(var13 - var15, var14, var13, var14);
               }

               var14 += var12
                  * p4.n5(
                     var9,
                     p4.l6(
                        var1.c8().getBaseUnitScale(),
                        var1.m1(),
                        com.aspose.slides.internal.v6g.k5.u3(var1.w1(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        false
                     ),
                     com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                     false
                  );
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

            var13 = var5.l6();
            var14 = var5.k5();
            float var18 = p4.l6(var1.k5().c8());

            while (
               var5.k5() <= var14 && var14 <= var6.k5()
                  || var5.k5() >= var14 && var14 >= var6.k5()
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var5.k5())
                  || com.aspose.slides.ms.System.q1.u3(var14) == com.aspose.slides.ms.System.q1.u3(var6.k5())
            ) {
               if (var16) {
                  var1.n5(var13, var14, var13 + var18, var14);
               }

               if (var17) {
                  var1.n5(var13 - var18, var14, var13, var14);
               }

               var14 += var12
                  * p4.n5(
                     var9,
                     p4.l6(
                        var1.c8().getBaseUnitScale(),
                        var1.k7(),
                        com.aspose.slides.internal.v6g.k5.u3(var1.j5(), 14),
                        com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                        false
                     ),
                     com.aspose.slides.internal.v6g.k5.u3(var1.q0(), 14),
                     com.aspose.slides.internal.v6g.k5.u3(var1.z3(), 14),
                     false
                  );
            }

            if (var0 <= 0) {
               return;
            }

            var4[0].n5(var4[0].l6() + var0);
            var0 = 0;
         }
      }
   }

   static void l6(l5 var0, n1g var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = g8v.u3(var1);
      double var3 = var1.m1().e2();
      double var5 = var1.m1().t9();
      double var7 = var1.m1().z1();
      boolean var9 = var1.m1().q0() == var1.m1().t4();
      if (var1.m1().c8().isPlotOrderReversed()) {
         var7 = var3 - var7;
      } else {
         var7 -= var5;
      }

      int var10 = com.aspose.slides.internal.v6g.k5.u3(var7 / (var3 - var5) * var1.e5().a6(), 14);
      if (var10 != 0) {
         var0.n5(var2[0].l6(), var2[0].k5() - var10, var2[1].l6(), var2[1].k5() - var10);
      }

      if (var1.s3() >= 0) {
         var0.n5(var2[0].l6(), var2[0].k5(), var2[1].l6(), var2[1].k5());
      }

      if (var0.c8().getTickLabelPosition() == 2) {
         var2[0].l6(var2[0].k5() - var10);
         var2[1].l6(var2[1].k5() - var10);
      }

      float var11 = var0.s7();
      double var12 = var2[1].l6() == var2[0].l6()
         ? Math.PI / 2
         : com.aspose.slides.ms.System.q1.t9(com.aspose.slides.ms.System.q1.n5((var2[0].k5() - var2[1].k5()) / (var2[1].l6() - var2[0].l6())));
      float var14 = (var2[1].l6() - var2[0].l6()) / var0.h0.size();
      float var15 = (var2[1].k5() - var2[0].k5()) / var0.h0.size();

      for (int var16 = 0; var16 < var0.h0.size(); var16++) {
         int var17 = var16;
         if (var0.c8().isPlotOrderReversed()) {
            var17 = var0.h0.size() - 1 - var16;
         }

         String var18 = "";
         var18 = p4.n5(var0.h0.get_Item(var17), var0);
         if (var0.c8().getTickLabelPosition() != 3 && var17 % var0.r4() == 0) {
            com.aspose.slides.internal.o9b.y1 var19 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
            if (var1.s3() >= 0) {
               if (var2[0].k5() == var2[1].k5()) {
                  var19.k5(var14 < 0.0F ? var2[0].l6() + (var16 + 1) * var14 : var2[0].l6() + var16 * var14);
                  var19.u3(var2[0].k5() + var11);
                  var19.l6(com.aspose.slides.ms.System.q1.n5(var14));
                  var19.n5(var0.l6);
               } else if (var12 <= Math.PI / 4) {
                  var19.k5(var14 < 0.0F ? var2[0].l6() + (var16 + 1) * var14 : var2[0].l6() + var16 * var14);
                  var19.u3(var15 > 0.0F ? var2[0].k5() + (var16 + 1) * var15 : var2[0].k5() + var16 * var15);
                  var19.l6(com.aspose.slides.ms.System.q1.n5(var14));
                  var19.n5(var0.l6);
               } else {
                  var19.k5(var15 > 0.0F ? var2[0].l6() + var16 * var14 : var2[0].l6() + (var16 + 1) * var14);
                  var19.k5(
                     var14 * var15 <= 0.0F
                        ? var19.x8() + var11 * (float)com.aspose.slides.ms.System.q1.h0(var12)
                        : var19.x8() - var11 * (float)com.aspose.slides.ms.System.q1.h0(var12) - var0.n5
                  );
                  var19.u3(var15 > 0.0F ? var2[0].k5() + var16 * var15 : var2[0].k5() + (var16 + 1) * var15);
                  var19.u3(var19.n3() + (com.aspose.slides.ms.System.q1.n5(var15) - var0.l6) * (float)com.aspose.slides.ms.System.q1.h0(var12) / 2.0F);
                  var19.l6(var0.n5);
                  var19.n5(var0.l6);
               }
            } else if (var1.s3() < 0 && !var9 && var0.c8().getTickLabelPosition() == 2) {
               if (var2[0].k5() == var2[1].k5()) {
                  var19.k5(var14 > 0.0F ? var2[0].l6() + var16 * var14 : var2[0].l6() + (var16 + 1) * var14);
                  var19.u3(var2[0].k5() - var0.l6 - var11);
                  var19.l6(com.aspose.slides.ms.System.q1.n5(var14));
                  var19.n5(var0.l6);
               } else if (var12 <= Math.PI / 4) {
                  var19.k5(var14 < 0.0F ? var2[0].l6() + (var16 + 1) * var14 : var2[0].l6() + var16 * var14);
                  var19.u3(var15 < 0.0F ? var2[0].k5() + (var16 + 1) * var15 : var2[0].k5() + var16 * var15);
                  var19.u3(var19.n3() - var0.l6);
                  var19.l6(com.aspose.slides.ms.System.q1.n5(var14));
                  var19.n5(var0.l6);
               } else {
                  var19.k5(var15 < 0.0F ? var2[0].l6() + var16 * var14 : var2[0].l6() + (var16 + 1) * var14);
                  var19.k5(
                     var14 * var15 >= 0.0F
                        ? var19.x8() + var11 * (float)com.aspose.slides.ms.System.q1.h0(var12)
                        : var19.x8() - var11 * (float)com.aspose.slides.ms.System.q1.h0(var12) - var0.n5
                  );
                  var19.u3(var15 < 0.0F ? var2[0].k5() + var16 * var15 : var2[0].k5() + (var16 + 1) * var15);
                  var19.u3(var19.n3() - (com.aspose.slides.ms.System.q1.n5(var15) - var0.l6) * (float)com.aspose.slides.ms.System.q1.h0(var12) / 2.0F);
                  var19.u3(var19.n3() - var0.l6);
                  var19.l6(var0.n5);
                  var19.n5(var0.l6);
               }
            }

            var19.l6(var0.n5);
            var19.n5(var0.l6);
            h6l.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var19.y4())).y4(),
               var18,
               var0.u9(),
               var0.l6(),
               var0.u3().o8(),
               1,
               2,
               var1
            );
         }
      }

      n5(var10, var0.h0.size(), var0);
   }

   public void n5(y9 var1) {
   }

   public y9 n5() {
      y9 var1 = new y9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(y9 var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y9) ? false : this.l6((y9)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y9 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
