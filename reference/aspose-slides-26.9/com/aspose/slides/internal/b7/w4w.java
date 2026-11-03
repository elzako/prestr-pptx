package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class w4w extends t5g {
   public w4w(j9e var1, f1c var2, p6t var3, u6p var4, w1n var5, j6 var6) {
      super(var1, var2, var3, var4, var5);
      w1n var7 = this.l6();
      x6s var8 = new x6s(var7, var6);
      String var9 = this.c8();

      for (int var10 = 0; var10 < var9.length(); var10++) {
         char var11 = var9.charAt(var10);
         var8.n5(var11);
      }

      this.n5(var8);
   }

   @Override
   public j6 k5() {
      k1d[] var1 = this.u9();
      return var1[0].k5();
   }

   private String n5(int var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      for (int var3 = var1; var3 > 0; var3 /= 26) {
         var2.l6(0, (char)(65 + (var3 % 26 - 1)));
      }

      return var2.toString();
   }

   private String c8() {
      j9e var1 = (j9e)this.n5();
      int var2 = var1.n5().n5();
      String var3;
      switch (var1.l6()) {
         case 0:
            var3 = com.aspose.slides.ms.System.d1.n5("({0})", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 1:
            var3 = com.aspose.slides.ms.System.d1.n5("{0})", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 2:
            var3 = com.aspose.slides.ms.System.d1.n5("{0}.", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 3:
            var3 = com.aspose.slides.ms.System.d1.n5("({0})", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 4:
            var3 = com.aspose.slides.ms.System.d1.n5("{0})", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 5:
            var3 = com.aspose.slides.ms.System.d1.n5("{0}.", new Object[]{com.aspose.slides.ms.System.d1.u9(this.n5(var2))});
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         default:
            throw new ArgumentNullException();
         case 10:
            var3 = com.aspose.slides.ms.System.d1.n5("({0})", new Object[]{var2});
            break;
         case 11:
            var3 = com.aspose.slides.ms.System.d1.n5("{0})", new Object[]{var2});
            break;
         case 12:
            var3 = com.aspose.slides.ms.System.d1.n5("{0}.", new Object[]{var2});
            break;
         case 29:
            var3 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5("({0})", new Object[]{l6(var2)}));
            break;
         case 30:
            var3 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5("{0})", new Object[]{l6(var2)}));
            break;
         case 31:
            var3 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5("{0}.", new Object[]{l6(var2)}));
            break;
         case 32:
            var3 = com.aspose.slides.ms.System.d1.n5("({0})", new Object[]{l6(var2)});
            break;
         case 33:
            var3 = com.aspose.slides.ms.System.d1.n5("{0})", new Object[]{l6(var2)});
            break;
         case 34:
            var3 = com.aspose.slides.ms.System.d1.n5("{0}.", new Object[]{l6(var2)});
      }

      return var3;
   }

   private static String l6(int var0) {
      if (-9999 >= var0 || var0 >= 9999) {
         throw new ArgumentOutOfRangeException("num");
      }

      if (var0 == 0) {
         return "NUL";
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(10);
      if (var0 < 0) {
         var1.n5('-');
         var0 *= -1;
      }

      String[][] var2 = new String[][]{
         {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
         {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
         {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
         {"", "M", "MM", "MMM", "M(V)", "(V)", "(V)M", "(V)MM", "(V)MMM", "M(X)"}
      };
      short var3 = 1000;

      for (int var4 = 3; var3 > 0; var4--) {
         int var5 = var0 / var3;
         var1.n5(var2[var4][var5]);
         var0 -= var5 * var3;
         var3 /= 10;
      }

      return var1.toString();
   }
}
