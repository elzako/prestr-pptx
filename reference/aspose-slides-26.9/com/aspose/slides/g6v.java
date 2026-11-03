package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class g6v {
   static void n5(p3f var0) {
      com.aspose.slides.internal.k0r.q5 var1 = var0.l6().n3();
      TextFrame var2 = var0.h0();
      x8m var3 = var2.n5.c8();
      var3.l6 = new Dictionary<>();
      Dictionary var4 = var3.l6;
      List var5 = new List();
      com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.a6().l6().n5(327), com.aspose.slides.internal.k0r.z5.class);
      String var7 = var4.size() != 0 ? com.aspose.slides.ms.System.d1.n5("adj{0}", new Object[]{var4.size() + 1}) : "adj";
      switch (var3.n5()) {
         case 1:
         case 17:
         case 20:
         case 26:
         case 28:
            if (var6 != null) {
               var4.set_Item(var7, var4.size() + 1);
               int var14 = (int)(((var6.j5() & 4294967295L) * 50000L & 4294967295L) / 10800L);
               var5.addItem(new y2(var7, com.aspose.slides.ms.System.d1.n5(new String[]{"val ", com.aspose.slides.ms.System.a3.l6(var14)})));
            }
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
         case 19:
         case 22:
         case 24:
         case 25:
         case 27:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 38:
         default:
            break;
         case 9:
            var4.set_Item(var7, var4.size() + 1);
            var5.addItem(new y2(var7, "val 10800000"));
            if (var6 != null) {
               ((y2)var5.get_Item(0)).n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3((int)var6.j5() / 65536.0F * 60000.0F), 14));
               if (((y2)var5.get_Item(0)).n5() < 0L) {
                  ((y2)var5.get_Item(0)).n5(((y2)var5.get_Item(0)).n5() + 21600000L);
               }

               AutoShape var13 = com.aspose.slides.internal.v6g.k5.n5(var0.l6().m1(), AutoShape.class);
               if (var13 != null) {
                  double var9 = ((y2)var5.get_Item(0)).l6() / 180.0F * Math.PI;
                  ((y2)var5.get_Item(0))
                     .n5(
                        com.aspose.slides.internal.v6g.k5.u9(
                           com.aspose.slides.ms.System.q1.u3(
                              com.aspose.slides.ms.System.q1.u3(
                                    com.aspose.slides.ms.System.q1.h0(var9) * var13.getHeight(), com.aspose.slides.ms.System.q1.c8(var9) * var13.getWidth()
                                 )
                                 / Math.PI
                                 * 180.0
                                 * 60000.0
                           ),
                           14
                        )
                     );
               }

               if (((y2)var5.get_Item(0)).n5() < 0L) {
                  ((y2)var5.get_Item(0)).n5(((y2)var5.get_Item(0)).n5() + 21600000L);
               }
            }
            break;
         case 21:
            if (var6 == null) {
               String var12 = com.aspose.slides.ms.System.d1.n5("adj{0}", new Object[]{var4.size() + 1});
               var4.set_Item(var12, var4.size() + 1);
               var5.addItem(new y2(var12, "val 13005"));
               String var15 = com.aspose.slides.ms.System.d1.n5("adj{0}", new Object[]{var4.size() + 1});
               var4.set_Item(var15, var4.size() + 1);
               var5.addItem(new y2(var15, "val 0"));
            }
            break;
         case 23:
            if (var6 == null) {
               String var8 = com.aspose.slides.ms.System.d1.n5("adj{0}", new Object[]{var4.size() + 1});
               var4.set_Item(var8, var4.size() + 1);
               var5.addItem(new y2(var8, "val 6500"));
               String var11 = com.aspose.slides.ms.System.d1.n5("adj{0}", new Object[]{var4.size() + 1});
               var4.set_Item(var11, var4.size() + 1);
               var5.addItem(new y2(var11, "val 0"));
            }
            break;
         case 37:
            if (var6 == null) {
               var4.set_Item(var7, var4.size() + 1);
               var5.addItem(new y2(var7, "val 55556"));
            } else if ((var6.j5() & 4294967295L) == 6924L) {
               var4.set_Item(var7, var4.size() + 1);
               var5.addItem(new y2(var7, "val 32056"));
            }
            break;
         case 39:
            var4.set_Item(var7, var4.size() + 1);
            var5.addItem(new y2(var7, "val 44444"));
      }

      var3.n5 = (y2[])var5.toArray(new y2[0]);
   }
}
