package com.aspose.slides.internal.k4y;

import com.aspose.slides.IDataLabelCollection;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public class f2 extends j5 {
   public static j6e n5(x8 var0) {
      z6y var1 = n5(var0, "{02D57815-91ED-43cb-92C2-25804820EDAC}");
      if (var1 == null) {
         return null;
      }

      try {
         com.aspose.slides.internal.z0k.w1 var2 = new com.aspose.slides.internal.z0k.w1(var1.l6().getDocumentElement().getInnerXml());

         try {
            com.aspose.slides.ms.System.Xml.p5 var3 = new com.aspose.slides.ms.System.Xml.p5(var2);

            try {
               var3.k5(true);

               while (!var3.j5() && var3.s7() != 1) {
                  var3.u9();
               }

               if (!var3.j5()) {
                  return new j6e(var3);
               }
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }

      return null;
   }

   public static void n5(x8 var0, IDataLabelCollection var1, String var2, List<String> var3) {
      l6(var0, "{02D57815-91ED-43cb-92C2-25804820EDAC}");
      if (var1.getDefaultDataLabelFormat().getShowLabelValueFromCell()) {
         try {
            com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.ms.System.Xml.k3 var5 = new com.aspose.slides.ms.System.Xml.k3(var4, com.aspose.slides.internal.l7h.j5.z3());

               try {
                  z6y var6 = (z6y)var0.l6();
                  var5.n5("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                  var5.u3("xmlns:c15", "http://schemas.microsoft.com/office/drawing/2012/chart");
                  var5.u3("uri", "{02D57815-91ED-43cb-92C2-25804820EDAC}");
                  var5.n5("c15", "datalabelsRange", "http://schemas.microsoft.com/office/drawing/2012/chart");
                  var5.n5("c15", "f", "http://schemas.microsoft.com/office/drawing/2012/chart");
                  var5.l6(var2);
                  var5.s7();
                  n5(var5, var3);
                  var5.s7();
                  var5.s7();
                  var5.u9();
                  var4.setPosition(0L);
                  var6.n5(new XmlDocument());
                  var6.l6().setXmlResolver(null);
                  var6.l6().load(var4);
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } catch (RuntimeException var17) {
            com.aspose.slides.internal.n8e.v4.n5(var17);
         }
      }
   }

   private static void n5(com.aspose.slides.ms.System.Xml.k3 var0, List<String> var1) {
      var0.n5("c15", "dlblRangeCache", "http://schemas.microsoft.com/office/drawing/2012/chart");
      var0.n5("c", "ptCount", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      var0.a6("val", null, com.aspose.slides.ms.System.Xml.f4.n5(var1.size()));
      var0.s7();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (!com.aspose.slides.ms.System.d1.n5((String)var1.get_Item(var2))) {
            var0.n5("c", "pt", "http://schemas.openxmlformats.org/drawingml/2006/chart");
            var0.a6("idx", null, com.aspose.slides.ms.System.Xml.f4.n5(var2));
            var0.n5("c", "v", "http://schemas.openxmlformats.org/drawingml/2006/chart");
            var0.l6((String)var1.get_Item(var2));
            var0.s7();
            var0.s7();
         }
      }

      var0.s7();
   }
}
