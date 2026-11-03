package com.aspose.slides.internal.b3z;

import com.aspose.slides.ms.System.d1;

public class n5 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "none", "xminymin", "xmidymin", "xmaxymin", "xminymid", "xmaxymid", "xminymax", "xmidymax", "xmaxymax", "xmidymid"
   );

   public static int n5(String var0) {
      if (d1.n5(var0)) {
         return 5;
      }

      switch (n5.n5(d1.u9(d1.l6(var0)))) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         case 5:
            return 6;
         case 6:
            return 7;
         case 7:
            return 8;
         case 8:
            return 9;
         case 9:
         default:
            return 5;
      }
   }

   public static String n5(int var0) {
      switch (var0) {
         case 0:
            return "none";
         case 1:
            return "xMinYMin";
         case 2:
            return "xMidYMin";
         case 3:
            return "xMaxYMin";
         case 4:
            return "xMinYMid";
         case 5:
         default:
            return "xMidYMid";
         case 6:
            return "xMaxYMid";
         case 7:
            return "xMinYMax";
         case 8:
            return "xMidYMax";
         case 9:
            return "xMaxYMax";
      }
   }
}
