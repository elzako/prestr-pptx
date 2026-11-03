package com.aspose.slides.internal.l2;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;

public class l6 {
   public static void n5(
      com.aspose.slides.internal.b8.n5 var0,
      String var1,
      String var2,
      String var3,
      String var4,
      String var5,
      String var6,
      String var7,
      j5 var8,
      j5 var9,
      j5 var10,
      String var11
   ) {
      var0.n5("cp:coreProperties");
      var0.k5("xmlns:cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
      var0.k5("xmlns:dc", "http://purl.org/dc/elements/1.1/");
      var0.k5("xmlns:dcterms", "http://purl.org/dc/terms/");
      var0.k5("xmlns:dcmitype", "http://purl.org/dc/dcmitype/");
      var0.k5("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      var0.l6("dc:title", var1);
      var0.l6("dc:subject", var2);
      var0.l6("dc:creator", var3);
      var0.l6("cp:keywords", var4);
      var0.l6("dc:description", var5);
      var0.l6("cp:lastModifiedBy", var6);
      var0.n5("cp:revision", var7);
      var0.n5("cp:lastPrinted", var8.m3());
      n5(var0, "created", var9.m3());
      n5(var0, "modified", var10.m3());
      var0.l6("cp:category", var11);
      var0.l6();
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, String var1, j5 var2) {
      if (var2.e2() > 1) {
         var0.l6(d1.n5(new String[]{"dcterms:", var1}));
         var0.k5("xsi:type", "dcterms:W3CDTF");
         var0.u3(com.aspose.slides.internal.t6j.u3.n5(var2.m3()));
         var0.k5();
      }
   }
}
