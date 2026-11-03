package com.aspose.slides;

import com.aspose.slides.ms.System.Xml.XmlDocument;

class e2l {
   static void n5(IChartWall var0, com.aspose.slides.internal.k4y.v7y var1, t5w var2) {
      if (var1 != null) {
         v2x var3 = ((ChartWall)var0).n5();
         if (var1.u3() != null) {
            var0.setThickness((int)var1.u3().n5());
         }

         if (var1.u9() != null) {
            var3.n5(var1.u9());
            String var4 = "http://schemas.openxmlformats.org/drawingml/2006/chart";
            com.aspose.slides.ms.System.Xml.m8 var5 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var1.u9().l6().getDocumentElement(), "pictureFormat", var4);
            if (var5 != null) {
               String var6 = var5.n5("val");
               if (var6 != null && !"".equals(var6)) {
                  var0.setPictureType(com.aspose.slides.internal.k4y.p4.n5.n5(var6));
               }
            }
         }

         k5r.n5(var0.getFormat(), var1.a6(), var2);
         var3.n5(var1.h0());
      }
   }

   static void n5(IChartWall var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.v7y> var1, g6c var2) {
      if (n5(var0)) {
         com.aspose.slides.internal.k4y.v7y var3 = (com.aspose.slides.internal.k4y.v7y)var1.invoke();
         v2x var4 = ((ChartWall)var0).n5();
         var3.n5().n5(var0.getThickness() & 4294967295L);
         var3.n5(var4.n5());
         if (var0.getPictureType() != -1) {
            String var5 = "http://schemas.openxmlformats.org/drawingml/2006/chart";
            if (var3.u9() == null) {
               var3.k5();
               var3.u9().n5(new XmlDocument());
               var3.u9().l6().appendChild(var3.u9().l6().createElement("c", "pictureOptions", var5));
            }

            com.aspose.slides.ms.System.Xml.m8 var6 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var3.u9().l6().getDocumentElement(), "pictureFormat", var5);
            if (var6 == null) {
               var6 = var3.u9().l6().createElement("c", "pictureFormat", var5);
               var3.u9().l6().getDocumentElement().appendChild(var6);
            }

            var6.k5("val", com.aspose.slides.internal.k4y.p4.n5(var0.getPictureType()));
         }

         k5r.n5(var0.getFormat(), new e2l$1(var3), var2, null, false);
         var3.n5(var4.l6());
      }
   }

   static boolean n5(IChartWall var0) {
      return var0.getThickness() > 0 || k5r.n5(var0.getFormat(), null) || var0.getPictureType() != -1;
   }
}
