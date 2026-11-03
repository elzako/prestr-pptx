package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z7d extends com.aspose.slides.internal.v6g.h0<z7d> {
   public z7d() {
   }

   private static com.aspose.slides.internal.o9b.f2 k5(n1g var0) {
      List var1 = var0.y4();
      com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

      for (int var6 = 0; var6 < var1.size(); var6++) {
         g3y var7 = (g3y)var1.get_Item(var6);
         var5.n5(var7.k5(), var0.t2().k5()).l6(var3);
         if (var2.l6() < var3.l6()) {
            var2.n5(var3.l6());
         }

         if (var2.k5() < var3.k5()) {
            var2.l6(var3.k5());
         }
      }

      return var2;
   }

   private static boolean n5(List<g3y> var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < var0.size(); var2++) {
         g3y var3 = (g3y)var0.get_Item(var2);
         if (var3.u9().getFormat().getLine().getFillFormat().getFillType() != 0 && ChartTypeCharacterizer.a6(var3.u9().getType())) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   static com.aspose.slides.internal.o9b.f2 n5(n1g var0) {
      com.aspose.slides.internal.o9b.f2 var1 = k5(var0).a6();
      float var2 = var1.k5() * 0.5F;
      float var3 = var1.k5();
      boolean var4 = n5(var0.y4());
      if (var4) {
         var2 = 28.0F;
      }

      return new com.aspose.slides.internal.o9b.f2(var2, var3);
   }

   static boolean n5(Legend var0) {
      return !com.aspose.slides.ms.System.n1.k5(var0.n5().getX())
         || !com.aspose.slides.ms.System.n1.k5(var0.n5().getY())
         || !com.aspose.slides.ms.System.n1.k5(var0.n5().getWidth())
         || !com.aspose.slides.ms.System.n1.k5(var0.n5().getHeight())
         || var0.n5().u9() != null
         || var0.n5().h0() != null
         || var0.n5().c8() != null
         || var0.n5().t2() != null
         || var0.n5().s7() != null
         || var0.n5().x8() != null;
   }

   static void n5(com.aspose.slides.internal.o9b.y1 var0, g3y var1, t9z var2) {
      if (ChartTypeCharacterizer.isChartTypeBubble(var1.u9().getType())) {
         float var3 = var0.s7();
         com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(var0.x8(), var0.n3() + (var0.k5() - var3) / 2.0F, var3, var3);
         com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
         var5.n5(var4.y4());
         var1.k5(var5);
         var1.n5(var5);
      } else if (!ChartTypeCharacterizer.a6(var1.u9().getType())) {
         float var7 = var0.s7();
         com.aspose.slides.internal.o9b.y1 var9 = new com.aspose.slides.internal.o9b.y1(var0.x8(), var0.n3() + (var0.k5() - var7) / 2.0F, var7, var7);
         if (var1.t2().y4().size() == 1) {
            boolean var11 = var2.k5(var9.y4());
            if (!var11) {
               var2.n5(var9.y4());
               var2.l6(var9.y4());
            }
         } else {
            var1.l6(var9.y4());
            var1.n5(var9.y4());
         }
      } else {
         if (var1.u9().getFormat().getLine().getFillFormat().getFillType() != 0 || var1.u9().getFormat().getLine().getFillFormat().getFillType() != -1) {
            var1.n5(
               new com.aspose.slides.internal.o9b.w1(var0.x8(), var0.n3() + var0.k5() / 2.0F),
               new com.aspose.slides.internal.o9b.w1(var0.x8() + var0.s7(), var0.n3() + var0.k5() / 2.0F)
            );
         }

         if (var1.u9().getMarker() != null) {
            float var8 = var0.x8() + var0.s7() / 2.0F;
            float var10 = var0.n3() + var0.k5() / 2.0F;
            float var6 = var0.k5() * 0.5F;
            float var12 = var1.u9().getMarker().getSize();
            if (var12 > var6) {
               var12 = var6;
            }

            var1.s7().n5(var8, var10, var12);
         }
      }
   }

   static boolean n5(Chart var0) {
      if (var0.getChartData().getSeries().size() != 1) {
         return false;
      }

      if (var0.getChartData().getSeries().get_Item(0).getTrendLines() != null && var0.getChartData().getSeries().get_Item(0).getTrendLines().getCount() > 0) {
         return false;
      }

      ChartSeries var1 = (ChartSeries)var0.getChartData().getSeries().get_Item(0);
      int[] var2 = new int[]{
         0,
         2,
         6,
         5,
         3,
         4,
         1,
         34,
         32,
         37,
         33,
         35,
         19,
         21,
         24,
         25,
         20,
         23,
         22,
         53,
         54,
         55,
         56,
         57,
         70,
         72,
         71,
         68,
         69,
         7,
         9,
         38,
         40,
         39,
         10,
         8,
         11,
         13,
         12,
         41,
         43,
         42,
         14,
         15,
         17,
         44,
         46,
         45,
         18,
         16
      };
      int var3 = 0;

      while (var3 < var2.length && var1.getType() != var2[var3]) {
         var3++;
      }

      if (var3 == var2.length) {
         return false;
      }

      IChartDataPointCollection var4 = var1.getDataPoints();
      return var1.isColorVaried() ? true : var4.size() > 0 && !n5(var4);
   }

   private static boolean n5(IChartDataPointCollection var0) {
      for (int var1 = 1; var1 < var0.size(); var1++) {
         boolean var2 = var0.get_Item(0).getFormat().equals(var0.get_Item(var1).getFormat());
         boolean var3 = var0.get_Item(0).getMarker().getFormat().equals(var0.get_Item(var1).getMarker().getFormat());
         boolean var4 = com.aspose.slides.ms.System.a3.l6(var0.get_Item(0).getMarker().getSize(), var0.get_Item(var1).getMarker().getSize());
         boolean var5 = com.aspose.slides.ms.System.s3.n5(
            MarkerStyleType.class, var0.get_Item(0).getMarker().getSymbol(), MarkerStyleType.class, var0.get_Item(var1).getMarker().getSymbol()
         );
         if (!var2 || !var3 || !var4 || !var5) {
            return false;
         }
      }

      return true;
   }

   static void n5(g3y var0, n1g var1, Legend var2, g3y var3) {
      g3b var4 = var1.t2();
      n2z var5 = var4.n5;
      if (!com.aspose.slides.ms.System.n1.k5(var2.getX()) && !com.aspose.slides.ms.System.n1.k5(var2.getY())) {
         var5.n5.k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var2.getX() * var1.c4(), 13));
         var5.n5.u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0() + var2.getY() * var1.y2(), 13));
         if (var5.n5.s7() < 0) {
            var5.n5.k5(0);
         }

         if (var5.n5.x8() < 0) {
            var5.n5.u3(0);
         }
      }

      List var6 = var0.c8();
      var5.n5();
      com.aspose.slides.internal.o9b.f2 var7 = n5(var1).a6();
      com.aspose.slides.internal.o9b.f2 var8 = n5(var0, var1).a6();
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var7.l6() + var8.l6(), 13);
      int var10 = var5.n5.t2();
      int var11 = var5.n5.l6();
      int var12 = (var10 - 4) / var9;
      if (var12 <= 0) {
         var12 = 1;
      }

      int var13 = g6z.n5((float)var4.t9() / var12);
      float var14 = (float)(var10 - var9 * var12) / var12;
      if (var14 < 0.0F) {
         var14 = 0.0F;
      }

      float var15 = com.aspose.slides.internal.v6g.k5.u3((var11 - 8 - var8.k5() * var13) / var13, 13);
      if (var15 < 0.0F && -var15 > var7.k5() * 0.6F) {
         var15 = -var7.k5() * 0.6F;
      }

      com.aspose.slides.internal.o9b.f2 var16 = l6(var0, var1).a6();
      int var17 = com.aspose.slides.internal.v6g.k5.u3(var7.l6() * var6.size() + var16.l6(), 13);
      if (var17 <= var10 - 4) {
         var12 = 1;
         byte var28 = 1;
         var14 = (var10 - 4.0F - var17) / var6.size();
         var15 = com.aspose.slides.internal.v6g.k5.u3((var11 - var8.k5() * var28) / var28, 13);
      }

      float var18 = var5.n5.s7() + 4.0F;
      float var19 = var5.n5.x8();
      var18 += var14 / 2.0F;
      var19 += var15 / 2.0F;
      List var20;
      if (!var0.u9().getPlotOnSecondAxis()) {
         var20 = var1.l6();
      } else {
         var20 = var1.k5();
      }

      for (int var21 = 1; var21 <= var6.size(); var21++) {
         if (var21 > var4.y4().size() || !var4.y4().get_Item(var21 - 1).a6().getHide()) {
            if (var19 + var7.k5() * 0.6F > var5.n5.x8() + var5.n5.l6()) {
               break;
            }

            com.aspose.slides.internal.o9b.y1 var22 = new com.aspose.slides.internal.o9b.y1(var18, var19, var7.l6(), var7.k5());
            n5(var22.y4(), var0, var21 - 1, var1);
            String var23 = com.aspose.slides.ms.System.a3.n5(var21, com.aspose.slides.internal.x7n.l6.k5());
            if (var21 - 1 < var20.size()) {
               var23 = n5((x4)var20.get_Item(var21 - 1));
            } else if (var20.size() != 0) {
               var23 = " ";
            }

            float var24 = (float)(var10 - 4) / var12;
            float var25 = var5.n5.l6() < var8.k5() ? var8.k5() : var5.n5.l6();
            if (var19 + var7.k5() > var5.n5.x8() + var5.n5.l6()) {
               var25 -= var19 + var7.k5() - var5.n5.x8() + var5.n5.l6();
            }

            com.aspose.slides.internal.o9b.y1 var26 = new com.aspose.slides.internal.o9b.y1(var18 + var7.l6(), var19, var24 - var7.l6(), var25);
            com.aspose.slides.internal.o9b.f2 var27 = com.aspose.slides.internal.o9b.p8.n5(
                  h6l.n5(var23, 0.0F, var4.n5(), 0, var1, new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F))
               )
               .a6();
            h6l.n5(var26.y4(), var23, 0, var4.n5(), var4.l6().o8(), 0, 2, var1);
            if (var17 <= var10 - 4) {
               var18 += var7.l6() + var27.l6();
               var18 += var14;
            } else {
               var18 += var9;
               var18 += var14;
               if (var21 % var12 == 0) {
                  var18 = var5.n5.s7() + 4 + var14 / 2.0F;
                  var19 += var8.k5();
                  var19 += var15;
               }
            }
         }
      }
   }

   static void n5(com.aspose.slides.internal.o9b.y1 var0, g3y var1, int var2, n1g var3) {
      t9z var4 = var1.c8().get_Item(var2);
      if (var4 == null) {
         var4 = var1.x8();
      }

      if (ChartTypeCharacterizer.isChartTypeBubble(var1.u9().getType())) {
         float var10 = var3.t2().c8();
         com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(var0.x8(), var0.n3() + (var0.k5() - var10) / 2.0F, var10, var10);
         com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
         var14.n5(var12.y4());
         var4.k5(var14);
         var4.n5(var14);
      } else if (!ChartTypeCharacterizer.a6(var1.u9().getType())) {
         float var9 = var0.s7();
         float var11 = var0.k5() / 2.0F;
         com.aspose.slides.internal.o9b.y1 var13 = new com.aspose.slides.internal.o9b.y1(var0.x8(), var0.n3() + var0.k5() / 2.0F - var11 / 2.0F, var9, var11);
         var4.l6(var13.y4());
         var4.n5(var13.y4());
      } else {
         if (var1.u9().getFormat().getLine().getFillFormat().getFillType() != 0 || var1.u9().getFormat().getLine().getFillFormat().getFillType() != -1) {
            var4.n5(
               new com.aspose.slides.internal.o9b.w1(var0.x8(), var0.n3() + var0.k5() / 2.0F),
               new com.aspose.slides.internal.o9b.w1(var0.x8() + var0.s7(), var0.n3() + var0.k5() / 2.0F)
            );
         }

         if (var4.s7().l6() != null) {
            float var5 = var0.x8() + var0.s7() / 2.0F;
            float var6 = var0.n3() + var0.k5() / 2.0F;
            float var7;
            if (var4.s7().getMarker().getSize() == 0) {
               var7 = var0.k5() * 0.4F;
            } else if (var4.s7().getMarker().getSize() <= var0.k5() * 0.4F) {
               var7 = var4.s7().getMarker().getSize();
            } else {
               float var8 = var4.s7().getMarker().getSize() / var3.y2();
               if (var8 > 1.0F) {
                  var8 = 1.0F;
               }

               var7 = var0.k5() * 0.4F * (1.0F + var8);
            }

            var4.e2().n5(var5, var6, var7);
         }
      }
   }

   static com.aspose.slides.internal.o9b.f2 n5(g3y var0, n1g var1) {
      List var2 = var0.c8();
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      List var5;
      if (!var0.u9().getPlotOnSecondAxis()) {
         var5 = var1.l6();
      } else {
         var5 = var1.k5();
      }

      if (var5.size() > 0) {
         for (int var6 = 0; var6 < var2.size(); var6++) {
            if (var6 > var1.t2().y4().size() - 1 || !var1.t2().y4().get_Item(var6).a6().getHide()) {
               if (var5.size() >= var2.size()) {
                  x4 var7 = (x4)var5.get_Item(var6);
                  String var8 = n5(var7);
                  com.aspose.slides.internal.o9b.p8.n5(h6l.n5(var8, 0.0F, var1.t2().n5(), 0, var1, new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)))
                     .l6(var4);
               } else {
                  com.aspose.slides.internal.o9b.p8.n5(h6l.n5(" ", 0.0F, var1.t2().n5(), 0, var1, new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)))
                     .l6(var4);
               }

               if (var3.l6() < var4.l6()) {
                  var3.n5(var4.l6());
               }

               if (var3.k5() < var4.k5()) {
                  var3.l6(var4.k5());
               }
            }
         }
      } else {
         for (int var9 = 1; var9 <= var2.size(); var9++) {
            com.aspose.slides.internal.o9b.p8.n5(
                  h6l.n5(
                     com.aspose.slides.ms.System.a3.n5(var9, com.aspose.slides.internal.x7n.l6.k5()),
                     0.0F,
                     var1.t2().n5(),
                     0,
                     var1,
                     new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)
                  )
               )
               .l6(var4);
            if (var3.l6() < var4.l6()) {
               var3.n5(var4.l6());
            }

            if (var3.k5() < var4.k5()) {
               var3.l6(var4.k5());
            }
         }
      }

      return var3;
   }

   private static String n5(x4 var0) {
      String var1;
      for (var1 = l6(var0); var0.n5() != null; var1 = com.aspose.slides.ms.System.d1.n5(new String[]{l6(var0), " ", var1})) {
         var0 = var0.n5();
      }

      return var1;
   }

   private static String l6(x4 var0) {
      String var1 = var0.u9();
      if (var0.k5()) {
         double var2 = com.aspose.slides.ms.System.z3.n3(var0.l6());
         com.aspose.slides.ms.System.j5 var4 = g6z.n5(var2, false).m3();
         return f6z.n5(var4.m3(), var1, false);
      } else {
         return f6z.n5(var0.l6(), var1, false);
      }
   }

   static com.aspose.slides.internal.o9b.f2 l6(g3y var0, n1g var1) {
      List var2 = var0.c8();
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      List var5 = var0.u9().getPlotOnSecondAxis() ? var1.k5() : var1.l6();
      if (var5.size() > 0) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            if (var5.size() >= var2.size()) {
               x4 var7 = (x4)var5.get_Item(var6);
               String var8 = n5(var7);
               com.aspose.slides.internal.o9b.p8.n5(h6l.n5(var8, 0.0F, var1.t2().n5(), 0, var1, new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)))
                  .l6(var4);
            } else {
               com.aspose.slides.internal.o9b.p8.n5(h6l.n5(" ", 0.0F, var1.t2().n5(), 0, var1, new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)))
                  .l6(var4);
            }

            var3.n5(var3.l6() + var4.l6());
            if (var3.k5() < var4.k5()) {
               var3.l6(var4.k5());
            }
         }
      } else {
         for (int var9 = 1; var9 <= var2.size(); var9++) {
            com.aspose.slides.internal.o9b.p8.n5(
                  h6l.n5(
                     com.aspose.slides.ms.System.a3.n5(var9, com.aspose.slides.internal.x7n.l6.k5()),
                     0.0F,
                     var1.t2().n5(),
                     0,
                     var1,
                     new com.aspose.slides.internal.o9b.f2(1000.0F, 1000.0F)
                  )
               )
               .l6(var4);
            var3.n5(var3.l6() + var4.l6());
            if (var3.k5() < var4.k5()) {
               var3.l6(var4.k5());
            }
         }
      }

      return var3;
   }

   static com.aspose.slides.internal.o9b.f2 k5(g3y var0, n1g var1) {
      com.aspose.slides.internal.o9b.f2 var2 = n5(var0, var1).a6();
      float var3 = var2.k5() * 0.4F;
      float var4 = var2.k5();
      return new com.aspose.slides.internal.o9b.f2(var3, var4);
   }

   static com.aspose.slides.internal.o9b.p8 n5(g3y var0, Legend var1, n1g var2) {
      List var3 = var0.c8();
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      int var11;
      int var12;
      if (var1.getPosition() != 3 && var1.getPosition() != 0) {
         com.aspose.slides.internal.o9b.f2 var15 = n5(var2).a6();
         n5(var0, var2).l6(var4);
         var11 = com.aspose.slides.internal.v6g.k5.u3(4.0F + var15.l6() + var4.l6(), 13) + 1;
         var12 = com.aspose.slides.internal.v6g.k5.u3(var4.k5() + 8.0F + (var3.size() - 1) * var4.k5(), 13);
         if (var11 > var2.c4()) {
            var11 = com.aspose.slides.internal.v6g.k5.u3(var2.c4(), 13);
         }

         if (var12 > var2.y2() - 16.0F) {
            var12 = com.aspose.slides.internal.v6g.k5.u3(var2.y2(), 13) - 16;
         }
      } else {
         com.aspose.slides.internal.o9b.f2 var5 = n5(var2).a6();
         com.aspose.slides.internal.o9b.f2 var6 = n5(var0, var2).a6();
         int var7 = com.aspose.slides.internal.v6g.k5.u3(var5.l6() + var6.l6(), 13) + 1;
         int var8 = com.aspose.slides.internal.v6g.k5.u3(var2.c4(), 13) - 16 - 4;
         int var9 = var8 / var7;
         if (var9 == 0) {
            var9 = 1;
         }

         l6(var0, var2).l6(var4);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(var5.l6() * var0.c8().size() + var4.l6(), 13) + 1;
         if (var10 <= var8) {
            var11 = 4 + var10;
            var12 = com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13) + 8;
         } else {
            int var13 = g6z.n5((double)var0.c8().size() / var9);
            int var14 = g6z.n5((double)var0.c8().size() / var13);
            var11 = 4 + var14 * var7;
            var12 = var13 * com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13) + 8;
         }

         if (var12 > var2.y2() - 16.0F) {
            var12 = com.aspose.slides.internal.v6g.k5.u3(var2.y2(), 13) - 16;
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var11, var12);
   }

   static com.aspose.slides.internal.o9b.j5 n5(g3y var0, com.aspose.slides.internal.o9b.y2[] var1, n1g var2) {
      float var3 = 0.0F;
      float var4 = 0.0F;
      ILegend var5 = var2.n3().getLegend();
      com.aspose.slides.internal.o9b.p8 var6 = n5(var0, (Legend)var5, var2).u3();
      byte var7 = 8;
      byte var8 = 6;
      n2z var9 = var2.t2().n5;
      var9.n5 = new com.aspose.slides.internal.o9b.y2(0, 0, var6.l6(), var6.k5());
      if (com.aspose.slides.ms.System.n1.k5(var5.getWidth()) && com.aspose.slides.ms.System.n1.k5(var5.getHeight())) {
         var9.n5 = new com.aspose.slides.internal.o9b.y2(0, 0, var6.l6(), var6.k5());
      } else {
         var9.n5 = new com.aspose.slides.internal.o9b.y2(
            0, 0, com.aspose.slides.internal.v6g.k5.u3(var5.getWidth() * var2.c4(), 13), com.aspose.slides.internal.v6g.k5.u3(var5.getHeight() * var2.y2(), 13)
         );
      }

      int var10 = com.aspose.slides.internal.v6g.k5.u3(var2.y2(), 13);
      int var11 = com.aspose.slides.internal.v6g.k5.u3(var2.c4(), 13);
      int var12 = com.aspose.slides.internal.v6g.k5.u3(var2.y1(), 13);
      int var13 = com.aspose.slides.internal.v6g.k5.u3(var2.a0(), 13);
      switch (var5.getPosition()) {
         case 0:
            var3 = (float)(var12 + (var11 - var6.l6()) / 2.0);
            var4 = (float)(var13 + var10 - var7) - var6.k5();
            if (!var5.getOverlay()) {
               var1[0].n5(var1[0].l6() - (var6.k5() + var8));
            }
            break;
         case 1:
            var3 = (float)var12 + var7;
            var4 = (float)(var13 + (var10 - var6.k5()) / 2.0);
            if (!var5.getOverlay()) {
               var1[0].k5(var1[0].s7() + var6.l6() + var8);
               var1[0].l6(var1[0].t2() - (var6.l6() + var8));
            }
            break;
         case 2:
            var3 = (float)(var12 + var11 - var7) - var6.l6();
            var4 = (float)(var13 + (var10 - var6.k5()) / 2.0);
            if (!var5.getOverlay()) {
               var1[0].l6(var1[0].t2() - (var6.l6() + var8));
            }
            break;
         case 3:
            var3 = (float)(var12 + (var11 - var6.l6()) / 2.0);
            var4 = (float)(var13 + var7 + var9.n5.l6()) + var8;
            if (!var5.getOverlay()) {
               var1[0].u3(var1[0].x8() + var6.k5() + var8);
               var1[0].n5(var1[0].l6() - (var6.k5() + var8));
            }
            break;
         case 4:
            var3 = (float)(var12 + var11 - var7) - var6.l6();
            if (var2.n3().hasTitle()) {
               var4 = (float)(var13 + var7 + var9.n5.l6()) + var8;
            } else {
               var4 = (float)var13 + var7;
            }

            if (!var5.getOverlay()) {
               var1[0].l6(var1[0].t2() - (var6.l6() + var8));
            }
      }

      var9.n5 = new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.internal.v6g.k5.u3(var3, 13), com.aspose.slides.internal.v6g.k5.u3(var4, 13), var9.n5.t2(), var9.n5.l6()
      );
      return new com.aspose.slides.internal.o9b.j5(var9.n5.s7(), var9.n5.x8());
   }

   static com.aspose.slides.internal.o9b.j5 n5(com.aspose.slides.internal.o9b.y2[] var0, n1g var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8();
      ILegend var5 = var1.n3().getLegend();
      n5(var1, (Legend)var5).k5(var4);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(var1.y2(), 13);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var1.c4(), 13);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var1.y1(), 13);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var1.a0(), 13);
      byte var10 = 8;
      byte var11 = 6;
      switch (var5.getPosition()) {
         case 0:
            var2 = (float)(var8 + (var7 - var4.l6()) / 2.0);
            var3 = (float)(var9 + var6 - var10) - var4.k5();
            if (!var5.getOverlay()) {
               var0[0].n5(var0[0].l6() - (var4.k5() + var11));
            }
            break;
         case 1:
            var2 = (float)var8 + var10;
            var3 = (float)(var9 + (var6 - var4.k5()) / 2.0);
            if (!var5.getOverlay()) {
               var0[0].k5(var0[0].s7() + var4.l6() + var11);
               var0[0].l6(var0[0].t2() - (var4.l6() + var11));
            }
            break;
         case 2:
            var2 = (float)(var8 + var7 - var10) - var4.l6();
            var3 = (float)(var9 + (var6 - var4.k5()) / 2.0);
            if (!var5.getOverlay()) {
               var0[0].l6(var0[0].t2() - (var4.l6() + var11));
            }
            break;
         case 3:
            var2 = (float)(var8 + (var7 - var4.l6()) / 2.0);
            var3 = (float)(var9 + var10 + var1.x8().n5.n5.l6()) + var11;
            if (!var5.getOverlay()) {
               var0[0].u3(var0[0].x8() + var4.k5() + var11);
               var0[0].n5(var0[0].l6() - (var4.k5() + var11));
            }
            break;
         case 4:
            var2 = (float)(var8 + var7 - var10) - var4.l6();
            if (var1.n3().hasTitle()) {
               var3 = (float)(var9 + var10 + var1.x8().n5.n5.l6()) + var11;
            } else {
               var3 = (float)var9 + var10;
            }

            if (!var5.getOverlay()) {
               var0[0].l6(var0[0].t2() - (var4.l6() + var11));
               var0[0].u3(var0[0].x8() + var4.k5() + var11);
            }
      }

      var1.t2().n5.n5 = new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.internal.v6g.k5.u3(var2, 13), com.aspose.slides.internal.v6g.k5.u3(var3, 13), var4.l6(), var4.k5()
      );
      return new com.aspose.slides.internal.o9b.j5(var1.t2().n5.n5.s7(), var1.t2().n5.n5.x8());
   }

   static com.aspose.slides.internal.o9b.p8 n5(n1g var0, Legend var1) {
      com.aspose.slides.internal.o9b.f2 var2 = l6(var0).a6();
      int var3 = var0.t2().u9();
      int var4 = var0.t2().h0();
      int var5 = var0.t2().y4().size();
      new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2();
      int var13;
      int var14;
      if (var1.getPosition() != 3 && var1.getPosition() != 0) {
         var0.t2().n5(true);
         int var19 = com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) - 16;
         int var20 = com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13) / 3;
         com.aspose.slides.internal.o9b.f2 var18 = new com.aspose.slides.internal.o9b.f2(var20, var19);
         l6(var18.a6(), var0).l6(var7);
         var13 = g6z.n5(var3 + var2.l6() + var7.l6());
         var14 = g6z.n5(2 * var3 + var5 * (var7.k5() + var4));
         if (var13 > var20) {
            var13 = var20;
         }

         if (var14 > var19) {
            var14 = var19;
         }
      } else {
         com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(var0.c4() - 16.0F, var0.y2() / 2.0F - 8.0F);
         l6(var6.a6(), var0).l6(var7);
         int var8 = g6z.n5(var2.l6() + var7.l6());
         int var9 = g6z.k5(var6.l6()) - var3;
         int var10 = var9 / var8;
         if (var10 == 0) {
            var10 = 1;
         }

         com.aspose.slides.internal.o9b.f2 var11 = n5(var6.a6(), var0).a6();
         int var12 = g6z.n5(var2.l6() * var5 + var11.l6());
         if (var12 <= var9) {
            var0.t2().n5(false);
            var13 = var3 + var12 + var4;
            var14 = g6z.n5(var11.k5() + 2 * var3);
         } else {
            var0.t2().n5(false);
            var13 = var3 + var10 * var8 + var4;
            var14 = g6z.n5((float)var5 / var10) * (g6z.n5(var7.k5()) + var4) + 2 * var3;
            int var15 = com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) / 2 - 8;
            if (var14 > var15) {
               int var16 = 0;

               int var17;
               for (var17 = 0; var16 <= var15 && var17 <= var5; var17 += var10) {
                  var16 = g6z.n5((float)var17 / var10) * (g6z.n5(var7.k5()) + var4) + 2 * var3;
               }

               if (var17 >= var5 || var16 == var15) {
                  var14 = var16;
               } else if (var16 > var15) {
                  var14 = var16 - (g6z.n5(var7.k5()) + var4);
               }
            }
         }

         if (var14 > var0.y2() - 16.0F) {
            var14 = com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) - 16;
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var13, var14);
   }

   static com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var0, n1g var1) {
      List var2 = var1.t2().y4();
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      int var5 = var1.t2().h0();

      for (int var6 = 0; var6 < var2.size(); var6++) {
         String var7 = ((u5l)var2.get_Item(var6)).n5();
         h6l.n5(var7, var1.t2().k5(), var0.a6()).l6(var4);
         var4.n5(var4.l6() + 2 * var5);
         var3.n5(var3.l6() + var4.l6());
         if (var3.k5() < var4.k5()) {
            var3.l6(var4.k5());
         }
      }

      return var3;
   }

   static com.aspose.slides.internal.o9b.f2 l6(n1g var0) {
      return var0.t2().e2()
         ? new com.aspose.slides.internal.o9b.f2(var0.t2().s7(), h6l.n5(var0.t2().k5()))
         : new com.aspose.slides.internal.o9b.f2(var0.t2().c8(), h6l.n5(var0.t2().k5()));
   }

   static com.aspose.slides.internal.o9b.f2 l6(com.aspose.slides.internal.o9b.f2 var0, n1g var1) {
      var0 = new com.aspose.slides.internal.o9b.f2(var0.l6(), var0.k5());
      com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      int var4 = var1.t2().h0();
      List var5 = var1.t2().y4();

      for (int var6 = 0; var6 < var5.size(); var6++) {
         h6l.n5(((u5l)var5.get_Item(var6)).n5(), var1.t2().k5(), var0.a6()).l6(var3);
         var3.n5(var3.l6() + 2 * var4);
         if (var2.l6() < var3.l6()) {
            var2.n5(var3.l6());
         }

         if (var2.k5() < var3.k5()) {
            var2.l6(var3.k5());
         }
      }

      return var2;
   }

   static void n5(boolean var0, g3y var1, n1g var2, Legend var3) {
      g3b var4 = var2.t2();
      u3(var2);
      List var5 = n5(var4.u3(), var0, var4.y4(), var2);
      int var6 = var5.size();
      n2z var7 = var4.n5;
      var7.n5();
      com.aspose.slides.internal.o9b.f2 var8 = l6(var2).a6();
      int var9 = var4.u9();
      int var10 = var4.h0();
      float var11 = var4.t2();
      float var12 = var4.x8();
      int var13 = 1;
      int var14 = var7.n5.t2();
      int var15 = var7.n5.l6();
      float var16 = 0.0F;
      float var17 = 0.0F;
      com.aspose.slides.internal.o9b.f2 var18 = com.aspose.slides.internal.o9b.f2.n5.a6();
      int var19 = 0;
      com.aspose.slides.internal.o9b.f2 var20 = n5(new com.aspose.slides.internal.o9b.f2(var2.c4(), var2.y2()), var2).a6();
      float var21 = var7.n5.l6() < var20.k5() ? var20.k5() : var7.n5.l6();
      int var22 = com.aspose.slides.internal.v6g.k5.u3(var8.l6() * var6 + var20.l6(), 13);
      int var23 = var7.n5.t2() - var9;
      int var24 = var23 - com.aspose.slides.internal.v6g.k5.u3(var8.l6(), 13);
      com.aspose.slides.internal.o9b.f2 var25 = new com.aspose.slides.internal.o9b.f2(var24, var21);
      l6(var25.a6(), var2).l6(var18);
      boolean var26 = false;
      int var27 = 1;
      int var28;
      if (var22 <= var14 - var9) {
         var28 = var6;
         byte var29 = 1;
         var16 = (float)(var14 - var9 - var22) / (var28 + 1);
         var17 = (float)(var15 - var4.a6() * var29) / var29;
         var26 = true;
      } else {
         var19 = com.aspose.slides.internal.v6g.k5.u3(var8.l6() + var18.l6(), 13);
         int var30 = g6z.l6((float)var23 / var19);
         if (var30 < 1) {
            var30 = 1;
         }

         int var45 = g6z.n5((float)var6 / var30);
         var28 = g6z.n5((float)var6 / var45);
         var16 = (float)(var23 - var19 * var28) / var28;
         var27 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var15 / var18.k5()), 14);
         if (var27 == 0) {
            var27 = 1;
         }

         if (var27 > var45) {
            var27 = var45;
         }

         var17 = (var15 - var18.k5() * var27) / var27;
         var13 = g6z.n5(var18.k5() / h6l.n5(var4.k5()));
      }

      if (var16 < 0.0F) {
         var16 = 0.0F;
      }

      if (var13 > 1) {
         if (var17 < var12) {
            var17 = var12;
         }
      } else if (var17 < var11) {
         var17 = var11;
      }

      float var46 = var7.n5.s7();
      float var31 = var7.n5.x8();
      var46 += var9;
      var46 += var16 / (var26 ? 1 : 2);
      var31 += var17 / 2.0F;
      w2 var32 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var2.d2(), w2.class)) {
         var32 = (w2)var2.d2();
         var2.n5(var32.z1());
      }

      com.aspose.slides.internal.o9b.y1 var33 = var2.d2().t9().y4();
      var2.d2().n5(com.aspose.slides.internal.o9b.y1.n5(var7.n5).y4());

      for (int var34 = 0; var34 < var5.size(); var34++) {
         u5l var35 = (u5l)var5.get_Item(var34);
         if (var27 > 1 && com.aspose.slides.ms.System.q1.u3(var31 + var18.k5()) > var7.n5.n5()) {
            break;
         }

         int var36 = var2.n3().getType() != 73 ? var2.n3().getType() : var2.n3().getChartData().getSeries().get_Item(0).getType();
         com.aspose.slides.internal.o9b.y1 var37 = new com.aspose.slides.internal.o9b.y1(var46, var31, var8.l6(), var8.k5());
         if (var36 != 58 && var36 != 59 && var36 != 60 && var36 != 61) {
            n5(var37.y4(), var35, var2);
         }

         String var38 = var35.n5();
         com.aspose.slides.internal.o9b.w1 var39 = new com.aspose.slides.internal.o9b.w1(var46 + var8.l6() + var10, var31);
         if (var26) {
            h6l.n5(
               new com.aspose.slides.internal.o9b.y1(var39.u3(), new com.aspose.slides.internal.o9b.f2(var18.l6(), var18.k5())),
               var38,
               0,
               var4.n5(),
               var4.l6().o8(),
               0,
               2,
               var2
            );
            com.aspose.slides.internal.o9b.p8 var40 = var7.n5.h0().u3();
            if (var40.k5() < h6l.n5(var4.k5())) {
               var40.l6(g6z.k5(h6l.n5(var4.k5()) + 1.0));
            }

            com.aspose.slides.internal.o9b.f2 var41 = h6l.n5(var38, var4.k5(), var40.u3()).a6();
            var46 += var8.l6() + var41.l6() + 2 * var10;
            var46 += var16;
         } else {
            float var54 = g6z.n5(var25.l6()) - 1.0F;
            float var55 = g6z.n5(var25.k5());
            com.aspose.slides.internal.o9b.y1 var42 = new com.aspose.slides.internal.o9b.y1(var39.l6(), var39.k5(), var54, var55);
            h6l.n5(var42.y4(), var38, 0, var4.n5(), var4.l6().o8(), 0, 2, var2);
            var46 += var19;
            var46 += var16;
            if ((var34 + 1) % var28 == 0) {
               var46 = var7.n5.s7() + var9 + var16 / 2.0F;
               var31 += var18.k5();
               var31 += var17;
            }
         }
      }

      if (var32 != null) {
         com.aspose.slides.internal.e1.t2 var53 = com.aspose.slides.internal.v6g.k5.n5(var2.d2(), w2.class).y4();
         var32.y4().n5(var53);
         var2.n5(var32);
      } else {
         var2.d2().n5(var33.y4());
      }
   }

   private static void u3(n1g var0) {
      n2z var1 = var0.t2().n5;
      ILegend var2 = var0.n3().getLegend();
      if (!com.aspose.slides.ms.System.n1.k5(var2.getX()) && !com.aspose.slides.ms.System.n1.k5(var2.getY())) {
         switch (var2.getPosition()) {
            case 0:
            case 3:
               var0.t2().n5(false);
               break;
            case 1:
            case 2:
            case 4:
               var0.t2().n5(true);
         }

         int var3 = com.aspose.slides.internal.v6g.k5.u3(var0.y1() + var2.getX() * var0.c4(), 13);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var0.a0() + var2.getY() * var0.y2(), 13);
         com.aspose.slides.internal.o9b.p8 var5 = new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(var2.getWidth() * var0.c4(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.getHeight() * var0.y2(), 13)
         );
         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         var1.n5 = new com.aspose.slides.internal.o9b.y2(new com.aspose.slides.internal.o9b.j5(var3, var4), var5.u3());
      }
   }

   static void n5(com.aspose.slides.internal.o9b.y1 var0, u5l var1, n1g var2) {
      if (var1.l6() == 2) {
         com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(var0.x8(), var0.n3() + var0.k5() / 2.0F);
         com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(var0.h0(), var0.n3() + var0.k5() / 2.0F);
         w5k.n5(var3.u3(), var4.u3(), var1.k5().l6().o8(), (LineFormat)var1.k5().k5().getFormat().getLine(), var2);
      } else if (var1.l6() == 1) {
         g3y var8 = var1.u3();
         g3y var9 = var1.u3();
         if (ChartTypeCharacterizer.isChartTypeBubble(var8.u9().getType())) {
            float var5 = var2.t2().c8();
            com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(var0.x8(), var0.n3() + (var0.k5() - var5) / 2.0F, var5, var5);
            com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
            var7.n5(var6.y4());
            var8.k5(var7);
            var8.n5(var7);
         } else if (ChartTypeCharacterizer.a6(var8.u9().getType())) {
            if (var8.u9().getFormat().getLine().getFillFormat().getFillType() != 0 || var8.u9().getFormat().getLine().getFillFormat().getFillType() != -1) {
               var8.n5(
                  new com.aspose.slides.internal.o9b.w1(var0.x8(), var0.n3() + var0.k5() / 2.0F),
                  new com.aspose.slides.internal.o9b.w1(var0.x8() + var0.s7(), var0.n3() + var0.k5() / 2.0F)
               );
            }

            if (var9.u9().getMarker().getSymbol() != 4) {
               float var10 = var0.x8() + var0.s7() / 2.0F;
               float var12 = var0.n3() + var0.k5() / 2.0F;
               float var14;
               if (var9.u9().getMarker().getSize() == 0) {
                  var14 = var0.k5() * 0.5F;
               } else if (var9.u9().getMarker().getSize() <= var0.k5() * 0.5F) {
                  var14 = var9.u9().getMarker().getSize();
               } else {
                  var14 = var0.k5() * 0.5F;
               }

               var9.s7().n5(var10, var12, var14);
            }
         } else if (!ChartTypeCharacterizer.isChartTypeStock(var8.u9().getType())) {
            float var11 = var0.s7();
            float var13 = var2.t2().c8();
            com.aspose.slides.internal.o9b.y1 var15 = new com.aspose.slides.internal.o9b.y1(
               var0.x8(), var0.n3() + var0.k5() / 2.0F - var13 / 2.0F, var11, var13
            );
            if (!u6p.l6(var2.n3())) {
               var8.l6(var15.y4());
               var8.n5(var15.y4());
            } else {
               w5k.n5(var1.u9().o8(), var2, var15.y4(), (FillFormat)null, (IEffectFormat)null);
            }
         }
      }
   }

   static List<u5l> n5(boolean var0, boolean var1, List<u5l> var2, n1g var3) {
      List var4 = n5(1, false, var2);
      List var5 = n5(1, true, var2);
      List var6 = n5(2, false, var2);
      List var7 = n5(2, true, var2);
      boolean var8 = var3.q0().c8().isPlotOrderReversed();
      boolean var9 = var3.m1().c8().isPlotOrderReversed();
      boolean var10 = true;
      List var11 = var3.y4();
      if (var11.size() > 0 && ((g3y)var11.get_Item(0)).u9().getPlotOnSecondAxis()) {
         var10 = false;
      }

      boolean var12 = false;
      if (var4.size() > 0) {
         g3y var13 = ((u5l)var4.get_Item(0)).u3();
         if (ChartTypeCharacterizer.c8(var13.u9().getType()) || ChartTypeCharacterizer.s7(var13.u9().getType())) {
            var12 = true;
         }
      }

      if (var5.size() > 0) {
         g3y var14 = ((u5l)var5.get_Item(0)).u3();
         if (ChartTypeCharacterizer.c8(var14.u9().getType()) || ChartTypeCharacterizer.s7(var14.u9().getType())) {
            var12 = true;
         }
      }

      if (var1) {
         if (!var12) {
            if (!var8 && var0) {
               var4 = l6(var4);
               var5 = l6(var5);
               var6.reverse();
               var7.reverse();
            }
         } else if (var9 && var0) {
            var4 = l6(var4);
            var5 = l6(var5);
            var6.reverse();
            var7.reverse();
         }
      } else if (var12 && var0) {
         var4 = l6(var4);
         var5 = l6(var5);
         var6.reverse();
         var7.reverse();
      }

      List var15 = new List();
      if (var10) {
         var15.addRange(var4);
         var15.addRange(var5);
         var15.addRange(var6);
         var15.addRange(var7);
      } else {
         var15.addRange(var5);
         var15.addRange(var4);
         var15.addRange(var7);
         var15.addRange(var6);
      }

      return var15;
   }

   private static List<u5l> l6(List<u5l> var0) {
      List var1 = new List();
      g3y var2 = null;
      if (var0.size() <= 0) {
         return var0;
      }

      var2 = ((u5l)var0.get_Item(0)).u3();
      List var3 = new List();
      var3.addItem(var0.get_Item(0));
      var1.addItem(var3);

      for (int var7 = 1; var7 < var0.size(); var7++) {
         u5l var4 = (u5l)var0.get_Item(var7);
         if (var4.u3().u9().getType() == var2.u9().getType()) {
            List var5 = (List)var1.get_Item(var1.size() - 1);
            var5.addItem(var0.get_Item(var7));
         } else {
            var2 = var4.u3();
            List var10 = new List();
            var10.addItem(var0.get_Item(var7));
            var1.addItem(var10);
         }
      }

      var3 = new List();

      for (int var9 = 0; var9 < var1.size(); var9++) {
         List var11 = (List)var1.get_Item(var9);
         var11.reverse();
         var3.addRange(var11);
      }

      return var3;
   }

   private static List<u5l> n5(int var0, boolean var1, List<u5l> var2) {
      List var3 = new List();

      for (int var4 = 0; var4 < var2.size(); var4++) {
         u5l var5 = (u5l)var2.get_Item(var4);
         if (var5.l6() == var0 && var5.u3().u9().getPlotOnSecondAxis() == var1) {
            var3.addItem(var5);
         }
      }

      return var3;
   }

   public void n5(z7d var1) {
   }

   public z7d n5() {
      z7d var1 = new z7d();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(z7d var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof z7d) ? false : this.l6((z7d)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z7d Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z7d bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
