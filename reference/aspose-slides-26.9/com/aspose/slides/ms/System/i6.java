package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.OverflowException;

public class i6 extends Number implements Comparable<i6> {
   private static final long[] u3 = new long[37];
   private static final int[] a6 = new int[37];
   private static final int[] u9 = new int[37];
   private static boolean h0;
   private Long c8;
   public static i6 n5;
   public static i6 l6;
   public static i6 k5;

   public i6(Long var1) {
      this.c8 = var1;
   }

   public i6(long var1) {
      this.c8 = var1;
   }

   public i6(int var1) {
      this.c8 = new Long(var1);
   }

   public i6(String var1) {
      if (!var1.startsWith("0x") && !var1.startsWith("0X")) {
         this.c8 = n5(var1, 10);
      } else {
         var1 = var1.substring(2);
         if (var1.endsWith("L")) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         this.c8 = n5(var1, 16);
      }
   }

   @Override
   public byte byteValue() {
      return this.c8.byteValue();
   }

   @Override
   public short shortValue() {
      return this.c8.shortValue();
   }

   @Override
   public int intValue() {
      return this.c8.intValue();
   }

   @Override
   public long longValue() {
      return this.c8;
   }

   @Override
   public float floatValue() {
      return Float.parseFloat(this.toString());
   }

   @Override
   public double doubleValue() {
      return Double.parseDouble(this.toString());
   }

   public int n5(i6 var1) {
      return n5(this.c8, var1.c8);
   }

   private static int n5(long var0, long var2) {
      long var4 = var0 ^ Long.MIN_VALUE;
      long var6 = var2 ^ Long.MIN_VALUE;
      return var4 < var6 ? -1 : (var4 > var6 ? 1 : 0);
   }

   public boolean l6(i6 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : this.c8.equals(var1.c8);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(i6.class) ? false : this.l6((i6)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.c8.hashCode();
   }

   @Override
   public String toString() {
      return com.aspose.slides.internal.w4w.y4.n5(null, this, com.aspose.slides.internal.x7n.s7.s7());
   }

   private static boolean n5(long var0, int var2, int var3) {
      if (var0 >= 0L) {
         if (var0 < u3[var3]) {
            return false;
         } else {
            return var0 > u3[var3] ? true : var2 > a6[var3];
         }
      } else {
         return true;
      }
   }

   public static long n5(String var0, int var1) {
      if (var0.length() == 0) {
         throw new OverflowException("empty string");
      }

      int var2 = u9[var1] - 1;
      long var3 = 0L;

      for (int var5 = 0; var5 < var0.length(); var5++) {
         int var6 = n5(var0.charAt(var5), var1);
         if (var6 == -1) {
            throw new OverflowException(var0);
         }

         if (var5 > var2 && n5(var3, var6, var1)) {
            throw new OverflowException("Too large for unsigned long: " + var0);
         }

         var3 = var3 * var1 + var6;
      }

      return var3;
   }

   private static int n5(char var0, int var1) {
      switch (var1) {
         case 8:
            if (var0 >= '0' && var0 <= '7') {
               return var0 - 48;
            }
         case 10:
            if (var0 >= '0' && var0 <= '9') {
               return var0 - 48;
            }
         case 16:
            if (var0 >= '0' && var0 <= '9') {
               return var0 - 48;
            } else if (var0 >= 'A' && var0 <= 'F') {
               return var0 - 55;
            } else if (var0 >= 'a' && var0 <= 'f') {
               return var0 - 87;
            }
         default:
            return Character.digit(var0, var1);
      }
   }

   public static i6 k5(i6 var0) {
      if (h0 && s7(var0, a6(n5, k5))) {
         throw new ArithmeticException("Owerflow: op_Increment");
      }

      Long var1 = var0.c8;
      return new i6(Long.valueOf(var1 + 1L));
   }

   public static i6 n5(i6 var0, i6 var1) {
      return new i6(var0.c8 & var1.c8);
   }

   public static i6 l6(i6 var0, i6 var1) {
      return new i6(var0.c8 | var1.c8);
   }

   public static i6 k5(i6 var0, i6 var1) {
      return new i6(var0.c8 ^ var1.c8);
   }

   public static i6 u3(i6 var0, i6 var1) {
      i6 var2 = new i6(var0.c8 + var1.c8);
      if (!h0 || !s7(var0, l6) || !s7(var1, l6) || !x8(var2, var0) && !x8(var2, var1)) {
         return var2;
      } else {
         throw new ArithmeticException("Owerflow: op_Addition");
      }
   }

   public static i6 a6(i6 var0, i6 var1) {
      if (h0 && x8(var0, var1)) {
         throw new ArithmeticException("Underflow: op_Subtraction");
      } else {
         return new i6(var0.c8 - var1.c8);
      }
   }

   public static i6 u9(i6 var0, i6 var1) {
      if (n5(var0.c8, l6.c8) != 0 && n5(var1.c8, l6.c8) != 0) {
         long var2 = var0.c8 * var1.c8;
         i6 var4 = h0(new i6(var2), var1);
         if (h0 && t2(var0, var4)) {
            throw new ArithmeticException("Owerflow: op_Multiply");
         } else {
            return new i6(var2);
         }
      } else {
         return l6;
      }
   }

   public static i6 h0(i6 var0, i6 var1) {
      if (var1.l6(l6)) {
         throw new ArithmeticException("Division by zero");
      }

      long var2 = var0.c8;
      long var4 = var1.c8;
      if (var4 < 0L) {
         return n5(var2, var4) < 0 ? l6 : k5;
      }

      if (var2 >= 0L) {
         return new i6(var2 / var4);
      }

      long var6 = (var2 >>> 1) / var4 << 1;
      long var8 = var2 - var6 * var4;
      return new i6(var6 + (n5(var8, var4) >= 0 ? 1 : 0));
   }

   public static i6 c8(i6 var0, i6 var1) {
      if (var1.l6(l6)) {
         throw new ArithmeticException("Division by zero");
      }

      long var2 = var0.c8;
      long var4 = var1.c8;
      if (var4 < 0L) {
         return n5(var2, var4) < 0 ? new i6(var2) : new i6(var2 - var4);
      }

      if (var2 >= 0L) {
         return new i6(var2 % var4);
      }

      long var6 = (var2 >>> 1) / var4 << 1;
      long var8 = var2 - var6 * var4;
      return new i6(var8 - (n5(var8, var4) >= 0 ? var4 : 0L));
   }

   public static i6 n5(i6 var0, int var1) {
      return new i6(var0.c8 >>> var1);
   }

   public static i6 l6(i6 var0, int var1) {
      return new i6(var0.c8 << var1);
   }

   public static boolean t2(i6 var0, i6 var1) {
      return !var0.c8.equals(var1.c8);
   }

   public static boolean s7(i6 var0, i6 var1) {
      return n5(var0.c8, var1.c8) > 0;
   }

   public static boolean x8(i6 var0, i6 var1) {
      return n5(var0.c8, var1.c8) < 0;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(i6 bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   static {
      for (int var0 = 2; var0 <= 36; var0++) {
         u3[var0] = h0(new i6(-1L), new i6((long)var0)).c8;
         a6[var0] = (int)c8(new i6(-1L), new i6((long)var0)).c8.longValue();
         u9[var0] = Long.toString(Long.MAX_VALUE, var0).length();
      }

      h0 = false;
      n5 = new i6("18446744073709551615");
      l6 = new i6(0L);
      k5 = new i6(1L);
   }
}
