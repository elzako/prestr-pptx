package com.aspose.slides.internal.f7k;

import com.aspose.slides.ms.System.d1;

public class u3 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("italic", "oblique");

   public static int n5(String var0) {
      if (d1.n5(var0)) {
         return 0;
      }

      switch (n5.n5(d1.u9(d1.l6(var0)))) {
         case 0:
            return 1;
         case 1:
            return 2;
         default:
            return 0;
      }
   }

   public static String n5(int var0) {
      switch (var0) {
         case 1:
            return "italic";
         case 2:
            return "oblique";
         default:
            return "normal";
      }
   }
}
