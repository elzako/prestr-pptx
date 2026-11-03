package com.aspose.slides.internal.x7i;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.x7n.s7;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;

public class k5 {
   private s7 n5;
   private s7 l6;
   private String k5;
   private String u3;
   private char a6;

   public k5(String var1, l6 var2) {
      if (var1.length() == 0) {
         throw XsltException.create("Format cannot be empty.");
      }

      this.a6 = var2.k5;
      this.n5 = (s7)var2.n5.deepClone();
      a5 var3 = new a5();
      boolean var4 = true;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      char var10 = this.n5.q0().charAt(0);
      char var11 = this.n5.z3().charAt(0);
      char var12 = this.n5.a0().charAt(0);
      char var13 = this.n5.d2().charAt(0);
      int var14 = 0;
      int var15 = 0;
      int var16 = -1;
      int var17 = -1;

      for (int var18 = 0; var18 < var1.length(); var18++) {
         char var19 = var1.charAt(var18);
         if (var19 == var2.l6) {
            if (var6 && var4) {
               throw XsltException.create("Format '{0}' cannot have digit symbol after zero digit symbol before a decimal point.", var1);
            }

            var17 = var3.l6();
            var9 = true;
            var7 = true;
            var3.n5('#');
         } else if (var19 == var2.k5) {
            if (var7 && !var4) {
               throw XsltException.create("Format '{0}' cannot have zero digit symbol after digit symbol after decimal point.", var1);
            }

            var17 = var3.l6();
            var9 = true;
            var6 = true;
            var3.n5('0');
         } else if (var19 == var2.u3) {
            if (!var9) {
               throw XsltException.create("Format string should have at least one digit or zero digit.");
            }

            if (var5) {
               throw XsltException.create("Format '{0}' has two pattern separators.", var1);
            }

            var5 = true;
            if (var16 < 0) {
               var16 = var17 + 1;
            }

            var15 = n5(var3, var14, var16);
            if (var15 > 9) {
               var15 = 0;
            }

            this.n5.n5(new int[]{var15});
            if (!var8) {
               this.n5.l6(0);
            }

            this.k5 = var3.toString();
            var3.n5(0);
            var16 = -1;
            var17 = -1;
            var14 = 0;
            var9 = false;
            var6 = false;
            var7 = false;
            var8 = false;
            var4 = true;
            this.l6 = (s7)var2.n5.deepClone();
            this.l6.u3(d1.n5);
         } else if (var19 == var10) {
            if (var8) {
               throw XsltException.create("Format '{0}' cannot have two decimal separators.", var1);
            }

            var16 = var3.l6();
            var8 = true;
            var4 = false;
            var6 = false;
            var7 = false;
            var3.n5('.');
         } else if (var19 == var11) {
            var14 = var3.l6();
            var17 = var14;
            var3.n5(',');
         } else if (var19 == var12) {
            var3.n5('%');
         } else if (var19 == var13) {
            var3.n5('‰');
         } else if (var19 == '\'') {
            int var20 = d1.l6(var1, '\'', var18 + 1);
            if (var20 < 0) {
               var20 = var1.length() - 1;
            }

            var3.n5(var1, var18, var20 - var18 + 1);
            var18 = var20;
         } else {
            if (('0' <= var19 && var19 <= '9' || var19 == 7) && var2.k5 != '0') {
               var3.n5('\u0007');
            }

            if (d1.u3("0#.,%‰Ee\\'\";", var19) >= 0) {
               var3.n5('\\');
            }

            var3.n5(var19);
         }
      }

      if (!var9) {
         throw XsltException.create("Format string should have at least one digit or zero digit.");
      }

      s7 var23 = var5 ? this.l6 : this.n5;
      if (var16 < 0) {
         var16 = var17 + 1;
      }

      var15 = n5(var3, var14, var16);
      if (var15 > 9) {
         var15 = 0;
      }

      var23.n5(new int[]{var15});
      if (!var8) {
         var23.l6(0);
      }

      if (var5) {
         this.u3 = var3.toString();
      } else {
         this.k5 = var3.toString();
      }
   }

   private static int n5(a5 var0, int var1, int var2) {
      if (var1 > 0 && var1 == var2 - 1) {
         var0.l6(var2 - 1, 1);
      } else if (var2 > var1) {
         return var2 - var1 - 1;
      }

      return 0;
   }

   public final String n5(double var1) {
      s7 var3;
      String var4;
      if (var1 < 0.0 && this.l6 != null) {
         var3 = this.l6;
         var4 = this.u3;
      } else {
         var3 = this.n5;
         var4 = this.k5;
      }

      String var5 = d2.n5(var1, var4, var3);
      if (this.a6 != '0') {
         a5 var6 = new a5(var5.length());
         int var7 = this.a6 - '0';

         for (int var8 = 0; var8 < var5.length(); var8++) {
            char var9 = var5.charAt(var8);
            if ((var9 - '0' & 4294967295L) <= 9L) {
               var9 += (char)var7;
            } else if (var9 == 7) {
               var9 = var5.charAt(++var8);
            }

            var6.n5(var9);
         }

         var5 = var6.toString();
      }

      return var5;
   }

   public static String n5(double var0, String var2, l6 var3) {
      return new k5(var2, var3).n5(var0);
   }
}
