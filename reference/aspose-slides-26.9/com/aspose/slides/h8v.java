package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

class h8v {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "custGeom", "prstGeom", "lineSketchNone", "lineSketchCurved", "lineSketchFreehand", "lineSketchScribble"
   );

   public static void n5(ISketchFormat var0, com.aspose.slides.internal.k4y.x8 var1) {
      com.aspose.slides.ms.System.Xml.m8 var2 = n5(var1);
      if (var2 != null) {
         com.aspose.slides.ms.System.Xml.x5 var3 = new com.aspose.slides.ms.System.Xml.x5(var2);
         var3.u9();
         com.aspose.slides.internal.k4y.w2a var4 = new com.aspose.slides.internal.k4y.w2a(var3);
         SketchFormat var5 = (SketchFormat)var0;
         Dictionary var6 = null;
         if (var4.k5() != null) {
            var5.n5(new j2x());
            switch (n5.n5(var4.k5().n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.u1s var19 = (com.aspose.slides.internal.k4y.u1s)var4.k5().l6();
                  Dictionary[] var21 = new Dictionary[]{var6};
                  var5.a6().n5(u7a.n5(var19.u9(), null, var21));
                  var6 = var21[0];
                  var5.a6().n5(0);
                  List var9 = u7a.n5(var19.h0(), var6);
                  var5.a6().n5(u7a.n5(var19.t2(), var6, var9));
                  var5.a6().n5(u7a.n5(var19.c8(), var6, var9));
                  com.aspose.slides.internal.k4y.o8m var10 = var19.s7();
                  if (var10 != null) {
                     var5.a6().n5(new y1[1]);
                     var5.a6().h0()[0] = new y1(var10.n5(), var10.l6(), var6, var9);
                     var5.a6().l6(new y1[1]);
                     var5.a6().c8()[0] = new y1(var10.k5(), var10.u3(), var6, var9);
                  }

                  com.aspose.slides.internal.k4y.j8m var11 = var19.x8();
                  if (var11 != null) {
                     List var12 = new List();

                     for (com.aspose.slides.internal.k4y.c7f var16 : var11.l6()) {
                        var12.addItem(new q7g(var16, var6, var9));
                     }

                     var5.a6().n5((q7g[])var12.toArray(new q7g[0]));
                  }

                  var5.a6().n5((r8e[])var9.toArray(new r8e[0]));
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.r7n var7 = (com.aspose.slides.internal.k4y.r7n)var4.k5().l6();
                  var5.a6().n5(var7.l6());
                  var5.a6().n5(c3u.n5(var7.l6()));
                  if (var5.a6().s7() == null) {
                     return;
                  }

                  Dictionary[] var8 = new Dictionary[]{var6};
                  var5.a6().n5(u7a.n5(var7.k5(), var5.a6().s7().n5(), var8));
                  var6 = var8[0];
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4.k5().n5(), "\""}));
            }
         }

         var5.n5(var4.l6());
         com.aspose.slides.internal.k4y.g7 var20 = var4.u3().n5();
         var5.setSketchType(-1);
         if (var20 != null) {
            switch (n5.n5(var20.n5())) {
               case 2:
                  var5.setSketchType(0);
                  break;
               case 3:
                  var5.setSketchType(1);
                  break;
               case 4:
                  var5.setSketchType(2);
                  break;
               case 5:
                  var5.setSketchType(3);
            }
         }
      }
   }

   public static void n5(ISketchFormat var0, com.aspose.slides.internal.k4y.r5w var1) {
      SketchFormat var2 = (SketchFormat)var0;
      if (var2.getSketchType() != -1) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();
         com.aspose.slides.internal.n8e.u4 var4 = new com.aspose.slides.internal.n8e.u4(var3, com.aspose.slides.internal.l7h.j5.e2(), 0);
         var4.n5("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
         var4.l6("uri", "{C807C97D-BFC1-408E-A445-0C87EB9F89A2}");
         com.aspose.slides.internal.k4y.w2a var5 = new com.aspose.slides.internal.k4y.w2a();
         var5.n5(var2.u3());
         String var6 = "lineSketchNone";
         switch (var2.getSketchType()) {
            case 1:
               var6 = "lineSketchCurved";
               break;
            case 2:
               var6 = "lineSketchFreehand";
               break;
            case 3:
               var6 = "lineSketchScribble";
         }

         var5.n5().n5(var6);
         if (var2.a6().x8() != -1) {
            r8e[] var7 = var2.a6().a6();
            y2[] var8 = var2.a6().l6();
            c4[] var9 = var2.a6().u3();
            i4w[] var10 = var2.a6().k5();
            if (var2.a6().x8() == 0) {
               com.aspose.slides.internal.k4y.u1s var21 = (com.aspose.slides.internal.k4y.u1s)var5.n5("custGeom").l6();
               u7a.n5(var8, new h8v$1(var21));
               u7a.n5(var7, var8, new h8v$2(var21));
               u7a.n5(var9, var7, var8, new h8v$3(var21));
               u7a.n5(var10, var7, var8, new h8v$4(var21));
               y1[] var12 = var2.a6().h0();
               if (var12 != null) {
                  com.aspose.slides.internal.k4y.o8m var13 = var21.a6();
                  var13.n5(u7a.n5(var12[0].n5(), var7, var8));
                  var13.l6(u7a.n5(var12[0].l6(), var7, var8));
                  var13.k5(u7a.n5(var2.a6().c8()[0].n5(), var7, var8));
                  var13.u3(u7a.n5(var2.a6().c8()[0].l6(), var7, var8));
               }

               if (var2.a6().u9() != null) {
                  for (q7g var16 : var2.a6().u9()) {
                     e2c.n5(var16, var21.x8(), var7, var8);
                  }
               }
            } else {
               com.aspose.slides.internal.k4y.r7n var11 = (com.aspose.slides.internal.k4y.r7n)var5.n5("prstGeom").l6();
               u7a.n5(var8, var11.n5());
               var11.n5(var2.a6().t2());
            }
         }

         var5.n5("", var4, "lineSketchStyleProps");
         var4.s7();
         var4.u9();
         var4.a6();
         byte[] var17 = var3.toArray();
         String var18 = com.aspose.slides.internal.l7h.j5.e2().l6(var17);
         com.aspose.slides.internal.k4y.l8r var19 = new com.aspose.slides.internal.k4y.l8r();
         com.aspose.slides.internal.k4y.w8d var20 = (com.aspose.slides.internal.k4y.w8d)var19.l6();
         var20.n5(var18);
         var1.n5(var19);
      }
   }

   static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         com.aspose.slides.ms.System.Xml.m8 var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{C807C97D-BFC1-408E-A445-0C87EB9F89A2}").getDocumentElement();
         return var1 != null
            ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var1, "lineSketchStyleProps", "http://schemas.microsoft.com/office/drawing/2018/sketchyshapes")
            : null;
      } else {
         return null;
      }
   }
}
