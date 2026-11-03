package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.b8c.b4;
import com.aspose.slides.internal.b8c.i0;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.b1;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.w4;

public class s9 {
   private static final b4 n5 = new s9$1();

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0, k0t var1, SortedList<String, String> var2, String var3, boolean var4) {
      return n5(var0, var1, var2, var3, var4, true);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0, k0t var1, SortedList<String, String> var2, String var3, boolean var4, boolean var5) {
      com.aspose.slides.ms.System.Xml.j9 var6 = new com.aspose.slides.ms.System.Xml.j9();
      s2 var7 = var4 ? new t3(var6, var3) : new s2(var6);
      if (var2 != null) {
         IGenericEnumerator var8 = var2.iterator();

         try {
            while (var8.hasNext()) {
               KeyValuePair var9 = (KeyValuePair)var8.next();
               var7.n5((String)var9.getKey(), (String)var9.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }

      b1 var13 = new b1(null, var7, null, 0);
      w4 var14 = new w4();
      if (var1 != null) {
         var14.a6(4);
         var14.q0().n5(var1);
         var14.l6.l6(n5);
      }

      var14.l6(var5);
      return c7.n5(var0, var14, var13);
   }

   public static void n5(Object var0, i0 var1) {
   }

   public static String n5(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (n5(var3)) {
            var1.n5(var3);
         }
      }

      return var1.toString();
   }

   private static boolean n5(char var0) {
      return var0 == '\t'
         || var0 == '\n'
         || var0 == '\r'
         || var0 >= ' ' && var0 <= '\ud7ff'
         || var0 >= '\ue000' && var0 <= '�'
         || var0 >= 65536 && var0 <= 1114111;
   }
}
