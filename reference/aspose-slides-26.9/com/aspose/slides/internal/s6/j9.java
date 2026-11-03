package com.aspose.slides.internal.s6;

import com.aspose.slides.exceptions.Exception;

final class j9 {
   public static e2 n5(e2 var0, t9 var1) {
      int var2 = var1.k5(var0);
      if (var2 < 0) {
         return null;
      }

      int var3 = var2;
      boolean var4 = true;

      while (
         (
                  var1.l6(var3).n5()[0].n5() != var0.n5()[0].n5()
                     || var1.l6(var3).n5()[0].l6() != var0.n5()[0].l6()
                     || var1.l6(var3).n5()[1].n5() != var0.n5()[1].n5()
                     || var1.l6(var3).n5()[1].l6() != var0.n5()[1].l6()
               )
               && (
                  var1.l6(var3).n5()[0].n5() != var0.n5()[1].n5()
                     || var1.l6(var3).n5()[0].l6() != var0.n5()[1].l6()
                     || var1.l6(var3).n5()[1].n5() != var0.n5()[0].n5()
                     || var1.l6(var3).n5()[1].l6() != var0.n5()[0].l6()
               )
            || var1.l6(var3) == var0
      ) {
         if (var1.n5() <= ++var3) {
            var4 = false;
            break;
         }

         if (!t4.n5(var1.l6(var3).u3(), var0.u3(), 1.0E-7)) {
            var4 = false;
            break;
         }
      }

      if (var4) {
         return var1.l6(var3);
      }

      var3 = var2 - 1;
      if (var3 < 0) {
         return null;
      }

      while (
         (
                  var1.l6(var3).n5()[0].n5() != var0.n5()[0].n5()
                     || var1.l6(var3).n5()[0].l6() != var0.n5()[0].l6()
                     || var1.l6(var3).n5()[1].n5() != var0.n5()[1].n5()
                     || var1.l6(var3).n5()[1].l6() != var0.n5()[1].l6()
               )
               && (
                  var1.l6(var3).n5()[0].n5() != var0.n5()[1].n5()
                     || var1.l6(var3).n5()[0].l6() != var0.n5()[1].l6()
                     || var1.l6(var3).n5()[1].n5() != var0.n5()[0].n5()
                     || var1.l6(var3).n5()[1].l6() != var0.n5()[0].l6()
               )
            || var1.l6(var3) == var0
      ) {
         if (--var3 < 0) {
            return null;
         }

         if (!t4.n5(var1.l6(var3).u3(), var0.u3(), 1.0E-7)) {
            return null;
         }
      }

      return var1.l6(var3);
   }

   public static a5 n5(j4 var0, a5 var1, int var2, int[] var3) {
      a5 var4 = var1;
      int var5 = 0;
      int var6 = 6 * var2;

      while (!t4.n5(var0, var4, var3)) {
         for (int var7 = 0; var7 < 3; var7++) {
            int var8 = t4.n5(var4.l6()[var7].n5()[0].k5().k5(), var4.l6()[var7].n5()[1].k5().k5(), var4.l6(var7).k5().k5(), var0.k5().k5());
            if (var8 == -1) {
               var4 = var4.l6()[var7].n5(var4);
               break;
            }
         }

         if (++var5 > var6) {
            throw new Exception("Infinite loop");
         }
      }

      return var4;
   }
}
