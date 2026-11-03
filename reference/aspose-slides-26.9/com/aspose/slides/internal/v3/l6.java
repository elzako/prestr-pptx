package com.aspose.slides.internal.v3;

import com.aspose.slides.internal.d2.t4$n5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class l6 {
   public static int n5(int var0) {
      switch (var0) {
         case 0:
            return 2;
         case 9:
         case 13:
         case 32:
            return 4;
         case 10:
            return 1;
         default:
            return h0(var0) ? 0 : 3;
      }
   }

   public static boolean l6(int var0) {
      return var0 == 32 || u3(var0);
   }

   public static boolean k5(int var0) {
      return var0 == 8203 || var0 == 8288 || var0 == 65279;
   }

   public static boolean u3(int var0) {
      return var0 >= 8192 && var0 <= 8203 || var0 == 12288;
   }

   public static boolean a6(int var0) {
      return var0 == 160 || var0 == 8239 || var0 == 12288 || var0 == 8288 || var0 == 65279;
   }

   public static boolean u9(int var0) {
      return var0 == 32 || var0 == 160;
   }

   public static boolean h0(int var0) {
      return l6(var0) || a6(var0);
   }

   public static boolean c8(int var0) {
      return var0 == 10 || var0 == 13 || var0 == 133 || var0 == 8232 || var0 == 8233;
   }

   public static String t2(int var0) {
      a5 var1 = new a5();
      int var2 = 0;

      for (int var3 = var0 > 65535 ? 6 : 4; var2 < var3; var0 >>= 4) {
         int var4 = var0 & 15;
         char var5;
         if (var4 < 10) {
            var5 = (char)(48 + var4);
         } else {
            var5 = (char)(65 + (var4 - 10));
         }

         var1.n5(var5);
         var2++;
      }

      return d1.n5(new String[]{"&#x", t4$n5.n5(var1.toString()), ";"});
   }

   public static String n5(String var0) {
      a5 var1 = new a5();
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (var3 < ' ' || var3 >= 127) {
               var1.n5(t2(var3));
            } else if (var3 == '<') {
               var1.n5("&lt;");
            } else if (var3 == '>') {
               var1.n5("&gt;");
            } else if (var3 == '&') {
               var1.n5("&amp;");
            } else {
               var1.n5(var3);
            }
         }
      }

      return var1.toString();
   }

   public static boolean n5(com.aspose.slides.internal.r4.a6 var0, com.aspose.slides.internal.r4.a6 var1) {
      if (var0.h0() != var1.h0()) {
         return false;
      }

      int var2 = 0;

      for (int var3 = var0.h0(); var2 < var3; var2++) {
         if (var0.u3(var2) != var1.u3(var2)) {
            return false;
         }
      }

      return true;
   }
}
