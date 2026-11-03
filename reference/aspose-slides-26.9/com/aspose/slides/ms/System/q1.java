package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.OverflowException;

public final class q1 {
   public static double n5(double var0) {
      return var0 < 0.0 ? -var0 : var0;
   }

   public static float n5(float var0) {
      return var0 < 0.0F ? -var0 : var0;
   }

   public static int n5(int var0) {
      if (var0 == Integer.MIN_VALUE) {
         throw new OverflowException("Value is too small.");
      } else {
         return var0 < 0 ? -var0 : var0;
      }
   }

   public static long n5(long var0) {
      if (var0 == Long.MIN_VALUE) {
         throw new OverflowException("Value is too small.");
      } else {
         return var0 < 0L ? -var0 : var0;
      }
   }

   public static c4 n5(c4 var0) {
      c4 var1 = u3(var0);
      if (c4.h0(var1, var0)) {
         var1 = c4.u3(var1);
      }

      return var1;
   }

   public static double l6(double var0) {
      if (!Double.isInfinite(var0) && !Double.isNaN(var0)) {
         double var2 = k5(var0);
         if (var2 != var0) {
            var2++;
         }

         return var2;
      } else {
         return var0;
      }
   }

   public static double k5(double var0) {
      return Math.floor(var0);
   }

   public static int n5(int var0, int var1, int[] var2) {
      var2[0] = var0 % var1;
      return var0 / var1;
   }

   public static double n5(double var0, double var2) {
      if (var2 == 1.0) {
         return Double.NaN;
      }

      double var4 = t4(var0) / t4(var2);
      return var4 == 0.0 ? 0.0 : var4;
   }

   public static byte n5(byte var0, byte var1) {
      return (var0 & 255) > (var1 & 255) ? var0 : var1;
   }

   public static double l6(double var0, double var2) {
      if (!d2.k5(var0) && !d2.k5(var2)) {
         return var0 > var2 ? var0 : var2;
      } else {
         return Double.NaN;
      }
   }

   public static float n5(float var0, float var1) {
      if (!n1.k5(var0) && !n1.k5(var1)) {
         return var0 > var1 ? var0 : var1;
      } else {
         return Float.NaN;
      }
   }

   public static int n5(int var0, int var1) {
      return var0 > var1 ? var0 : var1;
   }

   public static long n5(long var0, long var2) {
      return var0 > var2 ? var0 : var2;
   }

   public static short n5(short var0, short var1) {
      return var0 > var1 ? var0 : var1;
   }

   public static long l6(long var0, long var2) {
      return (var0 & 4294967295L) > (var2 & 4294967295L) ? var0 & 4294967295L : var2 & 4294967295L;
   }

   public static double k5(double var0, double var2) {
      if (!d2.k5(var0) && !d2.k5(var2)) {
         return var0 < var2 ? var0 : var2;
      } else {
         return Double.NaN;
      }
   }

   public static float l6(float var0, float var1) {
      if (!n1.k5(var0) && !n1.k5(var1)) {
         return var0 < var1 ? var0 : var1;
      } else {
         return Float.NaN;
      }
   }

   public static int l6(int var0, int var1) {
      return var0 < var1 ? var0 : var1;
   }

   public static long k5(long var0, long var2) {
      return var0 < var2 ? var0 : var2;
   }

   public static short l6(short var0, short var1) {
      return var0 < var1 ? var0 : var1;
   }

   public static long u3(long var0, long var2) {
      return (var0 & 4294967295L) < (var2 & 4294967295L) ? var0 & 4294967295L : var2 & 4294967295L;
   }

   public static c4 l6(c4 var0) {
      c4 var1 = c4.c8(var0);
      c4 var2 = c4.u3(var0, var1);
      if (c4.c8(var2, new c4("0.5")) && c4.h0(c4.a6(new c4("2.0"), c4.u3(c4.u9(var1, new c4("2.0")), c4.c8(c4.u9(var1, new c4("2.0"))))), new c4("0.0"))
         || c4.t2(var2, new c4("0.5"))) {
         var1 = c4.u3(var1);
      }

      return var1;
   }

   public static c4 n5(c4 var0, short var1) {
      if (var1 != 0 && var1 != 1) {
         throw new ArgumentException(d1.n5(new String[]{"The value '", d5.getName(y0.class, var1), "' is not valid for this usage of the type MidpointRounding."}), "mode");
      } else {
         return var1 == 0 ? l6(var0) : k5(var0);
      }
   }

   static c4 k5(c4 var0) {
      c4 var1 = c4.c8(var0);
      c4 var2 = c4.u3(var0, var1);
      if (c4.s7(var1, c4.n5(0)) && c4.s7(var2, new c4("0.5"))) {
         var1 = c4.u3(var1);
      } else if (c4.x8(var1, c4.n5(0)) && c4.t2(var2, new c4("0.5"))) {
         var1 = c4.u3(var1);
      }

      return var1;
   }

   public static double u3(double var0) {
      if (Double.isInfinite(var0) || Double.isNaN(var0)) {
         return var0;
      } else if (var0 == 0.0) {
         return var0;
      } else {
         double var2 = k5(var0);
         double var4 = l6(var0);
         if (n5(var4 - var0) == n5(var2 - var0)) {
            return n5(var2 % 2.0) == 1.0 ? var4 : var2;
         } else {
            return n5(var4 - var0) > n5(var2 - var0) ? var2 : var4;
         }
      }
   }

   public static double n5(double var0, int var2) {
      if (Double.isInfinite(var0) || Double.isNaN(var0)) {
         return var0;
      } else if (var2 < 0 || var2 > 15) {
         throw new ArgumentOutOfRangeException("Value is too small or too big.");
      } else {
         return var2 == 0 ? u3(var0) : l6(var0, var2, (short)0);
      }
   }

   public static double n5(double var0, short var2) {
      if (Double.isInfinite(var0) || Double.isNaN(var0)) {
         return var0;
      } else if (var2 != 0 && var2 != 1) {
         throw new ArgumentException(d1.n5(new String[]{"The value '", d5.getName(y0.class, var2), "' is not valid for this usage of the type MidpointRounding."}), "mode");
      } else if (var2 == 0) {
         return u3(var0);
      } else {
         return var0 > 0.0 ? k5(var0 + 0.5) : l6(var0 - 0.5);
      }
   }

   public static double n5(double var0, int var2, short var3) {
      if (Double.isInfinite(var0) || Double.isNaN(var0)) {
         return var0;
      } else if (var3 != 0 && var3 != 1) {
         throw new ArgumentException(d1.n5(new String[]{"The value '", d5.getName(y0.class, var3), "' is not valid for this usage of the type MidpointRounding."}), "mode");
      } else {
         return var2 == 0 ? n5(var0, var3) : l6(var0, var2, var3);
      }
   }

   private static double l6(double var0, int var2, short var3) {
      c4 var4 = c4.n5(var0);
      var4 = c4.n5(var4, var2, var3);
      return c4.h0(var4);
   }

   public static double a6(double var0) {
      if (Double.isInfinite(var0) || Double.isNaN(var0)) {
         return var0;
      } else if (var0 > 0.0) {
         return k5(var0);
      } else {
         return var0 < 0.0 ? l6(var0) : var0;
      }
   }

   public static c4 u3(c4 var0) {
      return c4.c8(var0);
   }

   public static int u9(double var0) {
      if (d2.k5(var0)) {
         throw new ArithmeticException("NAN");
      } else if (var0 > 0.0) {
         return 1;
      } else {
         return var0 == 0.0 ? 0 : -1;
      }
   }

   public static int l6(float var0) {
      if (n1.k5(var0)) {
         throw new ArithmeticException("NAN");
      } else if (var0 > 0.0F) {
         return 1;
      } else {
         return var0 == 0.0F ? 0 : -1;
      }
   }

   public static int l6(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 == 0 ? 0 : -1;
      }
   }

   public static double h0(double var0) {
      return Math.sin(var0);
   }

   public static double c8(double var0) {
      return Math.cos(var0);
   }

   public static double t2(double var0) {
      return Math.tan(var0);
   }

   public static double s7(double var0) {
      return Math.sinh(var0);
   }

   public static double x8(double var0) {
      return Math.cosh(var0);
   }

   public static double n3(double var0) {
      return Math.tanh(var0);
   }

   public static double y4(double var0) {
      return Math.acos(var0);
   }

   public static double e2(double var0) {
      return Math.asin(var0);
   }

   public static double t9(double var0) {
      return Math.atan(var0);
   }

   public static double u3(double var0, double var2) {
      return Math.atan2(var0, var2);
   }

   public static double z1(double var0) {
      return Math.exp(var0);
   }

   public static double t4(double var0) {
      return Math.log(var0);
   }

   public static double q0(double var0) {
      return Math.log10(var0);
   }

   public static double a6(double var0, double var2) {
      return d2.k5(var0) ? Double.NaN : Math.pow(var0, var2);
   }

   public static double z3(double var0) {
      return Math.sqrt(var0);
   }
}
