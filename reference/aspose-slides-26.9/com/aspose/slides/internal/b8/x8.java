package com.aspose.slides.internal.b8;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.ms.System.d1;

public class x8 {
   private static final char[] n5 = new char[]{' ', '<', '>', '{', '}', '|', '^', '[', ']', '`', '"'};
   private static final char[] l6 = new char[]{'/', '\\'};

   public static boolean n5(String var0) {
      return l6(var0) || k5(var0);
   }

   public static boolean l6(String var0) {
      return var0.length() > 2 && n5(var0.charAt(0)) && var0.charAt(1) == ':' && (var0.charAt(2) == '\\' || var0.charAt(2) == '/');
   }

   public static boolean k5(String var0) {
      return d1.l6(var0, "\\\\");
   }

   private static boolean n5(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= 'A' && var0 <= 'Z';
   }

   public static String n5(String var0, String var1) {
      if (!t4.l6(var0)) {
         return var1;
      }

      String var2;
      if (d1.c8(var0, "\\") != -1) {
         var2 = "\\";
      } else {
         var2 = "/";
      }

      return d1.k5(var0, var2) ? d1.n5(new String[]{var0, var1}) : d1.n5(new String[]{var0, var2, var1});
   }

   public static boolean u3(String var0) {
      return d1.l6(var0, "#");
   }

   public static String a6(String var0) {
      return h0(var0) ? u9(var0) : var0;
   }

   public static String u9(String var0) {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (l6(var3)) {
            n5(var1, var3);
         } else {
            var1.n5(var3);
         }
      }

      return var1.toString();
   }

   private static boolean l6(char var0) {
      return d1.u3(" <>{}|^[]`\"%", var0) >= 0;
   }

   private static boolean h0(String var0) {
      if (!t4.l6(var0)) {
         return false;
      }

      if (!l6(var0) && !k5(var0)) {
         if (d1.n5(var0, n5) >= 0) {
            return true;
         }

         for (int var1 = 0; var1 < var0.length(); var1++) {
            if (var0.charAt(var1) == '%' && var1 + 2 < var0.length() && !c8(d1.l6(var0, var1, 3))) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean c8(String var0) {
      return var0.length() == 3 && var0.charAt(0) == '%' && t4.n5(var0.charAt(1)) && t4.n5(var0.charAt(2));
   }

   private static void n5(a5 var0, char var1) {
      var0.n5('%');
      var0.n5(t4.n5((byte)var1));
   }
}
