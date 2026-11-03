package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;

public class y4 {
   private static final Object n5 = new Object();
   private static final Dictionary<Object, String> l6 = new Dictionary<>();
   private static com.aspose.slides.ms.System.i9 k5 = new com.aspose.slides.ms.System.i9();

   public static long n5(long var0, int var2) {
      long var3 = 1L;
      if (var2 > 0 && var0 > var2) {
         var3 = var0 % var2 != 0L ? var0 / var2 + 1L : var0 / var2;
      }

      return var3;
   }
}
