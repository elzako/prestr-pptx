package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OverflowException;
import java.math.BigDecimal;
import java.math.BigInteger;

@j3
public class s4 extends com.aspose.slides.internal.v6g.h0<s4> implements Comparable<s4> {
   public static s4 n5 = new s4(Long.MAX_VALUE);
   public static s4 l6 = new s4(Long.MIN_VALUE);
   public static s4 k5 = new s4(0L);
   private long u3;

   public s4() {
   }

   public s4(long var1) {
      this.u3 = var1;
   }

   public s4(int var1, int var2, int var3) {
      long[] var4 = new long[]{this.u3};
      n5(0, var1, var2, var3, 0, true, var4);
      this.u3 = var4[0];
   }

   public s4(int var1, int var2, int var3, int var4) {
      long[] var5 = new long[]{this.u3};
      n5(var1, var2, var3, var4, 0, true, var5);
      this.u3 = var5[0];
   }

   static boolean n5(int var0, int var1, int var2, int var3, int var4, boolean var5, long[] var6) {
      int var7 = var1 * 3600;
      int var8 = var2 * 60;
      long var9 = (var7 + var8 + var3) * 1000L + var4;
      var9 *= 10000L;
      var6[0] = 0L;
      boolean var11 = false;
      if (var0 > 0) {
         long var12 = 864000000000L * var0;
         if (var9 < 0L) {
            long var14 = var9;
            var9 += var12;
            var11 = var14 > var9;
         } else {
            var9 += var12;
            var11 = var9 < 0L;
         }
      } else if (var0 < 0) {
         long var17 = 864000000000L * var0;
         if (var9 <= 0L) {
            var9 += var17;
            var11 = var9 > 0L;
         } else {
            long var18 = var9;
            var9 += var17;
            var11 = var9 > var18;
         }
      }

      if (var11) {
         if (var5) {
            throw new ArgumentOutOfRangeException("The timespan is too big or too small.");
         } else {
            return false;
         }
      } else {
         var6[0] = var9;
         return true;
      }
   }

   public int n5() {
      return (int)(this.u3 / 864000000000L);
   }

   public int l6() {
      return (int)(this.u3 % 864000000000L / 36000000000L);
   }

   public int k5() {
      return (int)(this.u3 % 36000000000L / 600000000L);
   }

   public int u3() {
      return (int)(this.u3 % 600000000L / 10000000L);
   }

   public long a6() {
      return this.u3;
   }

   public double u9() {
      return this.u3 / 8.64E11;
   }

   public double h0() {
      return this.u3 / 10000.0;
   }

   public double c8() {
      return this.u3 / 6.0E8;
   }

   public double t2() {
      return this.u3 / 1.0E7;
   }

   public s4 n5(s4 var1) {
      BigInteger var2 = BigInteger.valueOf(var1.a6());
      var2 = var2.add(BigInteger.valueOf(this.u3));
      if (var2.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
         throw new OverflowException("Resulting timespan is too big.");
      } else {
         return new s4(var2.longValue());
      }
   }

   public static int n5(s4 var0, s4 var1) {
      if (var0.u3 < var1.u3) {
         return -1;
      } else {
         return var0.u3 > var1.u3 ? 1 : 0;
      }
   }

   public int l6(s4 var1) {
      return var1 == null ? 1 : n5(this.n3(), var1.n3());
   }

   public boolean k5(s4 var1) {
      return var1 == null ? false : var1.u3 == this.u3;
   }

   public s4 s7() {
      BigInteger var1 = BigInteger.valueOf(this.u3);
      var1 = var1.abs();
      if (var1.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && var1.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
         return new s4(var1.longValue());
      } else {
         throw new OverflowException("This TimeSpan value is MinValue so you cannot get the duration.");
      }
   }

   @Override
   public boolean equals(Object value) {
      return !(value instanceof s4) ? false : this.u3 == ((s4)value).u3;
   }

   public static boolean l6(s4 var0, s4 var1) {
      return var0.u3 == var1.u3;
   }

   public static s4 n5(double var0) {
      return n5(var0, 864000000000L);
   }

   public static s4 l6(double var0) {
      return n5(var0, 36000000000L);
   }

   public static s4 k5(double var0) {
      return n5(var0, 600000000L);
   }

   public static s4 u3(double var0) {
      return n5(var0, 10000000L);
   }

   public static s4 a6(double var0) {
      return n5(var0, 10000L);
   }

   private static s4 n5(double var0, long var2) {
      if (d2.k5(var0)) {
         throw new ArgumentException("Value cannot be NaN.", "value");
      }

      if (!d2.u3(var0) && !d2.a6(var0) && !(var0 < l6.a6()) && !(var0 > n5.a6())) {
         var0 *= var2 / 10000L;
         BigDecimal var4 = BigDecimal.valueOf(var0).setScale(0, 4);
         var4 = var4.multiply(BigDecimal.valueOf(10000L));
         if (var4.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) <= 0 && var4.compareTo(BigDecimal.valueOf(Long.MIN_VALUE)) >= 0) {
            return new s4(var4.longValue());
         } else {
            throw new OverflowException("Resulting timespan is too big.");
         }
      } else {
         throw new OverflowException("Outside range [MinValue,MaxValue]");
      }
   }

   public static s4 n5(long var0) {
      return new s4(var0);
   }

   @Override
   public int hashCode() {
      return p3.n5(this.u3);
   }

   public s4 x8() {
      if (this.u3 == l6.u3) {
         throw new OverflowException("This TimeSpan value is MinValue and cannot be negated.");
      } else {
         return new s4(-this.u3);
      }
   }

   public static s4 n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      }

      s4 var1 = new s4();
      s4$n5 var2 = new s4$n5(var0);
      s4[] var3 = new s4[]{var1};
      var2.n5(false, var3);
      var3[0].u3(var1);
      return var1;
   }

   public static boolean n5(String var0, s4[] var1) {
      if (var0 == null) {
         k5.u3(var1[0]);
         return false;
      } else {
         s4$n5 var2 = new s4$n5(var0);
         return var2.n5(true, var1);
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(14);
      if (this.u3 < 0L) {
         var1.n5('-');
      }

      if (this.n5() != 0) {
         var1.k5(Math.abs(this.n5()));
         var1.n5('.');
      }

      var1.n5(a3.n5(Math.abs(this.l6()), "D2"));
      var1.n5(':');
      var1.n5(a3.n5(Math.abs(this.k5()), "D2"));
      var1.n5(':');
      var1.n5(a3.n5(Math.abs(this.u3()), "D2"));
      int var2 = (int)Math.abs(this.u3 % 10000000L);
      if (var2 != 0) {
         var1.n5('.');
         var1.n5(a3.n5(var2, "D7"));
      }

      return var1.toString();
   }

   public static s4 k5(s4 var0, s4 var1) {
      return var0 != null && var1 != null ? var0.n5(var1.n3()) : null;
   }

   public static boolean u3(s4 var0, s4 var1) {
      return var0 != null && var1 != null ? var0.u3 > var1.u3 : false;
   }

   public static boolean a6(s4 var0, s4 var1) {
      return var0.u3 != var1.u3;
   }

   public static boolean u9(s4 var0, s4 var1) {
      return var0 != null && var1 != null ? var0.u3 < var1.u3 : false;
   }

   public void u3(s4 var1) {
      var1.u3 = this.u3;
   }

   public s4 n3() {
      s4 var1 = new s4();
      this.u3(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n3();
   }

   public static s4 l6(long var0) {
      return new s4(var0);
   }

   public static long a6(s4 var0) {
      return var0 == null ? 0L : var0.u3;
   }

   public static double u9(s4 var0) {
      return var0 == null ? 0.0 : var0.h0();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s4 Clone() {
      return this.n3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s4 bridgeArg0) {
      this.u3(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(s4 bridgeArg0) {
      return this.l6(bridgeArg0);
   }

}
