package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class u3 {
   public static void n5(byte[] var0, int var1, int var2, l1 var3) {
      if (var0 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var2 > var0.length - var1) {
         throw new ArgumentOutOfRangeException("count");
      }

      char[] var4 = new char[var2 * 2 < 128 ? var2 * 2 : 128];
      int var5 = var1 + var2;

      while (var1 < var5) {
         int var6 = var2 < 64 ? var2 : 64;
         int var7 = n5(var0, var1, var6, var4);
         var3.a_(var4, 0, var7);
         var1 += var6;
         var2 -= var6;
      }
   }

   public static String n5(byte[] var0, int var1, int var2) {
      if (null == var0) {
         throw new ArgumentNullException("inArray");
      }

      if (0 > var1) {
         throw new ArgumentOutOfRangeException("offsetIn");
      }

      if (0 > var2) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var2 > var0.length - var1) {
         throw new ArgumentOutOfRangeException("count");
      }

      char[] var3 = new char[2 * var2];
      int var4 = n5(var0, var1, var2, var3);
      return com.aspose.slides.ms.System.d1.n5(var3, 0, var4);
   }

   private static int n5(byte[] var0, int var1, int var2, char[] var3) {
      int var4 = 0;
      byte var5 = 0;
      int var6 = var3.length;

      for (int var7 = 0; var7 < var2; var7++) {
         byte var8 = var0[var1++];
         var3[var4++] = "0123456789ABCDEF".charAt((var8 & 255) >> 4);
         if (var4 == var6) {
            break;
         }

         var3[var4++] = "0123456789ABCDEF".charAt(var8 & 255 & 15);
         if (var4 == var6) {
            break;
         }
      }

      return var4 - var5;
   }
}
