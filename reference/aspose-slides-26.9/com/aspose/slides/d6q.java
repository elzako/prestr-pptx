package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class d6q {
   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.y1z var1, x0a var2) {
      if (var0 == null) {
         throw new ArgumentNullException("shape");
      }

      if (var1 == null) {
         throw new ArgumentNullException("enhancedGeometryElement");
      }

      j2x var3 = var0.e2();
      if (var3.u9() != null && var3.u9().length != 0) {
         String var4 = com.aspose.slides.ms.System.d1.n5;
         String[] var5 = new String[0];
         if (var3.l6() != null) {
            var5 = new String[var3.l6().length];
            int var6 = 0;

            for (y2 var10 : var3.l6()) {
               if (var10 != null && !var10.a6()) {
                  var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{" ", com.aspose.slides.ms.System.Xml.f4.n5(var10.n5())}));
                  var5[var6++] = var10.k5();
               }
            }
         }

         var4 = com.aspose.slides.ms.System.d1.l6(var4);
         var1.u3(com.aspose.slides.ms.System.d1.n5(var4) ? null : var4);
         com.aspose.slides.internal.l7h.a5 var22 = new com.aspose.slides.internal.l7h.a5();

         for (q7g var26 : var3.u9()) {
            var22.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var26.n5(var3.a6(), var3.l6(), var5), " N "}));
         }

         var1.k5(var22.toString());
         long var11 = var3.u9()[0].l6();
         long var13 = var3.u9()[0].k5();
         if ((var11 == 0L || var13 == 0L) && (var3.a6() == null || var3.a6().length == 0)) {
            com.aspose.slides.internal.o9b.y1 var15 = new com.aspose.slides.internal.o9b.y1(
               com.aspose.slides.internal.o9b.w1.n5.u3(), ((ShapeFrame)var0.getFrame()).n5().c8().a6()
            );
            IGeometryPath[] var16 = var0.getGeometryPaths();

            for (IGeometryPath var20 : var16) {
               com.aspose.slides.internal.o9b.y1.l6(var15.y4(), ShapeUtil.n5(var20).s7().y4()).a6(var15);
            }

            var11 = com.aspose.slides.internal.v6g.k5.u9(var15.s7() * 12700.0F, 13);
            var13 = com.aspose.slides.internal.v6g.k5.u9(var15.k5() * 12700.0F, 13);
         }

         var1.l6(com.aspose.slides.ms.System.d1.n5("0 0 {0} {1}", (var11 == 0L ? 21600L : var11) * 1L, (var13 == 0L ? 21600L : var13) * 1L));
         var1.n5("non-primitive");
         n5(var3, var5, var1);
      }
   }

   public static com.aspose.slides.internal.k4y.y1z n5(int var0) {
      String var1 = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0";

      for (int var2 = 0; var2 < s1h.l6.length; var2++) {
         if (s1h.l6[var2] == var0) {
            XmlDocument var3 = new XmlDocument();
            var3.setXmlResolver(null);
            var3.load(DOMResourcesUtils.getResourceStream("OdpCustomShapes.xml"));
            com.aspose.slides.ms.System.Xml.i0 var4 = var3.getElementsByTagName("enhanced-geometry", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
            IEnumerator var5 = var4.iterator();

            try {
               while (var5.hasNext()) {
                  com.aspose.slides.ms.System.Xml.m8 var6 = (com.aspose.slides.ms.System.Xml.m8)var5.next();
                  if (com.aspose.slides.ms.System.d1.a6(var6.u3("enhanced-path", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"), s1h.n5[var2])) {
                     com.aspose.slides.ms.System.Xml.x5 var7 = new com.aspose.slides.ms.System.Xml.x5(var6);

                     try {
                        var7.u9();
                        return new com.aspose.slides.internal.k4y.y1z(var7);
                     } finally {
                        if (var7 != null) {
                           var7.dispose();
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  ((IDisposable)var5).dispose();
               }
            }
         }
      }

      return null;
   }

   private static void n5(j2x var0, String[] var1, com.aspose.slides.internal.k4y.y1z var2) {
      if (var0.a6() != null) {
         for (int var3 = 0; var3 < var0.a6().length; var3++) {
            r8e var4 = var0.a6()[var3];
            if (!var4.l6()) {
               com.aspose.slides.internal.k4y.j2l var5 = var2.n5();
               var5.n5(var4.n5());
               var5.l6(var4.n5(var0.a6(), var0.l6(), var1));
            }
         }
      }

      if (var2.y4().length > 0 || !com.aspose.slides.ms.System.d1.n5(var2.h0())) {
         int var9 = 0;

         for (String var7 : u3k.n5) {
            if (!com.aspose.slides.ms.System.d1.a6(var7, "0")) {
               com.aspose.slides.internal.k4y.j2l var8 = var2.n5();
               var8.n5(u3k.l6[var9]);
               var8.l6(var7);
            }

            var9++;
         }
      }
   }
}
