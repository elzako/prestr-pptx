package com.aspose.slides.internal.u0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class k5 {
   public static int n5(int var0) {
      if (var0 <= 0) {
         throw new ArgumentOutOfRangeException("power2");
      }

      int var1;
      for (var1 = 0; var0 != 1; var1++) {
         var0 >>= 1;
      }

      return var1;
   }
}
