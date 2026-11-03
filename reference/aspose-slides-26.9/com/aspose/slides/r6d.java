package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class r6d {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "width",
      "height",
      "color",
      "transparency",
      "tip",
      "rasterOp",
      "antiAliased",
      "fitToCurve",
      "ignorePressure",
      "ellipse",
      "rectangle",
      "drop",
      "noOperation",
      "copyPen",
      "maskPen"
   );

   public static void n5(Ink var0, InkBrush var1, com.aspose.slides.internal.k4y.n8o var2) {
      if (var2 != null) {
         var1.n5(var2.n5());
         var1.l6(var2.l6());
         if (var2.k5() != null) {
            for (com.aspose.slides.internal.k4y.z0x var6 : var2.k5()) {
               switch (n5.n5(var6.n5())) {
                  case 0:
                     var1.n5(new z1k());
                     var1.x8().n5(com.aspose.slides.ms.System.d2.n5(var6.l6(), com.aspose.slides.internal.x7n.l6.k5()));
                     var1.x8().n5(var6.k5());
                     break;
                  case 1:
                     var1.l6(new z1k());
                     var1.n3().n5(com.aspose.slides.ms.System.d2.n5(var6.l6(), com.aspose.slides.internal.x7n.l6.k5()));
                     var1.n3().n5(var6.k5());
                     break;
                  case 2:
                     int var7 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.k5(var6.l6(), 1), 512);
                     var1.n5(com.aspose.slides.internal.o9b.c8.n5(0, var7 >> 16 & 0xFF, var7 >> 8 & 0xFF, var7 & 0xFF).o8());
                     break;
                  case 3:
                     var1.k5(com.aspose.slides.ms.System.a3.n5(var6.l6(), com.aspose.slides.internal.x7n.l6.k5()));
                     break;
                  case 4:
                     switch (n5.n5(var6.l6())) {
                        case 9:
                           var1.n5(0);
                           continue;
                        case 10:
                           var1.n5(1);
                           continue;
                        case 11:
                           var1.n5(2);
                           continue;
                        default:
                           throw new NotImplementedException();
                     }
                  case 5:
                     switch (n5.n5(var6.l6())) {
                        case 12:
                           var1.l6(0);
                           continue;
                        case 13:
                           var1.l6(1);
                           continue;
                        case 14:
                           var1.l6(2);
                           continue;
                        default:
                           throw new NotImplementedException();
                     }
                  case 6:
                     var1.n5("1".equals(var6.l6()));
                     break;
                  case 7:
                     var1.l6("1".equals(var6.l6()));
                     break;
                  case 8:
                     var1.k5("1".equals(var6.l6()));
                     break;
                  default:
                     n0p var8 = new n0p();
                     var8.n5(var6.n5());
                     var8.l6(var6.l6());
                     var1.t4().addItem(var8);
               }
            }
         }

         if (var2.u3() != null && var2.u3().length > 0) {
            for (com.aspose.slides.internal.k4y.i3p var15 : var2.u3()) {
               t7j var17 = new t7j();
               g1h.n5(var0, var17, var15);
               var1.t2().addItem(var17);
            }
         }

         if (var2.a6() != null && var2.a6().length > 0) {
            for (com.aspose.slides.internal.k4y.s4z var16 : var2.a6()) {
               r3w var18 = new r3w();
               y2h.n5(var0, var18, var16);
               var1.s7().addItem(var18);
            }
         }
      }
   }

   public static void n5(InkBrush var0, com.aspose.slides.internal.k4y.n8o var1) {
      var1.n5(var0.h0());
      var1.l6(var0.c8());
      if (var0.x8() != null) {
         com.aspose.slides.internal.k4y.z0x var2 = new com.aspose.slides.internal.k4y.z0x();
         var2.n5("width");
         var2.k5(var0.x8().l6());
         var2.l6(com.aspose.slides.ms.System.d2.n5(var0.x8().n5(), com.aspose.slides.internal.x7n.l6.k5()));
         var1.n5(var2);
      }

      if (var0.n3() != null) {
         com.aspose.slides.internal.k4y.z0x var21 = new com.aspose.slides.internal.k4y.z0x();
         var21.n5("height");
         var21.k5(var0.n3().l6());
         var21.l6(com.aspose.slides.ms.System.d2.n5(var0.n3().n5(), com.aspose.slides.internal.x7n.l6.k5()));
         var1.n5(var21);
      }

      if (!var0.n5().t2()) {
         com.aspose.slides.internal.k4y.z0x var22 = new com.aspose.slides.internal.k4y.z0x();
         var22.n5("color");
         var22.l6(
            com.aspose.slides.ms.System.d1.n5(
               "#",
               com.aspose.slides.ms.System.e2.n5(var0.n5().x8(), "X2"),
               com.aspose.slides.ms.System.e2.n5(var0.n5().n3(), "X2"),
               com.aspose.slides.ms.System.e2.n5(var0.n5().y4(), "X2")
            )
         );
         var1.n5(var22);
      }

      if (var0.y4() != 255) {
         com.aspose.slides.internal.k4y.z0x var23 = new com.aspose.slides.internal.k4y.z0x();
         var23.n5("transparency");
         var23.l6(com.aspose.slides.ms.System.a3.n5(var0.y4(), com.aspose.slides.internal.x7n.l6.k5()));
         var1.n5(var23);
      }

      if (var0.a6() != 0) {
         com.aspose.slides.internal.k4y.z0x var24 = new com.aspose.slides.internal.k4y.z0x();
         var24.n5("tip");
         var24.l6(var0.a6() == 1 ? "rectangle" : "drop");
         var1.n5(var24);
      }

      if (var0.u9() != 1) {
         com.aspose.slides.internal.k4y.z0x var25 = new com.aspose.slides.internal.k4y.z0x();
         var25.n5("rasterOp");
         var25.l6(var0.u9() == 2 ? "maskPen" : "noOperation");
         var1.n5(var25);
      }

      if (var0.e2()) {
         com.aspose.slides.internal.k4y.z0x var26 = new com.aspose.slides.internal.k4y.z0x();
         var26.n5("antiAliased");
         var26.l6("1");
         var1.n5(var26);
      }

      if (var0.t9()) {
         com.aspose.slides.internal.k4y.z0x var27 = new com.aspose.slides.internal.k4y.z0x();
         var27.n5("fitToCurve");
         var27.l6("1");
         var1.n5(var27);
      }

      if (var0.z1()) {
         com.aspose.slides.internal.k4y.z0x var28 = new com.aspose.slides.internal.k4y.z0x();
         var28.n5("ignorePressure");
         var28.l6("1");
         var1.n5(var28);
      }

      if (var0.t2() != null && var0.t2().size() > 0) {
         List$Enumerator var3 = var0.t2().iterator();

         try {
            while (var3.hasNext()) {
               t7j var4 = (t7j)var3.next();
               com.aspose.slides.internal.k4y.i3p var5 = new com.aspose.slides.internal.k4y.i3p();
               g1h.n5(var4, var5);
               var1.n5(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      if (var0.s7() != null && var0.s7().size() > 0) {
         List$Enumerator var30 = var0.s7().iterator();

         try {
            while (var30.hasNext()) {
               r3w var32 = (r3w)var30.next();
               com.aspose.slides.internal.k4y.s4z var34 = new com.aspose.slides.internal.k4y.s4z();
               y2h.n5(var32, var34);
               var1.n5(var34);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
               var30.dispose();
            }
         }
      }

      if (var0.t4().size() > 0) {
         List$Enumerator var31 = var0.t4().iterator();

         try {
            while (var31.hasNext()) {
               n0p var33 = (n0p)var31.next();
               com.aspose.slides.internal.k4y.z0x var29 = new com.aspose.slides.internal.k4y.z0x();
               var29.n5(var33.n5());
               var29.l6(var33.l6());
               var1.n5(var29);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
               var31.dispose();
            }
         }
      }
   }
}
