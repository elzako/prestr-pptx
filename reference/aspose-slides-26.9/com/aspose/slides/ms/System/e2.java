package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;

public final class e2 {
   public static int n5(byte var0, Object var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Byte.class) {
         throw new ArgumentException("Object must be of type Byte");
      } else {
         byte var2 = z3.k5(var1);
         if ((var0 & 255) < (var2 & 255)) {
            return -1;
         } else {
            return (var0 & 0xFF) > (var2 & 0xFF) ? 1 : 0;
         }
      }
   }

   public static int n5(byte var0) {
      return var0 & 0xFF;
   }

   public static byte n5(String var0, h2 var1) {
      return com.aspose.slides.internal.w4w.c8.n5(var0, var1);
   }

   public static byte n5(String var0, int var1, h2 var2) {
      return com.aspose.slides.internal.w4w.c8.n5(var0, var1, var2);
   }

   public static String l6(byte var0) {
      return com.aspose.slides.internal.w4w.y4.l6(null, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(byte var0, h2 var1) {
      return com.aspose.slides.internal.w4w.y4.l6(null, var0, var1);
   }

   public static String n5(byte var0, String var1) {
      return com.aspose.slides.internal.w4w.y4.l6(var1, var0, com.aspose.slides.internal.x7n.s7.s7());
   }

   public static String n5(byte var0, String var1, h2 var2) {
      return com.aspose.slides.internal.w4w.y4.l6(var1, var0, var2);
   }

   public static boolean n5(String var0, int var1, h2 var2, byte[] var3) {
      try {
         var3[0] = n5(var0, var1, var2);
         return true;
      } catch (Exception var5) {
         var3[0] = 0;
         return false;
      }
   }
}
