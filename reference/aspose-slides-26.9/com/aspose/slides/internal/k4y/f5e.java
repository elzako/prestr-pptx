package com.aspose.slides.internal.k4y;

import com.aspose.slides.ms.System.Xml.XmlDocument;

public class f5e {
   private static b2l n5(x8 var0, String var1) {
      b2l var2 = l6(var0, var1);
      if (var2 == null) {
         var2 = (b2l)var0.l6();
      }

      return var2;
   }

   private static b2l l6(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
         if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
            return (b2l)var5;
         }
      }

      return null;
   }

   public static void n5(x8 var0, boolean var1) {
      b2l var2 = n5(var0, "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("p", "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
               var4.u3("uri", "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}");
               var4.n5("p14", "showMediaCtrls", "http://schemas.microsoft.com/office/powerpoint/2010/main");
               var4.u3("val", var1 ? "1" : "0");
               var4.s7();
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               if (var2.l6() == null) {
                  var2.n5(new XmlDocument());
                  var2.l6().setXmlResolver(null);
               }

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

   private static t5s n5(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var2.j5()) {
                     var2.u9();
                     if ("showMediaCtrls".equals(var2.n3())) {
                        return new t5s(var2);
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

   public static t5s n5(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}".equals(var5.getValue())) {
               return n5(var4.l6());
            }
         }
      }

      return null;
   }
}
