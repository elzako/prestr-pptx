package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class y2 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("PartName", "ContentType", "Extension");

   public static void n5(SortedList<String, j8> var0) {
      j8 var1 = null;
      j8[] var2 = new j8[]{var1};
      var0.tryGetValue("/[Content_Types].xml", var2);
      var1 = var2[0];
      if (var1 == null) {
         throw new t5("Can't find part \"/[Content_Types].xml\".");
      }

      com.aspose.slides.internal.z0k.e2 var3 = var1.h0();
      if (var3 == null) {
         throw new t5(com.aspose.slides.ms.System.d1.n5(new String[]{"contentTypesStream is null when reading \"", "/[Content_Types].xml", "\" relationships part"}));
      }

      try {
         c4 var4 = new c4();
         com.aspose.slides.ms.System.Xml.c7 var5 = com.aspose.slides.internal.n8e.s9.n5(
            new com.aspose.slides.internal.z0k.m3(var3, true), var4.u3(), var4.a6(), var4.n5(), var4.u9()
         );

         while (var5.u9()) {
            if (var5.s7() == 1 && "http://schemas.openxmlformats.org/package/2006/content-types".equals(var5.y4()) && "Types".equals(var5.n3())) {
               while (var5.u9() && (var5.s7() != 15 || !"Types".equals(var5.n3()))) {
                  n5(var5, var0);
                  l6(var5, var0);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw new t5(com.aspose.slides.ms.System.d1.n5(new String[]{"Error reading \"", "/[Content_Types].xml", "\" relationships part"}), var6);
      }

      var1.l6(new c4());
      var1.n5(true);
   }

   private static void n5(com.aspose.slides.ms.System.Xml.c7 var0, SortedList<String, j8> var1) {
      if (var0.s7() == 1 && "Override".equals(var0.n3())) {
         String var2 = null;
         String var3 = null;

         while (var0.u3()) {
            switch (n5.n5(var0.n3())) {
               case 0:
                  var2 = var0.z1();
                  break;
               case 1:
                  var3 = var0.z1();
            }
         }

         if (var2 != null && var3 != null && var1.containsKey(var2)) {
            j8 var4 = (j8)var1.get_Item(var2);
            var4.l6(q3.n5(var3));
         }

         var0.a6();
      }
   }

   private static void l6(com.aspose.slides.ms.System.Xml.c7 var0, SortedList<String, j8> var1) {
      if (var0.s7() == 1 && "Default".equals(var0.n3())) {
         String var2 = null;
         String var3 = null;

         while (var0.u3()) {
            switch (n5.n5(var0.n3())) {
               case 1:
                  var3 = var0.z1();
                  break;
               case 2:
                  var2 = com.aspose.slides.ms.System.d1.u9(var0.z1());
            }
         }

         if (var2 != null && var3 != null) {
            String var4 = com.aspose.slides.ms.System.d1.n5(new String[]{".", var2});
            i4 var5 = q3.n5(var3);
            boolean var6 = "application/vnd.openxmlformats-package.relationships+xml".equals(var5.n5()) && !".rels".equals(var4);
            IGenericEnumerator var7 = var1.getValues().iterator();

            try {
               while (var7.hasNext()) {
                  j8 var8 = (j8)var7.next();
                  if (var8.y4() == null && com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var8.l6()), var4)) {
                     if (var6) {
                        var8.n5(true);
                     } else {
                        var8.l6(var5);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }

         var0.a6();
      }
   }

   public static void n5(z6 var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.ms.System.Xml.k3 var2 = new com.aspose.slides.ms.System.Xml.k3(var1, com.aspose.slides.internal.l7h.j5.z3());
         var2.l6(4);
         var2.n5(var0.l6() ? 1 : 0);
         var2.l6(true);
         var2.y4("Types");
         var2.u3("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
         Dictionary var3 = new Dictionary();

         for (j8 var7 : var0.t2()) {
            String var8 = var7.l6();
            int var9 = com.aspose.slides.ms.System.d1.k5(var8, '.');
            if (var9 >= 0) {
               String var10 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.k5(var8, var9));
               String var11 = null;
               String[] var12 = new String[]{var11};
               boolean var13 = !var3.tryGetValue(var10, var12);
               var11 = var12[0];
               if (var13) {
                  var3.set_Item(var10, var7.y4().n5());
               } else if (!"".equals(var11) && !com.aspose.slides.ms.System.d1.a6(var11, var7.y4().n5())) {
                  var3.set_Item(var10, "");
               }
            }
         }

         Dictionary$Enumerator var22 = var3.iterator();

         try {
            while (var22.hasNext()) {
               KeyValuePair var23 = (KeyValuePair)var22.next();
               String var26 = (String)var23.getValue();
               String var28 = com.aspose.slides.ms.System.d1.u9((String)var23.getKey());
               if (!"".equals(var26)) {
                  var2.y4("Default");
                  var2.u3("Extension", com.aspose.slides.ms.System.d1.k5((String)var23.getKey(), 1));
                  var2.u3("ContentType", var26);
                  var2.s7();
               } else if (".xml".equals(var28)) {
                  var2.y4("Default");
                  var2.u3("Extension", com.aspose.slides.ms.System.d1.k5((String)var23.getKey(), 1));
                  var2.u3("ContentType", "application/xml");
                  var2.s7();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
               var22.dispose();
            }
         }

         for (j8 var30 : var0.t2()) {
            String var31 = var30.l6();
            int var32 = com.aspose.slides.ms.System.d1.k5(var31, '.');
            String var34 = "";
            if (var32 < 0) {
               var34 = "application/xml";
            } else {
               String var36 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.k5(var31, var32));
               var34 = (String)var3.get_Item(var36);
            }

            if (!com.aspose.slides.ms.System.d1.a6(var34, var30.y4().n5())) {
               var2.y4("Override");
               var2.u3("PartName", var31);
               var2.u3("ContentType", var30.y4().n5());
               var2.s7();
            }
         }

         var2.s7();
         var2.n5();
         var2.u9();
         j8 var25 = var0.n5("/[Content_Types].xml", null, new c4());
         var25.n5(var1.toArray());
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
