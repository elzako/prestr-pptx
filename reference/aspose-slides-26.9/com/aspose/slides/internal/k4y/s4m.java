package com.aspose.slides.internal.k4y;

public class s4m {
   public static b2l n5(x8 var0, String var1) {
      b2l var2 = l6(var0, var1);
      if (var2 == null) {
         var2 = (b2l)var0.l6();
         var2.n5(
            com.aspose.slides.ms.System.d1.n5(
               "<p:ext uri=\"{0}\" xmlns:p=\"{1}\" xmlns:p15=\"{2}\"></p:ext>",new Object[]{
               var1,
               "http://schemas.openxmlformats.org/presentationml/2006/main",
               "http://schemas.microsoft.com/office/powerpoint/2012/main"
            })
         );
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
}
