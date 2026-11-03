package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.h2;

public final class t9 {
   private static double n5 = 3.6147112E29F;

   public static float n5(String var0) {
      double var1 = t2.n5(var0, 231, null);
      if (var1 - Float.MAX_VALUE > n5 && !d2.a6(var1)) {
         throw new OverflowException();
      } else {
         return (float)var1;
      }
   }

   public static float n5(String var0, h2 var1) {
      double var2 = t2.n5(var0, 231, var1);
      if (var2 - Float.MAX_VALUE > n5 && !d2.a6(var2)) {
         throw new OverflowException();
      } else {
         return (float)var2;
      }
   }

   public static float n5(String var0, int var1, h2 var2) {
      double var3 = t2.n5(var0, var1, var2);
      if (var3 - Float.MAX_VALUE > n5 && !d2.a6(var3)) {
         throw new OverflowException();
      } else {
         return (float)var3;
      }
   }
}
