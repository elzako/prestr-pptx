package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class u7f {
   public static void n5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, com.aspose.slides.internal.k4y.w2p var2, c1x var3) {
      if (var2 != null) {
         t5w var4 = var3.n5().n5();
         l6(var0, var2, var4);
         g4u.n5(var0, var1, var3.n5());
         n5(var0, var2, var4);
         u3(var0, var2, var4);
         n5(var0, var2, var3);
         k5(var0, var2, var4);
      }
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, t5w var2) {
      z6a.n5(var0, var1.u3(), var2);
      k3.n5(var0.getThemeManager(), var2);
   }

   private static void l6(IChart var0, com.aspose.slides.internal.k4y.w2p var1, t5w var2) {
      y8m var3 = ((Chart)var0).l6();
      var3.n5(var1.h0());
      a1g.n5((Chart)var0, var1.a6());
      com.aspose.slides.internal.k4y.q7j var4 = var1.l6().l6();
      if (var4 != null) {
         com.aspose.slides.internal.c8m.r7 var5 = var2.k7().n5(var4.n5());
         if (var5 != null) {
            var3.n5(var5.h0());
            var3.l6(var5.n5());
            var3.k5(var5.u9());
         }
      }
   }

   private static void k5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, t5w var2) {
      if (var1.u9() != null) {
         q2u var3 = ((Chart)var0).z1();
         m1z.n5(var3, var1.u9(), var2);
      }
   }

   private static void u3(IChart var0, com.aspose.slides.internal.k4y.w2p var1, t5w var2) {
      com.aspose.slides.internal.k4y.w8s var3 = var1.k5();
      q4d.n5(var0.getChartTitle(), var3.k5(), var2);
      e6x.n5(var0, var3.a6(), var2);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, c1x var2) {
      com.aspose.slides.internal.k4y.a1v var3 = var1.k5().u3();
      p7x.n5(var0.getPlotArea(), var3, var2.n5().n5());
      t4d.n5(var0, var2.n5().n5(), null, var1);
      v9e.n5(var0.getChartData(), var1, var2);
      f4.n5(var0.getAxes(), var3, var2);
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, com.aspose.slides.internal.k4y.s1k var2, j8m var3) {
      n5(var0, var1, var3.n5().n5());
      g4u.n5(var0, var2, var3.n5());
      l6(var0, var1, var3);
      n5(var0, var1, var3);
      k5(var0, var1, var3);
      u3(var0, var1, var3);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      com.aspose.slides.internal.k4y.w8s var3 = var1.k5();
      if (var0.hasTitle()) {
         q4d.n5(var0.getChartTitle(), var3.n5(), var2.n5().n5());
      }

      if (var0.hasLegend()) {
         e6x.n5(var0, var3.l6(), var2.n5().n5());
      }
   }

   private static void l6(IChart var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      g6c var3 = var2.n5().n5();
      if (var0.getFillFormat().getFillType() != -1
         || !var0.getLineFormat().isFormatNotDefined()
         || !var0.getEffectFormat().isNoEffects()
         || r6k.n5(var0.getThreeDFormat(), true)) {
         com.aspose.slides.internal.k4y.b9y var4 = var1.n5();
         x9f.n5(var0.getFillFormat(), new u7f$1(var4), var3);
         i3z.n5(var0.getLineFormat(), new u7f$2(var4));
         w5i.n5(var0.getEffectFormat(), new u7f$3(var4), var3);
         r6k.n5(var0.getThreeDFormat(), new u7f$4(var4), new u7f$5(var4), null);
      }

      k3.n5(var0.getThemeManager(), var3.u6(), var3);
   }

   private static void k5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      p7x.n5(var0.getPlotArea(), var1, var2);
      v9e.n5(var0, var1, var2);
      f4.n5(var0, var1.k5().u3(), var2.n5().n5());
   }

   private static void u3(IChart var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      q2u var3 = ((Chart)var0).z1();
      g6c var4 = var2.n5().n5();
      m1z.n5(var3, var1, var4);
   }

   private static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, g6c var2) {
      y8m var3 = ((Chart)var0).l6();
      var1.n5(var3.c8());
      ChartData var4 = (ChartData)var0.getChartData();
      ChartDataWorkbook var5 = null;
      boolean var6 = var4.l6().k5() == 2;
      if (var6) {
         var5 = (ChartDataWorkbook)var4.l6().l6();
      }

      com.aspose.slides.internal.c8m.a1 var7;
      if ((var5 == null || var5.k5() != 1) && var4.l6().u3() != 1) {
         if ((var5 == null || var5.k5() != 4) && var4.l6().u3() != 4) {
            var7 = new com.aspose.slides.internal.c8m.j4();
         } else {
            var7 = new com.aspose.slides.internal.c8m.v8();
         }
      } else {
         var7 = new com.aspose.slides.internal.c8m.v3();
      }

      com.aspose.slides.internal.c8m.r7 var10;
      if (var3.x8() != 1) {
         String var8;
         if (var6) {
            var8 = var5.c8();
         } else {
            var8 = g5g.n5(var4.getEmbeddedWorkbookType());
         }

         com.aspose.slides.internal.c8m.j8 var9 = var2.a6()
            .n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings/Microsoft_Excel_Worksheet", com.aspose.slides.ms.System.a3.l6(var2.q0()), var8}), null, var7);
         if (var6) {
            var9.n5(var0.getChartData().readWorkbookStream());
         } else {
            var9.n5(var4.l6().c8().toArray());
         }

         var10 = var2.u6().l6(var9);
      } else {
         var10 = var2.u6().n5(var3.y4(), var3.n3(), (byte)1);
      }

      com.aspose.slides.internal.k4y.q7j var11 = new com.aspose.slides.internal.k4y.q7j();
      var11.n5(var10.a6());
      var1.l6().n5(var11);
      var11.n5((byte)0);
   }

   static int n5(com.aspose.slides.internal.k4y.a1v var0, com.aspose.slides.internal.k4y.x1i var1) {
      int var2 = var1.a6();
      byte var3;
      switch (var2) {
         case 1:
            var3 = 78;
            break;
         case 2:
            var3 = 76;
            break;
         case 3:
            var3 = 80;
            break;
         case 4:
            var3 = 77;
            break;
         case 5:
            var3 = 81;
            break;
         case 6:
            var3 = 75;
            break;
         case 7:
            var3 = 74;
            break;
         case 8:
            var3 = 79;
            break;
         default:
            throw new Exception("Unknown series type");
      }

      return var3;
   }
}
