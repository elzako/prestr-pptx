package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class x2 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("bldP", "bldDgm", "bldOleChart");

   public static void n5(com.aspose.slides.internal.k4y.g2 var0, t2s var1) {
      if (var1.q0() != null) {
         com.aspose.slides.internal.k0r.l7h var2 = (com.aspose.slides.internal.k0r.l7h)var1.q0();
         if (var2.u3() != null
            && var2.u3().x8() != null
            && var2.u3().x8().e2() != null
            && var2.u3().x8().e2().size() != 0
            && !com.aspose.slides.internal.v6g.k5.l6(var2.u3().x8().e2().get_Item(0), com.aspose.slides.internal.k0r.x8.class)) {
            com.aspose.slides.internal.k4y.h5h var3 = var0.s7().l6();

            for (com.aspose.slides.internal.k0r.y4 var7 : var2.u3().x8().l6()) {
               com.aspose.slides.internal.k0r.i5 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.k0r.i5.class);
               if (var8 != null && var1.m3().containsKey(var8.l6().k5())) {
                  com.aspose.slides.internal.k4y.m7f var9 = (com.aspose.slides.internal.k4y.m7f)var3.n5("bldP").l6();
                  var9.n5(n5(var8.u3().l6()));
                  var9.n5(com.aspose.slides.ms.System.Xml.f4.l6(var8.l6().k5()));
                  var9.l6((var8.u3().u3() & 255) == 1);
                  var9.l6(var8.u3().k5());
                  var9.k5((var8.u3().a6() & 255) == 1);
                  var9.n5(var8.l6().l6());
               }

               com.aspose.slides.internal.k0r.p8 var12 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.k0r.p8.class);
               if (var12 != null) {
                  com.aspose.slides.internal.k4y.k8b var10 = (com.aspose.slides.internal.k4y.k8b)var3.n5("bldDgm").l6();
                  var10.n5(com.aspose.slides.ms.System.Xml.f4.l6(var12.l6().k5()));
                  var10.n5(l6(var12.u3().l6()));
               }

               com.aspose.slides.internal.k0r.q0 var13 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.k0r.q0.class);
               if (var13 != null) {
                  com.aspose.slides.internal.k4y.m0m var11 = (com.aspose.slides.internal.k4y.m0m)var3.n5("bldOleChart").l6();
                  var11.n5(com.aspose.slides.ms.System.Xml.f4.l6(var13.l6().k5()));
                  var11.n5(k5(var13.u3().l6()));
               }
            }
         }
      }
   }

   private static int n5(long var0) {
      switch ((int)var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         default:
            return 0;
      }
   }

   private static int l6(long var0) {
      switch ((int)var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         case 6:
            return 7;
         case 7:
            return 8;
         case 8:
            return 9;
         case 9:
            return 10;
         case 10:
            return 11;
         case 11:
            return 12;
         case 12:
            return 13;
         case 13:
            return 14;
         case 14:
            return 15;
         case 15:
            return 16;
         case 16:
            return 17;
         default:
            return 0;
      }
   }

   private static int k5(long var0) {
      switch ((int)var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         default:
            return 0;
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.k8g var0, com.aspose.slides.internal.k0r.h0 var1, d5t var2) {
      if (var0 != null) {
         if (var0.u3() != null && var0.u3().n5().size() != 0) {
            com.aspose.slides.internal.k0r.n3 var3 = new com.aspose.slides.internal.k0r.n3();
            var1.e2().addItem(var3);
            long var4 = 0L;
            List$Enumerator var6 = var0.u3().n5().iterator();

            try {
               while (var6.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var7 = (com.aspose.slides.internal.k4y.g7)var6.next();
                  switch (n5.n5(var7.n5())) {
                     case 0:
                        com.aspose.slides.internal.k4y.m7f var13 = (com.aspose.slides.internal.k4y.m7f)var7.l6();
                        long[] var14 = new long[]{var4};
                        p0.n5(var13, var3, var14, var2);
                        var4 = var14[0];
                        break;
                     case 1:
                        com.aspose.slides.internal.k4y.k8b var8 = (com.aspose.slides.internal.k4y.k8b)var7.l6();
                        p0.n5(var8, var3, var2);
                        break;
                     case 2:
                        com.aspose.slides.internal.k4y.m0m var9 = (com.aspose.slides.internal.k4y.m0m)var7.l6();
                        p0.n5(var9, var3, var2);
                        break;
                     default:
                        var2.n5("Writing of the animation build list failed.", 1);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }
   }
}
