package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

public final class d2 {
   public static int n5(double var0, double var2) {
      if (a6(var0) && a6(var2)) {
         return 0;
      } else if (u3(var0) && u3(var2)) {
         return 0;
      } else if (k5(var2)) {
         return k5(var0) ? 0 : 1;
      } else if (k5(var0) && !k5(var2)) {
         return -1;
      } else if (var0 > var2) {
         return 1;
      } else {
         return var0 < var2 ? -1 : 0;
      }
   }

   public static int n5(double var0, Object var2) {
      if (var2 == null) {
         return 1;
      } else if (var2.getClass() != Double.class) {
         throw new ArgumentException("Value is not a System.Double");
      } else {
         double var3 = z3.n3(var2);
         if (a6(var0) && a6(var3)) {
            return 0;
         } else if (u3(var0) && u3(var3)) {
            return 0;
         } else if (k5(var3)) {
            return k5(var0) ? 0 : 1;
         } else if (k5(var0) && !k5(var3)) {
            return -1;
         } else if (var0 > var3) {
            return 1;
         } else {
            return var0 < var3 ? -1 : 0;
         }
      }
   }

   public static boolean l6(double var0, double var2) {
      return var2 == var0 || k5(var2) && k5(var0);
   }

   public static int n5(double var0) {
      return new Double(var0).hashCode();
   }

   public static boolean l6(double var0) {
      return var0 == Double.POSITIVE_INFINITY || var0 == Double.NEGATIVE_INFINITY;
   }

   public static boolean k5(double var0) {
      return Double.isNaN(var0);
   }

   public static boolean u3(double var0) {
      return var0 == Double.NEGATIVE_INFINITY;
   }

   public static boolean a6(double var0) {
      return var0 == Double.POSITIVE_INFINITY;
   }

   public static double n5(String var0) {
      return com.aspose.slides.internal.w4w.t2.n5(var0);
   }

   public static double n5(String var0, h2 var1) {
      return com.aspose.slides.internal.w4w.t2.n5(var0, var1);
   }

   public static double n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.t2.n5(var0, var1, var2);
   }

   public static String u9(double var0) {
      return com.aspose.slides.internal.w4w.y4.n5("G", var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(double var0, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.n5(null, var0, com.aspose.slides.internal.x7n.s7.n5(var2));
   }

   public static String n5(double var0, String var2) {
      return com.aspose.slides.internal.w4w.y4.n5(var2, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(double var0, String var2, h2 var3) {
      return com.aspose.slides.internal.w4w.y4.n5(var2, var0, com.aspose.slides.internal.x7n.s7.n5(var3));
   }

   public static boolean n5(String var0, int var1, h2 var2, double[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         var3[0] = 0.0;
         return false;
      }
   }

   public static boolean n5(String var0, double[] var1) {
      return n5(var0, 231, com.aspose.slides.internal.x7n.s7.s7(), var1);
   }
}
