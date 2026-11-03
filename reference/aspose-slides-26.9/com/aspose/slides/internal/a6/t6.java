package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class t6 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "baseline", "middle", "sub", "super", "text-top", "text-bottom", "top", "bottom"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return "baseline";
         case 1:
            return "sub";
         case 2:
            return "super";
         case 3:
            return "top";
         case 4:
            return "text-top";
         case 5:
            return "middle";
         case 6:
            return "bottom";
         case 7:
            return "text-bottom";
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
            var2[0] = 5;
            return true;
         case 2:
            var2[0] = 1;
            return true;
         case 3:
            var2[0] = 2;
            return true;
         case 4:
            var2[0] = 4;
            return true;
         case 5:
            var2[0] = 7;
            return true;
         case 6:
            var2[0] = 3;
            return true;
         case 7:
            var2[0] = 6;
            return true;
         default:
            throw new ArgumentException("value");
      }
   }
}
