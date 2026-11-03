package com.aspose.slides.internal.w3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.a0;
import com.aspose.slides.internal.z0k.r4;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private static final char[] n5 = new char[]{';', '&', ' '};

   public static String n5(String var0) {
      if (var0 == null) {
         return null;
      }

      if (d1.u3(var0, '&') < 0) {
         return var0;
      }

      a5 var1 = new a5();
      r4 var2 = new r4(var1, com.aspose.slides.internal.x7n.l6.k5());
      n5(var0, var2);
      return var1.toString();
   }

   public static void n5(String var0, a0 var1) {
      if (var0 != null) {
         if (d1.u3(var0, '&') < 0) {
            var1.n5(var0);
         } else {
            int var2 = var0.length();

            for (int var3 = 0; var3 < var2; var3++) {
               char var4 = var0.charAt(var3);
               if (var4 == '&') {
                  int var5 = d1.n5(var0, n5, var3 + 1);
                  String var6 = d1.n5;
                  boolean var7 = false;
                  if (var5 > 0 && (var0.charAt(var5) == ';' || var0.charAt(var5) == ' ')) {
                     var6 = d1.l6(var0, var3 + 1, var5 - var3 - 1);
                     var7 = var0.charAt(var5) == ';';
                  } else if (var5 < 0) {
                     var6 = d1.l6(var0, var3 + 1, var0.length() - var3 - 1);
                  }

                  if (var6.length() == 0) {
                     var1.n5(var4);
                     continue;
                  }

                  if (var5 > -1) {
                     var3 = var5;
                  } else {
                     var3 = var0.length() - 1;
                  }

                  if (var6.length() > 1 && var6.charAt(0) == '#') {
                     try {
                        if (var6.charAt(1) != 'x' && var6.charAt(1) != 'X') {
                           var4 = (char)a3.n5(d1.k5(var6, 1), com.aspose.slides.internal.x7n.l6.k5());
                        } else {
                           var4 = (char)a3.n5(d1.k5(var6, 2), 512, com.aspose.slides.internal.x7n.l6.k5());
                        }
                     } catch (FormatException var9) {
                        var3++;
                     } catch (ArgumentException var10) {
                        var3++;
                     }
                  } else {
                     char var8 = k5.n5(var6);
                     if (var8 == 0) {
                        var1.n5('&');
                        var1.n5(var6);
                        if (var7) {
                           var1.n5(';');
                        }
                        continue;
                     }

                     var4 = var8;
                  }
               }

               var1.n5(var4);
            }
         }
      }
   }
}
