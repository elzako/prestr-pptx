package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;

public final class p3 {
   public static int n5(long var0, Object var2) {
      if (var2 == null) {
         return 1;
      } else if (var2.getClass() != Long.class) {
         throw new ArgumentException("Object must be of type Int64");
      } else {
         long var3 = z3.t2(var2);
         if (var0 < var3) {
            return -1;
         } else {
            return var0 > var3 ? 1 : 0;
         }
      }
   }

   public static boolean l6(long var0, Object var2) {
      return var2 != null && var2.getClass() == Long.class ? z3.t2(var2) == var0 : false;
   }

   public static int n5(long var0) {
      return (int)var0 ^ (int)(var0 >> 32);
   }

   public static boolean n5(String var0, int var1, h2 var2, long[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   public static boolean n5(String var0, long[] var1) {
      return n5(var0, 7, com.aspose.slides.internal.x7n.s7.s7(), var1);
   }

   public static long n5(String var0) {
      return com.aspose.slides.internal.w4w.n3.n5(var0);
   }

   public static long n5(String var0, int var1) {
      return com.aspose.slides.internal.w4w.n3.n5(var0, var1);
   }

   public static long n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.n3.n5(var0, var1, var2);
   }

   public static String l6(long var0) {
      return com.aspose.slides.internal.w4w.y4.k5(null, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(long var0, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.k5(null, var0, var2);
   }

   public static String n5(long var0, String var2) {
      return com.aspose.slides.internal.w4w.y4.k5(var2, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(long var0, String var2, h2 var3) {
      return com.aspose.slides.internal.w4w.y4.k5(var2, var0, var3);
   }
}
