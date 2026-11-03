package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.Collections.Generic.EqualityComparer$DefaultComparer;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.RankException;
import com.aspose.slides.exceptions.TypeLoadException;
import java.lang.reflect.Array;
import java.util.Comparator;

@j3
public abstract class u3 implements ICollection, IEnumerable, IList, v4 {
   private u3() {
   }

   protected abstract Object n5();

   protected abstract u3$u3 l6();

   protected abstract com.aspose.slides.internal.w4w.n5 k5();

   protected abstract u3$n5 n5(int var1, int var2);

   public static u3 n5(Object var0) {
      return l6(var0, 1, false);
   }

   public static u3 n5(Object var0, int var1) {
      return l6(var0, var1, false);
   }

   public static u3 n5(Object var0, int var1, boolean var2) {
      return l6(var0, var1, var2);
   }

   private static u3$l6 l6(Object var0, int var1, boolean var2) {
      if (var0 == null) {
         return null;
      }

      if (var1 < 1) {
         throw new ArgumentException("Incorrect dimension of array", "rank");
      }

      switch (var1) {
         case 1:
            return new u3$h0(var0, var2, null);
         case 2:
         case 3:
         default:
            return new u3$a6(var0, var1, var2, null);
      }
   }

   public static Object n5(u3 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("array is null");
      } else {
         return var0.n5();
      }
   }

   public static <T> IGenericList<T> n5(T[] var0) {
      u3 var1 = n5((Object)var0);
      return var1 == null ? null : l6(var1);
   }

   public static <T> IGenericList<T> l6(u3 var0) {
      return new u3$k5<>(var0, null);
   }

   public static int n5(u3 var0, Object var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else if (var1 == null) {
         return -1;
      } else if (var0.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      } else if (var0.a6() == 0) {
         return -1;
      } else if (!(var1 instanceof Comparable)) {
         throw new InvalidOperationException("Failed to compare two elements in the array.");
      } else {
         return l6(var0, var0.l6(0), var0.a6(0), var1, null);
      }
   }

   public static int n5(u3 var0, Object var1, Comparator var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else if (var0.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      } else if (var0.a6() == 0) {
         return -1;
      } else if (var2 == null && var1 != null && !(var1 instanceof Comparable)) {
         throw new ArgumentException("comparer is null and value does not support IComparable.");
      } else {
         return l6(var0, var0.l6(0), var0.a6(0), var1, var2);
      }
   }

   public static int n5(u3 var0, int var1, int var2, Object var3, Comparator var4) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else if (var0.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      } else if (var1 < var0.l6(0)) {
         throw new ArgumentOutOfRangeException("index", "index is less than the lower bound of array.");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      } else if (var1 > var0.l6(0) + var0.a6(0) - var2) {
         throw new ArgumentException("index and length do not specify a valid range in array.");
      } else if (var0.a6() == 0) {
         return -1;
      } else if (var4 == null && var3 != null && !(var3 instanceof Comparable)) {
         throw new ArgumentException("comparer is null and value does not support IComparable.");
      } else {
         return l6(var0, var1, var2, var3, var4);
      }
   }

   static int l6(u3 var0, int var1, int var2, Object var3, Comparator var4) {
      if (var4 == null) {
         var4 = Comparer.Default;
      }

      int var5 = var1;
      int var6 = var1 + var2 - 1;
      int var7 = 0;

      while (var5 <= var6) {
         int var8 = var5 + (var6 - var5) / 2;
         Object var9 = var0.n5(var8);

         try {
            var7 = var4.compare(var9, var3);
         } catch (Exception var11) {
            throw new ArgumentException("value is not of the same type", var11);
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

   public static <T> int n5(T[] var0, T var1, Comparator<T> var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else {
         return n5(var0, 0, n5((Object)var0).a6(), var1, var2);
      }
   }

   public static <T> int n5(T[] var0, int var1, int var2, T var3, Comparator<T> var4) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("index", "Non-negative number required.");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 > n5((Object)var0).a6() - var2) {
         throw new ArgumentException(
            "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
         );
      }

      if (var4 == null) {
         var4 = com.aspose.slides.Collections.Generic.Comparer.getDefault();
      }

      int var5 = var1;
      int var6 = var1 + var2 - 1;
      int var7 = 0;

      try {
         while (var5 <= var6) {
            int var8 = var5 + (var6 - var5) / 2;
            var7 = var4.compare(var3, var0[var8]);
            if (var7 == 0) {
               return var8;
            }

            if (var7 < 0) {
               var6 = var8 - 1;
            } else {
               var5 = var8 + 1;
            }
         }
      } catch (com.aspose.slides.exceptions.Exception var9) {
         throw new InvalidOperationException("Comparer threw an exception.", var9);
      }

      return ~var5;
   }

   public static void n5(u3 var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      int var3 = var0.l6(0);
      if (var1 < var3) {
         throw new IndexOutOfRangeException("index < lower bound");
      }

      var1 -= var3;
      if (var1 > var0.a6() - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      u3$n5 var4 = var0.n5(var1, var2);
      Class var5 = u3$u3.n5(var0.l6());

      while (var4.hasNext()) {
         var4.n5(com.aspose.slides.internal.v6g.k5.k5(var5));
      }
   }

   public static void n5(byte[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = 0;
      }
   }

   public static void n5(short[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = 0;
      }
   }

   public static void n5(char[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = 0;
      }
   }

   public static void n5(int[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = 0;
      }
   }

   public static void n5(long[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = 0L;
      }
   }

   public static <T> void n5(T[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new IndexOutOfRangeException("Non-negative number required.");
      }

      if (var1 > var0.length - var2) {
         throw new IndexOutOfRangeException("index + length > size");
      }

      for (int var3 = var1; var3 < var1 + var2; var3++) {
         var0[var3] = null;
      }
   }

   @Override
   public Object deepClone() {
      if (this.u3() > 1) {
         throw new NotImplementedException();
      }

      u3$u3 var1 = this.l6();
      u3 var2 = n5(com.aspose.slides.internal.v6g.k5.n5(u3$u3.n5(var1)), (int)u3$u3.k5(var1));
      this.copyTo(var2, 0);
      return var2;
   }

   public static void n5(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var5, d1.n5);
      }

      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(char[] var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var5, d1.n5);
      }

      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(int[] var0, int var1, int[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var5, d1.n5);
      }

      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(float[] var0, int var1, float[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var5, d1.n5);
      }

      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static void n5(long[] var0, int var1, long[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var5, d1.n5);
      }

      System.arraycopy(var0, var1, var2, var3, var4);
   }

   public static <T> void n5(T[] var0, int var1, T[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.length - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.length - var4) {
         String var5 = d1.n5("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds");
         throw new ArgumentException(var5, d1.n5);
      }

      try {
         System.arraycopy(var0, var1, var2, var3, var4);
      } catch (ArrayStoreException var6) {
         throw new InvalidCastException(var6.getMessage());
      }
   }

   public static void n5(byte[] var0, byte[] var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, 0, var1, 0, var2);
   }

   public static void n5(int[] var0, int[] var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, 0, var1, 0, var2);
   }

   public static void n5(float[] var0, float[] var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, 0, var1, 0, var2);
   }

   public static void n5(long[] var0, long[] var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, 0, var1, 0, var2);
   }

   public static <T> void n5(T[] var0, T[] var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, 0, var1, 0, var2);
   }

   public static void n5(u3 var0, u3 var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var1 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      n5(var0, var0.l6(0), var1, var1.l6(0), var2);
   }

   public static void n5(u3 var0, int var1, u3 var2, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("sourceArray");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationArray");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
      }

      if (var1 > var0.a6() - var4) {
         throw new ArgumentException("length");
      }

      if (var3 > var2.a6() - var4) {
         String var10 = d1.n5(new String[]{"Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"});
         throw new ArgumentException(var10, d1.n5);
      }

      if (var0.u3() != var2.u3()) {
         throw new RankException("Arrays must be of same size.");
      }

      Class var5 = u3$u3.n5(var0.l6());
      Class var6 = u3$u3.n5(var2.l6());
      boolean var7 = com.aspose.slides.internal.v6g.h0.class.isAssignableFrom(var5);
      if (var7 || var0.u3() != 1 || !l6(var0, var1, var2, var3, var4)) {
         if (j8.l6(n5(var0), n5(var2)) && n5(var1, var3, var4)) {
            y8 var8 = com.aspose.slides.internal.v6g.k5.n5(var5);
            u3 var9 = n5(var8, var4);
            n5(var0, var1, var9, 0, var4, var7);
            n5(var9, 0, var2, var3, var4, false);
         } else {
            n5(var0, var1, var2, var3, var4, var7);
         }
      }
   }

   private static boolean n5(int var0, int var1, int var2) {
      return var0 < var1 && var0 + var2 > var1 || var1 < var0 && var1 + var2 > var0;
   }

   private static void n5(u3 var0, int var1, u3 var2, int var3, int var4, boolean var5) {
      try {
         if (!var5) {
            for (int var6 = 0; var6 < var4; var6++) {
               Object var13 = var0.n5(var1 + var6);
               var2.l6(var13, var3 + var6);
            }
         } else {
            for (int var12 = 0; var12 < var4; var12++) {
               Object var14 = ((com.aspose.slides.internal.v6g.h0)var0.n5(var1 + var12)).Clone();
               var2.l6(var14, var3 + var12);
            }
         }
      } catch (Exception var11) {
         Class var7 = u3$u3.n5(var0.l6());
         Class var8 = u3$u3.n5(var2.l6());
         if (var7.equals(Object.class)) {
            throw new InvalidCastException();
         }

         y8 var9 = com.aspose.slides.internal.v6g.k5.n5(var7);
         y8 var10 = com.aspose.slides.internal.v6g.k5.n5(var8);
         throw new ArrayTypeMismatchException(
            d1.n5("sourceArray and destinationArray are of incompatible types (Types: source={0};  target={1})",new Object[]{ var9.q0(), var10.q0()})
         );
      }
   }

   public static void n5(u3 var0, u3 var1, long var2) {
      if (var2 >= 0L && var2 <= 2147483647L) {
         n5(var0, var1, (int)var2);
      } else {
         throw new ArgumentOutOfRangeException("length", "Value must be >= 0 and <= Int32.MaxValue.");
      }
   }

   private static boolean l6(u3 var0, int var1, u3 var2, int var3, int var4) {
      if (com.aspose.slides.internal.t9p.n5.k5(u3$u3.n5(var0.l6()), u3$u3.n5(var2.l6()))) {
         System.arraycopy(n5(var0), var1, n5(var2), var3, var4);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (this.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      if (index + this.a6(0) > array.l6(0) + array.a6(0)) {
         throw new ArgumentException(d1.n5(new String[]{"Destination array was not long ", "enough. Check destIndex and length, and the array's ", "lower bounds."}));
      }

      if (array.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index", "Non-negative number required.");
      }

      n5(this, this.l6(0), array, index, this.a6(0));
   }

   public static int l6(u3 var0, Object var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else {
         return n5(var0, var1, 0, var0.a6());
      }
   }

   public static int n5(u3 var0, Object var1, int var2, int var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var0.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      if (var3 >= 0 && var2 >= var0.l6(0) && var2 - 1 <= var0.u3(0) - var3) {
         int var4 = var2 + var3;

         for (int var5 = var2; var5 < var4; var5++) {
            if (j8.n5(var0.n5(var5), var1)) {
               return var5;
            }
         }

         return var0.l6(0) - 1;
      } else {
         throw new ArgumentOutOfRangeException(
            var3 < 0 ? "count" : "startIndex",
            var3 < 0
               ? "Count must be positive and count must refer to a location within the string/array/collection."
               : "Index was out of range. Must be non-negative and less than the size of the collection."
         );
      }
   }

   public static <T> int n5(T[] var0, T var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      } else {
         return n5(var0, var1, 0, var0.length);
      }
   }

   public static <T> int n5(T[] var0, T var1, int var2, int var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var3 >= 0 && var2 >= 0 && var2 <= var0.length - var3) {
         int var4 = var2 + var3;
         EqualityComparer$DefaultComparer var5 = new EqualityComparer$DefaultComparer();

         for (int var6 = var2; var6 < var4; var6++) {
            if (var5.equalsT(var0[var6], var1)) {
               return var6;
            }
         }

         return -1;
      } else {
         throw new ArgumentOutOfRangeException(
            var3 < 0 ? "count" : "startIndex",
            var3 < 0
               ? "Count must be positive and count must refer to a location within the string/array/collection."
               : "Index was out of range. Must be non-negative and less than the size of the collection."
         );
      }
   }

   static u3$t2 k5(u3 var0) {
      Object var1 = n5(var0);
      return var1 instanceof Object[] ? new a6(var0) : new u9(var0);
   }

   private void l6(int var1, int var2) {
      Object var3 = n5(this);
      Object[] var4 = var3 instanceof Object[] ? (Object[])var3 : null;
      Object var5 = var4[var1];
      var4[var1] = var4[var2];
      var4[var2] = var5;
   }

   private void k5(int var1, int var2) {
      Object var3 = this.n5(var1);
      this.l6(this.k5(var2), var1);
      this.l6(var3, var2);
   }

   public static void u3(u3 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      l6(var0, var0.l6(0), var0.a6(0));
   }

   public static void l6(u3 var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var0.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      if (var1 >= var0.l6(0) && var2 >= 0) {
         if (var1 > var0.u3(0) + 1 - var2) {
            throw new ArgumentException(
               "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
            );
         }

         int var3 = var1 + var2 - 1;
         Object var4 = n5(var0);
         Object[] var5 = var4 instanceof Object[] ? (Object[])var4 : null;
         if (var5 != null) {
            while (var1 < var3) {
               Object var7 = var5[var1];
               var5[var1] = var5[var3];
               var5[var3] = var7;
               var1++;
               var3--;
            }
         } else {
            u3$t2 var6 = k5(var0);

            while (var1 < var3) {
               var6.n5(var1, var3);
               var1++;
               var3--;
            }
         }
      } else {
         throw new ArgumentOutOfRangeException(var1 < 0 ? "index" : "length", "Non-negative number required.");
      }
   }

   private void h0() {
      Class var1 = u3$u3.n5(this.l6());
      if (!var1.isPrimitive()) {
         u3$n5 var2 = this.n5(0, this.a6());
         Object var3 = com.aspose.slides.internal.v6g.k5.k5(var1);
         if (var3 != null) {
            if (com.aspose.slides.internal.t9p.n5.l6(var1) != null) {
               while (var2.hasNext()) {
                  var2.n5(var3);
               }
            } else {
               if (var2.hasNext()) {
                  var2.n5(var3);
               }

               while (var2.hasNext()) {
                  var2.n5(com.aspose.slides.internal.v6g.k5.k5(var1));
               }
            }
         }
      }
   }

   @Override
   public boolean isFixedSize() {
      return true;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public Object get_Item(int index) {
      if (index < this.a6() && index >= 0) {
         if (this.u3() > 1) {
            throw new ArgumentException("Only single dimension arrays are supported.");
         } else {
            return this.n5(index);
         }
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public void set_Item(int index, Object value) {
      if (index < this.a6() && index >= 0) {
         if (this.u3() > 1) {
            throw new ArgumentException("Only single dimension arrays are supported.");
         }

         this.l6(value, index);
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public int addItem(Object value) {
      throw new NotSupportedException("Collection was of a fixed size.");
   }

   @Override
   public void removeItem(Object value) {
      throw new NotSupportedException("Collection was of a fixed size.");
   }

   @Override
   public void insertItem(int index, Object value) {
      throw new NotSupportedException("Collection was of a fixed size.");
   }

   @Override
   public void removeAt(int index) {
      throw new NotSupportedException("Collection was of a fixed size.");
   }

   @Override
   public void clear() {
      n5(this, this.l6(0), this.a6());
   }

   @Override
   public boolean contains(Object value) {
      if (this.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      int var2 = this.a6();

      for (int var3 = 0; var3 < var2; var3++) {
         if (j8.n5(this.n5(var3), value)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int indexOf(Object value) {
      if (this.u3() > 1) {
         throw new RankException("Only single dimension arrays are supported.");
      }

      int var2 = this.a6();

      for (int var3 = 0; var3 < var2; var3++) {
         if (j8.n5(this.n5(var3), value)) {
            return var3 + this.l6(0);
         }
      }

      return this.l6(0) - 1;
   }

   @Override
   public int size() {
      return this.a6();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5();
   }

   @Override
   public IEnumerator iterator() {
      return this.n5(0, this.a6());
   }

   public static <T> boolean n5(T[] var0, g7<T> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      } else {
         return l6(var0, var1) != -1;
      }
   }

   public static <T> boolean n5(u3 var0, g7<T> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      } else {
         return l6(var0, var1) != -1;
      }
   }

   public static <T> T[] n5(Class<T> var0, u3 var1, g7<T> var2) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 == null) {
         throw new ArgumentNullException("match");
      }

      List var3 = new List();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         Object var5 = var1.get_Item(var4);
         if (var2.invoke((T)var5)) {
            var3.addItem(var5);
         }
      }

      Object[] var6 = (Object[])com.aspose.slides.internal.v6g.k5.n5(var0, new int[]{var3.size()});

      for (int var7 = 0; var7 < var3.size(); var7++) {
         var6[var7] = var3.get_Item(var7);
      }

      return (T[])var6;
   }

   public static <T> T n5(Class<T> var0, T[] var1, g7<T> var2) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 == null) {
         throw new ArgumentNullException("match");
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var2.invoke(var1[var3])) {
            return (T)var1[var3];
         }
      }

      return (T)com.aspose.slides.internal.v6g.k5.k5(var0);
   }

   public static <T> int l6(T[] var0, g7<T> var1) {
      return n5(var0, 0, var0.length, var1);
   }

   public static <T> int n5(T[] var0, int var1, int var2, g7<T> var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 >= 0 && var1 <= var0.length) {
         if (var2 >= 0 && var1 <= var0.length - var2) {
            if (var3 == null) {
               throw new ArgumentNullException("match");
            }

            int var4 = var1 + var2;

            for (int var5 = var1; var5 < var4; var5++) {
               if (var3.invoke(var0[var5])) {
                  return var5;
               }
            }

            return -1;
         } else {
            throw new ArgumentOutOfRangeException("count", "index and count exceed length of list");
         }
      } else {
         throw new ArgumentOutOfRangeException("startIndex");
      }
   }

   public static <T> int l6(u3 var0, g7<T> var1) {
      return n5(var0, 0, var0.size(), var1);
   }

   public static <T> int n5(u3 var0, int var1, int var2, g7<T> var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 >= 0 && var1 <= var0.size()) {
         if (var2 >= 0 && var1 <= var0.size() - var2) {
            if (var3 == null) {
               throw new ArgumentNullException("match");
            }

            int var4 = var1 + var2;

            for (int var5 = var1; var5 < var4; var5++) {
               if (var3.invoke((T)var0.get_Item(var5))) {
                  return var5;
               }
            }

            return -1;
         } else {
            throw new ArgumentOutOfRangeException("count", "index and count exceed length of list");
         }
      } else {
         throw new ArgumentOutOfRangeException("startIndex");
      }
   }

   public static <T> void n5(T[] var0, n5<T> var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 == null) {
         throw new ArgumentNullException("action");
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.invoke(var0[var2]);
      }
   }

   public static <T> boolean k5(T[] var0, g7<T> var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 == null) {
         throw new ArgumentNullException("match");
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (!var1.invoke(var0[var2])) {
            return false;
         }
      }

      return true;
   }

   public static <T> boolean k5(u3 var0, g7<T> var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 == null) {
         throw new ArgumentNullException("match");
      }

      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (!var1.invoke((T)var0.get_Item(var2))) {
            return false;
         }
      }

      return true;
   }

   private static void l6(com.aspose.slides.internal.w4w.n5 var0, Object var1, int var2, Object var3) {
      try {
         var0.n5(var1, var2, var3);
      } catch (ArrayIndexOutOfBoundsException var5) {
         throw new ArgumentOutOfRangeException("index is outside the range of valid indexes for the current Array", var5);
      } catch (ArrayStoreException var6) {
         throw new InvalidCastException(var6.getMessage());
      }
   }

   private static Object l6(com.aspose.slides.internal.w4w.n5 var0, Object var1, int var2) {
      try {
         return var0.n5(var1, var2);
      } catch (ArrayIndexOutOfBoundsException var4) {
         throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array", var4);
      }
   }

   protected Object n5(int var1) {
      return l6(this.k5(), this.n5(), var1);
   }

   protected void l6(Object var1, int var2) {
      throw new InvalidOperationException("Array was not a one-dimensional array.");
   }

   protected Object n5(int... var1) {
      Object var2 = this.n5();
      int var3 = var1.length - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         var2 = l6(com.aspose.slides.internal.w4w.n5.n5(), var2, var1[var4]);
      }

      return l6(this.k5(), var2, var1[var3]);
   }

   protected void n5(Object var1, int... var2) {
      Class var3 = u3$u3.n5(this.l6());
      if (var1 == null && var3.isPrimitive()) {
         var1 = com.aspose.slides.internal.v6g.k5.k5(var3);
      }

      if (var1 == null
         || com.aspose.slides.internal.t9p.n5.n5(var1.getClass(), var3)
         || !var3.isPrimitive() && com.aspose.slides.internal.t9p.n5.l6(var3) == null) {
         Object var4 = this.n5();
         int var5 = var2.length - 1;

         for (int var6 = 0; var6 < var5; var6++) {
            var4 = l6(com.aspose.slides.internal.w4w.n5.n5(), var4, var2[var6]);
         }

         try {
            l6(this.k5(), var4, var2[var5], var1);
         } catch (ArgumentOutOfRangeException var7) {
            throw var7;
         } catch (Exception var8) {
            throw new InvalidCastException("Cannot save value in this array");
         }
      } else {
         throw new ArgumentException(
            "Cannot widen from source type to target type either because the source type is a not a primitive type or the conversion cannot be accomplished"
         );
      }
   }

   public void l6(Object var1, int... var2) {
      if (var2 == null) {
         throw new ArgumentNullException("indices");
      }

      if (this.u3() != var2.length) {
         throw new ArgumentException("The number of dimensions in the current Array is not equal to the number of elements in indices");
      }

      this.n5(var1, var2);
   }

   public int u3() {
      return u3$u3.l6(this.l6());
   }

   public int l6(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfRangeException("dimension is less than zero");
      } else if (var1 >= this.u3()) {
         throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
      } else {
         return 0;
      }
   }

   public static u3 n5(y8 var0, int var1) {
      int[] var2 = new int[]{var1};
      return n5(var0, var2);
   }

   public static u3 n5(y8 var0, int... var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementType");
      } else if (var1 == null) {
         throw new ArgumentNullException("lengths");
      } else if (var1.length > 32) {
         throw new TypeLoadException("Array has too many dimensions.");
      } else {
         Object var2 = null;
         if (var0.k5(com.aspose.slides.internal.v6g.k5.n5(void.class))) {
            throw new NotSupportedException("Array type can not be void");
         } else {
            return n5(var0, var1, (int[])var2);
         }
      }
   }

   private static u3 n5(y8 var0, int[] var1, int[] var2) {
      if (var2 != null) {
         throw new NotImplementedException("Not implemented yet");
      }

      if (var1 == null) {
         throw new ArgumentNullException("lengths");
      }

      if (var1.length < 1) {
         throw new ArgumentException("Arrays must contain >= 1 elements.");
      }

      if (var1.length > 32) {
         throw new TypeLoadException("Array has too many dimensions.");
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3] < 0) {
            throw new ArgumentOutOfRangeException("lengths[" + var3 + ']', "Non-negative number required.");
         }
      }

      int var8 = 0;
      Class var4 = var0.z1();

      for (Class var5 = var4.getComponentType(); var5 != null; var5 = var5.getComponentType()) {
         var8++;
      }

      Object var6 = null;
      if (var1.length > 1) {
         var6 = Array.newInstance(var4, var1);
      } else {
         var6 = Array.newInstance(var4, var1[0]);
      }

      u3 var7 = n5(var6, var1.length, var8 > 0);
      var7.h0();
      return var7;
   }

   public static <T> void n5(T[][] var0, int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("Non-negative number required.");
      }

      if (var0[0] == null) {
         u3 var7 = n5(com.aspose.slides.internal.v6g.k5.n5(var0.getClass().getComponentType().getComponentType()), var1);
         var0[0] = (T[])n5(var7);
      } else {
         int var2 = var0[0].length;
         if (var2 != var1) {
            int var3 = 0;
            Class var4 = var0[0].getClass();

            for (Class var5 = var4.getComponentType(); var5 != null; var5 = var5.getComponentType()) {
               var3++;
            }

            u3 var6 = n5(com.aspose.slides.internal.v6g.k5.n5(var4.getComponentType()), var1);
            if (var2 != 0) {
               l6(n5(var0[0], 1, var3 > 0), 0, var6, 0, q1.l6(var1, var2));
            }

            var0[0] = (T[])n5(var6);
         }
      }
   }

   public int a6() {
      return (int)u3$u3.k5(this.l6());
   }

   public long u9() {
      return u3$u3.k5(this.l6());
   }

   public Object k5(int var1) {
      if (this.u3() != 1) {
         throw new ArgumentException("Array was not a one-dimensional array.");
      } else if (var1 >= this.l6(0) && var1 <= this.u3(0)) {
         return this.n5(var1);
      } else {
         throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array");
      }
   }

   public void k5(Object var1, int var2) {
      if (this.u3() != 1) {
         throw new ArgumentException("Array was not a one-dimensional array.");
      }

      if (var2 >= this.l6(0) && var2 <= this.u3(0)) {
         this.l6(var1, var2 - this.l6(0));
      } else {
         throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array");
      }
   }

   public int u3(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfRangeException("dimension is less than zero");
      } else if (var1 >= this.u3()) {
         throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
      } else {
         return u3$u3.u3(this.l6())[var1];
      }
   }

   public int a6(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfRangeException("dimension is less than zero");
      } else if (var1 >= this.u3()) {
         throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
      } else {
         return u3$u3.u3(this.l6())[var1] + 1;
      }
   }

   public static void a6(u3 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      n5(var0, null, var0.l6(0), var0.a6(), null);
   }

   public static <T> void n5(T[] var0, Comparator<T> var1) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      n5(var0, 0, var0.length, var1);
   }

   public static void n5(u3 var0, u3 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("keys");
      }

      n5(var0, var1, var0.l6(0), var0.a6(), null);
   }

   public static <T> void l6(T[] var0, int var1, int var2) {
      n5(var0, var1, var2, (Comparator<Object>)null);
   }

   public static void n5(u3 var0, u3 var1, Comparator var2) {
      if (var0 == null) {
         throw new ArgumentNullException("keys");
      }

      n5(var0, var1, var0.l6(0), var0.a6(), var2);
   }

   public static <T> void n5(T[] var0, int var1, int var2, Comparator<T> var3) {
      if (var0 == null) {
         throw new ArgumentNullException("array");
      }

      if (var1 >= 0 && var2 >= 0) {
         if (var0.length - var1 < var2) {
            throw new ArgumentException(
               "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
            );
         }

         if (var2 > 1) {
            if (var3 != null && var3 != com.aspose.slides.Collections.Generic.Comparer.getDefault()) {
               n5(var0, null, var1, var2, var3);
            } else {
               n5(var0, null, var1, var2, com.aspose.slides.Collections.Generic.Comparer.getDefault());
            }
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "length" : "index", "Non-negative number required");
      }
   }

   public static <TKey, TValue> void n5(TKey[] var0, TValue[] var1, int var2, int var3, Comparator<TKey> var4) {
      if (var0 == null) {
         throw new ArgumentNullException("keys");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var0.length - var2 >= var3 && (var1 == null || var2 <= var1.length - var3)) {
            if (var4 == null) {
               var4 = com.aspose.slides.Collections.Generic.Comparer.getDefault();
            }

            if (var3 > 1) {
               if (var4 != null && var4 != com.aspose.slides.Collections.Generic.Comparer.getDefault()) {
                  l6(var0, var1, var2, var2 + var3 - 1, var4);
               } else {
                  l6(var0, var1, var2, var2 + var3 - 1, com.aspose.slides.Collections.Generic.Comparer.getDefault());
               }
            }
         } else {
            throw new ArgumentException(
               "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
            );
         }
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "length" : "index", "Non-negative number required");
      }
   }

   private static <TKey, TValue> void l6(TKey[] var0, TValue[] var1, int var2, int var3, Comparator<TKey> var4) {
      int var5 = var2;
      int var6 = var3;
      int var7 = (var5 + var6) / 2;
      TKey var8 = var0[var7];

      while (true) {
         while (var4.compare(var0[var5], var8) >= 0) {
            while (var4.compare(var0[var6], var8) > 0) {
               var6--;
            }

            if (var5 <= var6) {
               TKey var9 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var9;
               if (var1 != null) {
                  TValue var10 = var1[var5];
                  var1[var5] = var1[var6];
                  var1[var6] = var10;
               }

               var5++;
               var6--;
            }

            if (var5 >= var6) {
               if (var2 < var6) {
                  l6(var0, var1, var2, var6, var4);
               }

               if (var5 < var3) {
                  l6(var0, var1, var5, var3, var4);
               }

               return;
            }
         }

         var5++;
      }
   }

   public static void n5(u3 var0, u3 var1, int var2, int var3, Comparator var4) {
      if (var0 == null) {
         throw new ArgumentNullException("keys");
      }

      if (var0.u3() == 1 && (var1 == null || var1.u3() == 1)) {
         if (var1 != null && var0.l6(0) != var1.l6(0)) {
            throw new ArgumentException("Lower bounds must match");
         }

         if (var2 >= var0.l6(0) && var3 >= 0) {
            if (var0.a6() - (var2 - var0.l6(0)) >= var3 && (var1 == null || var2 - var1.l6(0) <= var1.a6() - var3)) {
               if (var3 > 1) {
                  Object var5 = n5(var0);
                  Object var6 = var1 != null ? n5(var1) : null;
                  Object[] var7 = var5 instanceof Object[] ? (Object[])var5 : null;
                  Object[] var8 = null;
                  if (var7 != null) {
                     var8 = var6 instanceof Object[] ? (Object[])var6 : null;
                  }

                  if (var4 == null) {
                     var4 = com.aspose.slides.Collections.Generic.Comparer.getDefault();
                  }

                  if (var7 == null || var1 != null && var8 == null) {
                     l6(var0, var1, var4, var2, var2 + var3 - 1);
                  } else {
                     l6(var7, var8, var4, var2, var2 + var3 - 1);
                  }
               }
            } else {
               throw new ArgumentException(
                  "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
               );
            }
         } else {
            throw new ArgumentOutOfRangeException(var3 < 0 ? "length" : "index", "Non-negative number required");
         }
      } else {
         throw new RankException("Only single dimension arrays are supported");
      }
   }

   private static int u3(int var0, int var1) {
      return var0 + (var1 - var0 >> 1);
   }

   private static void n5(Object[] var0, Object[] var1, Comparator var2, int var3, int var4) {
      if (var3 != var4) {
         try {
            if (var2.compare(var0[var3], var0[var4]) > 0) {
               Object var5 = var0[var3];
               var0[var3] = var0[var4];
               var0[var4] = var5;
               if (var1 != null) {
                  Object var6 = var1[var3];
                  var1[var3] = var1[var4];
                  var1[var4] = var6;
               }
            }
         } catch (IndexOutOfRangeException var7) {
            throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", var7);
         } catch (com.aspose.slides.exceptions.Exception var8) {
            throw new InvalidOperationException("Unexpected exception during the sorting operation", var8);
         }
      }
   }

   private static void n5(u3 var0, u3 var1, Comparator var2, int var3, int var4) {
      if (var3 != var4) {
         try {
            if (var2.compare(var0.k5(var3), var0.k5(var4)) > 0) {
               Object var5 = var0.k5(var3);
               var0.k5(var0.k5(var4), var3);
               var0.k5(var5, var4);
               if (var1 != null) {
                  Object var6 = var1.k5(var3);
                  var1.k5(var1.k5(var4), var3);
                  var1.k5(var6, var4);
               }
            }
         } catch (IndexOutOfRangeException var7) {
            throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", var7);
         } catch (com.aspose.slides.exceptions.Exception var8) {
            throw new InvalidOperationException("Unexpected exception during the sorting operation", var8);
         }
      }
   }

   private static void l6(Object[] var0, Object[] var1, Comparator var2, int var3, int var4) {
      do {
         int var5 = var3;
         int var6 = var4;
         int var7 = u3(var5, var6);
         n5(var0, var1, var2, var5, var7);
         n5(var0, var1, var2, var5, var6);
         n5(var0, var1, var2, var7, var6);
         Object var8 = var0[var7];

         do {
            try {
               while (var2.compare(var0[var5], var8) < 0) {
                  var5++;
               }

               while (var2.compare(var8, var0[var6]) < 0) {
                  var6--;
               }
            } catch (IndexOutOfRangeException var11) {
               throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", var11);
            } catch (com.aspose.slides.exceptions.Exception var12) {
               throw new InvalidOperationException("Unexpected exception during the sorting operation", var12);
            }

            if (var5 > var6) {
               break;
            }

            if (var5 < var6) {
               Object var9 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var9;
               if (var1 != null) {
                  Object var10 = var1[var5];
                  var1[var5] = var1[var6];
                  var1[var6] = var10;
               }
            }

            var5++;
         } while (var5 <= --var6);

         if (var6 - var3 <= var4 - var5) {
            if (var3 < var6) {
               l6(var0, var1, var2, var3, var6);
            }

            var3 = var5;
         } else {
            if (var5 < var4) {
               l6(var0, var1, var2, var5, var4);
            }

            var4 = var6;
         }
      } while (var3 < var4);
   }

   private static <T> void l6(u3 var0, u3 var1, Comparator var2, int var3, int var4) {
      do {
         int var5 = var3;
         int var6 = var4;
         int var7 = u3(var5, var6);
         n5(var0, var1, var2, var5, var7);
         n5(var0, var1, var2, var5, var6);
         n5(var0, var1, var2, var7, var6);
         Object var8 = var0.k5(var7);

         do {
            try {
               while (var2.compare(var0.k5(var5), var8) < 0) {
                  var5++;
               }

               while (var2.compare(var8, var0.k5(var6)) < 0) {
                  var6--;
               }
            } catch (IndexOutOfRangeException var11) {
               throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", var11);
            } catch (com.aspose.slides.exceptions.Exception var12) {
               throw new InvalidOperationException("Unexpected exception during the sorting operation", var12);
            }

            if (var5 > var6) {
               break;
            }

            if (var5 < var6) {
               Object var9 = var0.k5(var5);
               var0.k5(var0.k5(var6), var5);
               var0.k5(var9, var6);
               if (var1 != null) {
                  Object var10 = var1.k5(var5);
                  var1.k5(var1.k5(var6), var5);
                  var1.k5(var10, var6);
               }
            }

            if (var5 != Integer.MAX_VALUE) {
               var5++;
            }

            if (var6 != Integer.MIN_VALUE) {
               var6--;
            }
         } while (var5 <= var6);

         if (var6 - var3 <= var4 - var5) {
            if (var3 < var6) {
               l6(var0, var1, var2, var3, var6);
            }

            var3 = var5;
         } else {
            if (var5 < var4) {
               l6(var0, var1, var2, var5, var4);
            }

            var4 = var6;
         }
      } while (var3 < var4);
   }

   @Override
   public int hashCode() {
      return this.n5().hashCode();
   }

   protected final boolean u9(u3 var1) {
      return j8.n5(this.n5(), var1.n5());
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else if (j8.n5(obj) != j8.n5(this)) {
         return false;
      } else {
         return obj instanceof u3 ? this.u9((u3)obj) : this.u9(n5(obj));
      }
   }

   // $VF: synthetic method
   static Object n5(com.aspose.slides.internal.w4w.n5 var0, Object var1, int var2) {
      return l6(var0, var1, var2);
   }

   // $VF: synthetic method
   u3(a6 var1) {
      this();
   }

   // $VF: synthetic method
   static void n5(com.aspose.slides.internal.w4w.n5 var0, Object var1, int var2, Object var3) {
      l6(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   static void k5(u3 var0, int var1, int var2) {
      var0.l6(var1, var2);
   }

   // $VF: synthetic method
   static void u3(u3 var0, int var1, int var2) {
      var0.k5(var1, var2);
   }
}
