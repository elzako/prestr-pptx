package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OverflowException;

public class z3 {
   public static byte[] n5 = new byte[]{
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      43,
      47
   };

   private static z3$n5 t9(Object var0) {
      for (z3$n5 var4 : z3$n5.n5()) {
         if (z3$n5.n5(var4).equals(var0.getClass())) {
            return var4;
         }
      }

      return z3$n5.n3;
   }

   public static boolean n5(Object var0, h2 var1) {
      if (var0 == null) {
         return false;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return n5((Boolean)var0);
         case CharClass:
            return n5((Character)var0);
         case ByteClass:
            return n5((Byte)var0);
         case ShortClass:
            return n5((Short)var0);
         case IntClass:
            return n5((Integer)var0);
         case LongClass:
            return n5((Long)var0);
         case FloatClass:
            return n5((Float)var0);
         case DoubleClass:
            return n5((Double)var0);
         case DecimalClass:
            return n5((c4)var0);
         case DateTimeClass:
            return n5((j5)var0);
         case StringClass:
            return n5((String)var0, var1);
         default:
            return ((u6)var0).n5(var1);
      }
   }

   public static boolean n5(Boolean var0) {
      return var0;
   }

   public static boolean n5(Byte var0) {
      return var0 != 0;
   }

   public static boolean n5(Character var0) {
      throw new InvalidCastException("Invalid cast from 'Character' to 'Boolean'.");
   }

   public static boolean n5(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Boolean'.");
   }

   public static boolean n5(Short var0) {
      return var0 != 0;
   }

   public static boolean n5(Integer var0) {
      return var0 != 0;
   }

   public static boolean n5(Long var0) {
      return var0 != 0L;
   }

   public static boolean n5(String var0) {
      return var0 == null ? false : n3.n5(var0);
   }

   public static boolean n5(Float var0) {
      return var0 != 0.0F;
   }

   public static boolean n5(Double var0) {
      return var0 != 0.0;
   }

   public static boolean n5(c4 var0) {
      return !var0.x8(c4.a6);
   }

   public static boolean n5(Object var0) {
      return n5(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static boolean n5(String var0, h2 var1) {
      return var0 == null ? false : n3.n5(var0);
   }

   public static char l6(Object var0, h2 var1) {
      if (var0 == null) {
         return '\u0000';
      }

      switch (t9(var0)) {
         case BooleanClass:
            return l6((Boolean)var0);
         case CharClass:
            return l6((Character)var0);
         case ByteClass:
            return l6((Byte)var0);
         case ShortClass:
            return l6((Short)var0);
         case IntClass:
            return l6((Integer)var0);
         case LongClass:
            return l6((Long)var0);
         case FloatClass:
            return l6((Float)var0);
         case DoubleClass:
            return l6((Double)var0);
         case DecimalClass:
            return l6((c4)var0);
         case DateTimeClass:
            return l6((j5)var0);
         case StringClass:
            return l6((String)var0, var1);
         default:
            return ((u6)var0).k5(var1);
      }
   }

   public static char l6(Boolean var0) {
      throw new InvalidCastException("Invalid cast from 'Boolean' to 'Char'.");
   }

   public static char l6(Character var0) {
      return var0;
   }

   public static char l6(Byte var0) {
      return (char)(var0 & 0xFF);
   }

   public static char l6(Short var0) {
      if (var0 < 0) {
         throw new OverflowException("Value was either too large or too small for a character.");
      } else {
         return (char)var0.shortValue();
      }
   }

   public static char l6(Integer var0) {
      if (var0 >= 0 && var0 <= 65535) {
         return (char)var0.intValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a character.");
      }
   }

   public static char l6(Long var0) {
      if (var0 >= 0L && var0 <= 65535L) {
         return (char)var0.longValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a character.");
      }
   }

   public static char l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("value");
      } else if (var0.length() != 1) {
         throw new FormatException();
      } else {
         return var0.charAt(0);
      }
   }

   public static char l6(Float var0) {
      throw new InvalidCastException("Invalid cast from 'Float' to 'Char'.");
   }

   public static char l6(Double var0) {
      throw new InvalidCastException("Invalid cast from 'Double' to 'Char'.");
   }

   public static char l6(c4 var0) {
      throw new InvalidCastException("Invalid cast from 'Decimal' to 'Char'.");
   }

   public static char l6(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Char'.");
   }

   public static char l6(Object var0) {
      return var0 == null ? '\u0000' : l6(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static char l6(String var0, h2 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("value");
      } else if (var0.length() != 1) {
         throw new FormatException("String must be exactly one character long.");
      } else {
         return var0.charAt(0);
      }
   }

   public static byte k5(Object var0) {
      return u3(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static byte u3(Object var0) {
      return k5(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static byte k5(Object var0, h2 var1) {
      if (var0 == null) {
         return 0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return k5((Boolean)var0);
         case CharClass:
            return k5((Character)var0);
         case ByteClass:
            return k5((Byte)var0);
         case ShortClass:
            return k5((Short)var0);
         case IntClass:
            return k5((Integer)var0);
         case LongClass:
            return k5((Long)var0);
         case FloatClass:
            return k5((Float)var0);
         case DoubleClass:
            return k5((Double)var0);
         case DecimalClass:
            return k5((c4)var0);
         case DateTimeClass:
            return k5((j5)var0);
         case StringClass:
            return k5((String)var0, var1);
         default:
            return ((u6)var0).s7(var1);
      }
   }

   public static byte k5(Boolean var0) {
      return (byte)(var0 ? 1 : 0);
   }

   public static byte k5(Byte var0) {
      return var0;
   }

   public static byte k5(Character var0) {
      if (var0 > 127) {
         throw new OverflowException("Value was either too large or too small for a signed byte.");
      } else {
         return (byte)var0.charValue();
      }
   }

   public static byte k5(Short var0) {
      if (var0 >= -128 && var0 <= 127) {
         return var0.byteValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a signed byte.");
      }
   }

   public static byte k5(Integer var0) {
      if (var0 >= -128 && var0 <= 127) {
         return var0.byteValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a signed byte.");
      }
   }

   public static byte k5(Long var0) {
      if (var0 >= -128L && var0 <= 127L) {
         return var0.byteValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a signed byte.");
      }
   }

   public static byte k5(Float var0) {
      return k5((double)var0.floatValue());
   }

   public static byte k5(Double var0) {
      return k5(h0(var0));
   }

   public static byte k5(c4 var0) {
      return k5(h0(var0));
   }

   public static byte k5(String var0, h2 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("value");
      } else {
         return f5.n5(var0, 7, var1);
      }
   }

   public static byte k5(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'SByte'.");
   }

   public static byte u3(Object var0, h2 var1) {
      if (var0 == null) {
         return 0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return u3((Boolean)var0);
         case CharClass:
            return u3((Character)var0);
         case ByteClass:
            return u3((Byte)var0);
         case ShortClass:
            return u3((Short)var0);
         case IntClass:
            return u3((Integer)var0);
         case LongClass:
            return u3((Long)var0);
         case FloatClass:
            return u3((Float)var0);
         case DoubleClass:
            return u3((Double)var0);
         case DecimalClass:
            return u3((c4)var0);
         case DateTimeClass:
            return u3((j5)var0);
         case StringClass:
            return u3((String)var0, var1);
         default:
            return ((u6)var0).l6(var1);
      }
   }

   public static byte u3(Boolean var0) {
      return (byte)(var0 ? 1 : 0);
   }

   public static byte u3(Byte var0) {
      return var0;
   }

   public static byte u3(Character var0) {
      if (var0 > 255) {
         throw new OverflowException("Value was either too large or too small for an unsigned byte.");
      } else {
         return (byte)(var0 & 0xFF);
      }
   }

   public static byte u3(Short var0) {
      if (var0 >= 0 && var0 <= 255) {
         return (byte)(var0 & 0xFF);
      } else {
         throw new OverflowException("Value was either too large or too small for an unsigned byte.");
      }
   }

   public static byte u3(Integer var0) {
      if (var0 >= 0 && var0 <= 255) {
         return (byte)(var0 & 0xFF);
      } else {
         throw new OverflowException("Value was either too large or too small for an unsigned byte.");
      }
   }

   public static byte u3(Long var0) {
      if (var0 >= 0L && var0 <= 255L) {
         return (byte)(var0 & 255L);
      } else {
         throw new OverflowException("Value was either too large or too small for an unsigned byte.");
      }
   }

   public static byte u3(Float var0) {
      return u3((double)var0.floatValue());
   }

   public static byte u3(Double var0) {
      return u3(h0(var0));
   }

   public static byte u3(c4 var0) {
      return u3(h0(var0));
   }

   public static byte k5(String var0) {
      return u3(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static byte u3(String var0, h2 var1) {
      return var0 == null ? 0 : (byte)(e2.n5(var0, var1) & 0xFF);
   }

   public static byte u3(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Byte'.");
   }

   public static byte n5(String var0, int var1) {
      if (var0 == null) {
         return 0;
      }

      String[] var2 = new String[]{var0};
      n5(var2, var1);
      var0 = var2[0];

      int var3;
      try {
         var3 = a6(var0, var1);
      } catch (NumberFormatException var5) {
         throw new FormatException(var5.getMessage());
      }

      if (var3 >= 0 && var3 <= 255) {
         return (byte)var3;
      } else {
         throw new OverflowException("Value was either too large or too small for an unsigned byte.");
      }
   }

   public static short a6(Object var0) {
      return a6(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static short a6(Object var0, h2 var1) {
      if (var0 == null) {
         return 0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return a6((Boolean)var0);
         case CharClass:
            return a6((Character)var0);
         case ByteClass:
            return a6((Byte)var0);
         case ShortClass:
            return a6((Short)var0);
         case IntClass:
            return a6((Integer)var0);
         case LongClass:
            return a6((Long)var0);
         case FloatClass:
            return a6((Float)var0);
         case DoubleClass:
            return a6((Double)var0);
         case DecimalClass:
            return a6((c4)var0);
         case DateTimeClass:
            return a6((j5)var0);
         case StringClass:
            return a6((String)var0, var1);
         default:
            return ((u6)var0).h0(var1);
      }
   }

   public static short a6(Boolean var0) {
      return (short)(var0 ? 1 : 0);
   }

   public static short a6(Character var0) {
      if (var0 > 32767) {
         throw new OverflowException("Value was either too large or too small for an Int16.");
      } else {
         return (short)var0.charValue();
      }
   }

   public static short a6(Byte var0) {
      return (short)(var0 & 0xFF);
   }

   public static short a6(Integer var0) {
      if (var0 >= -32768 && var0 <= 32767) {
         return var0.shortValue();
      } else {
         throw new OverflowException("Value was either too large or too small for an Int16.");
      }
   }

   public static short a6(Short var0) {
      return var0;
   }

   public static short a6(Long var0) {
      if (var0 >= -32768L && var0 <= 32767L) {
         return var0.shortValue();
      } else {
         throw new OverflowException("Value was either too large or too small for an Int16.");
      }
   }

   public static short a6(Float var0) {
      return a6((double)var0.floatValue());
   }

   public static short a6(Double var0) {
      return a6(h0(var0));
   }

   public static short a6(c4 var0) {
      return a6(h0(var0));
   }

   public static short a6(String var0, h2 var1) {
      return var0 == null ? 0 : f0.n5(var0, 7, var1);
   }

   public static short a6(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int16'.");
   }

   public static int u9(Object var0) {
      return u9(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static int u9(Object var0, h2 var1) {
      if (var0 == null) {
         return 0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return u9((Boolean)var0);
         case CharClass:
            return u9((Character)var0);
         case ByteClass:
            return u9((Byte)var0);
         case ShortClass:
            return u9((Short)var0);
         case IntClass:
            return u9((Integer)var0);
         case LongClass:
            return u9((Long)var0);
         case FloatClass:
            return u9((Float)var0);
         case DoubleClass:
            return u9((Double)var0);
         case DecimalClass:
            return u9((c4)var0);
         case DateTimeClass:
            return u9((j5)var0);
         case StringClass:
            return u9((String)var0, var1);
         default:
            return ((u6)var0).n3(var1);
      }
   }

   public static int u9(Boolean var0) {
      return var0 ? 1 : 0;
   }

   public static int u9(Character var0) {
      return var0;
   }

   public static int u9(Byte var0) {
      return var0 & 0xFF;
   }

   public static int u9(Short var0) {
      if (var0 < 0) {
         throw new OverflowException("Value was either too large or too small for a UInt16.");
      } else {
         return var0;
      }
   }

   public static int u9(Integer var0) {
      if (var0 >= 0 && var0 <= 65535) {
         return var0;
      } else {
         throw new OverflowException("Value was either too large or too small for a UInt16.");
      }
   }

   public static int u9(Long var0) {
      if (var0 >= 0L && var0 <= 65535L) {
         return var0.intValue();
      } else {
         throw new OverflowException("Value was either too large or too small for a UInt16.");
      }
   }

   public static int u9(Float var0) {
      return u9((double)var0.floatValue());
   }

   public static int u9(Double var0) {
      return u9(h0(var0));
   }

   public static int u9(c4 var0) {
      return u9(h0(var0));
   }

   public static int u9(String var0, h2 var1) {
      return var0 == null ? 0 : c3.n5(var0, 7, var1);
   }

   public static int u9(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt16'.");
   }

   public static int h0(Object var0) {
      return h0(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static int h0(Object var0, h2 var1) {
      if (var0 == null) {
         return 0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return h0((Boolean)var0);
         case CharClass:
            return h0((Character)var0);
         case ByteClass:
            return h0((Byte)var0);
         case ShortClass:
            return h0((Short)var0);
         case IntClass:
            return h0((Integer)var0);
         case LongClass:
            return h0((Long)var0);
         case FloatClass:
            return h0((Float)var0);
         case DoubleClass:
            return h0((Double)var0);
         case DecimalClass:
            return h0((c4)var0);
         case DateTimeClass:
            return h0((j5)var0);
         case StringClass:
            return h0((String)var0, var1);
         default:
            return ((u6)var0).c8(var1);
      }
   }

   public static int h0(Boolean var0) {
      return var0 ? 1 : 0;
   }

   public static int h0(Character var0) {
      return var0;
   }

   public static int h0(Byte var0) {
      return var0 & 0xFF;
   }

   public static int h0(Short var0) {
      return var0;
   }

   public static int h0(Integer var0) {
      return var0;
   }

   public static int h0(Long var0) {
      if (var0 >= -2147483648L && var0 <= 2147483647L) {
         return var0.intValue();
      } else {
         throw new OverflowException("Value was either too large or too small for an Int32.");
      }
   }

   public static int h0(Float var0) {
      return h0((double)var0.floatValue());
   }

   public static int h0(Double var0) {
      if (var0 >= 0.0) {
         if (var0 < 2.1474836475E9) {
            int var1 = var0.intValue();
            double var2 = var0 - var1;
            if (var2 > 0.5 || var2 == 0.5 && (var1 & 1) != 0) {
               var1++;
            }

            return var1;
         }
      } else if (var0 >= -2.1474836485E9) {
         int var4 = var0.intValue();
         double var5 = var0 - var4;
         if (var5 < -0.5 || var5 == -0.5 && (var4 & 1) != 0) {
            var4--;
         }

         return var4;
      }

      throw new OverflowException("Value was either too large or too small for an Int32.");
   }

   public static int h0(c4 var0) {
      return h0(c4.h0(var0));
   }

   public static int u3(String var0) {
      return h0(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static int h0(String var0, h2 var1) {
      return var0 == null ? 0 : a3.n5(var0, 7, var1);
   }

   public static int l6(String var0, int var1) {
      if (var0 == null) {
         return 0;
      }

      String[] var2 = new String[]{var0};
      n5(var2, var1);
      var0 = var2[0];

      try {
         return var1 == 16 ? a3.n5(var0, 515) : a6(var0, var1);
      } catch (NumberFormatException var4) {
         throw new FormatException(var4.getMessage());
      }
   }

   private static void n5(String[] var0, int var1) {
      if (var1 != 2 && var1 != 8 && var1 != 10 && var1 != 16) {
         throw new ArgumentException("Invalid Base.");
      }

      if (var0[0].equals("")) {
         throw new ArgumentOutOfRangeException("value");
      }

      if (var1 != 10 && var0[0].startsWith("-")) {
         throw new ArgumentException("value");
      }

      if (var1 == 16) {
         if (var0[0].startsWith("+")) {
            var0[0] = var0[0].substring(1);
         }

         if (var0[0].startsWith("0X") || var0[0].startsWith("0x")) {
            var0[0] = var0[0].substring(2);
         }
      }
   }

   public static int h0(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int32'.");
   }

   public static long c8(Object var0) {
      return c8(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static long c8(Object var0, h2 var1) {
      if (var0 == null) {
         return 0L;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return c8((Boolean)var0);
         case CharClass:
            return c8((Character)var0);
         case ByteClass:
            return c8((Byte)var0);
         case ShortClass:
            return c8((Short)var0);
         case IntClass:
            return c8((Integer)var0);
         case LongClass:
            return c8((Long)var0);
         case FloatClass:
            return c8((Float)var0);
         case DoubleClass:
            return c8((Double)var0);
         case DecimalClass:
            return c8((c4)var0);
         case DateTimeClass:
            return c8((j5)var0);
         case StringClass:
            return c8((String)var0, var1);
         default:
            return ((u6)var0).y4(var1);
      }
   }

   public static long c8(Boolean var0) {
      return var0 ? 1L : 0L;
   }

   public static long c8(Character var0) {
      return var0.charValue();
   }

   public static long c8(Byte var0) {
      return var0 & 0xFF;
   }

   public static long c8(Short var0) {
      if (var0 < 0) {
         throw new OverflowException("Value was either too large or too small for a UInt32.");
      } else {
         return var0.shortValue();
      }
   }

   public static long c8(Integer var0) {
      if (var0 < 0) {
         throw new OverflowException("Value was either too large or too small for a UInt32.");
      } else {
         return var0.intValue();
      }
   }

   public static long c8(Long var0) {
      if (var0 >= 0L && var0 <= 4294967295L) {
         return var0;
      } else {
         throw new OverflowException("Value was either too large or too small for a UInt32.");
      }
   }

   public static long c8(Float var0) {
      return c8((double)var0.floatValue());
   }

   public static long c8(Double var0) {
      if (var0 >= -0.5 && var0 < 4.2949672955E9) {
         long var1 = var0.longValue();
         double var3 = var0 - (var1 & 4294967295L);
         if (var3 > 0.5 || var3 == 0.5 && (var1 & 4294967295L & 1L) != 0L) {
            var1++;
         }

         return var1;
      } else {
         throw new OverflowException("Value was either too large or too small for a UInt32.");
      }
   }

   public static long c8(c4 var0) {
      return c8(c4.h0(var0));
   }

   public static long c8(String var0, h2 var1) {
      return var0 == null ? 0L : l4.n5(var0, 7, var1);
   }

   public static long c8(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt32'.");
   }

   public static long k5(String var0, int var1) {
      if (var0 == null) {
         return 0L;
      }

      String[] var2 = new String[]{var0};
      n5(var2, var1);
      var0 = var2[0];
      if (var0.startsWith("-")) {
         throw new OverflowException();
      }

      try {
         if (var0.startsWith("+")) {
            var0 = var0.substring(1);
         }

         return Long.parseLong(var0, var1);
      } catch (NumberFormatException var4) {
         throw new FormatException(var4.getMessage());
      }
   }

   private static int a6(String var0, int var1) {
      if (var0.startsWith("+")) {
         var0 = var0.substring(1);
      }

      return Integer.parseInt(var0, var1);
   }

   public static long t2(Object var0) {
      return t2(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static long t2(Object var0, h2 var1) {
      if (var0 == null) {
         return 0L;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return t2((Boolean)var0);
         case CharClass:
            return t2((Character)var0);
         case ByteClass:
            return t2((Byte)var0);
         case ShortClass:
            return t2((Short)var0);
         case IntClass:
            return t2((Integer)var0);
         case LongClass:
            return t2((Long)var0);
         case FloatClass:
            return t2((Float)var0);
         case DoubleClass:
            return t2((Double)var0);
         case DecimalClass:
            return t2((c4)var0);
         case DateTimeClass:
            return t2((j5)var0);
         case StringClass:
            return t2((String)var0, var1);
         default:
            return ((u6)var0).t2(var1);
      }
   }

   public static long t2(Boolean var0) {
      return var0 ? 1L : 0L;
   }

   public static long t2(Character var0) {
      return var0.charValue();
   }

   public static long t2(Byte var0) {
      return var0 & 0xFF;
   }

   public static long t2(Short var0) {
      return var0.shortValue();
   }

   public static long t2(Integer var0) {
      return var0.intValue();
   }

   public static long t2(Long var0) {
      return var0;
   }

   public static long t2(Float var0) {
      return t2((double)var0.floatValue());
   }

   public static long t2(Double var0) {
      if (!(var0 > 9.223372E18F) && !(var0 < -9.223372E18F)) {
         return Double.valueOf(q1.u3(var0)).longValue();
      } else {
         throw new OverflowException();
      }
   }

   public static long t2(c4 var0) {
      if (var0 == null) {
         return 0L;
      } else if (c4.z1(var0, c4.l6(Long.MAX_VALUE)) <= 0 && c4.z1(var0, c4.l6(Long.MIN_VALUE)) >= 0) {
         return t2(c4.h0(var0));
      } else {
         throw new OverflowException();
      }
   }

   public static long a6(String var0) {
      if (var0 == null) {
         return 0L;
      } else {
         c4 var1 = c4.n5(var0);
         if (c4.z1(var1, c4.l6(Long.MAX_VALUE)) <= 0 && c4.z1(var1, c4.l6(Long.MIN_VALUE)) >= 0) {
            return t2(var0, com.aspose.slides.internal.x7n.l6.u3());
         } else {
            throw new OverflowException();
         }
      }
   }

   public static long t2(String var0, h2 var1) {
      if (var0 == null) {
         return 0L;
      } else {
         c4 var2 = c4.n5(var0);
         if (c4.z1(var2, c4.l6(Long.MAX_VALUE)) <= 0 && c4.z1(var2, c4.l6(Long.MIN_VALUE)) >= 0) {
            return p3.n5(var0, 7, var1);
         } else {
            throw new OverflowException();
         }
      }
   }

   public static long t2(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int64'.");
   }

   public static long u3(String var0, int var1) {
      if (var0 == null) {
         return 0L;
      }

      String[] var2 = new String[]{var0};
      n5(var2, var1);
      var0 = var2[0];

      try {
         return Long.parseLong(var0, var1);
      } catch (NumberFormatException var4) {
         if (var0.equals("8000000000000000") && var1 == 16) {
            return Long.MIN_VALUE;
         } else {
            throw new FormatException(var4.getMessage());
         }
      }
   }

   public static long s7(Object var0) {
      return s7(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static long s7(Object var0, h2 var1) {
      if (var0 == null) {
         return 0L;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return s7((Boolean)var0);
         case CharClass:
            return s7((Character)var0);
         case ByteClass:
            return s7((Byte)var0);
         case ShortClass:
            return s7((Short)var0);
         case IntClass:
            return s7((Integer)var0);
         case LongClass:
            return s7((Long)var0);
         case FloatClass:
            return s7((Float)var0);
         case DoubleClass:
            return s7((Double)var0);
         case DecimalClass:
            return s7((c4)var0);
         case DateTimeClass:
            return s7((j5)var0);
         case StringClass:
            return s7((String)var0, var1);
         default:
            return ((u6)var0).e2(var1);
      }
   }

   public static long s7(Boolean var0) {
      return t2(var0);
   }

   public static long s7(Character var0) {
      return t2(var0);
   }

   public static long s7(Byte var0) {
      return t2(var0 & 255);
   }

   public static long s7(Short var0) {
      if (var0 < 0) {
         throw new OverflowException();
      } else {
         return t2(var0);
      }
   }

   public static long s7(Integer var0) {
      if (var0 < 0) {
         throw new OverflowException();
      } else {
         return t2(var0);
      }
   }

   public static long s7(Long var0) {
      if (var0 < 0L) {
         throw new OverflowException();
      } else {
         return t2(var0) & -1L;
      }
   }

   public static long s7(Float var0) {
      return s7((double)var0.floatValue());
   }

   public static long s7(Double var0) {
      if (var0 < 0.0) {
         throw new OverflowException();
      } else {
         return t2(var0);
      }
   }

   public static long s7(c4 var0) {
      if (c4.z1(var0, c4.a6) < 0) {
         throw new OverflowException();
      } else {
         return t2(var0) & -1L;
      }
   }

   public static long s7(String var0, h2 var1) {
      return var0 == null ? 0L : a7.n5(var0, 7, var1);
   }

   public static long s7(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt64'.");
   }

   public static float x8(Object var0) {
      return x8(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static float x8(Object var0, h2 var1) {
      if (var0 == null) {
         return 0.0F;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return x8((Boolean)var0);
         case CharClass:
            return x8((Character)var0);
         case ByteClass:
            return x8((Byte)var0);
         case ShortClass:
            return x8((Short)var0);
         case IntClass:
            return x8((Integer)var0);
         case LongClass:
            return x8((Long)var0);
         case FloatClass:
            return x8((Float)var0);
         case DoubleClass:
            return x8((Double)var0);
         case DecimalClass:
            return x8((c4)var0);
         case DateTimeClass:
            return x8((j5)var0);
         case StringClass:
            return x8((String)var0, var1);
         default:
            return ((u6)var0).x8(var1);
      }
   }

   public static float x8(Byte var0) {
      return var0 & 0xFF;
   }

   public static float x8(Character var0) {
      throw new InvalidCastException("Invalid cast from 'Character' to 'Single'.");
   }

   public static float x8(Short var0) {
      return var0.shortValue();
   }

   public static float x8(Integer var0) {
      return var0.intValue();
   }

   public static float x8(Long var0) {
      return (float)var0.longValue();
   }

   public static float x8(Float var0) {
      return var0;
   }

   public static float x8(Double var0) {
      return var0.floatValue();
   }

   public static float x8(c4 var0) {
      return c4.u9(var0);
   }

   public static float u9(String var0) {
      return x8(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static float x8(String var0, h2 var1) {
      return var0 == null ? 0.0F : n1.n5(var0, 231, var1);
   }

   public static float x8(Boolean var0) {
      return var0 ? 1.0F : 0.0F;
   }

   public static float x8(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Single'.");
   }

   public static double n3(Object var0) {
      return n3(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static double n3(Object var0, h2 var1) {
      if (var0 == null) {
         return 0.0;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return n3((Boolean)var0);
         case CharClass:
            return n3((Character)var0);
         case ByteClass:
            return n3((Byte)var0);
         case ShortClass:
            return n3((Short)var0);
         case IntClass:
            return n3((Integer)var0);
         case LongClass:
            return n3((Long)var0);
         case FloatClass:
            return n3((Float)var0);
         case DoubleClass:
            return n3((Double)var0);
         case DecimalClass:
            return n3((c4)var0);
         case DateTimeClass:
            return n3((j5)var0);
         case StringClass:
            return n3((String)var0, var1);
         default:
            return ((u6)var0).u9(var1);
      }
   }

   public static double n3(Byte var0) {
      return var0 & 0xFF;
   }

   public static double n3(Short var0) {
      return var0.shortValue();
   }

   public static double n3(Character var0) {
      throw new InvalidCastException("Invalid cast from 'Character' to 'Double'.");
   }

   public static double n3(Integer var0) {
      return var0.intValue();
   }

   public static double n3(Long var0) {
      return var0.longValue();
   }

   public static double n3(Float var0) {
      return var0.floatValue();
   }

   public static double n3(Double var0) {
      return var0;
   }

   public static double n3(c4 var0) {
      return c4.h0(var0);
   }

   public static double h0(String var0) {
      return var0 == null ? 0.0 : d2.n5(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static double n3(String var0, h2 var1) {
      return var0 == null ? 0.0 : d2.n5(var0, 231, var1);
   }

   public static double n3(Boolean var0) {
      return var0 ? 1 : 0;
   }

   public static double n3(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Double'.");
   }

   public static c4 y4(Object var0, h2 var1) {
      if (var0 == null) {
         return c4.a6;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return y4((Boolean)var0);
         case CharClass:
            return y4((Character)var0);
         case ByteClass:
            return y4((Byte)var0);
         case ShortClass:
            return y4((Short)var0);
         case IntClass:
            return y4((Integer)var0);
         case LongClass:
            return y4((Long)var0);
         case FloatClass:
            return y4((Float)var0);
         case DoubleClass:
            return y4((Double)var0);
         case DecimalClass:
            return y4((c4)var0);
         case DateTimeClass:
            return y4((j5)var0);
         case StringClass:
            return y4((String)var0, var1);
         default:
            return ((u6)var0).a6(var1);
      }
   }

   public static c4 y4(Boolean var0) {
      return c4.k5(var0 ? 1 : 0);
   }

   public static c4 y4(Byte var0) {
      return c4.n5(var0);
   }

   public static c4 y4(Short var0) {
      return c4.n5(var0);
   }

   public static c4 y4(Character var0) {
      throw new InvalidCastException("Invalid cast from 'Character' to 'Decimal'.");
   }

   public static c4 y4(j5 var0) {
      throw new InvalidCastException("Invalid cast from 'DateTime' to 'Decimal'.");
   }

   public static c4 y4(Integer var0) {
      return c4.k5(var0);
   }

   public static c4 y4(Long var0) {
      return c4.a6(var0);
   }

   public static c4 y4(Float var0) {
      return c4.l6(var0);
   }

   public static c4 y4(Double var0) {
      return c4.l6(var0);
   }

   public static c4 y4(c4 var0) {
      return var0;
   }

   public static c4 y4(String var0, h2 var1) {
      return var0 == null ? c4.a6 : c4.n5(var0, 111, var1);
   }

   public static j5 e2(j5 var0) {
      return var0;
   }

   public static j5 e2(Object var0, h2 var1) {
      if (var0 == null) {
         return j5.l6.m3();
      }

      switch (t9(var0)) {
         case BooleanClass:
            return e2((Boolean)var0);
         case CharClass:
            return e2((Character)var0);
         case ByteClass:
            return e2((Byte)var0);
         case ShortClass:
            return e2((Short)var0);
         case IntClass:
            return e2((Integer)var0);
         case LongClass:
            return e2((Long)var0);
         case FloatClass:
            return e2((Float)var0);
         case DoubleClass:
            return e2((Double)var0);
         case DecimalClass:
            return e2((c4)var0);
         case DateTimeClass:
            return e2((j5)var0);
         case StringClass:
            return c8((String)var0);
         default:
            return ((u6)var0).u3(var1);
      }
   }

   public static j5 c8(String var0) {
      return var0 == null ? new j5(0L) : j5.l6(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static j5 e2(Byte var0) {
      throw new InvalidCastException("Invalid cast from 'Byte' to 'DateTime'.");
   }

   public static j5 e2(Short var0) {
      throw new InvalidCastException("Invalid cast from 'Short' to 'DateTime'.");
   }

   public static j5 e2(Integer var0) {
      throw new InvalidCastException("Invalid cast from 'Integer' to 'DateTime'.");
   }

   public static j5 e2(Long var0) {
      throw new InvalidCastException("Invalid cast from 'Long' to 'DateTime'.");
   }

   public static j5 e2(Boolean var0) {
      throw new InvalidCastException("Invalid cast from 'Boolean' to 'DateTime'.");
   }

   public static j5 e2(Character var0) {
      throw new InvalidCastException("Invalid cast from 'Character' to 'DateTime'.");
   }

   public static j5 e2(Float var0) {
      throw new InvalidCastException("Invalid cast from 'Float' to 'DateTime'.");
   }

   public static j5 e2(Double var0) {
      throw new InvalidCastException("Invalid cast from 'Double' to 'DateTime'.");
   }

   public static j5 e2(c4 var0) {
      throw new InvalidCastException("Invalid cast from 'Decimal' to 'DateTime'.");
   }

   public static String y4(Object var0) {
      return t9(var0, null);
   }

   public static String t9(Object var0, h2 var1) {
      if (var0 == null) {
         return d1.n5;
      }

      switch (t9(var0)) {
         case BooleanClass:
            return n5((Boolean)var0, var1);
         case CharClass:
            return n5((Character)var0, var1);
         case ByteClass:
            return n5((Byte)var0, var1);
         case ShortClass:
            return n5((Short)var0, var1);
         case IntClass:
            return n5((Integer)var0, var1);
         case LongClass:
            return n5((Long)var0, var1);
         case FloatClass:
            return n5((Float)var0, var1);
         case DoubleClass:
            return n5((Double)var0, var1);
         case DecimalClass:
            return n5((c4)var0, var1);
         case DateTimeClass:
            return n5((j5)var0, var1);
         case StringClass:
            return e2((String)var0, var1);
         default:
            u6 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, u6.class);
            if (var2 != null) {
               return var2.t9(var1);
            } else {
               v0 var3 = com.aspose.slides.internal.v6g.k5.n5(var0, v0.class);
               if (var3 != null) {
                  return var3.n5(null, var1);
               } else {
                  return var0 != null ? var0.toString() : d1.n5;
               }
            }
      }
   }

   public static String n5(int var0, int var1) {
      if (var1 != 2 && var1 != 8 && var1 != 10 && var1 != 16) {
         throw new ArgumentException("Invalid Base.");
      }

      String var2 = Integer.toString(var0, var1);
      if (var1 != 10 && var2.startsWith("-")) {
         var2 = var2.substring(1);
      }

      return var2;
   }

   public static String n5(Boolean var0, h2 var1) {
      return n3.l6(var0);
   }

   public static String t9(Character var0) {
      return Character.toString(var0);
   }

   public static String n5(Character var0, h2 var1) {
      return Character.toString(var0);
   }

   public static String n5(short var0, int var1) {
      if (var1 != 2 && var1 != 8 && var1 != 10 && var1 != 16) {
         throw new ArgumentException("Invalid Base.");
      }

      String var2 = Integer.toString(var0, var1);
      if (var1 != 10 && var2.startsWith("-")) {
         var2 = var2.substring(1);
      }

      return var2;
   }

   public static String n5(Byte var0, h2 var1) {
      return e2.n5(var0, var1);
   }

   public static String n5(Short var0, h2 var1) {
      return f0.n5(var0, var1);
   }

   public static String n5(Integer var0, h2 var1) {
      return a3.n5(var0, var1);
   }

   public static String n5(Long var0, h2 var1) {
      return p3.n5(var0, var1);
   }

   public static String n5(Float var0, h2 var1) {
      return n5(var0.doubleValue(), var1);
   }

   public static String n5(Double var0, h2 var1) {
      return d2.n5(var0, var1);
   }

   public static String n5(c4 var0, h2 var1) {
      return var0.n5(null, var1);
   }

   public static String n5(j5 var0, h2 var1) {
      return var0.n5((String)null, var1);
   }

   public static String t2(String var0) {
      return var0;
   }

   public static String e2(String var0, h2 var1) {
      return var0;
   }

   public static byte[] s7(String var0) throws FormatException {
      byte[] var1 = com.aspose.slides.internal.w4w.h0.n5(var0);
      if (var1 == null) {
         throw new FormatException("The string contains invalid characters");
      } else {
         return var1;
      }
   }

   public static int e2(Object var0) {
      if (var0 == null) {
         throw new ArgumentNullException("value");
      }

      switch (t9(var0)) {
         case BooleanClass:
            return 3;
         case CharClass:
            return 4;
         case ByteClass:
            return 6;
         case ShortClass:
            return 7;
         case IntClass:
            return 9;
         case LongClass:
            return 11;
         case FloatClass:
            return 13;
         case DoubleClass:
            return 14;
         case DecimalClass:
            return 15;
         case DateTimeClass:
            return 16;
         case StringClass:
            return 18;
         case ObjectClass:
            return 1;
         default:
            throw new NotImplementedException();
      }
   }

   public static int n5(byte[] var0, int var1, int var2, char[] var3, int var4) {
      throw new NotImplementedException();
   }

   public static String n5(byte[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException("inArray");
      } else {
         return n5(var0, 0, var0.length);
      }
   }

   public static String n5(byte[] var0, int var1, int var2) {
      if (var0 == null) {
         throw new ArgumentNullException("inArray");
      }

      if (var1 >= 0 && var2 >= 0) {
         if (var1 > var0.length - var2) {
            throw new ArgumentOutOfRangeException("offset + length > array.Length");
         }

         byte[] var3 = l6(var0, var1, var2);
         return com.aspose.slides.internal.l7h.j5.e2().l6(var3);
      } else {
         throw new ArgumentOutOfRangeException("offset < 0 || length < 0");
      }
   }

   static void n5(byte[] var0, int var1, int var2, byte[] var3, int var4) {
      byte[] var5 = n5;
      int var6 = var0[var1] & 255;
      int var7 = var0[var1 + 1] & 255;
      int var8 = var0[var1 + 2] & 255;
      var3[var4] = var5[var6 >> 2];
      var3[var4 + 1] = var5[var6 << 4 & 48 | var7 >> 4];
      var3[var4 + 2] = var5[var7 << 2 & 60 | var8 >> 6];
      var3[var4 + 3] = var5[var8 & 63];
   }

   public static byte[] l6(byte[] var0, int var1, int var2) {
      byte var3 = 3;
      byte var4 = 4;
      int var5 = var2 / var3;
      int var6 = var2 % var3;
      byte[] var7 = new byte[var2 != 0 ? (var2 + 2) / var3 * var4 : 0];
      byte var8 = 0;

      for (int var9 = 0; var9 < var5; var9++) {
         n5(var0, var1, var3, var7, var8);
         var1 += var3;
         var8 += var4;
      }

      byte[] var12 = n5;
      switch (var6) {
         case 0:
         default:
            break;
         case 1:
            int var13 = var0[var1] & 255;
            var7[var8] = var12[var13 >> 2];
            var7[var8 + 1] = var12[var13 << 4 & 48];
            var7[var8 + 2] = 61;
            var7[var8 + 3] = 61;
            break;
         case 2:
            int var10 = var0[var1] & 255;
            int var11 = var0[var1 + 1] & 255;
            var7[var8] = var12[var10 >> 2];
            var7[var8 + 1] = var12[var10 << 4 & 48 | var11 >> 4];
            var7[var8 + 2] = var12[var11 << 2 & 60];
            var7[var8 + 3] = 61;
      }

      return var7;
   }

   public static Object n5(Object var0, y8 var1) {
      if (var0 != null && var1 == null) {
         throw new ArgumentNullException("conversionType");
      }

      com.aspose.slides.internal.x7n.l6 var2 = com.aspose.slides.internal.x7n.l6.u3();
      h2 var3;
      if (var1 == com.aspose.slides.internal.v6g.k5.n5(j5.class)) {
         var3 = var2.a6();
      } else {
         var3 = var2.e2();
      }

      return n5(var0, var1, var3, true);
   }

   public static Object n5(Object var0, int var1, h2 var2) {
      y8 var3 = n5(var1);
      return n5(var0, var3, var2, true);
   }

   private static y8 n5(int var0) {
      switch (var0) {
         case 0:
         case 17:
            return null;
         case 1:
            return com.aspose.slides.internal.v6g.k5.n5(Object.class);
         case 2:
            return com.aspose.slides.internal.v6g.k5.n5(z8.class);
         case 3:
            return com.aspose.slides.internal.v6g.k5.n5(Boolean.class);
         case 4:
            return com.aspose.slides.internal.v6g.k5.n5(t9.class);
         case 5:
         case 6:
            return com.aspose.slides.internal.v6g.k5.n5(Byte.class);
         case 7:
         case 8:
            return com.aspose.slides.internal.v6g.k5.n5(Short.class);
         case 9:
         case 10:
            return com.aspose.slides.internal.v6g.k5.n5(Integer.class);
         case 11:
         case 12:
            return com.aspose.slides.internal.v6g.k5.n5(Long.class);
         case 13:
            return com.aspose.slides.internal.v6g.k5.n5(Float.class);
         case 14:
            return com.aspose.slides.internal.v6g.k5.n5(Double.class);
         case 15:
            return com.aspose.slides.internal.v6g.k5.n5(c4.class);
         case 16:
            return com.aspose.slides.internal.v6g.k5.n5(j5.class);
         case 18:
            return com.aspose.slides.internal.v6g.k5.n5(String.class);
         default:
            throw new ArgumentException("typeCode");
      }
   }

   private static Object n5(Object var0, y8 var1, h2 var2, boolean var3) {
      if (var0 == null) {
         if (var1 != null && var1.y1()) {
            throw new InvalidCastException("Null object can not be converted to a value type.");
         } else {
            return null;
         }
      } else if (var1 == null) {
         throw new InvalidCastException("Cannot cast to destination type.");
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0.getClass()) == var1) {
         return var0;
      } else if (var1 == null) {
         throw new ArgumentNullException();
      } else if (var1 == n5(1)) {
         return var0;
      } else if (var1 == n5(2)) {
         throw new InvalidCastException("Cannot cast to DBNull, it's not IConvertible");
      } else if (var1 == n5(3)) {
         return n5(var0, var2);
      } else if (var1 == n5(4)) {
         return l6(var0, var2);
      } else if (var1 == n5(5)) {
         return k5(var0, var2);
      } else if (var1 == n5(6)) {
         return u3(var0, var2);
      } else if (var1 == n5(7)) {
         return a6(var0, var2);
      } else if (var1 == n5(8)) {
         return u9(var0, var2);
      } else if (var1 == n5(9)) {
         return h0(var0, var2);
      } else if (var1 == n5(10)) {
         return c8(var0, var2);
      } else if (var1 == n5(11)) {
         return t2(var0, var2);
      } else if (var1 == n5(12)) {
         return s7(var0, var2);
      } else if (var1 == n5(13)) {
         return x8(var0, var2);
      } else if (var1 == n5(14)) {
         return n3(var0, var2);
      } else if (var1 == n5(15)) {
         return y4(var0, var2);
      } else if (var1 == n5(16)) {
         return e2(var0, var2);
      } else if (var1 == n5(18)) {
         return t9(var0, var2);
      } else if (var3) {
         return var0;
      } else {
         throw new InvalidCastException(
            "Value is not a convertible object: " + com.aspose.slides.internal.v6g.k5.n5(var0.getClass()).toString() + " to " + var1.q0()
         );
      }
   }
}
