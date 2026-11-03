package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.DivideByZeroException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.OverflowException;
import java.math.BigDecimal;
import java.math.BigInteger;

@j3
public class c4 extends com.aspose.slides.internal.v6g.h0<c4> implements u6, v0, Comparable<c4> {
   public static final c4 n5 = new c4("-79228162514264337593543950335");
   public static final c4 l6 = new c4("79228162514264337593543950335");
   public static final c4 k5 = n5(-1);
   public static final c4 u3 = n5(1);
   public static final c4 a6 = n5(0);
   private static c4 u9 = u9(l6, n5(10));
   private BigDecimal h0;

   public c4() {
      this.h0 = BigDecimal.ZERO;
   }

   public c4(BigDecimal var1) {
      if (var1.compareTo(l6.h0) <= 0 && var1.compareTo(n5.h0) >= 0) {
         this.h0 = var1;
      } else {
         throw new OverflowException();
      }
   }

   public c4(String var1) {
      this.h0 = new BigDecimal(var1);
   }

   public static c4 n5(int var0) {
      BigDecimal var1 = new BigDecimal(var0);
      if (var1.scale() > 10) {
         var1 = var1.setScale(10, 4);
      }

      return new c4(var1);
   }

   public static c4 n5(long var0) {
      long var2 = var0 & -1L;
      BigDecimal var4 = new BigDecimal(var2);
      if (var4.scale() > 10) {
         var4 = var4.setScale(10, 4);
      }

      return new c4(var4);
   }

   public static c4 l6(long var0) {
      BigDecimal var2 = new BigDecimal(var0);
      if (var2.scale() > 19) {
         var2 = var2.setScale(19, 4);
      }

      return new c4(var2);
   }

   public static c4 k5(long var0) {
      long var2 = var0 & -1L;
      BigDecimal var4 = new BigDecimal(var2);
      if (var4.scale() > 20) {
         var4 = var4.setScale(20, 4);
      }

      return new c4(var4);
   }

   public static c4 n5(float var0) {
      if (!(var0 >= Float.MAX_VALUE) && !(var0 < -Float.MAX_VALUE) && !Float.isNaN(var0) && !n1.u3(var0) && !n1.a6(var0)) {
         BigDecimal var1 = new BigDecimal(var0);
         if (var1.scale() > l6(var1)) {
            if (l6(var1) > 29) {
               var1 = var1.setScale(7 - (l6(var1) - var1.scale()), 4);
               if (var1.scale() > 28) {
                  var1 = var1.setScale(28, 4);
               }
            }
         } else if (l6(var1) > 7) {
            var1 = var1.setScale(7 - (l6(var1) - var1.scale()), 4);
         }

         return l6(new c4(var1));
      } else {
         throw new OverflowException(d1.n5("Value {0} is greater than Decimal.MaxValue or less than Decimal.MinValue", new Object[]{var0}));
      }
   }

   public static c4 n5(double var0) {
      if (!Double.isNaN(var0) && !d2.u3(var0) && !d2.a6(var0) && !(var0 > Double.MAX_VALUE) && !(var0 < -Double.MAX_VALUE)) {
         BigDecimal var2 = new BigDecimal(var0);
         if (var2.scale() > l6(var2)) {
            if (l6(var2) > 29) {
               var2 = var2.setScale(15 - (l6(var2) - var2.scale()), 4);
               if (var2.scale() > 28) {
                  var2 = var2.setScale(28, 4);
               }
            }
         } else if (l6(var2) > 15) {
            var2 = var2.setScale(15 - (l6(var2) - var2.scale()), 4);
         }

         if (var2.compareTo(l6.h0) <= 0 && var2.compareTo(n5.h0) >= 0) {
            return l6(new c4(var2));
         } else {
            throw new OverflowException();
         }
      } else {
         throw new OverflowException(d1.n5("Value {0} is greater than Decimal.MaxValue or less than Decimal.MinValue", new Object[]{var0}));
      }
   }

   private static int l6(BigDecimal var0) {
      BigInteger var1 = var0.unscaledValue();
      boolean var2 = var1.signum() == -1;
      int var3 = var1.toString().length();
      if (var2) {
         var3--;
      }

      return var3;
   }

   public c4(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Bits is a null reference");
      }

      if (w5.k5(var1, 0) != 4) {
         throw new ArgumentException("bits does not contain four values");
      }

      byte[] var2 = new byte[12];
      byte[] var3 = x8.l6(var1[3]);
      int var4 = var3[3] >>> 31;
      byte var5 = var3[2];
      if (var5 <= 28 && (var1[3] & 2130771967L) == 0L) {
         byte[] var6 = x8.l6(var1[0]);
         byte[] var7 = x8.l6(var1[1]);
         byte[] var8 = x8.l6(var1[2]);
         var2[11] = var6[0];
         var2[10] = var6[1];
         var2[9] = var6[2];
         var2[8] = var6[3];
         var2[7] = var7[0];
         var2[6] = var7[1];
         var2[5] = var7[2];
         var2[4] = var7[3];
         var2[3] = var8[0];
         var2[2] = var8[1];
         var2[1] = var8[2];
         var2[0] = var8[3];
         BigInteger var9 = new BigInteger(var4 == 0 ? 1 : -1, var2);
         this.h0 = new BigDecimal(var9, var5);
      } else {
         throw new ArgumentException("Invalid bits[3]");
      }
   }

   public static int[] n5(c4 var0) {
      int[] var1 = new int[4];
      int var2 = 0;
      c4 var3 = var0;
      boolean var4 = false;
      if (x8(var0, a6)) {
         var3 = k5(var0);
         var4 = true;
      }

      BigDecimal var5 = var3.h0;
      var2 = var5.scale();
      if (var2 < 0) {
         var5 = var5.setScale(0);
         var2 = 0;
      }

      byte[] var6 = var5.unscaledValue().toByteArray();
      byte[] var7 = new byte[12];
      int var8 = var6.length - 1;

      for (int var9 = var7.length - 1; var9 >= 0; var9--) {
         var7[var9] = var6[var8--];
         if (var8 < 0) {
            break;
         }
      }

      byte[] var14 = new byte[4];
      if (var2 > 0) {
         var14[1] = (byte)var2;
      }

      if (var4) {
         var14[0] = -128;
      }

      byte[] var10 = new byte[4];
      byte[] var11 = new byte[4];
      byte[] var12 = new byte[4];
      var10[3] = var7[11];
      var10[2] = var7[10];
      var10[1] = var7[9];
      var10[0] = var7[8];
      var11[3] = var7[7];
      var11[2] = var7[6];
      var11[1] = var7[5];
      var11[0] = var7[4];
      var12[3] = var7[3];
      var12[2] = var7[2];
      var12[1] = var7[1];
      var12[0] = var7[0];
      var1[0] = com.aspose.slides.internal.w4w.l6.l6(var10, 0, false);
      var1[1] = com.aspose.slides.internal.w4w.l6.l6(var11, 0, false);
      var1[2] = com.aspose.slides.internal.w4w.l6.l6(var12, 0, false);
      var1[3] = com.aspose.slides.internal.w4w.l6.l6(var14, 0, false);
      return var1;
   }

   public static c4 l6(c4 var0) {
      BigDecimal var1 = var0.h0;
      String var2 = var1.toPlainString();

      for (String var3 = com.aspose.slides.internal.x7n.l6.u3().e2().q0(); var2.endsWith("0") && var2.indexOf(var3) != -1; var2 = var1.toPlainString()) {
         var1 = var1.setScale(var1.scale() - 1);
      }

      return new c4(var1);
   }

   public boolean n5() {
      return this.x8(a6);
   }

   public static c4 k5(c4 var0) {
      return new c4(var0.h0.negate());
   }

   public static c4 n5(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? n5(var0.h0.add(var1.h0)) : null;
   }

   public static c4 l6(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? n5(var0.h0.subtract(var1.h0)) : null;
   }

   @Override
   public int hashCode() {
      return this.h0.hashCode();
   }

   public static c4 k5(c4 var0, c4 var1) {
      return n5(var0, var1);
   }

   public static c4 u3(c4 var0) {
      var0.h0 = n5(var0.h0.add(BigDecimal.ONE)).h0;
      return var0.l6();
   }

   public static c4 u3(c4 var0, c4 var1) {
      return l6(var0, var1);
   }

   public static c4 a6(c4 var0, c4 var1) {
      return e2(var0, var1);
   }

   public static c4 u9(c4 var0, c4 var1) {
      return t9(var0, var1);
   }

   private static long m3(c4 var0) {
      return var0.h0.longValue();
   }

   public static char a6(c4 var0) {
      if (!t2(var0, n5(65535)) && !x8(var0, l6(0L))) {
         long var1 = m3(var0);
         return (char)var1;
      } else {
         throw new OverflowException("Value was either too large or too small for an Char.");
      }
   }

   public static float u9(c4 var0) {
      return var0.h0.floatValue();
   }

   public static double h0(c4 var0) {
      return var0.h0.doubleValue();
   }

   public static c4 n5(byte var0) {
      return n5(var0 & 255);
   }

   public static c4 l6(byte var0) {
      return n5((int)var0);
   }

   public static c4 n5(short var0) {
      return n5((int)var0);
   }

   public static c4 l6(int var0) {
      return n5(var0 & 65535);
   }

   public static c4 n5(char var0) {
      return n5((int)var0);
   }

   public static c4 k5(int var0) {
      return n5(var0);
   }

   public static c4 u3(long var0) {
      return n5(var0);
   }

   public static c4 a6(long var0) {
      return l6(var0);
   }

   public static c4 u9(long var0) {
      return k5(var0);
   }

   public static c4 l6(float var0) {
      return n5(var0);
   }

   public static c4 l6(double var0) {
      return n5(var0);
   }

   public static boolean h0(c4 var0, c4 var1) {
      return !c8(var0, var1);
   }

   public static boolean c8(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? y4(var0, var1) : false;
   }

   public static boolean t2(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? z1(var0, var1) > 0 : false;
   }

   public static boolean s7(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? z1(var0, var1) >= 0 : false;
   }

   public static boolean x8(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? z1(var0, var1) < 0 : false;
   }

   public static boolean n3(c4 var0, c4 var1) {
      return var0 != null && var1 != null ? z1(var0, var1) <= 0 : false;
   }

   public static boolean y4(c4 var0, c4 var1) {
      return z1(var0, var1) == 0 || t4(var0, var1);
   }

   private static boolean t4(c4 var0, c4 var1) {
      int[] var2 = n5(var0);
      int[] var3 = n5(var1);
      return var2[0] == var3[0] && var2[1] == var3[1] && var2[2] == var3[2] && var2[3] == var3[3];
   }

   @Override
   public boolean equals(Object value) {
      if (!(value instanceof c4)) {
         if (value instanceof Integer) {
            return this.x8(n5(z3.h0(value)));
         } else if (value instanceof Long) {
            return this.x8(l6(z3.t2(value)));
         } else {
            return value instanceof Double ? this.x8(n5(z3.n3(value))) : false;
         }
      } else {
         return y4((c4)value, this);
      }
   }

   public static c4 c8(c4 var0) {
      return new c4(var0.h0.divide(BigDecimal.valueOf(1L), 0, 3));
   }

   public static c4 t2(c4 var0) {
      return t2(var0, a6) ? c8(var0) : k5(c8(k5(var0)));
   }

   public static c4 n5(c4 var0, int var1, short var2) {
      if (var2 != 0 && var2 != 1) {
         throw new ArgumentException(d1.n5(new String[]{"The value '", d5.getName(y0.class, var2), "' is not valid for this usage of the type MidpointRounding."}), "mode");
      }

      if (var1 >= 0 && var1 <= 28) {
         boolean var3 = var0.h0.signum() < 0;
         if (var3) {
            var0 = k5(var0);
         }

         c4 var4 = n5(q1.a6(10.0, var1));
         c4 var5 = c8(var0);
         c4 var6 = u3(var0, var5);
         var6 = e2(var6, new c4("10000000000000000000000000000"));
         var6 = c8(var6);
         var6 = t9(var6, u9(new c4("10000000000000000000000000000"), var4));
         var6 = q1.n5(var6, var2);
         var6 = t9(var6, var4);
         c4 var7 = k5(var5, var6);
         int var8 = var2 == 1 ? 4 : 6;
         var7.h0 = var7.h0.setScale(var1, var8);
         if (var3) {
            var7 = k5(var7);
         }

         return var7;
      } else {
         throw new ArgumentOutOfRangeException("decimals", "[0,28]");
      }
   }

   public static c4 e2(c4 var0, c4 var1) {
      if (var0 == null || var1 == null) {
         return null;
      }

      if (!var0.n5() && !var1.n5()) {
         BigDecimal var2 = var0.h0.multiply(var1.h0);
         var2 = var2.stripTrailingZeros();
         if (var2.scale() < 0) {
            var2 = var2.setScale(0, 4);
         }

         return n5(var2);
      } else {
         return a6;
      }
   }

   public static c4 t9(c4 var0, c4 var1) {
      if (var0 == null || var1 == null) {
         return null;
      }

      if (var1.n5()) {
         throw new DivideByZeroException();
      }

      if (var0.n5()) {
         return a6;
      }

      BigDecimal var2 = var0.h0.divide(var1.h0, 28, 4);
      var2 = var2.stripTrailingZeros();
      if (var2.scale() < 0) {
         var2 = var2.setScale(0, 4);
      }

      return n5(var2);
   }

   public static int z1(c4 var0, c4 var1) {
      return var0.h0.compareTo(var1.h0);
   }

   public int s7(c4 var1) {
      return z1(this, var1);
   }

   public boolean x8(c4 var1) {
      return y4(var1, this);
   }

   public static c4 n5(String var0) {
      return n5(var0, 111, null);
   }

   public static c4 l6(String var0, h2 var1) {
      return n5(var0, 111, var1);
   }

   public static c4 n5(String var0, int var1, h2 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      }

      if ((var1 & 512) != 0) {
         throw new ArgumentException("Decimal.TryParse does not accept AllowHexSpecifier", "style");
      }

      Object var3 = null;
      c4[] var4 = new c4[]{(c4)var3};
      n5(var0, var1, var2, var4, true);
      return var4[0];
   }

   public static boolean n5(String var0, c4[] var1) {
      if (var0 == null) {
         var1[0] = a6;
         return false;
      }

      try {
         return n5(var0, 111, null, var1, false);
      } catch (Exception var3) {
         var1[0] = a6;
         return false;
      }
   }

   public static boolean n5(String var0, int var1, h2 var2, c4[] var3) {
      if (var0 != null && (var1 & 512) == 0) {
         try {
            return n5(var0, var1, var2, var3, false);
         } catch (Exception var5) {
            var3[0] = a6;
            return false;
         }
      } else {
         var3[0] = a6;
         return false;
      }
   }

   static boolean n5(String var0, int var1, h2 var2, c4[] var3, boolean var4) {
      com.aspose.slides.internal.x7n.s7 var5;
      if (var2 == null) {
         var5 = com.aspose.slides.internal.x7n.s7.x8();
      } else {
         var5 = com.aspose.slides.internal.x7n.s7.n5(var2);
      }

      if (d1.t2(var0, "\u0000")) {
         var0 = d1.n5(var0, "\u0000", "");
      }

      var0 = d1.l6(var0);
      switch (var1) {
         case 7:
         case 167:
            if (d1.c8(var0, var5.z3()) != -1) {
               var0 = d1.n5(var0, var5.z3(), "");
            }
            break;
         case 111:
            if (var0.startsWith("(") && var0.endsWith(")")) {
               var0 = d1.l6(var0, 1, var0.length() - 2);
               var0 = d1.l6(var0);
               var0 = var5.z1() + var0;
            }

            if (d1.c8(var0, var5.z3()) != -1 && var5.z3() != var5.q0()) {
               var0 = d1.n5(var0, var5.z3(), "");
            }
            break;
         case 383:
            if (d1.c8(var0, var5.t2()) != -1) {
               var0 = d1.n5(var0, var5.t2(), "");
               var0 = d1.l6(var0);
            }

            if (var0.startsWith("(") && var0.endsWith(")")) {
               var0 = d1.l6(var0, 1, var0.length() - 2);
               var0 = d1.l6(var0);
               var0 = var5.z1() + var0;
            }

            if (d1.c8(var0, var5.z3()) != -1) {
               var0 = d1.n5(var0, var5.z3(), "");
            }
      }

      try {
         if ((var1 & 32) == 0) {
            String var6 = null;
            if ((var1 & 256) != 0) {
               var6 = var5.k5();
            } else {
               var6 = var5.q0();
            }

            if (d1.t2(var0, var6)) {
               throw new FormatException();
            }
         } else {
            String var16 = null;
            if ((var1 & 256) != 0) {
               var16 = var5.k5();
            } else {
               var16 = var5.q0();
            }

            if (d1.c8(var0, var16) != -1) {
               var0 = d1.n5(var0, var16, ".");
            }
         }

         BigDecimal var7 = new BigDecimal(var0);
         if (var7.compareTo(l6.h0) <= 0 && var7.compareTo(n5.h0) >= 0) {
            var3[0] = n5(var7);
            return true;
         } else {
            throw new OverflowException();
         }
      } catch (NumberFormatException var8) {
         throw new FormatException(var8.getMessage());
      }
   }

   public static byte n3(c4 var0) {
      if (!t2(var0, n5(255)) && !x8(var0, a6)) {
         return (byte)(t2(var0).h0.byteValue() & 0xFF);
      } else {
         throw new OverflowException("Value is greater than Byte.MaxValue or less than Byte.MinValue");
      }
   }

   public static double y4(c4 var0) {
      return var0.h0.doubleValue();
   }

   public static short e2(c4 var0) {
      if (!t2(var0, n5(32767)) && !x8(var0, n5(-32768))) {
         return t2(var0).h0.shortValue();
      } else {
         throw new OverflowException("Value is greater than Int16.MaxValue or less than Int16.MinValue");
      }
   }

   public static int t9(c4 var0) {
      if (!t2(var0, n5(65535)) && !x8(var0, n5(0))) {
         return t2(var0).h0.shortValue() & 65535;
      } else {
         throw new OverflowException("Value is greater than UInt16.MaxValue or less than UInt16.MinValue");
      }
   }

   public static int z1(c4 var0) {
      if (!t2(var0, n5(Integer.MAX_VALUE)) && !x8(var0, n5(Integer.MIN_VALUE))) {
         return t2(var0).h0.intValue();
      } else {
         throw new OverflowException("Value is greater than Int32.MaxValue or less than Int32.MinValue");
      }
   }

   public static long t4(c4 var0) {
      if (!t2(var0, n5(4294967295L)) && !x8(var0, n5(0L))) {
         return t2(var0).h0.intValue() & 4294967295L;
      } else {
         throw new OverflowException("Value is greater than Int32.MaxValue or less than Int32.MinValue");
      }
   }

   public static long q0(c4 var0) {
      if (!t2(var0, l6(Long.MAX_VALUE)) && !x8(var0, l6(Long.MIN_VALUE))) {
         return t2(var0).h0.longValue();
      } else {
         throw new OverflowException("Value is greater than Int64.MaxValue or less than Int64.MinValue");
      }
   }

   public static long z3(c4 var0) {
      if (!t2(var0, new c4("18446744073709551615")) && !x8(var0, k5(0L))) {
         return t2(var0).h0.longValue();
      } else {
         throw new OverflowException("Value is greater than UInt64.MaxValue or less than UInt64.MinValue");
      }
   }

   public static float m1(c4 var0) {
      return z3.x8(var0);
   }

   @Override
   public boolean n5(h2 var1) {
      return z3.n5(this);
   }

   @Override
   public byte l6(h2 var1) {
      return z3.u3(this);
   }

   @Override
   public char k5(h2 var1) {
      throw new InvalidCastException();
   }

   @Override
   public j5 u3(h2 var1) {
      throw new InvalidCastException();
   }

   @Override
   public c4 a6(h2 var1) {
      return this;
   }

   @Override
   public double u9(h2 var1) {
      return z3.n3(this);
   }

   @Override
   public short h0(h2 var1) {
      return z3.a6(this);
   }

   @Override
   public int c8(h2 var1) {
      return z3.h0(this);
   }

   @Override
   public long t2(h2 var1) {
      return z3.t2(this);
   }

   @Override
   public byte s7(h2 var1) {
      return z3.k5(this);
   }

   @Override
   public float x8(h2 var1) {
      return z3.x8(this);
   }

   @Override
   public int n3(h2 var1) {
      return z3.u9(this);
   }

   @Override
   public long y4(h2 var1) {
      return z3.c8(this);
   }

   @Override
   public long e2(h2 var1) {
      return z3.s7(this);
   }

   @Override
   public String n5(String var1, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.n5(var1, this, var2);
   }

   @Override
   public String toString() {
      return this.n5("G", (h2)null);
   }

   @Override
   public String t9(h2 var1) {
      return this.n5("G", var1);
   }

   public void k7(c4 var1) {
      var1.h0 = this.h0;
   }

   public c4 l6() {
      c4 var1 = new c4();
      this.k7(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   public static c4 n5(BigDecimal var0) {
      if (var0 == null) {
         return new c4();
      }

      if (l6(var0) > 0 && l6(var0) != var0.scale()) {
         if (l6(var0) > 29 && var0.scale() >= l6(var0) - 29) {
            var0 = var0.setScale(29 - (l6(var0) - var0.scale()), 4);
         } else if (var0.scale() > 28) {
            var0 = var0.setScale(28, 4);
         }
      } else {
         var0 = var0.setScale(28, 4);
      }

      return new c4(var0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c4 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c4 bridgeArg0) {
      this.k7(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(c4 bridgeArg0) {
      return this.s7(bridgeArg0);
   }

}
