package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

public final class n1 {
   public static int n5(float var0, float var1) {
      if (a6(var0) && a6(var1)) {
         return 0;
      } else if (u3(var0) && u3(var1)) {
         return 0;
      } else if (k5(var1)) {
         return k5(var0) ? 0 : 1;
      } else if (k5(var0) && !k5(var1)) {
         return -1;
      } else if (var0 > var1) {
         return 1;
      } else {
         return var0 < var1 ? -1 : 0;
      }
   }

   public static int n5(float var0, Object var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Float.class) {
         throw new ArgumentException("Value is not a System.Single");
      } else {
         float var2 = z3.x8(var1);
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
   }

   public static boolean l6(float var0, float var1) {
      return var1 == var0 || k5(var1) && k5(var0);
   }

   public static int n5(float var0) {
      return new Float(var0).hashCode();
   }

   public static boolean l6(float var0) {
      return var0 == Float.POSITIVE_INFINITY || var0 == Float.NEGATIVE_INFINITY;
   }

   public static boolean k5(float var0) {
      return Double.isNaN(var0);
   }

   public static boolean u3(float var0) {
      return var0 == Float.NEGATIVE_INFINITY;
   }

   public static boolean a6(float var0) {
      return var0 == Float.POSITIVE_INFINITY;
   }

   public static float n5(String var0) {
      return com.aspose.slides.internal.w4w.t9.n5(var0);
   }

   public static float n5(String var0, h2 var1) {
      return com.aspose.slides.internal.w4w.t9.n5(var0, var1);
   }

   public static float n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.t9.n5(var0, var1, var2);
   }

   public static String u9(float var0) {
      return com.aspose.slides.internal.w4w.y4.n5("G", var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(float var0, h2 var1) {
      return com.aspose.slides.internal.w4w.y4.n5(null, var0, com.aspose.slides.internal.x7n.s7.n5(var1));
   }

   public static String n5(float var0, String var1, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.n5(var1, var0, com.aspose.slides.internal.x7n.s7.n5(var2));
   }

   public static boolean n5(String var0, int var1, h2 var2, float[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         var3[0] = 0.0F;
         return false;
      }
   }

   public static boolean n5(String var0, float[] var1) {
      return n5(var0, 231, com.aspose.slides.internal.x7n.s7.s7(), var1);
   }
}
