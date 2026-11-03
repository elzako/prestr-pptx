package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class t9 {
   public static int n5(char var0, Object var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Character.class) {
         throw new ArgumentException("Value is not a System.Char");
      } else {
         return var0 - z3.l6(var1);
      }
   }

   public static String n5(int var0) {
      if (var0 < 0 || var0 > 1114111) {
         throw new ArgumentOutOfRangeException("utf32", "The argument must be from 0 to 0x10FFFF.");
      }

      if (55296 <= var0 && var0 <= 57343) {
         throw new ArgumentOutOfRangeException("utf32", "The argument must not be in surrogate pair range.");
      }

      if (var0 < 65536) {
         return d1.n5((char)var0, 1);
      }

      var0 -= 65536;
      return d1.n5(new char[]{(char)((var0 >> 10) + 55296), (char)(var0 % 1024 + 56320)});
   }

   public static int n5(char var0, char var1) {
      if (var0 < '\ud800' || '\udbff' < var0) {
         throw new ArgumentOutOfRangeException("highSurrogate");
      } else if (var1 >= '\udc00' && '\udfff' >= var1) {
         return 65536 + (var0 - 55296 << 10) + (var1 - 56320);
      } else {
         throw new ArgumentOutOfRangeException("lowSurrogate");
      }
   }

   public static boolean l6(char var0, char var1) {
      return var0 == var1;
   }

   public static double n5(char var0) {
      return Character.getNumericValue(var0);
   }

   public static int l6(char var0) {
      int var1 = Character.getType(var0);
      return l6(var1);
   }

   private static int l6(int var0) {
      byte var1;
      switch (var0) {
         case 0:
         case 17:
         default:
            var1 = 29;
            break;
         case 1:
            var1 = 0;
            break;
         case 2:
            var1 = 1;
            break;
         case 3:
            var1 = 2;
            break;
         case 4:
            var1 = 3;
            break;
         case 5:
            var1 = 4;
            break;
         case 6:
            var1 = 5;
            break;
         case 7:
            var1 = 7;
            break;
         case 8:
            var1 = 6;
            break;
         case 9:
            var1 = 8;
            break;
         case 10:
            var1 = 9;
            break;
         case 11:
            var1 = 10;
            break;
         case 12:
            var1 = 11;
            break;
         case 13:
            var1 = 12;
            break;
         case 14:
            var1 = 13;
            break;
         case 15:
            var1 = 14;
            break;
         case 16:
            var1 = 15;
            break;
         case 18:
            var1 = 17;
            break;
         case 19:
            var1 = 16;
            break;
         case 20:
            var1 = 19;
            break;
         case 21:
            var1 = 20;
            break;
         case 22:
            var1 = 21;
            break;
         case 23:
            var1 = 18;
            break;
         case 24:
            var1 = 24;
            break;
         case 25:
            var1 = 25;
            break;
         case 26:
            var1 = 26;
            break;
         case 27:
            var1 = 27;
            break;
         case 28:
            var1 = 28;
            break;
         case 29:
            var1 = 22;
            break;
         case 30:
            var1 = 23;
      }

      return var1;
   }

   public static int n5(String var0, int var1) {
      c8(var0, var1);
      return k7(var0.charAt(var1)) ? l6(var0.charAt(var1)) : l6(Character.getType(Character.codePointAt(var0, var1)));
   }

   public static boolean k5(char var0) {
      return l6(var0) == 14;
   }

   public static boolean u3(char var0) {
      return l6(var0) == 8;
   }

   public static boolean l6(String var0, int var1) {
      return n5(var0, var1) == 8;
   }

   public static boolean a6(char var0) {
      return var0 >= '\ud800' && var0 <= '\udbff';
   }

   public static boolean k5(String var0, int var1) {
      c8(var0, var1);
      return a6(var0.charAt(var1));
   }

   private static boolean k7(char var0) {
      return var0 <= 255;
   }

   public static boolean u9(char var0) {
      return l6(var0) <= 4;
   }

   public static boolean h0(char var0) {
      int var1 = l6(var0);
      return var1 <= 4 || var1 == 8;
   }

   public static boolean c8(char var0) {
      return l6(var0) == 1;
   }

   public static boolean t2(char var0) {
      return var0 >= '\udc00' && var0 <= '\udfff';
   }

   public static boolean s7(char var0) {
      int var1 = l6(var0);
      return var1 >= 8 && var1 <= 10;
   }

   public static boolean x8(char var0) {
      int var1 = l6(var0);
      return var1 >= 18 && var1 <= 24;
   }

   public static boolean n3(char var0) {
      int var1 = l6(var0);
      return var1 >= 11 && var1 <= 13;
   }

   public static boolean y4(char var0) {
      return var0 >= '\ud800' && var0 <= '\udfff';
   }

   public static boolean u3(String var0, int var1) {
      c8(var0, var1);
      return y4(var0.charAt(var1));
   }

   public static boolean k5(char var0, char var1) {
      return var0 >= '\ud800' && var0 <= '\udbff' ? var1 >= '\udc00' && var1 <= '\udfff' : false;
   }

   public static boolean a6(String var0, int var1) {
      c8(var0, var1);
      return var1 + 1 < var0.length() && k5(var0.charAt(var1), var0.charAt(var1 + 1));
   }

   public static boolean e2(char var0) {
      return l6(var0) == 0;
   }

   public static boolean u9(String var0, int var1) {
      c8(var0, var1);
      return e2(var0.charAt(var1));
   }

   public static boolean t9(char var0) {
      if (var0 < 5760) {
         return var0 == ' ' || var0 >= '\t' && var0 <= '\r' || var0 == 133 || var0 == 160;
      }

      int var1 = l6(var0);
      return var1 > 10 && var1 <= 13 && var0 != 8203;
   }

   public static boolean h0(String var0, int var1) {
      c8(var0, var1);
      return t9(var0.charAt(var1));
   }

   public static char z1(char var0) {
      return n5(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static char n5(char var0, com.aspose.slides.internal.x7n.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("culture");
      } else {
         return var1.n3().n5(var0);
      }
   }

   public static char t4(char var0) {
      return Character.toLowerCase(var0);
   }

   public static String q0(char var0) {
      return d1.n5(var0, 1);
   }

   public static String n5(char var0, h2 var1) {
      return q0(var0);
   }

   public static char z3(char var0) {
      return l6(var0, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static char l6(char var0, com.aspose.slides.internal.x7n.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("culture");
      } else {
         return var1.n3().l6(var0);
      }
   }

   public static char m1(char var0) {
      return Character.toUpperCase(var0);
   }

   public static boolean n5(String var0, char[] var1) {
      if (var0 != null && var0.length() == 1) {
         var1[0] = var0.charAt(0);
         return true;
      } else {
         var1[0] = 0;
         return false;
      }
   }

   private static void c8(String var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("s");
      } else if (var1 < 0 || var1 >= var0.length()) {
         throw new ArgumentOutOfRangeException("The value of index is less than zero, or greater than or equal to the length of s.");
      }
   }
}
