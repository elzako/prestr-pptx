package com.aspose.slides.ms.System.Xml;

public class a8 {
   public static String n5(String var0) {
      int var1 = var0.length();
      if (var1 <= 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = 0;
      com.aspose.slides.internal.l7h.a5 var3 = null;
      u4 var4 = u4.n5().l6();

      while (var4.n5(var0.charAt(var2))) {
         if (++var2 == var1) {
            return com.aspose.slides.internal.s5g.n5.k5() ? "" : " ";
         }
      }

      int var5 = var2;

      while (var5 < var1) {
         if (!var4.n5(var0.charAt(var5))) {
            var5++;
         } else {
            int var6 = var5 + 1;

            while (var6 < var1 && var4.n5(var0.charAt(var6))) {
               var6++;
            }

            if (var6 == var1) {
               if (var3 == null) {
                  return com.aspose.slides.ms.System.d1.l6(var0, var2, var5 - var2);
               }

               var3.n5(var0, var2, var5 - var2);
               return var3.toString();
            }

            if (var6 <= var5 + 1 && var0.charAt(var5) == ' ') {
               var5++;
            } else {
               if (var3 == null) {
                  var3 = new com.aspose.slides.internal.l7h.a5(var1);
               }

               var3.n5(var0, var2, var5 - var2);
               var3.n5(' ');
               var2 = var6;
               var5 = var6;
            }
         }
      }

      if (var3 != null) {
         if (var2 < var5) {
            var3.n5(var0, var2, var5 - var2);
         }

         return var3.toString();
      } else {
         return var2 > 0 ? com.aspose.slides.ms.System.d1.l6(var0, var2, var1 - var2) : var0;
      }
   }

   public static String l6(String var0) {
      int var1 = var0.length();
      if (var1 <= 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      int var2 = 0;
      int var3 = 0;
      com.aspose.slides.internal.l7h.a5 var4 = null;

      while (var2 < var1) {
         char var5 = var0.charAt(var2);
         if (var5 < ' ' && (var5 == '\t' || var5 == '\n' || var5 == '\r')) {
            if (var4 == null) {
               var4 = new com.aspose.slides.internal.l7h.a5(var1);
            }

            if (var3 < var2) {
               var4.n5(var0, var3, var2 - var3);
            }

            var4.n5(' ');
            if (var5 == '\r' && var2 + 1 < var1 && var0.charAt(var2 + 1) == '\n') {
               var2 += 2;
            } else {
               var2++;
            }

            var3 = var2;
         } else {
            var2++;
         }
      }

      if (var4 == null) {
         return var0;
      }

      if (var2 > var3) {
         var4.n5(var0, var3, var2 - var3);
      }

      return var4.toString();
   }

   public static boolean n5(char[] var0, int var1, int var2) {
      int var3 = var2;
      if (var3 < 2) {
         return false;
      }

      boolean var4 = false;
      int var5 = var1;
      u4 var6 = u4.n5().l6();
      char var7 = var0[var5];
      if (var6.c8(var7)) {
         if (var6.c8(var0[++var5])) {
            if (var3 == 2) {
               return true;
            }

            var3--;
            var5++;
         } else if ('I' != var7 && 'i' != var7 && 'X' != var7 && 'x' != var7) {
            return false;
         }

         if (var0[var5] != '-') {
            return false;
         }

         var3 -= 2;

         while (var3-- > 0) {
            var7 = var0[++var5];
            if (var6.c8(var7)) {
               var4 = true;
            } else {
               if (var7 != '-' || !var4) {
                  return false;
               }

               var4 = false;
            }
         }

         if (var4) {
            return true;
         }
      }

      return false;
   }
}
