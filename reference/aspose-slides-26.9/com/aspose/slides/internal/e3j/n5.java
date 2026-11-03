package com.aspose.slides.internal.e3j;

import java.awt.Shape;
import java.awt.geom.PathIterator;

public class n5 {
   public static boolean n5(Shape var0) {
      double var1 = 0.01;
      n5$n5 var3 = new n5$n5(null);
      PathIterator var4 = var0.getPathIterator(null);
      double[] var5 = new double[6];

      while (!var4.isDone()) {
         switch (var4.currentSegment(var5)) {
            case 0:
               if (var3.n5 > 0) {
                  return false;
               }

               var3.k5[0] = var5[0];
               var3.u3[0] = var5[1];
               break;
            case 1:
               if (!n5(var5[0], var5[1], var3, 0.01)) {
                  return false;
               }
               break;
            case 2:
            case 3:
               return false;
            case 4:
               if ((var3.n5 <= 0 || !u9.n5(var3.k5[var3.n5], var3.u3[var3.n5], var3.k5[0], var3.u3[0], 0.01)) && !n5(var3.k5[0], var3.u3[0], var3, 0.01)) {
                  return false;
               }
         }

         var4.next();
      }

      return var3.n5 == 4 ? u9.n5(var3.k5[var3.n5], var3.u3[var3.n5], var3.k5[0], var3.u3[0], 0.01) : false;
   }

   private static boolean n5(double var0, double var2, n5$n5 var4, double var5) {
      var4.n5++;
      if (var4.n5 >= 5) {
         return false;
      }

      var4.k5[var4.n5] = var0;
      var4.u3[var4.n5] = var2;
      boolean var7 = n5(var4.k5[var4.n5], var4.u3[var4.n5], var4.k5[var4.n5 - 1], var4.u3[var4.n5 - 1], var5);
      boolean var8 = l6(var4.k5[var4.n5], var4.u3[var4.n5], var4.k5[var4.n5 - 1], var4.u3[var4.n5 - 1], var5);
      if (!var7 && !var8) {
         return false;
      }

      if (var4.n5 > 1 && var7 == var4.l6) {
         return false;
      }

      var4.l6 = var7;
      return true;
   }

   private static boolean n5(double var0, double var2, double var4, double var6, double var8) {
      return Math.abs(var0 - var4) <= var8;
   }

   private static boolean l6(double var0, double var2, double var4, double var6, double var8) {
      return Math.abs(var2 - var6) <= var8;
   }
}
