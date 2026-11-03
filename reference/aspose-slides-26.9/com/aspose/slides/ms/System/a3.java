package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

public final class a3 {
   public static int n5(int var0, int var1) {
      if (var0 < var1) {
         return -1;
      } else {
         return var0 > var1 ? 1 : 0;
      }
   }

   public static int n5(int var0, Object var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Integer.class) {
         throw new ArgumentException("Object must be of type Int32");
      } else {
         int var2 = z3.h0(var1);
         if (var0 < var2) {
            return -1;
         } else {
            return var0 > var2 ? 1 : 0;
         }
      }
   }

   public static boolean l6(int var0, int var1) {
      return var0 == var1;
   }

   public static int n5(int var0) {
      return var0;
   }

   public static int n5(String var0) {
      return com.aspose.slides.internal.w4w.x8.n5(var0);
   }

   public static int n5(String var0, int var1) {
      return com.aspose.slides.internal.w4w.x8.n5(var0, var1);
   }

   public static int n5(String var0, h2 var1) {
      return com.aspose.slides.internal.w4w.x8.n5(var0, var1);
   }

   public static int n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.x8.n5(var0, var1, var2);
   }

   public static boolean n5(String var0, int var1, h2 var2, int[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         var3[0] = 0;
         return false;
      }
   }

   public static boolean n5(String var0, int[] var1) {
      return n5(var0, 7, com.aspose.slides.internal.x7n.s7.s7(), var1);
   }

   public static String l6(int var0) {
      return com.aspose.slides.internal.w4w.y4.l6(null, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(int var0, h2 var1) {
      return com.aspose.slides.internal.w4w.y4.l6(null, var0, var1);
   }

   public static String n5(int var0, String var1) {
      return com.aspose.slides.internal.w4w.y4.l6(var1, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(int var0, String var1, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.l6(var1, var0, var2);
   }
}
