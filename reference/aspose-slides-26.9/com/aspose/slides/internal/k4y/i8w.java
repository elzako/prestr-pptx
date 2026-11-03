package com.aspose.slides.internal.k4y;

import com.aspose.slides.ms.System.Xml.XmlDocument;

public class i8w {
   public static XmlDocument n5(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         if (n5(var5.l6().getDocumentElement(), var1)) {
            return var5.l6();
         }
      }

      return null;
   }

   public static b2l l6(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         if (n5(var5.l6().getDocumentElement(), var1)) {
            return (b2l)var5;
         }
      }

      return null;
   }

   public static d3 k5(x8 var0, String var1) {
      d3 var2 = l6(var0, var1);
      if (var2 == null) {
         var2 = var0.l6();
         var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"<p:ext uri=\"", var1, "\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\"></p:ext>"}));
      }

      return var2;
   }

   public static void n5(x8 var0, x8 var1, String var2) {
      b2l var3 = l6(var1, var2);
      if (var3 == null) {
         for (d3 var7 : var0.n5()) {
            if (n5(var7.l6().getDocumentElement(), var2)) {
               d3 var8 = var1.l6();
               var8.n5(var7.n5());
            }
         }
      }
   }

   public static void n5(b2l var0, x8 var1, String var2) {
      b2l var3 = l6(var1, var2);
      if (var3 == null) {
         var3 = (b2l)var1.l6();
      }

      b2l var4 = var3;
      var4.n5(var0.n5());
   }

   private static boolean n5(com.aspose.slides.ms.System.Xml.m8 var0, String var1) {
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.ms.System.Xml.u8 var2 = var0.getAttributes().n5("uri");
      return var2 != null && com.aspose.slides.ms.System.d1.a6(var2.getValue(), var1);
   }
}
