package com.aspose.slides.internal.f2;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class s7 {
   private static final String n5 = d1.n5(new String[]{",;:$&+=", "?/[]@"});
   private static final char[] l6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

   public static String n5(String var0) {
      var0 = d1.l6(var0);
      if (d1.l6(var0, "url(") && d1.c8(var0, ")") != -1) {
         var0 = d1.l6(com.aspose.slides.internal.v3.x8.n5(var0, 4, d1.u3(var0, ")")));
         if (d1.l6(var0, "'") && d1.k5(var0, "'")) {
            var0 = com.aspose.slides.internal.v3.x8.n5(var0, 1, var0.length() - 1);
         } else if (d1.l6(var0, "\"") && d1.k5(var0, "\"")) {
            var0 = com.aspose.slides.internal.v3.x8.n5(var0, 1, var0.length() - 1);
         }
      }

      return var0;
   }

   private static boolean n5(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   private static boolean l6(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'A' && var0 <= 'z';
   }

   private static boolean k5(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'F' || var0 >= 'a' && var0 <= 'f';
   }

   private static boolean u3(char var0) {
      return d1.u3(n5, var0) >= 0 ? true : '#' == var0;
   }

   private static boolean a6(char var0) {
      return n5(var0) || l6(var0) ? true : d1.u3("_-!.~'()*", var0) >= 0;
   }

   private static void n5(a5 var0, byte var1) {
      var0.n5('%').n5(l6[com.aspose.slides.internal.v6g.k5.u3(var1, 6) >> 4 & 15]).n5(l6[com.aspose.slides.internal.v6g.k5.u3(var1, 6) >> 0 & 15]);
   }

   public static String l6(String var0) {
      var0 = n5(var0);
      a5 var1 = new a5();
      int var2 = 0;

      for (int var3 = var0.length(); var2 < var3; var2++) {
         char var4 = var0.charAt(var2);
         if (var4 == '%' && var2 < var3 - 3 && k5(var0.charAt(var2 + 1)) && k5(var0.charAt(var2 + 2))) {
            var1.n5(var4);
         } else if (!u3(var4) && !a6(var4)) {
            try {
               byte[] var5 = j5.z3().u3(t9.q0(var4));
               int var6 = 0;

               for (int var7 = var5.length; var6 < var7; var6++) {
                  n5(var1, var5[var6]);
               }
            } catch (UnsupportedOperationException var8) {
               throw var8;
            }
         } else {
            var1.n5(var4);
         }
      }

      return var1.toString();
   }
}
