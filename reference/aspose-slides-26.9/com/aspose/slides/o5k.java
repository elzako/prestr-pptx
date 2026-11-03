package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class o5k {
   public static IChart n5(IShapeCollection var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2, boolean var3) {
      return n5(var0, var1, var2, var3, null);
   }

   public static IChart n5(IShapeCollection var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2, boolean var3, ChartDataWorkbook var4) {
      if (var1 == null) {
         return null;
      }

      String var5 = var3 ? var1.k5().n5().e2().n5() : var1.k5().n5().y4().n5();
      com.aspose.slides.internal.c8m.j8 var6 = var2.n5().k7().n5(var5).l6();
      if (var6 == null) {
         return null;
      }

      IChart var7 = null;
      if (var3) {
         s1o var8 = new s1o(var6, var2.n5());
         var7 = var8.n5(var0, null, var1, var2, var4);
      } else {
         c7f var13 = new c7f(var6, var2.n5());
         var7 = var13.n5(var0, null, var1, var2);
      }

      if (var7 != null) {
         com.aspose.slides.internal.c8m.r7[] var14 = var6.e2().n5(com.aspose.slides.internal.c8m.t4.n5);
         z1n var9 = ((Chart)var7).t9();
         if (var14.length > 0) {
            r5t var10 = new r5t(var14[0].l6(), var2.n5());
            var10.n5(var9);
         }

         com.aspose.slides.internal.c8m.r7[] var15 = var6.e2().n5(com.aspose.slides.internal.c8m.m1.n5);
         if (var15.length > 0) {
            p6r var11 = new p6r(var15[0].l6(), var2.n5());
            var11.n5(var9);
         }

         if (var9.k5() && !ChartTypeCharacterizer.u3(var7.getType()) && !n5(var7)) {
            var9.n5((com.aspose.slides.internal.k4y.e5m)null);
            var9.n5((com.aspose.slides.internal.k4y.k4d)null);
         }
      }

      return var7;
   }

   private static boolean n5(IChart var0) {
      IGenericEnumerator var1 = var0.getChartData().getSeries().iterator();

      try {
         while (var1.hasNext()) {
            IChartSeries var2 = (IChartSeries)var1.next();
            if (var2.getDataPoints().size() != 0 && ((ChartDataPoint)var2.getDataPoints().get_Item(0)).h0()) {
               IGenericEnumerator var3 = var2.getDataPoints().iterator();

               try {
                  while (var3.hasNext()) {
                     ChartDataPoint var4 = (ChartDataPoint)var3.next();
                     Format var5 = (Format)var4.getFormat();
                     if (var5.getFill().getFillType() == -1) {
                        IFormat var6 = var4.u9();
                        if (!((ColorFormat)var6.getFill().getSolidFillColor()).u3().equals(var4.n5(false).o8())) {
                           return false;
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                     var3.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      boolean var3 = false;
      IGenericEnumerator var4 = var0.getChartData().getSeries().iterator();

      try {
         while (var4.hasNext()) {
            IChartSeries var5 = (IChartSeries)var4.next();
            if (ChartTypeCharacterizer.u3(var5.getType())) {
               var3 = true;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (var3) {
         l6(var0, var1, var2);
      } else {
         k5(var0, var1, var2);
      }
   }

   private static void l6(IChart var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      com.aspose.slides.internal.k4y.x0d var3 = var1.k5().n5().k5();
      g6c var4 = var2.n5();
      com.aspose.slides.internal.c8m.j8 var5 = var4.a6().n5("/ppt/charts/chartEx{0}.xml", new o5k$1(var4), new com.aspose.slides.internal.c8m.k7());
      s1o var6 = new s1o(var5, var4);
      var6.n5(var0, var1, var2);
      com.aspose.slides.internal.c8m.r7 var7 = var4.u6().l6(var5);
      var3.n5(var7.a6());
      n5(var0, var4, var5);
   }

   private static void k5(IChart var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      com.aspose.slides.internal.k4y.c4 var3 = var1.k5().n5().l6();
      g6c var4 = var2.n5();
      com.aspose.slides.internal.c8m.j8 var5 = var4.a6().n5("/ppt/charts/chart{0}.xml", new o5k$2(var4), new com.aspose.slides.internal.c8m.z3());
      c7f var6 = new c7f(var5, var4);
      var6.n5(var0, var1, var2);
      com.aspose.slides.internal.c8m.r7 var7 = var4.u6().l6(var5);
      var3.n5(var7.a6());
      n5(var0, var4, var5);
   }

   private static void n5(IChart var0, g6c var1, com.aspose.slides.internal.c8m.j8 var2) {
      z1n var3 = ((Chart)var0).t9();
      if (var3.l6() != null) {
         com.aspose.slides.internal.c8m.j8 var4 = var1.a6().n5("/ppt/charts/colors{0}.xml", new o5k$3(var1), new com.aspose.slides.internal.c8m.t4());
         r5t var5 = new r5t(var4, var1);
         var5.l6(var3);
         var2.e2().l6(var4);
      }

      if (var3.n5() != null) {
         com.aspose.slides.internal.c8m.j8 var6 = var1.a6().n5("/ppt/charts/style{0}.xml", new o5k$4(var1), new com.aspose.slides.internal.c8m.m1());
         p6r var7 = new p6r(var6, var1);
         var7.l6(var3);
         var2.e2().l6(var6);
      }
   }
}
