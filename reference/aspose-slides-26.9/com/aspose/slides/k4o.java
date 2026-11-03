package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.k4y.g7$n5;

class k4o {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("rgb", "hsl");

   public static void n5(IColorEffect var0, com.aspose.slides.internal.k4y.s5v var1) {
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      c4i.n5(var0.getFrom(), var1.c8());
      c4i.n5(var0.getTo(), var1.t2());
      var0.setDirection(var1.a6());
      var0.setColorSpace(var1.u3());
      if (var1.h0() != null) {
         switch (n5.n5(var1.h0().n5().n5())) {
            case 0:
               com.aspose.slides.internal.k4y.i5j var2 = (com.aspose.slides.internal.k4y.i5j)var1.h0().n5().l6();
               var0.getBy().setValue0(var2.n5() / 100.0F);
               var0.getBy().setValue1(var2.l6() / 100.0F);
               var0.getBy().setValue2(var2.k5() / 100.0F);
               break;
            case 1:
               com.aspose.slides.internal.k4y.c4p var3 = (com.aspose.slides.internal.k4y.c4p)var1.h0().n5().l6();
               var0.getBy().setValue0(var3.n5());
               var0.getBy().setValue0(var0.getBy().getValue0() % 360.0F);
               if (var0.getBy().getValue0() < 0.0F) {
                  var0.getBy().setValue0(var0.getBy().getValue0() + 360.0F);
               }

               var0.getBy().setValue1(var3.l6() / 100.0F);
               var0.getBy().setValue2(var3.k5() / 100.0F);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.h0().n5().n5(), "\""}));
         }
      }
   }

   public static void n5(IColorEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.s5v var3 = (com.aspose.slides.internal.k4y.s5v)var1.n5("animClr").l6();
      var2[0] = var3.u9();
      var3.n5((byte)var0.getColorSpace());
      if (var0.getFrom().getColorType() != -1) {
         com.aspose.slides.internal.k4y.z4 var4 = var3.l6();
         c4i.l6(var0.getFrom(), var4);
      }

      if (var0.getTo().getColorType() != -1) {
         com.aspose.slides.internal.k4y.z4 var6 = var3.k5();
         c4i.l6(var0.getTo(), var6);
      }

      var3.l6((byte)var0.getDirection());
      if (!com.aspose.slides.ms.System.n1.k5(var0.getBy().getValue0())
         && !com.aspose.slides.ms.System.n1.k5(var0.getBy().getValue1())
         && !com.aspose.slides.ms.System.n1.k5(var0.getBy().getValue2())
         && var3.u3() != -1) {
         com.aspose.slides.internal.k4y.b5b var7 = var3.n5();
         if (var3.u3() == 1) {
            com.aspose.slides.internal.k4y.c4p var5 = (com.aspose.slides.internal.k4y.c4p)var3.h0().n5("hsl").l6();
            var0.getBy().setValue0(var0.getBy().getValue0() % 360.0F);
            if (var0.getBy().getValue0() < 0.0F) {
               var0.getBy().setValue0(var0.getBy().getValue0() + 360.0F);
            }

            var5.n5(var0.getBy().getValue0());
            var5.l6(var0.getBy().getValue1() * 100.0F);
            var5.k5(var0.getBy().getValue2() * 100.0F);
         } else {
            com.aspose.slides.internal.k4y.i5j var8 = (com.aspose.slides.internal.k4y.i5j)var3.h0().n5("rgb").l6();
            var8.n5(var0.getBy().getValue0() * 100.0F);
            var8.l6(var0.getBy().getValue1() * 100.0F);
            var8.k5(var0.getBy().getValue2() * 100.0F);
         }
      }
   }
}
