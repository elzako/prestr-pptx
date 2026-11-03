package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.ms.System.IDisposable;

class u5 {
   private static final k0t n5 = null;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("media-type", "full-path", "size");

   public static void n5(SortedList<String, z5> var0) {
      z5 var1 = null;
      z5[] var2 = new z5[]{var1};
      var0.tryGetValue("/META-INF/manifest.xml", var2);
      var1 = var2[0];
      if (var1 == null) {
         throw new p7(com.aspose.slides.ms.System.d1.n5(new String[]{"Can't find part \"", "/META-INF/manifest.xml", "\"."}));
      }

      var1.n5("text/xml");
      com.aspose.slides.internal.z0k.e2 var3 = var1.h0();
      if (var3 == null) {
         throw new p7(com.aspose.slides.ms.System.d1.n5(new String[]{"manifestStream is null when reading \"", "/META-INF/manifest.xml", "\" relationships part"}));
      }

      try {
         com.aspose.slides.ms.System.Xml.c7 var4 = com.aspose.slides.internal.n8e.s9.n5(
            new com.aspose.slides.internal.z0k.m3(var3, true), n5, null, null, false
         );

         while (var4.u9()) {
            if (var4.s7() == 1 && "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0".equals(var4.y4()) && "manifest".equals(var4.n3())) {
               while (var4.u9() && (var4.s7() != 15 || !"manifest".equals(var4.n3()))) {
                  if (var4.s7() == 1 && "file-entry".equals(var4.n3())) {
                     String var5 = null;
                     String var6 = null;
                     boolean var7 = false;

                     while (var4.u3()) {
                        switch (l6.n5(var4.n3())) {
                           case 0:
                              var5 = var4.z1();
                              break;
                           case 1:
                              var6 = com.aspose.slides.ms.System.d1.n5(new Object[]{'/', var4.z1()});
                              break;
                           case 2:
                              var7 = true;
                        }
                     }

                     var4.a6();
                     boolean var8 = var4.n5("encryption-data", var4.y4());
                     z5 var9 = null;
                     IGenericEnumerator var10 = var0.getValues().iterator();

                     try {
                        while (var10.hasNext()) {
                           z5 var11 = (z5)var10.next();
                           if (com.aspose.slides.ms.System.d1.a6(var11.l6(), var6)) {
                              var9 = var11;
                              break;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           var10.dispose();
                        }
                     }

                     if (var9 != null) {
                        if (!"".equals(var5)) {
                           var9.n5(var5);
                        } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.internal.z0k.z1.a6(var6)), ".wmf")) {
                           var9.n5("image/x-wmf");
                        }

                        var9.l6(var7 & var8);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw new p7(com.aspose.slides.ms.System.d1.n5(new String[]{"Error reading \"", "/META-INF/manifest.xml", "\" relationships part"}), var16);
      }

      var1.n5(true);
   }
}
