package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;

public class v3 {
   // $VF: synthetic field
   static final boolean n5 = !v3.class.desiredAssertionStatus();

   public static long n5(String var0, int var1, int var2, int[] var3) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      }

      int var4 = var3[0];
      int var5;
      if (var2 == 8192) {
         var5 = n5(var0, var1, var4);
      } else {
         var5 = var0.length();
      }

      var0 = var0.substring(var4, var5);
      var3[0] = var5;
      return Long.parseLong(var0, var1);
   }

   private static int n5(String var0, int var1, int var2) {
      int var3 = var2;
      if (var0.charAt(0) == '-') {
         var3++;
      }

      while (var3 < var0.length() && Character.digit(var0.charAt(var3), var1) != -1) {
         var3++;
      }

      return var3;
   }
}
