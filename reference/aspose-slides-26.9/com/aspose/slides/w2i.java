package com.aspose.slides;

class w2i {
   public static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.l3d var1, h6j var2) {
      byte var3;
      switch (var1.n5()) {
         case 1:
            var3 = 98;
            break;
         case 2:
            var3 = 98;
            break;
         case 3:
            var3 = 96;
            break;
         case 4:
            var3 = 102;
            break;
         default:
            var3 = 98;
      }

      float var4 = (float)t2f.u9(var1.l6());
      float var5 = (float)t2f.u9(var1.k5());
      float var6 = (float)t2f.u9(var1.u9());
      float var7 = (float)t2f.u9(var1.h0());
      float var8 = var6 - var4;
      float var9 = var7 - var5;
      byte var10 = 0;
      byte var11 = 0;
      if (var8 < 0.0F) {
         var4 += var8;
         var10 = 1;
      }

      if (var9 < 0.0F) {
         var5 += var9;
         var11 = 1;
      }

      Connector var12 = (Connector)var0.addConnector(var3, var4, var5, com.aspose.slides.ms.System.q1.n5(var8), com.aspose.slides.ms.System.q1.n5(var9));
      if (var10 == 1 || var11 == 1) {
         IShapeFrame var13 = var12.getFrame();
         var12.setFrame(new ShapeFrame(var13.getX(), var13.getY(), var13.getWidth(), var13.getHeight(), var10, var11, var13.getRotation()));
      }

      n7n.n5(var12, var1.n3(), var2);
      if (!com.aspose.slides.ms.System.d1.n5(var1.u3()) && var2.h0().containsKey(var1.u3())) {
         Shape var16 = var2.h0().get_Item(var1.u3());
         if (var16.getConnectionSiteCount() > 0) {
            var12.setStartShapeConnectedTo(var16);
            long var14 = var1.a6();
            if ((var14 & 4294967295L) > 0L && (var14 & 4294967295L) < var16.getConnectionSiteCount()) {
               var14 = (var16.getConnectionSiteCount() & 4294967295L) - (var14 & 4294967295L) & 4294967295L;
               var12.setStartShapeConnectionSiteIndex(var14);
            }
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.c8()) && var2.h0().containsKey(var1.c8())) {
         Shape var17 = var2.h0().get_Item(var1.c8());
         if (var17.getConnectionSiteCount() > 0) {
            var12.setEndShapeConnectedTo(var17);
            long var19 = var1.t2();
            if ((var19 & 4294967295L) > 0L && (var19 & 4294967295L) < var17.getConnectionSiteCount()) {
               var19 = (var17.getConnectionSiteCount() & 4294967295L) - (var19 & 4294967295L) & 4294967295L;
               var12.setEndShapeConnectionSiteIndex(var19);
            }
         }
      }

      return var12;
   }
}
