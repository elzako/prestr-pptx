package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class g4u {
   private static com.aspose.slides.internal.n2d.z1<Integer, g4u$n5> n5;
   private static final Object l6 = new Object();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "areaChart",
      "area3DChart",
      "lineChart",
      "line3DChart",
      "stockChart",
      "radarChart",
      "scatterChart",
      "pieChart",
      "pie3DChart",
      "doughnutChart",
      "barChart",
      "bar3DChart",
      "ofPieChart",
      "surfaceChart",
      "surface3DChart",
      "bubbleChart"
   );

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, com.aspose.slides.internal.k4y.y2 var2, c1x var3) {
      if (var2 != null) {
         n5(var0, var2, var3.n5().n5());
         l6(var0, var2, var3.n5().n5());
         n5(var0, var1, var3.n5());
         n5(var0, var2, var3.n5());
         n5(var0, var2.t4().q0(), var3);
         n5(var0, var2.t4(), var3.n5().n5());
      }
   }

   static void n5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      t5w var3 = var2.n5();
      com.aspose.slides.internal.c8m.a2 var4 = var3.k7();
      if (var2.l6() != null) {
         var3.n5(var2.k5());
      }

      l5u.n5(var0, var1, var2);
      var3.n5(var4);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.y2 var1, i1x var2) {
      var0.setRoundedCorners(var1.n3() == null ? false : var1.n3().n5());
      t5w var3 = var2.n5();
      x2m.n5(var0, var1.y4());
      z6a.n5(var0, var1.q0(), var3);
      y4k.n5(var0.getTextFormat(), var1.z3(), var3);
      k3.n5(var0.getThemeManager(), var3);
      if (var1.m3() != null) {
         var3.n5(true);
         j2w var4 = new j2w(var3.k7().n5(var1.m3().n5()).l6(), var3);
         var4.n5(var0, var2);
         var3.n5(false);
      }
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w4c var1, c1x var2) {
      t5w var3 = var2.n5().n5();
      x2o.n5(var0, var1.h0(), var3);
      o6t.n5(var0.getPlotArea(), var1, var3);
      t4d.n5(var0, var3, var1, null);
      t9p.n5(var0.getChartData(), var1, var2);
      f4.n5(var0.getAxes(), var1, var2);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w3o var1, t5w var2) {
      q9u.n5(var0.getChartTitle(), var1.x8(), var2);
      if (var1.x8() != null) {
         var0.setTitle(true);
      } else {
         String var3 = null;
         if (var0.getChartData().getSeries().size() > 0) {
            var3 = ((ChartData)var0.getChartData()).l6().k5() != 2
               ? ((ChartSeries)var0.getChartData().getSeries().get_Item(0)).x8()
               : var0.getChartData().getSeries().get_Item(0).getName().toString();
         }

         if (var1.n3() != null && !var1.n3().n5() && var0.getChartData().getSeries().size() == 1 && !com.aspose.slides.ms.System.d1.n5(var3)) {
            var0.setTitle(true);
         }
      }

      e2l.n5(var0.getFloor(), var1.t9(), var2);
      e2l.n5(var0.getBackWall(), var1.t4(), var2);
      e2l.n5(var0.getSideWall(), var1.z1(), var2);
      o2e.n5(var0, var1.z3(), var2);
      if (var1.m1() != null) {
         var0.setPlotVisibleCellsOnly(var1.m1().n5());
      }

      if (var1.k7() != null) {
         var0.setDisplayBlanksAs(var1.k7().n5());
      }

      if (var1.m3() != null) {
         var0.setShowDataLabelsOverMaximum(var1.m3().n5());
      }
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.y2 var1, t5w var2) {
      y8m var3 = ((Chart)var0).l6();
      var3.n5(var1.s7() != null && var1.s7().n5());
      var3.n5(var1.x8() == null ? null : var1.x8().n5());
      var3.n5(var1.t9());
      var3.n5(var1.z1());
      var3.n5(var1.k7());
      com.aspose.slides.internal.k4y.w3o var4 = var1.t4();
      var3.n5(var4.y4());
      var3.n5(var1.z8());
      var3.l6(var4.z8());
      com.aspose.slides.internal.k4y.r4 var5 = new com.aspose.slides.internal.k4y.r4(var4.z8());
      if (var5.n5() != null) {
         var3.l6(var5.n5().n5());
      }

      a1g.n5((Chart)var0, var1.e2());
      q3x.n5(var0, var4.e2(), var2);
      if (var1.m1() != null) {
         var3.n5(var1.m1());
      }
   }

   private static void l6(IChart var0, com.aspose.slides.internal.k4y.y2 var1, t5w var2) {
      y8m var3 = ((Chart)var0).l6();
      if (var1.m1() != null) {
         com.aspose.slides.internal.c8m.r7 var4 = var2.k7().n5(var3.s7().l6());
         if (var4 != null) {
            var3.n5(var4.h0());
            var3.l6(var4.n5());
            var3.k5(var4.u9());
         }
      }
   }

   static int n5(int var0, com.aspose.slides.internal.k4y.m3 var1) {
      int var2;
      switch (var0) {
         case 0:
         case 1:
         case 2:
         case 32:
         case 34:
         case 35:
            var2 = var0;
            break;
         case 3:
         case 7:
         case 11:
         case 15:
            var2 = 3;
            break;
         case 4:
         case 8:
         case 12:
         case 16:
            var2 = 4;
            break;
         case 5:
         case 9:
         case 13:
         case 17:
            var2 = 5;
            break;
         case 6:
         case 10:
         case 14:
         case 18:
            var2 = 6;
            break;
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            if (var0 == 19 || var0 == 22) {
               var2 = 19;
            } else if (var0 != 20 && var0 != 23) {
               if (var0 != 21 && var0 != 24) {
                  throw new Exception();
               }

               var2 = 21;
            } else {
               var2 = 20;
            }
            break;
         case 25:
            var2 = var0;
            break;
         case 26:
         case 29:
            var2 = 26;
            break;
         case 27:
         case 30:
            var2 = 27;
            break;
         case 28:
         case 31:
            var2 = var0;
            break;
         case 33:
         case 38:
         case 41:
         case 44:
            var2 = 33;
            break;
         case 36:
         case 39:
         case 42:
         case 45:
            var2 = 36;
            break;
         case 37:
         case 40:
         case 43:
         case 46:
            var2 = 37;
            break;
         case 47:
         case 48:
         case 49:
            var2 = var0;
            break;
         case 50:
         case 51:
         case 52:
            var2 = var0;
            break;
         case 53:
         case 56:
         case 57:
            var2 = 57;
            break;
         case 54:
         case 55:
            var2 = 55;
            break;
         case 58:
         case 59:
         case 60:
         case 61:
            var2 = var0;
            break;
         case 62:
         case 63:
            var2 = var0;
            break;
         case 64:
         case 65:
            var2 = var0;
            break;
         case 66:
         case 67:
            var2 = 66;
            break;
         case 68:
         case 69:
            if (var1.d5() != null) {
               if (var1.d5().n5()) {
                  var2 = 69;
               } else {
                  var2 = 68;
               }
            } else {
               var2 = var0;
            }
            break;
         case 70:
         case 71:
         case 72:
            if (var0 == 72) {
               var2 = var0;
            } else {
               var2 = 70;
            }
            break;
         default:
            throw new Exception();
      }

      return var2;
   }

   static int n5(com.aspose.slides.internal.k4y.w4c var0, int var1, int[] var2) {
      var2[0] = 0;
      com.aspose.slides.internal.k4y.g7 var3 = var0.a6().get_Item(var1);
      int var5;
      switch (k5.n5(var3.n5())) {
         case 0:
            com.aspose.slides.internal.k4y.d9r var4 = (com.aspose.slides.internal.k4y.d9r)var3.l6();
            if (var4.z7() != null && var4.z7().n5() == 3) {
               var5 = 48;
            } else if (var4.z7() != null && var4.z7().n5() == 1) {
               var5 = 49;
            } else {
               var5 = 47;
            }

            if (var4.z7() != null) {
               var2[0] = var4.z7().n5();
            }
            break;
         case 1:
            com.aspose.slides.internal.k4y.l1f var6 = (com.aspose.slides.internal.k4y.l1f)var3.l6();
            if (var6.z7() != null && var6.z7().n5() == 3) {
               var5 = 51;
            } else if (var6.z7() != null && var6.z7().n5() == 1) {
               var5 = 52;
            } else {
               var5 = 50;
            }

            if (var6.z7() != null) {
               var2[0] = var6.z7().n5();
            }
            break;
         case 2:
            com.aspose.slides.internal.k4y.x1j var7 = (com.aspose.slides.internal.k4y.x1j)var3.l6();
            boolean var8 = false;

            for (com.aspose.slides.internal.k4y.m3 var27 : var7.l6()) {
               if (var27.aE_() == null) {
                  var8 = true;
                  break;
               }

               if (var27.aE_() != null && var27.aE_().u3() != null && var27.aE_().u3().n5() != 4) {
                  var8 = true;
                  break;
               }
            }

            if (var7.o0() == null) {
               var5 = 19;
            } else {
               if (var7.o0().n5() != 2) {
                  if (var7.o0().n5() == 3) {
                     if (var8) {
                        var5 = 23;
                     } else {
                        var5 = 20;
                     }
                  } else if (var7.o0().n5() == 1) {
                     if (var8) {
                        var5 = 24;
                     } else {
                        var5 = 21;
                     }
                  } else {
                     var5 = 19;
                  }
               } else if (!var8 && (var7.b3() == null || !var7.b3().n5())) {
                  var5 = 19;
               } else {
                  var5 = 22;
               }

               if (var7.o0() != null) {
                  var2[0] = var7.o0().n5();
               }
            }
            break;
         case 3:
            com.aspose.slides.internal.k4y.d1z var9 = (com.aspose.slides.internal.k4y.d1z)var3.l6();
            if (var9.o0().n5() != 2) {
               throw new NotImplementedException();
            }

            var5 = 25;
            if (var9.o0() != null) {
               var2[0] = var9.o0().n5();
            }
            break;
         case 4:
            var5 = 58;
            break;
         case 5:
            com.aspose.slides.internal.k4y.p5g var10 = (com.aspose.slides.internal.k4y.p5g)var3.l6();
            if (var10.n3().n5() == 3) {
               var5 = 72;
            } else if (var10.n3().n5() == 2) {
               var5 = 71;
            } else {
               var5 = 70;
            }
            break;
         case 6:
            com.aspose.slides.internal.k4y.t2h var11 = (com.aspose.slides.internal.k4y.t2h)var3.l6();
            if (var11.p8().n5() != 3 && var11.p8().n5() != 2 && var11.p8().n5() != 4) {
               if (var11.l6().length > 0 && var11.l6()[0].aE_() != null && var11.l6()[0].aE_().u3() != null && var11.l6()[0].aE_().u3().n5() == 4) {
                  var5 = 55;
               } else {
                  var5 = 54;
               }
            } else if (var11.l6().length > 0 && var11.l6()[0].aE_() != null && var11.l6()[0].aE_().u3() != null && var11.l6()[0].aE_().u3().n5() == 4) {
               var5 = 57;
            } else if (var11.l6().length > 0
               && var11.l6()[0].k5() != null
               && var11.l6()[0].k5().t2() != null
               && var11.l6()[0].k5().t2().h0() != null
               && "noFill".equals(var11.l6()[0].k5().t2().h0().n5())) {
               var5 = 53;
            } else {
               var5 = 56;
            }
            break;
         case 7:
            com.aspose.slides.internal.k4y.q9r var12 = (com.aspose.slides.internal.k4y.q9r)var3.l6();
            var5 = 26;

            for (com.aspose.slides.internal.k4y.m3 var35 : var12.l6()) {
               if (var35.y2() != null) {
                  byte var41 = 29;
                  return var41;
               }
            }
            break;
         case 8:
            com.aspose.slides.internal.k4y.q6f var13 = (com.aspose.slides.internal.k4y.q6f)var3.l6();
            var5 = 27;

            for (com.aspose.slides.internal.k4y.m3 var37 : var13.l6()) {
               if (var37.y2() != null) {
                  byte var40 = 30;
                  return var40;
               }
            }
            break;
         case 9:
            com.aspose.slides.internal.k4y.i2i var14 = (com.aspose.slides.internal.k4y.i2i)var3.l6();
            if (var14.l6().length > 0 && var14.l6()[0].y2() != null) {
               var5 = 67;
            } else {
               var5 = 66;
            }
            break;
         case 10:
            com.aspose.slides.internal.k4y.c9v var15 = (com.aspose.slides.internal.k4y.c9v)var3.l6();
            var5 = 34;
            if (var15.av_().n5() == 1) {
               if (var15.v4() != null && var15.v4().n5() == 2) {
                  var5 = 34;
               } else if (var15.v4() != null && var15.v4().n5() == 4) {
                  var5 = 35;
               } else if (var15.v4() != null && var15.v4().n5() == 1) {
                  var5 = 32;
               }
            }

            if (var15.av_().n5() == 2) {
               if (var15.v4() != null && var15.v4().n5() == 2) {
                  var5 = 0;
               } else if (var15.v4() != null && var15.v4().n5() == 4) {
                  var5 = 1;
               } else if (var15.v4() != null && var15.v4().n5() == 1) {
                  var5 = 2;
               }
            }

            if (var15.v4() != null) {
               var2[0] = var15.v4().n5();
            }
            break;
         case 11:
            com.aspose.slides.internal.k4y.u3r var33 = (com.aspose.slides.internal.k4y.u3r)var3.l6();
            var5 = 3;
            if (var33.av_().n5() == 1) {
               var5 = 33;
            }

            int var36 = var33.z7() == null ? 3 : var33.z7().n5();
            IGenericEnumerator var38 = n5().iterator();

            try {
               while (var38.hasNext()) {
                  KeyValuePair var39 = (KeyValuePair)var38.next();
                  int var20 = var33.f2() != null ? var33.f2().n5() : com.aspose.slides.internal.k4y.r3x.n5;
                  if (var33.av_().n5() == ((g4u$n5)var39.getValue()).n5() && var36 == ((g4u$n5)var39.getValue()).l6() && ((g4u$n5)var39.getValue()).n5(var20)) {
                     var5 = (Integer)var39.getKey();
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
                  var38.dispose();
               }
            }

            if (var33.z7() != null) {
               var2[0] = var33.z7().n5();
            }
            break;
         case 12:
            com.aspose.slides.internal.k4y.v9l var16 = (com.aspose.slides.internal.k4y.v9l)var3.l6();
            var5 = var16.x8().n5() == 1 ? 28 : 31;
            break;
         case 13:
            com.aspose.slides.internal.k4y.o8x var17 = (com.aspose.slides.internal.k4y.o8x)var3.l6();
            if (var17.ay_() != null && var17.ay_().n5()) {
               var5 = 65;
            } else {
               var5 = 64;
            }
            break;
         case 14:
            com.aspose.slides.internal.k4y.o3n var18 = (com.aspose.slides.internal.k4y.o3n)var3.l6();
            if (var18.ay_() != null && var18.ay_().n5()) {
               var5 = 63;
            } else {
               var5 = 62;
            }
            break;
         case 15:
            com.aspose.slides.internal.k4y.w1g var19 = (com.aspose.slides.internal.k4y.w1g)var3.l6();
            if (var19.e5() != null) {
               if (var19.e5().n5()) {
                  var5 = 69;
               } else {
                  var5 = 68;
               }
            } else if (var19.l6().length > 0 && var19.l6()[0].d5() != null && var19.l6()[0].d5().n5()) {
               var5 = 69;
            } else {
               var5 = 68;
            }
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var3.n5(), "\""}));
      }

      return var5;
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.y2 var1, com.aspose.slides.internal.k4y.s1k var2, j8m var3) {
      n5(var0, var1, var3.n5().n5());
      n5(var0, var2, var3.n5());
      n5(var0, var1, var3);
      n5(var0, var1.t4().q0(), var3);
      n5(var0, var1.t4(), var3.n5().n5());
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      g6c var3 = var2.n5();
      com.aspose.slides.internal.c8m.a2 var4 = var3.u6();
      var3.n5(var2.k5());
      l5u.n5(var0, var1, var2.n5());
      var3.n5(var4);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.y2 var1, j8m var2) {
      g6c var3 = var2.n5().n5();
      var1.k5().n5(var0.hasRoundedCorners());
      x2m.l6(var0, var1.u3());
      if (var0.getFillFormat().getFillType() != -1
         || !var0.getLineFormat().isFormatNotDefined()
         || !var0.getEffectFormat().isNoEffects()
         || r6k.n5(var0.getThreeDFormat(), true)) {
         com.aspose.slides.internal.k4y.b9y var4 = var1.u9();
         x9f.n5(var0.getFillFormat(), new g4u$1(var4), var3);
         i3z.n5(var0.getLineFormat(), new g4u$8(var4));
         w5i.n5(var0.getEffectFormat(), new g4u$9(var4), var3);
         r6k.n5(var0.getThreeDFormat(), new g4u$10(var4), new g4u$11(var4), null);
      }

      y4k.n5(var0.getTextFormat(), new g4u$12(var1), var3);
      k3.n5(var0.getThemeManager(), var3.u6(), var3);
      if (var0.getUserShapes() != null && var0.getUserShapes().getShapes().size() > 0) {
         com.aspose.slides.internal.c8m.j8 var6 = var3.a6().n5("/ppt/drawings/drawing{0}.xml", new g4u$13(var3), new com.aspose.slides.internal.c8m.q0());
         j2w var5 = new j2w(var6, var3);
         var5.n5(var0, var2);
         var1.t2().n5(var3.u6().l6(var6).a6());
      }
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w3o var1, g6c var2) {
      if (var0.hasTitle()) {
         q9u.n5(var0.getChartTitle(), var1.n5(), var2);
         var1.l6().n5(false);
      } else {
         var1.l6().n5(true);
      }

      e2l.n5(var0.getFloor(), new g4u$14(var1), var2);
      e2l.n5(var0.getBackWall(), new g4u$15(var1), var2);
      e2l.n5(var0.getSideWall(), new g4u$2(var1), var2);
      o2e.n5(var0, new g4u$3(var1), var2);
      var1.c8().n5(var0.getPlotVisibleCellsOnly());
      var1.t2().n5(var0.getDisplayBlanksAs());
      var1.s7().n5(var0.getShowDataLabelsOverMaximum());
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w4c var1, j8m var2) {
      g6c var3 = var2.n5().n5();
      x2o.n5(var0, new g4u$4(var1), var3);
      o6t.n5(var0.getPlotArea(), var1, var3);
      f4.n5(var0, var1, var3);
      t9p.n5(var0, var1, var2);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.y2 var1, g6c var2) {
      y8m var3 = ((Chart)var0).l6();
      var1.n5().n5(var3.n5());
      if (var3.l6() != null) {
         var1.l6().n5(var3.l6());
      }

      var1.n5(var3.k5());
      var1.l6(var3.u3());
      var1.k5(var3.a6());
      com.aspose.slides.internal.k4y.w3o var4 = var1.t4();
      var4.n5(var3.u9());
      var1.n5(var3.h0());
      var4.n5(var3.t2());
      a1g.n5((Chart)var0, new g4u$5(var1));
      q3x.n5(var0.getRotation3D(), new g4u$6(var4));
      ChartData var5 = (ChartData)var0.getChartData();
      boolean var6 = var5.l6().k5() == 2;
      com.aspose.slides.internal.c8m.a1 var7;
      switch (var5.l6().u3()) {
         case 1:
            var7 = new com.aspose.slides.internal.c8m.v3();
            break;
         case 4:
            var7 = new com.aspose.slides.internal.c8m.v8();
            break;
         default:
            var7 = new com.aspose.slides.internal.c8m.j4();
      }

      var1.n5(var3.s7());
      if (var1.m1() == null) {
         var1.c8();
      }

      com.aspose.slides.internal.c8m.r7 var11;
      if (var3.x8() != 1) {
         String var8;
         if (var6) {
            var8 = ((ChartDataWorkbook)var5.getChartDataWorkbook()).c8();
         } else {
            var8 = g5g.n5(var5.getEmbeddedWorkbookType());
         }

         int var9 = n5(var8, var2);
         com.aspose.slides.internal.c8m.j8 var10 = var2.a6()
            .n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings/Microsoft_Excel_Worksheet", com.aspose.slides.ms.System.a3.l6(var9), var8}), null, var7);
         if (var6) {
            var10.n5(com.aspose.slides.internal.n2d.t4.k5(var5.l6().a6()));
         } else {
            var10.n5(var5.l6().c8().toArray());
         }

         var11 = var2.u6().l6(var10);
      } else {
         if (var3.y4() == null) {
            var3.k5(com.aspose.slides.internal.c8m.f4.n5.n5());
         }

         String var16 = w8d.n5(var5.l6().u9());
         var11 = var2.u6()
            .n5(var3.y4(), com.aspose.slides.ms.System.d1.l6(var16, "file:///") ? com.aspose.slides.ms.System.d1.n5(var16, " ", "%20") : var16, (byte)1);
         if (var6 && com.aspose.slides.ms.System.d1.l6(var16, "file:///") && ((ChartDataWorkbook)var5.getChartDataWorkbook()).a6()) {
            com.aspose.slides.internal.z0k.t2 var18 = new com.aspose.slides.internal.z0k.t2(
               com.aspose.slides.ms.System.d1.n5(var16, "file:///", com.aspose.slides.ms.System.d1.n5)
            );
            if (var18.n5()) {
               byte[] var19 = var0.getChartData().readWorkbookStream();
               var18.u3();
               com.aspose.slides.internal.z0k.n3 var12 = new com.aspose.slides.internal.z0k.n3(var18.u9(), 1);

               try {
                  var12.write(var19, 0, var19.length);
               } finally {
                  if (var12 != null) {
                     var12.dispose();
                  }
               }
            }
         }
      }

      if (var1.m1() != null) {
         var1.m1().n5(var11.a6());
      }

      if (var11.h0() == 1) {
         if (var3.s7() != null) {
            boolean var17 = var3.s7().k5() != null && var3.s7().k5().n5();
            if (var1.m1().k5() == null) {
               var1.m1().n5();
            }

            var1.m1().k5().n5(var17);
         } else {
            if (var1.m1().k5() == null) {
               var1.m1().n5();
            }

            var1.m1().k5().n5(false);
         }
      }
   }

   private static int n5(String var0, g6c var1) {
      int var2 = var1.q0();
      String[] var3 = new String[]{
         com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings/Microsoft_Excel_Worksheet", com.aspose.slides.ms.System.a3.l6(var2), var0})
      };
      int var4 = com.aspose.slides.ms.System.u3.l6(var1.a6().t2(), new g4u$7(var3));
      return var4 == -1 ? var2 : n5(var0, var1);
   }

   static IGenericDictionary<Integer, g4u$n5> n5() {
      synchronized (l6) {
         if (n5 == null) {
            List var1 = new List();
            var1.addItem(0);
            var1.addItem(1);
            var1.addItem(2);
            var1.addItem(3);
            var1.addItem(4);
            var1.addItem(5);
            n5 = new com.aspose.slides.internal.n2d.z1<>(Integer.class, g4u$n5.class);
            n5.addItem(4, new g4u$n5(2, 4, 0));
            n5.addItem(5, new g4u$n5(2, 1, 0));
            n5.addItem(7, new g4u$n5(2, 2, 3));
            n5.addItem(8, new g4u$n5(2, 4, 3));
            n5.addItem(9, new g4u$n5(2, 1, 3));
            n5.addItem(10, new g4u$n5(2, 3, 3));
            n5.addItem(11, new g4u$n5(2, 2, 1));
            n5.addItem(12, new g4u$n5(2, 4, 1));
            n5.addItem(13, new g4u$n5(2, 1, 1));
            n5.addItem(14, new g4u$n5(2, 3, 1));
            n5.addItem(15, new g4u$n5(2, 2, 4));
            n5.addItem(16, new g4u$n5(2, 4, 4));
            n5.addItem(17, new g4u$n5(2, 1, 4));
            n5.addItem(18, new g4u$n5(2, 3, 4));
            n5.addItem(33, new g4u$n5(1, 2, 0));
            n5.addItem(36, new g4u$n5(1, 4, 0));
            n5.addItem(37, new g4u$n5(1, 1, 0));
            n5.addItem(38, new g4u$n5(1, 2, 3));
            n5.addItem(39, new g4u$n5(1, 4, 3));
            n5.addItem(40, new g4u$n5(1, 1, 3));
            n5.addItem(41, new g4u$n5(1, 2, 1));
            n5.addItem(42, new g4u$n5(1, 4, 1));
            n5.addItem(44, new g4u$n5(1, 2, 4));
            n5.addItem(45, new g4u$n5(1, 4, 4));
            n5.addItem(46, new g4u$n5(1, 1, 4));
            n5.addItem(43, new g4u$n5(1, 1, 1));
            n5.addItem(3, new g4u$n5(2, 2, 0, var1));
            n5.addItem(6, new g4u$n5(2, 3, 0, var1));
         }
      }

      return n5;
   }
}
