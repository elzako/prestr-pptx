package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

final class t4 {
   public static boolean n5(double var0, double var2) {
      return q1.n5(var0) <= var2;
   }

   public static boolean n5(double var0, double var2, double var4) {
      double var6 = q1.l6(q1.n5(var0), q1.n5(var2)) * var4;
      return q1.n5(var0 - var2) <= var6;
   }

   public static boolean n5(a0 var0, a0 var1, double var2) {
      double var4 = q1.l6(q1.n5(var0.n5()), q1.n5(var1.n5())) * var2;
      double var6 = q1.l6(q1.n5(var0.l6()), q1.n5(var1.l6())) * var2;
      return q1.n5(var0.n5() - var1.n5()) <= var4 && q1.n5(var0.l6() - var1.l6()) <= var6;
   }

   public static int n5(a0 var0, a0 var1, a0 var2, a0 var3) {
      double var4 = (var0.n5() - var2.n5()) * (var1.l6() - var2.l6()) - (var1.n5() - var2.n5()) * (var0.l6() - var2.l6());
      double var6 = (var0.n5() - var3.n5()) * (var1.l6() - var3.l6()) - (var1.n5() - var3.n5()) * (var0.l6() - var3.l6());
      if (n5(var6, 1.0E-7)) {
         return 0;
      } else if (var6 * var4 > 0.0) {
         return 1;
      } else {
         return var6 * var4 < 0.0 ? -1 : 0;
      }
   }

   public static boolean n5(j4 var0, a5 var1, int[] var2) {
      var2[0] = -1;
      int var3 = n5(var1.l6()[0].n5()[0].k5().k5(), var1.l6()[0].n5()[1].k5().k5(), var1.l6(0).k5().k5(), var0.k5().k5());
      int var4 = n5(var1.l6()[1].n5()[0].k5().k5(), var1.l6()[1].n5()[1].k5().k5(), var1.l6(1).k5().k5(), var0.k5().k5());
      int var5 = n5(var1.l6()[2].n5()[0].k5().k5(), var1.l6()[2].n5()[1].k5().k5(), var1.l6(2).k5().k5(), var0.k5().k5());
      if (var3 != 0 && var3 != 1 || var4 != 0 && var4 != 1 || var5 != 0 && var5 != 1) {
         return false;
      }

      var2[0] = 3 - (var3 + var4 + var5);
      return true;
   }

   public static int n5(j4 var0, j4 var1, j4 var2, j4 var3, j4[] var4) {
      double var5 = (var0.n5() - var1.n5()) * (var3.l6() - var2.l6()) - (var0.l6() - var1.l6()) * (var3.n5() - var2.n5());
      double var7 = (var0.n5() - var2.n5()) * (var3.l6() - var2.l6()) - (var0.l6() - var2.l6()) * (var3.n5() - var2.n5());
      double var9 = (var0.n5() - var1.n5()) * (var0.l6() - var2.l6()) - (var0.l6() - var1.l6()) * (var0.n5() - var2.n5());
      var4[0] = null;
      if (q1.n5(var5) < 1.0E-7) {
         return 0;
      } else {
         double var11 = var7 / var5;
         double var13 = var9 / var5;
         if (-1.0E-7 <= var11 && var11 <= 1.0000001 && -1.0E-7 <= var13 && var13 <= 1.0000001) {
            var4[0] = new j4(var0.n5() + var11 * (var1.n5() - var0.n5()), var0.l6() + var11 * (var1.l6() - var0.l6()));
            return 1;
         } else {
            return -1;
         }
      }
   }

   public static boolean n5(j4 var0, j4 var1, j4 var2, j4 var3) {
      double var4 = q1.n5((var0.n5() - var1.n5()) * (var0.l6() - var3.l6()) - (var0.n5() - var3.n5()) * (var0.l6() - var1.l6()))
         * ((var2.n5() - var1.n5()) * (var2.n5() - var3.n5()) + (var2.l6() - var1.l6()) * (var2.l6() - var3.l6()));
      double var6 = ((var0.n5() - var1.n5()) * (var0.n5() - var3.n5()) + (var0.l6() - var1.l6()) * (var0.l6() - var3.l6()))
         * q1.n5((var2.n5() - var1.n5()) * (var2.l6() - var3.l6()) - (var2.n5() - var3.n5()) * (var2.l6() - var1.l6()));
      double var8 = q1.l6(q1.n5(var4), q1.n5(var6)) * 1.0E-13;
      return var4 + var6 >= -var8;
   }
}
