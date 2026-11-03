package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.NullReferenceException;

public final class d1 {
   private static final y8 k5 = com.aspose.slides.internal.v6g.k5.n5(t1.class);
   public static String n5 = "";
   static final char[] l6 = new char[]{
      '\t',
      '\n',
      '\u000b',
      '\f',
      '\r',
      ' ',
      '\u0085',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      ' ',
      '\u200b',
      '\u2028',
      '\u2029',
      '　',
      '\ufeff'
   };

   public static String n5(Object var0) {
      if (var0 == null) {
         return n5;
      } else {
         return var0.getClass() == byte.class ? n5((Byte)var0) : new String(var0.toString());
      }
   }

   public static String n5(char[] var0, int var1, int var2) {
      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length");
      } else if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startIndex");
      } else if (var0 == null) {
         throw new ArgumentNullException("value");
      } else if ((long)var1 + var2 > var0.length) {
         throw new ArgumentOutOfRangeException("startIndex");
      } else {
         return new String(var0, var1, var2);
      }
   }

   public static String n5(char[] var0) {
      return var0 == null ? n5 : new String(var0);
   }

   public static boolean n5(String var0) {
      return var0 == null || var0.length() == 0;
   }

   public static String n5(char var0, int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var1 == 0) {
         return "";
      }

      char[] var2 = new char[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static String n5(String var0, int var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative.");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("count", "Cannot be negative.");
      } else if (var1 > var0.length() - var2) {
         throw new ArgumentOutOfRangeException("count", "startIndex + count > this.length");
      } else {
         return new StringBuilder(var0).delete(var1, var1 + var2).toString();
      }
   }

   public static String n5(String var0, int var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "StartIndex can not be less than zero");
      } else if (var1 >= var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "StartIndex must be less than the length of the string");
      } else {
         return n5(var0, var1, var0.length() - var1);
      }
   }

   public static String n5(String var0, char var1, char var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return var0.replace(var1, var2);
      }
   }

   public static String n5(String var0, String var1, String var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("oldValue");
      }

      if (var1.length() == 0) {
         throw new ArgumentException("oldValue is the empty string.");
      }

      if (var0.length() == 0) {
         return var0;
      }

      if (var2 == null) {
         var2 = n5;
      }

      return var0.replace(var1, var2);
   }

   public static String n5(String var0, Object... var1) {
      if (var0 == null) {
         throw new ArgumentNullException("format");
      } else if (var1 == null) {
         throw new ArgumentNullException("args");
      } else {
         return n5((h2)null, var0, var1);
      }
   }

   public static String n5(h2 var0, String var1, Object... var2) {
      com.aspose.slides.internal.l7h.a5 var3 = n5(null, var0, var1, var2);
      return var3.toString();
   }

   public static com.aspose.slides.internal.l7h.a5 n5(com.aspose.slides.internal.l7h.a5 var0, h2 var1, String var2, Object... var3) {
      if (var1 == null) {
         var1 = com.aspose.slides.internal.x7n.s7.x8();
      }

      if (var2 == null) {
         throw new ArgumentNullException("format");
      }

      if (var3 == null) {
         throw new ArgumentNullException("args");
      }

      if (var0 == null) {
         int var4 = 0;

         int var5;
         for (var5 = 0; var5 < var3.length; var5++) {
            Object var6 = var3[var5];
            String var7 = var6 instanceof String ? (String)var6 : null;
            if (var7 == null) {
               break;
            }

            var4 += var7.length();
         }

         if (var5 == var3.length) {
            var0 = new com.aspose.slides.internal.l7h.a5(var4 + var2.length());
         } else {
            var0 = new com.aspose.slides.internal.l7h.a5();
         }
      }

      int var22 = 0;
      int var21 = var22;

      while (var22 < var2.length()) {
         char var23 = var2.charAt(var22++);
         if (var23 == '{') {
            var0.n5(var2, var21, var22 - var21 - 1);
            if (var2.charAt(var22) == '{') {
               var21 = var22++;
            } else {
               int var24 = 0;
               int var8 = 0;
               boolean var9 = false;
               String var10 = null;
               int[] var11 = new int[]{var22};
               int[] var12 = new int[]{0};
               int[] var13 = new int[]{0};
               boolean[] var14 = new boolean[]{false};
               String[] var15 = new String[]{var10};
               n5(var2, var11, var12, var13, var14, var15);
               var22 = var11[0];
               var24 = var12[0];
               var8 = var13[0];
               var9 = var14[0];
               var10 = var15[0];
               if (var24 >= var3.length) {
                  throw new FormatException("Index (zero based) must be greater than or equal to zero and less than the size of the argument list.");
               }

               Object var16 = var3[var24];
               t1 var17 = null;
               if (var1 != null) {
                  var17 = (t1)var1.n5(k5);
               }

               String var18;
               if (var16 == null) {
                  var18 = n5;
               } else if (var17 != null) {
                  var18 = var17.n5(var10, var16, var1);
               } else if (l6(var16)) {
                  var18 = com.aspose.slides.internal.w4w.y4.n5(var16, var10, var1);
               } else if (var16 instanceof v0) {
                  var18 = ((v0)var16).n5(var10, var1);
               } else {
                  var18 = var16.toString();
               }

               if (var18 == null) {
                  var18 = n5;
               }

               if (var8 > var18.length()) {
                  char var19 = ' ';
                  int var20 = var8 - var18.length();
                  if (var9) {
                     var0.n5(var18);
                     var0.n5(var19, var20);
                  } else {
                     var0.n5(var19, var20);
                     var0.n5(var18);
                  }
               } else {
                  var0.n5(var18);
               }

               var21 = var22;
            }
         } else if (var23 == '}' && var22 < var2.length() && var2.charAt(var22) == '}') {
            var0.n5(var2, var21, var22 - var21 - 1);
            var21 = var22++;
         } else if (var23 == '}') {
            throw new FormatException("Input string was not in a correct format.");
         }
      }

      if (var21 < var2.length()) {
         var0.n5(var2, var21, var2.length() - var21);
      }

      return var0;
   }

   private static void n5(String var0, int[] var1, int[] var2, int[] var3, boolean[] var4, String[] var5) {
      int var6 = var0.length();
      var2[0] = n5(var0, var1);
      if (var2[0] < 0) {
         throw new FormatException("Input string was not in a correct format.");
      }

      if (var1[0] < var6 && var0.charAt(var1[0]) == ',') {
         var1[0]++;

         while (var1[0] < var6 && t9.t9(var0.charAt(var1[0]))) {
            var1[0]++;
         }

         int var7 = var1[0];
         var5[0] = l6(var0, var7, var1[0] - var7);
         var4[0] = var1[0] < var6 && var0.charAt(var1[0]) == '-';
         if (var4[0]) {
            var1[0]++;
         }

         var3[0] = n5(var0, var1);
         if (var3[0] < 0) {
            throw new FormatException("Input string was not in a correct format.");
         }
      } else {
         var3[0] = 0;
         var4[0] = false;
         var5[0] = n5;
      }

      if (var1[0] < var6 && var0.charAt(var1[0]) == ':') {
         int var8 = ++var1[0];

         while (var1[0] < var6 && var0.charAt(var1[0]) != '}') {
            var1[0]++;
         }

         var5[0] = n5(var5[0], l6(var0, var8, var1[0] - var8));
      } else {
         var5[0] = null;
      }

      if (var1[0] >= var6 || var0.charAt(var1[0]++) != '}') {
         throw new FormatException("Input string was not in a correct format.");
      }
   }

   private static int n5(String var0, int[] var1) {
      int var2 = var1[0];
      int var3 = 0;

      int var4;
      for (var4 = var0.length(); var2 < var4; var2++) {
         char var5 = var0.charAt(var2);
         if (var5 < '0' || '9' < var5) {
            break;
         }

         var3 = var3 * 10 + var5 - 48;
      }

      if (var2 != var1[0] && var2 != var4) {
         var1[0] = var2;
         return var3;
      } else {
         return -1;
      }
   }

   public static void n5(String var0, int var1, char[] var2, int var3, int var4) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var2 == null) {
         throw new ArgumentNullException("destination");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("sourceIndex", "Cannot be negative");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("destinationIndex", "Cannot be negative.");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("count", "Cannot be negative.");
      }

      if (var1 > var0.length() - var4) {
         throw new ArgumentOutOfRangeException("sourceIndex", "sourceIndex + count > Length");
      }

      if (var3 > var2.length - var4) {
         throw new ArgumentOutOfRangeException("destinationIndex", "destinationIndex + count > destination.Length");
      }

      var0.getChars(var1, var1 + var4, var2, var3);
   }

   public static String n5(String var0, int var1, String var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var2 == null) {
         throw new ArgumentNullException("value");
      } else if (var1 < 0 || var1 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative and must be less than or equal to length of string.");
      } else if (var2.length() == 0) {
         return var0;
      } else {
         return var0.length() == 0 ? var2 : new StringBuilder(var0).insert(var1, var2).toString();
      }
   }

   public static int n5(String var0, char[] var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException();
      } else {
         return var0.length() == 0 ? -1 : n5(var0, var1, 0);
      }
   }

   public static int n5(String var0, char[] var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException();
      } else if (var2 < 0 || var2 > var0.length()) {
         throw new ArgumentOutOfRangeException();
      } else {
         return !n5(var0) && var1 != null && var1.length != 0 && var2 <= var0.length() ? n5(var0, var1, var2, var0.length() - var2) : -1;
      }
   }

   public static int n5(String var0, char[] var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var2 >= 0 && var2 <= var0.length()) {
         if (var3 >= 0 && var2 <= var0.length() - var3) {
            int var4 = var2 + var3;
            int var5 = var4 - 1;
            int var6 = var1.length;
            int var7 = var6 - 1;

            for (int var8 = var2; var8 < var4; var8++) {
               char var9 = var0.charAt(var8);

               for (int var10 = 0; var10 < var6; var10++) {
                  if (var1[var10] == var9) {
                     if (var8 >= var5 || var10 >= var7 || !Character.isHighSurrogate(var9)) {
                        return var8;
                     }

                     if (var1[var10 + 1] == var0.charAt(var8 + 1)) {
                        return var8;
                     }
                  }
               }
            }

            return -1;
         } else {
            throw new ArgumentOutOfRangeException("count", "Count cannot be negative, and startIndex + count must be less than length of the string.");
         }
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public static int l6(String var0, char[] var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var0.length() == 0) {
         return -1;
      }

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var0.charAt(var2) == var1[var3]) {
               return var2;
            }
         }
      }

      return -1;
   }

   public static String l6(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return k5(var0, l6);
      }
   }

   public static String k5(String var0, char... var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null || var1.length == 0) {
         return l6(var0);
      }

      if (var0.length() == 0) {
         return n5;
      }

      int var2 = var0.length();
      int var3 = 0;

      while (var3 < var2 && n5(var1, var0.charAt(var3))) {
         var3++;
      }

      while (var3 < var2 && n5(var1, var0.charAt(var2 - 1))) {
         var2--;
      }

      return var3 <= 0 && var2 >= var0.length() ? var0 : var0.substring(var3, var2);
   }

   public static String k5(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return u3(var0, l6);
      }
   }

   public static String u3(String var0, char... var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var0.length() == 0) {
         return n5;
      }

      int var2 = var0.length();
      int var3 = 0;
      if (var1 != null && var1.length != 0) {
         while (var3 < var2 && n5(var1, var0.charAt(var3))) {
            var3++;
         }
      } else {
         var3 = n5(var0, 0, var0.length(), 1);
      }

      return var3 > 0 ? var0.substring(var3) : var0;
   }

   public static String a6(String var0, char... var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var0.length() == 0) {
         return n5;
      }

      int var4 = var0.length();
      byte var3 = 0;
      if (var1 != null && var1.length != 0) {
         while (var3 < var4 && n5(var1, var0.charAt(var4 - 1))) {
            var4--;
         }
      } else {
         var4 = n5(var0, var0.length() - 1, -1, -1);
         var4++;
      }

      return var4 < var0.length() ? var0.substring(var3, var4) : var0;
   }

   private static int n5(String var0, int var1, int var2, int var3) {
      while (var1 != var2) {
         char var4 = var0.charAt(var1);
         if (var4 < 133) {
            if (var4 != ' ' && (var4 < '\t' || var4 > '\r')) {
               return var1;
            }
         } else if (var4 != 160
            && var4 != '\ufeff'
            && var4 != 12288
            && var4 != 133
            && var4 != 5760
            && var4 != 8232
            && var4 != 8233
            && (var4 < 8192 || var4 > 8203)) {
            return var1;
         }

         var1 += var3;
      }

      return var1;
   }

   private static boolean n5(char[] var0, char var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public static String n5(String var0, String[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var0 == null) {
         var0 = "";
      }

      StringBuilder var2 = new StringBuilder();
      boolean var3 = true;

      for (String var7 : var1) {
         if (var3) {
            var3 = false;
         } else {
            var2.append(var0);
         }

         if (var7 != null) {
            var2.append(var7);
         }
      }

      return var2.toString();
   }

   public static String n5(String var0, String[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentOutOfRangeException("startIndex", "startIndex + count > value.length");
      }

      if (var2 == var1.length) {
         return n5;
      }

      if (var0 == null) {
         var0 = n5;
      }

      String var4 = n5;
      boolean var5 = true;

      for (int var6 = var2; var6 < var2 + var3; var6++) {
         String var7 = var1[var6];
         if (var7 == null) {
            var7 = n5;
         }

         if (var5) {
            var5 = false;
            var4 = h0(var1[var6]);
         } else {
            var4 = n5(new String[]{var4, var0, var7});
         }
      }

      return var4;
   }

   public static String[] n5(String var0, char var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      int[] var2 = new int[var0.length()];
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         if (var0.charAt(var4) == var1) {
            var2[var3++] = var4;
         }
      }

      String[] var9 = new String[var3 + 1];
      if (var3 == 0) {
         var9[0] = var0;
         return var9;
      }

      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var2[var7];
         var9[var5++] = var0.substring(var6, var8);
         var6 = var8 + 1;
      }

      var9[var5] = var0.substring(var6, var0.length());
      return var9;
   }

   public static String[] u3(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return u9(var0, (char[])null);
      }
   }

   public static String[] n5(String var0, String[] var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, Integer.MAX_VALUE, var2);
      }
   }

   public static String[] l6(String var0, String[] var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("count", "Count cannot be less than zero.");
      }

      if (var3 != 0 && var3 != 1) {
         throw new ArgumentException(n5(new Object[]{"Illegal enum value: ", var3, "."}));
      }

      if (var2 <= 1) {
         return var2 == 0 ? new String[0] : new String[]{var0};
      }

      boolean var4 = (var3 & 1) != 0;
      if (var1 == null || var1.length == 0) {
         return n5(var0, null, var2, var4);
      }

      if (var0.length() == 0 && var4) {
         return new String[0];
      }

      List var5 = new List();
      int var6 = 0;

      int var7;
      for (var7 = 0; var6 < var0.length(); var7++) {
         int var8 = -1;
         int var9 = Integer.MAX_VALUE;

         for (int var10 = 0; var10 < var1.length; var10++) {
            String var11 = var1[var10];
            if (var11 != null && var11.length() != 0) {
               int var12 = l6(var0, var11, var6, var0.length() - var6, (short)4);
               if (var12 >= 0 && var12 < var9) {
                  var8 = var10;
                  var9 = var12;
               }
            }
         }

         if (var8 == -1) {
            break;
         }

         if (var9 != var6 || !var4) {
            if (var5.size() == var2 - 1) {
               break;
            }

            var5.addItem(l6(var0, var6, var9 - var6));
         }

         var6 = var9 + var1[var8].length();
      }

      if (var7 == 0) {
         return new String[]{var0};
      }

      if (var4 && var7 != 0 && var6 == var0.length() && var5.size() == 0) {
         return new String[0];
      }

      if (!var4 || var6 != var0.length()) {
         var5.addItem(k5(var0, var6));
      }

      return (String[])var5.toArray(new String[0]);
   }

   public static String[] u9(String var0, char... var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, Integer.MAX_VALUE, 0);
      }
   }

   public static String[] l6(String var0, char[] var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("count", "Count cannot be less than zero.");
      } else if (var3 != 0 && var3 != 1) {
         throw new ArgumentException(n5(new Object[]{"Illegal enum value: ", var3, "."}));
      } else if (var0.length() == 0 && (var3 & 1) != 0) {
         return new String[0];
      } else if (var2 <= 1) {
         return var2 == 0 ? new String[0] : new String[]{var0};
      } else {
         return n5(var0, var1, var2, var3 != 0);
      }
   }

   private static String[] n5(String var0, char[] var1, int var2, boolean var3) {
      if (var1 == null || var1.length == 0) {
         var1 = l6;
      }

      int[] var4 = new int[var0.length()];
      int var5 = 0;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         for (int var7 = 0; var7 < var1.length; var7++) {
            if (var0.charAt(var6) == var1[var7]) {
               var4[var5++] = var6;
               break;
            }
         }
      }

      if (var5 == var0.length() && var3) {
         return new String[0];
      }

      int var18 = var5;
      if (var2 != Integer.MAX_VALUE && var2 < var5) {
         var18 = var2;
      }

      String[] var19 = new String[var18 + 1];
      if (var5 == 0) {
         var19[0] = var0;
         return var19;
      }

      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var18 && (var2 == Integer.MAX_VALUE || var10 < var2 - 1); var10++) {
         int var11 = var4[var10];
         String var12 = var0.substring(var9, var11);
         if (!var12.equals(n5) || !var3) {
            var19[var8++] = var12;
         }

         var9 = var11 + 1;
      }

      String var20 = var0.substring(var9, var0.length());
      if (!var3 || !var20.equals(n5)) {
         if (var20.length() > 0) {
            var20 = h0(var20, var1);
         }

         var19[var8] = var20;
      }

      if (var19.length > var2 && !var3) {
         String[] var22 = new String[var2];
         u3.n5(var19, 0, var22, 0, var2);
         return var22;
      }

      if (!var3) {
         return var19;
      }

      int var21 = 0;
      int var23 = 0;
      int[] var13 = new int[var19.length];

      for (String var17 : var19) {
         if (var17 != null && !var17.equals(n5)) {
            var13[var21++] = var23;
         }

         var23++;
      }

      if (var21 <= 0) {
         return new String[0];
      }

      String[] var24 = new String[var21];

      for (int var25 = 0; var25 < var21; var25++) {
         var24[var25] = var19[var13[var25]];
      }

      if (var21 >= var2 || n5(var24[var21 - 1], var1) == -1) {
         return var24;
      }

      if (var21 == 1) {
         return n5(var24[var21 - 1], var1, var2, var3);
      }

      String[] var26 = n5(var24[var21 - 1], var1, var2 - var21, var3);

      for (int var27 = 0; var27 < var26.length; var27++) {
         var24[var21 - 1 + var27] = var26[0];
      }

      return var24;
   }

   private static String h0(String var0, char[] var1) {
      String var2 = var0;

      while (n5(var2, var1) == 0) {
         var2 = k5(var2, 1);
      }

      return var2;
   }

   public static String[] n5(String var0, char[] var1, short var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, Integer.MAX_VALUE, var2);
      }
   }

   public static String n5(String var0, String var1) {
      if (var0 == null) {
         var0 = "";
      }

      if (var1 == null) {
         var1 = "";
      }

      return var0 + var1;
   }

   public static String l6(String var0, char var1) {
      if (var0 == null) {
         var0 = "";
      }

      return var0 + var1;
   }

   public static String l6(String var0, int var1) {
      if (var0 == null) {
         var0 = "";
      }

      return var0 + var1;
   }

   public static String n5(String var0, Object var1) {
      if (var0 == null) {
         var0 = "";
      }

      return var0 + var1;
   }

   public static String a6(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      }
   }

   public static boolean l6(String var0, String var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, 0L);
      }
   }

   public static boolean n5(String var0, String var1, short var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      switch (var2) {
         case 0:
            return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, 0L);
         case 1:
            return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, 1L);
         case 2:
            return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, 0L);
         case 3:
            return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, 1L);
         case 4:
            return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, 1073741824L);
         case 5:
            return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, 268435456L);
         default:
            String var3 = n5("Invalid value '{0}' for StringComparison", new Object[]{var2});
            throw new ArgumentException(var3, "comparisonType");
      }
   }

   public static boolean l6(String var0, String var1, short var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      switch (var2) {
         case 0:
            return com.aspose.slides.internal.x7n.l6.u3().t9().k5(var0, var1, 0L);
         case 1:
            return com.aspose.slides.internal.x7n.l6.u3().t9().k5(var0, var1, 1L);
         case 2:
            return com.aspose.slides.internal.x7n.l6.k5().t9().k5(var0, var1, 0L);
         case 3:
            return com.aspose.slides.internal.x7n.l6.k5().t9().k5(var0, var1, 1L);
         case 4:
            return com.aspose.slides.internal.x7n.l6.u3().t9().k5(var0, var1, 1073741824L);
         case 5:
            return com.aspose.slides.internal.x7n.l6.u3().t9().k5(var0, var1, 268435456L);
         default:
            throw new ArgumentException(n5("Invalid value '{0}' for StringComparison", new Object[]{var2}), "comparisonType");
      }
   }

   public static boolean k5(String var0, String var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         return com.aspose.slides.internal.x7n.l6.u3().t9().k5(var0, var1, 0L);
      }
   }

   public static String u9(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return n5(var0, com.aspose.slides.internal.x7n.l6.u3());
      }
   }

   public static String n5(String var0, com.aspose.slides.internal.x7n.l6 var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException("culture");
      } else {
         return var0.toLowerCase(com.aspose.slides.internal.x7n.l6.n5(var1));
      }
   }

   private static String n5(int var0, char var1) throws IndexOutOfBoundsException {
      if (var0 < 0) {
         throw new IndexOutOfBoundsException("Cannot pad a negative amount: " + var0);
      }

      char[] var2 = new char[var0];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1;
      }

      return new String(var2);
   }

   public static String n5(String var0, int var1, char var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("totalWidth", "< 0");
      }

      if (var0 == null) {
         return null;
      }

      int var3 = var1 - var0.length();
      return var3 <= 0 ? var0 : n5(var3, var2).concat(var0);
   }

   public static String h0(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("str");
      }

      int var1 = var0.length();
      return new String(var0.toCharArray(), 0, var1);
   }

   public static int u3(String var0, String var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return n5(var0, var1, var0.length() - 1, var0.length());
      }
   }

   public static int k5(String var0, String var1, short var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var0.length() == 0) {
         return var1.length() == 0 ? 0 : -1;
      } else {
         return n5(var0, var1, var0.length() - 1, var0.length(), var2);
      }
   }

   public static int n5(String var0, String var1, int var2, short var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return n5(var0, var1, var2, var2 + 1, var3);
      }
   }

   public static int n5(String var0, String var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var0.length() == 0) {
         return var1.length() == 0 ? 0 : -1;
      }

      if (var2 < -1 || var2 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "< 0 || > this.Length");
      }

      if (var3 >= 0 && var3 <= var0.length()) {
         if (var2 - var3 + 1 < 0) {
            throw new ArgumentOutOfRangeException("startIndex - count + 1 < 0");
         }

         if (var1.length() == 0) {
            return Math.min(var0.length() - 1, var2);
         }

         if (var2 == 0 && var0.length() == 0) {
            return -1;
         }

         if (var0.length() == 0 && var1.length() > 0) {
            return -1;
         }

         if (var3 == 0) {
            return -1;
         }

         if (var2 == var0.length()) {
            var2--;
         }

         return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, var2, var3);
      } else {
         throw new ArgumentOutOfRangeException("count", "< 0 || > this.Length");
      }
   }

   public static int k5(String var0, char var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return var0.length() == 0 ? -1 : n5(var0, var1, var0.length() - 1, var0.length());
      }
   }

   public static int n5(String var0, char var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return n5(var0, var1, var2, var2 + 1);
      }
   }

   public static int n5(String var0, char var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var0.length() == 0) {
         return -1;
      }

      if (var2 < 0 || var2 >= var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "< 0 || >= this.Length");
      }

      if (var3 >= 0 && var3 <= var0.length()) {
         if (var2 - var3 + 1 < 0) {
            throw new ArgumentOutOfRangeException("startIndex - count + 1 < 0");
         }

         int var4 = var2 - var3 + 1;
         int var5 = var2 + 1;
         String var6 = var0.substring(var4, var5);
         int var7 = var6.lastIndexOf(var1, var3 - 1);
         int var8;
         return var7 >= 0 ? (var8 = var7 + var4) : var7;
      } else {
         throw new ArgumentOutOfRangeException("count", "< 0 || > this.Length");
      }
   }

   public static int n5(String var0, String var1, int var2, int var3, short var4) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var0.length() == 0) {
         return var1.length() == 0 ? 0 : -1;
      }

      if (var4 < 0 || var4 > 5) {
         throw new ArgumentException("comparisonType");
      }

      if (var1.length() == 0) {
         return Math.min(var0.length() - 1, var2);
      }

      if (var2 < 0 || var2 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex");
      }

      if (var3 >= 0 && var2 >= var3 - 1) {
         switch (var4) {
            case 0:
               return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, var2, var3, 0L);
            case 1:
               return com.aspose.slides.internal.x7n.l6.u3().t9().l6(var0, var1, var2, var3, 1L);
            case 2:
               return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, var2, var3, 0L);
            case 3:
               return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, var2, var3, 1L);
            case 4:
               return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, var2, var3, 1073741824L);
            case 5:
               return com.aspose.slides.internal.x7n.l6.k5().t9().l6(var0, var1, var2, var3, 268435456L);
            default:
               String var5 = n5("Invalid value '{0}' for StringComparison", new Object[]{var4});
               throw new ArgumentException(var5, "comparisonType");
         }
      } else {
         throw new ArgumentOutOfRangeException("count");
      }
   }

   public static boolean a6(String var0, String var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static boolean l6(String var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static boolean u3(String var0, String var1, short var2) {
      return var0 == var1 || var0 != null && var1 != null && a6(var0, var1, var2) == 0;
   }

   public static int u9(String var0, String var1) {
      return com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, 0L);
   }

   public static int n5(String var0, String var1, boolean var2) {
      return com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, var2 ? 1L : 0L);
   }

   public static int n5(String var0, String var1, boolean var2, com.aspose.slides.internal.x7n.l6 var3) {
      if (var3 == null) {
         throw new ArgumentNullException("culture");
      } else {
         return var3.t9().n5(var0, var1, var2 ? 1L : 0L);
      }
   }

   public static int n5(String var0, int var1, String var2, int var3, int var4) {
      return n5(var0, var1, var2, var3, var4, false, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static int n5(String var0, int var1, String var2, int var3, int var4, boolean var5) {
      return n5(var0, var1, var2, var3, var4, var5, com.aspose.slides.internal.x7n.l6.u3());
   }

   public static int n5(String var0, int var1, String var2, int var3, int var4, boolean var5, com.aspose.slides.internal.x7n.l6 var6) {
      if (var6 == null) {
         throw new ArgumentNullException("culture");
      }

      if (var4 == 0) {
         return 0;
      }

      if (var0 == null) {
         return var2 == null ? 0 : -1;
      }

      if (var2 == null) {
         return 1;
      }

      if (var1 <= var0.length() && var3 <= var2.length() && var1 >= 0 && var3 >= 0 && var4 >= 0) {
         long var7;
         if (var5) {
            var7 = 1L;
         } else {
            var7 = 0L;
         }

         int var9 = var4;
         int var10 = var4;
         if (var4 > var0.length() - var1) {
            var9 = var0.length() - var1;
         }

         if (var4 > var2.length() - var3) {
            var10 = var2.length() - var3;
         }

         return var6.t9().n5(var0, var1, var9, var2, var3, var10, var7);
      } else {
         throw new ArgumentException();
      }
   }

   public static int a6(String var0, String var1, short var2) {
      switch (var2) {
         case 0:
            return n5(var0, var1, false, com.aspose.slides.internal.x7n.l6.u3());
         case 1:
            return n5(var0, var1, true, com.aspose.slides.internal.x7n.l6.u3());
         case 2:
            return n5(var0, var1, false, com.aspose.slides.internal.x7n.l6.k5());
         case 3:
            return n5(var0, var1, true, com.aspose.slides.internal.x7n.l6.k5());
         case 4:
            return h0(var0, var1);
         case 5:
            return s7(var0, var1);
         default:
            String var3 = n5("Invalid value '{0}' for StringComparison", new Object[]{var2});
            throw new ArgumentException(var3 + "\r\nParameter name: comparisonType");
      }
   }

   public static int n5(String var0, int var1, String var2, int var3, int var4, short var5) {
      switch (var5) {
         case 0:
            return n5(var0, var1, var2, var3, var4, false, com.aspose.slides.internal.x7n.l6.u3());
         case 1:
            return n5(var0, var1, var2, var3, var4, true, com.aspose.slides.internal.x7n.l6.u3());
         case 2:
            return n5(var0, var1, var2, var3, var4, false, com.aspose.slides.internal.x7n.l6.k5());
         case 3:
            return n5(var0, var1, var2, var3, var4, true, com.aspose.slides.internal.x7n.l6.k5());
         case 4:
            return l6(var0, var1, var2, var3, var4);
         case 5:
            return k5(var0, var1, var2, var3, var4);
         default:
            String var6 = n5("Invalid value '{0}' for StringComparison", new Object[]{var5});
            throw new ArgumentException(var6 + "\r\nParameter name: comparisonType");
      }
   }

   public static int h0(String var0, String var1) {
      if (var0 == null && var1 == null) {
         return 0;
      } else {
         return var1 == null ? 1 : var0.compareTo(var1);
      }
   }

   public static int l6(String var0, int var1, String var2, int var3, int var4) {
      if (var1 <= var0.length() && var3 <= var2.length() && var1 >= 0 && var3 >= 0 && var4 >= 0) {
         String var5 = var0.substring(var1, Math.min(var1 + var4, var0.length()));
         String var6 = var2.substring(var3, Math.min(var3 + var4, var2.length()));
         return var5.compareTo(var6);
      } else {
         throw new ArgumentException();
      }
   }

   private static int s7(String var0, String var1) {
      return var0.compareToIgnoreCase(var1);
   }

   private static int k5(String var0, int var1, String var2, int var3, int var4) {
      if (var1 <= var0.length() && var3 <= var2.length() && var1 >= 0 && var3 >= 0 && var4 >= 0) {
         String var5 = var0.substring(var1, var1 + var4);
         String var6 = var2.substring(var3, var3 + var4);
         return var5.compareToIgnoreCase(var6);
      } else {
         throw new ArgumentException();
      }
   }

   public static int c8(String var0, String var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException("value");
      } else if (var1.length() == 0) {
         return 0;
      } else {
         return var0.length() == 0 ? -1 : com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, 0, var0.length(), 1073741824L);
      }
   }

   public static int n5(String var0, String var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, var2, var0.length() - var2);
      }
   }

   public static int u3(String var0, char var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, 0);
      }
   }

   public static int l6(String var0, char var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "< 0");
      } else if (var2 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "startIndex > this.length");
      } else {
         return (var2 != 0 || var0.length() != 0) && var2 != var0.length() ? var0.indexOf(var1, var2) : -1;
      }
   }

   public static int l6(String var0, char var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var2 < 0 || var2 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative and must be< 0");
      } else if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "< 0");
      } else if (var2 > var0.length() - var3) {
         throw new ArgumentOutOfRangeException("count", "startIndex + count > this.length");
      } else if ((var2 != 0 || var0.length() != 0) && var2 != var0.length() && var3 != 0) {
         int var4 = var0.indexOf(var1, var2);
         return var4 >= var2 + var3 ? -1 : var4;
      } else {
         return -1;
      }
   }

   public static int u9(String var0, String var1, short var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, 0, var0.length(), var2);
      }
   }

   public static int l6(String var0, String var1, int var2, short var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, var1, var2, var0.length() - var2, var3);
      }
   }

   public static int l6(String var0, String var1, int var2, int var3, short var4) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      switch (var4) {
         case 0:
            return com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, var2, var3, 0L);
         case 1:
            return com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, var2, var3, 1L);
         case 2:
            return com.aspose.slides.internal.x7n.l6.k5().t9().n5(var0, var1, var2, var3, 0L);
         case 3:
            return com.aspose.slides.internal.x7n.l6.k5().t9().n5(var0, var1, var2, var3, 1L);
         case 4:
            return com.aspose.slides.internal.x7n.l6.k5().t9().n5(var0, var1, var2, var3, 1073741824L);
         case 5:
            return com.aspose.slides.internal.x7n.l6.k5().t9().n5(var0, var1, var2, var3, 268435456L);
         default:
            String var5 = n5("Invalid value '{0}' for StringComparison", new Object[]{var4});
            throw new ArgumentException(var5, "comparisonType");
      }
   }

   public static int l6(String var0, String var1, int var2, int var3) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 >= 0 && var2 <= var0.length()) {
         if (var3 < 0 || var2 > var0.length() - var3) {
            throw new ArgumentOutOfRangeException("count", "Cannot be negative, and should point to location in string.");
         } else if (var1.length() == 0) {
            return var2;
         } else if (var2 == 0 && var0.length() == 0) {
            return -1;
         } else {
            return var3 == 0 ? -1 : com.aspose.slides.internal.x7n.l6.u3().t9().n5(var0, var1, var2, var3);
         }
      } else {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative, and should not exceed length of string.");
      }
   }

   private static String[] l6(Object[] var0) {
      String[] var1 = new String[var0.length];
      int var2 = 0;

      for (int var3 = var0.length; var2 < var3; var2++) {
         var1[var2] = var0[var2] == null ? n5 : var0[var2].toString();
      }

      return var1;
   }

   private static StringBuilder l6(String[] var0) {
      int var1 = 0;

      for (String var5 : var0) {
         if (var5 != null) {
            var1 += var5.length();
         }
      }

      StringBuilder var7 = new StringBuilder(var1);

      for (String var6 : var0) {
         if (var6 != null) {
            var7.append(var6);
         }
      }

      return var7;
   }

   public static String n5(String... var0) {
      if (var0 == null) {
         return null;
      } else {
         return var0.length == 0 ? "" : l6(var0).toString();
      }
   }

   public static String n5(Object... var0) {
      if (var0 == null) {
         return null;
      } else {
         return var0.length == 0 ? "" : l6(l6(var0)).toString();
      }
   }

   public static boolean t2(String var0, String var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return c8(var0, var1) != -1;
      }
   }

   public static String k5(String var0, int var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == 0) {
         return var0;
      } else if (var1 >= 0 && var1 <= var0.length()) {
         return var0.substring(var1);
      } else {
         throw new ArgumentOutOfRangeException("startIndex");
      }
   }

   public static String l6(String var0, int var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Cannot be negative.");
      } else if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative.");
      } else if (var1 > var0.length()) {
         throw new ArgumentOutOfRangeException("startIndex", "Cannot exceed length of string.");
      } else if (var1 > var0.length() - var2) {
         throw new ArgumentOutOfRangeException("length", "startIndex + length cannot exceed length of string.");
      } else {
         return var1 == 0 && var2 == var0.length() ? var0 : var0.substring(var1, var1 + var2);
      }
   }

   public static char[] c8(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return k5(var0, 0, var0.length());
      }
   }

   public static char[] k5(String var0, int var1, int var2) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startIndex", "< 0");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "< 0");
      }

      if (var1 > var0.length() - var2) {
         throw new ArgumentOutOfRangeException("startIndex", "Must be greater than the length of the string.");
      }

      char[] var3 = new char[var2];
      u3.n5(var0.toCharArray(), var1, var3, 0, var2);
      return var3;
   }

   public static String t2(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, com.aspose.slides.internal.x7n.l6.u3());
      }
   }

   public static String l6(String var0, com.aspose.slides.internal.x7n.l6 var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else if (var1 == null) {
         throw new ArgumentNullException("culture");
      } else {
         return var0.toUpperCase(com.aspose.slides.internal.x7n.l6.n5(var1));
      }
   }

   public static String s7(String var0) {
      if (var0 == null) {
         throw new NullReferenceException();
      } else {
         return l6(var0, com.aspose.slides.internal.x7n.l6.k5());
      }
   }

   private static boolean l6(Object var0) {
      boolean var1 = false;
      if (var0 instanceof Byte
         || var0 instanceof Short
         || var0 instanceof Integer
         || var0 instanceof Long
         || var0 instanceof Double
         || var0 instanceof Float
         || var0 instanceof c4) {
         var1 = true;
      }

      return var1;
   }
}
