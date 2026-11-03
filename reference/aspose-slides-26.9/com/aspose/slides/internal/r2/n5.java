package com.aspose.slides.internal.r2;

import com.aspose.slides.internal.l7h.a5;

public class n5 {
   public static int n5(int var0) {
      return var0 >> 16 & 65535;
   }

   public static int l6(int var0) {
      return var0 & 65535;
   }

   public static int n5(int var0, int var1) {
      return (var0 & 65535) << 16 | var1 & 65535;
   }

   public static String k5(int var0) {
      a5 var1 = new a5();
      var1.k5(n5(var0));
      var1.n5(".");
      var1.k5(l6(var0));
      return var1.toString();
   }
}
