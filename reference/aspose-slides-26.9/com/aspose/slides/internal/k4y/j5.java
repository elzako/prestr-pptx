package com.aspose.slides.internal.k4y;

public abstract class j5 {
   protected static z6y n5(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         if (var5.l6().getDocumentElement() != null) {
            com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
            if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
               return (z6y)var5;
            }
         }
      }

      return null;
   }

   protected static void l6(x8 var0, String var1) {
      z6y var2 = n5(var0, var1);
      if (var2 != null) {
         var2.n5("");
      }
   }
}
