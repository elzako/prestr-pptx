package com.aspose.slides;

class j2z {
   public static com.aspose.slides.ms.System.Xml.l0 n5(com.aspose.slides.ms.System.Xml.m8 var0, String var1, String var2) {
      return l6(var0, var1, var2);
   }

   private static com.aspose.slides.ms.System.Xml.l0 l6(com.aspose.slides.ms.System.Xml.l0 var0, String var1, String var2) {
      for (Object recoveredElement$var4$336 : var0.getChildNodes()) {
         com.aspose.slides.ms.System.Xml.l0 var4 = (com.aspose.slides.ms.System.Xml.l0)recoveredElement$var4$336;
         if (com.aspose.slides.ms.System.d1.a6(var4.getLocalName(), var1) && com.aspose.slides.ms.System.d1.a6(var4.getNamespaceURI(), var2)) {
            return var4;
         }
      }

      return null;
   }

   public static com.aspose.slides.ms.System.Xml.l0 n5(com.aspose.slides.ms.System.Xml.l0 var0, String var1, String var2) {
      return n5(var0, var0.getPrefixOfNamespace(var2), var1, var2);
   }

   public static com.aspose.slides.ms.System.Xml.l0 n5(com.aspose.slides.ms.System.Xml.l0 var0, String var1, String var2, String var3) {
      com.aspose.slides.ms.System.Xml.l0 var4 = l6(var0, var2, var3);
      if (var4 == null) {
         var4 = var0.getOwnerDocument().createElement(var1, var2, var3);
         var0.appendChild(var4);
      }

      return var4;
   }
}
