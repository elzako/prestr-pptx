package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class x8 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "left-side", "far-left", "left", "center-left", "center", "center-right", "right", "far-right", "right-side", "leftwards", "rightwards"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "left-side";
         case 1:
            return "far-left";
         case 2:
            return "left";
         case 3:
            return "center-left";
         case 4:
            return "center";
         case 5:
            return "center-right";
         case 6:
            return "right";
         case 7:
            return "far-right";
         case 8:
            return "right-side";
         case 9:
            return "leftwards";
         case 10:
            return "rightwards";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var1))) {
         case 0:
            var2[0] = 0;
            return true;
         case 1:
            var2[0] = 1;
            return true;
         case 2:
            var2[0] = 2;
            return true;
         case 3:
            var2[0] = 3;
            return true;
         case 4:
            var2[0] = 4;
            return true;
         case 5:
            var2[0] = 5;
            return true;
         case 6:
            var2[0] = 6;
            return true;
         case 7:
            var2[0] = 7;
            return true;
         case 8:
            var2[0] = 8;
            return true;
         case 9:
            var2[0] = 9;
            return true;
         case 10:
            var2[0] = 10;
            return true;
         default:
            throw new ArgumentException("token");
      }
   }
}
