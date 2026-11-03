package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import java.security.SecureRandom;

public final class z1 {
   @Deprecated
   public static char[] n5 = u3();
   public static char l6 = (char)(p8.l6 ? 47 : 92);
   public static char k5 = (char)(p8.l6 ? 92 : 47);
   public static char u3 = (char)(p8.l6 ? 59 : 59);
   static String a6 = com.aspose.slides.ms.System.t9.q0(k5);
   public static char u9 = (char)(p8.l6 ? 58 : 47);
   static char[] h0 = new char[]{k5, l6, u9};
   private static boolean c8 = k5 == u9;
   private static String t2;

   public static String n5(String var0, String var1) {
      if (var0 == null) {
         return null;
      }

      if (d1.n5(var0, n5) != -1) {
         throw new ArgumentException("Illegal characters in path.");
      }

      int var2 = n3(var0);
      if (var1 == null) {
         return var2 < 0 ? var0 : d1.l6(var0, 0, var2);
      }

      if (var1.length() == 0) {
         return var2 < 0 ? d1.n5(new Object[]{var0, '.'}) : d1.l6(var0, 0, var2 + 1);
      }

      if (var0.length() != 0) {
         if (var1.length() > 0 && var1.charAt(0) != '.') {
            var1 = d1.n5(new String[]{".", var1});
         }
      } else {
         var1 = d1.n5;
      }

      if (var2 < 0) {
         return d1.n5(var0, var1);
      } else if (var2 > 0) {
         String var3 = d1.l6(var0, 0, var2);
         return d1.n5(var3, var1);
      } else {
         return var1;
      }
   }

   public static String n5(String var0) {
      if (var0 != null && var0.length() != 0) {
         if (d1.n5(var0, n5) != -1) {
            throw new ArgumentException("Illegal characters in path.");
         }

         int var1 = d1.l6(var0, h0);
         return var1 >= 0 ? d1.k5(var0, var1 + 1) : var0;
      } else {
         return var0;
      }
   }

   public static String l6(String var0) {
      return n5(n5(var0), null);
   }

   public static String k5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("path");
      }

      if (d1.l6(var0).length() == 0) {
         String var4 = "The specified path is empty";
         throw new ArgumentException(var4);
      }

      if (p8.l6) {
         var0 = t2(var0);
      }

      char var1 = var0.charAt(var0.length() - 1);
      boolean var2 = true;
      if (var0.length() >= 2 && n5(var0.charAt(0)) && n5(var0.charAt(1))) {
         if (var0.length() == 2 || d1.l6(var0, var0.charAt(0), 2) < 0) {
            throw new ArgumentException("UNC paths should be of the form \\\\server\\share.");
         }

         if (var0.charAt(0) != k5) {
            var0 = d1.n5(var0, l6, k5);
         }
      } else if (!h0(var0)) {
         if (!p8.l6) {
            int var3 = 0;

            while ((var3 = d1.l6(var0, '.', var3)) != -1) {
               var3++;
               if (var3 == var0.length() || var0.charAt(var3) == k5 || var0.charAt(var3) == l6) {
                  break;
               }
            }

            var2 = var3 > 0;
         }

         var0 = d1.n5(new String[]{com.aspose.slides.internal.z0k.u3.n5(), a6, var0});
      } else if (k5 == '\\' && var0.length() >= 2 && n5(var0.charAt(0)) && !n5(var0.charAt(1))) {
         String var5 = com.aspose.slides.internal.z0k.u3.n5();
         if (var5.charAt(1) == u9) {
            var0 = d1.n5(new String[]{d1.l6(var5, 0, 2), var0});
         } else {
            var0 = d1.l6(var5, 0, d1.l6(var5, '\\', d1.c8(var5, "\\\\") + 1));
         }
      }

      if (var2) {
         var0 = s7(var0);
      }

      if (n5(var1) && var0.charAt(var0.length() - 1) != k5) {
         var0 = d1.l6(var0, k5);
      }

      return var0;
   }

   public static String u3(String var0) {
      if (var0 == null) {
         return null;
      }

      if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("The specified path is not of a legal form.");
      }

      if (!h0(var0)) {
         return d1.n5;
      }

      if (k5 == '/') {
         return n5(var0.charAt(0)) ? a6 : d1.n5;
      }

      int var1 = 2;
      if (var0.length() == 1 && n5(var0.charAt(0))) {
         return a6;
      }

      if (var0.length() < 2) {
         return d1.n5;
      }

      if (n5(var0.charAt(0)) && n5(var0.charAt(1))) {
         while (var1 < var0.length() && !n5(var0.charAt(var1))) {
            var1++;
         }

         if (var1 < var0.length()) {
            var1++;

            while (var1 < var0.length() && !n5(var0.charAt(var1))) {
               var1++;
            }
         }

         return d1.n5(new String[]{a6, a6, d1.n5(d1.l6(var0, 2, var1 - 2), l6, k5)});
      } else {
         if (n5(var0.charAt(0))) {
            return a6;
         }

         if (var0.charAt(1) == u9) {
            if (var0.length() >= 3 && n5(var0.charAt(2))) {
               var1++;
            }

            return d1.l6(var0, 0, var1);
         } else {
            return d1.l6(com.aspose.slides.internal.z0k.u3.n5(), 0, 2);
         }
      }
   }

   static boolean n5(char var0) {
      return var0 == k5 || var0 == l6;
   }

   public static String a6(String var0) {
      if (var0 == null) {
         return null;
      }

      if (d1.n5(var0, n5) != -1) {
         throw new ArgumentException("Illegal characters in path.");
      }

      int var1 = n3(var0);
      return var1 > -1 && var1 < var0.length() - 1 ? d1.k5(var0, var1) : d1.n5;
   }

   public static String u9(String var0) {
      if (d1.a6(var0, d1.n5)) {
         throw new ArgumentException("Invalid path");
      }

      if (var0 == null || d1.a6(u3(var0), var0)) {
         return null;
      }

      if (d1.l6(var0).length() == 0) {
         throw new ArgumentException("Argument string consists of whitespace characters only.");
      }

      if (d1.n5(var0, n5) > -1) {
         throw new ArgumentException("Path contains invalid characters");
      }

      int var1 = d1.l6(var0, h0);
      if (var1 == 0) {
         var1++;
      }

      if (var1 > 0) {
         String var2 = d1.l6(var0, 0, var1);
         int var3 = var2.length();
         return var3 >= 2 && k5 == '\\' && var2.charAt(var3 - 1) == u9 ? d1.n5(new Object[]{var2, k5}) : c8(var2);
      } else {
         return d1.n5;
      }
   }

   public static String l6(String var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("path1");
      }

      if (var1 == null) {
         throw new ArgumentNullException("path2");
      }

      if (var0.length() == 0) {
         return var1;
      }

      if (var1.length() == 0) {
         return var0;
      }

      if (d1.n5(var0, n5) != -1) {
         throw new ArgumentException("Illegal characters in path.");
      }

      if (d1.n5(var1, n5) != -1) {
         throw new ArgumentException("Illegal characters in path.");
      }

      if (h0(var1)) {
         return var1;
      }

      char var2 = var0.charAt(var0.length() - 1);
      return var2 != k5 && var2 != l6 && var2 != u9 ? d1.n5(new String[]{var0, a6, var1}) : d1.n5(var0, var1);
   }

   public static String n5() {
      if (t2 == null) {
         String var0 = com.aspose.slides.internal.t9p.k5.l6().getAbsolutePath();
         if (var0.length() > 0 && var0.charAt(var0.length() - 1) != k5) {
            t2 = d1.n5(new Object[]{var0, k5});
         }
      }

      return t2;
   }

   public static boolean h0(String var0) {
      if (var0 != null && var0.length() != 0) {
         if (d1.n5(var0, n5) != -1) {
            throw new ArgumentException("Illegal characters in path.");
         }

         char var1 = var0.charAt(0);
         return var1 == k5 || var1 == l6 || !c8 && var0.length() > 1 && var0.charAt(1) == u9;
      } else {
         return false;
      }
   }

   public static String l6() {
      a5 var0 = new a5(12);
      SecureRandom var1 = new SecureRandom();
      byte[] var2 = new byte[11];
      var1.nextBytes(var2);

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var0.l6() == 8) {
            var0.n5('.');
         }

         int var4 = (var2[var3] & 255) % 36;
         char var5 = (char)(var4 < 26 ? var4 + 97 : var4 - 26 + 48);
         var0.n5(var5);
      }

      return var0.toString();
   }

   public static char[] k5() {
      return p8.l6
         ? new char[]{
            '\u0000',
            '\u0001',
            '\u0002',
            '\u0003',
            '\u0004',
            '\u0005',
            '\u0006',
            '\u0007',
            '\b',
            '\t',
            '\n',
            '\u000b',
            '\f',
            '\r',
            '\u000e',
            '\u000f',
            '\u0010',
            '\u0011',
            '\u0012',
            '\u0013',
            '\u0014',
            '\u0015',
            '\u0016',
            '\u0017',
            '\u0018',
            '\u0019',
            '\u001a',
            '\u001b',
            '\u001c',
            '\u001d',
            '\u001e',
            '\u001f',
            '"',
            '<',
            '>',
            '|',
            ':',
            '*',
            '?',
            '\\',
            '/'
         }
         : new char[]{'\u0000', '/'};
   }

   public static char[] u3() {
      return p8.l6
         ? new char[]{
            '"',
            '<',
            '>',
            '|',
            '\u0000',
            '\u0001',
            '\u0002',
            '\u0003',
            '\u0004',
            '\u0005',
            '\u0006',
            '\u0007',
            '\b',
            '\t',
            '\n',
            '\u000b',
            '\f',
            '\r',
            '\u000e',
            '\u000f',
            '\u0010',
            '\u0011',
            '\u0012',
            '\u0013',
            '\u0014',
            '\u0015',
            '\u0016',
            '\u0017',
            '\u0018',
            '\u0019',
            '\u001a',
            '\u001b',
            '\u001c',
            '\u001d',
            '\u001e',
            '\u001f'
         }
         : new char[]{'\u0000'};
   }

   static String c8(String var0) {
      int var1 = var0.length();
      int var2 = 0;
      byte var3 = 0;
      char var4 = var0.charAt(0);
      if (var1 > 2 && var4 == '\\' && var0.charAt(1) == '\\') {
         var3 = 2;
      }

      if (var1 != 1 || var4 != k5 && var4 != l6) {
         for (int var5 = var3; var5 < var1; var5++) {
            char var6 = var0.charAt(var5);
            if (var6 == k5 || var6 == l6) {
               if (var5 + 1 == var1) {
                  var2++;
               } else {
                  var6 = var0.charAt(var5 + 1);
                  if (var6 == k5 || var6 == l6) {
                     var2++;
                  }
               }
            }
         }

         if (var2 == 0) {
            return var0;
         }

         char[] var9 = new char[var1 - var2];
         if (var3 != 0) {
            var9[0] = '\\';
            var9[1] = '\\';
         }

         int var11 = var3;

         for (int var7 = var3; var11 < var1 && var7 < var9.length; var11++) {
            char var8 = var0.charAt(var11);
            if (var8 != k5 && var8 != l6) {
               var9[var7++] = var8;
            } else if (var7 + 1 != var9.length) {
               for (var9[var7++] = k5; var11 < var1 - 1; var11++) {
                  var8 = var0.charAt(var11 + 1);
                  if (var8 != k5 && var8 != l6) {
                     break;
                  }
               }
            }
         }

         return d1.n5(var9);
      } else {
         return var0;
      }
   }

   private static int n3(String var0) {
      if (var0 != null) {
         int var1 = d1.k5(var0, '.');
         int var2 = d1.l6(var0, h0);
         if (var1 > var2) {
            return var1;
         }
      }

      return -1;
   }

   static String t2(String var0) {
      if (var0.length() < 2) {
         return var0;
      }

      if (var0.charAt(1) == ':' && com.aspose.slides.ms.System.t9.u9(var0.charAt(0))) {
         String var1 = com.aspose.slides.internal.z0k.u3.n5();
         if (var0.length() == 2) {
            if (var1.charAt(0) == var0.charAt(0)) {
               var0 = var1;
            } else {
               var0 = d1.l6(var0, '\\');
            }
         } else if (var0.charAt(2) != k5 && var0.charAt(2) != l6) {
            if (var1.charAt(0) == var0.charAt(0)) {
               var0 = l6(var1, d1.l6(var0, 2, var0.length() - 2));
            } else {
               var0 = d1.n5(new String[]{d1.l6(var0, 0, 2), a6, d1.l6(var0, 2, var0.length() - 2)});
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   static String s7(String var0) {
      if (var0 == null) {
         return var0;
      }

      if (p8.l6) {
         var0 = d1.l6(var0);
      }

      if (var0.length() == 0) {
         return var0;
      }

      String var1 = u3(var0);
      String[] var2 = d1.u9(var0, k5, l6);
      int var3 = 0;
      boolean var4 = p8.l6 && var1.length() > 2 && n5(var1.charAt(0)) && n5(var1.charAt(1));
      int var5 = var4 ? 3 : 0;

      for (int var6 = 0; var6 < var2.length; var6++) {
         if (p8.l6) {
            var2[var6] = d1.a6(var2[var6], new char[]{});
         }

         if (!".".equals(var2[var6]) && (var6 == 0 || var2[var6].length() != 0)) {
            if ("..".equals(var2[var6])) {
               if (var3 > var5) {
                  var3--;
               }
            } else {
               var2[var3++] = var2[var6];
            }
         }
      }

      if (var3 != 0 && (var3 != 1 || !"".equals(var2[0]))) {
         String var8 = d1.n5(a6, var2, 0, var3);
         if (!p8.l6) {
            return var8;
         }

         if (var4) {
            var8 = d1.n5(new String[]{a6, var8});
         }

         if (!k5(var1, var8)) {
            var8 = d1.n5(new String[]{var1, var8});
         }

         if (var4) {
            return var8;
         }

         if (!n5(var0.charAt(0)) && k5(var1, var0)) {
            if (var8.length() <= 2 && !d1.k5(var8, a6)) {
               var8 = d1.l6(var8, k5);
            }

            return var8;
         } else {
            String var7 = com.aspose.slides.internal.z0k.u3.n5();
            if (var7.length() > 1 && var7.charAt(1) == u9) {
               if (var8.length() == 0 || n5(var8.charAt(0))) {
                  var8 = d1.l6(var8, '\\');
               }

               return d1.n5(new String[]{d1.l6(var7, 0, 2), var8});
            } else {
               return n5(var7.charAt(var7.length() - 1)) && n5(var8.charAt(0)) ? d1.n5(new String[]{var7, d1.k5(var8, 1)}) : d1.n5(new String[]{var7, var8});
            }
         }
      } else {
         return var1;
      }
   }

   static boolean k5(String var0, String var1) {
      if (var0.length() < 2 || var1.length() < 2) {
         return false;
      }

      if (n5(var0.charAt(0)) && n5(var0.charAt(1))) {
         if (n5(var1.charAt(0)) && n5(var1.charAt(1))) {
            String var2 = x8(var0);
            String var3 = x8(var1);
            return d1.n5(var2, var3, true, com.aspose.slides.internal.x7n.l6.k5()) == 0;
         } else {
            return false;
         }
      } else if (!com.aspose.slides.ms.System.t9.l6(var0.charAt(0), var1.charAt(0))) {
         return false;
      } else if (var1.charAt(1) != u9) {
         return false;
      } else {
         return var0.length() > 2 && var1.length() > 2 ? n5(var0.charAt(2)) && n5(var1.charAt(2)) : true;
      }
   }

   static String x8(String var0) {
      int var1 = 2;

      while (var1 < var0.length() && !n5(var0.charAt(var1))) {
         var1++;
      }

      if (var1 < var0.length()) {
         var1++;

         while (var1 < var0.length() && !n5(var0.charAt(var1))) {
            var1++;
         }
      }

      return d1.n5(d1.l6(var0, 2, var1 - 2), l6, k5);
   }
}
