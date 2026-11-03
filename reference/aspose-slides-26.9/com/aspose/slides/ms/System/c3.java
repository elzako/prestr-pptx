package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.OverflowException;

public final class c3 {
   public static int n5(int var0, int var1) {
      l6(var0);
      l6(var1);
      if (var0 < var1) {
         return -1;
      } else {
         return var0 > var1 ? 1 : 0;
      }
   }

   public static int n5(int var0, Object var1) {
      l6(var0);
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Integer.class && var1.getClass() != Short.class) {
         throw new ArgumentException("Object must be of type Int16");
      } else {
         int var2 = z3.u9(var1);
         if (var0 < var2) {
            return -1;
         } else {
            return var0 > var2 ? 1 : 0;
         }
      }
   }

   public static int n5(int var0) {
      l6(var0);
      return var0;
   }

   public static int n5(String var0, int var1) {
      return com.aspose.slides.internal.w4w.z1.n5(var0, var1);
   }

   public static int n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.z1.n5(var0, var1, var2);
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

   public static String n5(int var0, String var1) {
      l6(var0);
      return com.aspose.slides.internal.w4w.y4.n5(var1, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(int var0, String var1, h2 var2) {
      l6(var0);
      return com.aspose.slides.internal.w4w.y4.n5(var1, var0, var2);
   }

   private static void l6(int var0) {
      if (var0 > 65535 || var0 < 0) {
         throw new OverflowException();
      }
   }
}
