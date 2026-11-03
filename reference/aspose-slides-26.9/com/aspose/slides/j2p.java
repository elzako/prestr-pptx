package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class j2p extends k3h {
   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3, t5w var4, boolean var5) {
      this.l6(var1, var2, var3);
      ChartDataPointCollection var6 = com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class);
      switch (var3) {
         case 0:
            var6.n5(var2.l6());
            break;
         case 1:
            var6.l6(var2.l6());
            break;
         case 2:
            var6.u3(var2.l6());
            break;
         case 3:
            var6.k5(var2.l6());
            break;
         case 4:
            var6.a6(var2.l6());
            break;
         case 5:
            var6.u9(var2.l6());
            break;
         case 6:
            var6.h0(var2.l6());
            break;
         case 7:
            var6.c8(var2.l6());
      }

      com.aspose.slides.internal.k4y.z3o var8;
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l6s.class)) {
         com.aspose.slides.internal.k4y.l6s var7 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k4y.l6s.class);
         var8 = (com.aspose.slides.internal.k4y.z3o)var7.a6().l6();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l0u.class)) {
            return;
         }

         com.aspose.slides.internal.k4y.l0u var29 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k4y.l0u.class);
         if (!com.aspose.slides.internal.v6g.k5.l6(var29.a6().l6(), com.aspose.slides.internal.k4y.z3o.class)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var29.a6().l6(), com.aspose.slides.internal.k4y.w9n.class)) {
               com.aspose.slides.internal.k4y.w9n var31 = (com.aspose.slides.internal.k4y.w9n)var29.a6().l6();
               int var32 = (int)var31.k5().k5().n5();

               for (int var36 = var1.getDataPoints().size(); var36 < var32; var36++) {
                  ((ChartDataPointCollection)var1.getDataPoints()).n5();
               }

               for (com.aspose.slides.internal.k4y.t9z var43 : var31.k5().u3()) {
                  for (com.aspose.slides.internal.k4y.l6j var18 : var43.l6()) {
                     int var19 = (int)var18.n5();
                     ChartDataPoint var50 = (ChartDataPoint)var1.getDataPoints().get_Item(var19);
                     u0a var51 = n5(var50, var3);
                     if (var51.n5() == null) {
                        var51.n5((Object)var18.l6());
                     } else {
                        var51.n5((Object)com.aspose.slides.ms.System.d1.n5(new String[]{(String)var51.n5(), " ", var18.l6()}));
                     }
                  }
               }

               return;
            }

            com.aspose.slides.internal.k4y.c9q var9 = (com.aspose.slides.internal.k4y.c9q)var29.a6().l6();
            int var10 = (int)com.aspose.slides.ms.System.q1.u3(var9.k5().k5().n5(), (this.n5(var2) & 4294967295L) + 1L & 4294967295L);

            for (int var34 = var1.getDataPoints().size(); var34 < var10; var34++) {
               ((ChartDataPointCollection)var1.getDataPoints()).n5();
            }

            for (com.aspose.slides.internal.k4y.l6j var42 : var9.k5().u3()) {
               int var44 = (int)var42.n5();
               ChartDataPoint var46 = (ChartDataPoint)var1.getDataPoints().get_Item(var44);
               u0a var48 = n5(var46, var3);
               var48.n5((Object)var42.l6());
            }

            return;
         }

         var8 = (com.aspose.slides.internal.k4y.z3o)var29.a6().l6();
      }

      if (var8.k5() != null) {
         if (var3 == 0) {
            com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class).n5(true);
         }

         com.aspose.slides.internal.k4y.o8r[] var30 = var8.k5().a6();
         if (var30 != null) {
            long var22 = var8.k5().u3().n5();
            com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class).n5(var8.k5().u3().n5());
            if (var3 == 1 || var3 == 2) {
               var22 = com.aspose.slides.ms.System.q1.u3(var8.k5().u3().n5(), (this.n5(var2) & 4294967295L) + 1L & 4294967295L);
            }

            if (var3 == 4 || var3 == 5 || var3 == 6 || var3 == 7) {
               var22 = var1.getDataPoints().size() & 4294967295L;
               if ((var22 & 4294967295L) < (var8.k5().u3().n5() & 4294967295L)) {
                  com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class).n5(var22);
               }
            }

            if (var5) {
               var22 = (this.n5(var2) & 4294967295L) + 1L & 4294967295L;
            }

            for (long var24 = var1.getDataPoints().size() & 4294967295L; (var24 & 4294967295L) < (var22 & 4294967295L); var24++) {
               ((ChartDataPointCollection)var1.getDataPoints()).n5();
            }

            for (com.aspose.slides.internal.k4y.o8r var14 : var30) {
               int var15 = (int)var14.n5();
               if (var15 < var6.size()) {
                  ChartDataPoint var16 = (ChartDataPoint)var1.getDataPoints().get_Item(var15);
                  u0a var17 = n5(var16, var3);
                  double var26 = 0.0;
                  String var20 = var14.l6();
                  if ("#N/A".equals(var14.k5())) {
                     var17.n5((Object)var14.k5());
                     var17.n5(var20);
                  } else {
                     double[] var21 = new double[]{0.0};
                     boolean var28 = !n5(var14.k5(), var21);
                     var26 = var21[0];
                     if (var28) {
                        if (!com.aspose.slides.ms.System.d1.n5(var14.k5())) {
                           var17.n5((Object)var14.k5());
                           var17.n5(var20);
                        }
                     } else {
                        var17.n5(var26);
                        var17.n5(var20);
                     }
                  }
               }
            }

            if (var30.length == 0 && (var22 & 4294967295L) == 1L && var3 < 2) {
               u0a var33 = n5((ChartDataPoint)var1.getDataPoints().get_Item(0), var3);
               var33.n5(Double.NaN);
            }
         }
      }
   }

   private long n5(com.aspose.slides.internal.k4y.z8 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.l6s.class)) {
         com.aspose.slides.internal.k4y.l6s var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.l6s.class);
         com.aspose.slides.internal.k4y.z3o var3 = (com.aspose.slides.internal.k4y.z3o)var2.a6().l6();
         com.aspose.slides.internal.k4y.o8r[] var4 = var3.k5().a6();
         if (var4.length > 0) {
            return var4[var4.length - 1].n5();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.l0u.class)) {
         com.aspose.slides.internal.k4y.l0u var5 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.l0u.class);
         if (com.aspose.slides.internal.v6g.k5.l6(var5.a6().l6(), com.aspose.slides.internal.k4y.z3o.class)) {
            com.aspose.slides.internal.k4y.z3o var6 = (com.aspose.slides.internal.k4y.z3o)var5.a6().l6();
            com.aspose.slides.internal.k4y.o8r[] var8 = var6.k5().a6();
            if (var8.length > 0) {
               return var8[var8.length - 1].n5();
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var5.a6().l6(), com.aspose.slides.internal.k4y.c9q.class)) {
            com.aspose.slides.internal.k4y.c9q var7 = (com.aspose.slides.internal.k4y.c9q)var5.a6().l6();
            com.aspose.slides.internal.k4y.l6j[] var9 = var7.k5().u3();
            if (var9.length > 0) {
               return var9[var9.length - 1].n5();
            }
         }
      }

      return 4294967295L;
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.m3 var2) {
      ChartSeries var3 = (ChartSeries)var1;
      if (!com.aspose.slides.ms.System.d1.n5(var3.x8())) {
         com.aspose.slides.internal.k4y.w1c var4 = var2.c8();
         com.aspose.slides.internal.k4y.c9q var5 = (com.aspose.slides.internal.k4y.c9q)var4.n5("strRef").l6();
         var5.n5(var3.n3());
         com.aspose.slides.internal.k4y.p4t var6 = var5.n5();
         var6.n5().n5(var3.n5.size() & 4294967295L);

         for (int var7 = 0; var7 < var3.n5.size(); var7++) {
            com.aspose.slides.internal.k4y.l6j var8 = var6.l6();
            var8.n5(var7 & 4294967295L);
            var8.n5(com.aspose.slides.ms.System.z3.e2(var3.n5.get_Item(var7), com.aspose.slides.internal.x7n.l6.k5()));
         }
      }
   }

   @Override
   void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k4y.l6s.class)) {
         this.n5((ChartSeries)var1, (com.aspose.slides.internal.k4y.z3o)((com.aspose.slides.internal.k4y.l6s)var2).n5("numRef").l6(), var3);
      } else if (this.l6(var1, var3)) {
         this.n5((ChartSeries)var1, (com.aspose.slides.internal.k4y.z3o)((com.aspose.slides.internal.k4y.l0u)var2).n5("numRef").l6(), var3);
      } else {
         this.n5((ChartSeries)var1, (com.aspose.slides.internal.k4y.c9q)((com.aspose.slides.internal.k4y.l0u)var2).n5("strRef").l6(), var3);
      }
   }

   @Override
   boolean n5(IChartSeries var1, int var2) {
      ChartDataPointCollection var3 = com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class);
      switch (var2) {
         case 0:
            return var3.s7() != null;
         case 1:
            return var3.x8() != null;
         case 2:
            return var3.y4() != null;
         case 3:
            return var3.n3() != null;
         case 4:
            return var3.e2() != null;
         case 5:
            return var3.t9() != null;
         case 6:
            return var3.z1() != null;
         case 7:
            return var3.t4() != null;
         default:
            return false;
      }
   }

   private void n5(ChartSeries var1, com.aspose.slides.internal.k4y.z3o var2, int var3) {
      com.aspose.slides.internal.k4y.a8e var4 = new com.aspose.slides.internal.k4y.a8e();
      ChartDataPointCollection var5 = com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class);
      var4.n5();
      boolean var6 = true;
      switch (var3) {
         case 0:
            if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfXValues()))) {
               var4.n5(var1.getNumberFormatOfXValues());
            }

            var2.n5(var5.s7());
            var6 = var5.m1();
            break;
         case 1:
            if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfYValues()))) {
               var4.n5(var1.getNumberFormatOfYValues());
            }

            var2.n5(var5.x8());
            break;
         case 2:
            if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfBubbleSizes()))) {
               var4.n5(var1.getNumberFormatOfBubbleSizes());
            }

            var2.n5(var5.y4());
            break;
         case 3:
            if (!"".equals(com.aspose.slides.ms.System.d1.l6(var1.getNumberFormatOfValues()))) {
               var4.n5(var1.getNumberFormatOfValues());
            }

            var2.n5(var5.n3());
            break;
         case 4:
            var2.n5(var5.e2());
            break;
         case 5:
            var2.n5(var5.t9());
            break;
         case 6:
            var2.n5(var5.z1());
            break;
         case 7:
            var2.n5(var5.t4());
      }

      if (!var1.l6()) {
         long var7 = var5.k7();
         if (!com.aspose.slides.ms.System.d1.n5(var2.l6()) && ChartTypeCharacterizer.y4(var1.getType())) {
            int var9 = n5(var2.l6());
            if (var9 > 0 && (var7 & 4294967295L) < var9) {
               var7 = var9 & 4294967295L;
            }
         }

         for (int var14 = 0; var14 < var5.size(); var14++) {
            u0a var10 = n5(com.aspose.slides.internal.v6g.k5.n5(var5.get_Item(var14), ChartDataPoint.class), var3);
            Object var11 = var10.n5();
            String var12 = var10.l6();
            if (var11 != null) {
               if (com.aspose.slides.internal.v6g.k5.l6(var11, Double.class)
                  && com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.u3(var11, double.class))) {
                  var11 = "#N/A";
               }

               com.aspose.slides.internal.k4y.o8r var13 = var4.l6();
               var13.n5(var14 & 4294967295L);
               var13.l6(com.aspose.slides.ms.System.z3.t9(var11, com.aspose.slides.internal.x7n.l6.k5()));
               if (!com.aspose.slides.ms.System.d1.n5(var12)) {
                  var13.n5(var12);
               }

               if (((var13.n5() & 4294967295L) + 1L & 4294967295L) > (var7 & 4294967295L)) {
                  var7 = (var13.n5() & 4294967295L) + 1L & 4294967295L;
               }
            }
         }

         if (var4.a6().length != 0 || var6) {
            var4.u3().n5(var7);
            var2.n5(var4);
         }
      }
   }

   private void n5(ChartSeries var1, com.aspose.slides.internal.k4y.c9q var2, int var3) {
      ChartDataPointCollection var4 = com.aspose.slides.internal.v6g.k5.n5(var1.getDataPoints(), ChartDataPointCollection.class);
      switch (var3) {
         case 0:
            var2.n5(var4.s7());
            break;
         case 1:
            var2.n5(var4.x8());
            break;
         case 2:
            var2.n5(var4.y4());
            break;
         case 3:
            var2.n5(var4.n3());
            break;
         case 4:
            var2.n5(var4.e2());
            break;
         case 5:
            var2.n5(var4.t9());
            break;
         case 6:
            var2.n5(var4.z1());
            break;
         case 7:
            var2.n5(var4.t4());
      }

      com.aspose.slides.internal.k4y.p4t var5 = var2.n5();
      long var6 = 0L;

      for (int var8 = 0; var8 < var4.size(); var8++) {
         u0a var9 = n5((ChartDataPoint)var4.get_Item(var8), var3);
         if (var4.get_Item(var8).getValue() != null) {
            com.aspose.slides.internal.k4y.l6j var10 = var5.l6();
            var10.n5(var8 & 4294967295L);
            var10.n5(com.aspose.slides.ms.System.z3.t9(var9.n5(), com.aspose.slides.internal.x7n.l6.k5()));
            if (((var10.n5() & 4294967295L) + 1L & 4294967295L) > (var6 & 4294967295L)) {
               var6 = (var10.n5() & 4294967295L) + 1L & 4294967295L;
            }
         }
      }

      var5.n5().n5(var6);
   }

   private boolean l6(IChartSeries var1, int var2) {
      for (int var3 = 0; var3 < var1.getDataPoints().size(); var3++) {
         u0a var4 = n5((ChartDataPoint)var1.getDataPoints().get_Item(var3), var2);
         if (var4 != null && var4.n5() != null) {
            double var5 = 0.0;
            double[] var7 = new double[]{0.0};
            boolean var8 = n5(com.aspose.slides.ms.System.z3.t9(var4.n5(), com.aspose.slides.internal.x7n.l6.k5()), var7);
            var5 = var7[0];
            if (!var8) {
               return false;
            }
         }
      }

      return true;
   }

   static u0a n5(ChartDataPoint var0, int var1) {
      switch (var1) {
         case 0:
            return var0.s7();
         case 1:
            return var0.x8();
         case 2:
            return var0.n3();
         case 3:
            return var0.t2();
         case 4:
            return var0.y4();
         case 5:
            return var0.e2();
         case 6:
            return var0.t9();
         case 7:
            return var0.z1();
         case 8:
            return var0.t4();
         case 9:
            return var0.q0();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   private static int n5(String var0) {
      com.aspose.slides.internal.r7c.u3 var1 = com.aspose.slides.internal.r7c.c8.n5(var0, "!(\\$?[A-Z]+)\\$?(\\d+):\\$?([A-Z]+)\\$?(\\d+)$");
      if (!var1.u3()) {
         return 0;
      }

      String var2 = com.aspose.slides.ms.System.d1.n5(var1.a6().n5(1).k5(), "$", "");
      int var3 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(2).k5());
      String var4 = com.aspose.slides.ms.System.d1.n5(var1.a6().n5(3).k5(), "$", "");
      int var5 = com.aspose.slides.ms.System.a3.n5(var1.a6().n5(4).k5());
      int var6 = l6(var4) - l6(var2) + 1;
      int var7 = var5 - var3 + 1;
      return var6 * var7;
   }

   private static int l6(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < com.aspose.slides.ms.System.d1.t2(var0).length(); var2++) {
         char var3 = com.aspose.slides.ms.System.d1.t2(var0).charAt(var2);
         var1 = var1 * 26 + var3 - 'A' + 1;
      }

      return var1;
   }
}
