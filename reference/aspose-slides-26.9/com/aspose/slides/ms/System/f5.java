package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

public final class f5 {
   public static int n5(byte var0, Object var1) {
      if (var1 == null) {
         return 1;
      }

      if (var1.getClass() != Byte.class) {
         throw new ArgumentException("Object must be of type System.SByte");
      }

      byte var2 = z3.u3(var1);
      return var0 - var2;
   }

   public static int n5(byte var0) {
      return var0 ^ var0 << 8;
   }

   public static byte n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.e2.n5(var0, var1, var2);
   }

   public static String n5(byte var0, String var1, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.n5(var1, var0, var2);
   }

   public static boolean n5(String var0, int var1, h2 var2, byte[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         var3[0] = 0;
         return false;
      }
   }
}
