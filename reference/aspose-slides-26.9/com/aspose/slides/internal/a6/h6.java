package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class h6 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "all", "braille", "embossed", "handheld", "print", "projection", "screen", "speech", "tty", "tv"
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 1:
            return "all";
         case 2:
            return "braille";
         case 3:
            return "embossed";
         case 4:
            return "handheld";
         case 5:
            return "print";
         case 6:
            return "projection";
         case 7:
            return "screen";
         case 8:
            return "speech";
         case 9:
            return "tty";
         case 10:
            return "tv";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var1))) {
         case 0:
            var2[0] = 1;
            return true;
         case 1:
            var2[0] = 2;
            return true;
         case 2:
            var2[0] = 3;
            return true;
         case 3:
            var2[0] = 4;
            return true;
         case 4:
            var2[0] = 5;
            return true;
         case 5:
            var2[0] = 6;
            return true;
         case 6:
            var2[0] = 7;
            return true;
         case 7:
            var2[0] = 8;
            return true;
         case 8:
            var2[0] = 9;
            return true;
         case 9:
            var2[0] = 10;
            return true;
         default:
            var2[0] = 0;
            return false;
      }
   }
}
