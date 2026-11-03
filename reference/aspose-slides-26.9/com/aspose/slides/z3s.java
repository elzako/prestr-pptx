package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class z3s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("lin", "path");

   public static void n5(IGradientFormat var0, com.aspose.slides.internal.k4y.j2p var1) {
      if (var1 != null) {
         GradientFormat var2 = (GradientFormat)var0;
         var2.setTileFlip(var1.k5());
         var2.u3().n5(c8a.n5(var1.h0()).l6());
         var2.setGradientDirection(-1);
         if (var1.u9() != null) {
            switch (n5.n5(var1.u9().n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.m5l var3 = (com.aspose.slides.internal.k4y.m5l)var1.u9().l6();
                  var2.setGradientShape((byte)0);
                  var2.setLinearGradientAngle(var3.n5());
                  var2.setLinearGradientScaled(var3.l6());
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.l1b var4 = (com.aspose.slides.internal.k4y.l1b)var1.u9().l6();
                  switch (var4.l6()) {
                     case 1:
                        var2.setGradientShape((byte)3);
                        break;
                     case 2:
                        var2.setGradientShape((byte)2);
                        break;
                     case 3:
                        var2.setGradientShape((byte)1);
                        break;
                     default:
                        var2.setGradientShape((byte)-1);
                  }

                  if (var4.k5() != null) {
                     var2.n5(
                        var4.k5().n5() / 100.0F,
                        var4.k5().l6() / 100.0F,
                        1.0F - var4.k5().k5() / 100.0F - var4.k5().n5() / 100.0F,
                        1.0F - var4.k5().u3() / 100.0F - var4.k5().l6() / 100.0F
                     );
                  } else {
                     var2.n5(0.0F, 0.0F, 1.0F, 1.0F);
                  }
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.u9().n5(), "\""}));
            }
         }

         var2.getGradientStops().clear();
         if (var1.a6() != null) {
            com.aspose.slides.internal.k4y.u0a[] var9 = var1.a6().l6();

            for (com.aspose.slides.internal.k4y.u0a var7 : var9) {
               IGradientStop var8 = ((GradientStopCollection)var2.getGradientStops()).u3();
               var8.setPosition(var7.n5() / 100.0F);
               c4i.n5(var8.getColor(), var7.l6());
            }
         }
      }
   }

   public static void l6(IGradientFormat var0, com.aspose.slides.internal.k4y.j2p var1) {
      if (var0.getGradientStops().size() >= 2) {
         com.aspose.slides.internal.k4y.w1n var2 = var1.n5();
         IGenericEnumerator var3 = var0.getGradientStops().iterator();

         try {
            while (var3.hasNext()) {
               IGradientStop var4 = (IGradientStop)var3.next();
               com.aspose.slides.internal.k4y.u0a var5 = var2.n5();
               var5.n5(var4.getPosition() * 100.0F);
               c4i.n5(var4.getColor(), new z3s$1(var5));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      var1.n5(var0.getTileFlip());
      if (var0.getGradientShape() == 0) {
         com.aspose.slides.internal.k4y.m5l var9 = (com.aspose.slides.internal.k4y.m5l)var1.n5("lin").l6();
         var9.n5(var0.getLinearGradientAngle());
         var9.n5(var0.getLinearGradientScaled());
      } else if (var0.getGradientShape() != -1) {
         com.aspose.slides.internal.k4y.l1b var10 = (com.aspose.slides.internal.k4y.l1b)var1.n5("path").l6();
         switch (var0.getGradientShape()) {
            case -1:
               var10.n5(0);
               break;
            case 0:
            default:
               throw new Exception();
            case 1:
               var10.n5(3);
               break;
            case 2:
               var10.n5(2);
               break;
            case 3:
               var10.n5(1);
         }

         c8a.n5(((GradientFormat)var0).u9().l6(), new z3s$2(var10));
      }

      s4s var11 = ((GradientFormat)var0).u3().u3().l6();
      if (c1t.l6(var11.l6())) {
         c8a.n5(var11.l6(), var1.l6());
      }
   }
}
