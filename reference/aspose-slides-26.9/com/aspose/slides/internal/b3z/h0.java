package com.aspose.slides.internal.b3z;

import com.aspose.slides.ms.System.d1;

public class h0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("round", "square");

   public static String n5(int var0) {
      switch (var0) {
         case 1:
            return "round";
         case 2:
            return "square";
         default:
            return "butt";
      }
   }

   public static int n5(String var0) {
      if (var0 != null) {
         switch (n5.n5(d1.u9(d1.l6(var0)))) {
            case 0:
               return 1;
            case 1:
               return 2;
         }
      }

      return 0;
   }

   public static int l6(int var0) {
      switch (var0) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }
}
