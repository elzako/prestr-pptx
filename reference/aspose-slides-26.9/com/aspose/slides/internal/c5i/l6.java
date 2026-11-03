package com.aspose.slides.internal.c5i;

import com.aspose.slides.ms.System.d1;

public class l6 {
   public static String n5(String var0, boolean var1) {
      return com.aspose.slides.internal.u0a.l6.l6(var0);
   }

   public static String n5(String var0) {
      if (!d1.l6(var0, "xmlns:")) {
         return var0;
      }

      String[] var1 = d1.u9(var0, ':');
      String var2 = d1.n5;

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2 = d1.n5(var2, var1[var3]);
      }

      return var2;
   }
}
