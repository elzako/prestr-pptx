package com.aspose.slides.internal.n2d;

public class q0 {
   public static int n5(Object... var0) {
      return l6(var0);
   }

   public static int l6(Object[] var0) {
      if (var0 == null) {
         return 0;
      }

      int var1 = 1;

      for (Object var5 : var0) {
         var1 = 31 * var1 + (var5 == null ? 0 : var5.hashCode());
      }

      return var1;
   }
}
