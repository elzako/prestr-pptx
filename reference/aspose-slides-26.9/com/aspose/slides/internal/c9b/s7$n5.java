package com.aspose.slides.internal.c9b;

public class s7$n5 {
   public static double n5(double var0, double var2) {
      double var6;
      if (Math.abs(var0) > Math.abs(var2)) {
         var6 = var2 / var0;
         var6 = Math.abs(var0) * Math.sqrt(1.0 + var6 * var6);
      } else if (var2 != 0.0) {
         var6 = var0 / var2;
         var6 = Math.abs(var2) * Math.sqrt(1.0 + var6 * var6);
      } else {
         var6 = 0.0;
      }

      return var6;
   }
}
