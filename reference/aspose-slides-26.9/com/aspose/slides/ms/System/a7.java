package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import java.math.BigInteger;

public final class a7 {
   public static int n5(long var0, long var2) {
      BigInteger var4 = n5(var0);
      BigInteger var5 = n5(var2);
      return var4.compareTo(var5);
   }

   public static int n5(long var0, Object var2) {
      if (var2 == null) {
         return 1;
      }

      if (var2.getClass() != Long.class) {
         throw new ArgumentException("Object must be of type Int64");
      }

      long var3 = z3.s7(var2);
      return n5(var0, var3);
   }

   public static boolean n5(String var0, int var1, h2 var2, long[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         return false;
      } catch (OverflowException var6) {
         return false;
      }
   }

   public static long n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.q0.n5(var0, var1, var2);
   }

   public static String n5(long var0, String var2) {
      return com.aspose.slides.internal.w4w.y4.l6(var2, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(long var0, String var2, h2 var3) {
      return com.aspose.slides.internal.w4w.y4.l6(var2, var0, var3);
   }

   public static BigInteger n5(long var0) {
      BigInteger var2;
      if (var0 >= 0L) {
         var2 = BigInteger.valueOf(var0);
      } else {
         var2 = BigInteger.valueOf(Long.MAX_VALUE);
         var2 = var2.add(BigInteger.ONE);
         var2 = var2.add(BigInteger.valueOf(Long.MIN_VALUE - var0).abs());
      }

      return var2;
   }
}
