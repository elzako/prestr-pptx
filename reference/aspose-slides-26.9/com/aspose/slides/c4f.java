package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class c4f {
   public static void n5(l4y var0, com.aspose.slides.internal.k4y.v2o var1) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.v1y var2 = var1.l6();
         if (var2 != null && n5(var2)) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0, l1b.class) && var2.h0() == null) {
               var0.setX(Float.NaN);
            } else if (var2.x8() != null) {
               var0.setX((float)var2.x8().n5());
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var0, l1b.class) && var2.c8() == null) {
               var0.setY(Float.NaN);
            } else if (var2.n3() != null) {
               var0.setY((float)var2.n3().n5());
            }

            if (var2.y4() != null) {
               if (var2.t2() != null && var2.t2().n5() == 1) {
                  if (var2.x8() == null) {
                     throw new NotImplementedException();
                  }

                  var0.setWidth((float)(var2.x8().n5() + var2.y4().n5()));
               } else {
                  var0.setWidth((float)var2.y4().n5());
               }
            }

            if (var2.e2() != null) {
               if (var2.s7() != null && var2.s7().n5() == 1) {
                  if (var2.n3() == null) {
                     throw new NotImplementedException();
                  }

                  var0.setHeight((float)(var2.n3().n5() + var2.e2().n5()));
               } else {
                  var0.setHeight((float)var2.e2().n5());
               }
            }

            if (var2.h0() != null) {
               var0.n5(var2.h0());
            }

            if (var2.c8() != null) {
               var0.l6(var2.c8());
            }

            if (var2.s7() != null) {
               var0.u3(var2.s7());
            }

            if (var2.t2() != null) {
               var0.k5(var2.t2());
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var0, l1b.class) && var2.u9() != null) {
               var0.getChart().getPlotArea().setLayoutTargetType(var2.u9().n5() == 2 ? 1 : 0);
            }

            if (var1.k5() != null) {
               var0.l6(var1.k5());
            }

            if (var2.t9() != null) {
               var0.k5(var2.t9());
            }
         }
      }
   }

   public static void n5(l4y var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.v2o> var1) {
      if (n5(var0)) {
         com.aspose.slides.internal.k4y.v2o var2 = (com.aspose.slides.internal.k4y.v2o)var1.invoke();
         com.aspose.slides.internal.k4y.v1y var3 = var2.n5();
         if (!com.aspose.slides.ms.System.n1.k5(var0.getX())) {
            var3.l6().n5(var0.getX());
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getY())) {
            var3.k5().n5(var0.getY());
         }

         if (!com.aspose.slides.internal.v6g.k5.l6(var0, n6d.class)) {
            if (!com.aspose.slides.ms.System.n1.k5(var0.getWidth())) {
               var3.u3().n5(var0.getWidth());
            }

            if (!com.aspose.slides.ms.System.n1.k5(var0.getHeight())) {
               var3.a6().n5(var0.getHeight());
            }

            com.aspose.slides.internal.k4y.f3h var4 = var0.u9();
            if (var4 == null) {
               var4 = new com.aspose.slides.internal.k4y.f3h();
               var4.n5(1);
            }

            var3.n5(var4);
            com.aspose.slides.internal.k4y.f3h var5 = var0.h0();
            if (var5 == null) {
               var5 = new com.aspose.slides.internal.k4y.f3h();
               var5.n5(1);
            }

            var3.l6(var5);
         }

         var3.u3(var0.t2());
         var3.k5(var0.c8());
         if (com.aspose.slides.internal.v6g.k5.l6(var0, l1b.class)) {
            var3.n5().n5(var0.getChart().getPlotArea().getLayoutTargetType() == 0 ? 1 : 2);
         }

         var2.n5(var0.s7());
         var3.n5(var0.x8());
      }
   }

   static boolean n5(l4y var0) {
      return !com.aspose.slides.ms.System.n1.k5(var0.getX())
         || !com.aspose.slides.ms.System.n1.k5(var0.getY())
         || !com.aspose.slides.ms.System.n1.k5(var0.getWidth())
         || !com.aspose.slides.ms.System.n1.k5(var0.getHeight());
   }

   static boolean n5(com.aspose.slides.internal.k4y.v1y var0) {
      return (var0.x8() == null || !(var0.x8().n5() < 0.0) && !(var0.x8().n5() > 1.0) || var0.h0() == null || var0.h0().n5() != 1)
         && (var0.n3() == null || !(var0.n3().n5() < 0.0) && !(var0.n3().n5() > 1.0) || var0.c8() == null || var0.c8().n5() != 1)
         && (var0.e2() == null || !(var0.e2().n5() < 0.0) && !(var0.e2().n5() > 1.0))
         && (var0.y4() == null || !(var0.y4().n5() < 0.0) && !(var0.y4().n5() > 1.0));
   }
}
