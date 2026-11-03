package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlException;

public class y5 {
   private static u4 n5 = u4.n5().l6();

   public static int n5(String var0, int var1) {
      int var2 = var1;

      while (var2 < var0.length() && (n5.n5[var0.charAt(var2)] & 255 & 8) != 0) {
         var2++;
      }

      return var2 - var1;
   }

   public static int l6(String var0, int var1) {
      int var2 = var1;

      while (var2 < var0.length() && ((n5.n5[var0.charAt(var2)] & 255 & 8) != 0 || var0.charAt(var2) == ':')) {
         var2++;
      }

      return var2 - var1;
   }

   public static int k5(String var0, int var1) {
      int var2 = var1;
      if (var2 < var0.length()) {
         if ((n5.n5[var0.charAt(var2)] & 255 & 4) == 0 && var0.charAt(var2) != ':') {
            return 0;
         }

         var2++;

         while (var2 < var0.length() && ((n5.n5[var0.charAt(var2)] & 255 & 8) != 0 || var0.charAt(var2) == ':')) {
            var2++;
         }
      }

      return var2 - var1;
   }

   public static boolean n5(String var0) {
      int var1 = k5(var0, 0);
      return var1 > 0 && var1 == var0.length();
   }

   public static int u3(String var0, int var1) {
      int var2 = var1;
      if (var2 < var0.length()) {
         if ((n5.n5[var0.charAt(var2)] & 255 & 4) == 0) {
            return 0;
         }

         var2++;

         while (var2 < var0.length() && (n5.n5[var0.charAt(var2)] & 255 & 8) != 0) {
            var2++;
         }
      }

      return var2 - var1;
   }

   public static int l6(String var0) {
      return u3(var0, 0);
   }

   public static String k5(String var0) {
      n5(var0, true);
      return var0;
   }

   private static boolean n5(String var0, boolean var1) {
      int var2 = u3(var0, 0);
      if (var2 != 0 && var2 == var0.length()) {
         return true;
      }

      if (var1) {
         n5(var0, 0, var2);
      }

      return false;
   }

   public static int n5(String var0, int var1, int[] var2) {
      var2[0] = 0;
      int var3 = u3(var0, var1);
      if (var3 != 0) {
         var1 += var3;
         if (var1 < var0.length() && var0.charAt(var1) == ':') {
            int var4 = u3(var0, var1 + 1);
            if (var4 != 0) {
               var2[0] = var1;
               var3 += var4 + 1;
            }
         }
      }

      return var3;
   }

   public static void n5(String var0, String[] var1, String[] var2) {
      int var3 = 0;
      int[] var4 = new int[]{0};
      int var5 = n5(var0, 0, var4);
      var3 = var4[0];
      if (var5 == 0 || var5 != var0.length()) {
         n5(var0, 0, var5);
      }

      if (var3 != 0) {
         var1[0] = com.aspose.slides.ms.System.d1.l6(var0, 0, var3);
         var2[0] = com.aspose.slides.ms.System.d1.k5(var0, var3 + 1);
      } else {
         var1[0] = "";
         var2[0] = var0;
      }
   }

   public static void n5(String var0, int var1, int var2) {
      if (var1 >= var0.length()) {
         throw new XmlException("The empty string '' is not a valid name.", com.aspose.slides.ms.System.d1.n5);
      } else if (n5.l6(var0.charAt(var2)) && !u4.n5().k5(var0.charAt(var2))) {
         throw new XmlException("Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(var0, var2));
      } else {
         throw new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(var0, var2));
      }
   }

   public static Exception l6(String var0, int var1, int var2) {
      if (var1 >= var0.length()) {
         return new XmlException("The empty string '' is not a valid name.", com.aspose.slides.ms.System.d1.n5);
      } else {
         return n5.l6(var0.charAt(var2)) && !n5.k5(var0.charAt(var2))
            ? new XmlException("Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(var0, var2))
            : new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(var0, var2));
      }
   }

   public static void l6(String var0, String[] var1, String[] var2) {
      int var3 = com.aspose.slides.ms.System.d1.u3(var0, ':');
      if (-1 == var3) {
         var1[0] = com.aspose.slides.ms.System.d1.n5;
         var2[0] = var0;
      } else {
         if (0 == var3 || var0.length() - 1 == var3) {
            throw new ArgumentException(
               v3.n5("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(':', '\u0000')), "name"
            );
         }

         var1[0] = com.aspose.slides.ms.System.d1.l6(var0, 0, var3);
         var2[0] = com.aspose.slides.ms.System.d1.l6(var0, ++var3, var0.length() - var3);
      }
   }
}
