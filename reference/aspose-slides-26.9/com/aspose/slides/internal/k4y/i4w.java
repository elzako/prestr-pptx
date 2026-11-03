package com.aspose.slides.internal.k4y;

import com.aspose.slides.ms.System.Xml.XmlDocument;

public class i4w {
   public static e2l n5(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}".equals(var5.getValue())) {
               return n5(var4.l6());
            }
         }
      }

      return null;
   }

   private static e2l n5(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.k5(true);
                  var2.u9();

                  while (!var2.j5()) {
                     var2.u9();
                     if ("solidFill".equals(var2.n3())) {
                        return new e2l(var2);
                     }
                  }
               } finally {
                  if (var2 != null) {
                     var2.dispose();
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         }
      } catch (RuntimeException var14) {
         com.aspose.slides.internal.n8e.v4.n5(var14);
      }

      return null;
   }

   public static void n5(x8 var0, String var1) {
      z6y var2 = l6(var0, "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
               var4.u3("uri", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");
               var4.n5("c14", "invertSolidFillFmt", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
               var4.n5("c14", "spPr", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
               var4.n5("a", "solidFill", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.n5("a", "srgbClr", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.u3("val", var1);
               var4.s7();
               var4.s7();
               var4.n5("a", "ln", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.n5("a", "noFill", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.s7();
               var4.s7();
               var4.n5("a", "effectLst", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.s7();
               var4.s7();
               var4.s7();
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               var2.l6().load(var3);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }
   }

   private static z6y l6(x8 var0, String var1) {
      z6y var2 = k5(var0, var1);
      if (var2 == null) {
         var2 = (z6y)var0.l6();
         var2.n5(
            com.aspose.slides.ms.System.d1.n5(
               "<c:ext xmlns:c =\"{0}\" uri=\"{1}\" xmlns:c14=\"{2}\" xmlns:a=\"{3}\"></c:ext>",new Object[]{
               "http://schemas.openxmlformats.org/drawingml/2006/chart",
               var1,
               "http://schemas.microsoft.com/office/drawing/2007/8/2/chart",
               "http://schemas.openxmlformats.org/drawingml/2006/main"
            })
         );
      }

      return var2;
   }

   private static z6y k5(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
         if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
            return (z6y)var5;
         }
      }

      return null;
   }
}
