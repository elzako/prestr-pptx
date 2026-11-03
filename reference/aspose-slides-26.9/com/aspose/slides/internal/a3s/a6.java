package com.aspose.slides.internal.a3s;

import com.aspose.slides.ms.System.d1;

public class a6 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("reflect", "repeat", "pad");

   public static int n5(String var0) {
      if (d1.n5(var0)) {
         return 0;
      }

      switch (n5.n5(var0)) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
         default:
            return 0;
      }
   }

   public static String n5(int var0) {
      switch (var0) {
         case 0:
         default:
            return "pad";
         case 1:
            return "reflect";
         case 2:
            return "repeat";
      }
   }
}
