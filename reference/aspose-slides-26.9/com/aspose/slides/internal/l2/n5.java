package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.n2d.m3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.openxmlformats-package.relationships+xml",
      "image/bmp",
      "image/x-emf",
      "image/gif",
      "image/jpeg",
      "image/x-pcz",
      "image/png",
      "image/x-wmf",
      "application/vnd.openxmlformats-officedocument.obfuscatedFont"
   );

   public static void n5(a6 var0, boolean var1) {
      m3 var2 = new m3();
      m3 var3 = new m3();
      IGenericEnumerator var4 = var0.l6().iterator();

      try {
         while (var4.hasNext()) {
            u9 var5 = (u9)var4.next();
            switch (n5.n5(var5.k5())) {
               case 0:
                  break;
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
                  var2.set_Item(var5.l6(), var5.k5());
                  break;
               default:
                  var3.addItem(var5.n5(), var5.k5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      u9 var11 = new u9("/[Content_Types].xml", d1.n5);
      var0.l6().n5(var11);
      com.aspose.slides.internal.b8.n5 var6 = new com.aspose.slides.internal.b8.n5(var11.u3(), var1);
      var6.n5("Types");
      var6.k5("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");

      for (Object recoveredElement$var8$1841 : var2) {
         KeyValuePair var8 = (KeyValuePair)recoveredElement$var8$1841;
         n5((String)var8.getKey(), (String)var8.getValue(), var6);
      }

      n5("rels", "application/vnd.openxmlformats-package.relationships+xml", var6);
      n5("xml", "application/xml", var6);

      for (Object recoveredElement$var13$2083 : var3) {
         KeyValuePair var13 = (KeyValuePair)recoveredElement$var13$2083;
         l6((String)var13.getKey(), (String)var13.getValue(), var6);
      }

      var6.l6();
   }

   private static void n5(String var0, String var1, com.aspose.slides.internal.b8.n5 var2) {
      var2.l6("Default");
      var2.k5("Extension", var0);
      var2.k5("ContentType", var1);
      var2.k5();
   }

   private static void l6(String var0, String var1, com.aspose.slides.internal.b8.n5 var2) {
      var2.l6("Override");
      var2.k5("PartName", var0);
      var2.k5("ContentType", var1);
      var2.k5();
   }
}
