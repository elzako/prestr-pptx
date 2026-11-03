package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.FormatException;

public final class s3 {
   public static String n5(Class<?> var0, long var1) {
      return d5.toString(var0, var1);
   }

   public static String n5(Class<?> var0, long var1, String var3) {
      if (var3 == null || var3.length() == 0) {
         var3 = "G";
      }

      if (d1.a6(var3, "G", (short)5) == 0) {
         return n5(var0, var1);
      } else if (d1.a6(var3, "D", (short)5) == 0) {
         return p3.l6(var1);
      } else if (d1.a6(var3, "X", (short)5) == 0) {
         return p3.n5(var1, var3);
      } else if (d1.a6(var3, "F", (short)5) != 0) {
         throw new FormatException("Invalid Enum Format Specification");
      } else {
         return n5(var0, var1);
      }
   }

   public static int n5(byte var0) {
      return f5.n5(var0);
   }

   public static int l6(byte var0) {
      return e2.n5(var0);
   }

   public static int n5(int var0) {
      return a3.n5(var0);
   }

   public static boolean n5(Class<?> var0, long var1, Class<?> var3, long var4) {
      return var0 != null && var3 != null && var0.equals(var3) && com.aspose.slides.internal.v6g.k5.n5(var0).d2() && var1 == var4;
   }
}
