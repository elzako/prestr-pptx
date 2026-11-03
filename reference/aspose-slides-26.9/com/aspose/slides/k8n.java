package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class k8n {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("tile", "stretch");

   public static void n5(PictureFillFormat var0, com.aspose.slides.internal.k4y.e3 var1, t5w var2) {
      if (var1 != null) {
         l6g var3 = var0.h0();
         y2w.n5(var0.getPicture(), var1.a6(), var2);
         com.aspose.slides.internal.k4y.p6r var4 = var1.u9();
         if (var4 != null) {
            var0.n5(new i2h(var4.n5(), var4.l6(), var4.k5(), var4.u3()));
         }

         var0.setDpi(var1.k5() == 4294967295L ? -1 : (int)var1.k5());
         var0.n5(var1.u3() != 0);
         if (com.aspose.slides.internal.v6g.k5.l6(var0.getParent_IPresentationComponent(), Background.class)) {
            var0.setPictureFillMode(0);
            var3.n5(e4c.k5.u9());
         } else {
            var0.setPictureFillMode(1);
            var3.n5(new s4s(d2k.k5.u3(), d2k.u3.u3()));
         }

         if (var1.h0() != null) {
            switch (n5.n5(var1.h0().n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.l3e var5 = (com.aspose.slides.internal.k4y.l3e)var1.h0().l6();
                  var0.setPictureFillMode(0);
                  var3.n5(
                     new e4c(com.aspose.slides.ms.System.d2.k5(var5.n5()) ? 0.0 : var5.n5(), com.aspose.slides.ms.System.d2.k5(var5.l6()) ? 0.0 : var5.l6())
                  );
                  var3.n5(
                     new d2k(
                        com.aspose.slides.ms.System.n1.k5(var5.k5()) ? 1.0F : var5.k5() / 100.0F,
                        com.aspose.slides.ms.System.n1.k5(var5.u3()) ? 1.0F : var5.u3() / 100.0F
                     )
                  );
                  var3.n5(var5.a6() == -1 ? 0 : var5.a6());
                  var3.n5(var5.u9() == -1 ? 0 : var5.u9());
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.y9r var6 = (com.aspose.slides.internal.k4y.y9r)var1.h0().l6();
                  var0.setPictureFillMode(1);
                  var3.n5(c8a.n5(var6.l6()).l6());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.h0().n5(), "\""}));
            }
         } else if (var2.q0()) {
            Cell var20 = com.aspose.slides.internal.v6g.k5.n5(var0.getParent_IPresentationComponent(), Cell.class);
            if (var20 != null && var20.getWidth() > 0.0 && var20.getHeight() > 0.0) {
               double var7 = var20.getWidth();
               double var9 = var20.getHeight();
               double var11 = com.aspose.slides.ms.System.d2.k5(var20.x8().getBorderLeft().getWidth()) ? 0.0 : var20.x8().getBorderLeft().getWidth() / 2.0;
               double var13 = com.aspose.slides.ms.System.d2.k5(var20.x8().getBorderRight().getWidth()) ? 0.0 : var20.x8().getBorderRight().getWidth() / 2.0;
               double var15 = com.aspose.slides.ms.System.d2.k5(var20.x8().getBorderTop().getWidth()) ? 0.0 : var20.x8().getBorderTop().getWidth() / 2.0;
               double var17 = com.aspose.slides.ms.System.d2.k5(var20.x8().getBorderBottom().getWidth()) ? 0.0 : var20.x8().getBorderBottom().getWidth() / 2.0;
               com.aspose.slides.internal.k4y.p6r var19 = new com.aspose.slides.internal.k4y.p6r();
               var19.n5(-((float)((var20.getOffsetX() + var11) / var7)) * 100.0F);
               var19.l6(-((float)((var20.getOffsetY() + var15) / var9)) * 100.0F);
               var19.k5(-((float)((var20.getTable().getWidth() - (var20.getOffsetX() + var7) + var13) / var7)) * 100.0F);
               var19.u3(-((float)((var20.getTable().getHeight() - (var20.getOffsetY() + var9) + var17) / var9)) * 100.0F);
               var3.n5(c8a.n5(var19).l6());
               var0.setPictureFillMode(1);
            }
         }
      }
   }

   public static void n5(PictureFillFormat var0, com.aspose.slides.internal.k4y.e3 var1, g6c var2) {
      l6g var3 = var0.h0();
      var1.n5(var0.getDpi() == 96 ? 4294967295L : var0.getDpi() & 4294967295L);
      if (!var0.a6()) {
         var1.n5((byte)0);
      }

      y2w.n5(var0.getPicture(), new k8n$1(var1), var2);
      if (c1t.l6(var3.l6().u3().l6())) {
         var1.l6();
         i2h var4 = var0.u3().k5();
         var1.u9().n5(var4.l6);
         var1.u9().l6(var4.k5);
         var1.u9().k5(var4.u3);
         var1.u9().u3(var4.a6);
      }

      if (var0.getPictureFillMode() == 0) {
         com.aspose.slides.internal.k4y.l3e var5 = (com.aspose.slides.internal.k4y.l3e)var1.n5("tile").l6();
         var5.n5(var3.k5().n5);
         var5.l6(var3.k5().l6);
         var5.n5(var3.u3().n5 * 100.0F);
         var5.l6(var3.u3().l6 * 100.0F);
         var5.n5(var3.a6());
         var5.n5(var3.u9());
      } else if (var0.getPictureFillMode() == 1) {
         com.aspose.slides.internal.k4y.y9r var6 = (com.aspose.slides.internal.k4y.y9r)var1.n5("stretch").l6();
         c8a.n5(var3.n5().l6(), new k8n$2(var6));
      }
   }
}
