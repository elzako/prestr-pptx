package com.aspose.slides.internal.s9c;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class n5 {
   private static Object n5 = new Object();
   private static k5 l6;

   public static void n5(String var0) {
      n5().n5(var0);
   }

   public static void n5(String var0, String var1, String var2) {
      n5().n5(var0, var1, var2);
   }

   public static void n5(String var0, String var1, int var2, int var3, int var4, boolean var5) {
      n5().l6(var0, var1, var2, var3, var4, var5);
   }

   public static void n5(String var0, String var1, int var2, int var3, int var4) {
      n5().n5(var0, var1, var2, var3, var4, false);
   }

   public static void n5(String var0, String var1, String var2, int var3, int var4) {
      n5().n5(var0, var1, var2, var3, var4, false);
   }

   public static void l6(String var0, String var1, int var2, int var3, int var4, boolean var5) {
      n5().n5(var0, var1, var2, var3, var4, var5);
   }

   public static void l6(String var0, String var1, int var2, int var3, int var4) {
      n5().n5(var0, var1, var2, var3, var4);
   }

   public static void n5(String var0, int var1, String var2, int var3) {
      n5(var0, var1, var2, var3, true);
   }

   public static void n5(String var0, int var1, String var2, int var3, boolean var4) {
      n5().n5(var0, var1, var2, var3, var4);
   }

   public static boolean l6(String var0) {
      return n5().l6(var0);
   }

   public static void k5(String var0) {
      if (l6 == null) {
         n5();
      }

      if (l6 instanceof com.aspose.slides.internal.s8x.k5) {
         ((com.aspose.slides.internal.s8x.k5)l6).k5(var0);
      }
   }

   private static k5 n5() {
      if (l6 == null) {
         synchronized (n5) {
            if (l6 == null) {
               switch (com.aspose.slides.internal.s9c.l6.n5()) {
                  case 0:
                     l6 = new com.aspose.slides.internal.s8x.k5();
                     break;
                  case 3:
                     l6 = new com.aspose.slides.internal.s8x.n5(com.aspose.slides.internal.s9c.l6.l6());
                     break;
                  default:
                     throw new ArgumentOutOfRangeException("Unsupported external tools caller type");
               }
            }
         }
      }

      return l6;
   }
}
