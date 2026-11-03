package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class j3 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "@top-left-corner",
      "@top-left",
      "@top-center",
      "@top-right",
      "@top-right-corner",
      "@bottom-left-corner",
      "@bottom-left",
      "@bottom-center",
      "@bottom-right",
      "@bottom-right-corner",
      "@left-top",
      "@left-middle",
      "@left-bottom",
      "@right-top",
      "@right-middle",
      "@right-bottom"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "@top-left-corner";
         case 1:
            return "@top-left";
         case 2:
            return "@top-center";
         case 3:
            return "@top-right";
         case 4:
            return "@top-right-corner";
         case 5:
            return "@bottom-left-corner";
         case 6:
            return "@bottom-left";
         case 7:
            return "@bottom-center";
         case 8:
            return "@bottom-right";
         case 9:
            return "@bottom-right-corner";
         case 10:
            return "@left-top";
         case 11:
            return "@left-middle";
         case 12:
            return "@left-bottom";
         case 13:
            return "@right-top";
         case 14:
            return "@right-middle";
         case 15:
            return "@right-bottom";
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
         case 11:
            var2[0] = 11;
            return true;
         case 12:
            var2[0] = 12;
            return true;
         case 13:
            var2[0] = 13;
            return true;
         case 14:
            var2[0] = 14;
            return true;
         case 15:
            var2[0] = 15;
            return true;
         default:
            throw new ArgumentException("value");
      }
   }
}
