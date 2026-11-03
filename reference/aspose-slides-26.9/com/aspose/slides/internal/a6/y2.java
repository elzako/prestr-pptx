package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public class y2 extends y0 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "em", "ex", "px", "cm", "mm", "in", "pt", "pc", "deg", "rad", "grad", "ms", "s", "Hz", "khz", "dpi", "dpcm", "dppx", "%", ""
   );

   @Override
   public String n5(int var1) {
      switch (var1) {
         case 0:
            return com.aspose.slides.ms.System.d1.n5;
         case 1:
            return "%";
         case 2:
            return "em";
         case 3:
            return "ex";
         case 4:
            return "px";
         case 5:
            return "cm";
         case 6:
            return "mm";
         case 7:
            return "in";
         case 8:
            return "pt";
         case 9:
            return "pc";
         case 10:
            return "deg";
         case 11:
            return "rad";
         case 12:
            return "grad";
         case 13:
            return "ms";
         case 14:
            return "s";
         case 15:
            return "Hz";
         case 16:
            return "kHz";
         case 17:
            return "dpi";
         case 18:
            return "dpcm";
         case 19:
            return "dppx";
         default:
            throw new ArgumentException("value");
      }
   }

   @Override
   public boolean n5(String var1, int[] var2) {
      switch (n5.n5(com.aspose.slides.ms.System.d1.u9(var1))) {
         case 0:
            var2[0] = 2;
            return true;
         case 1:
            var2[0] = 3;
            return true;
         case 2:
            var2[0] = 4;
            return true;
         case 3:
            var2[0] = 5;
            return true;
         case 4:
            var2[0] = 6;
            return true;
         case 5:
            var2[0] = 7;
            return true;
         case 6:
            var2[0] = 8;
            return true;
         case 7:
            var2[0] = 9;
            return true;
         case 8:
            var2[0] = 10;
            return true;
         case 9:
            var2[0] = 11;
            return true;
         case 10:
            var2[0] = 12;
            return true;
         case 11:
            var2[0] = 13;
            return true;
         case 12:
            var2[0] = 14;
            return true;
         case 13:
            var2[0] = 15;
            return true;
         case 14:
            var2[0] = 16;
            return true;
         case 15:
            var2[0] = 17;
            return true;
         case 16:
            var2[0] = 18;
            return true;
         case 17:
            var2[0] = 19;
            return true;
         case 18:
            var2[0] = 1;
            return true;
         case 19:
            var2[0] = 0;
            return true;
         default:
            throw new ArgumentException("token");
      }
   }
}
