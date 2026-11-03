package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.ms.System.IDisposable;

class j6s {
   static final byte[] n5;
   private static final com.aspose.slides.internal.b8c.k0t k5;
   private static final com.aspose.slides.internal.b8c.k0t u3;
   private static final com.aspose.slides.internal.b8c.k0t a6 = null;
   private static final com.aspose.slides.internal.b8c.k0t u9 = null;
   private static final com.aspose.slides.internal.b8c.k0t h0 = null;
   private static final com.aspose.slides.internal.b8c.k0t c8 = null;
   private static final com.aspose.slides.internal.b8c.k0t t2 = null;
   SortedList<String, m2v> l6;
   private static final com.aspose.slides.internal.v6g.u9 s7;

   private static com.aspose.slides.internal.b8c.k0t n5(
      String var0, SortedList<String, byte[]> var1, com.aspose.slides.ms.System.Xml.o8 var2, com.aspose.slides.internal.b8c.b4 var3
   ) {
      com.aspose.slides.internal.b8c.k0t var4 = new com.aspose.slides.internal.b8c.k0t();
      var4.n5(var2);

      try {
         String var5 = var0;
         if (com.aspose.slides.ms.System.d1.u3(var5, ':') < 0) {
            var5 = com.aspose.slides.ms.System.d1.n5(new String[]{"http://zip/", var5});
         }

         byte[] var6 = (byte[])var1.get_Item(var5);
         com.aspose.slides.ms.System.Xml.p5 var7 = new com.aspose.slides.ms.System.Xml.p5(var5, new com.aspose.slides.internal.z0k.e2(var6, false));

         try {
            var7.k5(true);
            com.aspose.slides.internal.b8c.a9 var8 = com.aspose.slides.internal.b8c.a9.n5(var7, var3);
            var4.n5(var8);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         var4.x8();
         return var4;
      } catch (RuntimeException var13) {
         com.aspose.slides.internal.n8e.v4.n5(var13);
         return null;
      }
   }

   private static void l6(Object var0, com.aspose.slides.internal.b8c.i0 var1) {
   }

   // $VF: synthetic method
   static void n5(Object var0, com.aspose.slides.internal.b8c.i0 var1) {
      l6(var0, var1);
   }

   static {
      SortedList var0 = new SortedList();
      com.aspose.slides.internal.z0k.t4 var1 = DOMResourcesUtils.getResourceStream("schemas.zip");

      try {
         com.aspose.slides.internal.e5a.d2 var2 = com.aspose.slides.internal.e5a.d2.n5(var1);

         try {
            IGenericEnumerator var3 = var2.iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.internal.e5a.y2 var4 = (com.aspose.slides.internal.e5a.y2)var3.next();
                  if (!var4.n3()) {
                     com.aspose.slides.internal.e5a.t2 var5 = var4.c4();

                     try {
                        byte[] var6 = new byte[(int)var4.t2()];
                        int var7 = 0;

                        while (true) {
                           if (var7 < var6.length) {
                              int var8 = var5.read(var6, var7, var6.length - var7);
                              if (var8 != 0) {
                                 var7 += var8;
                                 continue;
                              }
                           }

                           if (com.aspose.slides.ms.System.d1.l6(var4.u3(), "http")) {
                              var0.addItem(com.aspose.slides.ms.System.d1.n5(new String[]{"http://", com.aspose.slides.ms.System.d1.k5(var4.u3(), 5)}), var6);
                           } else {
                              var0.addItem(com.aspose.slides.ms.System.d1.n5(new String[]{"http://zip/", var4.u3()}), var6);
                           }
                           break;
                        }
                     } finally {
                        if (var5 != null) {
                           var5.dispose();
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
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

      j6s$1 var44 = new j6s$1();
      f5d var45 = new f5d(var0);
      k5 = n5("opc-contentTypes.xsd", var0, var45, var44);
      u3 = n5("opc-relationships.xsd", var0, var45, var44);
      com.aspose.slides.internal.z0k.t4 var46 = DOMResourcesUtils.getResourceStream("templates.zip");
      com.aspose.slides.internal.e5a.d2 var47 = com.aspose.slides.internal.e5a.d2.n5(var46);

      try {
         n5 = m2v.n5(var47, var47.l6("emptySheet.xml"));
      } finally {
         if (var47 != null) {
            var47.dispose();
         }
      }

      s7 = new com.aspose.slides.internal.v6g.u9(
         "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml",
         "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml",
         "application/vnd.openxmlformats-officedocument.spreadsheetml.table+xml",
         "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml"
      );
   }
}
