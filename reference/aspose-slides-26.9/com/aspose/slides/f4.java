package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.IDisposable;

class f4 {
   public static void n5(IAxesManager var0, com.aspose.slides.internal.k4y.w4c var1, c1x var2) {
      int var3 = 0;
      var3 += var0.getHorizontalAxis() != null ? 1 : 0;
      var3 += var0.getVerticalAxis() != null ? 1 : 0;
      var3 += var0.getSecondaryHorizontalAxis() != null ? 1 : 0;
      var3 += var0.getSecondaryVerticalAxis() != null ? 1 : 0;
      var3 += var0.getSeriesAxis() != null ? 1 : 0;
      if (var1 == null) {
         throw new Exception("plotAreaElementData must not be null.");
      }

      if (var3 == 2) {
         n5((AxesManager)var0, var1.u9());
         com.aspose.slides.internal.k4y.c8 var4 = null;
         com.aspose.slides.internal.k4y.c8 var5 = null;
         if (n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(0).l6())) {
            var4 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(0).l6();
            var5 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(1).l6();
         } else {
            var5 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(0).l6();
            var4 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(1).l6();
         }

         if (var1.u9().size() > 2 && com.aspose.slides.internal.v6g.k5.l6(var1.u9().get_Item(2).l6(), com.aspose.slides.internal.k4y.q2c.class)) {
            ((AxesManager)var0).n5((com.aspose.slides.internal.k4y.q2c)var1.u9().get_Item(2).l6());
            ((AxesManager)var0).k5();
            com.aspose.slides.internal.k4y.c8 var6 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(2).l6();
            if (var0.getSeriesAxis() != null) {
               y6.n5(var0.getSeriesAxis(), var6, var2);
            }
         }

         if (var4 != null && var5 != null) {
            y6.n5(var0.getHorizontalAxis(), var4, var2);
            y6.n5(var0.getVerticalAxis(), var5, var2);
         }
      } else if (var3 == 3) {
         com.aspose.slides.internal.k4y.c8 var23 = null;
         com.aspose.slides.internal.k4y.c8 var27 = null;
         com.aspose.slides.internal.k4y.c8 var30 = null;

         for (int var7 = 0; var7 < 3; var7++) {
            if (n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var7).l6())) {
               var23 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var7).l6();
               break;
            }
         }

         for (int var33 = 0; var33 < 3; var33++) {
            if (l6((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var33).l6())) {
               var27 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var33).l6();
               break;
            }
         }

         for (int var34 = 0; var34 < 3; var34++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.u9().get_Item(var34).l6(), com.aspose.slides.internal.k4y.q2c.class)) {
               var30 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var34).l6();
               break;
            }
         }

         if (var23 != null && var27 != null && var30 != null) {
            y6.n5(var0.getHorizontalAxis(), var23, var2);
            y6.n5(var0.getVerticalAxis(), var27, var2);
            if (var0.getSeriesAxis() != null) {
               y6.n5(var0.getSeriesAxis(), var30, var2);
            } else {
               ((AxesManager)var0).n5((com.aspose.slides.internal.k4y.q2c)var30);
            }
         }
      } else if (var3 == 4) {
         com.aspose.slides.internal.k4y.c8 var24 = null;
         com.aspose.slides.internal.k4y.c8 var28 = null;
         com.aspose.slides.internal.k4y.c8 var31 = null;
         com.aspose.slides.internal.k4y.c8 var35 = null;
         l6(var1);

         for (int var8 = 0; var8 < 2; var8++) {
            if (n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var8).l6())) {
               if (var8 == 0 && n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var8 + 1).l6())) {
                  var24 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var8 + 1).l6();
                  var31 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var8).l6();
                  break;
               }

               var24 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var8).l6();
               break;
            }
         }

         for (int var37 = 0; var37 < 4; var37++) {
            if (l6((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var37).l6())) {
               if (var37 == 0 && l6((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var37 + 1).l6())) {
                  var28 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var37 + 1).l6();
                  var35 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var37).l6();
                  break;
               }

               var28 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var37).l6();
               break;
            }
         }

         int var38 = 0;
         if (var1.u9().size() == 3) {
            var38 = com.aspose.slides.ms.System.q1.n5(var24.n5().n5(), var28.n5().n5());
            com.aspose.slides.internal.k4y.c8 var42 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(2).l6();
            if (n5(var42)) {
               var31 = var42;
               var35 = var28;
               var38 = com.aspose.slides.ms.System.q1.n5(var38, var31.n5().n5());
            } else if (l6(var42)) {
               var35 = var42;
               var31 = var24;
               var38 = com.aspose.slides.ms.System.q1.n5(var38, var42.n5().n5());
            }
         } else {
            for (int var9 = 2; var9 < 4; var9++) {
               if (n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var9).l6())) {
                  if (var9 == 2 && n5((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var9 + 1).l6())) {
                     var24 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var9 + 1).l6();
                     var31 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var9).l6();
                  } else {
                     var31 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var9).l6();
                  }
                  break;
               }
            }

            for (int var41 = 2; var41 < 4; var41++) {
               if (l6((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var41).l6())) {
                  if (var41 == 2 && l6((com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var41 + 1).l6())) {
                     var28 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var41 + 1).l6();
                     var35 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var41).l6();
                     break;
                  }

                  var35 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var41).l6();
                  break;
               }
            }
         }

         if (n5(var1)) {
            com.aspose.slides.internal.k4y.k7 var43 = (com.aspose.slides.internal.k4y.k7)var1.a6().get_Item(0).k5();
            com.aspose.slides.internal.k4y.k7 var10 = (com.aspose.slides.internal.k4y.k7)var1.a6().get_Item(1).k5();
            f4$1 var11 = new f4$1();
            List$Enumerator var12 = var1.u9().iterator();

            try {
               while (var12.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var13 = (com.aspose.slides.internal.k4y.g7)var12.next();
                  var11.addItem(((com.aspose.slides.internal.k4y.c8)var13.l6()).n5().n5(), (com.aspose.slides.internal.k4y.c8)var13.l6());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }

            var24 = (com.aspose.slides.internal.k4y.c8)var11.get_Item(var43.aw_().n5());
            var28 = (com.aspose.slides.internal.k4y.c8)var11.get_Item(var43.u9().n5());
            var31 = (com.aspose.slides.internal.k4y.c8)var11.get_Item(var10.aw_().n5());
            var35 = (com.aspose.slides.internal.k4y.c8)var11.get_Item(var10.u9().n5());
            if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.k4y.c9v.class)
               && 1 == ((com.aspose.slides.internal.k4y.c9v)var10).av_().n5()) {
               com.aspose.slides.internal.k4y.c8 var44 = var31;
               var31 = var35;
               var35 = var44;
            }

            y6.n5(var0.getHorizontalAxis(), var24, var2);
            y6.n5(var0.getVerticalAxis(), var28, var2);
            y6.n5(var0.getSecondaryHorizontalAxis(), var31, var2);
            y6.n5(var0.getSecondaryVerticalAxis(), var35, var2);
            if (com.aspose.slides.internal.v6g.k5.l6(var43, com.aspose.slides.internal.k4y.c9v.class)) {
               if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.k4y.c9v.class)) {
                  var0.getSecondaryHorizontalAxis().setPosition(3);
                  var0.getSecondaryHorizontalAxis().setCrossType(0);
                  var0.getSecondaryVerticalAxis().setPosition(2);
                  var0.getSecondaryVerticalAxis().setCrossType(1);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var10, com.aspose.slides.internal.k4y.x1j.class)) {
                  var0.getSecondaryHorizontalAxis().setPosition(0);
                  var0.getSecondaryHorizontalAxis().setCrossType(1);
                  var0.getSecondaryVerticalAxis().setPosition(2);
                  var0.getSecondaryVerticalAxis().setCrossType(0);
               }
            }
         } else if (var24 != null && var28 != null && var31 != null && var35 != null) {
            y6.n5(var0.getHorizontalAxis(), var24, var2);
            y6.n5(var0.getVerticalAxis(), var28, var2);
            y6.n5(var0.getSecondaryHorizontalAxis(), var31, var2);
            y6.n5(var0.getSecondaryVerticalAxis(), var35, var2);
            if (var1.u9().size() == 3) {
               if (((Axis)var0.getHorizontalAxis()).n5().c8() == ((Axis)var0.getSecondaryHorizontalAxis()).n5().c8()) {
                  var0.getSecondaryHorizontalAxis().setVisible(false);
               } else {
                  var0.getSecondaryVerticalAxis().setVisible(false);
               }

               n5((Axis)var0.getSecondaryHorizontalAxis(), (Axis)var0.getSecondaryVerticalAxis(), var1, ++var38);
               n5((Axis)var0.getHorizontalAxis(), (Axis)var0.getVerticalAxis(), var1, ++var38);
            }
         }
      } else if (var3 > 4) {
      }
   }

   private static void n5(AxesManager var0, List<com.aspose.slides.internal.k4y.g7> var1) {
      if (var0.n5().getType() == 34
         && ((com.aspose.slides.internal.k4y.c8)((com.aspose.slides.internal.k4y.g7)var1.get_Item(0)).l6()).a6().n5()
            == ((com.aspose.slides.internal.k4y.c8)((com.aspose.slides.internal.k4y.g7)var1.get_Item(1)).l6()).a6().n5()) {
         List$Enumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
               if (com.aspose.slides.ms.System.d1.a6("catAx", var3.n5()) && 0 == ((com.aspose.slides.internal.k4y.c8)var3.l6()).a6().n5()) {
                  ((com.aspose.slides.internal.k4y.c8)var3.l6()).a6().n5(1);
                  break;
               }

               if (com.aspose.slides.ms.System.d1.a6("valAx", var3.n5()) && 1 == ((com.aspose.slides.internal.k4y.c8)var3.l6()).a6().n5()) {
                  ((com.aspose.slides.internal.k4y.c8)var3.l6()).a6().n5(0);
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.w4c var0) {
      if (var0.u9().size() < 4) {
         return false;
      }

      com.aspose.slides.internal.k4y.c8 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.u9().get_Item(0).l6(), com.aspose.slides.internal.k4y.c8.class);
      com.aspose.slides.internal.k4y.c8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0.u9().get_Item(1).l6(), com.aspose.slides.internal.k4y.c8.class);
      com.aspose.slides.internal.k4y.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(var0.u9().get_Item(2).l6(), com.aspose.slides.internal.k4y.c8.class);
      com.aspose.slides.internal.k4y.c8 var4 = com.aspose.slides.internal.v6g.k5.n5(var0.u9().get_Item(3).l6(), com.aspose.slides.internal.k4y.c8.class);
      if (var1 != null && var2 != null && var3 != null && var4 != null) {
         boolean var5 = var1.a6().n5() == 0 && var2.a6().n5() == 0 && var3.a6().n5() == 1 && var4.a6().n5() == 2;
         if (var5) {
            return true;
         } else {
            var5 = var1.a6().n5() == 0 && var2.a6().n5() == 1 && var3.a6().n5() == 1 && var4.a6().n5() == 3;
            if (var0.a6().size() < 2) {
               return false;
            } else {
               com.aspose.slides.internal.k4y.c9v var6 = com.aspose.slides.internal.v6g.k5.n5(
                  var0.a6().get_Item(0).l6(), com.aspose.slides.internal.k4y.c9v.class
               );
               com.aspose.slides.internal.k4y.c9v var7 = com.aspose.slides.internal.v6g.k5.n5(
                  var0.a6().get_Item(1).l6(), com.aspose.slides.internal.k4y.c9v.class
               );
               if (var6 != null && var7 != null) {
                  boolean var8 = var6.av_().n5() != var7.av_().n5();
                  return var5 && var8;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   private static void n5(Axis var0, Axis var1, com.aspose.slides.internal.k4y.w4c var2, int var3) {
      y6.n5(var0, var1.n5().c8(), var2);
      var0.n5().k5(var3);
      var0.n5().u3(var1.n5().c8());
      var1.n5().u3(var0.n5().c8());
   }

   private static boolean n5(com.aspose.slides.internal.k4y.c8 var0) {
      return var0.a6().n5() == 0 || var0.a6().n5() == 3;
   }

   private static boolean l6(com.aspose.slides.internal.k4y.c8 var0) {
      return var0.a6().n5() == 1 || var0.a6().n5() == 2;
   }

   static List<Integer> n5(c1x var0) {
      List var1 = new List();
      com.aspose.slides.internal.k4y.w4c var2 = var0.k5();
      if (var2.u9().size() == 3) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.u9().get_Item(2).l6(), com.aspose.slides.internal.k4y.f5n.class)) {
            com.aspose.slides.internal.k4y.c8 var3 = (com.aspose.slides.internal.k4y.c8)var2.u9().get_Item(2).l6();
            var1.addItem(var3.n5().n5());
         } else if (!com.aspose.slides.internal.v6g.k5.l6(var2.u9().get_Item(2).l6(), com.aspose.slides.internal.k4y.q2c.class)) {
         }
      } else if (var2.u9().size() == 4) {
         int var12 = 0;
         int var4 = 0;
         com.aspose.slides.internal.k4y.c8 var5 = null;
         com.aspose.slides.internal.k4y.c8 var6 = null;
         List$Enumerator var7 = var2.u9().iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
               if ("catAx".equals(var8.n5())) {
                  if (var12 == 0) {
                     var12++;
                  } else {
                     var5 = (com.aspose.slides.internal.k4y.c8)var8.l6();
                  }
               } else if ("valAx".equals(var8.n5())) {
                  if (var4 == 0) {
                     var4++;
                  } else {
                     var6 = (com.aspose.slides.internal.k4y.c8)var8.l6();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         if (var5 != null && var6 != null) {
            var1.addItem(var6.n5().n5());
            var1.addItem(var5.n5().n5());
         } else {
            com.aspose.slides.internal.k4y.c8 var13 = (com.aspose.slides.internal.k4y.c8)var2.u9().get_Item(2).l6();
            var1.addItem(var13.n5().n5());
            var13 = (com.aspose.slides.internal.k4y.c8)var2.u9().get_Item(3).l6();
            var1.addItem(var13.n5().n5());
         }
      } else if (var2.u9().size() > 4) {
      }

      return var1;
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.w4c var1, g6c var2) {
      IChartData var3 = var0.getChartData();
      IAxesManager var4 = var0.getAxes();
      String var5 = null;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      IChartSeries var10 = null;
      IChartSeries var11 = null;
      if (var3.getSeries().size() > 0) {
         IGenericEnumerator var12 = var3.getSeries().iterator();

         try {
            while (var12.hasNext()) {
               IChartSeries var13 = (IChartSeries)var12.next();
               String[] var14 = n5(var13.getType());
               if (!var13.getPlotOnSecondAxis()) {
                  if (var5 == null) {
                     var5 = var14[0];
                  } else if ("xVal".equals(var5) && "cat".equals(var14[0])) {
                     var5 = var14[0];
                  } else if (!n5(var5, var14[0])) {
                     throw new Exception();
                  }

                  if (var6 == null) {
                     var6 = var14[1];
                  } else if (!n5(var6, var14[1])) {
                     throw new Exception();
                  }

                  if (var10 == null) {
                     var10 = var13;
                  }
               } else {
                  if (var7 == null) {
                     var7 = var14[0];
                  } else if ("xVal".equals(var7) && "cat".equals(var14[0])) {
                     var7 = var14[0];
                  } else if (!n5(var7, var14[0])) {
                     throw new Exception();
                  }

                  if (var8 == null) {
                     var8 = var14[1];
                  } else if (!n5(var8, var14[1])) {
                     throw new Exception();
                  }

                  if (var11 == null) {
                     var11 = var13;
                  }
               }

               if (var9 == null) {
                  var9 = var14[2];
               } else if (!n5(var9, var14[2])) {
                  throw new Exception();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }
      } else {
         String[] var26 = n5(var0.getType());
         var5 = var26[0];
         var6 = var26[1];
         var9 = var26[2];
      }

      Dictionary var27 = new Dictionary();
      if (var4.getHorizontalAxis() != null) {
         var27.addItem(var4.getHorizontalAxis(), var5);
      }

      if (var4.getVerticalAxis() != null) {
         var27.addItem(var4.getVerticalAxis(), var6);
      }

      if (var4.getSecondaryHorizontalAxis() != null) {
         var27.addItem(var4.getSecondaryHorizontalAxis(), var7);
      }

      if (var4.getSecondaryVerticalAxis() != null) {
         var27.addItem(var4.getSecondaryVerticalAxis(), var8);
      }

      if (var4.getSeriesAxis() != null) {
         var27.addItem(var4.getSeriesAxis(), var9);
      }

      Dictionary var28 = new Dictionary();
      if (var4.getHorizontalAxis() != null) {
         var28.addItem(var4.getHorizontalAxis(), var10);
      }

      if (var4.getVerticalAxis() != null) {
         var28.addItem(var4.getVerticalAxis(), var10);
      }

      if (var4.getSecondaryHorizontalAxis() != null) {
         var28.addItem(var4.getSecondaryHorizontalAxis(), var11);
      }

      if (var4.getSecondaryVerticalAxis() != null) {
         var28.addItem(var4.getSecondaryVerticalAxis(), var11);
      }

      IAxis[] var29 = n5(var3.getSeriesGroups(), var4);

      for (IAxis var18 : var29) {
         if (var18 != null) {
            n5((Axis)var18, var27, var28, var0, var1, var2);
         }
      }

      int var30 = 0;

      for (IAxis var19 : var29) {
         if (var19 != null) {
            if (var1.u9().size() == var30) {
               break;
            }

            com.aspose.slides.internal.k4y.c8 var20 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var30).l6();
            var30++;

            for (int var21 = 0; var21 < var1.u9().size(); var21++) {
               com.aspose.slides.internal.k4y.c8 var22 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var21).l6();
               if (var22.n5().n5() == var20.j5().n5()) {
                  if (var19.getCrossType() == 2) {
                     com.aspose.slides.internal.k4y.x8w var23 = var22.w1() == null
                        ? (com.aspose.slides.internal.k4y.x8w)var22.n5("crossesAt").l6()
                        : (com.aspose.slides.internal.k4y.x8w)var22.w1().l6();
                     var23.n5(var19.getCrossAt());
                  } else if (!var22.k5().n5()) {
                     com.aspose.slides.internal.k4y.n6h var34 = var22.w1() == null
                        ? (com.aspose.slides.internal.k4y.n6h)var22.n5("crosses").l6()
                        : (com.aspose.slides.internal.k4y.n6h)var22.w1().l6();
                     var34.n5(var19.getCrossType());
                  }
               }
            }
         }
      }
   }

   private static boolean n5(String var0, String var1) {
      if (var1 != null && !com.aspose.slides.ms.System.d1.a6(var0, var1)) {
         return !"xVal".equals(var0) && !"yVal".equals(var0) && !"val".equals(var0) || !"xVal".equals(var1) && !"yVal".equals(var1) && !"val".equals(var1)
            ? "cat".equals(var0) && "xVal".equals(var1)
            : true;
      } else {
         return true;
      }
   }

   private static void n5(
      Axis var0, Dictionary<IAxis, String> var1, Dictionary<IAxis, IChartSeries> var2, IChart var3, com.aspose.slides.internal.k4y.w4c var4, g6c var5
   ) {
      Object var6 = null;
      String[] var7 = new String[]{(String)var6};
      var1.tryGetValue(var0, var7);
      String var15 = var7[0];
      IChartSeries var8 = null;
      IChartSeries[] var9 = new IChartSeries[]{var8};
      var2.tryGetValue(var0, var9);
      var8 = var9[0];
      ChartData var10 = (ChartData)var3.getChartData();
      boolean var11 = var10.l6().k5() == 2;
      if (var15 != null) {
         com.aspose.slides.internal.k4y.c8 var12;
         if ("cat".equals(var15)) {
            if (var0.getCategoryAxisType() == 1) {
               var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("dateAx").l6();
            } else {
               var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("catAx").l6();
            }

            if (var0.isNumberFormatLinkedToSource()) {
               IChartCategoryCollection var19 = var8 != null && var8.getPlotOnSecondAxis() && var3.getChartData().getUseSecondaryCategories()
                  ? var3.getChartData().getSecondaryCategories()
                  : var3.getChartData().getCategories();
               IChartDataCell var14 = null;
               if (var19.size() > 0 && var19.getUseCells() && var11) {
                  var14 = var19.get_Item(0).getAsCell();
               }

               if (var14 != null) {
                  var0.setNumberFormat(((ChartDataCell)var14).n5(false));
               }
            }
         } else if ("val".equals(var15)) {
            var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("valAx").l6();
            if (var11
               && var0.isNumberFormatLinkedToSource()
               && var8 != null
               && var8.getDataPoints().getDataSourceTypeForValues() == 0
               && var8.getDataPoints().size() > 0) {
               ChartDataCell var18 = com.aspose.slides.internal.v6g.k5.n5(var8.getDataPoints().get_Item(0).getValue().getAsCell(), ChartDataCell.class);
               var0.setNumberFormat(var18 != null && !com.aspose.slides.internal.v6g.k5.l6(var18.getValue(), String.class) ? var18.n5(false) : "General");
            }
         } else if ("xVal".equals(var15)) {
            var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("valAx").l6();
            if (var11
               && var0.isNumberFormatLinkedToSource()
               && var8 != null
               && var8.getDataPoints().getDataSourceTypeForXValues() == 0
               && var8.getDataPoints().size() > 0) {
               ChartDataCell var17 = com.aspose.slides.internal.v6g.k5.n5(var8.getDataPoints().get_Item(0).getXValue().getAsCell(), ChartDataCell.class);
               var0.setNumberFormat(var17 != null && !com.aspose.slides.internal.v6g.k5.l6(var17.getValue(), String.class) ? var17.n5(false) : "General");
            }
         } else if ("yVal".equals(var15)) {
            var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("valAx").l6();
            if (var11
               && var0.isNumberFormatLinkedToSource()
               && var8 != null
               && var8.getDataPoints().getDataSourceTypeForYValues() == 0
               && var8.getDataPoints().size() > 0) {
               ChartDataCell var13 = com.aspose.slides.internal.v6g.k5.n5(var8.getDataPoints().get_Item(0).getYValue().getAsCell(), ChartDataCell.class);
               var0.setNumberFormat(var13 != null && !com.aspose.slides.internal.v6g.k5.l6(var13.getValue(), String.class) ? var13.n5(false) : "General");
            }
         } else {
            if (!"ser".equals(var15)) {
               throw new Exception();
            }

            var12 = (com.aspose.slides.internal.k4y.c8)var4.n5("serAx").l6();
         }

         y6.n5(var0, var12, var5);
      }
   }

   private static String[] n5(int var0) {
      switch (var0) {
         case 0:
         case 1:
         case 2:
            return new String[]{"cat", "val", null};
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
            return new String[]{"cat", "val", "ser"};
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            return new String[]{"cat", "val", null};
         case 25:
            return new String[]{"cat", "val", "ser"};
         case 26:
         case 29:
            return new String[]{null, null, null};
         case 27:
         case 30:
            return new String[]{null, null, null};
         case 28:
         case 31:
            return new String[]{null, null, null};
         case 32:
         case 34:
         case 35:
            return new String[]{"val", "cat", null};
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
            return new String[]{"val", "cat", "ser"};
         case 47:
         case 48:
         case 49:
            return new String[]{"cat", "val", null};
         case 50:
         case 51:
         case 52:
            return new String[]{"cat", "val", "ser"};
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return new String[]{"xVal", "yVal", null};
         case 58:
         case 59:
         case 60:
         case 61:
            return new String[]{"cat", "val", null};
         case 62:
         case 63:
            return new String[]{"cat", "val", "ser"};
         case 64:
         case 65:
            return new String[]{"cat", "val", "ser"};
         case 66:
         case 67:
            return new String[]{null, null, null};
         case 68:
         case 69:
            return new String[]{"xVal", "yVal", null};
         case 70:
         case 71:
         case 72:
            return new String[]{"cat", "val", null};
         default:
            throw new Exception();
      }
   }

   private static IAxis[] n5(IChartSeriesGroupCollection var0, IAxesManager var1) {
      boolean var2 = false;
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            IChartSeriesGroup var4 = (IChartSeriesGroup)var3.next();
            switch (var4.getType()) {
               case 7:
               case 8:
               case 9:
                  var2 = true;
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               default:
                  break;
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
                  var2 = true;
            }

            if (var2) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return !var2
         ? new IAxis[]{
            var1.getHorizontalAxis(), var1.getVerticalAxis(), var1.getSecondaryVerticalAxis(), var1.getSecondaryHorizontalAxis(), var1.getSeriesAxis()
         }
         : new IAxis[]{
            var1.getVerticalAxis(), var1.getHorizontalAxis(), var1.getSecondaryHorizontalAxis(), var1.getSecondaryVerticalAxis(), var1.getSeriesAxis()
         };
   }

   public static void n5(IAxesManager var0, com.aspose.slides.internal.k4y.a1v var1, c1x var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.n5(var0, AxesManager.class).n5().getType();
      if (var3 != 73 && ChartTypeCharacterizer.n5(var3) == 1) {
         for (int var7 = 0; var7 < var1.k5().length; var7++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.k5()[var7].s7().l6(), com.aspose.slides.internal.k4y.b1k.class)) {
               i4.n5(var0.getVerticalAxis(), var1.k5()[var7], var2);
               return;
            }
         }
      } else if (var1.k5().length == 2) {
         for (int var4 = 0; var4 < var1.k5().length; var4++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.k5()[var4].s7().l6(), com.aspose.slides.internal.k4y.t2a.class)) {
               i4.n5(var0.getVerticalAxis(), var1.k5()[var4], var2);
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var1.k5()[var4].s7().l6(), com.aspose.slides.internal.k4y.b1k.class)) {
                  throw new SerializationException("Invalid element type");
               }

               i4.n5(var0.getHorizontalAxis(), var1.k5()[var4], var2);
            }
         }
      } else if (var1.k5().length == 3) {
         boolean var6 = false;

         for (int var5 = 0; var5 < var1.k5().length; var5++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.k5()[var5].s7().l6(), com.aspose.slides.internal.k4y.t2a.class)) {
               if (var6) {
                  i4.n5(var0.getSecondaryVerticalAxis(), var1.k5()[var5], var2);
               } else {
                  i4.n5(var0.getVerticalAxis(), var1.k5()[var5], var2);
                  var6 = true;
               }
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var1.k5()[var5].s7().l6(), com.aspose.slides.internal.k4y.b1k.class)) {
                  throw new SerializationException("Invalid element type");
               }

               i4.n5(var0.getHorizontalAxis(), var1.k5()[var5], var2);
            }
         }
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.a1v var1, g6c var2) {
      long var3 = 0L;
      int var5 = var0.getChartData().getSeries().get_Item(0).getType();
      switch (var5) {
         case 76:
         case 77:
            com.aspose.slides.internal.k4y.n3p var16 = var1.n5();
            var16.n5("catScaling");
            i4.n5(var0.getAxes().getHorizontalAxis(), var16, var2, var3++);
            com.aspose.slides.internal.k4y.n3p var14 = var1.n5();
            var14.n5("valScaling");
            i4.n5(var0.getAxes().getVerticalAxis(), var14, var2, var3++);
            if (var0.getAxes().getSecondaryVerticalAxis() != null) {
               var14 = var1.n5();
               var14.n5("valScaling");
               i4.n5(var0.getAxes().getSecondaryVerticalAxis(), var14, var2, var3++);
            }
            break;
         case 78:
         case 79:
            com.aspose.slides.internal.k4y.n3p var6 = var1.n5();
            var6.n5("valScaling");
            i4.n5(var0.getAxes().getVerticalAxis(), var6, var2, var3++);
            com.aspose.slides.internal.k4y.n3p var7 = var1.n5();
            var7.n5("catScaling");
            i4.n5(var0.getAxes().getHorizontalAxis(), var7, var2, var3++);
            break;
         case 80:
            com.aspose.slides.internal.k4y.n3p var8 = var1.n5();
            var8.n5("catScaling");
            i4.n5(var0.getAxes().getVerticalAxis(), var8, var2, 1L);
      }
   }

   private static void l6(com.aspose.slides.internal.k4y.w4c var0) {
      if (var0 == null) {
         throw new ArgumentNullException("plotAreaData");
      }

      if (var0.u9().size() == 4) {
         List$Enumerator var1 = var0.u9().iterator();

         try {
            while (var1.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var2 = (com.aspose.slides.internal.k4y.g7)var1.next();
               if (!com.aspose.slides.internal.v6g.k5.l6(var2.l6(), com.aspose.slides.internal.k4y.a0q.class)
                  && !com.aspose.slides.internal.v6g.k5.l6(var2.l6(), com.aspose.slides.internal.k4y.f5n.class)) {
                  return;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         for (int var7 = 0; var7 < var0.u9().size(); var7++) {
            com.aspose.slides.internal.k4y.c8 var3 = (com.aspose.slides.internal.k4y.c8)var0.u9().get_Item(var7).l6();
            com.aspose.slides.internal.k4y.c8 var4 = n5(var3, var0);
            if (var4 != null && (!n5(var3) || !n5(var4)) && (!l6(var3) || !l6(var4)) && n5(l6(var3), var0) == 3) {
               var3.a6().n5(k5(var4));
            }
         }
      }
   }

   private static int n5(boolean var0, com.aspose.slides.internal.k4y.w4c var1) {
      if (var1 == null) {
         throw new ArgumentNullException("plotAreaData");
      }

      int var2 = 0;
      List$Enumerator var3 = var1.u9().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            com.aspose.slides.internal.k4y.c8 var5 = (com.aspose.slides.internal.k4y.c8)var4.l6();
            if (!var0 && n5(var5)) {
               var2++;
            }

            if (var0 && l6(var5)) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static com.aspose.slides.internal.k4y.c8 n5(com.aspose.slides.internal.k4y.c8 var0, com.aspose.slides.internal.k4y.w4c var1) {
      if (var0 == null) {
         throw new ArgumentNullException("axis");
      }

      if (var1 == null) {
         throw new ArgumentNullException("plotAreaData");
      }

      for (int var2 = 0; var2 < var1.u9().size(); var2++) {
         com.aspose.slides.internal.k4y.c8 var3 = (com.aspose.slides.internal.k4y.c8)var1.u9().get_Item(var2).l6();
         if (var3 != var0 && com.aspose.slides.ms.System.j8.n5(var3) == com.aspose.slides.ms.System.j8.n5(var0)) {
            return var3;
         }
      }

      return null;
   }

   private static int k5(com.aspose.slides.internal.k4y.c8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("axis");
      }

      switch (var0.a6().n5()) {
         case 0:
            return 3;
         case 1:
            return 2;
         case 2:
            return 1;
         case 3:
            return 0;
         default:
            throw new NotSupportedException(
               com.aspose.slides.ms.System.d1.n5(
                  "Can't find opposite position for axis with position '{0}'",
                  new Object[]{com.aspose.slides.ms.System.s3.n5(AxisPositionType.class, var0.a6().n5())}
               )
            );
      }
   }
}
