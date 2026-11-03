package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.internal.DOMResourcesUtils;
import com.aspose.slides.internal.b8c.a9;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.ms.System.IDisposable;

public class v6 {
   private static final v6$n5 n5 = n5();

   private static v6$n5 n5() {
      v6$n5 var0 = new v6$n5(null);
      var0.n5 = new SortedDictionary<>();
      com.aspose.slides.internal.z0k.t4 var1 = DOMResourcesUtils.getResourceStream("resources", "schemas.zip");

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
                              var0.n5.addItem(com.aspose.slides.ms.System.d1.n5(new String[]{"http://", com.aspose.slides.ms.System.d1.k5(var4.u3(), 5)}), var6);
                           } else {
                              var0.n5.addItem(com.aspose.slides.ms.System.d1.n5(new String[]{"http://zip/", var4.u3()}), var6);
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

      var0.l6 = new j6(var0.n5);
      return var0;
   }

   public static k0t n5(String[] var0) {
      k0t var1 = null;
      if (var0 != null) {
         if (var0.length == 1 && var0[0] != null && var0[0].length() > 0) {
            var1 = l6(var0);
         } else if (var0.length > 1) {
            var1 = l6(var0);
         }
      }

      return var1;
   }

   private static k0t l6(String[] var0) {
      k0t var1 = new k0t();
      var1.n5(n5.l6);

      try {
         for (String var5 : var0) {
            String var6 = var5;
            if (com.aspose.slides.ms.System.d1.u3(var6, ':') < 0) {
               var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"http://zip/", var6});
            }

            byte[] var7 = n5.n5.get_Item(var6);
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2(var7, false);

            a9 var10;
            try {
               com.aspose.slides.ms.System.Xml.p5 var9 = new com.aspose.slides.ms.System.Xml.p5(var6, var8);

               try {
                  var10 = a9.n5(var9, new v6$1());
               } finally {
                  if (var9 != null) {
                     var9.dispose();
                  }
               }
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            var1.n5(var10);
         }

         var1.x8();
         return var1;
      } catch (RuntimeException var21) {
         com.aspose.slides.internal.n8e.v4.n5(var21);
         return null;
      }
   }
}
