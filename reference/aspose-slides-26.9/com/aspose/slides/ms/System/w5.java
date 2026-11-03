package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.RankException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.Comparator;

@Deprecated
public final class w5 {
   public static int n5(Object[] var0, Object var1, int var2, int var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var0.length == 0) {
         return -1;
      }

      if (var2 >= 0 && var2 < var0.length) {
         if (var3 >= 0 && var3 <= var2 + 1) {
            int var4 = var2 - var3 + 1;

            for (int var5 = var2; var5 >= var4; var5--) {
               if (j8.n5(var1, var0[var5])) {
                  return var5;
               }
            }

            return -1;
         } else {
            throw new ArgumentOutOfRangeException("count");
         }
      } else {
         throw new ArgumentOutOfRangeException("startIndex");
      }
   }

   public static void n5(Object[] var0) {
      n5(var0, 0, var0.length);
   }

   public static void n5(Object[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 >= 0 && var2 >= 0) {
         if (var0.length - var1 < var2) {
            throw new ArgumentOutOfRangeException("length");
         }

         int var3 = var1;

         for (int var4 = var1 + var2 - 1; var3 < var4; var4--) {
            Object var5 = var0[var3];
            var0[var3] = var0[var4];
            var0[var4] = var5;
            var3++;
         }
      } else {
         throw new ArgumentOutOfRangeException(var1 < 0 ? "index" : "length");
      }
   }

   public static void n5(byte[] var0) {
      n5(var0, 0, var0.length);
   }

   public static void n5(byte[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 >= 0 && var2 >= 0) {
         if (var0.length - var1 < var2) {
            throw new ArgumentOutOfRangeException("length");
         }

         int var3 = var1;

         for (int var4 = var1 + var2 - 1; var3 < var4; var4--) {
            byte var5 = var0[var3];
            var0[var3] = var0[var4];
            var0[var4] = var5;
            var3++;
         }
      } else {
         throw new ArgumentOutOfRangeException(var1 < 0 ? "index" : "length");
      }
   }

   public static int n5(Object var0) {
      int var1 = 0;

      for (Class var2 = var0.getClass(); var2.isArray(); var2 = var2.getComponentType()) {
         var1++;
      }

      return var1;
   }

   public static int n5(Object var0, int var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 >= 0 && n5(var0) - 1 >= var1) {
         return 0;
      } else {
         throw new ArgumentException("invalid dimension");
      }
   }

   public static int l6(Object var0, int var1) {
      if (var0 == null) {
         throw new NullReferenceException("array is null");
      }

      if (var1 >= 0 && n5(var0) - 1 >= var1) {
         for (int var2 = 0; var2 < var1; var2++) {
            var0 = Array.get(var0, 0);
            if (var0 == null) {
               return -1;
            }
         }

         return Array.getLength(var0) - 1;
      } else {
         throw new ArgumentException("invalid dimension");
      }
   }

   public static int k5(Object var0, int var1) {
      if (var0 == null) {
         throw new NullReferenceException("array is null");
      } else {
         return l6(var0, var1) + 1;
      }
   }

   public static <T> T[] n5(Class<T> var0, int var1) {
      boolean var2 = com.aspose.slides.internal.v6g.h0.class.isAssignableFrom(var0);
      Object[] var3 = (Object[])Array.newInstance(var0, var1);
      if (var2) {
         try {
            Constructor var4 = var0.getConstructor();

            for (int var5 = 0; var5 < var3.length; var5++) {
               var3[var5] = var4.newInstance();
            }
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }
      }

      return (T[])var3;
   }

   public static int n5(Object[] var0, int var1, int var2, Object var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else if (n5((Object)var0) > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      } else if (var1 < n5(var0, 0)) {
         throw new ArgumentOutOfRangeException("index", "index is less than the lower bound of array.");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Value has to be >= 0.");
      } else if (var1 > n5(var0, 0) + k5(var0, 0) - var2) {
         throw new ArgumentException("index and length do not specify a valid range in array.");
      } else if (var0.length == 0) {
         return -1;
      } else if (var3 != null && !(var3 instanceof Comparable)) {
         throw new ArgumentException("value does not support IComparable");
      } else {
         return l6(var0, var1, var2, var3, null);
      }
   }

   public static int n5(Object[] var0, int var1, int var2, Object var3, Comparator var4) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else if (n5((Object)var0) > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      } else if (var1 < n5(var0, 0)) {
         throw new ArgumentOutOfRangeException("index", "index is less than the lower bound of array.");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Value has to be >= 0.");
      } else if (var1 > n5(var0, 0) + k5(var0, 0) - var2) {
         throw new ArgumentException("index and length do not specify a valid range in array.");
      } else if (var0.length == 0) {
         return -1;
      } else if (var4 == null && var3 != null && !(var3 instanceof Comparable)) {
         throw new ArgumentException("comparer is null and value does not support IComparable.");
      } else {
         return l6(var0, var1, var2, var3, var4);
      }
   }

   static int l6(Object[] var0, int var1, int var2, Object var3, Comparator var4) {
      if (var4 == null) {
         var4 = Comparer.Default;
      }

      int var5 = var1;
      int var6 = var1 + var2 - 1;
      int var7 = 0;

      while (var5 <= var6) {
         int var8 = var5 + (var6 - var5) / 2;
         Object var9 = var0[var8];

         try {
            var7 = var4.compare(var9, var3);
         } catch (Exception var11) {
            throw new InvalidOperationException("value is not of the same type", var11);
         }

         if (var7 == 0) {
            return var8;
         }

         if (var7 > 0) {
            var6 = var8 - 1;
         } else {
            var5 = var8 + 1;
         }
      }

      return ~var5;
   }
}
