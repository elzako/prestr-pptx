package com.aspose.slides;

class u7q {
   public static void n5(IConnector var0, com.aspose.slides.internal.k4y.t2 var1, i1x var2) {
      if (var1 != null) {
         d9l var3 = ((Connector)var0).n5();
         n5v.n5(var0, var1.l6(), var2.n5());
         com.aspose.slides.internal.k4y.s7 var4 = var1.n5();
         z6a.n5(var0, var4.k5(), var2);
         z6a.n5(var0, var4.n5(), var2);
         com.aspose.slides.internal.k4y.g1p var5 = var4.l6();
         var2.c8().addItem(var0, var5);
         g7i.n5(var0.getConnectorLock(), var5.u3());
         h1o.n5(var0, var1.k5());
         var3.l6(var5.h0());
         var3.n5(var1.a6());
      }
   }

   public static void n5(IConnector var0, com.aspose.slides.internal.k4y.t2 var1, g6c var2) {
      d9l var3 = ((Connector)var0).n5();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.r0a.class)) {
         var1.n5(var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.a3p.class)) {
      }

      n5v.n5(var0, var1.l6(), var2);
      com.aspose.slides.internal.k4y.s7 var4 = var1.n5();
      z6a.n5(var0, var4.k5(), var2);
      z6a.n5(var0, var4.n5(), var2);
      com.aspose.slides.internal.k4y.g1p var5 = var4.l6();
      r9.n5((ConnectorLock)var0.getConnectorLock(), new u7q$1(var5));
      if (var0.getStartShapeConnectedTo() != null) {
         com.aspose.slides.internal.k4y.e6r var6 = var5.l6();
         var6.n5(((Shape)var0.getStartShapeConnectedTo()).h0().z3());
         var6.l6(var0.getStartShapeConnectionSiteIndex());
      }

      if (var0.getEndShapeConnectedTo() != null) {
         com.aspose.slides.internal.k4y.e6r var7 = var5.k5();
         var7.n5(((Shape)var0.getEndShapeConnectedTo()).h0().z3());
         var7.l6(var0.getEndShapeConnectionSiteIndex());
      }

      h1o.n5(var0.getShapeStyle(), new u7q$2(var1));
      var5.n5(var3.x8());
   }
}
