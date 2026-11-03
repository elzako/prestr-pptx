package com.aspose.slides.internal.f7k;

import com.aspose.slides.ms.System.d1;

public class a6 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "100", "200", "300", "lighter", "normal", "400", "500", "bolder", "600", "bold", "700", "800", "900"
   );

   public static int n5(String var0) {
      if (!d1.n5(var0)) {
         switch (n5.n5(d1.a6(d1.l6(var0)))) {
            case 0:
               return 100;
            case 1:
               return 200;
            case 2:
               return 300;
            case 3:
               return 399;
            case 4:
               return 400;
            case 5:
               return 400;
            case 6:
               return 500;
            case 7:
               return 401;
            case 8:
               return 600;
            case 9:
               return 700;
            case 10:
               return 700;
            case 11:
               return 800;
            case 12:
               return 900;
         }
      }

      return 400;
   }

   public static String n5(int var0) {
      switch (var0) {
         case 100:
            return "100";
         case 200:
            return "200";
         case 300:
            return "300";
         case 399:
            return "lighter";
         case 400:
            return "normal";
         case 401:
            return "bolder";
         case 500:
            return "500";
         case 600:
            return "600";
         case 700:
            return "bold";
         case 800:
            return "800";
         case 900:
            return "900";
         default:
            return "normal";
      }
   }

   public static int l6(int var0) {
      if (var0 == 401) {
         return 600;
      } else {
         return var0 == 399 ? 400 : var0;
      }
   }

   public static boolean k5(int var0) {
      return l6(var0) >= 600;
   }
}
