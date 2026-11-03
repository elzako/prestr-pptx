package com.aspose.slides.internal.v3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 {
   private static int n5(int var0) {
      switch (var0) {
         case 9:
            return 0;
         case 28:
            return 1;
         case 44:
            return 3;
         case 100:
            return 3;
         case 104:
            return 2;
         default:
            throw new ArgumentException(d1.n5(new String[]{"Illegal value for breakClass: ", a3.l6(var0)}));
      }
   }

   public static int n5(int var0, int var1) {
      int var2 = n5(var0);
      int var3 = n5(var1);
      return var2 < var3 ? var1 : var0;
   }
}
