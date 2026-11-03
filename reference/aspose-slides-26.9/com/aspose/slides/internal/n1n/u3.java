package com.aspose.slides.internal.n1n;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.d0e.s7;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.r4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.k3;
import com.aspose.slides.ms.System.Xml.l1;

public class u3 {
   public static String n5(s7 var0) {
      return n5(var0.u9);
   }

   public static String n5(t2 var0) {
      return n5(var0, 1);
   }

   public static String n5(t2 var0, int var1) {
      r4 var2 = new r4();

      try {
         k3 var3 = new k3(var2);
         var3.n5(var1);
         n5(var0, var3);
         var3.a6();
         return var2.toString();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static void n5(t2 var0, k3 var1) {
      n5(var0, (l1)var1);
   }

   private static void n5(t2 var0, l1 var1) {
      if ("root".equals(var0.u9)) {
         for (int var10 = 0; var10 < var0.j5().n5(); var10++) {
            n5(var0.j5().l6(var10), var1);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.j7h.n5.class)) {
         com.aspose.slides.internal.j7h.n5 var9 = (com.aspose.slides.internal.j7h.n5)var0;
         if (var9.t2) {
            var1.c8(var9.c8);
         } else {
            var1.l6(var9.c8);
         }
      } else {
         var1.y4(var0.u9);
         if (var0.l6.size() > 0) {
            a5 var2 = new a5();
            IGenericEnumerator var3 = var0.l6.iterator();

            try {
               while (var3.hasNext()) {
                  KeyValuePair var4 = (KeyValuePair)var3.next();
                  if (!"style".equals(var4.getKey())) {
                     if (d1.l6((String)var4.getKey(), "-")) {
                        var2.n5("{0}:{1};", var4.getKey(), var4.getValue());
                     } else {
                        var1.u3((String)var4.getKey(), (String)var4.getValue());
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }

            String var11 = d1.n5(new String[]{var2.toString(), var0.l6.k5("style", "")});
            if (!d1.n5(d1.l6(var11))) {
               var1.u3("style", var11);
            }
         }

         if (var0.m1()) {
            for (int var8 = 0; var8 < var0.j5().n5(); var8++) {
               n5(var0.j5().l6(var8), var1);
            }
         }

         var1.s7();
      }
   }
}
