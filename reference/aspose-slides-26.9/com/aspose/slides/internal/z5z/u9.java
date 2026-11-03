package com.aspose.slides.internal.z5z;

import com.aspose.slides.ms.System.d1;

public class u9 {
   private static final char[] l6 = new char[]{';'};
   private static final char[] k5 = new char[]{','};
   private static final char[] u3 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public static final byte[] n5 = new byte[0];

   public static boolean n5(String var0) {
      return var0 != null && var0.length() > 0;
   }

   public static boolean n5(String var0, String var1, boolean var2) {
      if (var2) {
         var0 = d1.t2(var0);
         var1 = d1.t2(var1);
      }

      return d1.c8(var0, var1) >= 0;
   }

   public static boolean n5(String var0, String var1) {
      return s7.n5(var0, var1);
   }
}
